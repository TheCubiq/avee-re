package com.daaw;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.zzt;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class z75 extends rd3 {

    /* renamed from: p */
    public final Context f34567p;

    /* renamed from: q */
    public final j35 f34568q;

    /* renamed from: r */
    public l45 f34569r;

    /* renamed from: s */
    public e35 f34570s;

    public z75(Context context, j35 j35Var, l45 l45Var, e35 e35Var) {
        this.f34567p = context;
        this.f34568q = j35Var;
        this.f34569r = l45Var;
        this.f34570s = e35Var;
    }

    @Override // com.daaw.sd3
    /* renamed from: F2 */
    public final String mo2685F2(String str) {
        return (String) this.f34568q.m19139Q().get(str);
    }

    @Override // com.daaw.sd3
    /* renamed from: f0 */
    public final void mo2684f0(yd0 yd0Var) {
        e35 e35Var;
        Object m14831M = nt0.m14831M(yd0Var);
        if (!(m14831M instanceof View) || this.f34568q.m19124c0() == null || (e35Var = this.f34570s) == null) {
            return;
        }
        e35Var.m23747m((View) m14831M);
    }

    @Override // com.daaw.sd3
    /* renamed from: q */
    public final boolean mo2682q(yd0 yd0Var) {
        l45 l45Var;
        Object m14831M = nt0.m14831M(yd0Var);
        if ((m14831M instanceof ViewGroup) && (l45Var = this.f34569r) != null && l45Var.m17137f((ViewGroup) m14831M)) {
            this.f34568q.m19130Z().mo6454I(new y75(this));
            return true;
        }
        return false;
    }

    @Override // com.daaw.sd3
    /* renamed from: s */
    public final vc3 mo2681s(String str) {
        return (vc3) this.f34568q.m19140P().get(str);
    }

    @Override // com.daaw.sd3
    public final zzdq zze() {
        return this.f34568q.m19138R();
    }

    @Override // com.daaw.sd3
    public final sc3 zzf() {
        return this.f34570s.m23770I().m22051a();
    }

    @Override // com.daaw.sd3
    public final yd0 zzh() {
        return nt0.m14830g3(this.f34567p);
    }

    @Override // com.daaw.sd3
    public final String zzi() {
        return this.f34568q.m19116g0();
    }

    @Override // com.daaw.sd3
    public final List zzk() {
        cd1 m19140P = this.f34568q.m19140P();
        cd1 m19139Q = this.f34568q.m19139Q();
        String[] strArr = new String[m19140P.size() + m19139Q.size()];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < m19140P.size()) {
            strArr[i3] = (String) m19140P.m25436i(i2);
            i2++;
            i3++;
        }
        while (i < m19139Q.size()) {
            strArr[i3] = (String) m19139Q.m25436i(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.daaw.sd3
    public final void zzl() {
        e35 e35Var = this.f34570s;
        if (e35Var != null) {
            e35Var.mo2132a();
        }
        this.f34570s = null;
        this.f34569r = null;
    }

    @Override // com.daaw.sd3
    public final void zzm() {
        String m19129a = this.f34568q.m19129a();
        if ("Google".equals(m19129a)) {
            k04.zzj("Illegal argument specified for omid partner name.");
        } else if (TextUtils.isEmpty(m19129a)) {
            k04.zzj("Not starting OMID session. OM partner name has not been configured.");
        } else {
            e35 e35Var = this.f34570s;
            if (e35Var != null) {
                e35Var.m23761R(m19129a, false);
            }
        }
    }

    @Override // com.daaw.sd3
    public final void zzn(String str) {
        e35 e35Var = this.f34570s;
        if (e35Var != null) {
            e35Var.m23751i(str);
        }
    }

    @Override // com.daaw.sd3
    public final void zzo() {
        e35 e35Var = this.f34570s;
        if (e35Var != null) {
            e35Var.m23748l();
        }
    }

    @Override // com.daaw.sd3
    public final boolean zzq() {
        e35 e35Var = this.f34570s;
        return (e35Var == null || e35Var.m23734z()) && this.f34568q.m19131Y() != null && this.f34568q.m19130Z() == null;
    }

    @Override // com.daaw.sd3
    public final boolean zzs() {
        yd0 m19124c0 = this.f34568q.m19124c0();
        if (m19124c0 == null) {
            k04.zzj("Trying to start OMID session before creation.");
            return false;
        }
        zzt.zzA().zzd(m19124c0);
        if (this.f34568q.m19131Y() != null) {
            this.f34568q.m19131Y().mo6434T("onSdkLoaded", new C1370g6());
            return true;
        }
        return true;
    }
}
