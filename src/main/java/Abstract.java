public abstract class Abstract {
    public abstract void autoMobile();
    public abstract void multiplicationTable();
}
    class Car extends Abstract{
     @Override
     public void autoMobile() {
         System.out.println("This is a car");
     }

        @Override
        public void multiplicationTable() {

        }
    }

 class Bus extends Abstract{
    @Override
     public void autoMobile(){
        System.out.println("coaster");
    }

     @Override
     public void multiplicationTable() {
         int x=2;
         for(int i =1; i<=10; i++){
             System.out.println(x+" * "+i+" = "+ i*x);
         }
     }
 }

 class Run {
     public static void main(String[] args) {
         Car newCar = new Car();
         newCar.autoMobile();
         newCar.multiplicationTable();

         Bus newBus = new Bus();
         newBus.autoMobile();
         newBus.multiplicationTable();
     }
 }
