package util;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReadandWriteMethod {

    public static <T> List<T> readCSV(String filePath) {
        List<T> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add((T) Arrays.asList(values));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return records;
    }

    public static <T> void writeCSVWithoutOverwriting(String filePath, List<T> records) throws IOException {
        // TODO Convert the data to a CSV formatted string
        String csvData = records.stream()
                .map(record -> String.join((CharSequence) ",", (CharSequence) record))
                .collect(Collectors.joining("\n"));

        // TODO Append the CSV data to the file
        Files.writeString(Paths.get(filePath), csvData, StandardOpenOption.APPEND);
    }



}


