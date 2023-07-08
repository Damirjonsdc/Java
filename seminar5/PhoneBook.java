import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, List<String>> contacts = new HashMap<>();

        // Добавление номеров телефонов для контактов
        addPhone(contacts, "Иванов", "11111111");
        addPhone(contacts, "Петров", "22222222");
        addPhone(contacts, "Сидоров", "33333333");
        addPhone(contacts, "Иванов", "44444444");
        addPhone(contacts, "Петров", "55555555");
        addPhone(contacts, "Сидоров", "66666666");

        // Вывод контактов в порядке убывания числа телефонных номеров
        printContacts(contacts);
    }

    // Метод для добавления номера телефона для контакта
    public static void addPhone(HashMap<String, List<String>> contacts, String name, String phone) {
        List<String> phones = contacts.getOrDefault(name, new ArrayList<>());
        phones.add(phone);
        contacts.put(name, phones);
    }

    // Метод для вывода контактов
    public static void printContacts(HashMap<String, List<String>> contacts) {
        List<String> sortedContacts = new ArrayList<>(contacts.keySet());
        sortedContacts.sort((a, b) -> contacts.get(b).size() - contacts.get(a).size());

        for (String name : sortedContacts) {
            System.out.println(name + ": " + contacts.get(name).size() + " телефонных номера");
            for (String phone : contacts.get(name)) {
                System.out.println(phone);
            }
        }
    }
}