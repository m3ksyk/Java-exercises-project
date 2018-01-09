import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

// NIO read write exercises


public class Main {

    public static void main(String[] args) {

        // NIO binary read write exercise

        try(FileOutputStream binFile = new FileOutputStream("data.dat");
            FileChannel binChannel = binFile.getChannel()){

            byte[] outputBytes = "Hello World!".getBytes();
            ByteBuffer buffer = ByteBuffer.wrap(outputBytes);
            int numBytes = binChannel.write(buffer);
            System.out.println("numBytes written: " + numBytes);

            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
            intBuffer.putInt(245);
            intBuffer.flip(); //flip resets the buffer
            numBytes = binChannel.write(intBuffer);
            System.out.println("Numbytes written: " + numBytes);

            intBuffer.flip();
            intBuffer.putInt(-98765);
            intBuffer.flip();
            numBytes = binChannel.write(intBuffer);
            System.out.println("Numbytes written: " + numBytes);



            //  // simple javaNIO read/write exercise

            //          try{
 //         //  FileInputStream file = new FileInputStream("data.txt");
 //        //  FileChannel channel = file.getChannel();
 //         Path dataPath = FileSystems.getDefault().getPath("data.txt");
 //         Files.write(dataPath, "\nLine 5".getBytes("UTF-8"), StandardOpenOption.APPEND);
 //         List<String> lines = Files.readAllLines(dataPath);
 //         for(String  line : lines) {
 //               System.out.println(lines);
 //           }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
