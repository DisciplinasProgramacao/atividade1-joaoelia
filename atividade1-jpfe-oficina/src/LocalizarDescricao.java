import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class localizarDescricao {

static Produto localizarDescricao() {
        cabecalho();
        System.out.println("Localizando um produto");
        int numero = lerNumero("Digite o identificador do produto", Integer.class);
        Produto localizado = null;
        
        for (int i = 0; i < quantProdutos && localizado == null; i++) {
            if (produtos[i].hashCode() == descricao)
                localizado = produtos[i];
        }
        return localizado;

}

}