package projetofinal.model.cliente;

import java.util.HashMap;
import java.util.Map;

public class Invocador {
	private Map<String, Comando> comandos;

    public Invocador() {
        this.comandos = new HashMap<>();
    }

    public void adicionarComando(String chave, Comando comando) {
        comandos.put(chave, comando);
    }

    public void executarComando(String chave) {
        Comando comando = comandos.get(chave);
        if (comando != null) {
            comando.executar();
        } else {
            System.out.println("Comando não encontrado.");
        }
    }

}
