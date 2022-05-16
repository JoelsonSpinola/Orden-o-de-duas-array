public class oredenarlistas {

    public static void main(String[] args) {
		
        String[]nome={"joao","maria","manuela","pedro","jose","adao","eva","samuel","lucida","cesar"};
        int[] numero={4,2,1,3,5,7,6,8,7,9};
        String[]nomeorde=new String[nome.length];
        int []numerorde=new int[nome.length];
        String trocanome;
        int trocanum;
        // clonando as duas arrays pois se fizermos "nome=nomeorde" ele vais passar os enddereços e depois mudar a lista original
        for(int i=0;i<nome.length;i++)
            {
                numerorde[i]=numero[i];
                nomeorde[i]=nome[i];
            }
        //declaração e inicialização de uma variavel boolean
        boolean ord=true;
        //ciclo de oredenação
        while(ord){
            ord=false;//ord passa a ter um valor falso 
            for(int i=1;i<numerorde.length;i++)
            {
                if(numerorde[i] < numerorde[i-1])//verificado se o primeiro elemento da lista é maior que p menor
                {
                    //caso verdadeiro ele efetuas as trocas nos numeros
                    trocanum=numerorde[i-1];
                    numerorde[i-1]=numerorde[i];
                    numerorde[i]=trocanum;
                    //usando a indice dos numeros ele ordena os nomes segundo a array de numeros
                    trocanome=nomeorde[i-1];
                    nomeorde[i-1]=nomeorde[i];
                    nomeorde[i]=trocanome;
                    
                    ord=true;//em caso de ter alguma troca ele passa a verdadeiro e repete o ciclo
                }
            
            }
        }
        //construção de uma tabela, para apresentar os dados de forma organizada sem interface grafica
        System.out.printf("%-25s %25s","Número S/ordenação","Nome S/ordenação");

        System.out.println("  ");
        System.out.print("_______________________________________________________");
        for(int i=0;i<nome.length;i++)
        {
            System.out.println("  ");
            System.out.printf("%2d                  |                  %-25s",numero[i],nome[i]);
            
        }

        System.out.println("  "); //dar espaço entre as tabelas 
        System.out.printf("%-25s %25s","Número Ordenado","Nome Ordenado");//identificação do que será exibido na tela abaixo
        System.out.println("  ");
        System.out.print("_______________________________________________________");
        for(int i=0;i<nome.length;i++)
        {
            System.out.println("  ");
            System.out.printf("%2d                  |                 %-25s",numerorde[i],nomeorde[i]);//printando os elementos//o espaço entre %2d e %-25 e para alinhalos
            
        }
    }
    
}