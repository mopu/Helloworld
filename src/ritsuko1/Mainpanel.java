package ritsuko1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Mainpanel extends JPanel {
	// パネルサイズ
	public static final int WIDTH = 540;
	public static final int HEIGHT = 540;
	protected static final Color SHAPE_COLOR = Color.BLUE;
	protected static final Color RUBBER_COLOR = Color.green;

	public Mainpanel() {
		// パネルの推奨サイズを設定、pack()するときに必要
		setPreferredSize(new Dimension(WIDTH, HEIGHT));

		// 変数などの初期化
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// 盤面を描いたり、フィールドを描いたりする
		ManyFigures figure = new ManyFigures();
		figure.run(g);
		System.out.println(System.getProperty("user.dir"));
		LoadImage drowimage = new LoadImage();
		drowimage.save(null);
		drowimage.paint(g);
////		int count = 0;
////		while(count <= 10){
////			figure.move();
////			waitForThreeSeconds();
////
//		}

	}
}