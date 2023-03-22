package DZ.dz5;

public class Controller<T extends CalcModel> {

    View view;
    Model model;

    public Controller(View v) {
        view = v;
    }

    public void start(){
        Double a = view.getValue("a: ");
        String op = view.getOperation("operation: ");
        Double b = view.getValue("b: ");
        this.model = Operations.operationSelection(op);
        model.setX(a);
        model.setY(b);
        String result = model.result().toString();
        view.print(result, "Result: ");
    }
}
