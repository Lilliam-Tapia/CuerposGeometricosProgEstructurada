import java.util.Scanner;

public class App {
    public static void main(String[] args){
       Scanner lector = new Scanner(System.in);
       double altura=0,areaL,areaTotal,Vol;
       double areaBase,perBase,radio=0,Apent,Areabase;
       int intentos = 3;
       int cantidadLados,angulo,arista=0;
       double longitudLados=0,apotemaPiramide,areaCara;
       double apotema=0, generatriz,area,radioM=0;
       double aream,volum,a,b,c,diagonal;
       double AM,Pbase,Am;
       int opc;
      
       System.out.println("Calcular el area lateral,total y volumen.");
       System.out.println("Menu de opciones: ");
       System.out.println("1)Prisma:");
       System.out.println("2)Cilindro:");
       System.out.println("3)Pirámide:"); 
       System.out.println("4)Cono:");
       System.out.println("5)Esfera:");
       System.out.println("6)Zona Esférica:");
       System.out.println("7)Casquete Esférico:");
       System.out.println("8)Huso esférico y cuña esférica:");
       System.out.println("9)Ortoedro:");
       System.out.println("10)Tetaedro:");
       System.out.println("11)Hexaedro:");
       System.out.println("12)Octaedro:");
       System.out.println("13)Dodecaedro:");
       System.out.println("14)Icosaedro:");
       System.out.println("15)Tronco de cono:");
       System.out.println("16)Tronco de pirámide:");
       System.out.println("17)Salir:");
        
       do {
        System.out.print("Ingresa una opción: ");
        opc = lector.nextInt();
        
        if (opc <= 0 || opc > 17) {
            intentos--;
            System.out.println("Opción inválida. Intenta nuevamente.");
        }
        
        if (intentos <= 0) {
            System.out.println("Has alcanzado el límite de intentos. Saliendo del programa.");
            break;
        }
    } while (opc <= 0 || opc > 17);

       switch(opc){
        case 1:
        do {
          System.out.print("Cantidad lados: ");
          cantidadLados = lector.nextInt();

          if (cantidadLados <= 0) {
              System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
              intentos--;
          } else {
              break;
          } 
        } while (intentos > 0);

        if (intentos == 0) {
          System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
          break;
        } else {
          intentos = 3; 

          do {
              System.out.print("Altura: ");
              altura = lector.nextDouble();

              if (altura <= 0) {
                  System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                  intentos--;
              } else {
                  break;
              }
          } while (intentos > 0);

          if (intentos == 0) {
              System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
              break;
            
          } else {
              intentos = 3; 
              do {
                  System.out.print("Longitud de los lados: ");
                  longitudLados = lector.nextInt();

                  if (longitudLados <= 0) {
                      System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                      intentos--;
                  } else {
                      break;
                  }
              } while (intentos > 0);

              if (intentos == 0) {
                  System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                  break;
                }
              }  
            }   
             
         perBase = cantidadLados * longitudLados;
         areaL = perBase * altura;
         double alfa = (Math.PI/180) * (360/cantidadLados);
         apotema = longitudLados / (2 * Math.tan((alfa)/2));
         areaBase = (perBase * apotema)/2;
         areaTotal = areaL + 2 * areaBase;
         Vol = areaBase * altura;

         System.out.println("Area lateral: " + areaL + " unidades cuadradas.");
         System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
         System.out.println("Volumen: " + Vol + " unidades cubicas.");
        
         break;
          
        case 2:
       
        do {
          System.out.print("Ingrese la altura: ");
          altura = lector.nextDouble();

          if (altura <= 0) {
              System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
              intentos--;
          } else {
              break;
          }
      } while (intentos > 0);

      if (intentos == 0) {
          System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
          break;
      } else {
          intentos = 3; 
          do {
              System.out.print("Ingrese el radio: ");
              radio = lector.nextDouble();

              if (radio <= 0) {
                  System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                  intentos--;
              } else {
                  break;
              }
            } while (intentos > 0);

           if (intentos == 0) {
              System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
              break;
            }
        }

         perBase = 2*Math.PI*radio;
         areaL = perBase*altura;
         areaBase= Math.PI* (radio*radio);
         areaTotal = 2*Math.PI*radio*(altura + radio);
         Vol = areaBase*altura;
         System.out.println("El Area Lateral del cubo es: " + areaL + " unidades cuadradas");
         System.out.println("El Area Total del cubo es: " + areaTotal + " unidades cuadradas");
         System.out.println("El volumen del cubo es: " + Vol + " unidaes cuadradas");
         
         break;

      case 3:
        
      do {
        System.out.print("Ingresa la altura de la piramide: ");
        altura = lector.nextDouble();
    
        if (altura <= 0) {
            System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
            intentos--;
        } else {
            break;
        } 
      } while (intentos > 0);
    
      if (intentos == 0) {
        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
        break;
      } else {
        intentos = 3; 
    
        do {
            System.out.print("Ingrese la cantidad de lados de la piramide: ");
            cantidadLados= lector.nextInt();
    
            if (cantidadLados <= 0) {
                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                intentos--;
            } else {
                break;
            }
        } while (intentos > 0);
    
        if (intentos == 0) {
            System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
            break;
        } else {
            intentos = 3; 
            do {
                System.out.print("Ingrese el apotema de la piramide: ");
                apotemaPiramide = lector.nextDouble();
    
                if (apotemaPiramide <= 0) {
                    System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                    intentos--;
                } else {
                    break;
                }
            } while (intentos > 0);
    
            if (intentos == 0) {
                System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                break;
              }
            }  
            do {
                System.out.print("Ingrese la longitud de los lados: ");
                longitudLados = lector.nextDouble();
        
                if (longitudLados <= 0) {
                    System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                    intentos--;
                } else {
                    break;
                }
            } while (intentos > 0);
        
            if (intentos == 0) {
                System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                break;
            } else {
                intentos = 3; 
                do {
                    System.out.print("Ingrese el apotema de la base: ");
                    apotema = lector.nextDouble();
        
                    if (apotema <= 0) {
                        System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                        intentos--;
                    } else {
                        break;
                    }
                } while (intentos > 0);
        
                if (intentos == 0) {
                    System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                    break;
                  }
                } 
          }   
          

         perBase = cantidadLados * longitudLados;
         apotemaPiramide = (Math.sqrt(altura*altura)+(apotema*apotema));
         areaL = (perBase*apotemaPiramide)/2;
         areaBase = perBase*2*(apotema+apotemaPiramide);
         areaTotal = (areaL+areaBase);
         Vol = (areaBase+altura)/3;
         System.out.println("El area Lateral de la pirámide es: "+areaL+" unidades cuadradas");
         System.out.println("El area total de la pirámide es "+areaTotal+" unidades cuadrados");
         System.out.println("El volumen de la pirámide es: "+Vol+ " unidades cuadradas");
        
         break;
      
        case 4:
        
        do {
          System.out.print("Ingrese la altura del cono: ");
          altura = lector.nextDouble();

          if (altura <= 0) {
              System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
              intentos--;
          } else {
              break;
          }
      } while (intentos > 0);

      if (intentos == 0) {
          System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
          break;
      } else {
          intentos = 3; 
          do {
              System.out.print("Ingrese el radio del cono: ");
              radio = lector.nextDouble();

              if (radio <= 0) {
                  System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                  intentos--;
              } else {
                  break;
              }
          } while (intentos > 0);

          if (intentos == 0) {
              System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
              break;
            }
        }
     
         perBase = (Math.PI*radio);
         generatriz = Math.sqrt((radio*radio)+(altura*altura));
         areaL = perBase*generatriz;
         areaBase = (Math.PI*(radio*radio));
         areaTotal = areaL + areaBase;
         Vol = areaBase*altura/3;
     
         System.out.println("El area lateral el cono es: "+areaL+" unidades cuadradas");
         System.out.println("El area total del cono es: "+areaTotal+" unidaes cuadradas");
         System.out.println("el volumen del cono es: "+Vol+ " unidades cuadradas");
       
         break;

        case 5:
       
        do {
          System.out.print("Ingrese el valor del radio: ");
          radio = lector.nextDouble();

          if (radio <= 0) {
              System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
              intentos--;
          } else {
              break;
          }
        } while (intentos > 0);

       if (intentos == 0) {
          System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
          break;
        }
          area = 4*Math.PI*(radio*radio);
          Vol = 4.0/3.0*Math.PI*(radio*radio*radio);

         System.out.println("El valor del area es: "+area+" m cuadrados");
         System.out.println("El valor del volumen es: "+Vol+" m cuadrados");
         break;
    
       case 6:

       do {
        System.out.print("Ingresa la altura: ");
        altura = lector.nextDouble();
    
        if (altura <= 0) {
            System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
            intentos--;
        } else {
            break;
        } 
      } while (intentos > 0);
    
      if (intentos == 0) {
        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
        break;
      } else {
        intentos = 3; 
    
        do {
            System.out.print("Ingrese el radio menor: ");
            radio = lector.nextDouble();
    
            if (radio <= 0) {
                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                intentos--;
            } else {
                break;
            }
        } while (intentos > 0);
    
        if (intentos == 0) {
            System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
            break;
        } else {
            intentos = 3; 
            do {
                System.out.print("Ingrese el radio Mayor: ");
                radioM = lector.nextDouble();
    
                if (radioM <= 0) {
                    System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                    intentos--;
                } else {
                    break;
                }
            } while (intentos > 0);
    
            if (intentos == 0) {
                System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                break;
              }
            }  
          }   
         area = 2*Math.PI*radioM*altura;
         Vol = Math.PI*altura*((altura*altura)+3*radioM+3*radio)/6;

         System.out.println("El area de la zona esferica es: "+area+" cm cuadradas");
         System.out.println("El volumen de la zona esferica es: "+Vol+" cm cuadradas");
         
         break;
    
        case 7:
         
        do {
          System.out.print("Ingresa la altura: ");
          altura = lector.nextDouble();
      
          if (altura <= 0) {
              System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
              intentos--;
          } else {
              break;
          } 
        } while (intentos > 0);
      
        if (intentos == 0) {
          System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
          break;
        } else {
          intentos = 3; 
      
          do {
              System.out.print("Ingrese el radio Mayor: ");
              radioM = lector.nextDouble();
      
              if (radioM <= 0) {
                  System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                  intentos--;
              } else {
                  break;
              }
          } while (intentos > 0);
      
          if (intentos == 0) {
              System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
              break;
          } else {
              intentos = 3; 
              do {
                  System.out.print("Ingrese el radio menor: ");
                  radio = lector.nextDouble();
      
                  if (radio <= 0) {
                      System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                      intentos--;
                  } else {
                      break;
                  }
              } while (intentos > 0);
      
              if (intentos == 0) {
                  System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                  break;
                }
            }  
        }   

         area = 2*Math.PI*radioM*altura;
         aream = Math.PI*((radio*radio)+(altura*altura));
         Vol = Math.PI*(altura*altura)*(3*radioM-altura)/3;
         volum= Math.PI*altura/6*(3*(radio*radio)+(altura*altura));

         System.out.println("Area en funcion del radio de la esfera: "+area);
         System.out.println("Area en funcion del radio menor: "+aream);
         System.out.println("volumen en funcion del radio de la esfera: "+Vol);
         System.out.println("Area en funcion del radio menor: "+volum);
        
         break;

        case 8:
         
        do {
            System.out.print("Ingresa el valor del radio: ");
            radio = lector.nextDouble();

            if (radio <= 0) {
                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                intentos--;
            } else {
                break;
            }
        } while (intentos > 0);

        if (intentos == 0) {
            System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
            break;
          
        } else {
            intentos = 3; 
            do {
                System.out.print("Ingrese el valor del ángulo: ");
                angulo = lector.nextInt();

                if (angulo <= 0) {
                    System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                    intentos--;
                } else {
                    break;
                }
            } while (intentos > 0);

            if (intentos == 0) {
                System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                break;
              }
            }  
            

         area = 4*(Math.PI*(radio*radio)*angulo/360);
         Vol = (4.0/3.0)*(Math.PI*(radio*radio*radio)*angulo/360);

         System.out.println("El area del uso esferico es: "+area); 
         System.out.println("El volumen de una cuña esferica es: "+Vol);
          
         break;

       case 9:
          
       do {
        System.out.print("Ingresa el valor de a: ");
        a = lector.nextDouble();

        if (a <= 0) {
            System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
            intentos--;
        } else {
            break;
        } 
      } while (intentos > 0);

      if (intentos == 0) {
        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
        break;
      } else {
        intentos = 3; 

        do {
            System.out.print("Ingresa el valor de b: ");
            b = lector.nextDouble();

            if (b <= 0) {
                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                intentos--;
            } else {
                break;
            }
        } while (intentos > 0);

        if (intentos == 0) {
            System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
            break;
          
        } else {
            intentos = 3; 
            do {
                System.out.print("Ingrese el valor de c: ");
                c = lector.nextDouble();

                if (c <= 0) {
                    System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                    intentos--;
                } else {
                    break;
                }
            } while (intentos > 0);

            if (intentos == 0) {
                System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                break;
              }
            }  
          }   

          area = 2*(a*b+a*c+b*c);
          diagonal = Math.sqrt((a*a)+(b*b)+(c*c));
          Vol = a*b*c;

         System.out.println("El valor del area es: "+area+" cm cuadrados");
         System.out.println("El valor del volumen es: "+Vol+" cm cuadrados");
         System.out.println("El valor de la diagonal es: "+diagonal+" cm cuadrados");
         
         break;

        case 10:

          while (intentos > 0) {
            System.out.print("Ingrese el valor de la arista: ");
            arista = lector.nextInt();

            if (arista <= 0) {
                System.out.println("La longitud de la arista debe ser mayor que cero. Inténtelo de nuevo.");
                intentos--;
            } else {
                break; 
            }
        }

        if (intentos == 0) {
            System.out.println("Se ha excedido el número máximo de intentos. Programa terminado.");
            break;
        }
         
         area = ((arista*arista)*Math.sqrt(3));
         altura = (arista*(Math.sqrt(6)/3));
         Vol = ((Math.sqrt(2)/12)*(arista*arista*arista));

         System.out.println("El valor del area es: "+area);
         System.out.println("El valor de la altura es: "+altura);
         System.out.println("El valor del volumen es: "+Vol);
 
         break;

        case 11:
         
         do {
            System.out.print("Ingresa el valor de la arista: ");
            arista = lector.nextInt();

            if (arista <= 0) {
                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                intentos--;
            } else {
                break;
            }
        } while (intentos > 0);

        if (intentos == 0) {
            System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
            break;
          
        } else {
            intentos = 3; 
            }
         area = (6*(arista*arista));
          Vol = (arista*arista*arista);
         diagonal = (arista*Math.sqrt(3));

         System.out.println("El area del hexaedro es: "+area); 
         System.out.println("El volumen del hexaedro es: "+Vol);
         System.out.println("La diagonal del hexaedro es: "+area);

         break;

       case 12:
        
       do {
            System.out.print("Ingresa el valor de la arista: ");
            arista = lector.nextInt();

            if (arista <= 0) {
                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                intentos--;
            } else {
                break;
            }
        } while (intentos > 0);

        if (intentos == 0) {
            System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
            break;
          
        } else {
            intentos = 3; 
            }
        
         areaTotal = (2*(arista*arista)*Math.sqrt(3));
          areaCara = areaTotal/8;
          Vol = Math.sqrt(2)/3*(arista*arista*arista);

         System.out.println("El valor del area Total es: "+areaTotal+ " cm cuadrados");
         System.out.println("El valor del area de la cara es: "+areaCara+" cm cuadrados");
         System.out.println("El valor del volumen es: "+Vol+" cm cuadrados");
         break;

       case 13:
    
         do {
            System.out.print("Ingresa el valor de la arista: ");
            arista = lector.nextInt();

            if (arista <= 0) {
                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                intentos--;
            } else {
                break;
            }
        } while (intentos > 0);

        if (intentos == 0) {
            System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
            break;
          
        } else {
            intentos = 3; 
            }

         alfa = 36*(Math.PI/180);
         apotema = (arista/2*Math.tan(alfa));
         area = 3*(arista*arista)*Math.sqrt(25+10*Math.sqrt(5));
         Apent = 5/2*arista*apotema;
         Vol = 1.0/4*(15+7*Math.sqrt(5))*(arista*arista*arista);

         System.out.println("El area del Dodecaedro es: "+area+" cm cuadradas");
         System.out.println("El area de un pentagono del dodecaedro es: "+Apent+" cm cuadradas");
         System.out.println("El volumen del dodecaedro es: "+Vol+" cm cuadradas");
         break;

       case 14:
        
        do {
            System.out.print("Ingresa el valor de la arista: ");
            arista = lector.nextInt();

            if (arista <= 0) {
                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                intentos--;
            } else {
                break;
            }
        } while (intentos > 0);

        if (intentos == 0) {
            System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
            break;
          
        } else {
            intentos = 3; 
            }
           

         
         areaTotal = (5*(arista*arista)*Math.sqrt(3));
         areaCara = areaTotal/20;
         Vol = ((5.0/12)*(3+ Math.sqrt(5)*arista*arista*arista));

         System.out.println("El valor del area Toltal es: "+areaTotal+" cm cuadrados");
         System.out.println("El valor del area de las caras es: "+areaCara+" cm cuadrados");
         System.out.println("El valor del volumen es: "+Vol+" cm cuadrados");
         break;

       case 15:
         
       do {
        System.out.print("Ingresa la altura: ");
        altura = lector.nextDouble();
    
        if (altura <= 0) {
            System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
            intentos--;
        } else {
            break;
        } 
      } while (intentos > 0);
    
      if (intentos == 0) {
        System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
        break;
      } else {
        intentos = 3; 
    
        do {
            System.out.print("Ingrese el radio menor: ");
            radio = lector.nextInt();
    
            if (radio <= 0) {
                System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                intentos--;
            } else {
                break;
            }
        } while (intentos > 0);
    
        if (intentos == 0) {
            System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
        } else {
            intentos = 3; 
            do {
                System.out.print("Ingrese el radio Mayor: ");
                radioM = lector.nextInt();
    
                if (radioM <= 0) {
                    System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                    intentos--;
                } else {
                    break;
                }
            } while (intentos > 0);
    
            if (intentos == 0) {
                System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                break;
              }
            }  
          }   
         generatriz = Math.sqrt((altura*altura)+(radioM*radioM-radio*radio));
         areaL = Math.PI*generatriz*(radioM+radio);
         areaBase = Math.PI*radioM;
         Areabase = Math.PI*radio;
         areaTotal = areaL + areaBase+ Areabase;
         Vol = 1.0/3*Math.PI*altura*((radioM*radioM)+(radio*radio)+radioM*radio);


         System.out.println("El area lateral es: "+areaL+" unidades cuadradas");
         System.out.println("El area total es: "+areaTotal+" unidades cuadradas");
         System.out.println("El volumen es: "+Vol+" unidades cuadradas");
         
         break;

        case 16: 
          
        do {
          System.out.print("Ingresa la longitud da la arista mayor: ");
          AM = lector.nextDouble();
      
          if (AM <= 0) {
              System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
              intentos--;
          } else {
              break;
          } 
        } while (intentos > 0);
      
        if (intentos == 0) {
          System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
          break;
        } else {
          intentos = 3; 
      
          do {
              System.out.print("Ingrese la longitud de la arista menor: ");
              Am = lector.nextDouble();
      
              if (Am <= 0) {
                  System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                  intentos--;
              } else {
                  break;
              }
          } while (intentos > 0);
      
          if (intentos == 0) {
              System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
          } else {
              intentos = 3; 
              do {
                  System.out.print("Ingrese el valor de la altura: ");
                  altura = lector.nextDouble();
      
                  if (altura <= 0) {
                      System.out.println("El valor debe ser mayor a cero. Intente nuevamente.");
                      intentos--;
                  } else {
                      break;
                  }
              } while (intentos > 0);
      
              if (intentos == 0) {
                  System.out.println("Se superó el número máximo de intentos. El programa finalizará.");
                  break;
                }
              }  
            }   

          c= (AM-Am)/2;
          a = Math.sqrt((altura*altura)+(c*c));
          perBase = AM*altura; 
          Pbase = Am*altura;
          areaL = (perBase+Pbase)/2*a;
          areaBase = (AM*AM);
          Areabase = (Am*Am);
          areaTotal= areaL+areaBase+Areabase;
          Vol = 1.0/3*altura*(areaBase+Areabase+Math.sqrt(areaBase*Areabase));

          System.out.println("El area lateral es igual a: "+areaL+" cm cuadradas");
          System.out.println("El area total es igual a: "+areaTotal+" cm cuadradas");
          System.out.println("El volumen es igual a: "+Vol+" cm cuadradas");

         break;
        
        case 17:
            System.out.println("Usted ha salido del programa. Adios.");
        break;
       }
      lector.close();
    }
}
