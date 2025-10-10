public class StringBuilderExample {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Append text
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert text
        sb.insert(5, ", Java");
        System.out.println("After insert: " + sb);

        // Replace text
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        // Delete text
        sb.delete(3, 8);
        System.out.println("After delete: " + sb);

        // Reverse text
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Convert to String
        String result = sb.toString();
        System.out.println("Final String: " + result);
    }
}