import java.util.Scanner;

public class Attend {

    static void AttendView() {

        Scanner sc=new Scanner(System.in);
        String id;
        int[] idClassCode;
        int attendClass,optionAttend;

        System.out.println("\nAttend a Lesson");
        System.out.println("--------------------------\n");
        System.out.println("Enter your details\n");
        System.out.print("ID:\t");
        id=sc.nextLine();
        idClassCode=Database.SearchId(id);

        if(idClassCode[0]==0)
            System.out.println("\nNo Booking Found :(\n");
        else{
            Database.SelectBookedOption(idClassCode);
            System.out.print("\nSelect the Class You Attended:\t");
            optionAttend=sc.nextInt();
            attendClass=idClassCode[optionAttend-1];
            // System.out.println(cancelClass + "\tHello");//
            Database.SelectAttendClass(attendClass,id);


        }

    }
}
