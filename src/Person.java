public class Person {

    private String name;
    private int age;
    private String profession;
    private String citizen;

    public Person(){}

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getProfession(){
        return profession;
    }

    public void setProfession(String profession){
        this.profession = profession;
    }

    public String getCitizen(){
        return citizen;
    }
    public void setCitizen(String citizen){
        this.citizen =citizen;
    }

    @Override
    public String toString() {
        return "Person " +
                "name: " + name +
                ",   age: " + age +
                ",   profession: " + profession +
                ",   citizen of: " + citizen ;
    }
}
