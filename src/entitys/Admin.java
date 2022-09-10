package entitys;

public class Admin extends Person {

    private Person[] clients;

    private Admin (int CountClients){

        clients = new Client[CountClients];
        for (int i = 0; i < clients.length; i++){

            clients[i] = new Client();

        }

    }

    public Person[] getClients() {
        return clients;
    }

    public void setClients(Person[] clients) {
        this.clients = clients;
    }

}
