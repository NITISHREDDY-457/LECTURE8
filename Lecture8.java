LOOPS:: FOR-WHILE-DO WHILE--------->
public class Lecture8 {
    public static void main(String args[]){
        int k;

       
        for(k=1;k<=100;k++){  //loop will break if i=101
            System.out.println(i);
        }
        System.out.println("Final value if k is : " + k);

        // WHILE LOOP
        int j=5;
        while(j>0){
            System.out.println("Hello");
            j--;
        }
        System.out.println("After while loop, j is : "+j);

        // DO WHILE LOOP
        int q=5;
        do {
            System.out.println(q);
            q--;
        } while (q>0);
        System.out.println("After DO-While loop, q is : "+q);
    }
}