#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <errno.h>
#include <unistd.h>
#include <sys/msg.h>
#include "mq_com.h"
#define MAX 512
int main()
{
	int running = 1;
	int msgid,l;
	char buffer[1024];
	msgid = msgget((key_t)1234, 0666 | IPC_CREAT);
	while(running) {
		printf("Enter some text:\n" );
		fgets(buffer, 1024, stdin);
		data.ty = 1;
		strcpy(data.text, buffer);
		l=msgsnd(msgid, (void *)&data, MAX, 0);
		if (strncmp(buffer, "end", 3) == 0)
		{
			running = 0;
		}
	}
	exit(EXIT_SUCCESS);
}