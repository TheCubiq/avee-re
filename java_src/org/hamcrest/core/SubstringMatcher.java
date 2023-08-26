package org.hamcrest.core;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
/* loaded from: classes2.dex */
public abstract class SubstringMatcher extends TypeSafeMatcher<String> {
    protected final String substring;

    protected abstract boolean evalSubstringOf(String str);

    protected abstract String relationship();

    /* JADX INFO: Access modifiers changed from: protected */
    public SubstringMatcher(String str) {
        this.substring = str;
    }

    @Override // org.hamcrest.TypeSafeMatcher
    public boolean matchesSafely(String str) {
        return evalSubstringOf(str);
    }

    @Override // org.hamcrest.TypeSafeMatcher
    public void describeMismatchSafely(String str, Description description) {
        description.appendText("was \"").appendText(str).appendText("\"");
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendText("a string ").appendText(relationship()).appendText(" ").appendValue(this.substring);
    }
}
