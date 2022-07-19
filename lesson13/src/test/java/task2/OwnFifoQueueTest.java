package task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OwnFifoQueueTest {

    @Test
    void shouldAdd() {
        //given
        OwnFifoQueue ownFifoQueue = new OwnFifoQueue();
        //when
        boolean result = ownFifoQueue.add(5);
        //then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldRemove() {
        //given
        OwnFifoQueue ownFifoQueue = new OwnFifoQueue();
        ownFifoQueue.add(1);
        ownFifoQueue.add(2);
        ownFifoQueue.add(3);
        ownFifoQueue.add(4);
        ownFifoQueue.add(5);
        //when
        Integer result = ownFifoQueue.remove();
        //then
        Assertions.assertEquals(1,result);
    }

    @Test
    void shouldReturnFirstElement() {
        //given
        OwnFifoQueue ownFifoQueue = new OwnFifoQueue();
        ownFifoQueue.add(1);
        ownFifoQueue.add(2);
        ownFifoQueue.add(3);
        ownFifoQueue.add(4);
        ownFifoQueue.add(5);
        //when
        Integer result = ownFifoQueue.element();
        //then
        Assertions.assertEquals(1,result);
    }
}