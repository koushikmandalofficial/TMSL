#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<unistd.h>

int main(){
    pid_t id = fork();
    if(id == 0){
        printf("We are in the child process id : %d\n",getpid());
        printf("Parent id of child : %d\n",getppid());
    }
    else{
        printf("We are in the parent process id : %d\n",getpid());
        printf("Parent id parent : %d\n",getppid());
    }
}