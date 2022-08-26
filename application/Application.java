package application;

import model.Bottles;
import model.Store;

import java.util.Scanner;

import dataStructures.DataStructures;

public class Application {

    private void selectorOptions() {
        System.out.println("\n 1 add bottles in queue\n" +
                "2. remove bottle at the top of the queue \n" +
                "3. look at the top of the queue without removing the bottle \n" +
                "4. check the size of the queue\n" +
                "5. empty the queue\n" +
                "6. enter store information\n" +
                "7. number of deliveries \n " +
                "8. store on the top of the list\n" +
                "9. get the first store in the list\n" +
                "10.get the last store in the list\n" +
                "11.clear store list \n" +
                "12. sort list based on orders\n" +
                "13. randomly sort list\n" +
                "14. exit program"

        );
    }

    private Bottles bottlesInPutControls() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fernandes Bottles Service Program.exe");
        System.out.println("Enter Bottle information");
        String bottleName = scanner.nextLine();
        System.out.println("Enter the size of the bottle");
        String bottleSize = scanner.nextLine();
        System.out.println("Enter the prize of the bottle");
        int bottlePrizeInSRD = scanner.nextInt();

        Bottles newBottles = new Bottles(bottleName, bottleSize, bottlePrizeInSRD);
        return newBottles;

    }

    private Store StoreInputControls() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter store information");
        String storeName = scanner.nextLine();
        System.out.println("Enter Store address");
        String address = scanner.nextLine();
        System.out.println("Enter Store phonenumber");
        String phoneNumber = scanner.nextLine();
        System.out.println("The amount of bottles ordered");
        int BottlesOrdered = scanner.nextInt();

        Store newStore = new Store(storeName, address, phoneNumber, BottlesOrdered);
        return newStore;
    }


     
    public static void main(String[] args) {
        DataStructures dataStruct = new DataStructures();
        Application application = new Application();
        Scanner scanner = new Scanner(System.in);
        int selector;

        do {
            application.selectorOptions();
            selector = scanner.nextInt();
            switch (selector) {
                case 1:
                    // enqueue bottles
                    Bottles bottles = application.bottlesInPutControls();
                    dataStruct.addBottlesInQueue(bottles);
                    break;
                case 2:
                    // poll bottle
                    System.out.println("remove bottle at the top of queue");
                    dataStruct.removeBottleFromQueue();
                    break;
                case 3:
                    // peek the top of the queue
                    dataStruct.peekBottleQueue();
                    break;
                case 4:
                    // size of the queue
                    dataStruct.sizeOfBottleQueue();
                    break;
                case 5:
                    // clear the queue
                    dataStruct.emptyBottleQueue();
                    break;
                case 6:
                    // enter store data
                    Store store = application.StoreInputControls();
                    dataStruct.addToLinkedList(store);
                    break;
                case 7:
                    // number of stores in list
                    dataStruct.sizeOfLinkedList();
                    break;
                case 8:
                    // store top of the list
                    dataStruct.peekLinkedList();
                    break;
                case 9:
                    // get first store on the list
                    dataStruct.getFirstInLinkedList();
                    break;
                case 10:
                    // get last store on the list
                    dataStruct.getLastInLinkedList();
                    break;
                case 11:
                    // clear store list
                    dataStruct.clearLinkedList();
                    break;
                case 12:
                    // order list based on orders
                    dataStruct.sortLinkedListBasedOnOrders();
                    break;

                case 13:
                    // randomly sort list
                    dataStruct.unsortLinkList();
                    break;
                case 14:
                    // exit program
                    System.exit(1);
            }
        } while (selector != 14);

    }

}
