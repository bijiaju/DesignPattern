package create.factory.builder;

public class CarDirector {
	
	 CarBuilder cb;//将汽车的构建者导入
	 
	 public CarDirector(CarBuilder cb){
	        this.cb=cb;
	 }
	 
	 public Car constructCar(){
		 Car car=new Car();
		 car.setEngine(cb.buildEngine());
		 car.setTyre(cb.buildTyre());
	     car.setSeat(cb.buildSeat());
		 return car;
	 }
	 

}
