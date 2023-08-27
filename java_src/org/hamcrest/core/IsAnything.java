package org.hamcrest.core;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
/* loaded from: classes2.dex */
public class IsAnything<T> extends BaseMatcher<T> {
    private final String message;

    @Override // org.hamcrest.Matcher
    public boolean matches(Object obj) {
        return true;
    }

    public IsAnything() {
        this("ANYTHING");
    }

    public IsAnything(String str) {
        this.message = str;
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendText(this.message);
    }

    @Factory
    public static Matcher<Object> anything() {
        return new IsAnything();
    }

    @Factory
    public static Matcher<Object> anything(String str) {
        return new IsAnything(str);
    }
}
