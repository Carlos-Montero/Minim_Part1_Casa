package edu.upc.dsa;

/**
 * Created by Carlos on 21/04/2017.
 */
public class Etakemon {
    private String name;
    private int level;


    public Etakemon(String name, int level) {
        this.name = name;
        this.level = level;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
