package json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class jsonUtils {

    @Test
    public void read() throws ParseException {
        JSONObject json = (JSONObject) JSONValue.parse("{\"name\"\"app2\"}");
        System.out.println(json);

        JSONObject json1 = (JSONObject) new JSONParser().parse("{" +
                "  \"name\" : \"app1\",\n" +
                "  \"url\" : \"https\"\n" +
                "}");
        System.out.println(json1);
    }


    @Test
    public void read2() throws FileNotFoundException {
        String file = "src/test/java/json/jsonFile1.json";
        JSONObject json = (JSONObject) JSONValue.parse(new FileReader(file));
        System.out.println(json);

        String url = json.get("url").toString();
        System.out.println(url);


        JSONObject props = (JSONObject) json.get("properties");
        System.out.println(props.get("action"));


        JSONArray numbers = (JSONArray) json.get("numbers");

        System.out.println(numbers);
        for (Object number : numbers) {
            System.out.println(number);
        }
    }
}
