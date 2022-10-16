import java.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadCountryFile {


    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            String line;
            String PATH_FILE = "D:\\MD-2\\Bai-16\\Bai Tap\\BaiTap2\\src\\countryFile.txt";
            br = new BufferedReader(new FileReader(PATH_FILE));

            while ((line = br.readLine()) != null) {
                printCountry(parseCsvLine(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    private static void printCountry(List<String> country) {
        System.out.println(
                "Country [id= "
                        + country.get(0)
                        + ", code= " + country.get(1)
                        + " , name=" + country.get(2)
                        + "]");
    }


}