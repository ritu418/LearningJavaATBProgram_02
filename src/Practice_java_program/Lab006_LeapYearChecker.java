package Practice_java_program;

public class Lab006_LeapYearChecker {

    public static void main(String[] args) {
        int year = 2026;
        boolean isLeapyear = false;

        if((year %4 ==0 && year %100 !=0) || (year %400 ==0)){
            isLeapyear = true;


        }

if(isLeapyear){

    System.out.println(year  +" Year is LeapYear");
}
else {
    System.out.println(year + "Year is not LeapYear ");
}


    }


}
