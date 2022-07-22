package task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class OwnGenericListTest {

    @Test
    void shouldAdd() {
        //given
        OwnGenericList ownGenericList = new OwnGenericList();
        String object = "Object";
        //when
        boolean result = ownGenericList.add(object);
        //then
        Assertions.assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void shouldGet() {
        //given
        OwnGenericList ownGenericList = new OwnGenericList();
        ownGenericList.add(5);
        //when
        Object result = ownGenericList.get(0);
        //then
        Assertions.assertEquals(5,result);
    }

    @org.junit.jupiter.api.Test
    void shouldRemove() {
        //given
        OwnGenericList ownGenericList = new OwnGenericList();
        ownGenericList.add('R');
        //when
        boolean result = ownGenericList.remove('R');
        //then
        Assertions.assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void shouldGetSize() {
        //given
        OwnGenericList ownGenericList = new OwnGenericList();
        //when
        int result = ownGenericList.size();
        //then
        Assertions.assertEquals(10,result);
    }
}