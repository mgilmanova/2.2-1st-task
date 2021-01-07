public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int bonus = service.calculate(15000);
        System.out.println(bonus);
    }

}
