package entitys;

public class Client extends Person {

    private String NameTier;

    public String getNameTier() {
        return NameTier;
    }

    public void setNameTier(String nameTier) {
        NameTier = nameTier;
    }

    @Override
    public String toString(){

        return  getClass() + " id: <" + getId() + "> name: <" + getName() + "> Surname: <" +
                getSurname() + "> Age: <" + getAge() + "> Address: <" + getAdress() +
                "> email: <" + getEmail() + "> number: <" + getNumber() + "> HauseTier: <" + NameTier + ">";

    }
}
