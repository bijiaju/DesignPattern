package create.action.command;

public class Test {
	public static void main(String[] args) {
		 // ���������Receiver  
	  Tv myTv = new Tv();  
	  // ��������ConcreteCommond  
	  CommandOn on = new CommandOn(myTv);  
	   // �ػ�����ConcreteCommond  
	   CommandOff off = new CommandOff(myTv);  
	   // Ƶ���л�����ConcreteCommond  
	   CommandChange channel = new CommandChange(myTv, 2);  
	   // ������ƶ���Invoker  
	   Control control = new Control(on, off, channel);  
	  
	   // ����  
	    control.turnOn();  
	  // �л�Ƶ��  
	   control.changeChannel();  
	   // �ػ�  
	    control.turnOff();  
	}
}
