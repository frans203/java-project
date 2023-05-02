public class Lock2BoolsInterfaceImpl implements Lock2BoolsInterface{
    boolean wantsCS[] = {false, false};

    public void requestCS(int id){
        wantsCS[id] = true;
        while(wantsCS[1-id]);
    }

    public void releaseCS(int id){
        wantsCS[id] = false;
    }
}
