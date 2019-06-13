/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddelivery.Buy;
import fooddelivery.Buymenu.BuymenuDashang;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BuyDashang extends JFrame {
 
    private JFrame jf=new JFrame();
    private BuymenuDashang        lii ; 
    private JPanel contentPane=new JPanel();
    private JTextField textField;
    private JTextField textField_1;
    private JLabel lblNewLabel;
    private JButton btnNewButton;
    private JButton btnNewButton_1;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    String str="",str1="";
   public BuyDashang() {

        
    }
    public void list_11() {

        lii=new BuymenuDashang();
        setTitle("购物车");
    
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(435, 500, 300, 528);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        
        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.NORTH);
        
        lblNewLabel = new JLabel("请输入");
        panel.add(lblNewLabel);
        
        JPanel panel_1 = new JPanel();
        contentPane.add(panel_1, BorderLayout.SOUTH);
        
        btnNewButton = new JButton("确定");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        panel_1.add(btnNewButton);
        
        btnNewButton_1 = new JButton("清除");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        panel_1.add(btnNewButton_1);
        
        JPanel panel_2 = new JPanel();
        contentPane.add(panel_2, BorderLayout.CENTER);
        panel_2.setLayout(new GridLayout(0, 1, 2, 0));
        
        JPanel panel_3 = new JPanel();
        panel_2.add(panel_3);
        
        lblNewLabel_1 = new JLabel("商品编号");
        panel_3.add(lblNewLabel_1);
        
        textField = new JTextField();
        panel_3.add(textField);
        textField.setColumns(10);
        
        JPanel panel_4 = new JPanel();
        panel_2.add(panel_4);
        
        lblNewLabel_2 = new JLabel("商品数量");
        panel_4.add(lblNewLabel_2);
        
        textField_1 = new JTextField();
        panel_4.add(textField_1);
        textField_1.setColumns(10);
        setVisible(true);
    
        btnNewButton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            
            lii.list_1(textField.getText(),textField_1.getText());
            
            }
        });
        btnNewButton_1.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                textField_1.setText("");
                
            }
        });
    }
    public static void main(String[] args) {
        new BuyDashang().list_11();
    }
    public String S1(){
        return str;
        
    }
    public String S2(){
        return str1;
        
    }
    

}

