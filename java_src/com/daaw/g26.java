package com.daaw;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
/* loaded from: classes.dex */
public final class g26 extends sx5 {

    /* renamed from: e */
    public pa6 f10206e;

    /* renamed from: f */
    public byte[] f10207f;

    /* renamed from: g */
    public int f10208g;

    /* renamed from: h */
    public int f10209h;

    public g26() {
        super(false);
    }

    @Override // com.daaw.xp8
    /* renamed from: a */
    public final int mo1980a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f10209h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(it5.m19391h(this.f10207f), this.f10208g, bArr, i, min);
        this.f10208g += min;
        this.f10209h -= min;
        m9782c(min);
        return min;
    }

    @Override // com.daaw.p46
    /* renamed from: g */
    public final long mo1978g(pa6 pa6Var) {
        m9780l(pa6Var);
        this.f10206e = pa6Var;
        Uri uri = pa6Var.f22769a;
        String scheme = uri.getScheme();
        uo4.m7873e("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String[] m19424H = it5.m19424H(uri.getSchemeSpecificPart(), ",");
        if (m19424H.length == 2) {
            String str = m19424H[1];
            if (m19424H[0].contains(";base64")) {
                try {
                    this.f10207f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw dl3.m24266b("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e);
                }
            } else {
                this.f10207f = it5.m19430B(URLDecoder.decode(str, cy6.f6273a.name()));
            }
            long j = pa6Var.f22774f;
            int length = this.f10207f.length;
            if (j > length) {
                this.f10207f = null;
                throw new s56(2008);
            }
            int i = (int) j;
            this.f10208g = i;
            int i2 = length - i;
            this.f10209h = i2;
            long j2 = pa6Var.f22775g;
            if (j2 != -1) {
                this.f10209h = (int) Math.min(i2, j2);
            }
            m9779m(pa6Var);
            long j3 = pa6Var.f22775g;
            return j3 != -1 ? j3 : this.f10209h;
        }
        throw dl3.m24266b("Unexpected URI format: ".concat(String.valueOf(uri)), null);
    }

    @Override // com.daaw.p46
    public final Uri zzc() {
        pa6 pa6Var = this.f10206e;
        if (pa6Var != null) {
            return pa6Var.f22769a;
        }
        return null;
    }

    @Override // com.daaw.p46
    public final void zzd() {
        if (this.f10207f != null) {
            this.f10207f = null;
            m9781k();
        }
        this.f10206e = null;
    }
}
