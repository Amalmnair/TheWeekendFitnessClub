import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n\nThe Weekend Fitness Club (WFC)");
            System.out.println("_________________________________\n");
            System.out.println("Choose your Service");
            System.out.println("1. Book a Group Fitness Lesson\n2. Change/Cancel a Booking\n3. Attend a Lesson\n4. Monthly Lesson Report\n5. Monthly Champion Fitness Type Report\n6. Exit\n" );
            choice= sc.nextInt();
            switch(choice){

                case 1:
                    Booking.BookView();
                    break;
                case 2:
                    Cancel.CancelView();
                    break;

                case 3:
                    Attend.AttendView();//review
                    break;

                case 4:
                    Report.MonthlyReportView();
                    break;

                case 5:
                    Report.ChampionReportView();
                    break;

                case 6:
                    System.out.println("\nThank you! :)\n\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice :(\n");
                    break;

            }





        }while(true);




    }
}