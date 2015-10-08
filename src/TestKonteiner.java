import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
/**
 * Created by kasutaja on 4.10.2015.
 */
public class TestKonteiner extends JPanel implements ActionListener {
    JTextArea tekst;
    JButton konteiner1;
    JButton konteiner2;
    JButton konteiner3;
    static String[] j22tmed = {"printeri paber","teepakk","coca-cola plastikpudel"}; //prügi massiiv küsimuste jaoks
    static String juhuslikPrygi; //jäätmete massiivist randomiga jääde kontrollküsimuseks.


    public TestKonteiner() {
        super(new BorderLayout());

        int jrkNr=(int) Math.round(0 + (Math.random() * (j22tmed.length)));//juhusliku prügi jaoks on vaja indeksit
        juhuslikPrygi = j22tmed[jrkNr]; // otsin jarjendist juhusliku nime (string)
        System.out.println(juhuslikPrygi);

        //küsimus paneelile
        tekst = new JTextArea("Millisesse konteinerisse tuleb visata "+ juhuslikPrygi + "?");
        tekst.setEditable(false);
        tekst.setOpaque(false);

        //loon prügikastidele nupud ja kuularid
        konteiner1 = new JButton("Paber & kartong");
        konteiner2 = new JButton("Biolagunevad jäätmed");
        konteiner3 = new JButton("Pakendid");

        konteiner1.addActionListener(this);
        konteiner2.addActionListener(this);
        konteiner3.addActionListener(this);

        //lisan vidinad, nupud paneelile
        JPanel paneel1 = new JPanel(new GridLayout(0, 1));
        paneel1.add(tekst);
        JPanel paneel2 = new JPanel(new GridLayout(0, 3));
        paneel2.add(konteiner1);
        paneel2.add(konteiner2);
        paneel2.add(konteiner3);

        add(paneel1, BorderLayout.LINE_START);
        add(paneel2, BorderLayout.PAGE_END);
        setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
    }

    //PEAMEETOD
    public static void main (String[] args){
        JFrame raam = new JFrame("PRYKKAR");
        raam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent newContentPane = new TestKonteiner();
        raam.setContentPane(newContentPane);
        raam.pack(); // ei ole kindlaid mõõtusid, vastavalt sisule tuleb kast
        raam.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if (juhuslikPrygi == j22tmed[0] && e.getSource() == konteiner1){
            System.out.println("Tubli! Õige konteiner!");
        }
        if (juhuslikPrygi == j22tmed[1] && e.getSource() == konteiner2){
            System.out.println("Tubli! Õige konteiner!");
        }
        if (juhuslikPrygi == j22tmed[3] && e.getSource() == konteiner3){
            System.out.println("Tubli! Õige konteiner!");
        }
        else{
            System.out.println("Prügikast ei ole enam pommikindel");
        }
    }
}


