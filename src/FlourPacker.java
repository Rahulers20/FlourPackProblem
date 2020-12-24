public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        bigCount *= 5;
        if (bigCount >= 0 && smallCount >= 0 && goal >= 0) {
            if (bigCount == 0 || goal < 5) {
                return smallCount >= goal;
            }
            if (goal >= bigCount) {
                return bigCount + smallCount >= goal;
            }
            if (goal / 5 <= bigCount / 5) {
                return goal % 5 <= smallCount;
            }

        }
        return false;
    }

}
