import java.util.*;
public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("BIENVENIDO A LA CALCULADORA");

        System.out.println("ingrese el primer numero a operar:");
        int num1 = sc.nextInt();
        System.out.println("ingrese el segundo numero a operar:");
        int num2 = sc.nextInt();
        Calculator calculadora = new Calculator(num1, num2);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione la operacion a realizar:");
            System.out.println("1. Suma\n2. Resta \n3. Multiplicacion \n4. Division \n5. Modulo");
            int operacion = sc.nextInt();
            
            if (operacion < 1 || operacion > 5) {
                System.out.println("Operacion no valida");
                return;
            } else {
                switch (operacion) {
                    case 1:
                        System.out.println("El resultado de la suma es: " + calculadora.add(num1, num2));
                        break;
                    case 2:
                        System.out.println("El resultado de la resta es: " + calculadora.sub(num1, num2));
                        break;
                    case 3:
                        System.out.println("El resultado de la multiplicacion es: " + calculadora.mul(num1, num2));
                        break;
                    case 4:
                        try {
                            System.out.println("El resultado de la division es: " + calculadora.div(num1, num2));
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 5:
                        System.out.println("El resultado del modulo es: " + calculadora.mod(num1, num2));
                        break;
                    default:
                        System.out.println("Operacion no valida");
                }
            }
            System.out.println("Desea realizar otra operacion? (s/n)");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("s")) {
                continuar = true;
            } else {
                continuar = false;
                System.out.println("Gracias por usar la calculadora. ¡Hasta luego!");
            }
        }
>>>>>>> a5ade3be847bc3b2e795a8e5353eb837a9ce8868
    }
}