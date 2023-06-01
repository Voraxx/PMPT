package novy;

public class CloneArmy implements IArmy{
    public CloneArmy(){

    }
    public void createCloneArmy(){
        CloneArmy cloneArmy = new CloneArmy();
    }

    @Override
    public String getDescription() {
        return null;
    }
}
