package stepdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class MyStepdefs {
    @Given("simple step")
    public void simpleStep() {
    }

    @When("step with text parameter as {string}")
    public void stepWithTextParameterAs(String arg0) {
    }

    @Then("step with number parameter as {int}")
    public void stepWithNumberParameterAs(int arg0) {
    }

    @And("step{int} with integers-2")
    public void stepWithIntegers(int arg0) {
    }


    @Given("kullanici {string} günü {int} saat calisir")
    public void stepExtra(String arg0, int arg1) {
    }

    @And("kullanici {double} oraninda is yapar")
    public void kullaniciOranindaIsYapar(double num) {
    }



    @Given("data table as list")
    public void dataTableAsList(DataTable table) {
        List<String> list1 = table.asList();
        list1.forEach(n-> System.out.println(n));
        System.out.println("-----------");

        List<Integer> list = table.asList(Integer.class);
        list.forEach(n-> System.out.println(n));
        System.out.println("-----------------");

        for (Integer n : list){

        }
    }




    @Given("data table as map")
    public void dataTableAsMap(DataTable table) {
        Map<String, String> map =  table.asMap();
        //Map<String, Integer> map1 =  table.asMap(String.class, Integer.class);

        map.forEach((k,v)->{
            System.out.println(k + " : " + v);
        });

        System.out.println(map.get("key2"));
        String name = "ali";
    }

    @Given("data table list of lists")
    public void dataTableListOfLists(DataTable table) {
        List<List<String>> lists = table.asLists(String.class);
        // her satir bir list olur

        for (List<String> list : lists) {
            for (String s :list){
                System.out.print(s + " - ");
            }
            System.out.println();
        }

        lists.forEach( l -> {
            l.forEach(n -> {
                System.out.print(n + " : ");
            });
            System.out.println();
        });

    }

    @Given("data table list of maps")
    public void dataTableListOfMaps(DataTable table) {
        List<Map<String, Integer>> maps = table.asMaps(String.class, Integer.class);

        maps.forEach(map -> {
            System.out.println(map.get("key1"));
            System.out.println(map.get("key2"));
            System.out.println(map.get("key3"));
            System.out.println("-----");
        });

        maps.forEach(map -> {
            map.forEach((k,v) -> {
                System.out.print(k + " : " + v + "  - ");
            });
            System.out.println();
        });
    }

    @Given("the user whose name {string} is {int} years old")
    public void theUserWhoseNameIsAgeYearsOld(String name, int age) {
        System.out.println(name + " is " + age + " years old");
    }

    @When("knowledge about user")
    public void knowledgeAboutUser(DataTable table) {
        Map<String, String> map = table.asMap();
        System.out.println(map.get("name") + " is " + map.get("age") + " years old");
    }



    @When("loop count is {int}")
    public void loopCountIsFor(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
