package create.struct.adapter;
/**
 * ����������
 * @author bee
 *
 */
//�Ѵ��ڵġ��������⹦�ܡ������������Ǽ��еı�׼�ӿڵ���      ŷ�޲��
class Adaptee {  
public void specificRequest() {  
   System.out.println("����������� ���⹦��...");  
}  
}  

//Ŀ��ӿڣ����Ϊ��׼�ӿ�  
interface Target {  
public void request(); // �ܹ�����ŷ�޲�׵Ĳ�ͷ
}  

//����Ŀ���ֻ࣬�ṩ��ͨ����  
class ConcreteTarget implements Target {  
public void request() {  
   System.out.println("��ͨ�� ���� ��ͨ����...");  
}  
}  
//�������ֱ࣬�ӹ����������࣬ͬʱʵ�ֱ�׼�ӿ�  
class Adapter implements Target{  
 // ֱ�ӹ�����������  
 private Adaptee adaptee;  
   
 // ����ͨ�����캯�����������Ҫ����ı����������  
 public Adapter (Adaptee adaptee) {  
     this.adaptee = adaptee;  
 }  
   
 public void request() {  //�ܹ�����ŷ�޲�׵Ĳ�ͷ
     // ������ʹ��ί�еķ�ʽ������⹦��  
     this.adaptee.specificRequest();  //�й���ͷ
 }  
}  


public class Client1 {
	
	 public static void main(String[] args) {  
	        // ʹ����ͨ������  
	        Target concreteTarget = new ConcreteTarget();  
	        concreteTarget.request();  
	          
	        // ʹ�����⹦���࣬�������࣬  
	        // ��Ҫ�ȴ���һ����������Ķ�����Ϊ����  
	        Target adapter = new Adapter(new Adaptee());  
	        adapter.request();  
	    }  

}
