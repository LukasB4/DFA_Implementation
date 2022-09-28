/**
 *
 * @author yaw
 */
public class GumballMachine {
    //private instance variables for each possible state
    private State hasQuarterState;
    private State noQuarterState;
    private State emptyState;    
    //current state the machine is in
    private State currentState;
    //number of gumballs in machine
    private int gumNum;
    
    public GumballMachine() {
        //initialize possible state instance variables
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        emptyState = new EmptyState(this);
        gumNum = 3;

        
        //set initial current state
        currentState = noQuarterState;
    }
    
    public void setState(State state) {
        this.currentState = state;
    }
    
    public State getEmptyState()
    {
        return emptyState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }
    
    public State getNoQuarterState() {
        return noQuarterState;
    }
    
    public void insertQuarter() {
        currentState.insertQuarter();
    }
    
    public void removeQuarter() {
        currentState.removeQuarter();
    }
    
    public void turnCrank() {
        if(!emptyState.getEmptyState())
        {
            currentState.turnCrank();
        }
        else
        {
            System.out.println("There are no gumballs left. Refilling...");
            refill();
        }
        emptyState.setEmpty(gumNum);
    }
    public void refill()
    {
        gumNum = 3;
    }
}
