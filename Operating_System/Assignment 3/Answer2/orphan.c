#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/types.h>

int main()
{
  int id;
  id=fork();
  if(id==0)
   {
      printf("I am the child\n");
      printf("My PID is %d\n",getpid());
      printf("My PPID is %d\n",getppid());
      sleep(5);
      printf("Now i am an orphan\n");
      printf("My PPID is %d\n",getppid());
 
   }
   else
   {
      printf("I am the Parent\n");
      printf("My PID is %d\n",getpid());
      printf("My child id is %d\n",id);
      sleep(2);
       printf("Parent Killed\n");
   }
  return 0;
}