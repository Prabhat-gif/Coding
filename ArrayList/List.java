package ArrayList;
import java.util.ArrayList;
public class List {
    
    public static void main(String[] args) {

        //Wraper classes
        ArrayList<Integer> sc =new ArrayList<Integer>();

        //add new element
        sc.add(5);
        sc.add(10);
        sc.add(15);
        sc.add(20);

        //get an element at index i
        // System.out.println(sc.get(0));  //5

        //print with the loop
        // for(int i=0;i<sc.size();i++){
        //     System.out.println(sc.get(i));  //5,10,15,20
        // }
        
        //printing the arraylist directly
        System.out.println(sc);    //[5,10,15,20]

        //adding element at some index i
        sc.add(1,100);
        System.out.println(sc);  //[5,100,10,15,20]

        //modify element at index i
        sc.set(1, 8);
        System.out.println(sc);  //[5,8,10,15,20]

        ///removing element at index i
        sc.remove(1);
        System.out.println(sc);  //[5,10,15,20]

        //removing an element e
        System.out.println(sc.remove(Integer.valueOf(7)));//boolean statement return
                                                        //false
        System.out.println(sc);  //[5,10,15,20]

        //checking if an element exits
        
        boolean ans=sc.contains(Integer.valueOf(8));
        System.out.println(ans);  //true

        //if you don't specify class,you can put anything insde l
        ArrayList l =new ArrayList();
        l.add("name");
        l.add(10);
        l.add(20.5);
        System.out.println(l);  //[name,10,20.5]




        }
    }

    

