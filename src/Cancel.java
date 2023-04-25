import javax.xml.crypto.Data;
import java.util.Scanner;

public class Cancel {


    static void CancelView() {

        // Cancelling a class
        // Taking ID of user
        Scanner sc=new Scanner(System.in);
        String id;
        int[] idClassCode;
        int cancelClass,optionCancel;

        System.out.println("\nChange/Cancel a Booking");
        System.out.println("------------------------------\n");
        System.out.println("Enter your details\n");
        System.out.print("ID:\t");
        id=sc.nextLine();
        // Checking for booked classes
        idClassCode=Database.SearchId(id);

        if(idClassCode[0]==0)
            System.out.println("\nNo Booking Found :(\n");
        else{
            // Cancelling
            Database.SelectBookedOption(idClassCode);
            System.out.print("\nSelect the Booking to be Canceled:\t");
            optionCancel=sc.nextInt();
            if (optionCancel<=0||optionCancel>=33)
                System.out.println("\nInvalid Choice :(\n");

            else{

                cancelClass=idClassCode[optionCancel-1];
                Database.SelectCancelClass(cancelClass,id);
                //System.out.println("\nBooking Canceled :)\n");

                // Booking another Class
                System.out.println("Do you want to Book Another Class?");
                System.out.println("1.Yes\n2.No\n");
                if(sc.nextInt()==1){
                    Booking.BookView();
                }
            }

        }

    }



}
