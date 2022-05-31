package sealed;

sealed  interface Animal permits Dog,Cat,Bird,Insects {
}

final class Dog implements Animal{

}

record Cat(String name) implements Animal{
}

sealed class Bird implements Animal permits Chicken, Parrot {

}


final class Parrot extends Bird{

}


