public class FabricaChevrolet implements FabricaCarro{
    @Override
    public Carro criarCarro() {
        return new Celta();
    }
}
