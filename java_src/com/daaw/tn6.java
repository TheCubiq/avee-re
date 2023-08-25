package com.daaw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class tn6 {
    public final ag a;
    public final Map b = new HashMap();
    public final Map c = new HashMap();

    public tn6(ag agVar) {
        this.a = agVar;
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.b.entrySet()) {
            int i = 0;
            if (((List) entry.getValue()).size() > 1) {
                for (String str : (List) entry.getValue()) {
                    i++;
                    arrayList.add(new sn6(((String) entry.getKey()) + "." + i, str));
                }
            } else {
                arrayList.add(new sn6((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        return arrayList;
    }

    public final void b(String str) {
        if (!this.c.containsKey(str)) {
            this.c.put(str, Long.valueOf(this.a.b()));
            return;
        }
        long b = this.a.b();
        long longValue = ((Long) this.c.remove(str)).longValue();
        StringBuilder sb = new StringBuilder();
        sb.append(b - longValue);
        d(str, sb.toString());
    }

    public final void c(String str, String str2) {
        if (!this.c.containsKey(str)) {
            this.c.put(str, Long.valueOf(this.a.b()));
            return;
        }
        long b = this.a.b();
        long longValue = ((Long) this.c.remove(str)).longValue();
        d(str, str2 + (b - longValue));
    }

    public final void d(String str, String str2) {
        if (!this.b.containsKey(str)) {
            this.b.put(str, new ArrayList());
        }
        ((List) this.b.get(str)).add(str2);
    }
}
