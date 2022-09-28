public class Empty implements State {

    private GumballMachine gumballMachine;

    public Empty(GumballMachine m) {
        gumballMachine = m;
    }
    
    @Override
    public void insertQuarter() {
        System.out.println("Don't do it bro we out of gumballs.");
        
    }

    @Override
    public void removeQuarter() {
        System.out.println("Quarter removed");
        
    }

    @Override
    public void turnCrank() {
        System.out.println("Machine is empty");
        
    }

    @Override
    public void refill() {
        if (gumballMachine.numGum == 0){
            System.out.println("Gumballs refilled!");
            gumballMachine.numGum = 3;
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
        else {
            System.out.println("Wait until gumballs are empty!");
        }
    }
    
}
