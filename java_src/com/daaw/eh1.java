package com.daaw;

import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* loaded from: classes.dex */
public class eh1 {

    /* renamed from: a */
    public static final Pattern f8477a = Pattern.compile("\\$\\{(.*?)\\}");

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    /* renamed from: a */
    public static boolean m23467a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
