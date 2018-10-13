package create.factory.builder;
/**
 * 三、建造者模式结构组成

Product: 表示被构造的复杂对象,其中包含需要构建的部件属性。              -------------------定义产品
Builder: 创建一个产品对象的各个部件指定抽象接口。                            ------------------- 安装个过程
ConcreteBuilder： 实现Builder的接口以构造和装配该产品的各个部件，定义并明确它所创建的表示。 --------------构建安装
Director： 调用具体建造者角色以创建产品对象。                                       ------------------实现
 * @author bee
 *
 */
public class Consumer {
	
	public static void main(String[] args) {
		CarDirector carDirector=new CarDirector(new CarBuilder());
		Car car = carDirector.constructCar();///构建一个车
		System.out.println(car.getEngine()+car.getTyre()+car.getSeat());

		
	}

}
