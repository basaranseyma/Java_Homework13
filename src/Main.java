import java.util.*;

public class Main {
    public static void main(String[] args) {
        int month, day;
        String zodiacSign = "";
        boolean isError = false;

        Scanner inp = new Scanner(System.in);

        System.out.print("Which month were you born in? e.g., January = 1, February = 2, and so on. Please enter the number: ");
        month = inp.nextInt();

        System.out.print("Please enter the day of the month you were born, using numbers : ");
        day = inp.nextInt();

        if (month == 1) {
            if ((1 <= day) && (day <= 31)) {
                zodiacSign = (day < 22) ? "Capricorn" : "Aquarius";
            } else {
                     isError = true;
                }
        } else if (month == 2) {
            if ((1 <= day) && (day <= 29)) {
                zodiacSign = (day < 20) ? "Aquarius" : "Pisces";
            } else {
                isError = true;
            }
        } else if (month == 3) {
            if ((1 <= day) && (day <= 31)) {
                zodiacSign = (day < 21) ? "Pisces" : "Aries";
            } else {
                isError = true;
            }
        } else if (month == 4) {
            if ((1 <= day) && (day <= 30)) {
                zodiacSign = (day < 21) ? "Aries" : "Taurus";
            } else {
                isError = true;
            }
        } else if (month == 5) {
            if ((1 <= day) && (day <= 31)) {
                zodiacSign = (day < 22) ? "Taurus" : "Gemini";
            } else {
                isError = true;
            }
        } else if (month == 6) {
            if ((1 <= day) && (day <= 30)) {
                zodiacSign = (day < 23) ? "Gemini" : "Cancer";
            } else {
                isError = true;
            }
        } else if (month == 7) {
            if ((1 <= day) && (day <= 31)) {
                zodiacSign = (day < 23) ? "Cancer" : "Leo";
            } else {
                isError = true;
            }
        } else if (month == 8) {
            if ((1 <= day) && (day <= 31)) {
                zodiacSign = (day < 23) ? "Leo" : "Virgo";
            } else {
                isError = true;
            }
        } else if (month == 9) {
            if ((1 <= day) && (day <= 30)) {
                zodiacSign = (day < 23) ? "Virgo" : "Libra";
            } else {
                isError = true;
            }
        } else if (month == 10) {
            if ((1 <= day) && (day <= 31)) {
                zodiacSign = (day < 23) ? "Libra" : "Scorpio";
            } else {
                isError = true;
            }
        } else if (month == 11) {
            if ((1 <= day) && (day <= 30)) {
                zodiacSign = (day < 22) ? "Scorpio" : "Sagittarius";
            } else {
                isError = true;
            }
        } else if (month == 12) {
            if ((1 <= day) && (day <= 31)) {
                zodiacSign = (day < 22) ? "Sagittarius" : "Capricorn";
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("Invalid entry!");
        } else {
            System.out.println("Your zodiac sign is " + zodiacSign + ".");
        }
    }
}