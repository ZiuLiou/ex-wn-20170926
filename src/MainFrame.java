import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame {
    private Button btnAdd = new Button("Add");
    private Label lab = new Label(">_<");
    private  int count = 0;
    public MainFrame(){
        initComp();
    }
    private void initComp(){
        this.setBounds(100, 100, 500, 500);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
          System.exit(0);
            }
        });
        this.setLayout(null);
        lab.setBounds(50,50,120,30);
        this.add(lab);
        btnAdd.setBounds(100,100,100,30);
        this.add(btnAdd);
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                MainFrame.this.setTitle(Integer.toString(count));
                lab.setText(Integer.toString(count));


            }
        });
    }
    }
