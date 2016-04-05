package com.BorisV.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class AgileOrWaterFall extends JFrame {
    private JCheckBox noCheckBox;
    private JCheckBox noCheckBox1;
    private JCheckBox noCheckBox2;
    private JCheckBox noCheckBox3;
    private JCheckBox noCheckBox4;
    private JCheckBox noCheckBox5;
    private JCheckBox yesCheckBox;
    private JCheckBox yesCheckBox1;
    private JCheckBox yesCheckBox2;
    private JCheckBox yesCheckBox3;
    private JCheckBox yesCheckBox4;
    private JCheckBox yesCheckBox5;
    private JPanel rootPanel;
    private JButton summitButton;
    private JButton quitButton;
    private JLabel title;
    private JLabel answerAgiOrWfall;
    private JLabel suggestOpinion;
    protected boolean agile, agile1, agile2, agile3, agile4, agile5;
    protected boolean waterFall, waterFall1, waterFall2, waterFall3, waterFall4, waterFall5;


    AgileOrWaterFall() {
        super("BorisV");
        setContentPane(rootPanel);
        pack();
        setVisible(true);
        setPreferredSize(new Dimension());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //this is for the quick button to close, the button is marked with an x for look.
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        summitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //This are the two arrays that keep adding each click done by the user
                //it resets to zero every time the user uncheck all the boxes.
                ArrayList<Integer> agileSum = new ArrayList<>(0);
                ArrayList<Integer> waterFallSum = new ArrayList<>(0);

                //this are the variables used for each check box, uses the boolean variable to check the
                //if it was clicked or not then added to the array as 1 or a zero.
                int agW1 = (agile)? 1 : 0; int agW2 = (agile1)? 1 : 0;
                int agW3 = (agile2)? 1 : 0; int agW4 = (agile3)? 1 : 0;
                int agW5 = (agile4)? 1 : 0; int agW6 = (agile5)? 1 : 0;
                int agW7 = (waterFall)? 1 : 0; int agW8 = (waterFall1)? 1 : 0;
                int agW9 = (waterFall2)? 1 : 0; int agW10 = (waterFall3)? 1 : 0;
                int agW11 = (waterFall4)? 1 : 0; int agW12 = (waterFall5)? 1 : 0;

                //This are the added 1's or 0's to to each array.
                agileSum.add(agW1); agileSum.add(agW2); agileSum.add(agW3);
                agileSum.add(agW4); agileSum.add(agW5); agileSum.add(agW6);
                waterFallSum.add(agW7); waterFallSum.add(agW8);
                waterFallSum.add(agW9); waterFallSum.add(agW10);
                waterFallSum.add(agW11); waterFallSum.add(agW12);

                //This variables are used for the loops and are also set to zero
                int ag = 0, wf = 0;

                //This loops the array for the water fall
                for (int i = 0; i < waterFallSum.size(); i++) {
                    int w = waterFallSum.get(i);
                    wf += w;
                }

                //This loops the array for the agile
                for (int i = 0; i < agileSum.size(); i++) {
                    int a = agileSum.get(i);
                    ag += a;
                }

                //This if statements check for the results from the loops and prints out on the screen the results.
                if ((ag + wf) == 0) {
                    //this will print if none of the boxes are selected
                    answerAgiOrWfall.setText("None selected");
                }else if (wf >= ag) {
                    //this will be printing the waterfall as choice
                    answerAgiOrWfall.setText("The recommendation is for WATERFALL");
                    //this will print the agile choice
                } else answerAgiOrWfall.setText("The recommendation is for AGILE");
            }
        });

        //Down below are all the overrides for the variables created by the GUI

        noCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agile = noCheckBox.isSelected();

            }
        });
        noCheckBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agile1 = noCheckBox1.isSelected();
            }
        });
        noCheckBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                waterFall = noCheckBox2.isSelected();
            }
        });
        noCheckBox3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                waterFall1 = noCheckBox3.isSelected();
            }
        });
        noCheckBox4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agile2 = noCheckBox4.isSelected();
            }
        });
        noCheckBox5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                waterFall2 = noCheckBox5.isSelected();
            }
        });
        yesCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                waterFall3 = noCheckBox.isSelected();
            }
        });
        yesCheckBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                waterFall4 = yesCheckBox1.isSelected();
            }
        });
        yesCheckBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agile3 = yesCheckBox2.isSelected();
            }
        });
        yesCheckBox3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agile4 = yesCheckBox3.isSelected();
            }
        });
        yesCheckBox4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                waterFall5 = yesCheckBox4.isSelected();
            }
        });
        yesCheckBox5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agile5 = yesCheckBox5.isSelected();
            }
        });
    }
}
