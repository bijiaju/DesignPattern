package create.action.template;

public class Student extends AbstractPerson{  
    @Override  
    protected void dressUp() {  
         System.out.println("��У��");
    }  
    @Override  
    protected void eatBreakfast() {  
         System.out.println("���������õ��緹");  
    }  
 
    @Override  
    protected void takeThings() {  
         System.out.println("����������ϼ�ͥ��ҵ�ͺ����");  
    }  
}  