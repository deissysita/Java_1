package guiauno;

import java.util.Scanner;

public class AreaPerimetro {
   
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        byte opc;
        double pi=3.14;
        double radio=0, perimetro=0,area=0, b=0, h=0;
        String unidad="",objeto="";
        
        System.out.println("Bienvenido a su programa area y perimetro de su figura");
        System.out.println("Este programa calcula el area y perimetro de un circulo o un rectangulo segun la opcion que desee");
        System.out.println("1. Area y perimetro de un circulo \n2. Area y perimetro de un rectangulo \n3. Area de un triangulo rectangulo");
        System.out.println("Por favor digite la opcion:");
                opc=leer.nextByte();
                
                //siempre se va a pedir unidad de medida, por lo tanto sale del switch
                System.out.println("Por favor digite la unidad de medida");
                unidad=leer.next();
                
                switch (opc){
                    case 1: {
                        do{                                                   
                        System.out.println("Por favor digite el radio de su circulo");
                            radio=leer.nextDouble();
                                               
                        if (radio<=0){
                            System.out.println("Error, el radio no puede ser igual o menor de cero.");
                            }                    
                        }
                        while(radio<=0);
                        
                        objeto="circulo";
                        perimetro=2*radio*pi;
                        area=pi*Math.pow(radio, 2);                       
                    }
                    break;
                    
                    case 2:{
                        do{                                
                            System.out.println("Por favor digite la base del rectangulo");
                                b=leer.nextDouble();
                                
                            System.out.println("Por favor digite la altura del rectangulo");
                                h=leer.nextDouble();
                          
                        if (b==h){
                            System.out.println("Error, La base y la altura no pueden ser iguales.");
                            }
                        }
                        while(b==h);
                        
                        objeto="rectangulo";
                        perimetro=2*(b+h);
                        area=b*h;          
                        }
                        break;
                    case 3:{
                    	do{                                
                            System.out.println("Por favor digite la base del triangulo");
                                b=leer.nextDouble();
                                
                            System.out.println("Por favor digite la altura del triangulo");
                                h=leer.nextDouble();
                          
                        if (b==00 || h==0){
                            System.out.println("Error, La base y la altura no pueden ser ceros.");
                            }
                        }
                        while(b==00 || h==0);
                    	
                    	objeto="triangulo";
                    	area=(b*h)/2;
                    	perimetro=b+h+Math.sqrt((h*h)+(b*b));
                    }
                        default:
                        System.out.println("Error, opcion no valida!");
                }
                
                if (opc>0 && opc <4) {
                    
                    //el perimetro no se mide por unidades cuadradas
                	//Se saca estas lineas al final para no repetirlas por cada case
                    System.out.println("El perimetro del "+objeto+" es: "+perimetro+" "+unidad);
                    System.out.println("El area del "+objeto+" es: "+area+" "+unidad+ "^2");
                }
                leer.close();
        }
}