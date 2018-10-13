package create.struct.flyweight;

import java.util.Hashtable;

public class FlyweightFactory {
	private Hashtable flyweights = new Hashtable();//----------------------------1  存储各个对象
	public FlyweightFactory(){
		
	}  
	/**
	 * 返回hashtable的大小
	 * @return
	 */
	public int getFlyweightSize(){  
	    return flyweights.size();  
	}  
	
	public Flyweight getFlyWeight(Object obj){
		Flyweight flyweight = (Flyweight) flyweights.get(obj);//----------------2  查找元素是否包含，包含就返回，否则就放入
		if(flyweight == null){//---------------------------------------------------3  
		 //产生新的ConcreteFlyweight  
		    flyweight = new ConcreteFlyweight((String)obj);  
		    flyweights.put(obj, flyweight);//--------------------------------------5  
		}  
        return flyweight;//---------------------------------------------------------6  
	}
}
