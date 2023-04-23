import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Scanner;

public class Database {

    static int s11 = 0, s12 = 5, s13 = 2, s14 = 0, s21 = 1, s22 = 3, s23 = 3, s24 = 1, s31 = 5, s32 = 4, s33 = 4, s34 = 0, s41 = 0, s42 = 3, s43 = 0, s44 = 2, s51 = 4, s52 = 3, s53 = 1, s54 = 5, s61 = 4, s62 = 2, s63 = 2, s64 = 3, s71 = 2, s72 = 5, s73 = 4, s74 = 2, s81 = 1, s82 = 0, s83 = 0, s84 = 5;

    static String[][] d11 = {
            {"664", "Jordanna", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"366", "Amabelle", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"396", "Bonni", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"359", "Patrice", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"953", "Ryon", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
    };

    static String[][] d12 = {
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
    };
    static String[][] d13 = {
            {"111", "Wilbert", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"430", "Terrel", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"657", "Desiree", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
    };

    static String[][] d14 = {
            {"149", "Janey", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"385", "Codie", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"664", "Jordanna", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"366", "Amabelle", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"396", "Bonni", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
    };

    static String[][] d21 = {
            {"359", "Patrice", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"953", "Ryon", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"111", "Wilbert", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"430", "Terrel", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
    };

    static String[][] d22 = {
            {"657", "Desiree", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"149", "Janey", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
    };

    static String[][] d23 = {
            {"385", "Codie", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"664", "Jordanna", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
    };

    static String[][] d24 = {
            {"366", "Amabelle", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"396", "Bonni", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"359", "Patrice", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"953", "Ryon", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
    };

    static String[][] d31 = {
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
    };

    static String[][] d32 = {
            {"111", "Wilbert", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
    };

    static String[][] d33 = {
            {"430", "Terrel", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
    };

    static String[][] d34 = {
            {"657", "Desiree", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"149", "Janey", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"385", "Codie", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"664", "Jordanna", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"366", "Amabelle", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
    };

    static String[][] d41 = {
            {"396", "Bonni", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"359", "Patrice", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"953", "Ryon", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"111", "Wilbert", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"430", "Terrel", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
    };

    static String[][] d42 = {
            {"657", "Desiree", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"149", "Janey", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
    };

    static String[][] d43 = {
            {"385", "Codie", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"664", "Jordanna", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"366", "Amabelle", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"396", "Bonni", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"359", "Patrice", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
    };

    static String[][] d44 = {
            {"953", "Ryon", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"111", "Wilbert", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"430", "Terrel", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
    };

    static String[][] d51 = {
            {"657", "Desiree", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
    };

    static String[][] d52 = {
            {"149", "Janey", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"385", "Codie", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
    };

    static String[][] d53 = {
            {"664", "Jordanna", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"366", "Amabelle", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"396", "Bonni", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"359", "Patrice", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
    };

    static String[][] d54 = {
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
    };

    static String[][] d61 = {
            {"953", "Ryon", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
    };

    static String[][] d62 = {
            {"111", "Wilbert", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"430", "Terrel", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"657", "Desiree", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
    };

    static String[][] d63 = {
            {"149", "Janey", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"385", "Codie", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"664", "Jordanna", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
    };

    static String[][] d64 = {
            {"366", "Amabelle", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"396", "Bonni", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
    };

    static String[][] d71 = {
            {"359", "Patrice", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"953", "Ryon", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"111", "Wilbert", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
    };

    static String[][] d72 = {
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
            {"0", "None", "Box Fit", "Saturday", "10:00AM", "Available", "3","None","0"},
    };

    static String[][] d73 = {
            {"430", "Terrel", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
            {"0", "None", "Zumba", "Sunday", "7:00AM", "Available", "4","None","0"},
    };

    static String[][] d74 = {
            {"657", "Desiree", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"149", "Janey", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"385", "Codie", "Aquacise", "Sunday", "10:00AM", "Booked", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
    };

    static String[][] d81 = {
            {"664", "Jordanna", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"366", "Amabelle", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"396", "Bonni", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"359", "Patrice", "Yoga", "Saturday", "7:00AM", "Booked", "2","None","0"},
            {"0", "None", "Yoga", "Saturday", "7:00AM", "Available", "2","None","0"},
    };

    static String[][] d82 = {
            {"953", "Ryon", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"111", "Wilbert", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"430", "Terrel", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"657", "Desiree", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
            {"149", "Janey", "Box Fit", "Saturday", "10:00AM", "Booked", "3","None","0"},
    };

    static String[][] d83 = {
            {"385", "Codie", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"664", "Jordanna", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"366", "Amabelle", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"396", "Bonni", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
            {"359", "Patrice", "Zumba", "Sunday", "7:00AM", "Booked", "4","None","0"},
    };

    static String[][] d84 = {
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
            {"0", "None", "Aquacise", "Sunday", "10:00AM", "Available", "5","None","0"},
    };


    static int SeatAvailable(int classCode) {

        if (classCode == 11)
            return s11;
        else if (classCode == 12)
            return s12;
        else if (classCode == 13)
            return s13;
        else if (classCode == 14)
            return s14;
        else if (classCode == 21)
            return s21;
        else if (classCode == 22)
            return s22;
        else if (classCode == 23)
            return s23;
        else if (classCode == 24)
            return s24;
        else if (classCode == 31)
            return s31;
        else if (classCode == 32)
            return s32;
        else if (classCode == 33)
            return s33;
        else if (classCode == 34)
            return s34;
        else if (classCode == 41)
            return s41;
        else if (classCode == 42)
            return s42;
        else if (classCode == 43)
            return s43;
        else if (classCode == 44)
            return s44;
        else if (classCode == 51)
            return s51;
        else if (classCode == 52)
            return s52;
        else if (classCode == 53)
            return s53;
        else if (classCode == 54)
            return s54;
        else if (classCode == 61)
            return s61;
        else if (classCode == 62)
            return s62;
        else if (classCode == 63)
            return s63;
        else if (classCode == 64)
            return s64;
        else if (classCode == 71)
            return s71;
        else if (classCode == 72)
            return s72;
        else if (classCode == 73)
            return s73;
        else if (classCode == 74)
            return s74;
        else if (classCode == 81)
            return s81;
        else if (classCode == 82)
            return s82;
        else if (classCode == 83)
            return s83;
        else if (classCode == 84)
            return s84;

        return 0;
    }

    static void SelectBookingClass(String name, String id, int classCode) {
//
        if (classCode == 11)
            AddBooking(name, id, d11, 11);
        else if (classCode == 12)
            AddBooking(name, id, d12,12);
        else if (classCode == 13)
            AddBooking(name, id, d13,13);
        else if (classCode == 14)
            AddBooking(name, id, d14,14);
        else if (classCode == 21)
            AddBooking(name, id, d21,21);
        else if (classCode == 22)
            AddBooking(name, id, d22,22);
        else if (classCode == 23)
            AddBooking(name, id, d23,23);
        else if (classCode == 24)
            AddBooking(name, id, d24,24);
        else if (classCode == 31)
            AddBooking(name, id, d31,31);
        else if (classCode == 32)
            AddBooking(name, id, d32,32);
        else if (classCode == 33)
            AddBooking(name, id, d33,33);
        else if (classCode == 34)
            AddBooking(name, id, d34,34);
        else if (classCode == 41)
            AddBooking(name, id, d41,41);
        else if (classCode == 42)
            AddBooking(name, id, d42,42);
        else if (classCode == 43)
            AddBooking(name, id, d43,43);
        else if (classCode == 44)
            AddBooking(name, id, d44,44);
        else if (classCode == 51)
            AddBooking(name, id, d51,51);
        else if (classCode == 52)
            AddBooking(name, id, d52,52);
        else if (classCode == 53)
            AddBooking(name, id, d53,53);
        else if (classCode == 54)
            AddBooking(name, id, d54,54);
        else if (classCode == 61)
            AddBooking(name, id, d61,61);
        else if (classCode == 62)
            AddBooking(name, id, d62,62);
        else if (classCode == 63)
            AddBooking(name, id, d63,63);
        else if (classCode == 64)
            AddBooking(name, id, d64,64);
        else if (classCode == 71)
            AddBooking(name, id, d71,71);
        else if (classCode == 72)
            AddBooking(name, id, d72,72);
        else if (classCode == 73)
            AddBooking(name, id, d73,73);
        else if (classCode == 74)
            AddBooking(name, id, d74,74);
        else if (classCode == 81)
            AddBooking(name, id, d81,81);
        else if (classCode == 82)
            AddBooking(name, id, d82,82);
        else if (classCode == 83)
            AddBooking(name, id, d83,83);
        else if (classCode == 84)
            AddBooking(name, id, d84,84);

    }

    static void AddBooking(String name, String id, String[][] db, int classCode) {
        int already = 0;
        for (int i = 0; i < 5; i++) {
            if (Objects.equals(db[i][0], id)) {
                System.out.println("\nBooking Already Exist!! :| \n");
                already = 1;
                break;

            }
        }
        if (already == 0) {
            for (int i = 0; i < 5; i++) {
                if (db[i][5] == "Available") {

                    db[i][0] = id;
                    db[i][1] = name;
                    db[i][5] = "Booked";
                    removeSeat(classCode);

                    //Print the table

                    PrintTable(db);//
                    //
                    System.out.println("\nBooking Confirmed :)\n");
                    break;
                } else continue;


            }


        }


    }


    static void removeSeat(int classCode){

        if(classCode==11)
            s11--;
        else if(classCode==12)
            s12--;
        else if(classCode==13)
            s13--;
        else if(classCode==14)
            s14--;
        else if(classCode==21)
            s21--;
        else if(classCode==22)
            s22--;
        else if(classCode==23)
            s23--;
        else if(classCode==24)
            s24--;
        else if(classCode==31)
            s31--;
        else if(classCode==32)
            s32--;
        else if(classCode==33)
            s33--;
        else if(classCode==34)
            s34--;
        else if(classCode==41)
            s41--;
        else if(classCode==42)
            s42--;
        else if(classCode==43)
            s43--;
        else if(classCode==44)
            s44--;
        else if(classCode==51)
            s51--;
        else if(classCode==52)
            s52--;
        else if(classCode==53)
            s53--;
        else if(classCode==54)
            s54--;
        else if(classCode==61)
            s61--;
        else if(classCode==62)
            s62--;
        else if(classCode==63)
            s63--;
        else if(classCode==64)
            s64--;
        else if(classCode==71)
            s71--;
        else if(classCode==72)
            s72--;
        else if(classCode==73)
            s73--;
        else if(classCode==74)
            s74--;
        else if(classCode==81)
            s81--;
        else if(classCode==82)
            s82--;
        else if(classCode==83)
            s83--;
        else if(classCode==84)
            s84--;
    }




    static int[] SearchId(String id) {

        int[] idClassCode = new int[32];
        int found = 0, i;

        //d11
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d11[i][0])&&(!Objects.equals(d11[i][5], "Attended"))) {
                idClassCode[found] = 11;
                found++;
                break;
            }
        }
        //d12
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d12[i][0])&&(!Objects.equals(d12[i][5], "Attended"))) {
                idClassCode[found] = 12;
                found++;
                break;
            }
        }
        //d13
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d13[i][0])&&(!Objects.equals(d13[i][5], "Attended"))) {
                idClassCode[found] = 13;
                found++;
                break;
            }
        }
        //d14
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d14[i][0])&&(!Objects.equals(d14[i][5], "Attended"))) {
                idClassCode[found] = 14;
                found++;
                break;
            }
        }
        //d21
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d21[i][0])&&(!Objects.equals(d21[i][5], "Attended"))) {
                idClassCode[found] = 21;
                found++;
                break;
            }
        }
        //d22
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d22[i][0])&&(!Objects.equals(d22[i][5], "Attended"))) {
                idClassCode[found] = 22;
                found++;
                break;
            }
        }
        //d23
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d23[i][0])&&(!Objects.equals(d23[i][5], "Attended"))) {
                idClassCode[found] = 23;
                found++;
                break;
            }
        }
        //d24
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d24[i][0])&&(!Objects.equals(d24[i][5], "Attended"))) {
                idClassCode[found] = 24;
                found++;
                break;
            }
        }
        //d31
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d31[i][0])&&(!Objects.equals(d31[i][5], "Attended"))) {
                idClassCode[found] = 31;
                found++;
                break;
            }
        }
        //d32
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d32[i][0])&&(!Objects.equals(d32[i][5], "Attended"))) {
                idClassCode[found] = 32;
                found++;
                break;
            }
        }
        //d33
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d33[i][0])&&(!Objects.equals(d33[i][5], "Attended"))) {
                idClassCode[found] = 33;
                found++;
                break;
            }
        }
        //d34
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d34[i][0])&&(!Objects.equals(d34[i][5], "Attended"))) {
                idClassCode[found] = 34;
                found++;
                break;
            }
        }
        //d41
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d41[i][0])&&(!Objects.equals(d41[i][5], "Attended"))) {
                idClassCode[found] = 41;
                found++;
                break;
            }
        }
        //d42
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d42[i][0])&&(!Objects.equals(d42[i][5], "Attended"))) {
                idClassCode[found] = 42;
                found++;
                break;
            }
        }
        //d43
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d43[i][0])&&(!Objects.equals(d43[i][5], "Attended"))) {
                idClassCode[found] = 43;
                found++;
                break;
            }
        }
        //d44
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d44[i][0])&&(!Objects.equals(d44[i][5], "Attended"))) {
                idClassCode[found] = 44;
                found++;
                break;
            }
        }
        //d51
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d51[i][0])&&(!Objects.equals(d51[i][5], "Attended"))) {
                idClassCode[found] = 51;
                found++;
                break;
            }
        }
        //d52
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d52[i][0])&&(!Objects.equals(d52[i][5], "Attended"))) {
                idClassCode[found] = 52;
                found++;
                break;
            }
        }
        //d53
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d53[i][0])&&(!Objects.equals(d53[i][5], "Attended"))) {
                idClassCode[found] = 53;
                found++;
                break;
            }
        }
        //d54
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d54[i][0])&&(!Objects.equals(d54[i][5], "Attended"))) {
                idClassCode[found] = 54;
                found++;
                break;
            }
        }
        //d61
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d61[i][0])&&(!Objects.equals(d61[i][5], "Attended"))) {
                idClassCode[found] = 61;
                found++;
                break;
            }
        }
        //d62
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d62[i][0])&&(!Objects.equals(d62[i][5], "Attended"))) {
                idClassCode[found] = 62;
                found++;
                break;
            }
        }
        //d63
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d63[i][0])&&(!Objects.equals(d63[i][5], "Attended"))) {
                idClassCode[found] = 63;
                found++;
                break;
            }
        }
        //d64
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d64[i][0])&&(!Objects.equals(d64[i][5], "Attended"))) {
                idClassCode[found] = 64;
                found++;
                break;
            }
        }
        //d71
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d71[i][0])&&(!Objects.equals(d71[i][5], "Attended"))) {
                idClassCode[found] = 71;
                found++;
                break;
            }
        }
        //d72
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d72[i][0])&&(!Objects.equals(d72[i][5], "Attended"))) {
                idClassCode[found] = 72;
                found++;
                break;
            }
        }
        //d73
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d73[i][0])&&(!Objects.equals(d73[i][5], "Attended"))) {
                idClassCode[found] = 73;
                found++;
                break;
            }
        }
        //d74
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d74[i][0])&&(!Objects.equals(d74[i][5], "Attended"))) {
                idClassCode[found] = 74;
                found++;
                break;
            }
        }
        //d81
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d81[i][0])&&(!Objects.equals(d81[i][5], "Attended"))) {
                idClassCode[found] = 81;
                found++;
                break;
            }
        }
        //d82
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d82[i][0])&&(!Objects.equals(d82[i][5], "Attended"))) {
                idClassCode[found] = 82;
                found++;
                break;
            }
        }
        //d83
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d83[i][0])&&(!Objects.equals(d83[i][5], "Attended"))) {
                idClassCode[found] = 83;
                found++;
                break;
            }
        }
        //d84
        for (i = 0; i < 5; i++) {
            if (Objects.equals(id, d84[i][0])&&(!Objects.equals(d84[i][5], "Attended"))) {
                idClassCode[found] = 84;
                found++;
                break;
            }
        }

        return idClassCode;
    }


    static void SelectBookedOption(int[] idClassCode) {

        int i = 0;

        System.out.println("\nYour Bookings\n");
        System.out.println("Option\t\tWeek\t\tDay\t\t\t\tClass\t\tTime\t\tPrice(GBP)");
        System.out.println("---------------------------------------------------------------------------");

        while (idClassCode[i] != 0) {
            if (idClassCode[i] == 11) {

                System.out.println((i + 1) + "\t\t\tWeek 1\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                i++;
                continue;
            }
            else if (idClassCode[i] == 12) {

                System.out.println((i + 1) + "\t\t\tWeek 1\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                i++;
                continue;
            }
            else if (idClassCode[i] == 13) {

                System.out.println((i + 1) + "\t\t\tWeek 1\t\tSunday\t\tZumba\t\t7:00AM\t\t4");
                i++;
                continue;
            }
            else if (idClassCode[i] == 14) {

                System.out.println((i + 1) + "\t\t\tWeek 1\t\tSunday\t\tAquacise\t\t10:00AM\t\t5");
                i++;
                continue;
            }
            else if (idClassCode[i] == 21) {

                System.out.println((i + 1) + "\t\t\tWeek 2\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                i++;
                continue;
            }
            else if (idClassCode[i] == 22) {

                System.out.println((i + 1) + "\t\t\tWeek 2\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                i++;
                continue;
            }
            else if (idClassCode[i] == 23) {

                System.out.println((i + 1) + "\t\t\tWeek 2\t\tSunday\t\tZumba\t\t7:00AM\t\t4");
                i++;
                continue;
            }
            else if (idClassCode[i] == 24) {

                System.out.println((i + 1) + "\t\t\tWeek 2\t\tSunday\t\tAquacise\t\t10:00AM\t\t5");
                i++;
                continue;
            }
            else if (idClassCode[i] == 31) {

                System.out.println((i + 1) + "\t\t\tWeek 3\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                i++;
                continue;
            }
            else if (idClassCode[i] == 32) {

                System.out.println((i + 1) + "\t\t\tWeek 3\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                i++;
                continue;
            }
            else if (idClassCode[i] == 33) {

                System.out.println((i + 1) + "\t\t\tWeek 3\t\tSunday\t\tZumba\t\t7:00AM\t\t4");
                i++;
                continue;
            }
            else if (idClassCode[i] == 34) {

                System.out.println((i + 1) + "\t\t\tWeek 3\t\tSunday\t\tAquacise\t\t10:00AM\t\t5");
                i++;
                continue;
            }
            else if (idClassCode[i] == 41) {

                System.out.println((i + 1) + "\t\t\tWeek 4\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                i++;
                continue;
            }
            else if (idClassCode[i] == 42) {

                System.out.println((i + 1) + "\t\t\tWeek 4\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                i++;
                continue;
            }
            else if (idClassCode[i] == 43) {

                System.out.println((i + 1) + "\t\t\tWeek 4\t\tSunday\t\tZumba\t\t7:00AM\t\t4");
                i++;
                continue;
            }
            else if (idClassCode[i] == 44) {

                System.out.println((i + 1) + "\t\t\tWeek 4\t\tSunday\t\tAquacise\t\t10:00AM\t\t5");
                i++;
                continue;
            }
            else if (idClassCode[i] == 51) {

                System.out.println((i + 1) + "\t\t\tWeek 5\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                i++;
                continue;
            }
            else if (idClassCode[i] == 52) {

                System.out.println((i + 1) + "\t\t\tWeek 5\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                i++;
                continue;
            }
            else if (idClassCode[i] == 53) {

                System.out.println((i + 1) + "\t\t\tWeek 5\t\tSunday\t\tZumba\t\t7:00AM\t\t4");
                i++;
                continue;
            }
            else if (idClassCode[i] == 54) {

                System.out.println((i + 1) + "\t\t\tWeek 5\t\tSunday\t\tAquacise\t\t10:00AM\t\t5");
                i++;
                continue;
            }
            else if (idClassCode[i] == 61) {

                System.out.println((i + 1) + "\t\t\tWeek 6\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                i++;
                continue;
            }
            else if (idClassCode[i] == 62) {

                System.out.println((i + 1) + "\t\t\tWeek 6\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                i++;
                continue;
            }
            else if (idClassCode[i] == 63) {

                System.out.println((i + 1) + "\t\t\tWeek 6\t\tSunday\t\tZumba\t\t7:00AM\t\t4");
                i++;
                continue;
            }
            else if (idClassCode[i] == 64) {

                System.out.println((i + 1) + "\t\t\tWeek 6\t\tSunday\t\tAquacise\t\t10:00AM\t\t5");
                i++;
                continue;
            }
            else if (idClassCode[i] == 71) {

                System.out.println((i + 1) + "\t\t\tWeek 7\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                i++;
                continue;
            }
            else if (idClassCode[i] == 72) {

                System.out.println((i + 1) + "\t\t\tWeek 7\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                i++;
                continue;
            }
            else if (idClassCode[i] == 73) {

                System.out.println((i + 1) + "\t\t\tWeek 7\t\tSunday\t\tZumba\t\t7:00AM\t\t4");
                i++;
                continue;
            }
            else if (idClassCode[i] == 74) {

                System.out.println((i + 1) + "\t\t\tWeek 7\t\tSunday\t\tAquacise\t\t10:00AM\t\t5");
                i++;
                continue;
            }
            else if (idClassCode[i] == 81) {

                System.out.println((i + 1) + "\t\t\tWeek 8\t\tSaturday\t\tYoga\t\t7:00AM\t\t2");
                i++;
                continue;
            }
            else if (idClassCode[i] == 82) {

                System.out.println((i + 1) + "\t\t\tWeek 8\t\tSaturday\t\tBox Fit\t\t10:00AM\t\t3");
                i++;
                continue;
            }
            else if (idClassCode[i] == 83) {

                System.out.println((i + 1) + "\t\t\tWeek 8\t\tSunday\t\tZumba\t\t7:00AM\t\t4");
                i++;
                continue;
            }
            else if (idClassCode[i] == 84) {

                System.out.println((i + 1) + "\t\t\tWeek 8\t\tSunday\t\tAquacise\t\t10:00AM\t\t5");
                i++;
                continue;
            }

            i++;
        }


    }

    static void SelectCancelClass(int cancelClass, String id) {

        if (cancelClass == 11)
            CancelClass(d11, id,11);
        else if (cancelClass == 12)
            CancelClass(d12, id,12);
        else if (cancelClass == 13)
            CancelClass(d13, id,13);
        else if (cancelClass == 14)
            CancelClass(d14, id,14);
        else if (cancelClass == 21)
            CancelClass(d21, id,21);
        else if (cancelClass == 22)
            CancelClass(d22, id,22);
        else if (cancelClass == 23)
            CancelClass(d23, id,23);
        else if (cancelClass == 24)
            CancelClass(d24, id,24);
        else if (cancelClass == 31)
            CancelClass(d31, id,31);
        else if (cancelClass == 32)
            CancelClass(d32, id,32);
        else if (cancelClass == 33)
            CancelClass(d33, id,33);
        else if (cancelClass == 34)
            CancelClass(d34, id,34);
        else if (cancelClass == 41)
            CancelClass(d41, id,41);
        else if (cancelClass == 42)
            CancelClass(d42, id,42);
        else if (cancelClass == 43)
            CancelClass(d43, id,43);
        else if (cancelClass == 44)
            CancelClass(d44, id,44);
        else if (cancelClass == 51)
            CancelClass(d51, id,51);
        else if (cancelClass == 52)
            CancelClass(d52, id,52);
        else if (cancelClass == 53)
            CancelClass(d53, id,53);
        else if (cancelClass == 54)
            CancelClass(d54, id,54);
        else if (cancelClass == 61)
            CancelClass(d61, id,61);
        else if (cancelClass == 62)
            CancelClass(d62, id,62);
        else if (cancelClass == 63)
            CancelClass(d63, id,63);
        else if (cancelClass == 64)
            CancelClass(d64, id,64);
        else if (cancelClass == 71)
            CancelClass(d71, id,71);
        else if (cancelClass == 72)
            CancelClass(d72, id,72);
        else if (cancelClass == 73)
            CancelClass(d73, id,73);
        else if (cancelClass == 74)
            CancelClass(d74, id,74);
        else if (cancelClass == 81)
            CancelClass(d81, id,81);
        else if (cancelClass == 82)
            CancelClass(d82, id,82);
        else if (cancelClass == 83)
            CancelClass(d83, id,83);
        else if (cancelClass == 84)
            CancelClass(d84, id,84);
        else
            System.out.println("\nInvalid Choice :(\n");

    }

    static void CancelClass(String[][] db, String id,int classCode) {

        for (int i=0;i<5;i++) {
            //System.out.println("HEYYYY\t"+id+"\t"+db[i][0]);//
            if (Objects.equals(db[i][0], id)) {

                db[i][0] = "0";
                db[i][1] = "None";
                db[i][5] = "Available";
                addSeat(classCode);
                PrintTable(db); //
                System.out.println("\nBooking Canceled :)\n");
                break;


            }

        }
    }


    static void addSeat(int classCode){


        if(classCode==11)
            s11++;
        else if(classCode==12)
            s12++;
        else if(classCode==13)
            s13++;
        else if(classCode==14)
            s14++;
        else if(classCode==21)
            s21++;
        else if(classCode==22)
            s22++;
        else if(classCode==23)
            s23++;
        else if(classCode==24)
            s24++;
        else if(classCode==31)
            s31++;
        else if(classCode==32)
            s32++;
        else if(classCode==33)
            s33++;
        else if(classCode==34)
            s34++;
        else if(classCode==41)
            s41++;
        else if(classCode==42)
            s42++;
        else if(classCode==43)
            s43++;
        else if(classCode==44)
            s44++;
        else if(classCode==51)
            s51++;
        else if(classCode==52)
            s52++;
        else if(classCode==53)
            s53++;
        else if(classCode==54)
            s54++;
        else if(classCode==61)
            s61++;
        else if(classCode==62)
            s62++;
        else if(classCode==63)
            s63++;
        else if(classCode==64)
            s64++;
        else if(classCode==71)
            s71++;
        else if(classCode==72)
            s72++;
        else if(classCode==73)
            s73++;
        else if(classCode==74)
            s74++;
        else if(classCode==81)
            s81++;
        else if(classCode==82)
            s82++;
        else if(classCode==83)
            s83++;
        else if(classCode==84)
            s84++;
    }


    static void SelectAttendClass(int attendClass, String id) {

        if (attendClass == 11)
            AttendClass(d11, id);
        else if (attendClass == 12)
            AttendClass(d12, id);
        else if (attendClass == 13)
            AttendClass(d13, id);
        else if (attendClass == 14)
            AttendClass(d14, id);
        else if (attendClass == 21)
            AttendClass(d21, id);
        else if (attendClass == 22)
            AttendClass(d22, id);
        else if (attendClass == 23)
            AttendClass(d23, id);
        else if (attendClass == 24)
            AttendClass(d24, id);
        else if (attendClass == 31)
            AttendClass(d31, id);
        else if (attendClass == 32)
            AttendClass(d32, id);
        else if (attendClass == 33)
            AttendClass(d33, id);
        else if (attendClass == 34)
            AttendClass(d34, id);
        else if (attendClass == 41)
            AttendClass(d41, id);
        else if (attendClass == 42)
            AttendClass(d42, id);
        else if (attendClass == 43)
            AttendClass(d43, id);
        else if (attendClass == 44)
            AttendClass(d44, id);
        else if (attendClass == 51)
            AttendClass(d51, id);
        else if (attendClass == 52)
            AttendClass(d52, id);
        else if (attendClass == 53)
            AttendClass(d53, id);
        else if (attendClass == 54)
            AttendClass(d54, id);
        else if (attendClass == 61)
            AttendClass(d61, id);
        else if (attendClass == 62)
            AttendClass(d62, id);
        else if (attendClass == 63)
            AttendClass(d63, id);
        else if (attendClass == 64)
            AttendClass(d64, id);
        else if (attendClass == 71)
            AttendClass(d71, id);
        else if (attendClass == 72)
            AttendClass(d72, id);
        else if (attendClass == 73)
            AttendClass(d73, id);
        else if (attendClass == 74)
            AttendClass(d74, id);
        else if (attendClass == 81)
            AttendClass(d81, id);
        else if (attendClass == 82)
            AttendClass(d82, id);
        else if (attendClass == 83)
            AttendClass(d83, id);
        else if (attendClass == 84)
            AttendClass(d84, id);
        else
            System.out.println("\nInvalid Choice :(\n");

    }

    static void AttendClass(String[][] db, String id) {

        for (int i=0;i<5;i++) {
            if (Objects.equals(db[i][0], id)) {
                db[i][5] = "Attended";
                AttendedFeedback(db,i);
                PrintTable(db); //
                System.out.println("\nThank you for Attending the  Class :)\n");
                break;
            }

        }
    }

    static void AttendedFeedback(String[][] db,int i){

        String feedback;
        int rating;
        Scanner sc=new Scanner(System.in);

        System.out.println("\nPlease Provide a Feedback of the Class:\n");
        feedback=sc.nextLine();
        db[i][7]=feedback;
        System.out.println("\nRate Our Class:\n(1: Very dissatisfied, 2: Dissatisfied, 3: Ok, 4: Satisfied, 5: Very Satisfied)\n");
        rating=sc.nextInt();
        while(rating<1||rating>5){
            System.out.print("\nEnter a Value Between 1 and 5 :\t");
            rating=sc.nextInt();
        }
        db[i][8]=Integer.toString(rating);

    }


    static void MonthlyReportSelect(int month){

        switch (month){

            case 1:
                for (String[][] items: new String[][][]{d11, d12, d13, d14, d21, d22, d23, d24}){
                    System.out.print("Week 1\t\t");
                    MonthlyReport(items);
                }
                for (String[][] items: new String[][][]{d21, d22, d23, d24}){
                    System.out.print("Week 2\t\t");
                    MonthlyReport(items);
                }
                for (String[][] items: new String[][][]{d31, d32, d33, d34}){
                    System.out.print("Week 3\t\t");
                    MonthlyReport(items);
                }
                for (String[][] items: new String[][][]{d41, d42, d43, d44}){
                    System.out.print("Week 4\t\t");
                    MonthlyReport(items);
                }
                break;
            case 2:
                for (String[][] items: new String[][][]{d51, d52, d53, d54}){
                    System.out.print("Week 5\t\t");
                    MonthlyReport(items);
                }
                for (String[][] items: new String[][][]{d61, d62, d63, d64}){
                    System.out.print("Week 6\t\t");
                    MonthlyReport(items);
                }
                for (String[][] items: new String[][][]{d71, d72, d73, d74}){
                    System.out.print("Week 7\t\t");
                    MonthlyReport(items);
                }
                for (String[][] items: new String[][][]{d81, d82, d83, d84}){
                    System.out.print("Week 8\t\t");
                    MonthlyReport(items);
                }
                break;

            default:
                System.out.println("\nMonth Doesnt Exist :(\nOnly Month 1 and 2 is available\n\n");
                Report.MonthlyReportView();

        }


    }

    static void MonthlyReport(String[][] db){

        int noCustomers=0;
        float avgRating=0;
        System.out.println(db[0][2]);
        for(int i=0;i<5;i++){
            if(db[i][5]=="Attended"){
                noCustomers++;
                avgRating+=Float.parseFloat(db[i][8]);
            }
        }
        avgRating/=noCustomers;
        System.out.println("\nNumber of Customers Attended:\t"+noCustomers+"\nAverage Rating of the Class:\t"+avgRating+"\n");

    }



//

    static void ChampionReportSelect(int month){

        int highIncome=0,yogaIncome=0,boxfitIncome=0,zumbaIncome=0,aquaciseIncome=0;


        switch (month){

            case 1:
                for (String[][] items: new String[][][]{d11, d21, d31, d41})
                    yogaIncome+=ChampionReport(items);
                System.out.println("Yoga\t\t\t\t"+yogaIncome);

                for (String[][] items: new String[][][]{d12, d22, d32, d42})
                    boxfitIncome+=ChampionReport(items);
                System.out.println("Box Fit\t\t\t\t"+boxfitIncome);

                for (String[][] items: new String[][][]{d13, d23, d33, d43})
                    zumbaIncome+=ChampionReport(items);
                System.out.println("Zumba\t\t\t\t"+zumbaIncome);

                for (String[][] items: new String[][][]{d14, d24, d34, d44})
                    aquaciseIncome+=ChampionReport(items);
                System.out.println("Aquacise\t\t\t"+aquaciseIncome);
                break;
            case 2:
                for (String[][] items: new String[][][]{d51, d61, d71, d81})
                    yogaIncome+=ChampionReport(items);
                System.out.println("Yoga\t\t\t\t"+yogaIncome);

                for (String[][] items: new String[][][]{d52, d62, d72, d82})
                    boxfitIncome+=ChampionReport(items);
                System.out.println("Box Fit\t\t\t\t"+boxfitIncome);

                for (String[][] items: new String[][][]{d53, d63, d73, d83})
                    zumbaIncome+=ChampionReport(items);
                System.out.println("Zumba\t\t\t\t"+zumbaIncome);

                for (String[][] items: new String[][][]{d54, d64, d74, d84})
                    aquaciseIncome+=ChampionReport(items);
                System.out.println("Aquacise\t\t\t"+aquaciseIncome);
                break;

            default:
                System.out.println("\nMonth Doesnt Exist :(\n\nOnly Month 1 and 2 is available\n\n");
                Report.ChampionReportView();
        }

        //Highest Income
        for( int items : new int[]{yogaIncome, boxfitIncome, zumbaIncome, aquaciseIncome}){
            if(items>highIncome)
                highIncome=items;
        }
        System.out.print("\nHighest Income Class:\t");
        if(highIncome==yogaIncome)
            System.out.print("Yoga\t\t");
        if(highIncome==boxfitIncome)
            System.out.print("Box Fit\t\t");
        if(highIncome==zumbaIncome)
            System.out.print("Zumba\t\t");
        if(highIncome==aquaciseIncome)
            System.out.print("Aquacise\t\t");



    }

    static int ChampionReport(String[][] db){

        int noCustomers=0;
        for(int i=0;i<5;i++){
            if(db[i][5]=="Attended"){
                noCustomers++;
            }
        }
        return (noCustomers*Integer.parseInt(db[0][6]));

    }


    static void PrintTable(String[][] db) {

        System.out.println();
        System.out.println("\nID\t\tName\t\tClass\t\t\tDay\t\t\tTime\t\tStatus\t\tPrice\t\tReview\t\tRating");
        System.out.println("------------------------------------------------------------------------------------------------------------");
        for (String[] items : db) {
            for (String item : items)
                System.out.print(item + "\t\t");
            System.out.println();
        }
    }

}
