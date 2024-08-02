import java.util.Scanner;
import java.io.File;

public class hwthree {

    public static String problemone(String first, String second) {
        String ret = "";
        for (int i = 0; i < first.length(); i++) {
            for (int j = 0; j < second.length(); j++) {
                if (!ret.contains(first.charAt(i) + "" + second.charAt(j))) {
                    ret += first.charAt(i) + "" + second.charAt(j) + ",";
                }
            }
        }
        return ret.substring(0, ret.length() - 1);
    }

    public static void oneNamePerLine(String names) {
        Scanner console = new Scanner(names);
        while (console.hasNext()) {
            String temp = console.next();
            if (!temp.contains(","))
                System.out.println(temp);
            else
                System.out.println(temp.substring(0, temp.length() - 1));
        }
    }

    public static int sumFile(String fileName) {
        File file = new File(fileName);
        int sum = 0;
        try {
            Scanner console = new Scanner(file);
            while (console.hasNext()) {
                sum += Integer.valueOf(console.next());
            }
        } catch (Exception e) {
            return 0;
        }

        return sum;
    }

    public static void main(String[] args) {
        // System.out.println(problemone("ACDC", "ABBA"));
        // oneNamePerLine("TOM, MARGARET, DAVE, KELLY, MARY, AMY, MARK, DILSON");

        System.out.println(sumFile("filename.txt"));
    }
}
