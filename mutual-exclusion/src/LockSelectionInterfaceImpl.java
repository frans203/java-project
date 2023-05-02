public class LockSelectionInterfaceImpl implements LockSelectionInterface {
    int turn = 0;

    @Override
    public void requestCS(int id) {
        while(turn == 1 - id);
    }

    @Override
    public void releaseCS(int id) {
        turn = 1 - id;
    }
}
