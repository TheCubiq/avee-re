package org.hamcrest.core;

import org.hamcrest.Factory;
import org.hamcrest.Matcher;
/* loaded from: classes2.dex */
public class StringStartsWith extends SubstringMatcher {
    @Override // org.hamcrest.core.SubstringMatcher
    protected String relationship() {
        return "starting with";
    }

    public StringStartsWith(String str) {
        super(str);
    }

    @Override // org.hamcrest.core.SubstringMatcher
    protected boolean evalSubstringOf(String str) {
        return str.startsWith(this.substring);
    }

    @Factory
    public static Matcher<String> startsWith(String str) {
        return new StringStartsWith(str);
    }
}
