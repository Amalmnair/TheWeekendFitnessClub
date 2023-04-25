import java.util.Scanner;

public class Report {

    static void MonthlyReportView(){

        // Monthly Report
        int month;
        Scanner sc=new Scanner(System.in);

        System.out.println("\nMonthly Lesson Report");
        System.out.println("------------------------------\n");
        System.out.print("Report of Month :\t");
        month=sc.nextInt();
        Database.MonthlyReportSelect(month);

    }

    static void ChampionReportView(){

        // Monthly Champion Report
        int month;
        Scanner sc=new Scanner(System.in);

        System.out.println("\nMonthly Champion Fitness Type Report");
        System.out.println("------------------------------------------\n");
        System.out.print("Report of Month :\t");
        month=sc.nextInt();
        System.out.println("\nClass\t\t\t\tIncome");
        System.out.println("--------------------------------");
        Database.ChampionReportSelect(month);



    }


}
