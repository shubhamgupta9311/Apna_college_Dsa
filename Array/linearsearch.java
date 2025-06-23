public class linearsearch {
    public static int search(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 20;// the number whose index we have to search or find
        int index = search(numbers, key);
        if (index == -1) {
            System.out.println("not found that number");

        } else {
            System.out.println("index of "+key+" is : "+index);
        }

    }
}
