public class StringDemo {
    public static void main(String[] args) {
        // Declare and initialize strings
        String firstName = "Abinaya";
        String lastName = "Ravi";

        // Concatenate strings
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // Find length of the string
        System.out.println("Length of Full Name: " + fullName.length());

        // Access individual characters
        System.out.println("First character: " + fullName.charAt(0));
        System.out.println("Last character: " + fullName.charAt(fullName.length() - 1));

        // Compare strings
        String anotherName = "Abinaya Ravi";
        if (fullName.equals(anotherName)) {
            System.out.println("Names match exactly.");
        } else {
            System.out.println("Names do not match.");
        }

        // Convert to uppercase
        System.out.println("Uppercase: " + fullName.toUpperCase());

        // Check if string contains a substring
        if (fullName.contains("Ravi")) {
            System.out.println("Last name found in full name.");
        }
    }
}
