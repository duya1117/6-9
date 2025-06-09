public class Main {
    public static void greet(){
        System.out.println("Hello, World!");
    }
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
    public static void greet(String name, int age){
        System.out.println("Hello, " + name + "!" + " age " + age);
    }
    public static void main(String[] args) {
        greet();
        greet("Alice");
        greet("Alice",18);
    }
}