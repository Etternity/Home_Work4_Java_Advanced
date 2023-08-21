package Task2.com.example;
import java.io.*;

public class Deshifrator {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("input.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter("output.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String replacedLine = line.replaceAll("\\b[А-Яа-яЁё]{1,3}\\b", "Java");
                bufferedWriter.write(replacedLine);
                bufferedWriter.newLine();
            }

            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("Дешифрація завершена. Прийменники замінено на Java.");
        } catch (IOException e) {
            System.out.println("Помилка в обробці файлів: " + e.getMessage());
        }
    }
}
