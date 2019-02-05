package guiauno;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner read= new Scanner (System.in);
        byte opc;
        int a1=0, a2=0, a3=0, lc1=10, lc2=10, ll=25;
        System.out.println("Bienvenido a su programa Triángulos");
        System.out.println("Este programa sirve para saber el tipo de triangulo. Por favor, digite:");
        System.out.println("1. Si desea conocer el triángulo por sus ángulos");
        System.out.println("2. Si desea conocerlo por sus lados");
        opc = read.nextByte();
        switch (opc) {
            case 1:
                while (a1+a2+a3!=180) {
                    System.out.println("Ingrese el primer ángulo");
                        a1=read.nextInt();
                        System.out.println("Ingrese el segundo ángulo");
                        a2=read.nextInt();
                        System.out.println("Ingrese el tercer ángulo");
                        a3=read.nextInt();
                        if (a1+a2+a3!=180) {
                            System.out.println("¡Error, ingrese los ángulos correctos!");
                        }
                        if (a1==90 || a2==90 || a3==90) {
                            System.out.println("El triángulo es: Triangulo rectángulo");
                    }
                        else if (a1<90 && a2<90 && a3<90) {
                            System.out.println("El triángulo es: Triángulo acutángulo");
                    }
                        else if (a1>90 || a2>90 || a3>90) {
                        System.out.println("El triángulo es: Triángulo obtusángulo");
                    }
                }
      
                break;
            
            case 2:
                while ((lc1+lc2)<ll) {
                    System.out.println("Ingrese el primer lado corto");
                    lc1=read.nextInt();
                    System.out.println("Ingrese el segundo lado corto");
                    lc2=read.nextInt();
                    System.out.println("Ingrese el lado largo");
                    ll=read.nextInt();
                    if ((lc1+lc2)<ll){
                        System.out.println("¡Error, ingrese los lados correctos!");
                    }
                    if (lc1==lc2 && lc1==ll && ll==lc2){
                        System.out.println("El triángulo es: Triángulo equilátero");
                    }
                    else if (lc1==lc2 || lc1==ll || ll==lc2){
                        System.out.println("El triángulo es: Triángulo isósceles");
                    }
                    else if (lc1!=lc2 || lc1!=ll || ll!=lc2){
                        System.out.println("El triángulo es; Triángulo escaleno");
                    }
                }
                break;
            default:
                System.out.println("¡Error, opción no válida!");
        }
        read.close();
    }
}

