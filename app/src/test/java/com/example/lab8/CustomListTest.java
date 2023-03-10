package com.example.lab8;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for cityList
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     * one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Red Deer", "AB"));
        assertEquals(list.getCount(), listSize + 1);
    }

    //Implement has city, delete city, and count cities

    /**
     * Test if the list has a specific city
     */
    @Test
    public void hasCityTest(){
        list = MockCityList();
        City checkCity = new City("Red Deer", "AB");
        list.addCity(checkCity);
        assertTrue(list.hasCity(checkCity));
    }

//    @Test
//    public void deleteCityTest(){
//         list = MockCityList();
//            list.addCity(new City("Red Deer", "AB"));
//    }
//
//    @Test
//    public void countCitiesTest(){
//         list = MockCityList();
//    }
}
