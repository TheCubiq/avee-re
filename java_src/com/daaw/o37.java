package com.daaw;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class o37 extends d27 {

    /* renamed from: r */
    public final transient b27 f21014r;

    /* renamed from: s */
    public final transient Object[] f21015s;

    /* renamed from: t */
    public final transient int f21016t;

    public o37(b27 b27Var, Object[] objArr, int i, int i2) {
        this.f21014r = b27Var;
        this.f21015s = objArr;
        this.f21016t = i2;
    }

    @Override // com.daaw.t17, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f21014r.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.t17
    /* renamed from: d */
    public final int mo2850d(Object[] objArr, int i) {
        return mo2849h().mo2850d(objArr, i);
    }

    @Override // com.daaw.d27, com.daaw.t17, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo2849h().listIterator(0);
    }

    @Override // com.daaw.d27, com.daaw.t17
    /* renamed from: j */
    public final c47 mo2848j() {
        return mo2849h().listIterator(0);
    }

    @Override // com.daaw.d27
    /* renamed from: o */
    public final y17 mo10727o() {
        return new n37(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f21016t;
    }
}
