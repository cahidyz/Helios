package lesson11.homework;

import java.util.LinkedList;

public class UndoLastMessage {
    public static void main(String[] args) {

        LinkedList<String> messageList = new LinkedList<>();
        messageList.add("Hello");
        messageList.add("What's up?");
        messageList.add("Where are you heading up?");

        for(String message: messageList){
            System.out.println(message);
        }

        messageList.removeLast();
        System.out.println("After undo operation:");

        for(String message: messageList){
            System.out.println(message);
        }
    }
}
