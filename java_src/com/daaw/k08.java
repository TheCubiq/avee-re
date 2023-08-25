package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public final class k08 implements wz7 {
    public static final wz7 c = xz7.a(Collections.emptySet());
    public final List a;
    public final List b;

    public /* synthetic */ k08(List list, List list2, f08 f08Var) {
        this.a = list;
        this.b = list2;
    }

    public static g08 a(int i, int i2) {
        return new g08(i, i2, null);
    }

    @Override // com.daaw.m08
    /* renamed from: b */
    public final Set zzb() {
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(this.b.size());
        int size2 = this.b.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((m08) this.b.get(i)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet a = tz7.a(size);
        int size3 = this.a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object zzb = ((m08) this.a.get(i2)).zzb();
            Objects.requireNonNull(zzb);
            a.add(zzb);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                Objects.requireNonNull(obj);
                a.add(obj);
            }
        }
        return Collections.unmodifiableSet(a);
    }
}
