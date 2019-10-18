package Model;

abstract class Pet {

    private String nome;

    public Pet(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
