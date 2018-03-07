
package boletin14;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Garaxe {
int numeroCoche;
String matricula;
Scanner sc= new Scanner(System.in);
private double hora,pagado2,devolto,prezo;
  

    public Garaxe() {
    }

    public Garaxe(int numeroCoche, String matricula, double hora, double pagado2, double devolto, double prezo) {
        this.numeroCoche = numeroCoche;
        this.matricula = matricula;
        this.hora = hora;
        this.pagado2 = pagado2;
        this.devolto = devolto;
        this.prezo = prezo;
    }

    @Override
    public String toString() {
        return "Garaxe{" + "numeroCoche=" + numeroCoche + ", matricula=" + matricula + ", hora=" + hora + ", pagado2=" + pagado2 + ", devolto=" + devolto + ", prezo=" + prezo + '}';
    }

  
   
    
    public void meteCoche(){
           for(numeroCoche=1;numeroCoche<=6;numeroCoche++){
           if(numeroCoche<=5){
            System.out.println("Prazas dispoñibles");
            matricula=JOptionPane.showInputDialog("meta a matrícula do coche");
           }
           else {
               System.out.println("Completo");
               break;
           }         
           }
    }
  
       public double prezo(){
          String tempo=JOptionPane.showInputDialog("meta o tempo ingresado");
       hora=Double.parseDouble(tempo);
           if(hora<3){
               prezo=1.5;
           }
           else{
               prezo=this.prezo+(0.2*hora);
           }
    return prezo;
       }
    public void paga(){
        String pagado=JOptionPane.showInputDialog("diñeiro pagado:");
        pagado2=Double.parseDouble(pagado);
        devolto=pagado2-prezo;
  
    }
        
     public void sacaCoche(Object toString){
         JOptionPane.showMessageDialog(null,"Factura \n matricula coche "+matricula+"tempo"+hora+"precio"+prezo+"cartos recibidos"+pagado2+"cartos devoltos"+devolto);
         JOptionPane.showMessageDialog(null,toString);
     }
    

   
    
    public static void main(String[] args) {
       Garaxe a= new Garaxe();
       Garaxe b= new Garaxe();
       Garaxe c= new Garaxe();
       Garaxe d= new Garaxe();
       Garaxe e= new Garaxe();
       a.sacaCoche(a);
      a.meteCoche();
      a.paga();
      a.prezo();
      a.sacaCoche(a);
      a.sacaCoche(b);
      a.sacaCoche(c);
      a.sacaCoche(d);
      a.sacaCoche(e);
    }
    
}
//A clase Garaxe ten como atributos :
//            numeroCoches ( para saber o nº de coches que están nese momento no garaxe )  
//           matricula para identificalo           
//      Antes de deixar aparcar un coche. Debemos comprobar que temos sitio para él, en caso afirmativo poñemos unha mensase “ PLAZAS DISPOÑIBLES “ e rexistramos o coche . No caso contrario poríamos unha mensaxe “ COMPLETO “.
//   Para facer máis doado o programa, suponer que o garaxe ten capacidade para 5 coches
// Para calcular o prezo do aparcamento , considerade o seguinte :
//primeiros 3 horas. ----> 1.5 €
//O resto do tempo : pagamos 0.20 € cada hora.
//A daida será :
//FACTURA
//MATRICULA COCHE ........
//TEMPO .................
//PRECIO...............
//CARTOS RECIBIDOS...........
//CARTOS DEVOLTOS............
//GRACIAS POR USAR O NOSO APARCADOIRO 
