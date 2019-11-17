/*
 * Created by JFormDesigner on Sun Nov 10 15:30:37 GMT+08:00 2019
 */

package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.intellij.uiDesigner.core.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * @author chen
 */
public class MainBoardGUI extends JFrame {
    DefaultTableModel tableModelDefault = null;
    DefaultTableModel tableModelDefault2 = null;
    DefaultTableModel tableModelDefault3 = null;
    DefaultTableModel tableModelDefault4 = null;
    DefaultTableModel tableModelDefault5 = null;
    DefaultTableModel tableModelDefault6 = null;
    DefaultTableModel tableModelDefault7 = null;




    static Logger logger = Logger.getLogger(MainBoardGUI.class);

    public MainBoardGUI() {
        initComponents();
        initTable();
    }

    public void initTable() {
        Object[][] data = {};
        String[] name = {"课程编号", "课程年级", "课程名称", "开始时间", "结束时间", "教师", "课程性质", "学分"};
        tableModelDefault = new DefaultTableModel(data, name);
        table1.setModel(tableModelDefault);
        //设置自动列内容筛选器
        table1.setAutoCreateRowSorter(true);

        //Todo Test
//        char testchar = 'a';
//        for (int i = 0; i < 5; i++) {
//            Object datacontent[] = {i, String.valueOf((char) (testchar)), String.valueOf((char) (testchar + i + 1)), "c", "d", "e"};
//            tableModelDefault.addRow(datacontent);
//            testchar++;
//        }

        String[] name2 = {"课程编号", "课程名称", "学生学号", "学生姓名", "学生分数"};
        tableModelDefault2 = new DefaultTableModel(data, name2);
        table2.setModel(tableModelDefault2);
        //设置自动列内容筛选器
        table2.setAutoCreateRowSorter(true);

        String[] name3 = {"课程编号", "课程名称", "开课时间", "教师", "分数", "课程性质", "学分", "重修需要"};
        tableModelDefault3 = new DefaultTableModel(data, name3);
        table3.setModel(tableModelDefault3);
        //设置自动列内容筛选器
        table3.setAutoCreateRowSorter(true);

        String[] name4 = {"课程编号", "课程名称", "开课时间", "教师", "分数", "课程性质", "学分", "重修需要"};
        tableModelDefault4 = new DefaultTableModel(data, name4);
        table4.setModel(tableModelDefault4);
        //设置自动列内容筛选器
        table4.setAutoCreateRowSorter(true);

        String[] name5 = {"学生学号", "学生姓名", "学生年级", "已获学分", "绩点"};
        tableModelDefault5 = new DefaultTableModel(data, name5);
        table5.setModel(tableModelDefault5);
        //设置自动列内容筛选器
        table5.setAutoCreateRowSorter(true);

        String[] name6 = {"用户工号", "用户姓名"};
        tableModelDefault6 = new DefaultTableModel(data, name6);
        table6.setModel(tableModelDefault6);
        //设置自动列内容筛选器
        table6.setAutoCreateRowSorter(true);

        String[] name7 = {"学生学号", "学生姓名", "学生年级", "年学分上限"};
        tableModelDefault7 = new DefaultTableModel(data, name7);
        table7.setModel(tableModelDefault7);
        //设置自动列内容筛选器
        table7.setAutoCreateRowSorter(true);
    }

