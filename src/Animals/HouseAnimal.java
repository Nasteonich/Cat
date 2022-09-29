package Animals;

public class HouseAnimal {
    protected String sex;
    protected double weight;
    public int age;
    protected double height;
    protected String nickname;

    public String getSex() {
        return sex;
    }

    public HouseAnimal(double weight, int age, double height) {
        this.weight = weight;
        this.age = age;
        this.height = height;
    }

    public HouseAnimal() {
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
        return getClass() + " name: " + nickname + "; " + "Age: " + age + "; " + "sex: " + sex + "; " + "weight: " + weight + "; " + "height: " + height;
    }
}
