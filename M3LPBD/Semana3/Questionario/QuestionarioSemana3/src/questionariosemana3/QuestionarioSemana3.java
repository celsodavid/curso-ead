/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionariosemana3;

/**
 *
 * @author celso
 */
public class QuestionarioSemana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Questao 1 | Questao 2 (vide classe Aluno)
        Aluno a = new Aluno();
        a.setNome("João Paulo");
        a.setMatricula(12345);
        
        System.out.println(a.toString());
        
        // Questao 3
        int n, r, c, s;
        n = 6;
        r = 0;
        c = 1;
        s = -1;
        
        while(c <= n) {
            if (c%2 == 0) {
                r = r + c * s;
                // System.out.println("\n passou aqui");
            } else {
                r = r + c;
                // System.out.println("\n passou aqui 2");
            }
            c++;
        }
        
        System.out.println("\n" + c);
        System.out.println("\n" + r);
    }
}
