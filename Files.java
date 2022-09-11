import java.io.File;

public class Files{
    public static void main(String[] args){
        File f = null;
        boolean bool = false;
        try{
            // Creating new file
            f = new File("TestFile.txt");
            bool = f.createNewFile();
            System.out.println("File Created : " + bool);

            // Reading in new file
            FileInputStream fin = new FileInputStream("TestFile.txt");
            int i;
            while((i=fin.read())!= -1){
                System.out.println((char)i);
            }
            fin.close();
                System.out.println("Reading Complete");

        } catch(Exception e){
            System.out.println(e);
        }
    }
}