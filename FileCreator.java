import java.io.*;

/**
 * @author Dr. Gothard
 * 3/1/2021
 * Demonstration of binary file creation
 */
class FileCreator {
  
    /**
     * Creates an example file with binary data.
     * @param args ignored
     * @throws IOException will terminate if there are any file errors
     */   
    public static void main (String []args) throws IOException {

        final String FILE_NAME = "file.bin";
        FileOutputStream outputFile = new FileOutputStream(FILE_NAME);

        outputFile.write(72);
        outputFile.write(101);
        outputFile.write(108);
        outputFile.write('l');
        outputFile.write(111);
        outputFile.write(" world! ".getBytes());
        
        byte []bytes = new byte[3];
        bytes[0] = ':';
        bytes[1] = 41;
        bytes[2] = '\n';
        outputFile.write(bytes);
        outputFile.close();
        System.out.println ("File written to " + FILE_NAME);
    }
}
