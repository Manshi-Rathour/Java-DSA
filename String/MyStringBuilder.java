package String;

public class MyStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");

        // get char
        System.out.println(sb.charAt(0));

        // set char
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // insert char
        sb.insert(2, 'n');
        System.out.println(sb);

        // delete char
        sb.delete(2, 3);
        System.out.println(sb);

        // append char
        sb.append(" Stark");
        System.out.println(sb);
    }
}
