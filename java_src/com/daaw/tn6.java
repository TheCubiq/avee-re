package com.daaw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class tn6 {

    /* renamed from: a */
    public final InterfaceC0623ag f27897a;

    /* renamed from: b */
    public final Map f27898b = new HashMap();

    /* renamed from: c */
    public final Map f27899c = new HashMap();

    public tn6(InterfaceC0623ag interfaceC0623ag) {
        this.f27897a = interfaceC0623ag;
    }

    /* renamed from: a */
    public final List m8955a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f27898b.entrySet()) {
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

    /* renamed from: b */
    public final void m8954b(String str) {
        if (!this.f27899c.containsKey(str)) {
            this.f27899c.put(str, Long.valueOf(this.f27897a.mo15859b()));
            return;
        }
        long mo15859b = this.f27897a.mo15859b();
        long longValue = ((Long) this.f27899c.remove(str)).longValue();
        StringBuilder sb = new StringBuilder();
        sb.append(mo15859b - longValue);
        m8952d(str, sb.toString());
    }

    /* renamed from: c */
    public final void m8953c(String str, String str2) {
        if (!this.f27899c.containsKey(str)) {
            this.f27899c.put(str, Long.valueOf(this.f27897a.mo15859b()));
            return;
        }
        long mo15859b = this.f27897a.mo15859b();
        long longValue = ((Long) this.f27899c.remove(str)).longValue();
        m8952d(str, str2 + (mo15859b - longValue));
    }

    /* renamed from: d */
    public final void m8952d(String str, String str2) {
        if (!this.f27898b.containsKey(str)) {
            this.f27898b.put(str, new ArrayList());
        }
        ((List) this.f27898b.get(str)).add(str2);
    }
}
