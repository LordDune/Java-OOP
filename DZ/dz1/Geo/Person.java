
enum Gender {
    Male, Female
}

public class Person {
    private String fullName;
    private int age;
    private Gender gender;

    public Person(String fullName, int age, String gender) {
        this.fullName = fullName;
        this.age = age;
        if (gender == "Male" || gender == "Female") this.gender = Gender.valueOf(gender);
        else this.gender = null;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String getGender() {
        if (this.gender != null){
            return this.gender.toString();
        }
        else return "пол не задан";
    }

    public void setGender(String gender) {
        if (gender == "Male" || gender == "Female") this.gender = Gender.valueOf(gender);
        else this.gender = null;
    }

    public String toString(){
        return String.format("%s: %d %s", getFullName(), getAge(), getGender());
    }

}
