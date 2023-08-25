package com.daaw;

import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class hh6 extends o17 {

    /* renamed from: p */
    public final Map f12551p;

    public hh6(Map map) {
        this.f12551p = map;
    }

    @Override // com.daaw.p17
    /* renamed from: a */
    public final /* synthetic */ Object mo13759a() {
        return this.f12551p;
    }

    @Override // com.daaw.o17
    /* renamed from: b */
    public final Map mo14649b() {
        return this.f12551p;
    }

    @Override // com.daaw.o17, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return super.m14647e(obj);
    }

    @Override // com.daaw.o17, java.util.Map
    public final Set entrySet() {
        return y37.m4143b(this.f12551p.entrySet(), new ty6() { // from class: com.daaw.bf6
            @Override // com.daaw.ty6
            public final boolean zza(Object obj) {
                return ((Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && super.m14646g(obj);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f12551p.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return super.m14648c();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f12551p.isEmpty() || (super.size() == 1 && super.containsKey(null));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return y37.m4143b(this.f12551p.keySet(), new ty6() { // from class: com.daaw.eg6
            @Override // com.daaw.ty6
            public final boolean zza(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // com.daaw.o17, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
