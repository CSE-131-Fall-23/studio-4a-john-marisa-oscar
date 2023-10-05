package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setCanvasSize(500, 500); 
		StdDraw.setPenColor(0, 170, 0); 
		StdDraw.filledRectangle(0.5, 0.5, 0.3, 0.05); 
		StdDraw.filledRectangle(0.5, 0.7, 0.3, 0.05);
		StdDraw.setPenColor(170, 0, 0); 
		StdDraw.filledRectangle(0.5, 0.4, 0.3, 0.05);
		StdDraw.filledRectangle(0.5, 0.6, 0.3, 0.05);
		StdDraw.setPenColor(0, 0, 170); 
		StdDraw.text(0.5, 0.6, "John Marisa Oscar");
		StdDraw.setPenColor(StdDraw.MAGENTA);
		StdDraw.text(0.5, 0.5, "The best country of all time"); 
	}
}