package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    static void reverseList(ArrayList<Integer> list ){   //user method to reverse
        int i=0,j= list.size()-1;
        while(i<j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
            }
        }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original List: " );
        System.out.println(list);
        Collections.reverse(list);//Inbuilt method to reverse the arraylist
        // reverseList(list);
        System.out.println("Reversed Arraylist:" );
        System.out.println(list);

        Collections.sort(list);//inbuilt method to sort the arraylist 
        System.out.println("Sorted Arraylist in Ascending order:"+list );

        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Sorted Arraylist in Descending order:"+list );


        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Welcome");
        l1.add("To");
        l1.add("Physics");
        l1.add("Wallah");
        System.out.println("Original list: " + l1);
        Collections.sort(l1);
        System.out.println("Sorted Arraylist in Ascending order:"+l1 );

        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("Sorted Arraylist in Descending order:"+l1 );

    }
}
