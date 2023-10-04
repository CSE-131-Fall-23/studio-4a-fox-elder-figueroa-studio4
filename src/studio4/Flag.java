package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		StdDraw.setPenColor (0, 85, 164);
		StdDraw.filledRectangle(5.5, 4, 5.5, 4);
		StdDraw.setPenColor (150, 20, 75);
		StdDraw.filledRectangle(5.5, 12, 5.5, 4);
		StdDraw.setPenColor (201, 4, 0);
		StdDraw.filledRectangle(16.5, 12, 5.5, 4);
		StdDraw.setPenColor (0, 170, 90);
		StdDraw.filledRectangle(16.5, 4, 5.5, 4);
		StdDraw.setPenColor (100, 100, 100);
		StdDraw.filledCircle(11,8,3);
	}
}