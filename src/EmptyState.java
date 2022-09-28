public class EmptyState implements State
{
    private boolean empty;
    private GumballMachine gMachine;
    public EmptyState(GumballMachine g)
    {
        gMachine = g;
        empty = false;
    }
    public void setEmpty(int i)
    {
        if(i == 0)
        {
            empty = true;
        }
        else
        {
            empty = false;
        }
    }
    @Override
    public boolean getEmptyState()
    {
        return empty;
    }

}