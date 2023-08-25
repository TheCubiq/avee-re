package com.daaw;

import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* loaded from: classes.dex */
public class eh1 {
    public static final Pattern a = Pattern.compile("\\$\\{(.*?)\\}");

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
