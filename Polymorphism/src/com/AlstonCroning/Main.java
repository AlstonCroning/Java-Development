package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ": " + movie.getName() + "\n" +
                                "Plot: " + movie.plot() + "\n");
        }
    }

    private static Movie randomMovie() {
            int randomNumber = (int) (Math.random() * 5) + 1;
            System.out.println("Random number generated was: " + randomNumber);
            switch (randomNumber) {
                case 1:
                    return new Jaws();
                case 2:
                    return new IndependanceDay();
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

class Movie {
    private String name;

    Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No Plot Here";
    }

    String getName() {
        return name;
    }
}

class Jaws extends Movie{
    Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "Jaws eating lots of people";
    }
}

class IndependanceDay extends Movie {
    IndependanceDay() {
        super("Independance Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {
    MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try to escape the maze";
    }
}

class StarWars extends Movie {
    StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the Universe";
    }
}

class Forgetable extends Movie {
    Forgetable() {
        super("Forgetable");
    }
    //No Plot Method
}

