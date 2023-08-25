package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class p extends n {
    public final List<n> c = new ArrayList();

    public n[] b() {
        n[] nVarArr = new n[this.c.size()];
        this.c.toArray(nVarArr);
        return nVarArr;
    }
}
