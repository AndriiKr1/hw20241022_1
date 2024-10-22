public class Word {
    private String original;
    private String translation;

    public Word(String original, String translation) {
        this.original = original;
        this.translation = translation;
    }

    public String getOriginal() {
        return original;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return original + " - " + translation;
    }
}