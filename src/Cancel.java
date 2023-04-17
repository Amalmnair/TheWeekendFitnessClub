import javax.xml.crypto.Data;
import java.util.Scanner;

public class Cancel {


    static void CancelView() {

        Scanner sc=new Scanner(System.in);
        String id;
        int[] idClassCode;
        int cancelClass,optionCancel;

        System.out.println("\nChange/Cancel a Booking");
        System.out.println("------------------------------\n");
        System.out.println("Enter your details\n");
        System.out.print("ID:\t");
        id=sc.nextLine();
        idClassCode=Database.SearchId(id);

        //  for(int i=0;i<32;i++)//
        // System.out.print("\t"+idClassCode[i]);//

        if(idClassCode[0]==0)
            System.out.println("\nNo Booking Found :(\n");
        else{
            Database.SelectBookedOption(idClassCode);
            System.out.print("\nSelect the Booking to be Canceled:\t");
            optionCancel=sc.nextInt();
            cancelClass=idClassCode[optionCancel-1];
            // System.out.println(cancelClass + "\tHello");//
            Database.SelectCancelClass(cancelClass,id);
            System.out.println("\nBooking Canceled :)\n");

            System.out.println("Do you want to Book Another Class?");
            System.out.println("1.Yes\n2.No\n");
            if(sc.nextInt()==1){
                Booking.BookView();
            }

        }

    }



}
