/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhorobson;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author sivolc05
 */
public class TrabalhoRobson {
    public static final Logger logger = Logger.getLogger(TrabalhoRobson.class.getName());

    public static void main(String[] args) {
        Funcionario[] funcionarios = leArquivo("caminhoParaArquivoComFuncionariosAqui", 300);
        mostraListaFunc(funcionarios);
    }

    public static Funcionario[] leArquivo(String caminhoParaArquivo, int quantidadeDeFuncionarios) {
        Funcionario[] funcionarios = new Funcionario[quantidadeDeFuncionarios];

        try {
            File arquivo = new File(caminhoParaArquivo);
            Scanner lendo = new Scanner(arquivo);
            for (int i = 0; i < quantidadeDeFuncionarios; i++) {
                String funcionario = lendo.nextLine();
                String[] funcionarioSeparado = funcionario.split(" ");
                Funcionario f = new Funcionario(funcionarioSeparado[0], funcionarioSeparado[1], funcionarioSeparado[2],
                        funcionarioSeparado[3]);

                funcionarios[i] = f;
            }
            lendo.close();

        } catch (FileNotFoundException erro) {
            logger.warning("\nHouve um erro na leitura do arquivo. Veja-o abaixo:\n");
            erro.printStackTrace();
        }

        return funcionarios;
    }

    public static void mostraListaFunc(Funcionario[] funcionarios) {
        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i].mostrarDados();
        }
    }
}
