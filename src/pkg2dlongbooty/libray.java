/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2dlongbooty;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author bpb
 */
public class libray implements java.io.Serializable {

    ArrayList<Book> g = new ArrayList<>();

    public ArrayList<String> Names4Gui() {
        ArrayList<String> temp = new ArrayList<String>();
        for (int x = 0; x < g.size(); x++) {
            temp.add(g.get(x).Title);
            System.out.println(temp.get(x));

        }
        //   Collections.sort(temp);

        return temp;
    }

    public ArrayList<String> isbn4Gui() {
        ArrayList<String> temp = new ArrayList<String>();
        for (int x = 0; x < g.size(); x++) {
            int t = ((g.get(x).Cat));
            String strI = Integer.toString(t);

            temp.add((strI));
            //System.out.println(temp.get(x));

        }
        Collections.sort(temp);

        return temp;
    }

    public ArrayList<String> Date4Gui() {
        ArrayList<String> temp = new ArrayList<String>();
        for (int x = 0; x < g.size(); x++) {
            int t = ((g.get(x).year));
            String strI = Integer.toString(t);

            temp.add((strI));
            //System.out.println(temp.get(x));

        }
        Collections.sort(temp);

        return temp;
    }

    public ArrayList<String> subject4Gui() {
        ArrayList<String> temp = new ArrayList<String>();
        for (int x = 0; x < g.size(); x++) {
            temp.addAll(g.get(x).GetArraySubString());
            Collections.sort(temp);

        }
        return temp;
    }

    public ArrayList<String> Pub4Gui() {
        ArrayList<String> temp = new ArrayList<String>();
        for (int x = 0; x < g.size(); x++) {
            System.out.println((g.get(x).getPub()));
            temp.add(g.get(x).Pub);

        }
        return temp;

    }

    public ArrayList<String> Authors4Gui() {
        ArrayList<String> temp = new ArrayList<String>();
        for (int x = 0; x < g.size(); x++) {
            System.out.println();
            temp.addAll(g.get(x).AuthStr());

        }
        return temp;

    }

    public String TooString(int x) {
        String f = ("Title: " + g.get(x).Title + "  Subject: " + g.get(x).SubStr() + "  Authors " + g.get(x).AuthStr() + "  ISBN: " + g.get(x).Cat + "  Date: " + g.get(x).year);
        return f;
    }

    public void THug() {

        g.add(new Book("arthur", "d", 11, 44, true));
        g.add(new Book("luck", "dad", 141, 544, true));

        g.get(0).SetSub("pills");
        g.get(1).SetSub("over sex");
        g.get(0).SetSub("test");
        g.get(1).SetAuth("the Man");
        g.get(0).SetAuth("oveadadr sex");
        g.get(1).SetAuth("money");

    }

    public ArrayList<Book> getList4Save() {
        return g;
    }

    public ArrayList<String> Save(int s, String f) {
        int i = 0;
        ArrayList<String> d = null;

        switch (s) {
            case 0:

                d = compareTitles(f);
                // System.out.println(d.get(0));

                break;

        }
        return d;
    }

    public static void serialize(Object obj, String fileName)
            throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);

        fos.close();
    }

    public static Object deserialize(String fileName) throws IOException,
            ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        ois.close();
        return obj;
    }

    public ArrayList<String> compareTitles(String t) {
        // string t is search function
        int max = 0;
        ArrayList<String> temp = new ArrayList<String>();
        String tt = t.toLowerCase();
        System.out.println(t.length());

        for (int x = 0; x < g.size(); x++) {

            String f = (g.get(x).Title).toLowerCase();
            max = f.length();

            if (t.length() <= max && tt.subSequence(0, tt.length()).equals(f.subSequence(0, tt.length()))) {
                System.out.println(f);
                temp.add(f);
            }
            Collections.sort(temp);

        }

        //System.out.println(temp.get(0));
        return temp;
    }

    public String TooStringTitles(String t, int c) {
        // string t is search function
        String out = null;
        switch (c) {
            case 0:
                
                for (int x = 0; x < g.size(); x++) {
                    String f = (g.get(x).Title);
                    if (t.equals(f)) {
                        out = TooString(x);
                        break;
                    }
           }
            case 1:
                for (int x = 0; x < g.size(); x++) {
                    String f = (g.get(x).Pub);
                    if (t.equals(f)) {
                        out = TooString(x);
                        break;
                    }
           
        
           }
                
     
    }
    return out;
    }
     public String TooStringNums(String t, int c) {
        // string t is search function
        String out = null;
        switch (c) {
            case 0:
               
       
           
                  for (int x = 0; x < g.size(); x++) {
                    int f = (g.get(x).Cat);
                    int foo = Integer.parseInt(t);
                    if (foo ==(f)) {
                        out = TooString(x);
                        break;
                    }
                   
           }
            case 1:
                  for (int x = 0; x < g.size(); x++) {
                    int f = (g.get(x).year);
                    int foo = Integer.parseInt(t);
                    if (foo ==(f)) {
                        out = TooString(x);
                        break;
                    }
                
     
    }
   
    }
        

 return out;
}
}