    public static void main(String[] args) {
        PropertyConfigurator.configure(".//src//log4j.properties");

        MainBoardGUI mainBoardGUI = new MainBoardGUI();
        mainBoardGUI.setVisible(true);
        mainBoardGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void menuItem2ActionPerformed(ActionEvent e) {
        frame1.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menuItem1 = new JMenuItem();
        menu2 = new JMenu();
        menuItem2 = new JMenuItem();
        panel1 = new JPanel();
        tabbedPane1 = new JTabbedPane();
        panel2 = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        panel5 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        panel3 = new JPanel();
        scrollPane2 = new JScrollPane();
        table2 = new JTable();
        panel6 = new JPanel();
        label1 = new JLabel();
        button7 = new JButton();
        button8 = new JButton();
        panel4 = new JPanel();
        scrollPane3 = new JScrollPane();
        table3 = new JTable();
        panel8 = new JPanel();
        label2 = new JLabel();
        button9 = new JButton();
        button10 = new JButton();
        panel7 = new JPanel();
        scrollPane4 = new JScrollPane();
        table4 = new JTable();
        panel11 = new JPanel();
        label3 = new JLabel();
        textField1 = new JTextField();
        button11 = new JButton();
        button12 = new JButton();
        panel9 = new JPanel();
        panel12 = new JPanel();
        label4 = new JLabel();
        textField2 = new JTextField();
        button13 = new JButton();
        button14 = new JButton();
        scrollPane5 = new JScrollPane();
        table5 = new JTable();
        panel10 = new JPanel();
        scrollPane6 = new JScrollPane();
        table6 = new JTable();
        panel15 = new JPanel();
        button6 = new JButton();
        button15 = new JButton();
        button16 = new JButton();
        button17 = new JButton();
        panel14 = new JPanel();
        scrollPane7 = new JScrollPane();
        table7 = new JTable();
        panel16 = new JPanel();
        button18 = new JButton();
        button19 = new JButton();
        button20 = new JButton();
        button21 = new JButton();
        frame1 = new JFrame();
        panel13 = new JPanel();
        label8 = new JLabel();
        passwordField2 = new JPasswordField();
        label9 = new JLabel();
        passwordField3 = new JPasswordField();
        label10 = new JLabel();
        passwordField4 = new JPasswordField();
        button5 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("\u5f00\u59cb");

                //---- menuItem1 ----
                menuItem1.setText("text");
                menu1.add(menuItem1);
            }
            menuBar1.add(menu1);

            //======== menu2 ========
            {
                menu2.setText("\u8bbe\u7f6e");

                //---- menuItem2 ----
                menuItem2.setText("\u4e2a\u4eba\u5bc6\u7801\u4fee\u6539");
                menuItem2.addActionListener(e -> menuItem2ActionPerformed(e));
                menu2.add(menuItem2);
            }
            menuBar1.add(menu2);
        }
        setJMenuBar(menuBar1);

