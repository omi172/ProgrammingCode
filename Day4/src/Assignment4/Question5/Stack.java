package Assignment4.Question5;

import java.util.ArrayList;

public class Stack {
    public static void main(String[] args) {
        ArrayList<Integer> store = new ArrayList<>();
        pushElement(1, store);
        pushElement(2, store);
        pushElement(3, store);
        pushElement(4, store);
        pushElement(5, store);
        popElement(store);
        popElement(store);
        checkIsEmpty(store);
    }
    static void pushElement(int element,ArrayList<Integer> store){
        store.add(element);
        System.out.println(element + " is Added");
    }

    static void popElement(ArrayList<Integer> store){
        System.out.println(store.get(store.size() - 1) + " Is Removed");
        store.remove(store.size() -1);
    }
    static void checkIsEmpty(ArrayList<Integer> store){
        if(store.size() == 0){
            System.out.println("Stack Is Empty");
        }else{
            System.out.println("Stack Is Not Empty");
        }
    }
}

