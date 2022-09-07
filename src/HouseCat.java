public class HouseCat {
    private String sex;
    private double weight;
    private int age;
    private double height;
    private String nickname;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex.equals("m") || sex.equals("f")){
            this.sex = sex;
        }
        else {
            System.out.println("uncorrect sex");
        }

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0 ){
            this.weight = weight;
        } else {
            System.out.println("Error in weight");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0){
            this.age = age;
        }
        else {
            System.out.println("Error in age");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0){
            this.height = height;
        }
        else {
            System.out.println("Error in height!");
        }

    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        if (!nickname.isEmpty()){
            this.nickname = nickname;
        }
        else {
            System.out.println("Error in nickname");
        }

    }
    @Override
    public String toString(){
        return "name: " + nickname + "; " + "Age: " + age + "; " + "sex: " + sex + "; " + "weight: " + weight + "; " + "height: " + height;
    }
}
