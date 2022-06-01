public enum Planet {
    MERCURY("Mercury", 1, 5, null, null, 100),
    VENUS("Venus", 2, 10, MERCURY, 100, 200),
    EARTH("Earth", 3, 15, VENUS, 200, 300),
    MARS("Mars", 4, 20, EARTH, 300, 400),
    JUPITER("Jupiter", 5, 25, MARS, 400, 500),
    SATURN("Saturn", 6, 30, JUPITER, 500, 600),
    URANUS("Uranus", 7, 35, SATURN, 600, 700),
    NEPTUN("Neptune", 8, 40, URANUS, 700, 800);


    String name;
    int number;
    int radius;
    Planet prev;
    Integer remoutPrevPlanet;
    Integer remoutPrevSun;

    private Planet(String name, int number, int radius, Planet prev, Integer remoutPrevPlanet, Integer remoutPrevSun) {
        this.name = name;
        this.number = number;
        this.radius = radius;
        this.prev = prev;
        this.remoutPrevPlanet = remoutPrevPlanet;
        this.remoutPrevSun = remoutPrevSun;
    }


    public Integer getRemoutPrevSun() {
        return remoutPrevSun;
    }
}
