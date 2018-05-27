package com.java2.snowing;

import java.util.Random;

import com.java2.snowing.SnowFrame.SnowCanvas;

public class Snow extends Thread {
	Random random = new Random();
	int x;
	int y;
	private SnowCanvas snowCanvas;

	public Snow(SnowCanvas snowCanvas) {
		this.snowCanvas=snowCanvas;
		x = random.nextInt(800);
		y = random.nextInt(600);
	}

	@Override
	public void run() {
		for (int i = y; i < 600; i++) {
			// System.out.println(getName()+"("+x+","+y+")");
			y = y + 1;
			x = x + (random.nextInt(3) - 1);
			// System.out.print(new String(new char[x]).replace("\0"," "));
			// System.out.println("o");
			snowCanvas.repaint();
			try {
				sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
