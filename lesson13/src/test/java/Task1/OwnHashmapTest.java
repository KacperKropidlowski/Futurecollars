package Task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OwnHashmapTest {

    @Test
    void shouldPut() {
        //given
        OwnHashmap ownHashmap = new OwnHashmap();
        //when
        boolean result = ownHashmap.put("key", "value");
        //then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldCheckIfContainsKey() {
        OwnHashmap ownHashmap = new OwnHashmap();
        ownHashmap.put("key", "value");
        //when
        boolean result = ownHashmap.containsKey("key");
        //then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldCheckIfContainsValue() {
        //given
        OwnHashmap ownHashmap = new OwnHashmap();
        ownHashmap.put("key", "value");
        //when
        boolean result = ownHashmap.containsValue("value");
        //then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldRemove() {
        //given
        OwnHashmap ownHashmap = new OwnHashmap();
        ownHashmap.put("key", "value");
        //when
        String result = ownHashmap.remove("key");
        //then
        Assertions.assertEquals("value", result);
    }

    @Test
    void shouldGet() {
        //given
        OwnHashmap ownHashmap = new OwnHashmap();
        ownHashmap.put("key", "value");
        //when
        String result = ownHashmap.get("key");
        //then
        Assertions.assertEquals("value", result);
    }
}