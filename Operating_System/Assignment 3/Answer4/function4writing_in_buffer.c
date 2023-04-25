#include<unistd.h>
#include<stdlib.h>
#include<stdio.h>
#include<string.h>
#include<fcntl.h>
#include<sys/types.h>
#include<sys/stat.h>

int main()
{
	int pipe_fd;
	int res;
	int s=0;
	char buffer[1024];
	printf("Enter data\n");
	fgets(buffer,1024,stdin);
	res = mkfifo("fifo3", 0777);
	printf("Process %d opening FIFO O_WRONLY\n", getpid());
	pipe_fd=open("fifo3",O_WRONLY);
	printf("Process %d result %d\n", getpid(), pipe_fd);
	res=write(pipe_fd, buffer, sizeof(buffer));
	(void)close(pipe_fd);
	unlink("fifo3");
	printf("Process %d finished\n", getpid());
	exit(EXIT_SUCCESS);
}