import java.util.Arrays;

public class Main {

    public static int[] countOfNumbers(int[] array){
        int length = array.length;
        int result[] = new int[length];
        for (int iterator1 = 0 ; iterator1 < length ; iterator1++){
            int count = 0 ;
            for (int iterator2 = iterator1 + 1 ; iterator2 < length ; iterator2++){
                count += (array[iterator1] > array[iterator2]) ? 1 : 0;
            }
            result[iterator1] = count;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countOfNumbers(new int[]{-1,-1})));
    }
}