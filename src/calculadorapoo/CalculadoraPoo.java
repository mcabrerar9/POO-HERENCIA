/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorapoo;
import java.util.Scanner;




public class CalculadoraPoo {
    @SuppressWarnings("UnusedAssignment")    
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
      
       
       CalculadoraEspecial calculadoraEspecial;
       System.out.println("-----------------------");
       calculadoraEspecial = new CalculadoraEspecial("Mar", "Azul", 9, "MLCR2023", "Mar");
       boolean salir = false;
       int opcion, opcioncalculadora, num1,  num2;      
       //mostrar los datos
       calculadoraEspecial.mostrarDatos();
       System.out.println("-----------------------");
       do{      
           System.out.println("");
           System.out.println("HOLA! ");
           System.out.println("Ingrese la calculadora que desee utilizar");
           System.out.println("");
           System.out.println("-----------------------");
           System.out.println("1. Calculadora Simple");
           System.out.println("2. Calculadora Especial");
           System.out.println("3. Salir");
           System.out.println("-----------------------");       
           opcioncalculadora = sn.nextInt();          
           switch(opcioncalculadora){
               case 1:
                  System.out.println("");
                  System.out.println("-----------------------");
                  System.out.println("1. Sumar");
                  System.out.println("2. Restar");
                  System.out.println("3. Multiplicar");
                  System.out.println("4. Dividir");
                  System.out.println("5. Raiz Cuadrada");
                  System.out.println("6. Verificar numero Primo");
                  System.out.println("7. Salir");
                  System.out.println("Selecciona una opcion");
                  System.out.println("-----------------------");                  
                  opcion = sn.nextInt();                   
              switch(opcion){
                  case 1:  
                      System.out.println("Ingrese el primer numero de la suma: ");
                      num1 = sn.nextInt();
                      System.out.println("Ingrese el segundo numero de la suma: ");
                      num2 = sn.nextInt();                     
                      System.out.println("El resultado es = " + calculadoraEspecial.sumar(num1, num2));
                      break;
                  case 2:
                      System.out.println("Ingrese el primer numero a restar: ");
                      num1 = sn.nextInt();
                      System.out.println("Ingrese el segundo numero a restar: ");
                      num2 = sn.nextInt();
                      System.out.println("El resultado es = " + calculadoraEspecial.restar(num1, num2));
                      break;
                  case 3:
                      System.out.println("Ingrese el primer multiplo: ");
                      num1 = sn.nextInt();
                      System.out.println("Ingrese el segundo multiplo: ");
                      num2 = sn.nextInt();
                      System.out.println("El resultado es = " + calculadoraEspecial.multiplicar(num1, num2));
                      break;
                  case 4:
                      System.out.println("Ingrese el dividendo: ");
                      num1 = sn.nextInt();
                      System.out.println("Ingrese el divisor: ");
                      num2 = sn.nextInt();
                      System.out.println("El resultado es = " + calculadoraEspecial.dividir(num1, num2));
                      break;
                  case 5:
                      System.out.println("Ingrese un numero al que desee sacarle raíz cuadrada: ");
                      num1 = sn.nextInt();
                      System.out.println("El resultado es = " + calculadoraEspecial.raizCuadrada(num1));
                      break;
                  case 6:
                      System.out.println("Ingrese un numero: ");
                      num1 = sn.nextInt();
                      System.out.println("Es primo? = " + calculadoraEspecial.esPrimo(num1));
                      break;
                  case 7:
                      salir=true;     
                }
              break;          
              case 2:
                    System.out.println("");
                    System.out.println("-----------------------");
                    System.out.println("1. Generar numero aleatorio");
                    System.out.println("2. Calcular potencia");
                    System.out.println("3. Calcular logaritmo");
                    System.out.println("4. Calcular seno");
                    System.out.println("5. Calcular coseno");
                    System.out.println("6. Calcular tangente");
                    System.out.println("7. Calcular raiz cubica");
                    System.out.println("8. Salir");
                    System.out.println("Selecciona una opcion");
                    System.out.println("-----------------------");
                    opcion = sn.nextInt();
                    switch (opcion) {
                        case 1: {
                            System.out.println("Ingrese el limite superior: ");
                            num1 = sn.nextInt();
                            System.out.println("Estr es su numero aleatorio = " + calculadoraEspecial.generarNumeroAleatorio(num1));
                            break;
                        }
                        case 2:{
                            System.out.println("Ingresa la base: ");
                            num1 = sn.nextInt();
                            System.out.println("Ingresa el exponente: ");
                            num2 = sn.nextInt();
                            System.out.println("El resultado es = " + calculadoraEspecial.calcularPotencia(num1, num2));
                            break;
                        }
                        case 3: {
                            System.out.println("Ingresa un numero: ");
                            num1 = sn.nextInt();
                            System.out.println("El resultado del logaritmo es = " + calculadoraEspecial.calcularLogaritmo(num1));
                            break;
                        }
                        case 4: {
                            System.out.println("Ingrese el angulo en radianes: ");
                            num1 = sn.nextInt();
                            System.out.println("El resultado del seno es = " + calculadoraEspecial.calcularSeno(num1));
                            break;
                        }
                        case 5: {
                            System.out.println("Ingrese el angulo en radianes: ");
                            num1 = sn.nextInt();
                            System.out.println("El resultado del coseno es = " + calculadoraEspecial.calcularCoseno(num1));
                            break;
                        }
                        case 6:{
                            System.out.println("Ingrese el angulo en radianes: ");
                            num1 = sn.nextInt();
                            System.out.println("El resultado de la tangente es = " + calculadoraEspecial.calcularTangente(num1));
                            break;
                        }
                        case 7: {
                            System.out.println("Ingrese un numero al que desee sacarle raíz cubiCa: ");
                            num1 = sn.nextInt();
                            System.out.println("El resultado de la raiz cubica es = " + calculadoraEspecial.calcularRaizCubica(num1));
                            break;
                        }
                         case 8: 
                            salir = true;
                    }
                break;   
                case 3:
                    salir=true;
            }  
        }   
        while(!salir);
       System.out.println("Gracias por participar");        
    }
}
