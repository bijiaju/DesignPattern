package create.struct.composite;

import java.util.ArrayList;
import java.util.List;

public class MarketBranch extends Market{

	 // ���˵��б�  
    List<Market> list = new ArrayList<Market>();  
    
    public MarketBranch(String s) {  
        this.name = s;  
    }  

    
	@Override
	public void add(Market m) {
		// TODO Auto-generated method stub
		list.add(m);
	}

	@Override
	public void remove(Market m) {
		// TODO Auto-generated method stub
		list.remove(m);
	}

	 // ����֮�󣬸÷ֵ��µļ��˵��Զ��ۼӻ���  
    @Override  
    public void PayByCard() {  
        // TODO Auto-generated method stub  
        System.out.println(name + "����,�������ۼ���û�Ա��");  
        for (Market m : list) {  
            m.PayByCard();  
        }  
    }  

}
