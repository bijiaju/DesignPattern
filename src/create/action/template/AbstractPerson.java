package create.action.template;

public abstract class AbstractPerson {
	//�����ඨ���������̹Ǽ�  
    public final void prepareGotoSchool(){  //ģ�巽��
         dressUp();  
         eatBreakfast();  
         takeThings();  
    }  
    //�����ǲ�ͬ�����������������ɵľ��岽��  
    protected abstract void dressUp();  
    protected abstract void eatBreakfast();  
    protected abstract void takeThings();  
}
