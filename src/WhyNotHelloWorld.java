import java.awt.*;
import javax.swing.*;

public class WhyNotHelloWorld {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new WhyNotHelloWorldFrame();
            frame.setTitle("WhyNotHelloWorld");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }

}
class WhyNotHelloWorldFrame extends JFrame {
    public WhyNotHelloWorldFrame() {
        add(new WhyNotHelloWorldComponent());
        pack();
    }
}
class WhyNotHelloWorldComponent extends JComponent {
    public static final int MESSAGE_X = 75;
    public static final int MESSAGE_Y = 100;

    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public void paintComponent(Graphics g) {
        g.drawString("I LOVE THE WORLD!!!" +
                "HELLO WORLD!!!", MESSAGE_X,MESSAGE_Y);
    }
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }
}
