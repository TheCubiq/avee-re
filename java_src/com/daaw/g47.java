package com.daaw;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Objects;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class g47 implements FilenameFilter {

    /* renamed from: a */
    public final Pattern f10262a;

    public g47(Pattern pattern) {
        Objects.requireNonNull(pattern);
        this.f10262a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.f10262a.matcher(str).matches();
    }
}
