package org.hamcrest.core;

import java.util.regex.Pattern;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
/* loaded from: classes2.dex */
public class DescribedAs<T> extends BaseMatcher<T> {
    private static final Pattern ARG_PATTERN = Pattern.compile("%([0-9]+)");
    private final String descriptionTemplate;
    private final Matcher<T> matcher;
    private final Object[] values;

    public DescribedAs(String str, Matcher<T> matcher, Object[] objArr) {
        this.descriptionTemplate = str;
        this.matcher = matcher;
        this.values = (Object[]) objArr.clone();
    }

    @Override // org.hamcrest.Matcher
    public boolean matches(Object obj) {
        return this.matcher.matches(obj);
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        java.util.regex.Matcher matcher = ARG_PATTERN.matcher(this.descriptionTemplate);
        int i = 0;
        while (matcher.find()) {
            description.appendText(this.descriptionTemplate.substring(i, matcher.start()));
            description.appendValue(this.values[Integer.parseInt(matcher.group(1))]);
            i = matcher.end();
        }
        if (i < this.descriptionTemplate.length()) {
            description.appendText(this.descriptionTemplate.substring(i));
        }
    }

    @Override // org.hamcrest.BaseMatcher, org.hamcrest.Matcher
    public void describeMismatch(Object obj, Description description) {
        this.matcher.describeMismatch(obj, description);
    }

    @Factory
    public static <T> Matcher<T> describedAs(String str, Matcher<T> matcher, Object... objArr) {
        return new DescribedAs(str, matcher, objArr);
    }
}
