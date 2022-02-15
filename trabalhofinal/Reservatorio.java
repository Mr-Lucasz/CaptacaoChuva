/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhofinal;


public class Reservatorio
{
    private String tipo;
    private double capacidade;
    
    public Reservatorio(String tipo, double capacidade){
        this.tipo = tipo;
             this.capacidade = capacidade;
    }
    
    public boolean setCapacidade(double capacidade){
        if(capacidade > 0){
            this.capacidade = capacidade;
            return true;
        }else{
            return false;
        }   
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public double getCapacidade(){
        return this.capacidade;
    }
}
