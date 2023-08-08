// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int day =8;
        int month =8;
        int year = 2023;
        System.out.println(dateToString(day,month,year));

        }
        //=================
        public static String dateToString(int day, int month, int year){
        String res = " ";
        String strMonth = " ";
        switch (month){
            case 1:strMonth = " January"; break;
            case 2:strMonth = " February"; break;
            case 3:strMonth = " Martch"; break;
            case 4:strMonth = " April"; break;
            case 5:strMonth = " May"; break;
            case 6:strMonth = " June"; break;
            case 7:strMonth = " July"; break;
            case 8:strMonth = " August"; break;
            case 9:strMonth = "September"; break;
            case 10:strMonth = " October"; break;
            case 11:strMonth = " November"; break;
            case 12:strMonth = " December"; break;

        }
        res= (day<10?"0":"")+ day + "." + strMonth +" "+ year;
        return res;

        }
    //================
    }
