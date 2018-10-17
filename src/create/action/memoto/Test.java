package create.action.memoto;
/**
 * ����¼ģʽ
 * @author bee
 * ����¼ģʽ��Memento Pattern������һ�������ĳ��״̬���Ա����ʵ���ʱ��ָ����󡣱���¼ģʽ������Ϊ��ģʽ��
 */
public class Test {
	public static void main(String[] args) {  
        
        // ����ԭʼ��  
        Original origi = new Original("egg");  
  
        // ��������¼  
        Storage storage = new Storage(origi.createMemento());  
  
        // �޸�ԭʼ���״̬  
        System.out.println("��ʼ��״̬Ϊ��" + origi.getValue());  
        origi.setValue("niu");  
        System.out.println("�޸ĺ��״̬Ϊ��" + origi.getValue());  
  
        // �ظ�ԭʼ���״̬  
        origi.restoreMemento(storage.getMemento());  
        System.out.println("�ָ����״̬Ϊ��" + origi.getValue());  
    }  
}
