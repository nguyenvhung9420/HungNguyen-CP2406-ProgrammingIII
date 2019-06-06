
public class InternationalDivision extends Division {
    String country;
    String language;

    public InternationalDivision(String divisionName, int accountNum, String country, String language) {
        super(divisionName, accountNum);
        this.country = country;
        this.language = language;
    }

    public void display(){
        System.out.println(toString() + "Country: " + country + " Language: " + language + ".");
    }

}
