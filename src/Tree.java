public class Tree {
    private final int _id;
    private final int _age;
    private final String _species;

    public Tree(int id, int age, String species) {
        _id = id;
        _age = age;
        _species = species;
    }

    public int getID() {
        return _id;
    }

    public int getAge() {
        return _age;
    }

    public String getSpecies() {
        return _species;
    }
}
