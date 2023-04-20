package json;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

// pojo: en basit java objelerin lerın kullanımıdır
// pojo cevirmede online siteden destek alır

@Getter
@Setter
@ToString
public class Pojo {

    // POJO : Plain Old Java Objects
    // fields ve getter, setter, toString lardan olusur
    //puplic leri private yaparız korumak için
    private String name;
    private String url;
    private Properties properties;
    private ArrayList<Integer> numbers;   //int olamaz


}
@Getter
@Setter
@ToString
class Properties {
    private String visible;
    private String clickable;
    private String action;
}






