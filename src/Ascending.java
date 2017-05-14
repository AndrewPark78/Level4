import java.util.ArrayList;
public class Ascending {
    static ArrayList<Integer> list = new ArrayList<Integer>();

    public static void main(String[] arg) {
        list.add(2);
        list.add(23);
        list.add(2);
        list.add(1);
        list.add(253);
        list.add(5);
        list.add(2);
        list.add(3);

        System.out.print(ascendingChecker(list));
    }

    public static int ascendingChecker(ArrayList<Integer> list) {
        int output = 0;
        int counter = 1;
        int start = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
              //  counter++;
            }
            if (i > 0) {
                if (list.get(i) > list.get(i -1)) {
                    counter++;
                } else {
                    if (counter > output) {
                        output = counter;
                    }
                    counter = 1;
                }
            }
            }
            return output;

    }
}