package org.tj.XiangQi.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ChessBoardPanel extends JPanel implements Runnable {

	public static int BLOCK_W_COUNT = 9;

	public static int BLOCK_H_COUNT = 10;

	/**
	 * 格子宽度
	 */
	private static int BLOCK_WIDTH = 60;

	public ChessBoardPanel() {
		setVisible(true);
		setLayout(null);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		BufferedImage bi = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_ARGB); // 双缓冲技术防止闪屏
		Graphics jg = bi.createGraphics();
		try {
			for (int x = 0; x < BLOCK_H_COUNT; x++) {
				jg.setColor(Color.DARK_GRAY);
				jg.drawLine(BLOCK_WIDTH, BLOCK_WIDTH * (x + 1), BLOCK_W_COUNT * BLOCK_WIDTH, BLOCK_WIDTH * (x + 1));
			}
			for (int x = 0; x < BLOCK_W_COUNT; x++) {
				jg.setColor(Color.DARK_GRAY);
				jg.drawLine(BLOCK_WIDTH * (x + 1), BLOCK_WIDTH, BLOCK_WIDTH * (x + 1), BLOCK_H_COUNT * BLOCK_WIDTH);
			}
			jg.fillRoundRect(45, 45, 40, 40, 40, 40);

			Font font = new Font("宋体", 20, 25);
			jg.setFont(font);
			jg.setColor(Color.YELLOW);
			jg.drawString("车", 52, 75);

			g.drawImage(bi, 0, 0, this);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
