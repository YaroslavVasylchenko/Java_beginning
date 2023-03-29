public class Change {
    public Change() {
    }

    public static void main(String[] args) {
        String s = "---<23>---";
        s = s.replace("---", "");
        //System.out.println(s);

        String resultString = "~~~~" + s + "\"~~~~";
        System.out.println(resultString);
    }
}
