package ritsuko1;


import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;


public class LoadImage extends Canvas{
	private static final long serialVersionUID = 1;
	//public Mainpanel main = new Mainpanel();
	public BufferedImage image;//ウィンドウに表示するイメージ
	public void save(String args[]){

		image = loadImage("dog.png");//表示用のイメージを取り込み 
	}


	//イメージをファイルから取り込む
	// 引数　- Imgaeのファイcanvasル名
	// 戻り値　- 読み込んだイメージ
	BufferedImage loadImage(String name){
		try{
			// 画像の読み込み
			BufferedImage readImage = null;
			if (readImage == null){
				readImage = ImageIO.read(new File(name));
			}
			return readImage;//戻り値に読み込んだイメージをセット
		}
		catch(Exception e){
			//エラー時の処理（エラーを表示）nullを返す
			System.out.println("Err e="+e);//エラーを表示
			return null;//null　を返す
		}
	}

	//表示の必要があれば実行されるメソッド
	public void paint(Graphics g){
		BufferedImage bufferImage=makeImage();//表示用のイメージを作成
		g.drawImage(bufferImage,0,0,this);//作成したイメージを画面に描く
	}

	//描画や保存に必要なイメージを作成する。
	public BufferedImage makeImage(){
		int x2=Mainpanel.WIDTH;//画面の幅を取得
		int y2=Mainpanel.HEIGHT;//画面の高さを取得
		int iw=image.getWidth(this);//イメージの幅を取得
		int ih=image.getHeight(this);//イメージの高さを取得
		int x0=0;//画面左位置
		int y0=0;//画面上端位置
		//			int x1=x2/2;//画面中央位置（横）
		//			int y1=y2/2;//画面中央位置（縦）

		BufferedImage bufferImage=new BufferedImage(x2,y2,BufferedImage.TYPE_INT_BGR);//Buffer用イメージを作成
		Graphics2D g2=bufferImage.createGraphics();//描画用のGraphics2D型変数g2を取得


		g2.setBackground(Color.WHITE);//背景色を白で指定
		g2.clearRect(0, 0, x2, y2);//全体をクリア
		//g2.drawImage(image, x0,y0,x1,y1,Color.WHITE,this);//画面の左上にイメージを縮小して表示
		//g2.drawImage(image,x1,y1,x2,y2,0,0,iw/2,ih/2,this);//画面右下に一部を拡大して表示
		//g2.drawImage(image,x0,y0,x1,y1,0,0,iw,ih,this);//画面右下に一部を拡大して表示
		g2.drawImage(image, x0, y0, x2, y2, 0 ,0,iw,ih,this);

		g2.dispose();//不要になったグラフィクスは廃却

		return bufferImage;//作成したイメージを戻り値として返す
	}
}

	//イメージの保存
	//  image - 保存するイメージ
	//  fileName-保存先のファイル
	//  format - 書式（bmp,BMP.gif,GIF,jpg,JPG,JPEGなどが可能）
	//  戻り値　成功（true）,失敗（false)
	//		boolean saveImage(BufferedImage image,String fileName,String format){
	//			try{
	//				OutputStream out=new FileOutputStream(fileName);//ファイルとアプリを繋ぐ
	//				ImageIO.write(image, format, out);//指定の形式で出力
	//				return true;//成功したらtrueを返す。
	//			}catch(IOException e){
	//				//例外処理が発生したらエラーをコンソールに出して、falseを返す
	//				System.out.println("Err="+e);//エラー出力
	//				return false;//falseを返す
	//			}
	//		}



//
//WindowAdapterは、WindowListerの//class Adapter  extends WindowAdapter implements ActionListener{
//public AppCanvas canvas;
////右上の「×」クリックされると呼び出される
//public void windowClosing(WindowEvent e){
//	System.exit(0);//アプリの終了
//}
//
////ボタンが操作されやらイメージの保存を実行
//public void actionPerformed(ActionEvent e) {
//	BufferedImage image1=canvas.makeImage();//イメージの作成
//	canvas.saveImage(image1, "mopu.gif", "GIF");//保存
//}機能を持ちますが、
//必要なメソッドだけを書けば、WindowListenerとして使えます
//
//class Adapter  extends WindowAdapter implements ActionListener{
//	public AppCanvas canvas;
//	//右上の「×」クリックされると呼び出される
//	public void windowClosing(WindowEvent e){
//		System.exit(0);//アプリの終了
//	}
//
//	//ボタンが操作されやらイメージの保存を実行
//	public void actionPerformed(ActionEvent e) {
//		BufferedImage image1=canvas.makeImage();//イメージの作成
//		canvas.saveImage(image1, "mopu.gif", "GIF");//保存
//	}
//}

//アプリはここから
//アプリはここから実行されます。
//AppCanvas canvas = new AppCanvas();//Canvasの継承クラスのAppCanvasを作成

//main. = canvas;
//Adapterの設定
//		Adapter adapter=new Adapter();//adapter型変数adapterを宣言し、初期値を設定
//		adapter.canvas=canvas;//Adapterヒトイナイクラスのcanvasにcanvasを設定

//Buttonの作成と設定
//		Button button=new Button("イメージの保存");//Buttonの作成
//		button.addActionListener(adapter);//Listenerの追加（イベントの処理先を指定）

//frame2の作成と設定
//Winodwの設定
//		Frame frame2=new Frame();//frame2を作成
//		frame2.setLayout(new BorderLayout());//レイアウトをBorderLayoutに指定
//		frame2.add(button,BorderLayout.NORTH);//textをフレームに追加
//		frame2.add(canvas,BorderLayout.CENTER);//canvasをフレームに追加
//		frame2.addWindowListener(adapter);//Listenerを指定
//		frame2.setSize(600, 600);//サイズ設定
//		frame2.setVisible(true);//表示
//}
//class AppCanvas extends Canvas{
//BufferedImage image;//ウィンドウに表示するイメージ
////コンストラクタ
//}
//AppCanvas(){
//	image=loadImage("dog.png");//表示用のイメージを取り込み 
//}
//
//}