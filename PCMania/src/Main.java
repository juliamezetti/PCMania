import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int matricula  = 118;

        Scanner entrada = new Scanner(System.in);
        Cliente cliente = new Cliente("Julia",12345678);

        Computador [] compras = new Computador[10];

        //Criando computadores
        MemoriaUSB m1 = new MemoriaUSB("Pen Drive", 16);
        HardwareBasico h1_proc = new HardwareBasico ("Pentium Core i3", 2200);
        HardwareBasico h1_ram =  new HardwareBasico ("Memória RAM",8);
        HardwareBasico h1_HD = new HardwareBasico ("HD", 1000);
        Computador computador1 = new Computador("Apple", matricula, "Linux Ubuntu", 32, h1_proc, h1_ram, h1_HD, m1);        

        MemoriaUSB m2 = new MemoriaUSB("Pen Drive", 32);
        HardwareBasico h2_proc = new HardwareBasico ("Pentium Core i5", 3370);
        HardwareBasico h2_ram =  new HardwareBasico ("Memória RAM",16);
        HardwareBasico h2_HD = new HardwareBasico ("HD", 500);
        Computador computador2 = new Computador("Samsung", matricula+1234, "Windows 8", 64, h2_proc, h2_ram, h2_HD, m2);         


        MemoriaUSB m3 = new MemoriaUSB("HD Externo", 1000);
        HardwareBasico h3_proc = new HardwareBasico ("Pentium Core i7", 4500);
        HardwareBasico h3_ram =  new HardwareBasico ("Memória RAM",32);
        HardwareBasico h3_HD = new HardwareBasico ("HD", 2000);
        Computador computador3 = new Computador("Dell", matricula+5678, "Windows 10", 64, h3_proc, h3_ram, h3_HD, m3);


        System.out.println("-- BEM VINDE --");
        System.out.println("SELECIONE 1 2 OU 3 PARA SELECIONAR O COMPUTADOR QUE DESEJA ADQUIRIR");
        System.out.println("CASO QUEIRA SAIR DO MENU, DIGITE 0");
        System.out.println();
        System.out.println("---PROMOÇÃO 1---");
        computador1.mostraPCConfigs();
        System.out.println();
        System.out.println("--PROMOÇÃO 2---");
        computador2.mostraPCConfigs();
        System.out.println();
        System.out.println("---PROMOÇÃO 3---");
        computador3.mostraPCConfigs();

        int opcao = entrada.nextInt();
        entrada.nextLine();

        float totalCompra=0;
        int j=0;

        while(opcao != 0) {

            switch(opcao){
                case 1:
                    totalCompra = cliente.calculaTotalCompra(totalCompra, computador1.preco);
                    compras[j] = computador1;
                    j++;
                    break;

                case 2:
                    totalCompra = cliente.calculaTotalCompra(totalCompra, computador2.preco);
                    compras[j] = computador2;
                    j++;
                    break;

                case 3:
                    totalCompra = cliente.calculaTotalCompra(totalCompra, computador3.preco);
                    compras[j] = computador3;
                    j++;
                    break;


                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println("CASO QUEIRA ADQUIRIR MAIS ALGUM COMPUTADOR, DIGITE A OPÇÃO DESEJADA");
            opcao = entrada.nextInt();

        }

        System.out.println("Nome do cliente: "+ cliente.nome);
        System.out.println("CPF do cliente: "+ cliente.cpf);
        System.out.println();
        System.out.println("Computadores comprados:");
        System.out.println();
        for (int i = 0; i < compras.length; i++) {
            if(compras[i]!= null)
            {
                compras[i].mostraPCConfigs();
                System.out.println();
            }
            else break;
        }
        System.out.println("Total da Compra: R$"+totalCompra);

    }

}