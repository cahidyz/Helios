package lesson15.task;

public class Task3 {
    public static void main(String[] args) {
        StringBuilder listSplit = new StringBuilder();
        listSplit.append("Bread, Milk, Egg, Applele");

        String listSplitToString = listSplit.toString();
        String[] listSplitArray = listSplitToString.split(" ");

        String longestProduct = "";

        for(String split : listSplitArray){
            if(split.length() > longestProduct.length()){
                longestProduct = split;
            }
        }
        System.out.println("Longest product is: " + longestProduct);
    }
}
