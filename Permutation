import java.util.*;

class Permutation
{

    public static void permutation(String str, ArrayList<String> arr) {
        permutation(str, "", arr);
    }

    public static void permutation(String str, String prefix, ArrayList<String> perms) {
        if (str.length() == 0) {
            System.out.println(prefix);
            perms.add(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                //System.out.println(i);
                String rem = "str.substring(0, i)" + str.substring(i + 1);
                permutation(rem, prefix + str.charAt(i), perms);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> perms = new ArrayList<>();
        permutation(in.next(), perms);
        System.out.println("The number of permutations is " + perms.size());
    }

}
