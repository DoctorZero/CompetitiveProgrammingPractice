#include <iostream>
#include <cstdio>
#include <string>
#include <iomanip>
using namespace std;
bool is_leap(long y){
    if (y % 100 == 0){
        if (y % 400 == 0){
	    return true;
	}else{
	    return false;
	}
    }else if (y % 4 == 0){
        return true;
    }
    return false;
}

int day_in_year(long d, long m, long y){
    int monthn[12]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int monthl[12]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int day = 0;
    if (is_leap(y)){
        for (int i = m-1; i > 0; i--){
	    day += monthl[i-1];
	}
    	day += d;	
    }else{
        for (int i = m-1; i > 0; i--){
	    day += monthn[i-1];
	}
    	day += d;    
    }
    return day;
}

void date_in_year(int day,long&d, long& m, long& y){
    int monthn[12]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int monthl[12]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int i = 0;
    if (is_leap(y)){
    	while (day > monthl[i]){
	    day -= monthl[i];
	    i++;
	}
    }else{
	while (day > monthn[i]){
	    day -= monthn[i];
	    i++;
	}
    }
    d = day;
    m = i+1;
}

int date_birth(long& bd,long& bm, long& by){
	long fd = bd;
	long fm = bm;
	long fy = by;
	int dayf =day_in_year(fd,fm,fy);
	int dayb = dayf+280;
	if (is_leap(fy) == true && dayb <= 366){
		date_in_year(dayb,bd,bm,by);
		return dayb;
	}
	else if (is_leap(fy) == true && dayb > 366){
		by++;
		date_in_year(dayb - 366,bd,bm,by);
		return dayb - 366;
	}
	else if (is_leap(fy) == false && dayb <= 365){
		date_in_year(dayb,bd,bm,by);
		return dayb;
	}
	else if (is_leap(fy) == false && dayb > 365){
		by++;
		date_in_year(dayb - 365,bd,bm,by);
		return dayb - 365;
	}
}

string astro(int day,long y){
	if (is_leap(y)){
	    if ( 21 <= day &&  day <= 50){
	        return "aquarius";
	    }
	    if ( 51 <= day && day <= 80 ){
	        return "pisces";
	    }
	    if ( 81 <= day && day <= 111){
	        return "aries";
	    }
	    if ( 112 <= day && day <= 142){
	        return "taurus";
	    }
	    if ( 143 <= day && day <= 173){
	        return "gemini";
	    }
	    if (174 <= day && day <= 204){
	        return "cancer";
	    }
	    if (205 <= day && day <= 234){
	        return "leo";
	    }
	    if (235 <= day && day <= 267){
	        return "virgo";
	    }
	    if (268 <= day && day <= 297){
	        return "libra";
	    }
	    if (298 <= day && day <= 327){
	        return "scorpio";
	    }
	    if (328 <= day && day <= 357){
	        return "sagittarius";
	    }
	    if ( day >= 358 || day <= 20){
	        return "capricorn";
	    }
	}
	else{
	    if ( 21 <= day &&  day <= 50){
	        return "aquarius";
	    }
	    if ( 51 <= day && day <= 79 ){
	        return "pisces";
	    }
	    if ( 80 <= day && day <= 110){
	        return "aries";
	    }
	    if ( 111 <= day && day <= 141){
	        return "taurus";
	    }
	    if ( 142 <= day && day <= 172){
	        return "gemini";
	    }
	    if (173 <= day && day <= 203){
	        return "cancer";
	    }
	    if (204 <= day && day <= 233){
	        return "leo";
	    }
	    if (234 <= day && day <= 266){
	        return "virgo";
	    }
	    if (267 <= day && day <= 296){
	        return "libra";
	    }
	    if (297 <= day && day <= 326){
	        return "scorpio";
	    }
	    if (327 <= day && day <= 356){
	        return "sagittarius";
	    }
	    if ( day >= 357 || day <= 20){
	        return "capricorn";
	    }
	}
}

int main () {
    int T = 0;
    int count = 0;
    string ast;
    scanf("%d", &T);
    while (T > 0){
	long date;
	long d,m,y;
	scanf("%ld", &date);
        y = date % 10000;
	//printf("%ld\n",y);
	d = (date / 10000) % 100;
	m = (date / 1000000) % 100;
	int dayb = 0;
	dayb = date_birth(d,m,y);
	ast = astro(dayb,y);
	count++;
	cout<<count<<' '<<setw(2)<<setfill('0')<<m<<'/'<<setw(2)<<setfill('0')<<d<<'/'<<y<<' '<<ast<<endl;
	T--;
    }
}
