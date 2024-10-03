package src.ss19.bai_tap.validate_phone_number;

public class ValidatePhoneNumber {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";
        return phoneNumber.matches(regex);
    }

    public static void main(String[] args) {
        String phoneNumber1 = "(84)-(0978489648)";
        String phoneNumber2 = "(a8)-(22222222)";
        String phoneNumber3 = "(84)-(22b22222)";
        String phoneNumber4 = "(84)-(9978489648)";

        System.out.println("Valid phone number: " + isValidPhoneNumber(phoneNumber1));
        System.out.println("Invalid phone number: " + isValidPhoneNumber(phoneNumber2));
        System.out.println("Invalid phone number: " + isValidPhoneNumber(phoneNumber3));
        System.out.println("Valid phone number: " + isValidPhoneNumber(phoneNumber4));
    }
}
