package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class o54 {

    /* renamed from: a */
    public final ArrayList f21055a = new ArrayList();

    /* renamed from: b */
    public long f21056b;

    /* renamed from: a */
    public final long m14553a() {
        Iterator it = this.f21055a.iterator();
        while (it.hasNext()) {
            Map zze = ((ox2) it.next()).zze();
            if (zze != null) {
                for (Map.Entry entry : zze.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                            this.f21056b = Math.max(this.f21056b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.f21056b;
    }

    /* renamed from: b */
    public final void m14552b(ox2 ox2Var) {
        this.f21055a.add(ox2Var);
    }
}
