package programation.personal.redoexam.newpackage1;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Figure> block = new ArrayList();
        Figure x = new Figure();
        block.add(x);
    
        System.out.println(block.contains(x.show()));

    }
}
