import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MainFrame extends Frame {
    private Button btnAdd = new Button("Add");
    private Button btnExit = new Button("Exit");
    private Button btnSub = new Button("Sub");
    private Label lab = new Label(">_<");
    private int count = 0, labX=50,labY=50;
    private Timer t1;

    public MainFrame() {
        initComp();
    }

    private void initComp() {
        this.setBounds(100, 100, 500, 500);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setLayout(null);
        lab.setBounds(labX, labY, 120, 30);
        this.add(lab);

        btnAdd.setBounds(100, 100, 100, 30);
        this.add(btnAdd);
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MainFrame.this.setTitle(Integer.toString(count));
               lab.setText(Integer.toString(count++));
                t1.start();
            }
        });
        btnExit.setBounds(220, 100, 100, 30);
        this.add(btnExit);
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnSub.setBounds(340, 100, 100, 30);
        this.add(btnSub);
        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.this.setTitle(Integer.toString(count));
                lab.setText(Integer.toString(count--));
            }
        });
 t1 = new Timer(200, new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent e) {
        labX += 8;
        lab.setLocation(labX,labY);
     }
 });
}}