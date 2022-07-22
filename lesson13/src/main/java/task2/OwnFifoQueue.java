package task2;

public class OwnFifoQueue implements OwnQueue {
    private Integer[] ownFifoQueue = new Integer[2];

    @Override
    public boolean add(Integer element) {
        for (int i = 0; i < ownFifoQueue.length; i++) {
            if (ownFifoQueue[i] == null) {
                ownFifoQueue[i] = element;
                return true;
            }
        }
        Integer[] temp = new Integer[ownFifoQueue.length * 2];
        System.arraycopy(ownFifoQueue, 0, temp, 0, ownFifoQueue.length);
        temp[ownFifoQueue.length] = element;
        ownFifoQueue = temp;
        return true;
    }

    @Override
    public Integer remove() {
        int halfSize = ownFifoQueue.length / 2;
        Integer removed = ownFifoQueue[0];
        System.arraycopy(ownFifoQueue, 1, ownFifoQueue, 0, ownFifoQueue.length - 1);

        if (ownFifoQueue[halfSize] == null) {
            Integer[] temp = new Integer[halfSize];
            System.arraycopy(ownFifoQueue, 0, ownFifoQueue, 0, halfSize);
            ownFifoQueue = temp;
        }
        return removed;
    }

    @Override
    public Integer element() {
        return ownFifoQueue[0];
    }
}
