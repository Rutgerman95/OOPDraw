import java.awt.Graphics2D;
import java.awt.Point;

/**
 * base class AbstractShape
 *
 */
public interface AbstractShape

{
	// Data members
	
	public void setStart(Point pt);

	public void setEnd(Point pt);

	public void draw(Graphics2D g);

}

// Base class cShape ends
