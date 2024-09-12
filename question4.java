// Concatenating with + sign
public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "world";
        String result = str1 + ", " + str2;
        System.out.println(result); // output: Hello, world
    }
}


// Concatenating with String.join
public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "world";
        String result = String.join(",", str1, str2);
        System.out.println(result); // output: Hello,world
    }
}
