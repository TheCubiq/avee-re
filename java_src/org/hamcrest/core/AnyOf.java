package org.hamcrest.core;

import java.util.ArrayList;
import java.util.Arrays;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
/* loaded from: classes2.dex */
public class AnyOf<T> extends ShortcutCombination<T> {
    @Override // org.hamcrest.core.ShortcutCombination
    public /* bridge */ /* synthetic */ void describeTo(Description description, String str) {
        super.describeTo(description, str);
    }

    public AnyOf(Iterable<Matcher<? super T>> iterable) {
        super(iterable);
    }

    @Override // org.hamcrest.core.ShortcutCombination, org.hamcrest.Matcher
    public boolean matches(Object obj) {
        return matches(obj, true);
    }

    @Override // org.hamcrest.core.ShortcutCombination, org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        describeTo(description, "or");
    }

    @Factory
    public static <T> AnyOf<T> anyOf(Iterable<Matcher<? super T>> iterable) {
        return new AnyOf<>(iterable);
    }

    @Factory
    public static <T> AnyOf<T> anyOf(Matcher<? super T>... matcherArr) {
        return anyOf(Arrays.asList(matcherArr));
    }

    @Factory
    public static <T> AnyOf<T> anyOf(Matcher<T> matcher, Matcher<? super T> matcher2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(matcher);
        arrayList.add(matcher2);
        return anyOf(arrayList);
    }

    @Factory
    public static <T> AnyOf<T> anyOf(Matcher<T> matcher, Matcher<? super T> matcher2, Matcher<? super T> matcher3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(matcher);
        arrayList.add(matcher2);
        arrayList.add(matcher3);
        return anyOf(arrayList);
    }

    @Factory
    public static <T> AnyOf<T> anyOf(Matcher<T> matcher, Matcher<? super T> matcher2, Matcher<? super T> matcher3, Matcher<? super T> matcher4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(matcher);
        arrayList.add(matcher2);
        arrayList.add(matcher3);
        arrayList.add(matcher4);
        return anyOf(arrayList);
    }

    @Factory
    public static <T> AnyOf<T> anyOf(Matcher<T> matcher, Matcher<? super T> matcher2, Matcher<? super T> matcher3, Matcher<? super T> matcher4, Matcher<? super T> matcher5) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(matcher);
        arrayList.add(matcher2);
        arrayList.add(matcher3);
        arrayList.add(matcher4);
        arrayList.add(matcher5);
        return anyOf(arrayList);
    }

    @Factory
    public static <T> AnyOf<T> anyOf(Matcher<T> matcher, Matcher<? super T> matcher2, Matcher<? super T> matcher3, Matcher<? super T> matcher4, Matcher<? super T> matcher5, Matcher<? super T> matcher6) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(matcher);
        arrayList.add(matcher2);
        arrayList.add(matcher3);
        arrayList.add(matcher4);
        arrayList.add(matcher5);
        arrayList.add(matcher6);
        return anyOf(arrayList);
    }
}
