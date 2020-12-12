package com.clp3z.unit_testing_fundamentals.exercise2;

public class StringDuplicator {

    /**
     * @return concatenation of the argument with itself e.g. "hi" -> "hihi"
     */
    public String duplicate(String string) {
        // The bug is triplication instead of duplication
        return string + string;
    }
}
