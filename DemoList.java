
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*

*/
public class DemoList extends Applet implements ItemListener {
    List os, browser;
    String psn = "";
    public void init() {
        os = new List(4, true);
        browser = new List(4, false);
        // menambahkan item-item pada daftar os
        os.add("Windows XP");
        os.add("Windows Vista");
        os.add("Solaris");
        os.add("Mac OS");

        // menambahkan item-item pada daftar browser
        browser.add("Internet Explorer");
        browser.add("Firefox");
        browser.add("Opera");
        browser.select(1);
        // menambahkan daftar pilihan pada jendela
        add(os);
        add(browser);
        // meregister untuk meneriman event
        os.addItemListener(this);
        browser.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }
    // Menampilkan pilihan terkini.
    public void paint(Graphics g) {
        int idks[];
        psn = "OS Terkini: ";
        idks = os.getSelectedIndexes();
        for(int i=0; i<idks.length; i++)
            psn += os.getItem(idks[i]) + " ";
        g.drawString(psn, 6, 120);
        psn = "Browser Terkini: ";
        psn += browser.getSelectedItem();
        g.drawString(psn, 6, 140);
    }
} 
    

