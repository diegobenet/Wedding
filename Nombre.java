// Nombre del Programa: Matrimonio
// Autor: Diego Elizondo Benet
// Objetivo : Sacar fecha del matrimonio hombre y mujer
import java.util.*;
import java.io.*;
class Hombre {
  private Nombre nombre;// cambiar utilizando la clase nombre
  private Fecha fecha;//cambiar utilizando la clase fecha
  private String curp;
        
 public Hombre(Nombre nombre, Fecha fecha, String curp){
  setNombre(nombre);
  setFecha(fecha);
  setCurp(curp);
  }    
     public void setNombre(Nombre nombre){
        this.nombre=nombre;
      }
        public void setCurp(String curp){
        this.curp=curp;
      }
     public Nombre getNombre(){
       return nombre;
      }
     public void setFecha(Fecha fecha){
        this.fecha=fecha;
     }
     public Fecha getFecha(){
        return fecha;
      }
     public String getCurp(){
        return curp;
      }
      
     public int calcular_edad_hombre(int ac){
        int a=fecha.getAnio();
        return ac-a;
     }
     
     public String toString(){
        return nombre+" "+fecha+" "+curp;
      }
     
     }
     
     
     class Mujer {
     private Nombre nombre;//cambiar utilizando la clase nombre
     private Fecha fecha;//cambiar utilizando la clase fecha
     private String curp;
     
    public Mujer(Nombre nombre, Fecha fecha, String curp){
        setNombre(nombre);
        setFecha(fecha);
        setCurp(curp);
        }
     public void setNombre(Nombre nombre){
        this.nombre=nombre;
      }
     public void setFecha(Fecha fecha){
        this.fecha=fecha;
      }
     public void setCurp(String curp){
        this.curp=curp;
     }
    public Nombre getNombre(){
        return nombre;
      }
     public Fecha getFecha(){
        return fecha;
      }
     public String getCurp(){
        return curp;
      }
     
     public int calcular_edad_mujer(int ac){
        int a=fecha.getAnio();
        return ac-a;
     }
     
     public String toString(){
        return getNombre()+" "+getFecha()+" "+curp;
      }
     
     }
    //Empieza clase matrimonio
  class Matrimonio{
        private Hombre h;
        private Mujer m;
        private Fecha fecha_mat;
       
        public Matrimonio(Hombre h,Mujer m,Fecha fecha_mat){
       setHombre(h);
        setMujer(m);
        setFecha_mat(fecha_mat);      
        }
        
    public void setHombre(Hombre h){
       this.h=h;
     }
    public void setMujer(Mujer m){
       this.m=m;
     } 
     
     public void setFecha_mat(Fecha fecha_mat){
       this.fecha_mat=fecha_mat;
     }
 
    public Hombre getHombre(){
       return h;
     }
    public Mujer getMujer(){
       return m;
     }
    public Fecha getFecha_mat(){
       return fecha_mat;
     }
     
       public int calcular_edad_casados(int ac){
       int a=fecha_mat.getAnio();
       return ac-a;
    }
    
      
       public String toString(){
       return "El Matrimonio llevado a cabo en la fecha: "+fecha_mat+"\n"+  "Esta Conformado Por: "+h+" y "+"\n"+m+"\n"+"\n";
     }
       
    }
    
    class Principal{
    public static void main (String args[]){
       
       Calendar c=new GregorianCalendar();
       int ac=c.get(Calendar.YEAR);
       
    Mujer m1= new Mujer(new Nombre("Gloria","perez","Martinez"),new Fecha(5,4,1984),"GIGM840405VC6");
    Mujer m2= new Mujer(new Nombre("Martha","silvia","rio"),new Fecha(9,5,1982),"MGRT840545GHY");
    Mujer m3= new Mujer(new Nombre("Mayra","Lopez","Obrador"),new Fecha(12,6,1985),"GIGM856589HGM");
    
       
    System.out.println("La Edad de la Mujer 1 es: "+m1.calcular_edad_mujer(ac) );
    System.out.println("La Edad de la Mujer 2 es: "+m2.calcular_edad_mujer(ac) );
    System.out.println("La Edad de la Mujer 3 es: "+m3.calcular_edad_mujer(ac)+"\n");
    
    Hombre h1= new Hombre(new Nombre("Luis","martinez","fuentes"), new Fecha(9,12,1981),"LGCC05485CG5");
    Hombre h2= new Hombre(new Nombre("Pepe","cantu","navarro"), new Fecha(20,7,1986),"PEGM050204RTE");
    Hombre h3= new Hombre(new Nombre("Juan","perez","ortiz"), new Fecha(19,1,1972),"JIER980507HLK");
    
    System.out.println("La Edad del hombre 1 es: "+h1.calcular_edad_hombre(ac) );
    System.out.println("La Edad del hombre 2 es: "+h2.calcular_edad_hombre(ac) );
    System.out.println("La Edad del hombre 3 es: "+h3.calcular_edad_hombre(ac)+"\n" );
    
    Matrimonio mat1= new Matrimonio(h1,m1, new Fecha(19,12,2015));
    System.out.println(mat1);
    Matrimonio mat2= new Matrimonio(h2,m2, new Fecha(7,8,2006));
    System.out.println(mat2);
    Matrimonio mat3= new Matrimonio(h3,m3, new Fecha(22,7,1996));
    System.out.println(mat3);
    
    System.out.println("Los Anios de casados del mat.1 es: "+mat1.calcular_edad_casados(ac) );
    System.out.println("Los Anios de casados del mat.2 es: "+mat2.calcular_edad_casados(ac) );
    System.out.println("Los Anios de casados del mat.3 es: "+mat3.calcular_edad_casados(ac) );
 
       }
       }
 public class Nombre{
     private String nom;
     private String ap;
     private String am;
     
  public Nombre(String nom, String ap, String am){
     setNom(nom);
     setAp(ap);
     setAm(am);
    }
 public void setNom(String nom){
    this.nom=nom;
}
 public void setAp(String ap){
    this.ap=ap;
 }
public void setAm(String am){
    this.am=am;
 }
 public String getNom(){
    return nom;
 }
 public String getAp(){
    return ap;
 }
 public String getAm(){
    return am;
 }
 public String toString(){
    return "nombre: "+nom+" Apellido paterno: "+ap+" apellido materno: "+am;
 }
 }
  class Fecha{
     private int dia;
     private int mes;
     private int anio;
     
  public Fecha(int dia, int mes, int anio){
     setDia(dia);
     setMes(mes);
     setAnio(anio);
    }
 public void setDia(int dia){
    this.dia=dia;
 }
 public void setMes(int mes){
    this.mes=mes;
 }
 public void setAnio(int anio){
    this.anio=anio;
 }
 public int getDia(){
    return dia;
 }
 public int getMes(){
    return mes;
 }
 public int getAnio(){
    return anio;
 }
 public String toString(){
    return "dia: "+dia+" Mes: "+mes+" anio: "+anio;
}
}
