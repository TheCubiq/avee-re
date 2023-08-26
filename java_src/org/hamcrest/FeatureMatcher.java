package org.hamcrest;

import org.hamcrest.internal.ReflectiveTypeFinder;
/* loaded from: classes2.dex */
public abstract class FeatureMatcher<T, U> extends TypeSafeDiagnosingMatcher<T> {
    private static final ReflectiveTypeFinder TYPE_FINDER = new ReflectiveTypeFinder("featureValueOf", 1, 0);
    private final String featureDescription;
    private final String featureName;
    private final Matcher<? super U> subMatcher;

    protected abstract U featureValueOf(T t);

    public FeatureMatcher(Matcher<? super U> matcher, String str, String str2) {
        super(TYPE_FINDER);
        this.subMatcher = matcher;
        this.featureDescription = str;
        this.featureName = str2;
    }

    @Override // org.hamcrest.TypeSafeDiagnosingMatcher
    protected boolean matchesSafely(T t, Description description) {
        U featureValueOf = featureValueOf(t);
        if (this.subMatcher.matches(featureValueOf)) {
            return true;
        }
        description.appendText(this.featureName).appendText(" ");
        this.subMatcher.describeMismatch(featureValueOf, description);
        return false;
    }

    @Override // org.hamcrest.SelfDescribing
    public final void describeTo(Description description) {
        description.appendText(this.featureDescription).appendText(" ").appendDescriptionOf(this.subMatcher);
    }
}
