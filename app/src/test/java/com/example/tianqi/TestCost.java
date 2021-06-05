package com.example.tianqi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import business.CalculateCost;
import object.Topping;

import static org.junit.Assert.assertEquals;

public class TestCost{
//        @Test
//        public void addition_isCorrect() {
//            Topping temp = new Topping("name1");
//            Topping temp1 = new Topping("name11");
//            List<Topping> list = new ArrayList<>();
//            list.add(0, temp);
//            System.out.println(list.get(0).getToppingName());
//            assertEquals(list.get(0).getToppingName(), "name1");
//        }
//        @Test
//        public void testOnePizzaSize(){
//            List<Topping> toppings = new ArrayList<>();
//            Topping temp = new Topping("name1");
//            toppings.add(temp);
//            String size = "large";
//          //  assertEquals("10", CalculateCost(toppings,size));
//        }
    @Test
    public void test(){
        Topping temp = new Topping("a",1);
        Topping temp1 = new Topping("a",2);
        Topping temp3 = new Topping("ab",22);
        Topping temp2 = new Topping("a",1);
        ArrayList<Topping> tt = new ArrayList<>();
        tt.add(temp);
        tt.add(temp1);
        int a = tt.indexOf(temp2);
        System.out.println(a);
       //assert (temp.equals(temp1));
    }


}
