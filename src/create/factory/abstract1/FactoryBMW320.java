package create.factory.abstract1;

//Ϊ����320ϵ���������    
public class FactoryBMW320 implements AbstractFactory{    
      
  @Override    
  public Engine createEngine() {      
      return new EngineA();    
  }    
  @Override    
  public Aircondition createAircondition() {    
      return new AirconditionA();    
  }    
}    
