package ru.akalavan.spring;


/**
 * @author V. Mihail
 */
public class TestBean {

    private String name;

    public TestBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
