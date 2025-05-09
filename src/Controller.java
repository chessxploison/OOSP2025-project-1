public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // Метод для запуска программы
    public void run() {
        try {
            String expression = view.getExpression();
            double result = model.calculate(expression);
            view.displayResult(result);
        } catch (Exception e) {
            view.displayError(e.getMessage());
        }
    }
}