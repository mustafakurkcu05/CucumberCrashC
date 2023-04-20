package writer;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src/test/resources/features/DataTable10.feature");
        fw.write("Feature: My" + "\n");
        fw.write("Scenario: Sc" + "\n");
        fw.write("Given: My" + "\n");
        fw.write("||" + "\n");
        fw.write("When: My" + "\n");
        fw.write("Then: My");

        fw.close();
    }
}
