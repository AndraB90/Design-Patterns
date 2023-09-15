package Iterator;

public class Main5 {
    public static void main(String[] args) {
        Integer[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        SpiralArrayIterator<Integer> iterator = new SpiralArrayIterator<>(arr);
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
