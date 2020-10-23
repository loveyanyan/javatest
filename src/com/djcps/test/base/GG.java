package com.djcps.test.base;

/**
 * TestProject
 *
 * @Author YJ
 * @Date 2020/8/6 0:46
 * Description:
 */
public class GG {
    /**
     * @param args
     */
    public static void main(String[] args) {

        /*Statuent statuent = new Statuent();
        Statuent statuent1 = new Statuent("safd");
        System.out.println(statuent.getName());
        System.out.println(statuent.getAge());*/
        dog dog = new dog();
        System.out.println(dog.getName());
        System.out.println(dog.getHight());
        boolean equals = dog.getName().equals("");
        System.out.println(equals);
    }
}

class dog {

    private String name = "";
    private int hight;

    public dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }
}

class Statuent {


    private String name = "";
    private int age = 2;

    {
        System.out.println("我只是一个代码块");
    }

    public Statuent() {
        System.out.println("我是无参构造");
    }

    public Statuent(String name) {
        System.out.println("我是有参 name");
        this.name = name;
    }

    public Statuent(int age) {
        System.out.println("我是有参 age");
        this.age = age;
    }

    public Statuent(String name, int age) {
        System.out.println("我是有参素有");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
