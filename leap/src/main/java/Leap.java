class Leap {

    boolean isLeapYear(int year) {
        if(year%400==0)return true;
        else if(year%100==0 || year%4>0)return false;
        return true;
    }

}
