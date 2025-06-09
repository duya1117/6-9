public class Main {
    public static void main(String[] args) {
//        int[] numbers = {1,2,3,4,5,6,7};
//
//        for(int i = 6; i >= 0; i--){
//            System.out.println(numbers[i]);
//        }

        int[] numbers = new int [5];
        int num;
        int j;

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }
        for(int i = 0; i < numbers.length; i++){
            num = numbers[i];
            j = (int)(Math.random() * (numbers.length -1) +1);
                numbers[i] = numbers[j];
                numbers[j] = num;
            System.out.println(numbers[i]);
        }
    }
}