package tutorium;

public interface Tier {
    void geraeuschMachen();

    void snacken(String snack);

    int getSpeed();

    int speedDifference(Tier tier);
}
