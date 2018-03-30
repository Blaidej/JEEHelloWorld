/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.HelloWorld;

/**
 *
 * @author rfoy
 */
public class HelloWorldTester {

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        hw.setName("Wilma");
        System.out.println(hw.getGreeting());

        hw.setName(null);
        System.out.println(hw.getGreeting());
    }

}
