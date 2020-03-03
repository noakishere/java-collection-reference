
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cstuser
 */
public class Demo {
    public static void main(String[] args){
        
        Collection values = new ArrayList();    //Any Type
        values.add(1);values.add("Hey"); values.add("ye");
        
        Collection<Integer> values1 = new ArrayList<Integer>(); //Type check
        values1.add(1);values1.add(4); values1.add(2);
        
        List<Integer> values2 = new ArrayList<>(); //Takes duplicates
        values2.add(2);values2.add(27);values2.add(5);
        
        Set<Integer> number = new HashSet<>();  //No duplicates
        number.add(2);number.add(2);number.add(5);number.add(5);number.add(1);
        
        Set<Integer> number1 = new TreeSet<>(); //Ordered Element
        number1.add(2786);number1.add(2);number1.add(5);number1.add(22);
        
        Map<Integer, String> m = new HashMap<>();
        m.put(1, "vijay");m.put(4, "boi");m.put(2, "ye");
        
        Set<Map.Entry<Integer, String>> set = m.entrySet();
        
        Iterator<Map.Entry<Integer,String>> itr = set.iterator();
        
        while(itr.hasNext())
        {
            Map.Entry e = itr.next();
            System.out.println(e.getKey()+""+e.getValue());
        }
    }
}
