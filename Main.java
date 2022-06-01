public class Main {
    public static void main(String[] args) {
        Planet M = Planet.MERCURY;
        Planet V = Planet.VENUS;
        Planet E = Planet.EARTH;
        Planet Ma = Planet.MARS;
        Planet J = Planet.JUPITER;
        Planet S = Planet.SATURN;
        Planet U = Planet.URANUS;
        Planet N = Planet.NEPTUN;

        System.out.println(M.getRemoutPrevSun());
        System.out.println(V.getRemoutPrevSun());
        System.out.println(E.getRemoutPrevSun());
        System.out.println(Ma.getRemoutPrevSun());
        System.out.println(J.getRemoutPrevSun());
        System.out.println(S.getRemoutPrevSun());
        System.out.println(U.getRemoutPrevSun());
        System.out.println(N.getRemoutPrevSun());
    }
}
