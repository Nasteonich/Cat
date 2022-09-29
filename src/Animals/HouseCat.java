package Animals;

public class HouseCat extends HouseAnimal {


    public HouseCat(int i, int i1, int i2) {
        super(i, i1, i2);

    }
    public HouseCat(){}


    public void Mew(){
        System.out.println("Mew");
    }

    public String ChekAge(){
        if (age > 10){
            return "Alt";
        } else {
            return "Jung";
        }
    }

    public int DegreeOfObesity(){
        if(weight > 10 && weight < 20){
           return  1;
        } else if (weight > 20 && weight < 30) {
            return 2;
        } else if (weight > 30 && weight < 40) {
            return 3;
        } else if (weight > 40 && weight < 50) {
            return 4;
        } else{
            return  5;
        }
    }



}
