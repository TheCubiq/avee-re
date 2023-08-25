package com.daaw;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public abstract class nb0 implements o10<nb0, f41> {
    public final String a;
    public final List<String> b;

    public nb0(String str, List<String> list) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
    }
}
