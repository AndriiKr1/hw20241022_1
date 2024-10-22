import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    // Використовуємо список для зберігання слів
    private List<Word> words;

    // Конструктор ініціалізує порожній список
    public Dictionary() {
        words = new ArrayList<>();  // створюємо порожній список
    }

    // Метод для додавання слова в словник
    public void addWord(Word word) {
        words.add(word);  // додаємо слово в список
    }

    // Метод для пошуку перекладу
    public String translate(String original) {
        for (int i = 0; i < words.size(); i++) {
            Word word = words.get(i);
            if (word.getOriginal().equals(original)) {
                return word.getTranslation();
            }
        }
        return "Translation not found";
    }

    // Метод для виводу всіх слів у словнику
    public void printAllWords() {
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }
    }
}
