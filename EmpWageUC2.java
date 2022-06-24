import java.lang.*;
public class EmpWageUC2 {
    public static void main(String[] args) {
        int attfull = 1;
        int  wph = 20;
        int emphrs = 0;
        int empwage = 0;
        double a = Math.floor(Math.random() * 10) % 2;
        if (a == attfull)
            emphrs = 8;
         else
            emphrs = 0;

        empwage = emphrs * wph;
        System.out.println("Daily wage for full time employee : "+empwage);
    }

}
