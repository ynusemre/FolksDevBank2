package Optional;


import java.util.Optional;

public class PhoneBookCrawler {

    private PhoneBook phoneBook;

    public PhoneBookCrawler(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }


    public static void main(String[] args) {
        PhoneBookCrawler phoneBookCrawler =new PhoneBookCrawler(new PhoneBook());
        System.out.println(phoneBookCrawler.findPhoneNumberByNameOrNameByPhoneNumber("Raf de Giraf", "016/161619"));
    }

    public String findPhoneNumberByNameAndPunishIfNothingFound(String name){
        return phoneBook.findPhoneNumberByName(name)
                .orElseThrow(()-> new IllegalArgumentException("No phone number found"));
    }

    public String findPhoneNumberByNameAndPrintPhoneBookIfNothingFound(String name){

        final StringBuilder result=new StringBuilder();

         phoneBook.findPhoneNumberByName(name).ifPresentOrElse( phoneNumber -> result.append(phoneBook),
                 ()-> System.out.println(phoneBook.getPhoneBookEntries()));

        return result.toString();
    }

    public String findPhoneNumberByNameOrNameByPhoneNumber(String name, String phoneNumber){
       return phoneBook.findPhoneNumberByName(name).
               orElse(phoneBook.findNameByPhoneNumber(phoneNumber).
                       orElse(phoneBook.findPhoneNumberByName("Jos de Vos").orElse(null)));
    }

    public PhoneBook getPhoneBook(){
        return phoneBook;
    }

}