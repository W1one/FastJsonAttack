package com.forger.fastJsonScan;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

public class FastGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FastJson 全版本利用工具v1.1  by Forger");
        JFrame.setDefaultLookAndFeelDecorated(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //窗口大小
        frame.setSize(700,600);
        //用JPanel创建了一个面板对象panel
        JPanel panel = new JPanel();
        //添加到窗口frame中
        frame.add(panel);
        //调用用户定义的方法并添加组件到面板
        placeComponents(panel);
        //日常设置界面可见
        frame.setVisible(true);
    }

    //基本框架完成，现在往里面添加东西
    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);
        JLabel adderLabel = new JLabel("➥ 目标URL*");
        adderLabel.setBounds(450, 36, 100, 35);
        panel.add(adderLabel);
        //创建文本域(JTextField函数)用来创建文本域输入信息的
        JTextField adderText = new JTextField();
        adderText.setBounds(40, 36, 400, 30);
        panel.add(adderText);

        //创建Ldap地址JLabel
        JLabel ladpLabel = new JLabel("Ldap地址* ↩");
        ladpLabel.setBounds(40, 80, 100, 35);
        panel.add(ladpLabel);
        JTextField ldapText = new JTextField();
        ldapText.setBounds(120, 80, 320, 30);
        panel.add(ldapText);

        //创建payload
        JLabel payloadLabel = new JLabel("PayLoad*");
        payloadLabel.setBounds(40, 120, 100, 35);
        panel.add(payloadLabel);
        JComboBox payloadBox = new JComboBox();
        String [] FastVersion = {"--请选择fastjson版本--", "fastjson-1.2.24", "fastjson-1.2.41",
                "fastjson-1.2.42", "fastjson-1.2.43", "fastjson-1.2.45", "fastjson-1.2.47",
                "fastjson-1.2.62", "fastjson-1.2.66"};
        Collection VersionList = java.util.Arrays.asList(FastVersion);
        for (Object str:VersionList){
            payloadBox.addItem(str);
        }
        payloadBox.setBounds(40, 150, 340, 30);
        panel.add(payloadBox);

        //payload全选
        JRadioButton allUse = new JRadioButton("全选");
        allUse.setBounds(380, 152, 100, 30);
        panel.add(allUse);

        //add cookie
        JLabel cookieLabel = new JLabel("cookie: ");
        cookieLabel.setBounds(40, 190, 100, 35);
        panel.add(cookieLabel);
        JTextArea cookieArea = new JTextArea();
        cookieArea.setLineWrap(true);
        JScrollPane cookieArea_re = new JScrollPane(cookieArea);
        cookieArea_re.setBounds(100, 200, 520, 60);
        panel.add(cookieArea_re);

        //info输出信息
        JTextArea output = new JTextArea();
        output.setLineWrap(true);
        output.setEnabled(false);
        JScrollPane output_re = new JScrollPane(output);
        output_re.setBounds(40, 280, 580, 290);
        panel.add(output_re);

        //Attack按钮
        JButton attackButton = new JButton("Attack");
        attackButton.setBounds(525, 100, 100, 60);
        panel.add(attackButton);
        //Attack按钮监听器，变量要在监听器里定义
        attackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output.setText("");
                //获取需要的参数
                String url = adderText.getText();
                String ldAddress = ldapText.getText();
                String fjVersion = payloadBox.getSelectedItem().toString();
                String Cookie = cookieArea.getText();
                if (url.equals("") || ldAddress.equals("")){
                    JOptionPane.showMessageDialog(null, "缺少必填项.", "Error",JOptionPane.ERROR_MESSAGE);
                }
                //参数传入攻击接口
                else {
                    output.append("result info ......" + "\n");
                    Api.Attack(url, ldAddress, fjVersion, Cookie, allUse, output);
                }

            }
        });
    }
}