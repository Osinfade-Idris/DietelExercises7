public class SumArray {
    public static void main(String[] args) {
        int [] array = {69, 46, 74, 20, 12, 27, 28, 90, 76, 50};
        int total=0;

        for (int counter=0; counter<array.length; counter++){
            total+=array[counter];
        }
        System.out.printf("Total of array elements: %d%n", total);
    }
}
