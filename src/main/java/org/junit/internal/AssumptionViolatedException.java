package org.junit.internal;

import org.hamcrest.Matcher;

/**
 * An exception class used to implement <i>assumptions</i> (state in which a given test
 * is meaningful and should or should not be executed). A test for which an assumption
 * fails should not generate a test case failure.
 *
 * @see Assume
 *
 * Deprecated in favor of external version {@link org.junit.AssumptionViolatedException}
 */
@Deprecated
public class AssumptionViolatedException extends org.junit.AssumptionViolatedException {
    public AssumptionViolatedException(String assumption, boolean valueMatcher, Object value, Matcher<?> matcher) {
        super(assumption, valueMatcher, value, matcher);
    }

    /**
     * An assumption exception with the given <i>value</i> (String or
     * Throwable) and an additional failing {@link Matcher}.
     */
    public AssumptionViolatedException(Object value, Matcher<?> matcher) {
        super(value, matcher);
    }

    /**
     * An assumption exception with the given <i>value</i> (String or
     * Throwable) and an additional failing {@link Matcher}.
     */
    public AssumptionViolatedException(String assumption, Object value, Matcher<?> matcher) {
        super(assumption, value, matcher);
    }

    /**
     * An assumption exception with the given message only.
     */
    public AssumptionViolatedException(String assumption) {
        super(assumption);
    }

    /**
     * An assumption exception with the given message and a cause.
     */
    public AssumptionViolatedException(String assumption, Throwable t) {
        super(assumption, t);
    }
}