import java.awt.Container;
import java.net.URL;
import java.lang.*;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/*参照P328例18.2，建立一个图形界面，上面有一朵雪花在飘动，
 * 雪花飘动的方向是随机的，但总体是从上往下、从左往右。*/

class SwingAndThread extends JFrame {
	private JLabel jLabel = new JLabel();
	private static Thread thread;
	private int countx = 0;
	private int county = 0;
	private Container container = getContentPane();

	public SwingAndThread() {
		setBounds(200, 200, 250, 100);
		container.setLayout(null);
		URL url = SwingAndThread.class.getResource("/icon.jpg");
		Icon icon = new ImageIcon(url);
		jLabel.setIcon(icon);
		jLabel.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel.setBounds(10, 10, 200, 50);
		jLabel.setOpaque(true);
		thread = new Thread(new Runnable() {

			@Override
			public void run() {
				double randx = Math.random();
				int changex = (int) (randx * 5);
				double randy = Math.random();
				int changey = (int) (randy * 5);

				while (countx <= 200 || county <= 200) {
					jLabel.setBounds(countx, county, 200, 50);
					try {
						Thread.sleep(300);
					} catch (Exception e) {
						e.printStackTrace();
					}

					countx += changex;
					county += changey;

					if (countx == 200) {
						countx = 10;
					}
					if (county == 200) {
						county = 10;
					}
				}

			}
		});
		thread.start();
		container.add(jLabel);
		setVisible(true);

		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
	}
}

public class Lab12_1 {

	public static void main(String[] args) {
		new SwingAndThread();

	}

}
