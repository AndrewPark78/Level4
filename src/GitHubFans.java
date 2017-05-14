import java.lang.reflect.Array;

/**
 * Created by league on 5/14/17.
 */
public class GitHubFans {
    public static void main(String[] arg) {
        int storage = 0;
        String[] names = {"yuz217", "Ianleeeee", "googolplex8", "andrewpark78"};
        for (int s = 0; s < names.length-1; s++) {
            for (int i = 0; i < names.length-1; i++) {
                //if (i != 3) {
                    storage = names[s].compareTo(names[s + 1]);
                //}
                if(storage < 0){

                }
            }
        }
        for (int x = 0; x < names.length; x++) {
            System.out.println(names[x]);
        }
    }
}