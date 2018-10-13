package create.action.strategy;

public class Zhaoyun {
	public static void main(String[] args) {  
	     Context context;  
	  
	     System.out.println("----------�յ����ʹ�õ�һ������---------------");  
	     context = new Context(new BackDoor());  
	     context.operate();  
	     System.out.println("\n");  
	  
	     System.out.println("----------�����ֲ�˼��ʹ�õڶ�������---------------");  
	     context.setStrategy(new GivenGreenLight());  
	     context.operate();  
	     System.out.println("\n");  
	  
	     System.out.println("----------��Ȩ��׷�����ˣ�ʹ�õ���������---------------");  
	     context.setStrategy(new BlackEnemy());  
	     context.operate();  
	     System.out.println("\n");  
	 }  

}
