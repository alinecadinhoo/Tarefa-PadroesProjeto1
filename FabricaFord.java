public class FabricaFord implements FabricaCarro{
    @Override
    public Carro criarCarro() {
        return new Fiesta();
    }
}
