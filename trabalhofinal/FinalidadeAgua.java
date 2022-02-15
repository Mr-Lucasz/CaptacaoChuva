/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhofinal;

public class FinalidadeAgua {
  
        
  
    private String utilidade;
    private double gastoAgua;

    public FinalidadeAgua(String utilidade, double gastoAgua) {
    }
    
    

    public String getUtilidade() {
        return utilidade;
    }

    public void setUtilidade(String utilidade) {
        this.utilidade = utilidade;
    }

    public double getGastoAgua() {
        return gastoAgua;
    }

    public void setGastoAgua(double gastoAgua) {
        this.gastoAgua = gastoAgua;
    }

    public boolean setGastoAguaLitros(double gastoAgua){
        if (gastoAgua<=0) {
            this.gastoAgua = gastoAgua;
            return false;
        }else{
            
            return true;
        }
        
    }
    public void getTotalIndividuos(int totalIndividuos){
        
    }
    public boolean removerIndividuo (String nome){
        //lembrar o que é esse método
        
        
    }

    @Override
    public String toString() {
        return "FinalidadeAgua{" + "utilidade=" + utilidade + ", gastoAgua=" + gastoAgua + '}';
    }
    
    }
   
  
