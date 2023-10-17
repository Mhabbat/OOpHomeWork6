package SRP;

import SRP.InputConsole;

public class Program {
    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {
        SaveToJS saveJson = new SaveToJS();
        InputConsole inputConsole = new InputConsole();

        Order order = inputConsole.inputFromConsole();
        saveJson.saveJson(order);
    }
}