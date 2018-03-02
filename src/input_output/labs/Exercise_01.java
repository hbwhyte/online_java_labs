package input_output.labs;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a file byte by byte and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */


import java.io.*;

class BufferStream {

    public static void main(String[] args) {

        // Declare Input/Output Streams
        BufferedInputStream bin = null;
        BufferedOutputStream bout = null;

//        // Make sure both files are specified
//        if (args.length != 2) {
//            System.out.println("Usage: CopyFile from to");
//            return;
//        }

        try {
            // Initialize
            int b;
            bin = new BufferedInputStream(new FileInputStream("/Users/hbwhyte/CodingNomads/online_java_labs/src/input_output/lab_files/sampleFile.txt"));
            bout = new BufferedOutputStream(new FileOutputStream("/Users/hbwhyte/CodingNomads/online_java_labs/src/input_output/lab_files/sampleFile2.txt"));

            // While loop
            while ((b = bin.read()) != -1) {
                bout.write(b);
            }

            // Catch exceptions
        } catch (IOException e) {
            System.out.println("IO Exception caught");

            // Close file connections
        } finally {
            try {
                if (bin != null) {
                    bin.close();
                }
                if (bout != null) {
                    bout.close();
                }
            } catch (IOException ioe) {
                System.out.println("IOException caught - No connections to close.");
            }
        }
    }
}