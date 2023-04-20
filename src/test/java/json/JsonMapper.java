package json;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class JsonMapper {


    @Test
    public void jsonMapping() throws IOException {

        String file = "src/test/java/json/jsonFile1.json";
        String filYaml = "src/test/java/json/jsonFile1.yaml";

        ObjectMapper mapper = new ObjectMapper();
        //new YAMLFactory() tanıması için buradaki ObjectMapper ı import ederken dikkat et cocumber ın degilde jackson ınkini alırız

        Pojo pojo = mapper.readValue(new File(file), Pojo.class);

        System.out.println(pojo);
        pojo.setName("My Application");
        pojo.setUrl("https://yahoo.com");
        pojo.getProperties().setVisible("true");

        mapper.writeValue(new File(file), pojo);  //pojo.class ı degilde gönderdiğimiz(üstteki yazdıklarımız) nesneleri yazdır dedik

        ObjectMapper mapperYaml = new ObjectMapper(new YAMLFactory());
        mapperYaml.writeValue(new File(filYaml), pojo);

    }

}
