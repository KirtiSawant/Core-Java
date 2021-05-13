class BicycleDemo1{
	 int Cadence=0;
	int Speed=0;
	int Gear=1;
	void ChangeCadence(int newvalue)
	{
	Cadence=newvalue;
	}
	void ChangeGear(int newvalue)
	{
	Gear=newvalue;
	}
	 void speedUp(int increment) {
         Speed = Speed + increment;   
    }

    void applyBrakes(int decrement) {
         Speed = Speed - decrement;
    }

    void printStates() {
         System.out.println("Cadence:" +
             Cadence + " Speed:" + 
             Speed + " Gear:" + Gear);
    }
}
class Bicycle1
{
public static void main(String[] args)
{
BicycleDemo1 bike1=new BicycleDemo1();
//Biacycle1 bike2=new Bicycle1();
	 
	bike1.ChangeCadence(30);
	bike1.ChangeGear(2);
        bike1.speedUp(10);
	bike1.printStates();
}
}