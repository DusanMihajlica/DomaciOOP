import java.util.Scanner;
public class KALKULATOR {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String exit;
        do {
            System.out.println("Prvi broj:");
            double number1 = Double.parseDouble(scanner.nextLine());
            if (number1 < 12 || number1 > 24) {
                do {
                    System.out.println("Pogresan unos upisite broj ponovo");
                    number1 = Double.parseDouble(scanner.nextLine());
                } while (number1 < 12 || number1 > 24);
            }
            System.out.println("Drugi broj:");
            double number2 = Double.parseDouble(scanner.nextLine());
            if (number2 < 12 || number2 > 24) {
                do {
                    System.out.println("Pogresan unos upisite broj ponovo");
                    number2 = Double.parseDouble(scanner.nextLine());
                } while (number2 < 12 || number2 > 24);
            }
            System.out.println("Operacija koju zelite da izvrsite:");
            char operation = scanner.nextLine().charAt(0);
            if (operation != '-' && operation != '+' && operation != '*' && operation != '/') {
                do {
                    System.out.println("Pogresan unos upisite operaciju ponovo");
                    operation = scanner.nextLine().charAt(0);
                } while (operation != '-' && operation != '+' && operation != '*' && operation != '/');
            }
            double number3=0;
            switch(operation)
            {
            case '+': number3 = number1+number2; break;
            case '-': number3 = number1-number2; break;
            case '*': number3 = number1*number2; break;
            case '/': number3 = number1/number2; break;
            }
            
            System.out.println("Rezultat je: " + number3);
            System.out.println("Zelite li izaci? (da/ne)");
            exit = scanner.nextLine();
        } while (exit != "da");

	}

}
