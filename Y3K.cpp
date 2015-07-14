#include <iostream>
#include <cstdio>
using namespace std;
bool is_leap(long YYYY){
    if (YYYY % 100 == 0){
        if (YYYY % 400 == 0){
	    return true;
	}else{
	    return false;
	}
    }else if (YYYY % 4 == 0){
        return true;
    }else{
        return false;
    }
}

int days_in_month(long MM, long YYYY){
    switch (MM){
        case 1: return 31;
		break;
	case 2: if (is_leap(YYYY)) {return 29;}
		else {return 28;}
		break;
	case 3: return 31;
		break;
	case 4: return 30;
		break;
	case 5: return 31;
		break;
	case 6: return 30;
		break;
	case 7: return 31;
		break;
	case 8: return 31;
		break;
	case 9: return 30;
		break;
	case 10: return 31;
		 break;
	case 11: return 30;
		 break;
	case 12: return 31;
		 break;
	default: break;
    }
}

int day_in_year(long DD, long MM, long YYYY){
    int day = 0;
    for (int i = MM - 1; i > 0; i--){
        day += days_in_month(i,YYYY);
	//printf("%d %d %d\n", day, i, is_leap(YYYY));
    }
    day += DD;
    return day;
}

int rest_day(long DD, long MM, long YYYY){
    if (is_leap(YYYY)){
    return 366 - day_in_year(DD,MM,YYYY);
    }else{
    return 365 - day_in_year(DD,MM,YYYY);
    }
}

long date(int day_in_year,long& dd, long YYYY){
    int mm = 1;
    while (day_in_year > days_in_month(mm, YYYY)){
    	day_in_year -= days_in_month(mm,YYYY);
	mm++;
	//printf("%d %d\n", day_in_year, YYYY);
    }
    dd = day_in_year;
    return mm;
}

int main () {
    while (true){
	 long N = 0, DD = 0, MM = 0, YYYY = 0;
	 cin >> N >> DD >> MM >> YYYY;
	 if (N == 0 && DD == 0 && MM == 0 && YYYY ==0) break;
         //printf("%ld %ld %ld %ld\n", N, DD, MM, YYYY);
	 int rest1,day;
	 long yyyy = YYYY;
	 long mm = MM;
	 long dd = DD;
	 day = day_in_year(DD,MM,YYYY);
	 rest1 = rest_day(DD,MM,YYYY);
	 //printf("day and rest 1: %ld %ld\n", day,rest1);
	 //printf("%ld %ld %ld %ld\n", N, dd, mm, yyyy);
	    if (rest1 < N){
	        N = N - rest1;
		//printf("%ld",N);
	        while (N >= 366){
		    if (is_leap(yyyy+1) == true)
		    N = N - 366;
		    else
		    N = N - 365;
		    yyyy++;
		    //printf("first if:%ld %ld %ld %ld\n", N, dd, mm, yyyy);
		}
		if (N>0){
		yyyy = yyyy + 1;
		//printf("%ld\n",yyyy);
		mm = date(N, dd, yyyy);
		//printf("%ld\n",yyyy);
		}else if (N == 0){
		;
		}
	    }else{
	    day = day + N;
	    mm = date(day, dd, YYYY);
	    //printf("second if :%ld %ld %ld %ld\n", N, dd, mm, yyyy);
	    }
	//printf("%ld %ld %ld\n",dd,mm,yyyy);
	cout << dd << ' ' << mm << ' ' << yyyy << endl;
    }
    return 0;
}
