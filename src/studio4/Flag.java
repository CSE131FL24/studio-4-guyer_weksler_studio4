package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {

		Color drkg = new Color(0, 102, 0);
		StdDraw.setPenColor(drkg);
		StdDraw.filledSquare(0.5, 0.5, 0.5);
		
		double[] x = {0.25, 0.75, 0.5};
		double[] y = {0.35, 0.35, 0.8};
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledPolygon(x,  y);
		
		double[] xx = {0.25, 0.75, 0.5};
		double[] yy = {0.65, 0.65, 0.2};
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledPolygon(xx,  yy);
		
		Color oranger = new Color(255, 102, 0);
		StdDraw.setPenColor(oranger);
		StdDraw.filledCircle(.5, .5, .2);
		
		Color orangerrr = new Color(255, 153, 51);
		StdDraw.setPenColor(orangerrr);
		StdDraw.filledCircle(.515, .515, .18);
		
		Color brown = new Color(153, 102, 51);
		StdDraw.setPenColor(brown);
		StdDraw.filledCircle(.6, .6, .02);


	}
}