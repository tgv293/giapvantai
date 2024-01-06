package TemplateMethod;

public class MainCaffein {
    public static void main(String[] args) {
        CaffeeinBeverage tea = new Tea();
        tea.prepareRecipe();
        CaffeeinBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
