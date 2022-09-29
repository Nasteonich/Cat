package Hospital;

import Healing.Disease;
import Healing.Medication;
import People.Person;

public class Admin extends Person {

    public Client[] clients;

    public Admin (int CountClients){

        clients = new Client[CountClients];
        for (int i = 0; i < clients.length; i++){

            clients[i] = new Client();

        }

    }

    public Admin(){

    }

    public double cost_calculation(Disease disease){
        Medication[] m = disease.getMedicat_arr();
        int count = m.length;
        boolean is_hospital = disease.isHospital();
        int duration = disease.getDuration_of_treatment();
        double cost =  1.2 * ( duration * count );
        if (is_hospital){
            return cost *= 1.3;
        } else {

            return cost;
        }

    }

    public Client get_Client_byPet (String nick_animal){

        for (int i = 0; i < clients.length; i++) {

            if (clients[i].getNameTier() == nick_animal) {

                return clients[i];

            }

        }
        return null;

    }

    public Client get_Client (int id){

        for (int i = 0; i < clients.length; i++) {

            if (clients[i].getId() == id) {

                return clients[i];

            }

        }
        return null;

    }

    public Person[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    @Override
    public String toString(){

        return getClass() + " id: <" + getId() + "> name: <" + getName() + "> Surname: <" +
                getSurname() + "> Age: <" + getAge() + "> Number: <" + getNumber() + ">";
    }

}
