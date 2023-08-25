package com.daaw;
/* loaded from: classes.dex */
public final class gh2 extends hz7 {

    /* renamed from: x */
    public static final oz7 f11262x = oz7.m13793b(gh2.class);

    public gh2(iz7 iz7Var, fh2 fh2Var) {
        m20312w(iz7Var, iz7Var.zzc(), fh2Var);
    }

    @Override // com.daaw.hz7, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.daaw.hz7
    public final String toString() {
        String obj = this.f13081q.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
