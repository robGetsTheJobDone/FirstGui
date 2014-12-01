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
    
    public String TooString(int x){
        String f = ("Title: " + g.get(x).Title + " Subject: " + g.get(x).SubStr()); 
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

   
}
