package model;

import java.io.Serializable;

/**
 * EX1: World's most intricate HelloWorld program!
 * @author rfoy
 */
public class HelloWorld implements Serializable {
    private static final String DEFAULT_NAME = "World";

    private String name;

    /**
     * No-arg constructor; sets name to DEFAULT_NAME;
     */
    public HelloWorld(){
        name = DEFAULT_NAME;
    }
    
    /**
     * Sets the name for this HelloWorld instance
     * @param name personalized name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the name set for this HelloWorld instance
     * @return name set for instance
     */
    public String getName() {
        return name;
    }

    /**
     * Returns personalized greeting. Will use name "World" if name is set to null
     * @return personalized greeting
     */
    public String getGreeting() {
        return String.format("Hello, %s!",
                (name == null) ?  DEFAULT_NAME : name);
    }
}
