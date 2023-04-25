#include <unistd.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <sys/shm.h>
#include "shm_com.h"
#include<sys/types.h>
int main()
{
	int running = 1;
	void *shared_memory = (void *)0;
	struct sm *sh;
	int shmid,l;
	shmid = shmget((key_t)34, sizeof(struct sm), 0666 | IPC_CREAT);
	printf("%d\n",shmid);
	shared_memory = shmat(shmid, (void *)0, 0);
	printf("Memory attached at %X\n", (int)shared_memory);
	sh= (struct sm *)shared_memory;
	sh->wr = 0;
	while(running)
	{
		if (sh->wr)
		{
			printf("You wrote: %s in processid %d\n ", sh->st,getpid());
			sleep(1);
			sh->wr = 0;
			if(strncmp(sh->st, "end", 3) == 0)
			{
				running = 0;
			}
		}
	}
	shmctl(shmid,IPC_RMID,0);
	exit(EXIT_SUCCESS);
}