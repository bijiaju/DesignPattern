package create.action.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * PS:如果是抽象方法的话，就可以部分实现
 * @author bee
 *
 */
public abstract class AbstractSubject implements Subject {  
	private Vector<Observer> vector = new Vector<Observer>();  
    @Override  
    public void add(Observer observer) {  
        vector.add(observer);  
    }  
  
    @Override  
    public void del(Observer observer) {  
        vector.remove(observer);  
    }  
    
    @Override  
    public void notifyObservers() {  
        Enumeration<Observer> enumo = vector.elements();  
        while(enumo.hasMoreElements()){  
            enumo.nextElement().update();  //这个接口方法是自己的
        }  
    }  
}
