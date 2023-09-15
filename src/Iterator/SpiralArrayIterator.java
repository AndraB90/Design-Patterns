package Iterator;

import java.util.Iterator;

public class SpiralArrayIterator <T> implements Iterator<T> {
    private T[][] array;
    private int rows, cols;
    private int top, bottom, left, right;
    private int direction; // 0 = right, 1 = down, 2 = left, 3 = up

    public SpiralArrayIterator(T[][] array) {
        this.array = array;
        this.rows = array.length;
        this.cols = array[0].length;
        this.top = 0;
        this.bottom = rows - 1;
        this.left = 0;
        this.right = cols - 1;
        this.direction = 0;
    }

    @Override
    public boolean hasNext() {
        return top <= bottom && left <= right;
    }

    @Override
    public T next() {
        T value = array[top][left];

        switch (direction) {
            case 0:
                left++;
                if (left > right) {
                    top++;
                    left--;
                    direction = 1;
                }
                break;
            case 1:
                top++;
                if (top > bottom) {
                    top--;
                    right--;
                    direction = 2;
                }
                break;
            case 2:
                right--;
                if (right < left) {
                    right++;
                    bottom--;
                    direction = 3;
                }
                break;
            case 3:
                bottom--;
                if (bottom < top) {
                    bottom++;
                    left++;
                    direction = 0;
                }
                break;
        }

        return value;
    }
}
