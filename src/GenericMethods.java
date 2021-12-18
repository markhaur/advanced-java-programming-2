import java.util.ArrayList;
import java.util.List;

public class GenericMethods {

    static Character[] charArray = {'1', '2', '3', '4', '5'};
    static Boolean[] boolArray = {true, false, true};
    static Integer[] intArray = {1, 2, 3, 4, 5};

    /**
     * map array of objects to list of objects
     * This approach is not good for Generics in java as
     * it do not provide type safety.
     * @param array
     * @param list
     * @return list of objects
     */
    public static List mapArrayToList(Object[] array, List<Object> list){
        for (Object a: array){
            list.add(a);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Character> characterList = mapArrayToList(charArray, new ArrayList<>());
        List<Boolean> boolList = mapArrayToList(boolArray, new ArrayList<>());

        /**
         * I am not getting any compile time errors although I am trying to copy
         * an integer array to string array. It is because of Object class. It is
         * not providing us with Type Safety.
         */
        List<String> stringList = mapArrayToList(intArray, new ArrayList<>());

        /**
         * The below line of code will not give any compile time error. But if we run, it
         * will throw ClassCastException.
         */
        System.out.println(stringList.get(0));
    }
}
