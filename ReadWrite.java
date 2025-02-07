import java.io.*;

public class ReadWrite {
    public static void main(String args[]) {
        try (BufferedReader r = new BufferedReader(new InputStreamReader(System.in));//reading
             FileWriter w = new FileWriter("output.txt", true);  // Append mode (true)
             BufferedWriter bw = new BufferedWriter(w)) {

            System.out.println("Enter input (type 'exit' to stop):");
            String str;

            do {
                str = r.readLine();
                if (!str.equalsIgnoreCase("exit")) { // Avoid writing "exit" to file
                    bw.write(str);
                    bw.newLine(); // Add a newline for formatting
                }
            } while (!str.equalsIgnoreCase("exit"));

            System.out.println("Data written to 'output.txt' successfully!");

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
