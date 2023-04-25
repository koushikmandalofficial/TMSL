#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <errno.h>
#include <unistd.h>
#include <sys/msg.h>
#include "mq_com.h"
int main()
{
	int running = 1;
	int msgid,l,m;
	long int rc= 0;
	msgid = msgget((key_t)1234, 0666 | IPC_CREAT);
	while(running)
	{
		l=msgrcv(msgid, (void *)&data, 1024,rc, 0);
		printf("You wrote: %s", data.text);
		if (strncmp(data.text, "end", 3) == 0)
		{
			running = 0;
		}
	}
	m=msgctl(msgid, IPC_RMID, 0);
	exit(EXIT_SUCCESS);
}