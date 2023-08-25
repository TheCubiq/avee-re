package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class j54 implements p31 {
    public final Context p;
    public final String q;
    public final WeakReference r;

    public j54(y24 y24Var) {
        Context context = y24Var.getContext();
        this.p = context;
        this.q = zzt.zzp().zzc(context, y24Var.zzp().p);
        this.r = new WeakReference(y24Var);
    }

    public static /* bridge */ /* synthetic */ void b(j54 j54Var, String str, Map map) {
        y24 y24Var = (y24) j54Var.r.get();
        if (y24Var != null) {
            y24Var.T("onPrecacheEvent", map);
        }
    }

    @Override // com.daaw.p31
    public void a() {
    }

    public abstract void h();

    public final void j(String str, String str2, String str3, String str4) {
        d04.b.post(new f54(this, str, str2, str3, str4));
    }

    public final void k(String str, String str2, int i) {
        d04.b.post(new d54(this, str, str2, i));
    }

    public final void l(String str, String str2, long j) {
        d04.b.post(new e54(this, str, str2, j));
    }

    public final void m(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        d04.b.post(new c54(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    public final void n(String str, String str2, long j, long j2, boolean z, long j3, long j4, long j5, int i, int i2) {
        d04.b.post(new b54(this, str, str2, j, j2, j3, j4, j5, z, i, i2));
    }

    public void o(int i) {
    }

    public void p(int i) {
    }

    public void q(int i) {
    }

    public void r(int i) {
    }

    public abstract boolean s(String str);

    public boolean t(String str, String[] strArr) {
        return s(str);
    }

    public boolean u(String str, String[] strArr, y44 y44Var) {
        return s(str);
    }
}
