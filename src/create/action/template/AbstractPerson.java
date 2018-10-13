package create.action.template;

public abstract class AbstractPerson {
	//抽象类定义整个流程骨架  
    public final void prepareGotoSchool(){  //模板方法
         dressUp();  
         eatBreakfast();  
         takeThings();  
    }  
    //以下是不同子类根据自身特性完成的具体步骤  
    protected abstract void dressUp();  
    protected abstract void eatBreakfast();  
    protected abstract void takeThings();  
}
