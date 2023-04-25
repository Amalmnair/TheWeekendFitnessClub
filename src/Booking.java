import java.util.Scanner;

public class Booking {

    static int classCode;
    static void BookView() {
        // Booking of Class
        // Selecting the class
        Scanner sc=new Scanner(System.in);
        int classChoice,dayChoice,fitChoice;
        System.out.println("\nBook a Group Fitness Lesson");
        System.out.println("------------------------------\n");
        System.out.println("Choose your Class by");
        System.out.println("1. Day\n2. Fitness Type\n");
        classChoice = sc.nextInt();
        if (classChoice == 1) {
            // By Day
            System.out.println("\nChoose Day");
            System.out.println("1. Saturday\n2. Sunday\n");
            dayChoice = sc.nextInt();
            classCode=TimeTable.TimetableDay(dayChoice);
            CheckSeats();
        } else if (classChoice == 2) {
            // By Class
            System.out.println("\nChoose Class");
            System.out.println("1. Yoga\n2. Box Fit\n3. Zumba\n4. Aquacise\n");
            fitChoice = sc.nextInt();
            classCode=TimeTable.TimetableClass(fitChoice);
            CheckSeats();
        } else
            System.out.println("Invalid Choice :(");
    }

    static void CheckSeats(){

        // checking seat availability
        int seatLeft;
        seatLeft=Database.SeatAvailable(classCode);
        if (seatLeft<=0)
            System.out.println("\nSorry No Seats Available :(\n");

        else
            BookSeat();

    }


    static void BookSeat(){

        // if seat available
        // booking
        String name,id;
        Scanner sc=new Scanner(System.in);

        System.out.println("\nEnter your details\n");
        System.out.print("Name:\t");
        name=sc.nextLine();
        System.out.print("ID:\t");
        id=sc.nextLine();
        Database.SelectBookingClass(name,id,classCode);



    }



}
