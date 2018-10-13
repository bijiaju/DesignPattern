package create.struct.bridge;
/**
 *设计好以后，不同的功能就可以根据不同的特点进行各自的实现，比如JDBC 
 * @author bee
 *
 */
public class BridgeTest {
	public static void main(String[] args) {
		 Bridge bridge = new MyBridge();  
	     
	     /*调用第一个对象*/  
	     Sourceable source1 = new SourceSub1();  
	     bridge.setSource(source1);  
	     bridge.method();  
	       
	     /*调用第二个对象*/  
	     Sourceable source2 = new SourceSub2();  
	     bridge.setSource(source2);  
	     bridge.method();  
	}
	

}
