package org.tj.XiangQi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import org.tj.XiangQi.view.ChessBoardPanel;

@SuppressWarnings("serial")
public class GameMain extends JFrame {

	private JPanel contentPane;
	
	private static GameMain frame;
	
	private static ChessBoardPanel rightPanel;

	/**
	 * 是否暂停
	 */
	public static boolean PAUSE = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.put("RootPane.setupButtonVisible", false);
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new GameMain();
					frame.setVisible(true);
					frame.setFocusable(true);
					initEventBus();
					initListener();
					initMusic();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 初始化背景音乐
	 * 
	 * @author 唐靖
	 *
	 * @date 2018年6月22日下午11:06:16
	 *
	 */
	protected static void initMusic() {
		

	}

	/**
	 * 初始化eventbus
	 * 
	 * @author 唐靖
	 * @date 2016年10月9日下午10:30:32
	 */
	private static void initEventBus() {
		
	}

	/**
	 * Create the frame.
	 */
	public GameMain() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 800);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(10, 0));

		JLabel titleLabel = new JLabel("中国象棋");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setVerticalAlignment(SwingConstants.TOP);
		titleLabel.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		contentPane.add(titleLabel, BorderLayout.NORTH);

		contentPane.add(titleLabel, BorderLayout.NORTH);

		rightPanel = new ChessBoardPanel();
		// rightPanel.setBackground(Color.red);
		contentPane.add(rightPanel, BorderLayout.CENTER);
		//rightPanel.setBorder(BorderFactory.createTitledBorder("右")); // 设置面板边框，实现分组框的效果，此句代码为关键代码

		rightPanel.setBorder(BorderFactory.createLineBorder(Color.black));// 设置面板边框颜色

	}



	/**
	 * 初始化面板的监听事件
	 * 
	 * @author 唐靖
	 * @date 2016年10月9日下午10:32:31
	 */
	private static void initListener() {
		
	}
}
