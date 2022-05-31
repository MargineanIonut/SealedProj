package sealed;

non-sealed interface Insects extends Animal {
}

class Fly implements Insects{

}

record Ladybug(String name) implements Insects{

}