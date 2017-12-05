package com.steven;

public class ScoreArray {

	public static void main(String[] args) {
		int scorces[][] = new int[5][3];
		scorces[0][0] = 11;
		scorces[0][1] = 22;
		scorces[0][2] = 33;

		scorces[1][0] = 44;
		scorces[1][1] = 55;
		scorces[1][2] = 66;

		scorces[2][0] = 77;
		scorces[2][1] = 88;
		scorces[2][2] = 99;

		scorces[3][0] = 12;
		scorces[3][1] = 34;
		scorces[3][2] = 56;

		scorces[4][0] = 78;
		scorces[4][1] = 90;
		scorces[4][2] = 12;

		for (int i = 0; i < scorces.length; i++) {
			System.out.print(scorces[i][0] + "\t" + scorces[i][1] + "\t" + scorces[i][2]);
			int average = ((scorces[i][0] + scorces[i][1] + scorces[i][2]) / 3);
			if (average < 60) {
				System.out.println("\t"+average + "*");
			} else {
				System.out.println("\t"+average);
			}
		}
	}
}
