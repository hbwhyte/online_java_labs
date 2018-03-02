package input_output.labs;

/**
 * Input/Output Exercise 1: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      BONUS: If you are feeling bold, read back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

import java.io.*;

class EncryptedStream {
    public static void main(String[] args) {

        // Declare Streams
        BufferedReader in = null;
        BufferedWriter out = null;

        // Initialize with try
        try {

            int c;
            in = new BufferedReader(new FileReader("/Users/hbwhyte/CodingNomads/online_java_labs/src/input_output/lab_files/sampleFile.txt"));
            out = new BufferedWriter(new FileWriter("/Users/hbwhyte/CodingNomads/online_java_labs/src/input_output/lab_files/sampleFileEncrypted.txt"));

            // While loop - change a to - and e to ~
            while ((c = in.read()) != -1) {
                if (c == 'a') {
                    out.write('-');
                } else if (c == 'e') {
                    out.write('~');
                } else {
                    out.write(c);
                }
            }

            // Catch exceptions
        } catch (IOException e) {
            System.out.println("IO Exception caught");

            // Close file connections
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException ioe) {
                System.out.println("IOException caught - No connections to close.");
            }
        }
    }

}
