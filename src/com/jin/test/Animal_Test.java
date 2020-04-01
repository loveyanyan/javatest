package com.jin.test;

/**
 * @author yj
 * @version 1.0
 * @ClassName: Animal
 * @description: 方法重写测试
 * @date 2019/1/21 16:21
 */
public class Animal_Test {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        c.dajia();

    }
}

/**
 * @param null
 * @author yj
 * @description TODO
 * @date 2019/1/21 16:23
 * @return
 */
class Animal {
    public void eat() {
        System.out.println("吃东西！");
    }

    public void dajia() {
        System.out.println("打架很厉害");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        super.eat();
        System.out.println("小猫吃鱼");
    }

}