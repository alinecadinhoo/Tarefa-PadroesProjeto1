public class FabricaWolks implements FabricaCarro{
    @Override
    public Carro criarCarro() {
        return new Gol();
    }
}
