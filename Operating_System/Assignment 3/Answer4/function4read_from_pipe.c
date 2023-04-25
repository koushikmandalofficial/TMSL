#include <unistd.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <fcntl.h>
#include <sys/types.h>
#include <sys/stat.h>
int main()
{
	int fd;
	int r,l;
	char buffer[1024];
	printf("Process %d opening FIFO O_RDONLY\n", getpid());
	fd=open("fifo3",O_RDONLY);
	printf("Process %d result %d\n",getpid(),fd);
	r=read(fd, buffer, sizeof(buffer));
	l=strlen(buffer)-1;
	(void)close(fd);
	unlink("fifo3");
	printf("Process %d finished, with reading %s of %d bytes\n",
	getpid(),buffer,l);
	exit(EXIT_SUCCESS);
}