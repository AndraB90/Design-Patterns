package Iterator;

import java.util.Iterator;

public class Main6 {
    public static void main(String[] args) {
        MyTextFile file=new MyTextFile(1,2,3,4,5,6);
        Iterator<Integer>it=file.iterator();

        while(it.hasNext()){
            Integer value= it.next();
            if(value==0){
                break;
            }
            System.out.print("[" +value+ "]");
        }
    }
}
