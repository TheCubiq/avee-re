package org.junit.runner.manipulation;

import java.util.Iterator;
import org.junit.runner.Description;
/* loaded from: classes2.dex */
public abstract class Filter {
    public static final Filter ALL = new Filter() { // from class: org.junit.runner.manipulation.Filter.1
        @Override // org.junit.runner.manipulation.Filter
        public void apply(Object obj) throws NoTestsRemainException {
        }

        @Override // org.junit.runner.manipulation.Filter
        public String describe() {
            return "all tests";
        }

        @Override // org.junit.runner.manipulation.Filter
        public Filter intersect(Filter filter) {
            return filter;
        }

        @Override // org.junit.runner.manipulation.Filter
        public boolean shouldRun(Description description) {
            return true;
        }
    };

    public abstract String describe();

    public abstract boolean shouldRun(Description description);

    public static Filter matchMethodDescription(final Description description) {
        return new Filter() { // from class: org.junit.runner.manipulation.Filter.2
            @Override // org.junit.runner.manipulation.Filter
            public boolean shouldRun(Description description2) {
                if (description2.isTest()) {
                    return Description.this.equals(description2);
                }
                Iterator<Description> it = description2.getChildren().iterator();
                while (it.hasNext()) {
                    if (shouldRun(it.next())) {
                        return true;
                    }
                }
                return false;
            }

            @Override // org.junit.runner.manipulation.Filter
            public String describe() {
                return String.format("Method %s", Description.this.getDisplayName());
            }
        };
    }

    public void apply(Object obj) throws NoTestsRemainException {
        if (obj instanceof Filterable) {
            ((Filterable) obj).filter(this);
        }
    }

    public Filter intersect(final Filter filter) {
        return (filter == this || filter == ALL) ? this : new Filter() { // from class: org.junit.runner.manipulation.Filter.3
            @Override // org.junit.runner.manipulation.Filter
            public boolean shouldRun(Description description) {
                return this.shouldRun(description) && filter.shouldRun(description);
            }

            @Override // org.junit.runner.manipulation.Filter
            public String describe() {
                return this.describe() + " and " + filter.describe();
            }
        };
    }
}
