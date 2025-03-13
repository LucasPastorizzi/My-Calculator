import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Calculadora c = new Calculadora();

        Scanner leia = new Scanner(System.in);
        System.out.println("-------------CALCULADOR---------- Lucas Pastorizzi");
        System.out.println("INICIANDO A CALCULADORA ( DIGITE O NÚMERO 1)");
        int escolha = leia.nextInt();

        while (escolha < 5) {
            System.out.println("1-SOMA /// 2-SUbTRAÇÃO //// 3-DIVISÃO /// 4-MULTIPLICACÃO // 5- SAIR ");
            escolha = leia.nextInt();

            switch ( escolha) {
                case 1:

                for (int i = 0 ; i < 1 ; i++) {
                    System.out.println("Primeiro número:");
                    int n1 = leia.nextInt();
                    c.setN1(n1);
                    System.out.println("Segundo  número:");
                    int n2 = leia.nextInt();
                    c.setN2(n2);

                    c.Soma();

                }
                 break;
                   
                case 2:

                for ( int i = 0 ; i < 1 ; i++) {
                System.out.println("DIGITE O PRIMEIRO NÚMERO: ");
                int n1 = leia.nextInt();
                c.setN1(n1);

                System.out.println("DIGITE O SEGUNDO NÚMERO;");
                int n2 = leia.nextInt();
                c.setN2(n2);

                c.SUbTRAÇÃO();
            
                }
                break;  


                case 3:
                for ( int i = 0 ; i < 1 ; i++ ) {
                    System.out.println("DIGITE O PRIMEIRO NUMERO:");
                    int n1 = leia.nextInt();
                    c.setN1(n1);
                    System.out.println("DIGITE O SEGUNDO NÚMERO!");
                    int n2 = leia.nextInt();
                
                    c.setN2(n2); 

                    c.DIVISÃO();

                    


                }
                break; 

                
               
                case 4:
                for ( int i = 0 ; i < 1 ; i++ ) {

                    System.out.println("DIGITE O PRIMEIRO NÚMERO!");
                    int n1 = leia.nextInt();
                    c.setN1(n1);

                    System.out.println("DIGITE O SEGUNDO NÚMERO : ");
                    int n2 = leia.nextInt();

                    c.setN2(n2);
                    c.Multiplicacão();
                }





                case 5:







                
            }
            
        }

    }
}
