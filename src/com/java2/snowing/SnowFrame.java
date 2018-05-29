package com.java2.snowing;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SnowFrame extends JFrame {
	SnowCanvas canvas = new SnowCanvas();

	public SnowFrame() {
		setSize(850, 650);
		setLocation(500, 200);
		add(canvas);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public class SnowCanvas extends JPanel {
		List<Snow> snows = new ArrayList<>();

		public SnowCanvas() {
			setBackground(Color.black);
			for (int i = 0; i < 100; i++) {
				Snow snow = new Snow(this);
				snows.add(snow);
				snow.start();
			}
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			for (int i = 0; i < 100; i++) {
				Snow snow = snows.get(i);
				g.setColor(Color.white);
				g.fillOval(snow.x, snow.y, 10, 10);
				// g.drawString("O", 300, 300);
			}
		}

	}

	public static void main(String[] args) {
		new SnowFrame();
	}
}
