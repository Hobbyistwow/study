public class String0ps {
    public static void main(String[] args) {
        String[] strings = {"SWEN20003", "Java", "is fun!", "is", "is taught using"};

        String str = strings[0];
        str.replace("0", "");
        str += str.replace("Z", "");
        strings[0] = str.substring(0, 4) + strings[3];
        str = String.format("%s%s", strings[1], strings[2].replace("!", "!!"));
        System.out.println(str);
    }
}