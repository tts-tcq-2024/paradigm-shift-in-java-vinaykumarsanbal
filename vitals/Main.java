package vitals;

public class Main {
    static boolean batteryIsOk(float temperature, float soc, float chargeRate) {
        return ( isTemparetureIsOK(temperature) && isSocIsOK(soc) && isChangeRateIsOK(chargeRate));
    }
    static boolean isTemparetureIsOK(float temparature){
        if(temparature < 0 || temparature > 45) {
            System.out.println("Temperature is out of range!");
            return false;
        }
        return true;
    }

    static boolean isSocIsOK(float soc){
        if(soc < 20 || soc > 80) {
            System.out.println("State of Charge is out of range!");
            return false;
        }
        return true;
    }

    static boolean isChargeRateIsOK(float chargeRate){
        if(chargeRate > 0.8) {
            System.out.println("Charge Rate is out of range!");
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        assert(batteryIsOk(25, 70, 0.7f) == true);
        assert(batteryIsOk(50, 85, 0.0f) == false);
        System.out.println("Some more tests needed");
    }
}
