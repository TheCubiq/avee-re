package com.daaw;
/* loaded from: classes2.dex */
public final class kw implements qf0 {
    public final boolean p;

    public kw(boolean z) {
        this.p = z;
    }

    @Override // com.daaw.qf0
    public boolean d() {
        return this.p;
    }

    @Override // com.daaw.qf0
    public ys0 e() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(d() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
