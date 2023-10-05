package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapeType;
		shapeType = in.next(); 
		int redComponent; 
		redComponent = in.nextInt(); 
		int greenComponent; 
		greenComponent = in.nextInt(); 
		int blueComponent; 
		blueComponent = in.nextInt(); 
		boolean isFilled; 
		isFilled = in.nextBoolean(); 
		double x; 
		x = in.nextDouble(); 
		double y; 
		y = in.nextDouble(); 
		double halfWidth; 
		halfWidth = in.nextDouble(); 
		double halfHeight; 
		halfHeight = in.nextDouble();
		
		StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
		if(isFilled = true) {
			StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
		} else {
		StdDraw.rectangle(x, y, halfWidth, halfHeight);
		}
		
	}
}
