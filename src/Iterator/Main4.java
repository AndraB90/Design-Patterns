package Iterator;

import java.util.Iterator;

public class Main4 {
    public static void main(String[] args) {
        MyString string=new MyString("Andra");
        Iterator<String>stringIterator= string.iterator();

        while(stringIterator.hasNext()){
            String value=stringIterator.next();
            System.out.print("[ "+value+ "]");
        }
        System.out.println();

        // Print the string in reverse order
        StringBuilder reversedString = new StringBuilder();
        for (int i = string.size() - 1; i >= 0; i--) {
            reversedString.append(string.getString().charAt(i));
        }
        System.out.println("Reversed string: " + reversedString);

    }
}
