package com.daaw;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Objects;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class g47 implements FilenameFilter {
    public final Pattern a;

    public g47(Pattern pattern) {
        Objects.requireNonNull(pattern);
        this.a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.a.matcher(str).matches();
    }
}
