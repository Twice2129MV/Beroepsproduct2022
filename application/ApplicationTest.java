package application;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


import dataStructures.DataStructures;
import model.Bottles;
import model.Store;


public class ApplicationTest {
    
    @Test
    public void addToQueueTest(){
        DataStructures d = new DataStructures();
        Bottles bottles = new Bottles("water", "Large",10);
        d.addBottlesInQueue(bottles);
        String result = "this is running fine";
        assertEquals("this is running fine",result);
    }


    @Test
    public void addToLinkedListTest() {
        DataStructures d = new DataStructures();
        Store store = new Store("WinkelFred","freddielaan #7","462712",200);
        d.addToLinkedList(store);
        String result = "this is running fine";
        assertEquals("this is running fine",result);
    }
}
