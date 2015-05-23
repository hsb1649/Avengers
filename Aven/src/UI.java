import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.SwingConstants;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;


public class UI extends JFrame {

	private JPanel contentPane;
	private JPanel startPanel;
	private JPanel selectPanel;
	private JPanel gamePanel;
	private JPanel exitPanel;
	private JLabel lblNewLabel;
	private JLabel lblCaptionAmeria;
	private JLabel lblIronMan;
	private JPanel gameVeiw;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel character;
	private JLabel block;
	private JLabel background;
	
	public UI() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 860);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		selectPanel = new JPanel();
		selectPanel.setBackground(Color.BLACK);
		selectPanel.setVisible(false);
		
		startPanel = new JPanel();
		startPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				startPanel.setVisible(false);
				selectPanel.setVisible(true);
			}
		});
		
		gamePanel = new JPanel();
		gamePanel.setVisible(false);
		gamePanel.setBounds(0, 0, 1274, 832);
		contentPane.add(gamePanel);
		gamePanel.setLayout(null);
		
		gameVeiw = new JPanel();
		gameVeiw.setBounds(0, 98, 1275, 640);
		gamePanel.add(gameVeiw);
		gameVeiw.setLayout(null);
		
		character = new JLabel();
		character.setForeground(Color.GRAY);
		character.setBackground(Color.BLACK);
		character.setBounds(73, 214, 111, 177);
		gameVeiw.add(character);
		
		block = new JLabel("");
		block.setBackground(Color.LIGHT_GRAY);
		block.setBounds(0, 0, 200, 640);
		gameVeiw.add(block);
		
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 1275, 98);
		gamePanel.add(panel);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 739, 1275, 93);
		gamePanel.add(panel_1);
		startPanel.setBounds(0, 0, 1274, 832);
		contentPane.add(startPanel);
		startPanel.setLayout(null);
		
		JLabel startLabel = new JLabel("Click to Game Start");
		startLabel.setForeground(Color.LIGHT_GRAY);
		startLabel.setHorizontalAlignment(SwingConstants.CENTER);
		startLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
		startLabel.setBounds(403, 538, 503, 55);
		startPanel.add(startLabel);
		
		background = new JLabel();
		background.setIcon(new ImageIcon(getClass().getResource("").getPath()+"배경화면.jpg"));
		background.setBounds(0, 0, 1274, 832);
		startPanel.add(background);
		selectPanel.setBounds(0, 0, 1274, 832);
		contentPane.add(selectPanel);
		selectPanel.setLayout(null);
		
		JButton hawkEye = new JButton("HawkEye");
		hawkEye.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectPanel.setVisible(false);
				gamePanel.setVisible(true);
				character.setText("호크아이 선택됨");
			}
		});
		hawkEye.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				hawkEye.setIcon(new ImageIcon(getClass().getResource("").getPath()+"호크아이.jpg"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				hawkEye.setIcon(new ImageIcon(getClass().getResource("").getPath()+"호크아이2.jpg"));
			}
		});
		hawkEye.setIcon(new ImageIcon(getClass().getResource("").getPath()+"호크아이2.jpg"));
		hawkEye.setBackground(Color.GRAY);
		hawkEye.setBounds(26, 99, 390, 512);
		selectPanel.add(hawkEye);
		
		JButton captin = new JButton();
		captin.setIcon(new ImageIcon(getClass().getResource("").getPath()+"캡틴아메리카2.jpg"));
		captin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectPanel.setVisible(false);
				gamePanel.setVisible(true);
				character.setText("캡틴아메리카 선택됨");
			}
		});
		captin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				captin.setIcon(new ImageIcon(getClass().getResource("").getPath()+"캡틴아메리카.jpg"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				captin.setIcon(new ImageIcon(getClass().getResource("").getPath()+"캡틴아메리카2.jpg"));
			}
		});
		captin.setBackground(Color.GRAY);
		captin.setBounds(442, 99, 390, 512);
		selectPanel.add(captin);
		
		JButton Ironman = new JButton("Ironman");
		Ironman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectPanel.setVisible(false);
				gamePanel.setVisible(true);
				character.setText("아이언맨 선택됨");
			}
		});
		Ironman.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Ironman.setIcon(new ImageIcon(getClass().getResource("").getPath()+"아이언맨.jpg"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Ironman.setIcon(new ImageIcon(getClass().getResource("").getPath()+"아이언맨2.jpg"));
			}
		});
		Ironman.setIcon(new ImageIcon(getClass().getResource("").getPath()+"아이언맨2.jpg"));
		Ironman.setBackground(Color.GRAY);
		Ironman.setBounds(858, 99, 390, 512);
		selectPanel.add(Ironman);
		
		lblNewLabel = new JLabel("Hawk Eye");
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Narrow", Font.PLAIN, 35));
		lblNewLabel.setBounds(72, 647, 289, 40);
		selectPanel.add(lblNewLabel);
		
		lblCaptionAmeria = new JLabel("Caption America");
		lblCaptionAmeria.setForeground(Color.LIGHT_GRAY);
		lblCaptionAmeria.setHorizontalAlignment(SwingConstants.CENTER);
		lblCaptionAmeria.setFont(new Font("Arial Narrow", Font.PLAIN, 35));
		lblCaptionAmeria.setBounds(493, 647, 289, 40);
		selectPanel.add(lblCaptionAmeria);
		
		lblIronMan = new JLabel("Iron Man");
		lblIronMan.setForeground(Color.LIGHT_GRAY);
		lblIronMan.setHorizontalAlignment(SwingConstants.CENTER);
		lblIronMan.setFont(new Font("Arial Narrow", Font.PLAIN, 35));
		lblIronMan.setBounds(914, 647, 289, 40);
		selectPanel.add(lblIronMan);
		
		exitPanel = new JPanel();
		exitPanel.setVisible(false);
		exitPanel.setBounds(0, 0, 1274, 832);
		contentPane.add(exitPanel);
		exitPanel.setLayout(null);
	}
}
