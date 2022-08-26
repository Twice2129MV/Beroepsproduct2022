package dataStructures;

import model.Store;

import java.util.*;

import model.Bottles;

public class DataStructures {

    private static Queue<Bottles> bottlesQueue = new LinkedList<>();

    private LinkedList<Store> storeLinkedList = new LinkedList<>();

    /*
     * queue datastucture methods
     * enqueue
     * dequeue
     * poll
     * peek
     */

    // enqueue

    public void addBottlesInQueue(Bottles bottles) {
        bottlesQueue.add(bottles);
    }

    // size of the queue

    public void sizeOfBottleQueue() {
        System.out.println("Size of queue: " + bottlesQueue.size());
        System.out.println(bottlesQueue);
        if (bottlesQueue.size() == 0) {
            System.out.println("The queue is empty");
        }
    }

    // dequeue
    public void removeBottleFromQueue() {
        bottlesQueue.poll();
    }

    // peek: look at the top without removing the item from the queue
    public void peekBottleQueue() {

        System.out.println(bottlesQueue.peek());
    }
    // empty queue

    public void emptyBottleQueue() {
        bottlesQueue.clear();
        System.out.println(bottlesQueue.size());
        System.out.println("The Queue has been cleared");
    }

    /*
     * LinkedList datastructure methods
     * insert
     * clear
     * size
     * peek
     * getFirst
     * getLast
     */

    // insert

    public void addToLinkedList(Store store) {
        storeLinkedList.add(store);
    }

    public void clearLinkedList() {
        storeLinkedList.clear();
        System.out.println("The List has been cleared");
        System.out.println("items in the list are = " + storeLinkedList.size());
    }

    public void sizeOfLinkedList() {
        System.out.println("Size of the list is: " + storeLinkedList.size());
        System.out.println(storeLinkedList);
    }

    public void peekLinkedList() {
        System.out.println("Store at the top is: " + storeLinkedList.peek());
    }

    public void getFirstInLinkedList() {
        System.out.println("the first store on the list is: " + storeLinkedList.getFirst());
    }

    public void getLastInLinkedList() {
        System.out.println("the store last on the list is: " + storeLinkedList.getLast());
    }

    // sorting algorithme: Using sort()

    public void sortLinkedListBasedOnOrders() {
        Collections.sort(storeLinkedList, new Store.amountOfBottlesOrdered());
        System.out.println("Organize List based on the amount of orders");
        for (Store s : storeLinkedList) {
            System.out.println(s);
        }
    }

    // sorting algorithme: shuffle sort

    public void unsortLinkList() {
        System.out.println("List before the the shuffle: " + storeLinkedList);
        Object[] array = storeLinkedList.toArray();
        // here we are shuffling more than once
        // shuffle 1
        arrayShuffle(array);
        listDataAdder(array, storeLinkedList);
        System.out.println("The list after shuffle 1 : "
                + storeLinkedList.toString());
        System.out.println();

        // shuffle 2
        arrayShuffle(array);
        listDataAdder(array, storeLinkedList);
        System.out.println("The list after shuffle 2 : "
                + storeLinkedList.toString());
        System.out.println();

        // shuffle 3
        arrayShuffle(array);
        listDataAdder(array, storeLinkedList);
        System.out.println("The list after shuffle 3 : "
                + storeLinkedList.toString());
    }

    static void listDataAdder(Object[] arr, LinkedList<Store> storeLinkedList2) {
        ListIterator<Store> it = storeLinkedList2.listIterator();
        for (Object e : arr) {
            it.next();
            it.set((Store) e);
        }
    }

    static void arrayShuffle(Object[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length - 1; i++) {

            // select index randomly
            int index = rand.nextInt(i + 1);

            // swapping between i th term and the index th
            // term
            Object g = arr[index];
            arr[index] = arr[i];
            arr[i] = g;
        }
    }
}
