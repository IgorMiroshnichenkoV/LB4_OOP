import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameApp extends JFrame {
    Door door;
    public JFrameApp() {
        JFrame frame = new JFrame("Двері");
        frame.setBounds(450, 100, 700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextArea area = new JTextArea(15, 5);
        area.setBounds(10, 210, 280, 120);
        frame.add(area);
        area.setVisible(false);
        area.setLineWrap(true);

        JButton btnStart = new JButton("Створити");
        btnStart.setBounds(10, 10, 100, 30);
        frame.add(btnStart);

        JButton btnClear = new JButton("Очистити");
        btnClear.setBounds(120, 10, 100, 30);
        frame.add(btnClear);
        btnClear.setVisible(false);

        JButton btnEnter = new JButton("Ввести");
        btnEnter.setBounds(10, 170, 100, 30);
        frame.add(btnEnter);
        btnEnter.setVisible(false);

        JButton btnDelete = new JButton("Видалити");
        btnDelete.setBounds(120, 170, 100, 30);
        frame.add(btnDelete);
        btnDelete.setVisible(false);

        JButton btnOpen = new JButton("Відчинити");
        btnOpen.setBounds(10, 340, 100, 30);
        frame.add(btnOpen);
        btnOpen.setVisible(false);

        JButton btnClose = new JButton("Зачинити");
        btnClose.setBounds(10, 340, 100, 30);
        frame.add(btnClose);
        btnClose.setVisible(false);

        JButton btnSize = new JButton("Змінити розмір");
        btnSize.setBounds(330, 10, 120, 30);
        frame.add(btnSize);
        btnSize.setVisible(false);

        JButton btnClearSize = new JButton("Очистити");
        btnClearSize.setBounds(460, 10, 90, 30);
        frame.add(btnClearSize);
        btnClearSize.setVisible(false);

        JButton btnEnterSize = new JButton("Змінити");
        btnEnterSize.setBounds(330, 110, 105, 30);
        frame.add(btnEnterSize);
        btnEnterSize.setVisible(false);

        JButton btnDeleteSize = new JButton("Видалити");
        btnDeleteSize.setBounds(445, 110, 105, 30);
        frame.add(btnDeleteSize);
        btnDeleteSize.setVisible(false);

        JButton btnColor = new JButton("Змінити колір");
        btnColor.setBounds(330, 220, 120, 30);
        frame.add(btnColor);
        btnColor.setVisible(false);

        JButton btnClearColor = new JButton("Очистити");
        btnClearColor.setBounds(460, 220, 90, 30);
        frame.add(btnClearColor);
        btnClearColor.setVisible(false);

        JButton btnEnterColor = new JButton("Змінити");
        btnEnterColor.setBounds(330, 290, 105, 30);
        frame.add(btnEnterColor);
        btnEnterColor.setVisible(false);

        JButton btnDeleteColor = new JButton("Видалити");
        btnDeleteColor.setBounds(445, 290, 105, 30);
        frame.add(btnDeleteColor);
        btnDeleteColor.setVisible(false);

        JTextField txt1 = new JTextField();
        txt1.setBounds(10, 50, 210, 20);
        frame.add(txt1);
        txt1.setVisible(false);

        JTextField txt2 = new JTextField();
        txt2.setBounds(10, 80, 210, 20);
        frame.add(txt2);
        txt2.setVisible(false);

        JTextField txt3 = new JTextField();
        txt3.setBounds(10, 110, 210, 20);
        frame.add(txt3);
        txt3.setVisible(false);

        JTextField txt4 = new JTextField();
        txt4.setBounds(10, 140, 210, 20);
        frame.add(txt4);
        txt4.setVisible(false);

        JTextField txt5 = new JTextField();
        txt5.setBounds(330, 50, 220, 20);
        frame.add(txt5);
        txt5.setVisible(false);

        JTextField txt6 = new JTextField();
        txt6.setBounds(330, 80, 220, 20);
        frame.add(txt6);
        txt6.setVisible(false);

        JTextField txt7 = new JTextField();
        txt7.setBounds(330, 260, 220, 20);
        frame.add(txt7);
        txt7.setVisible(false);

        JLabel label1 = new JLabel("Матеріал");
        label1.setBounds(230, 50, 210, 20);
        frame.add(label1);
        label1.setVisible(false);

        JLabel label2 = new JLabel("Висота");
        label2.setBounds(230, 80, 210, 20);
        frame.add(label2);
        label2.setVisible(false);

        JLabel label3 = new JLabel("Ширина");
        label3.setBounds(230, 110, 210, 20);
        frame.add(label3);
        label3.setVisible(false);

        JLabel label4 = new JLabel("Колір");
        label4.setBounds(230, 140, 210, 20);
        frame.add(label4);
        label4.setVisible(false);

        JLabel label9 = new JLabel("Відчинено");
        label9.setBounds(120, 345, 210, 20);
        frame.add(label9);
        label9.setVisible(false);

        JLabel label10 = new JLabel("Зачинено");
        label10.setBounds(120, 345, 210, 20);
        frame.add(label10);
        label10.setVisible(false);

        JLabel label11 = new JLabel("Висота");
        label11.setBounds(560, 50, 100, 20);
        frame.add(label11);
        label11.setVisible(false);

        JLabel label12 = new JLabel("Ширина");
        label12.setBounds(560, 80, 100, 20);
        frame.add(label12);
        label12.setVisible(false);

        JLabel label13 = new JLabel();
        label13.setBounds(330, 150, 270, 20);
        frame.add(label13);
        label13.setVisible(false);

        JLabel label14 = new JLabel();
        label14.setBounds(330, 180, 270, 20);
        frame.add(label14);
        label14.setVisible(false);

        JLabel label15 = new JLabel("Колір");
        label15.setBounds(560, 260, 100, 20);
        frame.add(label15);
        label15.setVisible(false);

        JLabel label16 = new JLabel();
        label16.setBounds(330, 330, 270, 20);
        frame.add(label16);
        label16.setVisible(false);

        frame.setVisible(true);

        btnStart.addActionListener(actionEvent -> {
            door = new Door();
            txt1.setVisible(true);
            txt2.setVisible(true);
            txt3.setVisible(true);
            txt4.setVisible(true);
            label1.setVisible(true);
            label2.setVisible(true);
            label3.setVisible(true);
            label4.setVisible(true);
            btnClear.setVisible(true);
            btnEnter.setVisible(true);
            btnDelete.setVisible(true);
            btnStart.setEnabled(false);
        });

        btnClear.addActionListener(actionEvent -> {
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            txt4.setText("");
        });

        btnClearSize.addActionListener(actionEvent -> {
            txt5.setText("");
            txt6.setText("");
        });

        btnClearColor.addActionListener(actionEvent -> txt7.setText(""));

        btnEnter.addActionListener(actionEvent -> {
            door.setMaterial(txt1.getText());
            door.setHeight(Integer.parseInt(txt2.getText()));
            door.setWidth(Integer.parseInt(txt3.getText()));
            door.setColor(txt4.getText());

            area.setText("Матеріал: " + door.getMaterial() + "\nВисота: " + door.getHeight() + "\nШирина: " + door.getWidth() + "\nКолір: " + door.getColor());

            area.setVisible(true);

            btnOpen.setVisible(true);
            btnSize.setVisible(true);
            btnColor.setVisible(true);

            btnSize.setEnabled(true);
            btnColor.setEnabled(true);
        });

        btnEnterSize.addActionListener(actionEvent -> {
            door.size(door.getHeight(), door.getWidth());

            if(Integer.parseInt(txt5.getText()) >= door.getHeight()) {
                label13.setVisible(true);
                label13.setText("Введіть висоту меншу " + door.getHeight() + "!");
            }else {
                label13.setVisible(true);
                door.setHeight(Integer.parseInt(txt5.getText()));
                label13.setText("Висоту змінено на: " + door.getHeight());
                System.out.println("height Size: " + door.getHeight());
            }

            if(Integer.parseInt(txt6.getText()) >= door.getWidth()) {
                label14.setVisible(true);
                label14.setText("Введіть ширину меншу " + door.getWidth() + "!");
            }else {
                label14.setVisible(true);
                door.setWidth(Integer.parseInt(txt6.getText()));
                label14.setText("Ширину змінено на: " + door.getWidth());
                System.out.println("width Size: " + door.getWidth());
            }
        });

        btnEnterColor.addActionListener(actionEvent -> {
            door.paint(door.getColor());
            label16.setVisible(true);
            door.setColor(txt7.getText());
            label16.setText("Колір змінено на: " + door.getColor());
            System.out.println("color Size: " + door.getColor());
        });

        btnSize.addActionListener(actionEvent -> {
            txt5.setVisible(true);
            txt6.setVisible(true);

            label11.setVisible(true);
            label12.setVisible(true);

            btnClearSize.setVisible(true);
            btnEnterSize.setVisible(true);
            btnDeleteSize.setVisible(true);

            btnSize.setEnabled(false);

        });

        btnColor.addActionListener(actionEvent -> {
            txt7.setVisible(true);

            label15.setVisible(true);

            btnClearColor.setVisible(true);
            btnEnterColor.setVisible(true);
            btnDeleteColor.setVisible(true);

            btnColor.setEnabled(false);
        });

        btnDelete.addActionListener(actionEvent -> {
            label13.setText("");
            label14.setText("");
            label16.setText("");

            area.setVisible(false);

            btnOpen.setVisible(false);
            btnClose.setVisible(false);
            btnSize.setVisible(false);
            btnClearSize.setVisible(false);
            btnEnterSize.setVisible(false);
            btnDeleteSize.setVisible(false);
            btnColor.setVisible(false);
            btnClearColor.setVisible(false);
            btnEnterColor.setVisible(false);
            btnDeleteColor.setVisible(false);

            label9.setVisible(false);
            label10.setVisible(false);
            label11.setVisible(false);
            label12.setVisible(false);
            label15.setVisible(false);

            txt5.setVisible(false);
            txt6.setVisible(false);
            txt7.setVisible(false);
        });

        btnDeleteSize.addActionListener(actionEvent -> {
            label13.setText("");
            label14.setText("");
        });

        btnDeleteColor.addActionListener(actionEvent -> label16.setText(""));

        btnOpen.addActionListener(actionEvent -> {
            door.open();
            if(door.isOpen()) {
                label9.setVisible(true);
            }
            btnClose.setVisible(true);
            btnOpen.setVisible(false);
            label10.setVisible(false);
        });

        btnClose.addActionListener(actionEvent -> {
            door.close();
            if(door.isClose()) {
                label10.setVisible(true);
            }
            btnOpen.setVisible(true);
            btnClose.setVisible(false);
            label9.setVisible(false);
        });
    }
}
