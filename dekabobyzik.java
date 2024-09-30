import java.util.Scanner;
// пользователь вводит переменную
// вайл тру
// если она нормик то вернуть тру и записать переменуную
//спросить некст
//
// елс вывести что все кал и надо по новой
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer intValue;
        Float floatValue;
        String stringValue;
        Boolean booleanValue;


        while (true) {
            System.out.println("Введіть ціле число");
            String intInput = scanner.nextLine();

            if (IsInt(intInput)) {
                intValue = Integer.parseInt(intInput);
                System.out.println("Значення підходить, давай наступне");
                break;
            } else {
                System.out.println("Невірно введене значення, спробуйте ще раз");
            }
        }

        while (true){
            System.out.println("Введіть число з плаваючею точкою: ");
            String floatInput = scanner.nextLine();

            if(IsFloat(floatInput)){
                floatValue = Float.parseFloat(floatInput);
                System.out.println("Значення підходить, давай наступне");
                break;
            }
            else {
                System.out.println("Невірно введене значення, спробуйте ще раз");
            }
        }

        System.out.println("Введіть строку: ");
        String strInput = scanner.nextLine();
        stringValue = strInput;

        while (true){
            System.out.println("Введіть логічне значення true/false: ");
            String boolInput = scanner.nextLine();

            if(boolInput.equalsIgnoreCase("true") || boolInput.equalsIgnoreCase("false")) {
                booleanValue = Boolean.parseBoolean(boolInput);
                System.out.println("Значення введене вірно!");
                break;
            }
            else {
                System.out.println("ne dya dya choto ne to, davai po novoi");
            }
        }

        System.out.printf("Ціле число (десяткове): %d%n", intValue);
        System.out.printf("Ціле число (шістнадцяткове): %x%n", intValue);
        System.out.printf("Ціле число (вісімкове): %o%n", intValue);
        System.out.printf("Число з плаваючою точкою (2 знаки після коми): %.2f%n", floatValue);
        System.out.printf("Рядок (відступ): %20s%n", stringValue);
        System.out.printf("Рядок (з заповнювачем пробілу): %10s%n", stringValue);
        System.out.printf("Логічне значення: %b%n", booleanValue);
        System.out.printf("Логічне значення (інверсія): %b%n", !booleanValue);
        System.out.printf("Рядок (вирівнюванний за правим боком з довжиною 10): %10s%n", stringValue);
        System.out.printf("Число з плаваючою точкою (науковий формат): %.2e%n", floatValue);

        scanner.close();





    }


    private static boolean IsInt(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch (NumberFormatException e) {
            return false;
        }
    }
    private static boolean IsFloat(String str){
        try{
            Float.parseFloat(str);
            return true;
        }catch (NumberFormatException e) {
            return false;
        }
    }

}