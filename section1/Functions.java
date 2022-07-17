public class Functions {
    public static void main(String[] args) {
        int total=0;
        for (int i = 0; i < 10; i++) {
            int die=dice();
            total+=die;
            System.out.println("iteration "+(i+1)+", value: "+ die);
        }
        System.out.println("average: "+ (total/10));
    }
    private static int dice() {
        return (int)(Math.ceil(Math.random()*6));
    }

}