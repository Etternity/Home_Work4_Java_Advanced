package Task2.com.example;
import java.io.*;

    public class Main {
        public static void main(String[] args) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
                 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"))) {

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String replacedLine = line.replaceAll("\\b[А-Яа-яЁё]{1,3}\\b", "Java");
                    bufferedWriter.write(replacedLine);
                    bufferedWriter.newLine();
                    System.out.println(replacedLine);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
