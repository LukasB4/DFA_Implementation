/**
 *
 * @author yaw
 */
public class HasQuarterState implements State {

    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine m) {
        gumballMachine = m;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Already a quarter inserted");
    }

    @Override
    public void removeQuarter() {
        System.out.println("Quarter removed");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        gumballMachine.numGum --;
        System.out.println("Gumball Delivered!");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
        if (gumballMachine.numGum == 0) {
            gumballMachine.setState((gumballMachine.getEmptyState()));
        }
        
    }

    @Override
    public void refill() {
        System.out.println("There are still gumballs in the machine.");
    }
}
