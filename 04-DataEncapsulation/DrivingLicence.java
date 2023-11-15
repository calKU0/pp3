public class DrivingLicence {
    private String name;
    private String surname;
    private String adress;
    private String postalCode;
    private String city;
    private int licenceNumber;
    private int yearOfIssue;
    private String licenceCategory;

    public String display(){
        return "Name: " + name + "\nSurname: " + surname + "\nAdress: " + adress + "\nPostal-code: " + postalCode + "\nCity: " + city + "\nLicence number: " + licenceNumber + "\nYear of issue: " + yearOfIssue + "\nLicence category: " + licenceCategory;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getAdress(){
        return adress;
    }

    public String getPostalCode(){
        return postalCode;
    }

    public String getCity(){
        return city;
    }

    public int getLicenceNumber(){
        return licenceNumber;
    }

    public int getYearOfIssue(){
        return yearOfIssue;
    }

    public String getLicenceCategory(){
        return licenceCategory;
    }

    public void setName(String name){
        String s1 = "";
        String s2 = "";

        s1 += name.charAt(0);
        s2 += name.substring(1);

        this.name = String.join("", s1.toUpperCase(), s2.toLowerCase());
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setAdress(String adress){
        this.adress = adress;
    }

    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }

    public void setCity(String city){
        this.city = city;
    }   

    public void setLicenceNumber(int licenceNumber){
        this.licenceNumber = licenceNumber;
    }

    public void setYearOfIssue(int yearOfIssue){
        if (yearOfIssue >= 1980 & yearOfIssue <= 2023)
        {
            this.yearOfIssue = yearOfIssue;
        }
    }

    public void setLicenceCategory(String licenceCategory){
        this.licenceCategory = licenceCategory;
    }
}