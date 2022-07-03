package kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ZywOoTest {

    @Test
    void shouldWarnTheSheep2Successfully_Test() {
//        given
        String[] array = new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"};
//        when
        String speech = ZywOo.warnTheSheep(array);
//        then
        assertEquals("Oi! Sheep number 2! You are about to be eaten by a wolf!", speech);
    }

    @Test
    void shouldFendOffTheWolfSuccessfully_Test() {
//        given
        String[] array = new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf"};
//        when
        String speech = ZywOo.warnTheSheep(array);
//        then
        assertEquals("Pls go away and stop eating my sheep", speech);
    }
}