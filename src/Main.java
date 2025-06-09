public class Main {
    public static void main(String[] args) {
        int[] numbers = new int [5];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (i+1)*2;
            System.out.println(numbers[i]);
        }

        int sum = 0;

        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}