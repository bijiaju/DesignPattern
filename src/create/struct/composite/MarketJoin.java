package create.struct.composite;
//���˵� ���治���зֵ�ͼ��˵꣬��ײ�  
public class MarketJoin extends Market{
	public MarketJoin(String s) {  
        this.name = s;  

    }  

    @Override  
    public void add(Market m) {  
        // TODO Auto-generated method stub  

    }  

    @Override  
    public void remove(Market m) {  
        // TODO Auto-generated method stub  

    }  

    @Override  
    public void PayByCard() {  
        // TODO Auto-generated method stub  
        System.out.println(name + "����,�������ۼ���û�Ա��");  
    }  
}
