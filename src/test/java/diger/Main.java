package diger;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,40,5,6));
        list.forEach(i -> {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        });

        System.out.println("-----------------------------------------------");
        Map<String, String> ogrenci1 = new HashMap<>();
        ogrenci1.put("name", "ali");
        ogrenci1.put("okul", "A");


        Map<String, String> ogrenci2 = new HashMap<>();
        ogrenci2.put("name", "ali");
        ogrenci2.put("sinif", "3A");

        List<Map<String, String>> ogrenciler = new ArrayList<>();
        ogrenciler.add(ogrenci1);
        ogrenciler.add(ogrenci2);


        ogrenciler.forEach( ogrenci -> {
            System.out.println(ogrenci.getOrDefault("name", "isim yok"));
            System.out.println(ogrenci.getOrDefault("sinif", "sinif kaydi yok"));
            System.out.println(ogrenci.getOrDefault("okul", "okul kaydi yok"));
        });






    }
}




/*
        adi     soyadi      yas     memleketi   dTarihi
        A       AA          12
        B       BB          32      Istanbul     1.1.89

        Map<String, String> per1 = new HashMap<>();
        per1.put("adi", "A);
        per1.put("soyadi", "AA");


        Map<String, String> per2 = new HashMap<>();
        per2.put("adi", "B);
        per2.put("soyadi", "BB");
        per2.put("yas", "32");
        per2.put("memleketi", "Istanbul");


        per2.get("yas")



 */
