

import java.util.ArrayList;

public class array {
     ArrayList<Integer> list = new ArrayList<>();
        list.add(54);
        list.add(47);
        list.add(333);
        list.add(33);

        System.out.println(list);

        // get operation 
        int element = list.get(2);
        System.out.println(element);

        System.out.println(list.remove(1));
        System.out.println(list);

        list.set(1, 10);
        System.out.println(list);

         reversed element 

    for(int i = list.size()-1; i>=0; i--){
        System.out.print(list.get(i) +"  ");
}
}