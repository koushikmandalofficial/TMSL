#include <unistd.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <sys/shm.h>
#include<sys/types.h>
#include "shm_com.h"
int main()
{
	int running = 1;
	void *shared_memory = (void *)0;
	struct sm *sh;
	char buffer[2048];
	int shmid;
	shmid = shmget((key_t)34, sizeof(struct sm), 0666 | IPC_CREAT);
	printf("%d\n",shmid);
	shared_memory = shmat(shmid, (void *)0, 0);
	printf("Memory attached at %X\n", (int)shared_memory);
	sh = (struct sm *)shared_memory;
	while(running)
	{
		while(sh->wr == 1)
		{
			sleep(1);
			printf("waiting for client...\n");
		}
		printf("Enter some text from process id %d: ",getpid());
		fgets(buffer, 2048, stdin);
		strncpy(sh->st, buffer, 2048);
		sh->wr = 1;
		if (strncmp(buffer, "end", 3) == 0){
			running = 0;
		}
	}
	exit(EXIT_SUCCESS);
}