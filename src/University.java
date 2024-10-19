public class University {
    private String name;
    private String country;
    private int dateOfFoundation;

    public University(){}

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCountry(){
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDate(){
        return dateOfFoundation;
    }
    public void setDate(int date){
        this.dateOfFoundation = date;
    }

    @Override
    public String toString() {
        return "University " +
                "name: " + name +
                ",    country: " + country +
                ",           foundation year: " + dateOfFoundation ;
    }
}
