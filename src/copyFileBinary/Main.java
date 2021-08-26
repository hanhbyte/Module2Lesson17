package copyFileBinary;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            readFile();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(sizeFile());
    }

    public static void readFile() throws IOException{
        ArrayList<Byte> list = new ArrayList<>();
        InputStream inputStream = new FileInputStream("sourcefile.txt");
        OutputStream outputStream = new FileOutputStream("output.txt");
        byte[] buffer = new byte[1024];
        int length = -1;
        while ((length = inputStream.read()) > 0)
            outputStream.write(length);
        outputStream.close();
        inputStream.close();
    }

    public static long sizeFile(){
        File file = new File("output.txt");
        return file.length();
    }
}
