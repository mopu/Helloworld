import java.awt.*;

import javax.swing.*;

public class Sample extends JFrame {
	public Sample(){
		setTitle ("mein");
        MainPanel panel = new MainPanel();
        Container contentPane = getContentPane();
        contentPane.add(panel);
        pack();
	}
    public static void main(String[] args) {
        Sample frame = new Sample();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }	
	
}

class MainPanel extends JPanel {
    // パネルサイズ
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;

    public MainPanel() {
        // パネルの推奨サイズを設定、pack()するときに必要
       setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // 変数などの初期化
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // 盤面を描いたり、フィールドを描いたりする
    }
}