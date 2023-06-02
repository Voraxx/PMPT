package pmpt_kap17_durchschnaufen;

public class TextElement implements Element {
    private String text;

    public TextElement(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String element2String() {
        return text;
    }
}
