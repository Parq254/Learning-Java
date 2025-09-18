public class Main {
    public static void main(String[] args){
        Contact contactOne = new Contact("Jane","jane@gmail.com");
        Contact contactTwo = new Contact("James", new PhoneNumber("1234567890"));
        Contact contactThree = new Contact("John", new PhoneNumber(254,"0987654321"));
        Contact contactFour = new Contact("Mike", new PhoneNumber(255, "1224566890"),"mike@gmail.com");

        System.out.println(contactOne);
        System.out.println(contactTwo);
        System.out.println(contactThree);
        System.out.println(contactFour);
    }
}
