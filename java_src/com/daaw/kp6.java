package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzchu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class kp6 {

    /* renamed from: a */
    public final vu5 f16614a;

    /* renamed from: b */
    public final String f16615b;

    /* renamed from: c */
    public final String f16616c;

    /* renamed from: d */
    public final String f16617d;

    /* renamed from: e */
    public final Context f16618e;

    /* renamed from: f */
    public final gi6 f16619f;

    /* renamed from: g */
    public final hi6 f16620g;

    /* renamed from: h */
    public final InterfaceC0623ag f16621h;

    /* renamed from: i */
    public final sl2 f16622i;

    public kp6(vu5 vu5Var, zzchu zzchuVar, String str, String str2, Context context, gi6 gi6Var, hi6 hi6Var, InterfaceC0623ag interfaceC0623ag, sl2 sl2Var) {
        this.f16614a = vu5Var;
        this.f16615b = zzchuVar.f36993p;
        this.f16616c = str;
        this.f16617d = str2;
        this.f16618e = context;
        this.f16619f = gi6Var;
        this.f16620g = hi6Var;
        this.f16621h = interfaceC0623ag;
        this.f16622i = sl2Var;
    }

    /* renamed from: f */
    public static final List m17530f(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m17528h((String) it.next(), "@gw_mpe@", "2." + i2));
        }
        return arrayList;
    }

    /* renamed from: g */
    public static String m17529g(String str) {
        return TextUtils.isEmpty(str) ? "" : j04.m19188l() ? "fakeForAdDebugLog" : str;
    }

    /* renamed from: h */
    public static String m17528h(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* renamed from: c */
    public final List m17533c(fi6 fi6Var, th6 th6Var, List list) {
        return m17532d(fi6Var, th6Var, false, "", "", list);
    }

    /* renamed from: d */
    public final List m17532d(fi6 fi6Var, th6 th6Var, boolean z, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        String str3 = true != z ? "0" : "1";
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String m17528h = m17528h(m17528h(m17528h((String) it.next(), "@gw_adlocid@", fi6Var.f9623a.f5824a.f25346f), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.f16615b);
            if (th6Var != null) {
                m17528h = my3.m15658c(m17528h(m17528h(m17528h(m17528h, "@gw_qdata@", th6Var.f27721z), "@gw_adnetid@", th6Var.f27720y), "@gw_allocid@", th6Var.f27719x), this.f16618e, th6Var.f27677X);
            }
            String m17528h2 = m17528h(m17528h(m17528h(m17528h, "@gw_adnetstatus@", this.f16614a.m6777f()), "@gw_seqnum@", this.f16616c), "@gw_sessid@", this.f16617d);
            boolean z2 = false;
            if (((Boolean) zzba.zzc().m23658b(g93.f10614Z2)).booleanValue() && !TextUtils.isEmpty(str)) {
                z2 = true;
            }
            boolean z3 = !TextUtils.isEmpty(str2);
            if (!z2) {
                if (z3) {
                    z3 = true;
                } else {
                    arrayList.add(m17528h2);
                }
            }
            if (this.f16622i.m10199f(Uri.parse(m17528h2))) {
                Uri.Builder buildUpon = Uri.parse(m17528h2).buildUpon();
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                m17528h2 = buildUpon.build().toString();
            }
            arrayList.add(m17528h2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[LOOP:0: B:13:0x0059->B:15:0x005f, LOOP_END] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m17531e(th6 th6Var, List list, cv3 cv3Var) {
        gi6 gi6Var;
        oy6 m13860d;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        long mo15860a = this.f16621h.mo15860a();
        try {
            String zzc = cv3Var.zzc();
            String num = Integer.toString(cv3Var.zzb());
            if (((Boolean) zzba.zzc().m23658b(g93.f10625a3)).booleanValue()) {
                hi6 hi6Var = this.f16620g;
                if (hi6Var == null) {
                    m13860d = oy6.m13861c();
                    String str = (String) m13860d.mo4398a(new ey6() { // from class: com.daaw.ip6
                        @Override // com.daaw.ey6
                        public final Object apply(Object obj) {
                            String m17529g;
                            m17529g = kp6.m17529g(((gi6) obj).f11331a);
                            return m17529g;
                        }
                    }).mo4397b("");
                    String str2 = (String) m13860d.mo4398a(new ey6() { // from class: com.daaw.jp6
                        @Override // com.daaw.ey6
                        public final Object apply(Object obj) {
                            String m17529g;
                            m17529g = kp6.m17529g(((gi6) obj).f11332b);
                            return m17529g;
                        }
                    }).mo4397b("");
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(my3.m15658c(m17528h(m17528h(m17528h(m17528h(m17528h(m17528h((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(mo15860a)), "@gw_rwd_itm@", Uri.encode(zzc)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.f16615b), this.f16618e, th6Var.f27677X));
                    }
                    return arrayList;
                }
                gi6Var = hi6Var.f12556a;
            } else {
                gi6Var = this.f16619f;
            }
            m13860d = oy6.m13860d(gi6Var);
            String str3 = (String) m13860d.mo4398a(new ey6() { // from class: com.daaw.ip6
                @Override // com.daaw.ey6
                public final Object apply(Object obj) {
                    String m17529g;
                    m17529g = kp6.m17529g(((gi6) obj).f11331a);
                    return m17529g;
                }
            }).mo4397b("");
            String str22 = (String) m13860d.mo4398a(new ey6() { // from class: com.daaw.jp6
                @Override // com.daaw.ey6
                public final Object apply(Object obj) {
                    String m17529g;
                    m17529g = kp6.m17529g(((gi6) obj).f11332b);
                    return m17529g;
                }
            }).mo4397b("");
            it = list.iterator();
            while (it.hasNext()) {
            }
            return arrayList;
        } catch (RemoteException e) {
            k04.zzh("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }
}
