package create.factory.builder;

public class CarBuilder implements Builder{

	 @Override
	    public String buildEngine() {
	        // ����������
	        return "������";
	    }

	    @Override
	    public String buildTyre() {
	        // ������̥
	        return "��̥";
	    }

	    @Override
	    public String buildSeat() {
	        // ��������
	        return "����";
	    }

}
