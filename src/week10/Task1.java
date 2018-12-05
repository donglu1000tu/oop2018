package week10;


import java.util.ArrayList;
import java.util.List;

import java.io.*;


public class Task1 {
    public static final File path = new File("D:\\GITHub\\oop\\src\\week9\\Utils.java");

    public static List<String> getAllFunctions(File path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        List<String> s = new ArrayList<String>();
        String c;
        String sb = "public static ";
        while ((c = br.readLine()) != null) {
            if (c.contains(sb)) {
                String tmp = "";
                for (String ignored : c.split("\\s")) {
                    if (ignored.contains("(") ||
                        ignored.contains(")") ||
                        ignored.contains(","))
                        tmp += ignored;
                }
                s.add(tmp);
            }
        }
        return s;
    }

    public static String findFunctionByName(String name) throws IOException {

        ArrayList<String> str = (ArrayList<String>) getAllFunctions(path);

        for (String s : str) {
            if (s.contains(name)) return s;
        }
        return "This Function doesn't exist in my Utils";
    }

    public static void main(String[] args) {
        String methodname = "fck";
        String methodname1 = "find" ;
        try {
            System.out.println(getAllFunctions(path).toString());
            System.out.println(findFunctionByName(methodname));
            System.out.println(findFunctionByName(methodname1));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
