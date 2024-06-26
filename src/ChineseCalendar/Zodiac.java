package ChineseCalendar;

public class Zodiac {
    private int year;
    public Zodiac (int year) {
        this.year = year;
    }
    public String getAnimal() {
        int remainder = year % 12;
        return ChineseCalendar.ANIMALS[remainder];
    }
}
