class Movie{
    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

// class 1
class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot(){
        return "A shark eats lot of people";
    }
}
// class 2
class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("IndependenceDay");
    }

    @Override
    public String plot(){
        return "Aliens attempt to take over planet earth";
    }
}
// class 3
class MazeRunner extends Movie{
    public MazeRunner(){
        super("MazeRunner");
    }

    @Override
    public String plot(){
        return "Kids try to escape maze";
    }
}
// class 4
class StarWars extends Movie{
    public StarWars(){
        super("StarWars");
    }

    @Override
    public String plot(){
        return "Imperial Forces try to take over the universe";
    }
}
// class 5
class Forgetable extends Movie{
    public Forgetable(){
        super("Forgetable");
    }

    // No override
    // No plot here
}



public class Main{

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            
            Movie move = randomMovie();
            System.out.println("Movie #" + i + " : " + move.getName());
            System.out.println("Plot : " + move.plot());
            System.out.println("");

        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was : " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }

}