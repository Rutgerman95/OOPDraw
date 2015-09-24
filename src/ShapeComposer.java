
public interface ShapeComposer {
	
	public AbstractShape A;
	
	public MyLine s;

	public MyOval o;

	public MyRect r;
	
	public MyRoundRect a;
	
	public AbstractShape setLineComposer(AbstractShape A);{
		OOPDraw2 oopdraw = new OOPDraw2();
		if (oopdraw.bline = true){ 
		A = s;}
	}
	
	public AbstractShape setOValComposer(AbstractShape A);{
		OOPDraw2 oopdraw = new OOPDraw2();
		if (oopdraw.boval = true){ 
		A = o;}
	}
	
	public AbstractShape setRectComposer(AbstractShape A);{
		OOPDraw2 oopdraw = new OOPDraw2();
		if (oopdraw.brect = true){ 
		A = r;}
	}
	
	public AbstractShape setRoundRectComposer(AbstractShape A);{
		OOPDraw2 oopdraw = new OOPDraw2();
		if (oopdraw.bround = true){ 
		A = a;}
	}

	public void create(x:int, y:int)();
	
	public void expand(x:int, y:int);
	
	public void complete(x:int, y:int);
}
