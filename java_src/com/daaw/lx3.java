package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.Objects;
/* loaded from: classes.dex */
public final class lx3 {

    /* renamed from: a */
    public Context f17889a;

    /* renamed from: b */
    public InterfaceC0623ag f17890b;

    /* renamed from: c */
    public zzg f17891c;

    /* renamed from: d */
    public ky3 f17892d;

    public /* synthetic */ lx3(kx3 kx3Var) {
    }

    /* renamed from: a */
    public final lx3 m16386a(zzg zzgVar) {
        this.f17891c = zzgVar;
        return this;
    }

    /* renamed from: b */
    public final lx3 m16385b(Context context) {
        Objects.requireNonNull(context);
        this.f17889a = context;
        return this;
    }

    /* renamed from: c */
    public final lx3 m16384c(InterfaceC0623ag interfaceC0623ag) {
        Objects.requireNonNull(interfaceC0623ag);
        this.f17890b = interfaceC0623ag;
        return this;
    }

    /* renamed from: d */
    public final lx3 m16383d(ky3 ky3Var) {
        this.f17892d = ky3Var;
        return this;
    }

    /* renamed from: e */
    public final ly3 m16382e() {
        e08.m23800c(this.f17889a, Context.class);
        e08.m23800c(this.f17890b, InterfaceC0623ag.class);
        e08.m23800c(this.f17891c, zzg.class);
        e08.m23800c(this.f17892d, ky3.class);
        return new rx3(this.f17889a, this.f17890b, this.f17891c, this.f17892d, null);
    }
}
