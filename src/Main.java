public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        // Додаємо кілька слів у словник
        dictionary.addWord(new Word("apple", "яблуко"));
        dictionary.addWord(new Word("car", "автомобіль"));
        dictionary.addWord(new Word("book", "книга"));

        // Пошук перекладу
        System.out.println("Переклад для 'car': " + dictionary.translate("car"));
        System.out.println("Переклад для 'house': " + dictionary.translate("house")); // не знайдено

        // Виводимо всі слова у словнику
        System.out.println("\nУсі слова у словнику:");
        dictionary.printAllWords();
    }
}
