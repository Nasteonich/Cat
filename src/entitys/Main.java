package entitys;

public class Main {

    public static void main(String[] args) {

        Human Masha = new Human(3);
        Masha.cats[0].setNickname("Rale");
        Masha.cats[0].setAge(11);
        Masha.cats[0].setWeight(15);
        Masha.cats[0].setSex("m");
        Masha.cats[0].setHeight(110);

        Masha.cats[1].setNickname("Jane");
        Masha.cats[1].setAge(15);
        Masha.cats[1].setWeight(6);
        Masha.cats[1].setSex("f");
        Masha.cats[1].setHeight(112);

        Masha.cats[2].setNickname("Lex");
        Masha.cats[2].setAge(7);
        Masha.cats[2].setWeight(9);
        Masha.cats[2].setSex("m");
        Masha.cats[2].setHeight(108);


        HouseAnimal animals[] = new HouseAnimal[3];
        animals[0] = new Dog(10, 10, 20);
        animals[1] = new HouseCat(20, 20, 30);
        animals[2] = new Dog(10, 20, 50);


        Disease allergy = new Disease(2);
        allergy.setDescription("Allergy");
        allergy.setHospital(true);
        allergy.setDuration_of_treatment(2);
        allergy.medicat_arr[0] = new Medication();
        allergy.setDuration_of_treatment(2);
        allergy.medicat_arr[0].setName("Dironet");
        allergy.medicat_arr[0].setDesript(allergy);
        allergy.medicat_arr[0].setPrice(1500);
        allergy.medicat_arr[1] = new Medication();
        allergy.medicat_arr[1].setName("Symparika");
        allergy.medicat_arr[1].setDesript(allergy);
        allergy.medicat_arr[1].setPrice(1496);


        Disease zapor = new Disease(1);
        zapor.setDescription("Zapor");
        zapor.setHospital(false);
        zapor.setDuration_of_treatment(0);
        zapor.medicat_arr[0] = new Medication();
        zapor.medicat_arr[0].setName("Antizaporin");
        zapor.medicat_arr[0].setDesript(zapor);
        zapor.medicat_arr[0].setPrice(220);


        Doctor Hatson = new Doctor(3);
        Hatson.patzients[0].setId(1);
        Hatson.patzients[0].setNickname("Lutik");
        Hatson.patzients[0].setDiagnosis(allergy);
        Hatson.patzients[1].setId(2);
        Hatson.patzients[1].setNickname("Snejinka");
        Hatson.patzients[1].setDiagnosis(allergy);
        Hatson.patzients[2].setId(3);
        Hatson.patzients[2].setNickname("Jopik");
        Hatson.patzients[2].setDiagnosis(zapor);


        Admin Dmitri = new Admin(3);
        Dmitri.clients[0].setId(1);
        Dmitri.clients[0].setName("Jana");
        Dmitri.clients[0].setSurname("Grou");
        Dmitri.clients[0].setNameTier("Cherchel");

        Dmitri.clients[1].setId(2);
        Dmitri.clients[1].setName("Lena");
        Dmitri.clients[1].setSurname("Maur");
        Dmitri.clients[1].setNameTier("Kitik");

        Dmitri.clients[2].setId(3);
        Dmitri.clients[2].setName("Gena");
        Dmitri.clients[2].setSurname("Qwer");
        Dmitri.clients[2].setNameTier("Goga");

        Client client_by_id = Dmitri.get_Client(2);
        Client client_by_pet = Dmitri.get_Client_byPet("Goga");
        System.out.println(client_by_id);
        System.out.println(client_by_pet);

        double cost = Dmitri.cost_calculation(allergy);
        System.out.println(cost);


        Patient[] p = Hatson.get_patients_with_Disease(allergy);
        for (int i = 0; i < p.length; i++){

            System.out.println(p[i]);
        }

        Patient paz = Hatson.get_patient(5);
        if (paz != null)
            System.out.println( paz );
        else {
            System.out.println("NOT FOUND!");
        }
    }

}
