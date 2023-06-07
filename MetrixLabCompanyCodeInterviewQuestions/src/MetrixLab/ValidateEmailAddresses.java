package MetrixLab;
import java.util.Scanner;
public class ValidateEmailAddresses {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter your email address: ");
			String emailAddress1 = scanner.nextLine();

			System.out.print("Re-enter your email address: ");
			String emailAddress2 = scanner.nextLine();

			if (isValidEmailAddress(emailAddress1) && isValidEmailAddress(emailAddress2)) {
			    if (emailAddress1.equals(emailAddress2)) {
			        System.out.println("Email addresses are valid and match.");
			    } else {
			        System.out.println("Email addresses do not match.");
			    }
			} else {
			    System.out.println("Invalid email address format.");
			}
		}
    }

    public static boolean isValidEmailAddress(String emailAddress) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return emailAddress.matches(regex);
    }
}