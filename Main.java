public class Main {
    public static void main(String[] args){
        BmiService service = new BmiService();
        float bmi = service.calculate(120,180);
        System.out.println("BMI = "+bmi);
    }
}
