public class Main {
    enum JucaStates {WORKING, EATING, SLEEPING}
    static JucaStates CurrentState  = JucaStates.WORKING;
    static int Hunger = 0;
    static int Fatigue = 0;
    public static void main(String[] args) {
        while (true) {
            switch (CurrentState) {
                case WORKING:
                    System.out.println("Estou trabalhando...");
                    Hunger += 2;
                    Fatigue += 5;
                    break;
                case EATING:
                    System.out.println("Estou comendo...");
                    Hunger -= 5;
                    if (Hunger <= 0) {
                        Hunger = 0;
                        CurrentState = JucaStates.WORKING;
                    }
                    break;
                case SLEEPING:
                    System.out.println("Estou dormindo...");
                    Hunger += 1;
                    Fatigue -= 10;
                    if (Fatigue <= 0) {
                        Fatigue = 0;
                        CurrentState = JucaStates.WORKING;
                    }
                    break;
            }
            System.out.println("Estou com " + Hunger + " de fome e " + Fatigue + " de cansaço.");
            if (Fatigue > 50) {
                System.out.println("Bateu um soninho...");
                CurrentState = JucaStates.SLEEPING;
            }
            if (Hunger > 10 && CurrentState != JucaStates.SLEEPING) {
                System.out.println("Bateu uma fominha...");
                CurrentState = JucaStates.EATING;
            }


            // Timer de Ticks, 1 Tick = 1 Segundo
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}