public class forEmArrays {

    public static void main(String[] args) {
        String alunos [] = { "Felipe", "Jonas", "Julias", "Marcos"};
        //length é usado para obter o número de elementos em um array ou o comprimento de uma string
        // for( int x=0; x<alunos.length; x++){
        //     System.out.println("O Aluno no indice x=" + x + " é " + alunos[x]);
        //}

        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
        
    }
}