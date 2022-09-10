package entitys;

public class Doctor extends Person {

    private double salary;
    public Patient[] patzients;

    public Doctor(int CountPatzients){
        patzients = new Patient[CountPatzients];
        for (int i = 0; i < patzients.length; i++){
            patzients[i] = new Patient();
        }
    }
    public Doctor(){

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public Patient[] get_All_patients(){
        return patzients;
    }


    @Override
    public String toString(){

        return  getClass() + "id: " + getId() + "name: " + getName() + "Surname: " +
                getSurname() + "Age: " + getAge() + "Address: " + getAdress() +
                "email: " + getEmail() + "number: " + getNumber() + "salary: " + salary;

    }
}
