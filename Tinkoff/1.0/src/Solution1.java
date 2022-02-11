import java.util.*;

class Solution1 {

    static int n=0;

    static ArrayList<Integer> X = new ArrayList<>();
    static int counter = 0;
    static int index_a=-1;
    static int R = 0;
    static int L = 0;
    static boolean ichet=false;

    public static void A(int value) {
        X.set(value, X.get(value)+1);
        counter++;
        if(counter%2==0) {
            ichet=true;
        }
        else {
            ichet=false;
        }
        if(value>index_a) {
            R++;
        }
        if(value<=index_a) {
            L++;
        }
    }

    public static void D(int value){
        X.set(value, X.get(value)-1);
        if(value>index_a) {
            R--;
        }
        if(value<=index_a) {
            L--;
        }
    }

    public static int Q(){
        if(counter%2==0) {
            if(R>= L) {
                int i=index_a+1;
                while(i<= X.size()-1) {
                    if(L + X.get(i)<=R) {
                        L += X.get(i);
                        R-= X.get(i);
                        index_a=i;
                        i++;
                    }
                    else if(L + X.get(i)>R) {
                        if(L ==R) {
                            return index_a;
                        }
                        else {
                            return -1;
                        }
                    }
                }
            }
            else if(L >=R) {
                int i=index_a;
                while(i>0) {
                    if(R+ X.get(i)<=R) {
                        L -= X.get(i);
                        R+= X.get(i);
                        index_a=i;
                        i--;
                    }
                    else if(R+ X.get(i)>R) {
                        if(L ==R) {
                            return index_a;
                        }
                        else {
                            return -1;
                        }
                    }
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for(int i=0;i<n+1;i++) {
            X.add(0);
        }
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