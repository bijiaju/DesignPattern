package create.factory.builder;
/**
 * ����������ģʽ�ṹ���

Product: ��ʾ������ĸ��Ӷ���,���а�����Ҫ�����Ĳ������ԡ�              -------------------�����Ʒ
Builder: ����һ����Ʒ����ĸ�������ָ������ӿڡ�                            ------------------- ��װ������
ConcreteBuilder�� ʵ��Builder�Ľӿ��Թ����װ��ò�Ʒ�ĸ������������岢��ȷ���������ı�ʾ�� --------------������װ
Director�� ���þ��彨���߽�ɫ�Դ�����Ʒ����                                       ------------------ʵ��
 * @author bee
 *
 */
public class Consumer {
	
	public static void main(String[] args) {
		CarDirector carDirector=new CarDirector(new CarBuilder());
		Car car = carDirector.constructCar();///����һ����
		System.out.println(car.getEngine()+car.getTyre()+car.getSeat());

		
	}

}
