package org.hamcrest;
/* loaded from: classes2.dex */
public abstract class CustomMatcher<T> extends BaseMatcher<T> {
    private final String fixedDescription;

    public CustomMatcher(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Description should be non null!");
        }
        this.fixedDescription = str;
    }

    @Override // org.hamcrest.SelfDescribing
    public final void describeTo(Description description) {
        description.appendText(this.fixedDescription);
    }
}
