import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Equals implements ActionListener {
    private long score;
    private JTextField field;
    public Equals(long score, JTextField field) {
        this.field=field;
        this.score=score;//to raczej będzie wynik
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
