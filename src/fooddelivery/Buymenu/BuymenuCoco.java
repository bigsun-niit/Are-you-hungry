package fooddelivery.Buymenu;

import fooddelivery.Buy.BuyCoco;
import fooddelivery.Order.Order;
;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class BuymenuCoco extends JFrame {

    String[] list1 = {"11", "Coco_鲜百香双响炮", "15", "0"};
    String[] list2 = {"12", "Coco_戳戳鲜柚益菌多", "20", "0"};
    String[] list3 = {"13", "Coco_法式奶霜红茶", "11", "0"};
    String[] list4 = {"14", "Coco_桃桃酸奶", "16", "0"};
    int flag = 0;
    double sum = 0;
    BuyCoco lii1;
    private JPanel contentPane;
    private JLabel lblNewLabel;
    private JPanel panel;
    private JPanel panel_1;
    private JButton btnNewButton;
    private JButton btnNewButton_1;
    private JPanel panel_2;
    private JPanel panel_3;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JLabel lblNewLabel_5;
    private JLabel lblNewLabel_6;
    private JLabel lblNewLabel_7;
    private JLabel lblNewLabel_8;
    private JLabel lblNewLabel_9;
    private JLabel lblNewLabel_10;
    private JLabel lblNewLabel_11;
    private JLabel lblNewLabel_12;
    private JLabel lblNewLabel_13;
    private JLabel lblNewLabel_14;
    private JLabel lblNewLabel_15;
    private JLabel lblNewLabel_16;
    private JLabel lblNewLabel_17;
    private JLabel lblNewLabel_18;
    private JLabel lblNewLabel_19;
    private JLabel lblNewLabel_20;
    private JLabel lblNewLabel_21;
    private JLabel lblNewLabel_22;
    private JButton btnNewButton_2;

    public BuymenuCoco() {
        lii1 = new BuyCoco();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("购物清单");
        setBounds(730, 500, 800, 528);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        panel = new JPanel();
        contentPane.add(panel, BorderLayout.NORTH);

        lblNewLabel = new JLabel("购物清单");
        panel.add(lblNewLabel);

        panel_1 = new JPanel();
        contentPane.add(panel_1, BorderLayout.SOUTH);

        btnNewButton = new JButton("结账");
        panel_1.add(btnNewButton);




        panel_2 = new JPanel();
        contentPane.add(panel_2, BorderLayout.CENTER);
        panel_2.setLayout(new GridLayout(0, 4, 4, 0));

        panel_3 = new JPanel();
        panel_2.add(panel_3);

        lblNewLabel_1 = new JLabel("商品编号");
        panel_3.add(lblNewLabel_1);

        JPanel panel_4 = new JPanel();
        panel_2.add(panel_4);

        lblNewLabel_2 = new JLabel("名称");
        panel_4.add(lblNewLabel_2);

        JPanel panel_5 = new JPanel();
        panel_2.add(panel_5);

        lblNewLabel_3 = new JLabel("单价(元)");
        panel_5.add(lblNewLabel_3);

        JPanel panel_6 = new JPanel();
        panel_2.add(panel_6);

        lblNewLabel_4 = new JLabel("数量");
        panel_6.add(lblNewLabel_4);

        JPanel panel_7 = new JPanel();
        panel_2.add(panel_7);

        lblNewLabel_5 = new JLabel();
        panel_7.add(lblNewLabel_5);

        JPanel panel_8 = new JPanel();
        panel_2.add(panel_8);

        lblNewLabel_6 = new JLabel();
        panel_8.add(lblNewLabel_6);

        JPanel panel_9 = new JPanel();
        panel_2.add(panel_9);

        lblNewLabel_7 = new JLabel();
        panel_9.add(lblNewLabel_7);

        JPanel panel_10 = new JPanel();
        panel_2.add(panel_10);

        lblNewLabel_8 = new JLabel();
        panel_10.add(lblNewLabel_8);

        JPanel panel_11 = new JPanel();
        panel_2.add(panel_11);

        lblNewLabel_9 = new JLabel();
        panel_11.add(lblNewLabel_9);

        JPanel panel_12 = new JPanel();
        panel_2.add(panel_12);

        lblNewLabel_10 = new JLabel();
        panel_12.add(lblNewLabel_10);

        JPanel panel_13 = new JPanel();
        panel_2.add(panel_13);

        lblNewLabel_11 = new JLabel();
        panel_13.add(lblNewLabel_11);

        JPanel panel_14 = new JPanel();
        panel_2.add(panel_14);

        lblNewLabel_12 = new JLabel();
        panel_14.add(lblNewLabel_12);

        JPanel panel_15 = new JPanel();
        panel_2.add(panel_15);

        lblNewLabel_13 = new JLabel();
        panel_15.add(lblNewLabel_13);

        JPanel panel_16 = new JPanel();
        panel_2.add(panel_16);

        lblNewLabel_14 = new JLabel();
        panel_16.add(lblNewLabel_14);

        JPanel panel_17 = new JPanel();
        panel_2.add(panel_17);

        lblNewLabel_15 = new JLabel();
        panel_17.add(lblNewLabel_15);

        JPanel panel_18 = new JPanel();
        panel_2.add(panel_18);

        lblNewLabel_16 = new JLabel();
        panel_18.add(lblNewLabel_16);

        JPanel panel_19 = new JPanel();
        panel_2.add(panel_19);

        lblNewLabel_17 = new JLabel();
        panel_19.add(lblNewLabel_17);

        JPanel panel_20 = new JPanel();
        panel_2.add(panel_20);

        lblNewLabel_18 = new JLabel("");
        panel_20.add(lblNewLabel_18);

        JPanel panel_21 = new JPanel();
        panel_2.add(panel_21);

        lblNewLabel_19 = new JLabel("");
        panel_21.add(lblNewLabel_19);

        JPanel panel_22 = new JPanel();
        panel_2.add(panel_22);

        lblNewLabel_20 = new JLabel("");
        panel_22.add(lblNewLabel_20);

        JPanel panel_23 = new JPanel();
        panel_2.add(panel_23);

        lblNewLabel_21 = new JLabel("总价：");
        panel_23.add(lblNewLabel_21);

        JPanel panel_24 = new JPanel();
        panel_2.add(panel_24);

        lblNewLabel_22 = new JLabel("0元");
        panel_24.add(lblNewLabel_22);

        setVisible(true);
        btnNewButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null, "您的消费总额为" + sum + "元");
                Order order = new Order();
                order.pack();
                order.setLocationRelativeTo(null);
                order.setVisible(true);

            }
        });


    }

    public void list_1(String str1, String str2) {
        if (str1.equals(list1[0])) {
            lblNewLabel_5.setText(list1[0]);
            lblNewLabel_6.setText(list1[1]);
            lblNewLabel_7.setText(list1[2]);
            list1[3] = str2;
            lblNewLabel_8.setText(list1[3]);
            Double d1 = new Double(list1[2]);
            Double d2 = new Double(list1[3]);
            sum = sum + d1 * d2;
        }
        if (str1.equals(list2[0])) {
            lblNewLabel_9.setText(list2[0]);
            lblNewLabel_10.setText(list2[1]);
            lblNewLabel_11.setText(list2[2]);
            list2[3] = str2;
            lblNewLabel_12.setText(list2[3]);
            Double d3 = new Double(list2[2]);
            Double d4 = new Double(list2[3]);
            sum = sum + d3 * d4;
        }
        if (str1.equals(list3[0])) {
            lblNewLabel_13.setText(list3[0]);
            lblNewLabel_14.setText(list3[1]);
            lblNewLabel_15.setText(list3[2]);

            list3[3] = str2;
            lblNewLabel_16.setText(list3[3]);
            Double d5 = new Double(list3[2]);
            Double d6 = new Double(list3[3]);
            sum = sum + d5 * d6;
        }
        if (str1.equals(list4[0])) {
            lblNewLabel_17.setText(list4[0]);
            lblNewLabel_18.setText(list4[1]);
            lblNewLabel_19.setText(list4[2]);
            list4[3] = str2;
            lblNewLabel_20.setText(list4[3]);
            Double d7 = new Double(list4[2]);
            Double d8 = new Double(list4[3]);
            sum = sum + d7 * d8;
        }
        lblNewLabel_22.setText(sum + "元");

    }
}
