import java.util.ArrayList;
import java.util.List;

public class GenericMethods {

    static Character[] charArray = {'1', '2', '3', '4', '5'};
    static Boolean[] boolArray = {true, false, true};
    static Integer[] intArray = {1, 2, 3, 4, 5};

    /**
     * Code is refactored using Generics which provides type safety.
     * We have used T to represent Generic which has a local scope
     * to method.
     * @param array
     * @param list
     * @return list of objects
     */
    public static <T> List<T> mapArrayToList(T[] array, List<T> list){
        for (T a: array){
            list.add(a);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Character> characterList = mapArrayToList(charArray, new ArrayList<>());
        List<Boolean> boolList = mapArrayToList(boolArray, new ArrayList<>());

        /**
         * As Java Generics promise type safety, tht is why the below line of code is
         * giving a compile time error.
         * Using this approach, we can still keep the method flexible but can discover
         * errors much earlier.
         */
        List<String> stringList = mapArrayToList(intArray, new ArrayList<>());
    }
}
