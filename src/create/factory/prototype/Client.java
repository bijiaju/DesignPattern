package create.factory.prototype;
/**
 * ʹ��ԭ��ģʽ���������ֱ��newһ��������������Ҫ�õĶ࣬��ΪObject���clone������һ�����ط�����
 * ��ֱ�Ӳ����ڴ��еĶ����������ر��Ǹ��ƴ����ʱ�����ܵĲ��ǳ����ԡ�
 * @author bee
 *
 */
public class Client {
	public static void main(String[] args){  
        ConcretePrototype cp = new ConcretePrototype();  
        for(int i=0; i< 10; i++){  
            ConcretePrototype clonecp = (ConcretePrototype)cp.clone();  //����10������
            clonecp.show();  
        }  
    }  

}
