package com.example.tianqi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import business.CalculateCost;
import object.Topping;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        Topping temp = new Topping("name1", 1.1);
        Topping temp1 = new Topping("name11", 2.1);
        List<Topping> list = new ArrayList<>();
        list.add(0, temp);
        System.out.println(list.get(0).getToppingName());
        assertEquals(list.get(0).getToppingName(), "name1");
    }

    @Test
    public void test1(){
        //no topping
        CalculateCost.cost(null,"large");
        CalculateCost.cost(null,"extraLarge");
        CalculateCost.cost(null,"medium");
        CalculateCost.cost(null,"small");
    }
    @Test
    public void test2(){
        Topping temp = new Topping("T1", 1.1);
        Topping temp1 = new Topping("T2", 2.1);
        Topping temp2 = new Topping("T3", 2.1);
        Topping temp3 = new Topping("T4", 2.1);
        Topping temp4 = new Topping("T", 2.1);
        List<Topping> list = new ArrayList<>();
        list.add(temp);
        list.add(temp1);
        list.add(temp2);
        list.add(temp3);
        list.add(null);
        //System.out.println(CalculateCost.cost(list,"large"));
    }

    @Test
    public void test4(){
        Topping temp = new Topping("T1",2);
        List<Topping> list = new ArrayList<>();
        list.add(temp);
        CalculateCost.cost(list,"large");
    }

}




