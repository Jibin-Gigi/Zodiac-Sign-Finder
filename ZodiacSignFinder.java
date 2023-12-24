import java.util.Scanner;
import java.util.StringTokenizer;

public class ZodiacSignFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("Enter your Date of Birth in \"Date/Month\" format (eg: 08/May)");

        String string = sc.nextLine();
        String[] dateMonth = new String[2];
        StringTokenizer separation = new StringTokenizer(string, "/");
        while (separation.hasMoreTokens()) {
            dateMonth[i] = separation.nextToken();
            i++;
        }
        int date = Integer.parseInt(dateMonth[0]);
        String month = dateMonth[1].toLowerCase();

        String sign = zodiacFinder(date, month);
        System.out.println("Your zodiac sign is: " + sign);
        sc.close();
    }

    static String zodiacFinder(int date, String month) {
        if (month.equals("january")) {
            if (date <= 19) {
                return "Capricorn";
            } else {
                return "Aquarius";
            }
        } else if (month.equals("february")) {
            if (date <= 18) {
                return "Aquarius";
            } else {
                return "Pisces";
            }
        } else if (month.equals("march")) {
            if (date <= 20) {
                return "Pisces";
            } else {
                return "Aries";
            }
        } else if (month.equals("april")) {
            if (date <= 19) {
                return "Aries";
            } else {
                return "Taurus";
            }
        } else if (month.equals("may")) {
            if (date <= 20) {
                return "Taurus";
            } else {
                return "Gemini";
            }
        } else if (month.equals("june")) {
            if (date <= 20) {
                return "Gemini";
            } else {
                return "Cancer";
            }
        } else if (month.equals("july")) {
            if (date <= 22) {
                return "Cancer";
            } else {
                return "Leo";
            }
        } else if (month.equals("august")) {
            if (date <= 22) {
                return "Leo";
            } else {
                return "Virgo";
            }
        } else if (month.equals("september")) {
            if (date <= 22) {
                return "Virgo";
            } else {
                return "Libra";
            }
        } else if (month.equals("october")) {
            if (date <= 22) {
                return "Libra";
            } else {
                return "Scorpio";
            }
        } else if (month.equals("november")) {
            if (date <= 21) {
                return "Scorpio";
            } else {
                return "Sagittarius";
            }
        } else if (month.equals("december")) {
            if (date <= 21) {
                return "Sagittarius";
            } else {
                return "Capricorn";
            }
        } else {
            return "Invalid input";
        }
    }
}
