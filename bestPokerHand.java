class bestPokerHand {
    public static String bestHand(int[] ranks, char[] suits) {
        String bestHand = "";
        char suit = suits[0];
        int sameSuit = 1;
        int sameRank = 0;
        for(int i = 1; i <= suits.length - 1; i++) {
            if(suits[i] == suit)
                sameSuit++;
        }

        // flush condition
        if(sameSuit == 5) 
            bestHand = "Flush";
        
        for(int i = 0; i <= ranks.length - 1; i++) {
            for(int j = 0; j <= ranks.length - 1; j++) {
                if(ranks[j] == ranks[i] && j != i) {
                    sameRank++;
                }
            }
        }

        if(sameRank >= 6)
            bestHand = "Three of a Kind";
        if(sameRank >= 2 && sameRank <= 4)
            bestHand = "Pair";
        if(sameRank < 2 && sameSuit < 5)
            bestHand = "High Card";

        return bestHand;
    }

    public static void main(String[] args) {
        int[] ranks = {2, 10, 7, 10, 7};
        char[] suits = {'a', 'b', 'a', 'd', 'b'};
        String Hand = bestHand(ranks, suits);
        System.out.println(Hand);
    }
}
