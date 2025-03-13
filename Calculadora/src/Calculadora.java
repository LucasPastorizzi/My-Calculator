public class Calculadora {

    public int n1,n2;

    public void Soma() {

        int soma = n1 + n2;
        System.out.println("RESULTADO DA SOMA:" + soma);
    }

    public void SUbTRAÇÃO () {

        double SUbTRAÇÃO = n1 - n2;
        System.out.println("RESULTADO DA SUbTRAÇÃO: " + SUbTRAÇÃO );
    }

    public void DIVISÃO () {

        double divisao = n1 / n2;
        System.out.println("RESULTADO DA DIVISÃO : " + divisao );


    }    public void Multiplicacão () {

        double Multiplicacão = n1 * n2;
        System.out.println("RESULTADO DA SUA MULTIPLICAÇÃO : " + Multiplicacão);

    }




    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    
}
