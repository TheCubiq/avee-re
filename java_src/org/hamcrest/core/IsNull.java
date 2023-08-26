package org.hamcrest.core;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
/* loaded from: classes2.dex */
public class IsNull<T> extends BaseMatcher<T> {
    @Override // org.hamcrest.Matcher
    public boolean matches(Object obj) {
        return obj == null;
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendText("null");
    }

    @Factory
    public static Matcher<Object> nullValue() {
        return new IsNull();
    }

    @Factory
    public static Matcher<Object> notNullValue() {
        return IsNot.not((Matcher) nullValue());
    }

    @Factory
    public static <T> Matcher<T> nullValue(Class<T> cls) {
        return new IsNull();
    }

    @Factory
    public static <T> Matcher<T> notNullValue(Class<T> cls) {
        return IsNot.not(nullValue(cls));
    }
}
