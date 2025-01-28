class Automobile {
    @SuppressWarnings("unused")
    private String drive(){
        return "Driving Vehicle";
    }
}
class car extends Automobile{
    protected String drive(){
        return "Driving Car";
    }
}
public class ElectricalCar extends car{
    @Override
    public final String drive () {
        return "Driving Electrical Car";
    }
    
    public static void main(String []wheels){
        final car Car = new ElectricalCar();
        System.out.println(Car.drive());
    }
}