#include <iostream>
#include <cstdio>
#include <climits>
using namespace std;
int main () {
    long N,B,H,W;
    while (scanf("%ld %ld %ld %ld", &N, &B, &H, &W) == 4){
       long p = 0;
       long a = 0;
       long min_cost=LONG_MAX;
       for(long i=1; i <= H; i++){
	    scanf("%ld", &p);
	    for (long j = 1; j <= W; j++){
	        scanf("%ld", &a);
		if (a>=N){
		    long cost = p*N;
		    if (cost < min_cost){
		        min_cost = cost;
		    }
		}
	    }
	}
	if (min_cost > B){
	    printf("stay home\n");
	}else{
	    printf("%ld\n",min_cost);
	}
    }
    return 0;
}
