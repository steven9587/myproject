package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 有一遊戲場地，長寬由執行時決定，場地中亂數產生陷阱 陷阱數也由當時才決定
 * 
 * 有一個玩家在這場地中，初始PH值為100，走一步消耗1HP， 撞到邊界扣5HP，掉到陷阱扣20HP
 * 
 * 有個檔案(maze.txt)資訊如下： 6,4 5 6,8,2,4,2,2,6,6,8,4,2,2,6
 */

public class MazeMain {
	public MazeMain() {
		try {
			FileReader fr = new FileReader("maze.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			String tokens[] = line.split(",");
			int col = Integer.parseInt(tokens[0]);
			int row = Integer.parseInt(tokens[1]);
			line = br.readLine();
			int trapCount = Integer.parseInt(line);
			Maze m =new Maze(row, col, trapCount);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		new MazeMain();
	}

	public class Maze {
		int row;
		int col;
		int trapCount;
		int[] trapLocation;
		Player player = new Player();

		public Maze(int row, int col, int trapCount) {
			this.row = row;
			this.col = col;
			this.trapCount = trapCount;
		}

		public void setRow(int row) {
			this.row = row;
		}

		public int getRow() {
			return row;
		}

		public int getCol() {
			return col;
		}

		public void setCol(int col) {
			this.col = col;
		}

		public int getTrapCount() {
			return trapCount;
		}

		public void setTrapCount(int trapCount) {
			this.trapCount = trapCount;
		}

		public int[] getTrapLocation() {
			return trapLocation;
		}

		public void setTrapLocation(int[] trapLocation) {
			this.trapLocation = trapLocation;
		}

		public Player getPlayer() {
			return player;
		}

		public void setPlayer(Player player) {
			this.player = player;
		}

	}

	public class Player {
		int HP = 100;
		int location = 0;
	}

}
