package create.struct.flyweight;

import java.util.Hashtable;

public class FlyweightFactory {
	private Hashtable flyweights = new Hashtable();//----------------------------1  �洢��������
	public FlyweightFactory(){
		
	}  
	/**
	 * ����hashtable�Ĵ�С
	 * @return
	 */
	public int getFlyweightSize(){  
	    return flyweights.size();  
	}  
	
	public Flyweight getFlyWeight(Object obj){
		Flyweight flyweight = (Flyweight) flyweights.get(obj);//----------------2  ����Ԫ���Ƿ�����������ͷ��أ�����ͷ���
		if(flyweight == null){//---------------------------------------------------3  
		 //�����µ�ConcreteFlyweight  
		    flyweight = new ConcreteFlyweight((String)obj);  
		    flyweights.put(obj, flyweight);//--------------------------------------5  
		}  
        return flyweight;//---------------------------------------------------------6  
	}
}
