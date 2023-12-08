package ba.unsa.etf.rpr.tutorijal06;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.math.BigDecimal;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;

public class Controller {

    private SimpleStringProperty displej;
    private SimpleStringProperty prvi_operand = new SimpleStringProperty("");
    private SimpleStringProperty operacija = new SimpleStringProperty("");

    public String getDisplej() {
        return displej.get();
    }

    public SimpleStringProperty displejProperty() {
        return displej;
    }
cd
    public void setDisplej(String displej) {
        this.displej.set(displej);
    }

    public Controller(){
        displej = new SimpleStringProperty("0");
    }

    public void btn00(ActionEvent actionEvent) {
        if (!displej.get().equals("0")) {
            displej.set(displej.get() + "0");
        }
    }

    public void btn11(ActionEvent actionEvent) {
        if(displej.get().equals("0")|| operacija.get().equals("="))
            displej.set("");
        displej.set(displej.get()+"1");
    }

    public void btn22(ActionEvent actionEvent) {
        if(displej.get().equals("0")|| operacija.get().equals("=")) displej.set("");
        displej.set(displej.get()+"2");
    }

    public void btn33(ActionEvent actionEvent) {
        if(displej.get().equals("0")|| operacija.get().equals("=")) displej.set("");
        displej.set(displej.get()+"3");
    }

    public void btn44(ActionEvent actionEvent) {
        if(displej.get().equals("0")|| operacija.get().equals("=")) displej.set("");
        displej.set(displej.get()+"4");
    }

    public void btn55(ActionEvent actionEvent) {
        if(displej.get().equals("0") || operacija.get().equals("=")) displej.set("");
        displej.set(displej.get()+"5");
    }

    public void btn66(ActionEvent actionEvent) {
        if(displej.get().equals("0")|| operacija.get().equals("=")) displej.set("");
        displej.set(displej.get()+"6");
    }

    public void btn77(ActionEvent actionEvent) {
        if(displej.get().equals("0")|| operacija.get().equals("=")) displej.set("");
        displej.set(displej.get()+"7");

    }

    public void btn88(ActionEvent actionEvent) {
        if(displej.get().equals("0")|| operacija.get().equals("=")) displej.set("");
        displej.set(displej.get()+"8");
    }

    public void btn99(ActionEvent actionEvent) {
        if(displej.get().equals("0")|| operacija.get().equals("=")) displej.set("");
        displej.set(displej.get()+"9");
    }

    public void plus(ActionEvent actionEvent) {
        prvi_operand.set(displej.get());
        displej.set("");
        operacija.set("+");
    }

    public void minus(ActionEvent actionEvent) {
        if(displej.get().equals("0") || (operacija.get()!="" && operacija.get()!="=")) displej.set("-");
        else{
            prvi_operand.set(displej.get());
            System.out.println(prvi_operand.get());
            displej.set("");
            operacija.set("-");
        }
    }

    public void mod(ActionEvent actionEvent) {
        prvi_operand.set(displej.get());
        displej.set("");
        operacija.set("%");
    }

    public void mnozenje(ActionEvent actionEvent) {
        prvi_operand.set(displej.get());
        displej.set("");
        operacija.set("*");
    }

    public void dijeljenje(ActionEvent actionEvent) {
        prvi_operand.set(displej.get());
        displej.set("");
        operacija.set("/");
    }

    public void jednako(ActionEvent actionEvent) {
        BigDecimal prvi = new BigDecimal(prvi_operand.get());
        BigDecimal drugi = new BigDecimal(displej.get());

        switch (operacija.get()) {
            case "-":
                displej.set(prvi.subtract(drugi).toString());
                break;
            case "+":
                displej.set(prvi.add(drugi).toString());
                break;
            case "%":
                displej.set(prvi.remainder(drugi).toString());
                break;
            case "*":
                displej.set(prvi.multiply(drugi).toString());
                break;
            case "/":
                displej.set(prvi.divide(drugi, 10, BigDecimal.ROUND_HALF_UP).toString());
                break;
        }
        operacija.set("=");
    }

    public void decimal(ActionEvent actionEvent) {
        if (!(displej.get().contains(".")) && !displej.get().isEmpty()) {
            displej.set(displej.get() + ".");
        }
    }
}
