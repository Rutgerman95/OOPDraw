import java.awt.Point;

public interface ShapeComposer {
	
	public AbstractShape create(Point p);
	
	public void expand(Point p);
	
	public void complete(Point p);
}
