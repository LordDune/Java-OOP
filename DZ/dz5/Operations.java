package DZ.dz5;

public class Operations {
    
    public Operations(){

    }

    public static Model operationSelection(String operation) {

        if (operation.equals("+")) return new SumModel();
        else if (operation.equals("-")) return new DifferenceModel();
        else if (operation.equals("*")) return new MultipleModel();
        else if (operation.equals("/")) return new QuotientModel();
        else return new Exception();
        
    }
}
