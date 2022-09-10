package entitys;

public class Disease {

    private String description;
    private boolean hospital = false;
    private int duration_of_treatment;

    public Medication[] medicat_arr;

    public Disease (int CountMed){
        medicat_arr = new Medication[CountMed];
        for (int i = 0; i < medicat_arr.length; i++){
            medicat_arr[i] = new Medication();
        }
    }

    public Disease(){

    }

    public String getDescription() {
        return description;
    }

    public boolean isHospital() {
        return hospital;
    }

    public void setHospital(boolean hospital) {
        this.hospital = hospital;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration_of_treatment() {
        return duration_of_treatment;
    }

    public void setDuration_of_treatment(int duration_of_treatment) {
        this.duration_of_treatment = duration_of_treatment;
    }

    public Medication[] getMedicat_arr() {
        return medicat_arr;
    }

    public void setMedicat_arr(Medication[] medicat_arr) {
        this.medicat_arr = medicat_arr;
    }
}
