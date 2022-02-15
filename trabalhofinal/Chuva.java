/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalhofinal;

public class Chuva{

    private int duracaoMinutos;
    private double intensidade;
   
    public double nivelChuva(){
        double nivelPluviometrico =  (this.duracaoMinutos / 60) * this.intensidade;
        return nivelPluviometrico;
    }
    
    public boolean setDuracaoMinutos(int duracaoMinutos){
        if(duracaoMinutos > 0 && duracaoMinutos < 1440){
            this.duracaoMinutos = duracaoMinutos;
            return true;
        }else{
            return false;
        }
    }
    
    public int getDuracaoMinutos(){
        return this.duracaoMinutos;
    }
    
      public boolean setIntensidade(double intensidade){
        if(intensidade > 0 && intensidade < 100){
            this.intensidade = intensidade;
            return true;
        }else{
            return false;
        }
    }
    
    public double getIntensidade(){
        return this.intensidade;
    }

    @Override
    public String toString() {
        return "Chuva{" + "duracaoMinutos=" + duracaoMinutos + ", intensidade=" + intensidade + '}';
    }
    
   
}


