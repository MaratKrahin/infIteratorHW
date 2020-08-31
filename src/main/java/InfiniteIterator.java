import java.util.Iterator;
import java.util.Random;

 class InfiniteIterator implements Iterator<Integer> {
    private final Random random;
    private final int min;
    private final int max;

    public InfiniteIterator(int min, int max) {
        random = new Random();
        this.min = min;
        this.max = max;
    }

    private int randomInt(int min, int max) {
        return random.nextInt((max - min + 1)) + min;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return randomInt(this.min, this.max);
    }

    @Override
    public void remove() {
        System.out.println("Nothing to delete!");
    }
}
