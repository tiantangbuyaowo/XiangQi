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
	private static int BLOCK_WIDTH = 0;

	/**
	 * 格子高度
	 */
	private static int BLOCK_HEIGHT = 0;
	/**
	 * 最小左右空隙
	 */
	public static int LEFT_RIGHT_GAP = 5;

	/**
	 * 最小上下空隙
	 */
	public static int TOP_BOTTOM_GAP = 5;
	public ChessBoardPanel() {
		setVisible(true);
		setLayout(null);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		
		if (BLOCK_WIDTH == 0 && BLOCK_HEIGHT == 0) {
			BLOCK_WIDTH = (int) ((this.getWidth() - (LEFT_RIGHT_GAP * 2)) / BLOCK_W_COUNT);
			BLOCK_HEIGHT = (int) ((this.getHeight() - (TOP_BOTTOM_GAP * 2)) / BLOCK_H_COUNT);
			if (BLOCK_WIDTH != BLOCK_HEIGHT) {
				// System.out.println(BLOCK_WIDTH + "-------" + BLOCK_HEIGHT);
				int temp = Math.max(BLOCK_WIDTH, BLOCK_HEIGHT);
				BLOCK_WIDTH = temp;
				BLOCK_HEIGHT = temp;
			}
		}
		BufferedImage bi = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_ARGB); // 双缓冲技术防止闪屏
		Graphics jg = bi.createGraphics();
		try {
			for (int x = 0; x < BLOCK_H_COUNT; x++) {
					jg.setColor(Color.DARK_GRAY);
					jg.drawLine(0, BLOCK_WIDTH * x, BLOCK_W_COUNT *BLOCK_WIDTH, BLOCK_WIDTH * x);
				}
			for (int x = 0; x < BLOCK_W_COUNT; x++) {
				jg.setColor(Color.DARK_GRAY);
				jg.drawLine(BLOCK_WIDTH * x, 0,BLOCK_WIDTH * x ,  BLOCK_H_COUNT *BLOCK_WIDTH);
			}
			jg.fillRoundRect(20, 0, 40, 40, 40, 40);
	
			Font font = new Font("宋体", 20, 25);
			jg.setFont(font);
			jg.setColor(Color.WHITE);
			jg.drawString("车", 27, 30);
			
			
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
