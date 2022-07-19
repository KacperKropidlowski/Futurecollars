package task2;

public class OwnFifoQueue implements OwnQueue {
    Integer[] ownFifoQueue = new Integer[2];

    @Override
    public boolean add(Integer e) {
        for (int i = 0; i < ownFifoQueue.length; i++) {
            if (ownFifoQueue[i] == null) {
                ownFifoQueue[i] = e;
                return true;
            }
        }
        Integer[] temp = new Integer[ownFifoQueue.length * 2];
        System.arraycopy(ownFifoQueue, 0, temp, 0, ownFifoQueue.length);
        temp[ownFifoQueue.length] = e;
        ownFifoQueue = temp;
        return true;
    }

    @Override
    public Integer remove() {
        Integer removed = ownFifoQueue[0];
        System.arraycopy(ownFifoQueue, 1, ownFifoQueue, 0, ownFifoQueue.length - 1);
        return removed;
    }

    @Override
    public Integer element() {
        return ownFifoQueue[0];
    }
}
