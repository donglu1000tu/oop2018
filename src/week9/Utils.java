package week9;



import java.io.*;

public class Utils {

    public static String readContentFromFile(String path) throws IOException {

        FileReader fr = new FileReader(path);
        BufferedReader bf = new BufferedReader(fr);
        int s ;
        String str = "" ;
        while ((s=bf.read()) != -1) {
            str += (char)s;
        }
        bf.close();
        return str;
    }

    public static void writeContentToFile(String path) throws IOException {

        FileWriter fw = new FileWriter(path, true); // ghi de thi xoa true
        BufferedWriter bw = new BufferedWriter(fw);
        String s = "test case ";
        bw.write(s);
        //bw.flush();
        bw.close();

    }

    public static File findFileByName(String folderPath, String fileName) {
        String source = folderPath + "\\" + fileName ;
        File file = new File(source) ;
        if(file.exists()) return file ;
        return null ;
    }

    public static void main(String[] args) {
        String folder = "D:\\GITHub\\oop2018\\src\\week9" ;
        String file   = "D:\\GITHub\\oop2018\\src\\week9\\file.txt" ;
        try {
            //writeContentToFile(file);
            System.out.println(readContentFromFile(file));
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        File fileByName = findFileByName(folder, "le.txt");
        if(fileByName==null) System.out.println("File not exist");
        else System.out.println(fileByName.getAbsolutePath());
    }
}


