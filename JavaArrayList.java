
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

class JavaArrayList extends ArrayList<String>{
    public static void main(String args[]){
        ArrayList arrayListOne;
        arrayListOne = new ArrayList();

        ArrayList arrayListTwo = new ArrayList();
        JavaArrayList names = new JavaArrayList();
        names.add("Sohan");
        names.add("Omar Faruq");
        names.add("she");
        String n = "jackson";
        names.add(n);
        names.add("jack");
        names.add("son");
        names.add("hello");
        //for(int i = 0; i < names.size() ; ++i){
        //System.out.println(names.get(i));
        //}
        //names.set(2, "wwwww");

        for(String i : names){
            System.out.println(i);
        }

        System.out.println();
        //names.remove(2);
        //names.removeRange(2,4);
        //for(int i = 0; i < names.size() ; ++i){
        //System.out.println(names.get(i));
        //}
        Iterator indivItems =  names.iterator();
        while(indivItems.hasNext()){
            System.out.println(indivItems.next());
        }

        ArrayList<String> nameCopy = new ArrayList<String>();
        nameCopy.addAll(names);
        names.add("Rakib");
        System.out.println();
        for(String i : nameCopy){
            System.out.println(i);
        }
        if(names.contains("son")){
            System.out.println("son has been founded");
        }
        if(nameCopy.containsAll(names)){
            System.out.println("yes all founded");
        }
        nameCopy.clear();
        System.out.println("After clear:");
        for(String i : nameCopy){
            System.out.println(i);
        }
    }
}




