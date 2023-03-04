package lab04;
public class LAB04 {
    public class Circle {
	private String color;
	private double radius;
	public Circle(String color, double radius) {
		this.color=color;
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius=radius;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color=color;
	}

public class Cylinder extends Circle {
	private double height;
	public Cylinder(String color, double radius, double height) {
		super(color, radius);
		this.height=height;
	}
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height=height;
	}	
        public double getvolume(){
        double volume = 0;
        return volume ;
    }
        }
}
    public class Main{
	public static void main(String[] args) {	
            Circle circle= new Circle(blue, 4);
            Cylinder cylinder = new Cylinder ();
              System.out.println("Circle: ");
              System.out.println("Cylinder: ");
              System.out.println("Chiều cao hình trụ: "+cylinder.getHeight);
    }
    }
}