/**
 * @author Hyunjae Lee
 */

class Show {
    public String ShowHandType(int hand) {
        String handtype = null;
        int h = hand;
        switch (h) {
            case 1:
                handtype = "Rock";
                break;
            case 2:
                handtype = "Scissor";
                break;
            case 3:
                handtype = "Paper";
                break;
        }
        return handtype;
    }
}
