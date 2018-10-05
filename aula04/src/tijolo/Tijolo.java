/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tijolo;

/**
 *
 * @author Dayan
 */
public class Tijolo {
    
    private float altura;
    private float expessura;
    private float comprimento;
    private float fuga;
    
   
     public Tijolo(int comprimento,int altura,int expessura,float fuga,int orientacao){
        switch (orientacao) {
            case 1:
                this.altura = altura;
                this.comprimento = comprimento;
                this.expessura = expessura;
                break;
            case 2:
                //deitado
                this.altura =      expessura;
                this.comprimento = comprimento;
                this.expessura =   altura;
                break;
            case 3:
                //frente
                this.altura  = expessura;
                this.comprimento = altura;
                this.expessura = comprimento;
                break;
            default:
                break;
        }
           
           if (fuga == 0){
               this.fuga = 1;
           }else if(fuga != 0){
               this.fuga = fuga;
           }
    }
   /* public void orientacao(){
        System.out.println("Escolha a orientação do TIJOLO:");
        System.out.println("[1] - Em pé");
        System.out.println("[2] - Deitado");
        System.out.println("[3] - Virado");
    }*/
     
    public float getNumeroDePecas(){
       float th;
       float tv;
       float n;
       
       th = 100/ ( comprimento + fuga );
       tv = 100/ ( altura + fuga);
       n = Math.round(th*tv);
       return n;
    }
    
   
        
}
