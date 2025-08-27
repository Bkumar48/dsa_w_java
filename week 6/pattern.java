
public class pattern {

    public static void main(String args[]) {
        for (int i = 4; i >= 1; i--) {
            String str = "";
            for (int j = i; j >= 1; j--) {
                str += "*" + " ";
            }
            System.out.println(str);
        }
    }
}
