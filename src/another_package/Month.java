package another_package;

public enum Month {

    JANUARY("January", "Apple", "Carrot"),
    FEBRUARY("February", "Orange", "Broccoli"),
    MARCH("March", "Banana", "Spinach"),
    APRIL("April", "Strawberry", "Lettuce"),
    MAY("May", "Blueberry", "Cucumber"),
    JUNE("June", "Watermelon", "Tomato"),
    JULY("July", "Peach", "Bell Pepper"),
    AUGUST("August", "Grapes", "Corn"),
    SEPTEMBER("September", "Pear", "Zucchini"),
    OCTOBER("October", "Plum", "Eggplant"),
    NOVEMBER("November", "Cranberry", "Sweet Potato"),
    DECEMBER("December", "Cherry", "Onion");

    private final String monthName;
    private final String favoriteFruit;
    private final String favoriteVegetable;

    Month(String monthName, String favoriteFruit, String favoriteVegetable) {
        this.monthName = monthName;
        this.favoriteFruit = favoriteFruit;
        this.favoriteVegetable = favoriteVegetable;
    }

    public String getMonthName() {
        return monthName;
    }
    public String getFavoriteFruit() {
        return favoriteFruit;
    }
    public String getFavoriteVegetable() {
        return favoriteVegetable;
    }

}
