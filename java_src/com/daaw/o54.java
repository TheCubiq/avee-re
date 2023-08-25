package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class o54 {
    public final ArrayList a = new ArrayList();
    public long b;

    public final long a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            Map zze = ((ox2) it.next()).zze();
            if (zze != null) {
                for (Map.Entry entry : zze.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                            this.b = Math.max(this.b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.b;
    }

    public final void b(ox2 ox2Var) {
        this.a.add(ox2Var);
    }
}
