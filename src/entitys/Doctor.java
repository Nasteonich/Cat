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
    public Doctor(){ }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public Patient[] get_All_patients(){
        return patzients;
    }

    public Patient get_patient(int id){

        for (int i = 0; i < patzients.length; i++) {

            if (patzients[i].getId() == id) {

                return patzients[i];

            }

        }
        return null;

    }

    public Patient[] get_patients_with_Disease(Disease disease){

        int Count_patients = 0;
        for (int i = 0; i < patzients.length; i++){

            if ( patzients[i].getDiagnosis() == disease ){

                Count_patients += 1;

            }

        }

        Patient[] patients_with_dis = new Patient[Count_patients];

        int j = 0;
        for (int i = 0; i < patzients.length; i++){

            if ( patzients[i].getDiagnosis() == disease ){

                patients_with_dis[j] = patzients[i];
                j++;

            }

        }

        return patients_with_dis;

    }

    @Override
    public String toString(){

        return  getClass() + "id: " + getId() + "name: " + getName() + "Surname: " +
                getSurname() + "Age: " + getAge() + "Address: " + getAdress() +
                "email: " + getEmail() + "number: " + getNumber() + "salary: " + salary;

    }
}
