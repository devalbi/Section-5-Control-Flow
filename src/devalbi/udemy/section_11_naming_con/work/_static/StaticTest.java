package devalbi.udemy.section_11_naming_con.work._static;

public class StaticTest {

    private static int numInstance = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstance++;
    }

    public static int getNumInstance() {
        return numInstance;
    }

    public String getName() {
        return name;
    }
}
