class Calculator {


    int add(int a, int b){ return 0; }
    int sub(int a, int b){ return 0; }

        public int mul(int a, int b) {
            return a * b;
        }
        
        public int div(int a, int b) {
            if (b == 0) {
                throw new IllegalArgumentException("No se puede dividir por cero");
            }
            return a / b;
        }

    int mod(int a, int b){ return 0; }
}