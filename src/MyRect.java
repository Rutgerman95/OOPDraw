import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Rectangle2D;

// Class cRect for drawing Rects is derived
// from our 'base class' cShape

class MyRect implements AbstractShape {

	private Rectangle2D.Float rect;
	private Point startPoint, endPoint;
	
	public MyRect(Point p) {
		rect = new Rectangle2D.Float();
		endPoint = new Point(0, 0);
		setStart(p);
	}

	@Override
	public void setStart(Point pt) {
		startPoint = pt;
		rect.setRect(pt.getX(), pt.getY(), endPoint.getX(), endPoint.getY());
	}

	@Override
	public void setEnd(Point pt) {
		endPoint = pt;
		rect.setFrameFromDiagonal(startPoint, pt);
		
	}

	@Override
	public void draw(Graphics2D g) {
		//g.setColor(Color.blue);
		((Graphics2D) g).draw(rect);
		
	}

}

// Class cRect ends
