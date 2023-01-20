import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Utility {
    public static List<String[]> read(String file){
        String dataRow;
        List<String[]> data = new LinkedList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while((dataRow = br.readLine())!=null){
                String[] dataRecord = dataRow.split(",");
                data.add(dataRecord);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!!");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Couldn't read file ");
            throw new RuntimeException(e);
        }
        return data;
    }
}
