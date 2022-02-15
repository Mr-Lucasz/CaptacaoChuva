/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhofinal;


import java.util.ArrayList;

public class Telhado{
   
    private double comprimento;
    private double largura;
    private ArrayList<Chuva> quantChuva;
    
    public Telhado(double comprimento, double largura){
        this.largura = largura;
        this.comprimento = comprimento;
        this.quantChuva = new ArrayList<Chuva>();
    }
    
    public void addChuva(Chuva chu){
        this.quantChuva.add(chu);
    }
    
    public Chuva getChuva(){
        for(int i = 0; i < this.quantChuva.size(); i++){
            Chuva chu = this.quantChuva.get(i);
            return chu;
        }return null;
    }
    
    public void imprimirChuvaDia(){
        System.out.println("Quantidade de chuva armazenada: \n");
        for(Chuva chu : this.quantChuva){
            System.out.println(chu.toString() + "\n");
        }
    }
    
    public boolean setComprimento(double comprimento){
        if(comprimento > 0){
            this.comprimento = comprimento;
            return true;
        }else{
            return false;
        }
    }
    
    public double getComprimento(){
        return this.comprimento;
    }
    
    public boolean setLargura(double largura){
        if(largura > 0){
            this.largura = largura;
            return true;
        }else{
            return false;
        }
    }
    
    public double getLargura(){
        return this.largura;
    }
    
    public String toString(){
        String chuvaTelhado = "O telhado tem o volume de: "+(this.largura * this.comprimento);
        return chuvaTelhado;
    }
}
