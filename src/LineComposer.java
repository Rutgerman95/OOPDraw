import java.awt.Point;

public class LineComposer implements ShapeComposer {
	
	private MyLine line;
	
	@Override
	public AbstractShape create(Point p) {
		line = new MyLine(p);
		return line;
	}

	@Override
	public void expand(Point p) {
		line.setEnd(p);
	}

	@Override
	public void complete(Point p) {
		line.setEnd(p);
	}
}

