import AndersList.AndersList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // todo Generics
//        Drawer drawer = new Drawer(new Integer(37));
//        System.out.println(drawer.getType());
//
//        Drawer stringDrawer = new Drawer("XP");
//        System.out.println(stringDrawer.getType());

//        Drawer usefulDrawer = new Drawer();
//
//        usefulDrawer.setType(new Integer(42));
//        System.out.println(usefulDrawer.getType() instanceof Integer);
//        usefulDrawer.setType("oh yeah");
//        System.out.println(usefulDrawer.getType() instanceof String);

//        String foundType = TypeChecker.checkType(new Float(68.2));
//        System.out.println(foundType);

        AndersList<Integer> list = new AndersList<Integer>();
        list.add(new Integer(0));
        list.add(new Integer(1));
        list.add(new Integer(5));
        list.add(new Integer(2));
        list.set(0, new Integer(100));
        System.out.println(list);

    }
}
