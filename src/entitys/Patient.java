package entitys;

public class Patient extends HouseAnimal {

    private int id;

    private Disease diagnosis;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Disease getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Disease diagnosis) {
        this.diagnosis = diagnosis;
    }


    @Override
    public String toString(){

        return  getClass() + " " + "id: " + id + " " + "Nickname: " + getNickname();

    }


}
