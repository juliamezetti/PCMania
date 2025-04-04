public class Computador {

    // Atributos
    String marca;
    float preco;

    // Pode ter
    public MemoriaUSB musb;
    

    // Tem
    public SistemaOperacional SO = new SistemaOperacional();
    public HardwareBasico[] hardwares = new HardwareBasico[3];  


    public Computador(String marca, float preco, String nomeSO, int tipoSO, HardwareBasico processador, HardwareBasico memoriaRam, HardwareBasico HD, MemoriaUSB musb) {
        this.marca = marca;
        this.preco = preco;
        this.SO.nome = nomeSO;
        this.SO.tipo = tipoSO;
        this.hardwares[0] = processador;  //  processador
        this.hardwares[1] = memoriaRam;  // memória RAM
        this.hardwares[2] = HD; // HD
        this.musb = musb;
    }

    // Método para exibir as configurações do PC
    public void mostraPCConfigs() {
        System.out.println("INFORMAÇÕES SOBRE O COMPUTADOR");
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
        System.out.println("--- HARDWARE BÁSICO ---");
        for (HardwareBasico hb : hardwares) {
            if (hb != null) {
                System.out.println("Nome: " + hb.nome);
                System.out.println("Capacidade: " + hb.capacidade);
            }
        }
        System.out.println("--- SISTEMA OPERACIONAL ---");
        System.out.println("Nome: " + SO.nome);
        System.out.println("Tipo: " + SO.tipo);
        System.out.println("---- Memória USB: ------ ");
        System.out.println("Nome: " + musb.nome);
        System.out.println("Capacidade: " + musb.capacidade);
    }

    // Método para adicionar Memória USB ao computador
    public void addMemoriaUSB(MemoriaUSB musb) {
        this.musb = musb;
    }
}
