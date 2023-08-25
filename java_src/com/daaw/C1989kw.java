package com.daaw;
/* renamed from: com.daaw.kw */
/* loaded from: classes2.dex */
public final class C1989kw implements qf0 {

    /* renamed from: p */
    public final boolean f16784p;

    public C1989kw(boolean z) {
        this.f16784p = z;
    }

    @Override // com.daaw.qf0
    /* renamed from: d */
    public boolean mo3346d() {
        return this.f16784p;
    }

    @Override // com.daaw.qf0
    /* renamed from: e */
    public ys0 mo3345e() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(mo3346d() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
