public class App {
    public static void main(String[] args) throws Exception {
        

         //Primera parte - comparar variable

         int numeroif = 20;

         if( numeroif > 0 ){
             System.out.println( "El número " + numeroif + " es positivo" );
         }
         else if( numeroif < 0 ){
             System.out.println( "El número " + numeroif + " es negativo" );
         }
         else{
             System.out.println( "El número es 0" );
         }
 
         //segunda Parte - Bucle While
 
          int numeroWhile = 1;
 
         while ( numeroWhile < 3 ){
             System.out.println( numeroWhile++ );
         }
 
         //Tercera Parte - Do While
 
         do {
             System.out.println( numeroWhile );
             numeroWhile =+ 1;
         } while ( numeroWhile > 3 );
 
         //Cuarta Parte - Bucle For
 
         for( int numeroFor = 0 ; numeroFor <= 3; numeroFor++ ){
             System.out.println(numeroFor);
         }
 
         //Quinta Parte - Switch Estacion
 
         var estacion = "INVIERNO";
 
         switch (estacion) {
             case "PRIMAVERA":
                 System.out.println("La estacion es Primavera");    
                 break;
             case "VERANO":
                 System.out.println( "La estacion es Verano" );
                 break;
             case "OTOÑO":
                 System.out.println( "La estacion es Otoño" );
                 break;
             case "INVIERNO":
                 System.out.println( "La estacion es Invierno" );
                 break;
         
             default:
                 System.out.println( "No es una estacion" );
                 break;
         }
    }
}
