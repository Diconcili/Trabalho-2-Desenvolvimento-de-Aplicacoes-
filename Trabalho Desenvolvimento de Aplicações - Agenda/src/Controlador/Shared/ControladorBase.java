package Controlador.Shared;
import Domínio.Shared.EntidadeBase;
import java.util.ArrayList;

public class ControladorBase{
    
        protected ArrayList<EntidadeBase> registros;

        private int ultimoId;

        public ControladorBase()
        {
            registros = new ArrayList<EntidadeBase>() {};
        } 

        protected int novoId()
        {
            return ++ultimoId;
        }  
        
        
        protected int qtdRegistrosCadastrados()
        {
            return registros.size();
        }
         
         
        protected Object selecionarTodosRegistros()
        {
            return registros;
        }
        

        public Object selecionarRegistroPorId(int id)
        {
            EntidadeBase registro = null;

            for (int i = 0; i < registros.size(); i++)
            {
                if (registros.get(i).Id == id)
                {
                   registro = registros.get(i);

                    break;
                }
            }

            return registro;
        }
        
        public boolean ExcluirRegistro(int id)
        {
            boolean conseguiuExcluir = false;

            for (int i = 0; i < registros.size(); i++)
            {
                EntidadeBase registro = registros.get(i);

                if (registro.Id == id)
                {
                    registros.remove(i);
                    conseguiuExcluir = true;
                    break;
                }
            }

            return conseguiuExcluir;
        }
}
