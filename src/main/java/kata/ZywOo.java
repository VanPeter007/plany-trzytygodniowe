package kata;

import java.util.Arrays;
import java.util.List;

public class ZywOo {
    private static final String WARN_SHEEP = "Oi! Sheep number %s! You are about to be eaten by a wolf!";
    private static final String FEND_OFF_WOLF = "Pls go away and stop eating my sheep";

    public static String warnTheSheep(String[] array){
        int wolfPosition = getWolfPosition(array);
        int sheepBeforeWolfPosition = wolfPosition - 1;
        final boolean isThereSheepBeforeWolf = sheepBeforeWolfPosition > 0;
        if (isThereSheepBeforeWolf) {
            return String.format(WARN_SHEEP, sheepBeforeWolfPosition);
        }
        return FEND_OFF_WOLF;
    }

    private static int getWolfPosition(String[] array) {
        List<String> listWithWolf = Arrays.asList(array);
        int wolfIndex = listWithWolf.indexOf("wolf");
        int arraySize = array.length;
        return arraySize - wolfIndex;
    }
}
