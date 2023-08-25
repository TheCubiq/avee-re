package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class j54 implements p31 {

    /* renamed from: p */
    public final Context f14365p;

    /* renamed from: q */
    public final String f14366q;

    /* renamed from: r */
    public final WeakReference f14367r;

    public j54(y24 y24Var) {
        Context context = y24Var.getContext();
        this.f14365p = context;
        this.f14366q = zzt.zzp().zzc(context, y24Var.zzp().f36993p);
        this.f14367r = new WeakReference(y24Var);
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m18857b(j54 j54Var, String str, Map map) {
        y24 y24Var = (y24) j54Var.f14367r.get();
        if (y24Var != null) {
            y24Var.mo6434T("onPrecacheEvent", map);
        }
    }

    @Override // com.daaw.p31
    /* renamed from: a */
    public void mo10704a() {
    }

    /* renamed from: h */
    public abstract void mo10703h();

    /* renamed from: j */
    public final void m18856j(String str, String str2, String str3, String str4) {
        d04.f6340b.post(new f54(this, str, str2, str3, str4));
    }

    /* renamed from: k */
    public final void m18855k(String str, String str2, int i) {
        d04.f6340b.post(new d54(this, str, str2, i));
    }

    /* renamed from: l */
    public final void m18854l(String str, String str2, long j) {
        d04.f6340b.post(new e54(this, str, str2, j));
    }

    /* renamed from: m */
    public final void m18853m(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        d04.f6340b.post(new c54(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    /* renamed from: n */
    public final void m18852n(String str, String str2, long j, long j2, boolean z, long j3, long j4, long j5, int i, int i2) {
        d04.f6340b.post(new b54(this, str, str2, j, j2, j3, j4, j5, z, i, i2));
    }

    /* renamed from: o */
    public void mo10702o(int i) {
    }

    /* renamed from: p */
    public void mo10701p(int i) {
    }

    /* renamed from: q */
    public void mo10700q(int i) {
    }

    /* renamed from: r */
    public void mo10699r(int i) {
    }

    /* renamed from: s */
    public abstract boolean mo10698s(String str);

    /* renamed from: t */
    public boolean mo10697t(String str, String[] strArr) {
        return mo10698s(str);
    }

    /* renamed from: u */
    public boolean mo10696u(String str, String[] strArr, y44 y44Var) {
        return mo10698s(str);
    }
}
