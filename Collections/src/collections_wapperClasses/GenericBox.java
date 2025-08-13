package collections_wapperClasses;

public class GenericBox <T extends Number> {
	
	private T length;
	private T breadth;
	private T radius;
	private T side;
	private T height;
	private T base;
	
	// default constructor
	 public GenericBox() {
	        this.length = null;  this.base = null;  this.side = null;
	        this.breadth = null; this.radius = null;   this.height = null;
	    }
	 
	 // setters and getters 
	
	public T getLength() {
		return length;
	}


	public void setLength(T length) {
		this.length = length;
	}


	public T getBreadth() {
		return breadth;
	}


	public void setBreadth(T breadth) {
		this.breadth = breadth;
	}


	public T getRadius() {
		return radius;
	}


	public void setRadius(T radius) {
		this.radius = radius;
	}


	public T getSide() {
		return side;
	}


	public void setSide(T side) {
		this.side = side;
	}


	public T getHeight() {
		return height;
	}


	public void setHeight(T height) {
		this.height = height;
	}


	public T getBase() {
		return base;
	}


	public void setBase(T base) {
		this.base = base;
	}



	
	
	public static void main(String[] args) {
		// area of rectangle
		
		System.out.println("Area of rectangle is: ");
		
		 GenericBox<Integer> rectangle = new GenericBox<>();

	        rectangle.setLength(10);
	        rectangle.setBreadth(20);
	        

	        int area = rectangle.getLength() * rectangle.getBreadth();

	        System.out.println (area);
	        
	        // area of circle
	        System.out.println("area of circle is :");
	        
	        GenericBox<Double> radius = new GenericBox<>();
	        radius.setRadius(10.0);
	         
	        double circleArea = Math.PI * radius.getRadius() * radius.getRadius();
	        
	        System.out.println(circleArea);
	        
	        // perimeter of sqaure
	        
	        System.out.println("perimeter of square is :");
	        
	        GenericBox<Float> side = new GenericBox<>();
	        
	        side.setSide(20f);
	        
	        float squarePerimeter = 4 * side.getSide();
	        
	        System.out.println( squarePerimeter);
	        
	        // area of triangle 
	        
	        System.out.println("area of triangle is :");
	        GenericBox<Double> triangle = new GenericBox<>();

	        triangle.setBase(4.0);
	        triangle.setHeight(6.0);

	        double triangleArea = 0.5 * triangle.getBase() * triangle.getHeight();
	        System.out.println(triangleArea);
	    
	     
	}

}
