public class DrivingLicenceMain {
    public static void main(String[] args) {
        DrivingLicence driver = new DrivingLicence();
        driver.setAdress("51");
        driver.setCity("Zawada");
        driver.setLicenceCategory("B");
        driver.setLicenceNumber(12345567);
        driver.setName("Krzysztof");
        driver.setPostalCode("32-300");
        driver.setSurname("Kurowski");
        driver.setYearOfIssue(2019);

        System.out.println(driver.display());
    }
}
