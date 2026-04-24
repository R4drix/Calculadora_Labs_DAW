class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {

        this.num1 = num1;
        this.num2 = num2;
    }
    public int add(int a, int b){ 
        return a+b; 

    }
    public int sub(int a, int b){

        return a-b; 

    }

    public int mul(int a, int b) {
        return a * b;
    }
        
    public int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a / b;
    }

    public int mul(int a, int b) {
        return a * b;
    }
    
    public int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a / b;
    }

    int mod(int a, int b) { 
        if (b == 0) return 0;
        return a % b; 
    }
}