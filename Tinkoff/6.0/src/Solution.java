import java.util.*;

class Solution {


    static ArrayList<Integer> fullX = new ArrayList<>();
    static int counter = 0;


    public static void A(int value) {
        fullX.add(value);
        counter++;
    }

    public static void D(int value){
        for(int i = 0; i < fullX.size()-1; i++)
        if(fullX.get(i) == value) {
            fullX.remove(i);
            break;
        }
        counter--;
    }

    public static int Q(){
        if(counter%2==1)return -1;
        Collections.sort(fullX);
        if(fullX.get(counter/2-1) == fullX.get(counter/2))return -1;
        else return fullX.get(counter/2) - 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        while (i <= n){
            String letter = scanner.next();

            if(letter.equals("A")){
                String X = scanner.next();
                String Y = scanner.next();
                A(Integer.parseInt(X));}
            else if(letter.equals("D")){
                String X = scanner.next();
                String Y = scanner.next();
                D(Integer.parseInt(X));}
            else {System.out.println(Q());}

        } System.out.println(" ");
    }
}

