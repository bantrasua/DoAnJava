package util;

import java.util.List;
import java.util.Random;

public class util {
    private static Random generator = new Random();

    public static int randomIdPet() {
        return generator.nextInt(899) + 101;
    }

    public static int randomIdUser() {
        return generator.nextInt(98) + 1;
    }

    public static <E> void showListWithOrder(List<E> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ". " + list.get(i));
        }
    }
    
    public static <E> E choiceOrder(List<E> list, int order) {
        return list.get(order - 1);
    }
}
