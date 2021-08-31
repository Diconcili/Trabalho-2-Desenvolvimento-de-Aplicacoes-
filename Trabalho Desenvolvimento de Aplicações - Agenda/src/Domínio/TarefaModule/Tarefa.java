package Domínio.TarefaModule;
import Domínio.Shared.EntidadeBase;

public class Tarefa extends EntidadeBase{    
    
    String titulo;
    String dataCriação;
    String dataConclusão;
    int percentual;
    String prioridade;           
    
    public Tarefa(String titulo, String dataCriação, int prioridade){
        this.titulo = titulo;
        this.dataCriação = dataCriação;       
        this.prioridade = retornaPrioridade(prioridade);
    }   
    
    public void AtualizarPercentual(int percentual, String dataConclusao)
        {
            this.percentual = percentual;

            if (this.percentual == 100)
            {
                this.dataConclusão = dataConclusao;
            }
        }
    
    public String retornaPrioridade(int prioridade){    
        if(prioridade == 0){
            return "Prioridade Baixa";
        }
        if(prioridade == 1){
            return "Prioridade Média";
        }
        if(prioridade == 2){
            return "Prioridade Alta";
        }
        return null;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataCriação() {
        return dataCriação;
    }

    public void setDataCriação(String dataCriação) {
        this.dataCriação = dataCriação;
    }

    public String getDataConclusão() {
        return dataConclusão;
    }

    public void setDataConclusão(String dataConclusão) {
        this.dataConclusão = dataConclusão;
    }

    public int getPercentual() {
        return percentual;
    }

    public void setPercentual(int percentual) {
        this.percentual = percentual;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }
   
    public String validar() {
        String resultadoValidação = "";
        
        if(titulo.equals(null)){
            resultadoValidação += "Titulo inválido\n";
        }  
        if(prioridade.equals(null)){
            resultadoValidação += "Selecione uma propriedade\n";            
        }
        if(resultadoValidação == ""){
            resultadoValidação = "ESTA_VALIDO";
        }
        
        return resultadoValidação;
    }
    
    
    
    
}
