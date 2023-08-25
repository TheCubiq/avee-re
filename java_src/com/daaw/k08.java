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

    /* renamed from: c */
    public static final wz7 f15581c = xz7.m4374a(Collections.emptySet());

    /* renamed from: a */
    public final List f15582a;

    /* renamed from: b */
    public final List f15583b;

    public /* synthetic */ k08(List list, List list2, f08 f08Var) {
        this.f15582a = list;
        this.f15583b = list2;
    }

    /* renamed from: a */
    public static g08 m18087a(int i, int i2) {
        return new g08(i, i2, null);
    }

    @Override // com.daaw.m08
    /* renamed from: b */
    public final Set zzb() {
        int size = this.f15582a.size();
        ArrayList arrayList = new ArrayList(this.f15583b.size());
        int size2 = this.f15583b.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((m08) this.f15583b.get(i)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet m8660a = tz7.m8660a(size);
        int size3 = this.f15582a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object zzb = ((m08) this.f15582a.get(i2)).zzb();
            Objects.requireNonNull(zzb);
            m8660a.add(zzb);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                Objects.requireNonNull(obj);
                m8660a.add(obj);
            }
        }
        return Collections.unmodifiableSet(m8660a);
    }
}
