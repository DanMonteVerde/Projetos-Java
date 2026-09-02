public class App {
    public static void main(String[] args) throws Exception {
        int qtdeLimite = 7;
        String [] nomes = new String[qtdeLimite];
        double [] precos = new double[qtdeLimite];
        int [] quantidades = new int[qtdeLimite];

        int totalProdutosCadastrados = 0;
        int tentativas = 7;

        String buscaTeste = "Produto 2";


        int op = 1;
        int control = 0;

        while (control < 1) {
            System.out.println("-----------BEM VINDO AO MENU-----------");

            System.out.println("CADASTRAR PRODUTOS -----> 1");
            System.out.println("LISTAR PRODUTOS -----> 2");
            System.out.println("BUSCAR PRODUTOS -----> 3");
            System.out.println("ATUALIZAR QUANTIDADE -----> 4");
            System.out.println("SAIR DO SISTEMA -----> 5");

            if (op == 1) {
                for(int i = 0; i < tentativas; i++){
                    if (totalProdutosCadastrados < qtdeLimite) {
                        String produto = "Produto "+(i+1);
                        double preco = (10 * (i+1));
                        int quantidade = (5 * (i+1));

                        nomes[totalProdutosCadastrados] = produto;
                        precos[totalProdutosCadastrados] = preco;
                        quantidades[totalProdutosCadastrados] = quantidade;

                        totalProdutosCadastrados ++;

                    }else{
                        System.out.println("ERRO a quantidade de produtos vai exceder a qtde limite!");
                    }
                }
                op = 2;
            
            }

            if (op == 2) {

                for(int i = 0; i < totalProdutosCadastrados; i++){
                    System.out.println("O produto "+nomes[i]+ " custa: R$ "+precos[i]+ " e possuem "+quantidades[i]+" unidades");
                }
                op = 3;
            }

            

            if (op == 3) {

                int indice = 0;

                for (String nome : nomes) {

                    if (nome.equals(buscaTeste)) {
                        System.out.println("O produto encontrado é: "+nome+" e ele custa R$ "+precos[indice]+" e tem "+quantidades[indice]+" unidades");
                    }

                    indice++;
                }
                op = 4;

            }

            if (op == 4) {
                char vendeuChegou = 's';
                int qtdSaiOuEntra = 2;
                char sai = 'n';
                char entra = 's';
                int endereco = 2;

                if (vendeuChegou == 's') {
                    if (sai == 's') {
                        quantidades[endereco] = quantidades[endereco]-qtdSaiOuEntra;

                        if (quantidades[endereco] < 0) {
                            quantidades[endereco] = 0;
                        }
                        System.out.println(quantidades[endereco]);
                    }

                    if (entra == 's') {
                        quantidades[endereco] = quantidades[endereco]+qtdSaiOuEntra;

                        if (quantidades[endereco] < 0) {
                            quantidades[endereco] = 0;
                        }
                        System.out.println(quantidades[endereco]);
                    }

                    


                }

                op = 5;


            }

            if (op==5) {
                break;
            }



            control++;
        }







        // System.out.println(String.format("%.2f", preco));



    }
}
