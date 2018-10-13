package create.struct.flyweight;

public class ConcreteFlyweight extends Flyweight{
	private String string;  
	public ConcreteFlyweight(String str){  
	    string = str;  
	}  
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("Concrete---Flyweight : " + string);
	}

}