        //======== panel1 ========
        {
            panel1.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));

            //======== tabbedPane1 ========
            {

                //======== panel2 ========
                {
                    panel2.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));

                    //======== scrollPane1 ========
                    {

                        //---- table1 ----
                        table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                        scrollPane1.setViewportView(table1);
                    }
                    panel2.add(scrollPane1, new GridConstraints(0, 0, 1, 2,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                    //======== panel5 ========
                    {
                        panel5.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));

                        //---- button1 ----
                        button1.setText("\u6dfb\u52a0\u8bfe\u7a0b");
                        panel5.add(button1, new GridConstraints(0, 0, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                        //---- button2 ----
                        button2.setText("\u5220\u9664\u8bfe\u7a0b");
                        panel5.add(button2, new GridConstraints(0, 1, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                        //---- button3 ----
                        button3.setText("\u4fee\u6539\u8bfe\u7a0b");
                        panel5.add(button3, new GridConstraints(1, 0, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                        //---- button4 ----
                        button4.setText("\u5bfc\u51fa");
                        panel5.add(button4, new GridConstraints(1, 1, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));
                    }
                    panel2.add(panel5, new GridConstraints(1, 0, 1, 2,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));
                }
                tabbedPane1.addTab("\u8bfe\u7a0b\u5217\u8868", panel2);

                //======== panel3 ========
                {
                    panel3.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));

                    //======== scrollPane2 ========
                    {

                        //---- table2 ----
                        table2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                        scrollPane2.setViewportView(table2);
                    }
                    panel3.add(scrollPane2, new GridConstraints(0, 0, 1, 2,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                    //======== panel6 ========
                    {
                        panel6.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));

                        //---- label1 ----
                        label1.setText("\u5e73\u5747\u5206\uff1a100   \u6700\u9ad8\u5206\uff1a100   \u6700\u4f4e\u5206\uff1a100");
                        panel6.add(label1, new GridConstraints(0, 0, 1, 2,
                            GridConstraints.ANCHOR_WEST, GridConstraints.FILL_VERTICAL,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                        //---- button7 ----
                        button7.setText("\u4fee\u6539\u5206\u6570");
                        panel6.add(button7, new GridConstraints(1, 0, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                        //---- button8 ----
                        button8.setText("\u5bfc\u51fa");
                        panel6.add(button8, new GridConstraints(1, 1, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));
                    }
                    panel3.add(panel6, new GridConstraints(1, 0, 1, 2,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));
                }
                tabbedPane1.addTab("\u5206\u6570\u8bbe\u7f6e", panel3);

                //======== panel4 ========
                {
                    panel4.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));

                    //======== scrollPane3 ========
                    {

                        //---- table3 ----
                        table3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                        scrollPane3.setViewportView(table3);
                    }
                    panel4.add(scrollPane3, new GridConstraints(0, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                    //======== panel8 ========
                    {
                        panel8.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));

                        //---- label2 ----
                        label2.setText("\u5df2\u83b7\u5b66\u5206\uff1a100   \u7ee9\u70b9\uff1a100");
                        panel8.add(label2, new GridConstraints(0, 0, 1, 2,
                            GridConstraints.ANCHOR_WEST, GridConstraints.FILL_VERTICAL,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                        //---- button9 ----
                        button9.setText("\u7533\u8bf7\u67e5\u5377");
                        panel8.add(button9, new GridConstraints(1, 0, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                        //---- button10 ----
                        button10.setText("\u5bfc\u51fa\u6210\u7ee9\u5355");
                        panel8.add(button10, new GridConstraints(1, 1, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));
                    }
                    panel4.add(panel8, new GridConstraints(1, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));
                }
                tabbedPane1.addTab("\u6210\u7ee9\u67e5\u8be2", panel4);

                //======== panel7 ========
                {
                    panel7.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));

                    //======== scrollPane4 ========
                    {

                        //---- table4 ----
                        table4.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                        scrollPane4.setViewportView(table4);
                    }
                    panel7.add(scrollPane4, new GridConstraints(0, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                    //======== panel11 ========
                    {
                        panel11.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));

                        //---- label3 ----
                        label3.setText("\u5b66\u751f\u5b66\u53f7\uff1a");
                        panel11.add(label3, new GridConstraints(0, 0, 1, 1,
                            GridConstraints.ANCHOR_EAST, GridConstraints.FILL_VERTICAL,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));
                        panel11.add(textField1, new GridConstraints(0, 1, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                        //---- button11 ----
                        button11.setText("\u67e5\u8be2\u5b66\u751f\u6210\u7ee9");
                        panel11.add(button11, new GridConstraints(1, 0, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                        //---- button12 ----
                        button12.setText("\u5bfc\u51fa\u6210\u7ee9\u5355");
                        panel11.add(button12, new GridConstraints(1, 1, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));
                    }
                    panel7.add(panel11, new GridConstraints(1, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));
                }
                tabbedPane1.addTab("\u6210\u7ee9\u67e5\u8be2\uff08\u7ba1\u7406\u5458\uff09", panel7);

                //======== panel9 ========
                {
                    panel9.setLayout(new GridLayoutManager(4, 2, new Insets(0, 0, 0, 0), -1, -1));

                    //======== panel12 ========
                    {
                        panel12.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));

                        //---- label4 ----
                        label4.setText("\u5b66\u751f\u5e74\u7ea7\uff1a");
                        panel12.add(label4, new GridConstraints(0, 0, 1, 1,
                            GridConstraints.ANCHOR_EAST, GridConstraints.FILL_VERTICAL,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));
                        panel12.add(textField2, new GridConstraints(0, 1, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                        //---- button13 ----
                        button13.setText("\u67e5\u8be2\u4fe1\u606f");
                        panel12.add(button13, new GridConstraints(1, 0, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                        //---- button14 ----
                        button14.setText("\u5bfc\u51fa\u603b\u8868");
                        panel12.add(button14, new GridConstraints(1, 1, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));
                    }
                    panel9.add(panel12, new GridConstraints(0, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                    //======== scrollPane5 ========
                    {

                        //---- table5 ----
                        table5.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                        scrollPane5.setViewportView(table5);
                    }
                    panel9.add(scrollPane5, new GridConstraints(1, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));
                }
                tabbedPane1.addTab("\u8bfe\u7a0b\u603b\u7ed3\uff08\u7ba1\u7406\u5458\uff09", panel9);

                //======== panel10 ========
                {
                    panel10.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));

                    //======== scrollPane6 ========
                    {

                        //---- table6 ----
                        table6.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                        scrollPane6.setViewportView(table6);
                    }
                    panel10.add(scrollPane6, new GridConstraints(0, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                    //======== panel15 ========
                    {
                        panel15.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));

                        //---- button6 ----
                        button6.setText("\u6dfb\u52a0\u7528\u6237");
                        panel15.add(button6, new GridConstraints(0, 0, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                        //---- button15 ----
                        button15.setText("\u5220\u9664\u7528\u6237");
                        panel15.add(button15, new GridConstraints(0, 1, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                        //---- button16 ----
                        button16.setText("\u4fee\u6539\u7528\u6237");
                        panel15.add(button16, new GridConstraints(1, 0, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                        //---- button17 ----
                        button17.setText("\u5bfc\u51fa");
                        panel15.add(button17, new GridConstraints(1, 1, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));
                    }
                    panel10.add(panel15, new GridConstraints(1, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));
                }
                tabbedPane1.addTab("\u7528\u6237\u7ba1\u7406", panel10);

                //======== panel14 ========
                {
                    panel14.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));

                    //======== scrollPane7 ========
                    {

                        //---- table7 ----
                        table7.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                        scrollPane7.setViewportView(table7);
                    }
                    panel14.add(scrollPane7, new GridConstraints(0, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));

                    //======== panel16 ========
                    {
                        panel16.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));

                        //---- button18 ----
                        button18.setText("\u6dfb\u52a0\u5b66\u751f");
                        panel16.add(button18, new GridConstraints(0, 0, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                        //---- button19 ----
                        button19.setText("\u5220\u9664\u5b66\u751f");
                        panel16.add(button19, new GridConstraints(0, 1, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                        //---- button20 ----
                        button20.setText("\u4fee\u6539\u5b66\u751f");
                        panel16.add(button20, new GridConstraints(1, 0, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));

                        //---- button21 ----
                        button21.setText("\u5bfc\u51fa");
                        panel16.add(button21, new GridConstraints(1, 1, 1, 1,
                            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                            null, null, null));
                    }
                    panel14.add(panel16, new GridConstraints(1, 0, 1, 1,
                        GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                        null, null, null));
                }
                tabbedPane1.addTab("\u5b66\u751f\u7ba1\u7406", panel14);
            }
            panel1.add(tabbedPane1, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
        }
        contentPane.add(panel1, new GridConstraints(0, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        pack();
        setLocationRelativeTo(getOwner());

        //======== frame1 ========
        {
            Container frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));

            //======== panel13 ========
            {
                panel13.setLayout(new GridLayoutManager(4, 2, new Insets(0, 0, 0, 0), -1, -1));

                //---- label8 ----
                label8.setText("\u539f\u5bc6\u7801\uff1a");
                panel13.add(label8, new GridConstraints(0, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
                panel13.add(passwordField2, new GridConstraints(0, 0, 1, 2,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- label9 ----
                label9.setText("\u65b0\u5bc6\u7801\uff1a");
                panel13.add(label9, new GridConstraints(1, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
                panel13.add(passwordField3, new GridConstraints(1, 0, 1, 2,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- label10 ----
                label10.setText("\u518d\u6b21\u8f93\u5165\u65b0\u5bc6\u7801\uff1a");
                panel13.add(label10, new GridConstraints(2, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
                panel13.add(passwordField4, new GridConstraints(2, 0, 1, 2,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- button5 ----
                button5.setText("\u786e\u8ba4\u4fee\u6539");
                panel13.add(button5, new GridConstraints(3, 0, 1, 2,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
            }
            frame1ContentPane.add(panel13, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
            frame1.pack();
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem menuItem1;
    private JMenu menu2;
    private JMenuItem menuItem2;
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    private JPanel panel2;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JPanel panel5;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JPanel panel3;
    private JScrollPane scrollPane2;
    private JTable table2;
    private JPanel panel6;
    private JLabel label1;
    private JButton button7;
    private JButton button8;
    private JPanel panel4;
    private JScrollPane scrollPane3;
    private JTable table3;
    private JPanel panel8;
    private JLabel label2;
    private JButton button9;
    private JButton button10;
    private JPanel panel7;
    private JScrollPane scrollPane4;
    private JTable table4;
    private JPanel panel11;
    private JLabel label3;
    private JTextField textField1;
    private JButton button11;
    private JButton button12;
    private JPanel panel9;
    private JPanel panel12;
    private JLabel label4;
    private JTextField textField2;
    private JButton button13;
    private JButton button14;
    private JScrollPane scrollPane5;
    private JTable table5;
    private JPanel panel10;
    private JScrollPane scrollPane6;
    private JTable table6;
    private JPanel panel15;
    private JButton button6;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JPanel panel14;
    private JScrollPane scrollPane7;
    private JTable table7;
    private JPanel panel16;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    private JButton button21;
    private JFrame frame1;
    private JPanel panel13;
    private JLabel label8;
    private JPasswordField passwordField2;
    private JLabel label9;
    private JPasswordField passwordField3;
    private JLabel label10;
    private JPasswordField passwordField4;
    private JButton button5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
