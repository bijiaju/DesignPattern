package create.struct.composite;

public class Test {
	
	public static void main(String[] args) {
		MarketBranch rootBranch = new MarketBranch("�ܵ�");  
        MarketBranch qhdBranch = new MarketBranch("�ػʵ��ֵ�");  
        MarketJoin hgqJoin = new MarketJoin("�ػʵ��ֵ�һ���������˵�");  
        MarketJoin btlJoin = new MarketJoin("�ػʵ��ֵ����������˵�");  
          
        qhdBranch.add(hgqJoin);  
        qhdBranch.add(btlJoin);  
        rootBranch.add(qhdBranch);  
        rootBranch.PayByCard();  
	}

}
