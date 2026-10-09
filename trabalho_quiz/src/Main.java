import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // ========================================
        // CABEÇALHO DO QUIZ
        // ========================================
        System.out.println("========================================");
        System.out.println("              QUIZ JAVA");
        System.out.println("========================================");
        System.out.println("Aluno: Guilherme Belarmino de Almeida");
        System.out.println("Professor: Brenno Pimenta");
        System.out.println("Faculdade: UNIFAN - Centro Universitário Alfredo Nasser");
        System.out.println("========================================");
        System.out.println();

        List<Questao> questoes = new ArrayList<>();

        Questao q1 = new Questao();
        q1.pergunta = "1. Qual linguagem de programação está sendo utilizada neste projeto?";
        q1.opcaoA = "A) Python";
        q1.opcaoB = "B) Java";
        q1.opcaoC = "C) JavaScript";
        q1.opcaoD = "D) C#";
        q1.opcaoE = "E) PHP";
        q1.correta = "B";
        questoes.add(q1);

        Questao q2 = new Questao();
        q2.pergunta = "2. Qual palavra-chave é utilizada para criar uma classe em Java?";
        q2.opcaoA = "A) class";
        q2.opcaoB = "B) Class";
        q2.opcaoC = "C) create";
        q2.opcaoD = "D) newClass";
        q2.opcaoE = "E) object";
        q2.correta = "A";
        questoes.add(q2);

        Questao q3 = new Questao();
        q3.pergunta = "3. Qual método é utilizado como ponto de entrada de um programa Java?";
        q3.opcaoA = "A) start()";
        q3.opcaoB = "B) execute()";
        q3.opcaoC = "C) main()";
        q3.opcaoD = "D) run()";
        q3.opcaoE = "E) begin()";
        q3.correta = "C";
        questoes.add(q3);

        Questao q4 = new Questao();
        q4.pergunta = "4. Qual estrutura é utilizada para repetir um bloco de código?";
        q4.opcaoA = "A) if";
        q4.opcaoB = "B) switch";
        q4.opcaoC = "C) class";
        q4.opcaoD = "D) for";
        q4.opcaoE = "E) import";
        q4.correta = "D";
        questoes.add(q4);

        Questao q5 = new Questao();
        q5.pergunta = "5. Qual estrutura representa uma condição em Java?";
        q5.opcaoA = "A) for";
        q5.opcaoB = "B) if";
        q5.opcaoC = "C) import";
        q5.opcaoD = "D) class";
        q5.opcaoE = "E) package";
        q5.correta = "B";
        questoes.add(q5);

        Questao q6 = new Questao();
        q6.pergunta = "6. Qual tipo de dado armazena valores inteiros?";
        q6.opcaoA = "A) String";
        q6.opcaoB = "B) boolean";
        q6.opcaoC = "C) int";
        q6.opcaoD = "D) double";
        q6.opcaoE = "E) char";
        q6.correta = "C";
        questoes.add(q6);

        Questao q7 = new Questao();
        q7.pergunta = "7. Qual tipo de dado armazena valores verdadeiro ou falso?";
        q7.opcaoA = "A) int";
        q7.opcaoB = "B) String";
        q7.opcaoC = "C) double";
        q7.opcaoD = "D) boolean";
        q7.opcaoE = "E) char";
        q7.correta = "D";
        questoes.add(q7);

        Questao q8 = new Questao();
        q8.pergunta = "8. Qual classe é utilizada para ler dados digitados pelo usuário?";
        q8.opcaoA = "A) System";
        q8.opcaoB = "B) Scanner";
        q8.opcaoC = "C) Reader";
        q8.opcaoD = "D) Input";
        q8.opcaoE = "E) ConsoleReader";
        q8.correta = "B";
        questoes.add(q8);

        Questao q9 = new Questao();
        q9.pergunta = "9. Qual estrutura pode ser utilizada para armazenar uma lista de objetos?";
        q9.opcaoA = "A) ArrayList";
        q9.opcaoB = "B) Scanner";
        q9.opcaoC = "C) String";
        q9.opcaoD = "D) System";
        q9.opcaoE = "E) Boolean";
        q9.correta = "A";
        questoes.add(q9);

        Questao q10 = new Questao();
        q10.pergunta = "10. Qual palavra-chave cria um novo objeto em Java?";
        q10.opcaoA = "A) object";
        q10.opcaoB = "B) create";
        q10.opcaoC = "C) new";
        q10.opcaoD = "D) class";
        q10.opcaoE = "E) instance";
        q10.correta = "C";
        questoes.add(q10);

        Questao q11 = new Questao();
        q11.pergunta = "11. Qual operador é utilizado para comparar igualdade entre valores?";
        q11.opcaoA = "A) =";
        q11.opcaoB = "B) ==";
        q11.opcaoC = "C) !=";
        q11.opcaoD = "D) >=";
        q11.opcaoE = "E) <=";
        q11.correta = "B";
        questoes.add(q11);

        Questao q12 = new Questao();
        q12.pergunta = "12. Qual palavra-chave é utilizada para importar uma classe?";
        q12.opcaoA = "A) include";
        q12.opcaoB = "B) using";
        q12.opcaoC = "C) package";
        q12.opcaoD = "D) import";
        q12.opcaoE = "E) require";
        q12.correta = "D";
        questoes.add(q12);

        Questao q13 = new Questao();
        q13.pergunta = "13. Qual método é utilizado para comparar Strings ignorando maiúsculas e minúsculas?";
        q13.opcaoA = "A) compare()";
        q13.opcaoB = "B) equals()";
        q13.opcaoC = "C) equalsIgnoreCase()";
        q13.opcaoD = "D) same()";
        q13.opcaoE = "E) compareIgnore()";
        q13.correta = "C";
        questoes.add(q13);

        Questao q14 = new Questao();
        q14.pergunta = "14. Qual comando é utilizado para imprimir informações no console?";
        q14.opcaoA = "A) Console.write()";
        q14.opcaoB = "B) System.out.println()";
        q14.opcaoC = "C) print.console()";
        q14.opcaoD = "D) System.print()";
        q14.opcaoE = "E) Console.println()";
        q14.correta = "B";
        questoes.add(q14);

        Questao q15 = new Questao();
        q15.pergunta = "15. Qual estrutura é utilizada para executar diferentes blocos dependendo de uma opção?";
        q15.opcaoA = "A) for";
        q15.opcaoB = "B) while";
        q15.opcaoC = "C) if";
        q15.opcaoD = "D) switch";
        q15.opcaoE = "E) do";
        q15.correta = "D";
        questoes.add(q15);

        int acertos = 0;

        for (Questao questao : questoes) {

            questao.escrevaQuestao();

            String resposta = questao.leiaResposta();

            if (questao.isCorreta(resposta)) {
                acertos++;
            }
        }

        double porcentagem = (acertos * 100.0) / questoes.size();

        System.out.println("========================================");
        System.out.println("             RESULTADO FINAL");
        System.out.println("========================================");
        System.out.println("Total de questões: " + questoes.size());
        System.out.println("Quantidade de acertos: " + acertos);
        System.out.printf("Porcentagem de acertos: %.2f%%%n", porcentagem);
        System.out.println("\nObrigado por participar do Quiz!");
        System.out.println("========================================");
    }
}