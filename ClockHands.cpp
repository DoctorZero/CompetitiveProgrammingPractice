#include <cstdio>
#include <iostream>
#include <cmath>
using namespace std;
int main () {
    int h = 0;
    int m = 0;
    while (scanf("%d:%d", &h, &m) == 2 && (h!= 0 || m!= 0)){
        double hangle = 0.0;
	double mangle = 0.0;
	double angle = 0.0;
	mangle = (double) m / 60.0 * 360.0;
	hangle =fmod((double) (h + m / 60.0) / 12.0 * 360.0 , 360.0);
        angle = abs(mangle - hangle);
	if (angle > 180.00){
	    angle = 360.0 - angle;
	}
	printf("%.3f\n", angle);
    }
    return 0;
}
