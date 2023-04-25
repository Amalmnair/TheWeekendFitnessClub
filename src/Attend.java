import java.util.Scanner;

public class Attend {

    static void AttendView() {

        //Attending the class
        // taking User ID
        Scanner sc=new Scanner(System.in);
        String id;
        int[] idClassCode;
        int attendClass,optionAttend;

        System.out.println("\nAttend a Lesson");
        System.out.println("--------------------------\n");
        System.out.println("Enter your details\n");
        System.out.print("ID:\t");
        id=sc.nextLine();
        // Checking for booked classes
        idClassCode=Database.SearchId(id);

        if(idClassCode[0]==0)
            System.out.println("\nNo Booking Found :(\n");
        else{
            Database.SelectBookedOption(idClassCode);
            System.out.print("\nSelect the Class You Attended:\t");
            optionAttend=sc.nextInt();
            if (optionAttend<=0||optionAttend>=33)
                System.out.println("\nInvalid Choice :(\n");
            else {

                attendClass=idClassCode[optionAttend-1];
                // Attending
                Database.SelectAttendClass(attendClass,id);


            }

        }

    }
}
