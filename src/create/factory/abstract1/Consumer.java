package create.factory.abstract1;
/**
 * 例子背景：
随着客户的要求越来越高，宝马车需要不同配置的空调和发动机等配件。于是这个工厂开始生产空调和发动机，用来组装汽车。这时候工厂有两个系列的产品:空调和发动机。
宝马320系列配置A型号空调和A型号发动机，宝马230系列配置B型号空调和B型号发动机。

概念：
   抽象工厂模式是工厂方法模式的升级版本，他用来创建一组相关或者相互依赖的对象。比如宝马320系列使用空调型号A和发动机型号A，而宝马230系列使用空调型号B和
   发动机型号B，那么使用抽象工厂模式，在为320系列生产相关配件时，就无需制定配件的型号，它会自动根据车型生产对应的配件型号A。
 * @author bee
 *
 *PS:使用的目的就是为了解耦
 *总结：
无论是简单工厂模式，工厂方法模式，还是抽象工厂模式，他们都属于工厂模式，在形式和特点上也是极为相似的，他们的最终目的都是为了解耦。在使用时，我们不必去
在意这个模式到底工厂方法模式还是抽象工厂模式，因为他们之间的演变常常是令人琢磨不透的。经常你会发现，明明使用的工厂方法模式，当新需求来临，稍加修改，加
入了一个新方法后，由于类中的产品构成了不同等级结构中的产品族，它就变成抽象工厂模式了；而对于抽象工厂模式，当减少一个方法使的提供的产品不再构成产品族之
后，它就演变成了工厂方法模式。
     所以，在使用工厂模式时，只需要关心降低耦合度的目的是否达到了。
 */
public class Consumer {
	 public static void main(String[] args){    
	        //生产宝马320系列配件  
	        FactoryBMW320 factoryBMW320 = new FactoryBMW320();    
	        factoryBMW320.createEngine();  
	        factoryBMW320.createAircondition();  
	            
	        //生产宝马523系列配件    
	        FactoryBMW523 factoryBMW523 = new FactoryBMW523();    
	        factoryBMW523.createEngine();  
	        factoryBMW523.createAircondition();  
	    }    
}
