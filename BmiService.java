public class BmiService {
    public float calculate (float weight,long height){
        float bmi  = (weight/height/height)*10000;
        return bmi;
    }
}
