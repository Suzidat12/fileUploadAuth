package fordsoft.task.auth.component;

import com.opencsv.CSVWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ReadToCsv {
    public static void main(String[] args) throws IOException {

        String[] items1 = {"book", "coin", "pencil"};
        String[] items2 = {"pen", "chair", "lamp"};
        String[] items3 = {"ball", "bowl", "spectacles"};

        List<String[]> entries = new ArrayList<>();
        entries.add(items1);
        entries.add(items2);
        entries.add(items3);

        String fileName = "C:\\Users\\OLASUNKANMI\\Desktop\\items.csv";

        try (var fos = new FileOutputStream(fileName);
             var osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
             var writer = new CSVWriter(osw)) {

            writer.writeAll(entries);
        }
    }
}
