package com.daaw;

import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes2.dex */
public final class d88 extends pa8 {

    /* renamed from: d */
    public final Map f6614d;

    /* renamed from: e */
    public final xy5 f6615e;

    /* renamed from: f */
    public final xy5 f6616f;

    /* renamed from: g */
    public final xy5 f6617g;

    /* renamed from: h */
    public final xy5 f6618h;

    /* renamed from: i */
    public final xy5 f6619i;

    public d88(yb8 yb8Var) {
        super(yb8Var);
        this.f6614d = new HashMap();
        l36 m24053F = this.f25143a.m24053F();
        m24053F.getClass();
        this.f6615e = new xy5(m24053F, "last_delete_stale", 0L);
        l36 m24053F2 = this.f25143a.m24053F();
        m24053F2.getClass();
        this.f6616f = new xy5(m24053F2, "backoff", 0L);
        l36 m24053F3 = this.f25143a.m24053F();
        m24053F3.getClass();
        this.f6617g = new xy5(m24053F3, "last_upload", 0L);
        l36 m24053F4 = this.f25143a.m24053F();
        m24053F4.getClass();
        this.f6618h = new xy5(m24053F4, "last_upload_attempt", 0L);
        l36 m24053F5 = this.f25143a.m24053F();
        m24053F5.getClass();
        this.f6619i = new xy5(m24053F5, "midnight_offset", 0L);
    }

    @Override // com.daaw.pa8
    /* renamed from: k */
    public final boolean mo8149k() {
        return false;
    }

    @Deprecated
    /* renamed from: l */
    public final Pair m24597l(String str) {
        a88 a88Var;
        AdvertisingIdClient.Info advertisingIdInfo;
        mo6991f();
        long mo15859b = this.f25143a.mo3909b().mo15859b();
        a88 a88Var2 = (a88) this.f6614d.get(str);
        if (a88Var2 == null || mo15859b >= a88Var2.f2997c) {
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
            long m12660q = mo15859b + this.f25143a.m24020z().m12660q(str, m75.f18523c);
            try {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f25143a.mo3905d());
            } catch (Exception e) {
                this.f25143a.mo3895i().m14161p().m20652b("Unable to get advertising id", e);
                a88Var = new a88("", false, m12660q);
            }
            if (advertisingIdInfo == null) {
                return new Pair("", Boolean.FALSE);
            }
            String id = advertisingIdInfo.getId();
            a88Var = id != null ? new a88(id, advertisingIdInfo.isLimitAdTrackingEnabled(), m12660q) : new a88("", advertisingIdInfo.isLimitAdTrackingEnabled(), m12660q);
            this.f6614d.put(str, a88Var);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new Pair(a88Var.f2995a, Boolean.valueOf(a88Var.f2996b));
        }
        return new Pair(a88Var2.f2995a, Boolean.valueOf(a88Var2.f2996b));
    }

    /* renamed from: m */
    public final Pair m24596m(String str, cd2 cd2Var) {
        return cd2Var.m25423i(vb2.AD_STORAGE) ? m24597l(str) : new Pair("", Boolean.FALSE);
    }

    @Deprecated
    /* renamed from: n */
    public final String m24595n(String str, boolean z) {
        mo6991f();
        String str2 = z ? (String) m24597l(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest m24464t = dd8.m24464t();
        if (m24464t == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, m24464t.digest(str2.getBytes())));
    }
}
