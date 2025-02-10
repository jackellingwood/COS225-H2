public class Grove {
    private Tree[] _trees = new Tree[16];
    private String _name;

    public Grove(String name) {
        _name = name;
    }

    public int plant(Tree tree) {
        for (int i = 0; i < _trees.length; i++) {
            if (_trees[i] == null) {
                _trees[i] = tree;
                return i;
            }
        }
        return -1;
    }

    public Tree remove(int index) {
        Tree tree = _trees[index];
        _trees[index] = null;
        return tree;
    }

    @Override
    public String toString() {
        return "" + _trees.length;
    }
}
