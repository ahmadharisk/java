package phrase_o_matic;

/**
 * PhraseOMatic
 */
public class PhraseOMatic {

    public static void main(String[] args) {
        String[] listWordsOne = {"24/7","multi- Tier","30,000 foot","B-to-B","win-win","front- end", "web-based","pervasive", "smart", "six- sigma","critical-path", "dynamic"};
        String[] listWordsTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded","outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
        String[] listWordsThree = {"process", "tipping- point", "solution", "architecture", "core competency", "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};

        int lengthOne = listWordsOne.length;
        int lengthTwo = listWordsTwo.length;
        int lengthThree = listWordsThree.length;

        int rnd1 = (int) (Math.random() * lengthOne);
        int rnd2 = (int) (Math.random() * lengthTwo);
        int rnd3 = (int) (Math.random() * lengthThree);

        String phrase = listWordsOne[rnd1] + " " + listWordsTwo[rnd2] + " " + listWordsThree[rnd3];

        System.out.println("What we need is a " + phrase);
    }

}