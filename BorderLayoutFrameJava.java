import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.EventListener;
import javax.swing.JFrame;
import javax.swing.JButton;

public class BorderLayoutFrame extends JFrame implements ActionListener
{
    private JButtom[] buttons;
    private static final String[] names - {"Hide North", "Hide South",
"Hide East", "Hide West", "Hide Center" };
    private BorderLayout layout;
    
    public BorderlayoutFrame()
    {
        super("BorderLayout Demo");
        
        layout = new BorderLayout(5,5);
        setLayout(layout);
        buttons = new JButton[names.length];
        for(int cont = 0; cont < names.length; count++)
        {
            buttons[cont] = new JButtom(names[count]);
            buttons[cont].addActionListener(this);
        }
        add(buttons[0], BorderLayout.NORTH);
        add(buttons[1], BorderLayout.SOUTH);
        add(buttons[2], BorderLayout.EAST);
        add(buttons[3], BorderLayout.WEST);
        add(buttons[4], BorderLayout.CENTER);
    }
    public void actionPerformed(ActionEvent event)
    {
        
        for(JButton button : buttons)
        {
            if (event.getSource()== button)
                button.setVisible(false);
            else
                button.setVisible(true)
        }
        
        layout.layoutContainer(getContentPane());
    }
}