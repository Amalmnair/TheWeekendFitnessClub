import java.util.Scanner;

public class TimeTable {

    static int selectOption;
    static Scanner sc=new Scanner(System.in);
    static int TimetableDay(int dayChoice){

        switch (dayChoice){

            case 1:
                System.out.println("\nOption\t\tWeek\t\tDay\t\t\t\tClass\t\tTime\t\tPrice(GBP)");
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("1\t\t\tWeek 1\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                System.out.println("2\t\t\tWeek 1\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                System.out.println("3\t\t\tWeek 2\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                System.out.println("4\t\t\tWeek 2\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                System.out.println("5\t\t\tWeek 3\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                System.out.println("6\t\t\tWeek 3\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                System.out.println("7\t\t\tWeek 4\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                System.out.println("8\t\t\tWeek 4\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                System.out.println("9\t\t\tWeek 5\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                System.out.println("10\t\t\tWeek 5\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                System.out.println("11\t\t\tWeek 6\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                System.out.println("12\t\t\tWeek 6\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                System.out.println("13\t\t\tWeek 7\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                System.out.println("14\t\t\tWeek 7\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                System.out.println("15\t\t\tWeek 8\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                System.out.println("16\t\t\tWeek 8\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                System.out.println();

                selectOption=sc.nextInt();

                if(selectOption==1)
                    return 11;
                else if(selectOption==2)
                    return 12;
                else if(selectOption==3)
                    return 21;
                else if(selectOption==4)
                    return 22;
                else if(selectOption==5)
                    return 31;
                else if(selectOption==6)
                    return 32;
                else if(selectOption==7)
                    return 41;
                else if(selectOption==8)
                    return 42;
                else if(selectOption==9)
                    return 51;
                else if(selectOption==10)
                    return 52;
                else if(selectOption==11)
                    return 61;
                else if(selectOption==12)
                    return 62;
                else if(selectOption==13)
                    return 71;
                else if(selectOption==14)
                    return 72;
                else if(selectOption==15)
                    return 81;
                else if(selectOption==16)
                    return 82;
                else
                    System.out.println("Invalid Choice :(");

                break;

            case 2:
                System.out.println("\nOption\t\tWeek\t\tDay\t\t\t\tClass\t\tTime\t\tPrice(GBP)");
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("1\t\t\tWeek 1\t\tSunday\t\t\tZumba\t\t\t7:00AM\t\t4");
                System.out.println("2\t\t\tWeek 1\t\tSunday\t\t\tAquacise\t\t10:00AM\t\t5");
                System.out.println("3\t\t\tWeek 2\t\tSunday\t\t\tZumba\t\t\t7:00AM\t\t4");
                System.out.println("4\t\t\tWeek 2\t\tSunday\t\t\tAquacise\t\t10:00AM\t\t5");
                System.out.println("5\t\t\tWeek 3\t\tSunday\t\t\tZumba\t\t\t7:00AM\t\t4");
                System.out.println("6\t\t\tWeek 3\t\tSunday\t\t\tAquacise\t\t10:00AM\t\t5");
                System.out.println("7\t\t\tWeek 4\t\tSunday\t\t\tZumba\t\t\t7:00AM\t\t4");
                System.out.println("8\t\t\tWeek 4\t\tSunday\t\t\tAquacise\t\t10:00AM\t\t5");
                System.out.println("9\t\t\tWeek 5\t\tSunday\t\t\tZumba\t\t\t7:00AM\t\t4");
                System.out.println("10\t\t\tWeek 5\t\tSunday\t\t\tAquacise\t\t10:00AM\t\t5");
                System.out.println("11\t\t\tWeek 6\t\tSunday\t\t\tZumba\t\t\t7:00AM\t\t4");
                System.out.println("12\t\t\tWeek 6\t\tSunday\t\t\tAquacise\t\t10:00AM\t\t5");
                System.out.println("13\t\t\tWeek 7\t\tSunday\t\t\tZumba\t\t\t7:00AM\t\t4");
                System.out.println("14\t\t\tWeek 7\t\tSunday\t\t\tAquacise\t\t10:00AM\t\t5");
                System.out.println("15\t\t\tWeek 8\t\tSunday\t\t\tZumba\t\t\t7:00AM\t\t4");
                System.out.println("16\t\t\tWeek 8\t\tSunday\t\t\tAquacise\t\t10:00AM\t\t5");
                System.out.println();

                selectOption=sc.nextInt();

                if(selectOption==1)
                    return 13;
                else if(selectOption==2)
                    return 14;
                else if(selectOption==3)
                    return 23;
                else if(selectOption==4)
                    return 24;
                else if(selectOption==5)
                    return 33;
                else if(selectOption==6)
                    return 34;
                else if(selectOption==7)
                    return 43;
                else if(selectOption==8)
                    return 44;
                else if(selectOption==9)
                    return 53;
                else if(selectOption==10)
                    return 54;
                else if(selectOption==11)
                    return 63;
                else if(selectOption==12)
                    return 64;
                else if(selectOption==13)
                    return 73;
                else if(selectOption==14)
                    return 74;
                else if(selectOption==15)
                    return 83;
                else if(selectOption==16)
                    return 84;
                else
                    System.out.println("Invalid Choice :(");

                break;

            default:
                System.out.println("Invalid Choice :(");
                break;
        }


        return 0;
    }


    static int TimetableClass(int fitChoice) {

        switch (fitChoice){

            case 1:
                System.out.println("\nOption\t\tWeek\t\tDay\t\t\t\tClass\t\tTime\t\tPrice(GBP)");
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("1\t\t\tWeek 1\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                System.out.println("2\t\t\tWeek 2\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                System.out.println("3\t\t\tWeek 3\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                System.out.println("4\t\t\tWeek 4\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                System.out.println("5\t\t\tWeek 5\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                System.out.println("6\t\t\tWeek 6\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                System.out.println("7\t\t\tWeek 7\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                System.out.println("8\t\t\tWeek 8\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                System.out.println();

                selectOption=sc.nextInt();

                if(selectOption==1)
                    return 11;
                else if(selectOption==2)
                    return 21;
                else if(selectOption==3)
                    return 31;
                else if(selectOption==4)
                    return 41;
                else if(selectOption==5)
                    return 51;
                else if(selectOption==6)
                    return 61;
                else if(selectOption==7)
                    return 71;
                else if(selectOption==8)
                    return 81;

                break;

            case 2:
                System.out.println("\nOption\t\tWeek\t\tDay\t\t\t\tClass\t\tTime\t\tPrice(GBP)");
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("1\t\t\tWeek 1\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                System.out.println("2\t\t\tWeek 2\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                System.out.println("3\t\t\tWeek 3\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                System.out.println("4\t\t\tWeek 4\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                System.out.println("5\t\t\tWeek 5\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                System.out.println("6\t\t\tWeek 6\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                System.out.println("7\t\t\tWeek 7\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                System.out.println("8\t\t\tWeek 8\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                System.out.println();

                selectOption=sc.nextInt();

                if(selectOption==1)
                    return 12;
                else if(selectOption==2)
                    return 22;
                else if(selectOption==3)
                    return 32;
                else if(selectOption==4)
                    return 42;
                else if(selectOption==5)
                    return 52;
                else if(selectOption==6)
                    return 62;
                else if(selectOption==7)
                    return 72;
                else if(selectOption==8)
                    return 82;

                break;

            case 3:
                System.out.println("\nOption\t\tWeek\t\tDay\t\t\t\tClass\t\tTime\t\tPrice(GBP)");
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("1\t\t\tWeek 1\t\tSunday\t\t\tZumba\t\t7:00AM\t\t4");
                System.out.println("2\t\t\tWeek 2\t\tSunday\t\t\tZumba\t\t7:00AM\t\t4");
                System.out.println("3\t\t\tWeek 3\t\tSunday\t\t\tZumba\t\t7:00AM\t\t4");
                System.out.println("4\t\t\tWeek 4\t\tSunday\t\t\tZumba\t\t7:00AM\t\t4");
                System.out.println("5\t\t\tWeek 5\t\tSunday\t\t\tZumba\t\t7:00AM\t\t4");
                System.out.println("6\t\t\tWeek 6\t\tSunday\t\t\tZumba\t\t7:00AM\t\t4");
                System.out.println("7\t\t\tWeek 7\t\tSunday\t\t\tZumba\t\t7:00AM\t\t4");
                System.out.println("8\t\t\tWeek 8\t\tSunday\t\t\tZumba\t\t7:00AM\t\t4");
                System.out.println();

                selectOption=sc.nextInt();

                if(selectOption==1)
                    return 13;
                else if(selectOption==2)
                    return 23;
                else if(selectOption==3)
                    return 33;
                else if(selectOption==4)
                    return 43;
                else if(selectOption==5)
                    return 53;
                else if(selectOption==6)
                    return 63;
                else if(selectOption==7)
                    return 73;
                else if(selectOption==8)
                    return 83;

                break;

            case 4:
                System.out.println("\nOption\t\tWeek\t\tDay\t\t\t\tClass\t\tTime\t\tPrice(GBP)");
                System.out.println("1\t\t\tWeek 1\t\tSunday\t\t\tAquacise\t\t10:00AM\t\t5");
                System.out.println("2\t\t\tWeek 2\t\tSunday\t\t\tAquacise\t\t10:00AM\t\t5");
                System.out.println("3\t\t\tWeek 3\t\tSunday\t\t\tAquacise\t\t10:00AM\t\t5");
                System.out.println("4\t\t\tWeek 4\t\tSunday\t\t\tAquacise\t\t10:00AM\t\t5");
                System.out.println("5\t\t\tWeek 5\t\tSunday\t\t\tAquacise\t\t10:00AM\t\t5");
                System.out.println("6\t\t\tWeek 6\t\tSunday\t\t\tAquacise\t\t10:00AM\t\t5");
                System.out.println("7\t\t\tWeek 7\t\tSunday\t\t\tAquacise\t\t10:00AM\t\t5");
                System.out.println("8\t\t\tWeek 8\t\tSunday\t\t\tAquacise\t\t10:00AM\t\t5");
                System.out.println();

                selectOption=sc.nextInt();

                if(selectOption==1)
                    return 14;
                else if(selectOption==2)
                    return 24;
                else if(selectOption==3)
                    return 34;
                else if(selectOption==4)
                    return 44;
                else if(selectOption==5)
                    return 54;
                else if(selectOption==6)
                    return 64;
                else if(selectOption==7)
                    return 74;
                else if(selectOption==8)
                    return 84;

                break;


            default:
                System.out.println("Invalid Choice :(");
                break;
        }




        return 0;
    }
}
