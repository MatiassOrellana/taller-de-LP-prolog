import org.jpl7.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Integer;

public class Taller2Prolog {

	public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
	    
        //se llama al archivo pl para las consultas
		
		String continuar="1";
		
		System.out.println( "-------BIENVENIDO----------\n");
         
		
		while (continuar!="0") {
			
		int totalcomidas=0;
		int almuerzo=0;
		int desayuno=0;
		int cena=0;
		
		int caloriasMes=0;
		
        Query q1 = 
                new Query( 
                "consult", 
                new Term[] {new Atom("C:\\Users\\morgu\\eclipse-workspace\\Taller2\\src\\diaslimpios.pl")} 
                );

        System.out.println( (q1.hasSolution()? "":""));
        
        
        
        //TERCERA PREGUNTA CALORIAS POR DIA Y ADVERTENCIA
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"
        
        
        System.out.println( "-------------------------\n");
        System.out.println( "Ingrese una opción:\n");
        
        System.out.println( "1)Consulta 1");
        System.out.println( "2)Consulta 2");
        System.out.println( "3)Consulta 3");
        System.out.println( "4)Consulta 4");
        System.out.println( "5)Consulta 5");
        
        String consulta = br.readLine(); 
        System.out.println(consulta);
        
        if (consulta.equalsIgnoreCase("3")) {
        //X entregara la cantidad total de calorías de un día
        	Variable X = new Variable("X");
     
        
        //Y entregara la opción adecuada segun la cantidad de calorías consumidas en un día
        	Variable Opcion = new Variable("Opcion");
        
        
        
        
        
        	System.out.println( "-------------Consulta3------------");
        	System.out.println("Calorias consumidas por día");
        	System.out.println("Por favor ingrese el dia: ");//Se pide un día al usuario
        	String NumeroDia = br.readLine(); 
       
	        Query q4 = 
	          new Query( 
          
	              ("ccaloriasporDia"), 
	              new Term[] {new Atom("d"+NumeroDia),X,Opcion} 
	              
	              
	         );

	        java.util.Map<String,Term> solution;
        
	        solution = q4.oneSolution();

        
        
	        String Numero=q4.oneSolution().get("X").toString();
        
   
        
       
		    int number = Integer.parseInt(Numero);
		    int numer2=number*1;
		    
		    System.out.println( "Las calorias totales consumidas fueron: " +numer2+" cal");
	        System.out.println( "-------------------------");

	        String mensaje=q4.oneSolution().get("Opcion").toString();
	        
	        
	        
	        
		    int mensajeAd = Integer.parseInt(mensaje);
		    if (mensajeAd==0) {
		    	
		    	System.out.println( "Usted esta consumiendo menos calorias de las recomendadas!,Aumentar calorias! ");
		    }
		    if (mensajeAd==1) {
		    	System.out.println( "Usted esta consumiendo la cantidad de calorias recomendadas! ");
		    }
		    if (mensajeAd==2) {
		    	System.out.println( "Usted esta consumiendo mas calorias de las recomendadas,Disminuir calorias! ");
		    }
	    
       

		    System.out.println( "**********Consulta3 Finalizada***********\n");
        }
       //FINAL DE TERCERA PREGUNTA CALORIAS POR DIA Y ADVERTENCIA
        
        
        
        if (consulta.equalsIgnoreCase("1")|consulta.equalsIgnoreCase("2")) {
        
       //PRIMERA PREGUNTA ALIMENTOS Y COMIDA POR DIA(ADVERTENCIA DE CALORIAS)
        
       //solo para omitar la lista
        	Variable A = new Variable("A");
      //variable que guardara cantidad de alimentos
        	Variable W = new Variable("W");
     
        
	        Variable E = new Variable("E");
	        System.out.println( "-------------Consulta1 y 2------------");
	        System.out.println("Alimentos y comidas consumidas por día");//Se pide un día al usuario
	        String pregunta = consulta; 
	        
	        System.out.println("Por favor ingrese el dia: ");//Se pide un día al usuario
	        String i = br.readLine(); 
	        
	        Query q6 = 
	        		new Query( 
          
	        				("alimentosporDia"), 
	        				new Term[] {new Atom("d"+i),A,W,E} 
              
              
	        				);

	        java.util.Map<String,Term> solution2;
        
	        solution2 = q6.oneSolution();

        
        
	        if (pregunta.equalsIgnoreCase("1")) {
	        	System.out.println( "Los alimentos consumidos este día fueron: " + solution2.get("W"));
	        }
        
	        String mensaje1=q6.oneSolution().get("E").toString();
        
        
        
        
	        int mensajeAd1 = Integer.parseInt(mensaje1);
	        if (mensajeAd1==0) {
	        	if (pregunta.equalsIgnoreCase("1")) {
		    	
	        		System.out.println( "Usted esta consumiendo menos calorias de las recomendadas!,Aumentar calorias! ");
	        	}
	    	
	        }
	        if (mensajeAd1==1) {
	        	if (pregunta.equalsIgnoreCase("1")) {
	        		System.out.println( "Usted esta consumiendo la cantidad de calorias recomendadas! ");
	        	}
	        }
	        if (mensajeAd1==2) {
	        	if (pregunta.equalsIgnoreCase("1")) {
	        		System.out.println( "Usted esta consumiendo mas calorias recomendadas,Disminuir calorias! ");
	        	}
	        }
	    
	        String cantAlimentos =q6.oneSolution().get("W").toString();
        
        
        
        
		    int cantAlimentos1 = Integer.parseInt(cantAlimentos);
		    if (cantAlimentos1>3) {
		    	
		    	if (pregunta.equalsIgnoreCase("2")) {
	    	
		    		System.out.println( "Usted esta comiendo mas de tres veces al día,le recomendamos comer un desayuno,un almuerzo y una cena.");
		    	}
		    }
	    
        
      
	        Variable Valor = new Variable("Valor");
	        Variable Valor1 = new Variable("Valor1");
	        Variable Valor2 = new Variable("Valor2");
	        
        
       
	        Query q5 = 
        		
	                new Query( 
	                
	                    ("estaEn"), 
	                    new Term[] {new Atom("d"+i),new Atom ("almuerzo"),Valor} 
	                    
	                    
	                );


              java.util.Map<String,Term> solution1;
              
              solution1 = q5.oneSolution();

              
              ;
             
              
              
              String valor=q5.oneSolution().get("Valor").toString();
              int valor_0 = Integer.parseInt(valor);
        
      	      if (valor_0==1) {
      	    	
      	    	  
    	    	  totalcomidas+=1;
    	    	  almuerzo+=1;
      	      }
      	      
      	      
      	    
      	      
      	     
      	    
      	      Query q3 = 
            		
            		new Query( 
                            
                		("estaEn"), 
                		new Term[] {new Atom("d"+i),new Atom ("cena"),Valor2} 
                        
                        
                    );


                  java.util.Map<String,Term> solution_;
                  
                  solution_ = q3.oneSolution();

                  
               
                  
       
                  
                  String valor2=q3.oneSolution().get("Valor2").toString();
                  int valor_2 = Integer.parseInt(valor2);
          	    
          	      if (valor_2==1) {
        	    	  
        	    	  totalcomidas+=1;
        	    	  cena+=1;
        	      }
          	      
          	    
          	      
          	    Query q8 = 
                		
                        new Query( 
                        
                            ("estaEn"), 
                            new Term[] {new Atom("d"+i),new Atom ("desayuno"),Valor1} 
                            
                            
                        );


                      java.util.Map<String,Term> solution1_;
                      
                      solution1_ = q8.oneSolution();

                      
                      
                     
                      
                     
                      
                      String valor1=q8.nextSolution().get("Valor1").toString();
                      int valor_1 = Integer.parseInt(valor1);
                      
                      
              	    
              	     
              	      if (valor_1==1) {
              	    	  
              	    	  totalcomidas+=1;
              	    	  desayuno+=1;
              	      }
              	      
              	      
              	      System.out.println("Su comidas del dia fueron: "+totalcomidas);
              	      
              	      
              	      if (almuerzo==0) {
              	    	  if (pregunta.equalsIgnoreCase("2")) {
              	    		  System.out.println("A usted le falta almuerzo como comida en su dieta.");
              	    	  }
             	      }
              	      if (desayuno==0) {
              	    	  if (pregunta.equalsIgnoreCase("2")) {
              	    		  System.out.println("A usted le falta desayuno como comida en su dieta.");
              	    	  }
            	      }
             	      
              	      if (cena==0) {
              	    	  if (pregunta.equalsIgnoreCase("2")) {
              	    		  System.out.println("A usted le falta cena como comida en su dieta.");
              	    	  }
              	      }
              	      
              	      
              	      
          	    
                 

              System.out.println( "*********Consulta1 Finalizada********\n");
              //FIN PRIMERA PREGUNTA ALIMENTOS Y COMIDA POR DIA(ADVERTENCIA DE CALORIAS)
              
     
              
              
              
              
              
              
              
              
        
		
        
        }
        //CUARTA PREGUNTA CALORIAS POR DIA MES Y ADVERTENCIA
        if (consulta.equalsIgnoreCase("4")) {
        
        //X entregara la cantidad total de calorías de un día
        	Variable X1 = new Variable("X1");
        
        //Y entregara la cantidad total de alimentos de un día
        	Variable Y1 = new Variable("Y1");
     
        
        //Y entregara la opción adecuada segun la cantidad de calorías consumidas en un día
        	Variable Opcion1 = new Variable("Opcion1");
        
        
        
        	int pregunta4=0;
        	System.out.println( "-------------Consulta4------------");
        	while (pregunta4<30) {
        	
        
        
        	System.out.println("Calorias consumidas por mes");
        	pregunta4+=1;
        
	        Query q9 = 
	          new Query( 
	          
	              ("ccaloriasporDia"), 
	              new Term[] {new Atom("d"+pregunta4),X1,Opcion1} 
	              
	              
	          );

	        java.util.Map<String,Term> solution4;
	        
	        solution4 = q9.oneSolution();

        
	        
	        String caloriasD=q9.oneSolution().get("X1").toString();
	        
	        
	        
	       
		    int caloriasD1 = Integer.parseInt(caloriasD);
		    int caloriasD2=caloriasD1*1;
		    
		    caloriasMes+=caloriasD2;
		    
		    System.out.println( "Las calorias totales consumidas de el dia "+pregunta4+" fueron: " +caloriasD2+" cal.");
		    System.out.println("El consumo de caloria mensuales fue de: "+caloriasMes);
	        System.out.println( "-------------------------");

        
       

       
       
	        }
	        System.out.println("El consumo de caloria mensuales fue de: "+caloriasMes);
	        if (caloriasMes<45000) {
		    	  System.out.println("Su consumo mensual no fue el adecuado,porfavor aumentar el consumo de calorías para el próximo mes.");
		      }
	        if (caloriasMes>52500) {
		    	  System.out.println("Su consumo mensual no fue el adecuado,porfavor disminuir el consumo de calorías para el próximo mes.");
		      }
		      
		      
	        
	        
	        System.out.println( "**********Consulta4 Finalizada***********\n");
		} 
        
       
            
		
		if (consulta.equalsIgnoreCase("5")) {
	            //X entregara la cantidad total de calorías de un día
	            	Variable X1 = new Variable("X1");
	            	Variable X2 = new Variable("X2");
	            	Variable X3 = new Variable("X3");
	            	
	            	Variable B1 = new Variable("B1");
	            	Variable B2 = new Variable("B2");
	            	Variable B3 = new Variable("B3");
	         
	            
	            
	            
	            
	            
	            
	            
	            	System.out.println( "-------------Consulta5------------");
	            	System.out.println("Calorias consumidas por día");
	            	int pregunta5=0;
	            	System.out.println( "-------------Consulta4------------");
	            	while (pregunta5<30) {
	            	pregunta5+=1;
	            	System.out.println( "Dia: "+pregunta5);
	    	        Query q41 = 
	    	          new Query( 
	              
	    	              ("alimentosporComidas"), 
	    	              new Term[] {new Atom("d"+pregunta5),X1,new Atom("desayuno")} 
	    	              
	    	              
	    	         );

	    	        java.util.Map<String,Term> solution44;
	            
	    	        solution44 = q41.oneSolution();

	            
	            
	    	        String listaAlimentos=q41.oneSolution().get("X1").toString();
	    	        System.out.println( "Alimentos consumidos en el desayuno y sus calorias:");
	    		    System.out.println( listaAlimentos);
	    	        
	    		    Query q411 = 
	  	    	          new Query( 
	  	              
	  	    	              ("caloriasalimentosporComidas"), 
	  	    	              new Term[] {new Atom("d"+pregunta5),B1,new Atom("desayuno")} 
	  	    	              
	  	    	              
	  	    	         );

	  	    	        java.util.Map<String,Term> solution441;
	  	            
	  	    	        solution441 = q411.oneSolution();

	  	            
	  	    	        
	  	    	        String listaCalorias=q411.oneSolution().get("B1").toString();
	  	            
	  	    		    System.out.println( listaCalorias);
	  	    		    System.out.println( "\n");
	    	        
	    	    //almuerzo
	  	    		  Query q09 = 
	  		    	          new Query( 
	  		              
	  		    	              ("alimentosporComidas"), 
	  		    	              new Term[] {new Atom("d"+pregunta5),X2,new Atom("almuerzo")} 
	  		    	              
	  		    	              
	  		    	         );

	  		    	        java.util.Map<String,Term> solution09;
	  		            
	  		    	        solution09 = q09.oneSolution();

	  		            
	  		            
	  		    	        String listaAlimentos2=q09.oneSolution().get("X2").toString();
	  		    	        System.out.println( "Alimentos consumidos en el almuerzo y sus calorias:");
	  		    		    System.out.println( listaAlimentos2);
	  		    	        
	  		    		    Query q009 = 
	  		  	    	          new Query( 
	  		  	              
	  		  	    	              ("caloriasalimentosporComidas"), 
	  		  	    	              new Term[] {new Atom("d"+pregunta5),B2,new Atom("almuerzo")} 
	  		  	    	              
	  		  	    	              
	  		  	    	         );

	  		  	    	        java.util.Map<String,Term> solution009;
	  		  	            
	  		  	    	        solution009 = q009.oneSolution();

	  		  	            
	  		  	    	        
	  		  	    	        String listaCalorias2=q009.oneSolution().get("B2").toString();
	  		  	            
	  		  	    		    System.out.println( listaCalorias2);
	  		  	    		    System.out.println( "\n");   
	  		  	    	
	  		  	    		    
	  		  	    		Query q08 = 
	  	  		    	          new Query( 
	  	  		              
	  	  		    	              ("alimentosporComidas"), 
	  	  		    	              new Term[] {new Atom("d"+pregunta5),X3,new Atom("cena")} 
	  	  		    	              
	  	  		    	              
	  	  		    	         );

	  	  		    	        java.util.Map<String,Term> solution08;
	  	  		            
	  	  		    	        solution08 = q08.oneSolution();

	  	  		            
	  	  		            
	  	  		    	        String listaAlimentos3=q08.oneSolution().get("X3").toString();
	  	  		    	        System.out.println( "Alimentos consumidos en la cena y sus calorias:");
	  	  		    		    System.out.println( listaAlimentos3);
	  	  		    	        
	  	  		    		    Query q008 = 
	  	  		  	    	          new Query( 
	  	  		  	              
	  	  		  	    	              ("caloriasalimentosporComidas"), 
	  	  		  	    	              new Term[] {new Atom("d"+pregunta5),B3,new Atom("cena")} 
	  	  		  	    	              
	  	  		  	    	              
	  	  		  	    	         );

	  	  		  	    	        java.util.Map<String,Term> solution008;
	  	  		  	            
	  	  		  	    	        solution008 = q008.oneSolution();

	  	  		  	            
	  	  		  	    	        
	  	  		  	    	        String listaCalorias3=q008.oneSolution().get("B3").toString();
	  	  		  	            
	  	  		  	    		    System.out.println( listaCalorias3);
	  	  		  	    		    System.out.println( "\n");		    

	    		    
	            }
	            	System.out.println( "**********Consulta5 Finalizada***********\n");
		 }
	           //FINAL DE TERCERA PREGUNTA CALORIAS POR DIA Y ADVERTENCIA
		}
    }
}

		
