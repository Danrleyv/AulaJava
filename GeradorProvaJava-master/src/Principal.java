import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String lixo="", op="";
        Prova m1 = new Prova();
        
        System.out.print("Informe a disciplina: ");
        m1.setNomeDisciplina(s.nextLine());
        System.out.print("\nInforme o peso: ");
        m1.setPeso(s.nextInt());
        lixo=s.nextLine();
        System.out.print("\nInforme o local: ");
        m1.setLocal(s.nextLine());
        System.out.print("\nInforme a data da prova: ");
        m1.setData(s.nextLine());
        
        
        Objetiva obj = new Objetiva();
        Discursiva dis = new Discursiva();
        int cont=0;
        
        while(true){
            cont++;
            System.out.print("\nDeseja criar uma questao discursiva(d) ou objetiva(o)? ");
            op=s.nextLine();
            if(op.equals("d")){
            
                System.out.print("\nInforme o enunciado da questao "+(cont)+": ");
                dis.setPergunta(s.nextLine());
                System.out.print("\nInforme os criterios de avaliacao da questao "+(cont)+": ");
                dis.setCriterioCorrecao(s.nextLine());
                System.out.print("\nInforme o peso da questao "+(cont)+": ");
                dis.setPeso(s.nextDouble());
                lixo=s.nextLine();
                m1.questoes.add(dis);
                
            }else{
                char x='a';
                String c[]=new String[5];
                System.out.print("\nInforme o enunciado da questao "+(cont)+": ");
                obj.setPergunta(s.nextLine());
                for(int j=0;j<5;j++){
                    switch(j){
                        case 0: x='a';
                                break;
                        case 1: x='b';
                                break;
                        case 2: x='c';
                                break;
                        case 3: x='d';
                                break;
                        case 4: x='e';
                                break;
                    }
                    System.out.print("\nInforme a alternativa "+x+": ");
                    c[j]=s.nextLine();
                }
                obj.setOpcoes(c);
                System.out.print("\nInforme a alternativa correta:(entre 1 e 5) ");
                obj.setResposta(s.nextInt());
                lixo=s.nextLine();
                System.out.print("\nInforme o peso da questao "+(cont)+": ");
                obj.setPeso(s.nextDouble());
                lixo=s.nextLine();
                m1.questoes.add(obj);
            }
            
        
            System.out.print("Deseja criar mais uma questão?(s/n)");
            op=s.nextLine();
            if(op.equals("n")){
                break;
            }
        }
        
        System.out.print(m1.obtemProvaImpressao());
    }
}
