package Controlador.TarefaModule;
import Controlador.Shared.ControladorBase;
import Domínio.TarefaModule.Tarefa;
import java.util.ArrayList;

public class ControladorTarefa extends ControladorBase{
        
        public String inserirNovaTarefa(Tarefa tarefa)
        {
            String resultadoValidacao = tarefa.validar();

            if (resultadoValidacao == "ESTA_VALIDO")
            {                
                tarefa.Id = novoId();
                registros.add(tarefa);
            }

            return resultadoValidacao;
        }  
        
    
        public String editarAmigo(int id, Tarefa tarefa)
        {
            String resultadoValidação = tarefa.validar();

            if (resultadoValidação == "ESTA_VALIDO")
            {               
                tarefa.Id = id;
                registros.set(id, tarefa);
            }

            return resultadoValidação;
        }
        
    
        public boolean existeTarefaComEsteId(int id)
        {
            return selecionarRegistroPorId(id) != null;
        }
        

        public ArrayList<Tarefa> selecionarTodasTarefas()
        {            
            ArrayList<Tarefa> tarefasAux = (ArrayList<Tarefa>)registros.clone(); 
            
            return tarefasAux;
        }
        

        public Tarefa SelecionarAmigoPorId(int idTarefa)
        {
            return (Tarefa)selecionarRegistroPorId(idTarefa);
        }
}
