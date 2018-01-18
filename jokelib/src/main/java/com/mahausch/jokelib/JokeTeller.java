package com.mahausch.jokelib;

public class JokeTeller {

    private static final String joke1 = "My friend thinks he is smart. He told me an onion is the only " +
            "food that makes you cry, so I threw a coconut at his face.";

    private static final String joke2 = "What happens to a frog's car when it breaks down?\n" +
            "It gets toad away.";

    private static final String joke3 = "In a Catholic school cafeteria, a nun places a note in " +
            "front of a pile of apples, \"Only take one. God is watching.\" Further down the " +
            "line is a pile of cookies. A little boy makes his own note, \"Take all you want. " +
            "God is watching the apples.\"";

    private static final String joke4 = "Why do hamburgers go to the gym? To get better buns!";

    private static final String[] jokes = {joke1, joke2, joke3, joke4};

    public static String getJoke() {
        return jokes[(int) (Math.random() * 4)];

    }
}
