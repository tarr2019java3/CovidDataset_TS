package pl.sda.coviddataset;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
//Sno,Date,Province/State,Country,Last Update,Confirmed,Deaths,Recovered

public class FileUtils {
    private Path path;

    public void openFile(String filename) throws IOException {
        path = Paths.get(filename);
        try {
            List<String> lines = Files.readAllLines(path);
            List<Record> records = new ArrayList<>();
            lines.remove(0);
            for(String line: lines){
                String[] columns = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                Record record = new Record();
                record.setSno(Integer.parseInt(columns[0]));
                record.setData(columns[1]);
                record.setProvince(columns[2]);
                record.setCountry(columns[3]);
                record.setLatUpdate(columns[4]);
                record.setConfirmed(Double.parseDouble(columns[5]));
                record.setDeaths(Double.parseDouble(columns[6]));
                record.setRecovered(Double.parseDouble(columns[7]));
                records.add(record);
            }
           // System.out.println(records);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
