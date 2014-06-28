package ritsuko1;

import java.awt.*;//ウィンドウの表示に必要

import javax.swing.JPanel;
//import java.awt.event.*;//ウィンドウのイベント処理に必要
//import java.awt.image.*;//Imageの取り扱いに必要
//import java.io.*;//Imageの読み込み
	
	
public class ManyFigures extends Mainpanel {
	int x=400,y=400,xv=5,yv=5;
	//Mainpanel mainpanel = new Mainpanel();
	
	public void run(Graphics g){
		g.setColor(SHAPE_COLOR);
		g.fillRect(x,y,50,50);
		}
	public void  move(){
		x+=xv;
		y+=yv;
		if(Mainpanel.WIDTH <x || x < 0){
			xv = -xv;
		}
		if(Mainpanel.HEIGHT <y || y < 0){
			yv = -yv;
		}
		
	}
	public void waitForThreeSeconds() {
		try {
			repaint();
			Thread.sleep(100);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}

