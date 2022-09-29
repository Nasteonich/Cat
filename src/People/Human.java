package People;

import Animals.HouseCat;

public class Human {

    public HouseCat[] cats;

    public Human(int countCat) {
        cats = new HouseCat[countCat];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new HouseCat();
        }

    }

    public HouseCat getAltCat(){
        int AltCat = 0;
        HouseCat CatAltObj = cats[0];
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].getAge() > AltCat) {
                AltCat = cats[i].getAge();
                CatAltObj = cats[i];
            }
        }
        return CatAltObj;
    }

    public HouseCat getWeightCat(){
        double WeightCat = 0;
        HouseCat CatWeightObj = cats[0];
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].getWeight() > WeightCat) {
                WeightCat = cats[i].getWeight();
                CatWeightObj = cats[i];
            }
        }
        return CatWeightObj;
    }

    public int getNumberCat( String nickname ) {
        int NumCat = 0;
        for (int i = 0; i < cats.length; i++) {
            if(cats[i].getNickname() == nickname ){
                NumCat = i;
            }
        }
        return NumCat;
    }

}



