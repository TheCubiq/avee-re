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
    public final Map d;
    public final xy5 e;
    public final xy5 f;
    public final xy5 g;
    public final xy5 h;
    public final xy5 i;

    public d88(yb8 yb8Var) {
        super(yb8Var);
        this.d = new HashMap();
        l36 F = this.a.F();
        F.getClass();
        this.e = new xy5(F, "last_delete_stale", 0L);
        l36 F2 = this.a.F();
        F2.getClass();
        this.f = new xy5(F2, "backoff", 0L);
        l36 F3 = this.a.F();
        F3.getClass();
        this.g = new xy5(F3, "last_upload", 0L);
        l36 F4 = this.a.F();
        F4.getClass();
        this.h = new xy5(F4, "last_upload_attempt", 0L);
        l36 F5 = this.a.F();
        F5.getClass();
        this.i = new xy5(F5, "midnight_offset", 0L);
    }

    @Override // com.daaw.pa8
    public final boolean k() {
        return false;
    }

    @Deprecated
    public final Pair l(String str) {
        a88 a88Var;
        AdvertisingIdClient.Info advertisingIdInfo;
        f();
        long b = this.a.b().b();
        a88 a88Var2 = (a88) this.d.get(str);
        if (a88Var2 == null || b >= a88Var2.c) {
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
            long q = b + this.a.z().q(str, m75.c);
            try {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.a.d());
            } catch (Exception e) {
                this.a.i().p().b("Unable to get advertising id", e);
                a88Var = new a88("", false, q);
            }
            if (advertisingIdInfo == null) {
                return new Pair("", Boolean.FALSE);
            }
            String id = advertisingIdInfo.getId();
            a88Var = id != null ? new a88(id, advertisingIdInfo.isLimitAdTrackingEnabled(), q) : new a88("", advertisingIdInfo.isLimitAdTrackingEnabled(), q);
            this.d.put(str, a88Var);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new Pair(a88Var.a, Boolean.valueOf(a88Var.b));
        }
        return new Pair(a88Var2.a, Boolean.valueOf(a88Var2.b));
    }

    public final Pair m(String str, cd2 cd2Var) {
        return cd2Var.i(vb2.AD_STORAGE) ? l(str) : new Pair("", Boolean.FALSE);
    }

    @Deprecated
    public final String n(String str, boolean z) {
        f();
        String str2 = z ? (String) l(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest t = dd8.t();
        if (t == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, t.digest(str2.getBytes())));
    }
}
