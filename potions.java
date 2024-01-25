import java.util.Arrays;

class potions {
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int spellLength = spells.length;
        int potionLength = potions.length;
        int[] succPairs = new int[spellLength]; // the returned int array can be the length of spells

        for(int i = 0; i <= spellLength - 1; i++) {
            // we need to traverse spells, multiply each number of potions per spell, then count how many potions exceed success.
            int succPair = 0;
            int currSpell = spells[i];
            int[] temp = new int[potionLength]; // needs to be in outer loop

            for(int j = 0; j <= potionLength - 1; j++) {
                // need to multiply each potion by currSpell, then loop again to compare to success.
                if((long) currSpell * potions[j] >= success) {
                    succPair++;
                }
            }
            
            succPairs[i] = succPair;
        }

        System.out.println(Arrays.toString(succPairs));
        return succPairs;
    }

    public static void main(String[] args) {
        int[] spells = {3,1,2};
        int[] potions = {8,5,8};
        int succ = 16;

        int[] succpairs = successfulPairs(spells, potions, succ); // prints array
    }
}

// While I think this does technically work for all test cases, some of the extreme ones cause time limit exceeded issues, so this was not submitted. Must come back to perform optimized search algorithm.
