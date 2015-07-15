#include <iostream>
#include <cstdio>
using namespace std;
int main (){
    int S,B;
    while (scanf("%d%d",&S,&B) == 2 && S != 0 && B != 0){
    int livel[S];
    int liver[S];
    for (int i = 0; i < S; i++){
    livel[i] = i - 1;
    liver[i] = i + 1;
    }
    while(B > 0){
    int left,right;
    scanf("%d%d",&left,&right);
    livel[liver[right-1]] = livel[left-1];
    liver[livel[left-1]] = liver[right-1];
    /*
    for (int i = 0; i <S; i++){
    printf("%d ",livel[i]);
    if (i == S-1){
    printf("\n");
    }
    }

    for (int i = 0; i <S; i++){
    printf("%d ",liver[i]);
    if (i == S-1){
    printf("\n");
    }
    }
    */
    int ll = livel[left-1];
    int lr = liver[right-1];
    if (ll != -1 && lr != S)
    printf("%d %d\n", ll+1,lr+1);
    if (ll == -1 && lr != S)
    printf("* %d\n", lr+1);
    if (ll != -1 && lr == S)
    printf("%d *\n", ll+1);
    if (ll == -1 && lr == S)
    printf("* *\n");
    B--;
    }
    printf("-\n");
    }
}
