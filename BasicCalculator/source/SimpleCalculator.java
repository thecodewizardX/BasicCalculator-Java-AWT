
public class SimpleCalculator {
    private String expression;
    private int index;
    public SimpleCalculator(String expression){
        this.expression = expression;
        index = 0;
    }
    public String evaluate(){
            try{
                return String.valueOf(calculateExpression());
            }catch(ArithmeticException e){
                return "Can't divide by zero";
            }catch(Exception e){
                return "Invalid expression";
            }
    }
    private double calculateExpression(){
        double term1 = getTerm();
        while(index<expression.length()){
            char operator = expression.charAt(index);
            if(operator == '+' || operator == '-'){
                index++;
                double term2 = getTerm();
                if(operator == '+'){
                    term1+=term2;
                }
                if(operator == '-'){
                    term1-=term2;
                }
            }else{
                break;
            }
        }
        return term1;
    }
    private double getTerm(){
        double num1 = getFactor();
        while(index<expression.length()){
            char operator = expression.charAt(index);
            if(operator == 'x' || operator=='÷' || operator == '%'){
                index++;
                double num2 = getFactor();
                if(operator == 'x'){
                    num1*=num2;
                }
                if(operator == '%'){
                    num1=(num1/100)*num2;
                }
                if(operator == '÷'){
                    num1/=num2;
                }
               
                
            }else{
                break;
            }
            if(!Double.isFinite(num1)){
                throw new ArithmeticException();
            }
        }
        return num1;
    }
    private double getFactor(){
        StringBuilder num = new StringBuilder();
        while(index < expression.length() && (Character.isDigit(expression.charAt(index)) || expression.charAt(index) == '.')){
            num.append(expression.charAt(index));
            index++;
        }
        return Double.parseDouble(num.toString());
    }
}
