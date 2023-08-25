package com.daaw;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
/* loaded from: classes2.dex */
public final class g28 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ boolean f10218p;

    /* renamed from: q */
    public final /* synthetic */ Uri f10219q;

    /* renamed from: r */
    public final /* synthetic */ String f10220r;

    /* renamed from: s */
    public final /* synthetic */ String f10221s;

    /* renamed from: t */
    public final /* synthetic */ m28 f10222t;

    public g28(m28 m28Var, boolean z, Uri uri, String str, String str2) {
        this.f10222t = m28Var;
        this.f10218p = z;
        this.f10219q = uri;
        this.f10220r = str;
        this.f10221s = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf A[Catch: RuntimeException -> 0x0160, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0160, blocks: (B:3:0x0011, B:27:0x0086, B:29:0x0094, B:32:0x00a1, B:34:0x00a7, B:35:0x00bb, B:36:0x00c7, B:39:0x00cf, B:43:0x00f6, B:45:0x0114, B:44:0x0103, B:47:0x011b, B:49:0x0121, B:51:0x0127, B:53:0x012d, B:55:0x0133, B:57:0x013b, B:59:0x0143, B:61:0x0149, B:63:0x0150, B:7:0x002e, B:9:0x0034, B:11:0x003a, B:13:0x0040, B:15:0x0046, B:17:0x004e, B:19:0x0056, B:21:0x005e, B:22:0x006c, B:24:0x007c), top: B:68:0x0011 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Bundle m24463t0;
        Bundle m24463t02;
        m28 m28Var = this.f10222t;
        boolean z = this.f10218p;
        Uri uri = this.f10219q;
        String str = this.f10220r;
        String str2 = this.f10221s;
        m28Var.f18410p.mo6991f();
        try {
            dd8 m24045N = m28Var.f18410p.f25143a.m24045N();
            if (!TextUtils.isEmpty(str2)) {
                if (str2.contains("gclid") || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_id") || str2.contains("dclid") || str2.contains("srsltid")) {
                    m24463t0 = m24045N.m24463t0(Uri.parse("https://google.com/search?".concat(str2)));
                    if (m24463t0 != null) {
                        m24463t0.putString("_cis", "referrer");
                    }
                    if (z && (m24463t02 = m28Var.f18410p.f25143a.m24045N().m24463t0(uri)) != null) {
                        m24463t02.putString("_cis", "intent");
                        if (!m24463t02.containsKey("gclid") && m24463t0 != null && m24463t0.containsKey("gclid")) {
                            m24463t02.putString("_cer", String.format("gclid=%s", m24463t0.getString("gclid")));
                        }
                        m28Var.f18410p.m13683u(str, "_cmp", m24463t02);
                        m28Var.f18410p.f22555n.m21304a(str, m24463t02);
                    }
                    if (TextUtils.isEmpty(str2)) {
                        m28Var.f18410p.f25143a.mo3895i().m14161p().m20652b("Activity created with referrer", str2);
                        if (m28Var.f18410p.f25143a.m24020z().m12677B(null, m75.f18520a0)) {
                            if (m24463t0 != null) {
                                m28Var.f18410p.m13683u(str, "_cmp", m24463t0);
                                m28Var.f18410p.f22555n.m21304a(str, m24463t0);
                            } else {
                                m28Var.f18410p.f25143a.mo3895i().m14161p().m20652b("Referrer does not contain valid parameters", str2);
                            }
                            m28Var.f18410p.m13711K("auto", "_ldl", null, true);
                            return;
                        } else if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                            m28Var.f18410p.f25143a.mo3895i().m14161p().m20653a("Activity created with data 'referrer' without required params");
                            return;
                        } else if (TextUtils.isEmpty(str2)) {
                            return;
                        } else {
                            m28Var.f18410p.m13711K("auto", "_ldl", str2, true);
                            return;
                        }
                    }
                    return;
                }
                m24045N.f25143a.mo3895i().m14161p().m20653a("Activity created with data 'referrer' without required params");
            }
            m24463t0 = null;
            if (z) {
                m24463t02.putString("_cis", "intent");
                if (!m24463t02.containsKey("gclid")) {
                    m24463t02.putString("_cer", String.format("gclid=%s", m24463t0.getString("gclid")));
                }
                m28Var.f18410p.m13683u(str, "_cmp", m24463t02);
                m28Var.f18410p.f22555n.m21304a(str, m24463t02);
            }
            if (TextUtils.isEmpty(str2)) {
            }
        } catch (RuntimeException e) {
            m28Var.f18410p.f25143a.mo3895i().m14160q().m20652b("Throwable caught in handleReferrerForOnActivityCreated", e);
        }
    }
}
