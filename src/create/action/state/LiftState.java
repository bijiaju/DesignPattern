package create.action.state;

public abstract class LiftState {
	 //����һ��������ɫ��Ҳ���Ƿ�װ״̬�ı任����Ĺ��ܱ仯  
    protected Context context;  
    public void setContext(Context _context){  
        this.context = _context;  
    }  
    
    //���ȵ����ſ�������  
    public abstract void open();  
    //�������п������ǵ�ȻҲ���йر���  
    public abstract void close();  
    //����Ҫ�������£�������  
    public abstract void run();  
    //���ݻ�Ҫ��ͣ������ͣ�������Ǿͳ�����  
    public abstract void stop();  
}
