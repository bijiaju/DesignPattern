package create.action.mediaor;
/**
 * �н���ģʽ��Mediator Pattern�����������Ͷ���������֮���ͨ�Ÿ����ԡ�
 * ����ģʽ�ṩ��һ���н��࣬����ͨ������ͬ��֮���ͨ�ţ���֧������ϣ�ʹ��������ά�����н���ģʽ������Ϊ��ģʽ��
 * @author bee
 *
 */
public class Test {
	
	public static void main(String[] args) {
        Mediator president=new President();//�н���

        Development devp=new Development(president);
        Finacial fin=new Finacial(president);
        Market mar=new Market(president);

        devp.ownWork();
        devp.outWork();
        
        System.out.println("-------------------------------");
        
        fin.ownWork();
        fin.outWork();
        
        System.out.println("-------------------------------");
        
        mar.ownWork();
        mar.outWork();

    }

}
