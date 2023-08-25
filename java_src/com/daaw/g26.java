package com.daaw;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
/* loaded from: classes.dex */
public final class g26 extends sx5 {
    public pa6 e;
    public byte[] f;
    public int g;
    public int h;

    public g26() {
        super(false);
    }

    @Override // com.daaw.xp8
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(it5.h(this.f), this.g, bArr, i, min);
        this.g += min;
        this.h -= min;
        c(min);
        return min;
    }

    @Override // com.daaw.p46
    public final long g(pa6 pa6Var) {
        l(pa6Var);
        this.e = pa6Var;
        Uri uri = pa6Var.a;
        String scheme = uri.getScheme();
        uo4.e("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String[] H = it5.H(uri.getSchemeSpecificPart(), ",");
        if (H.length == 2) {
            String str = H[1];
            if (H[0].contains(";base64")) {
                try {
                    this.f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw dl3.b("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e);
                }
            } else {
                this.f = it5.B(URLDecoder.decode(str, cy6.a.name()));
            }
            long j = pa6Var.f;
            int length = this.f.length;
            if (j > length) {
                this.f = null;
                throw new s56(2008);
            }
            int i = (int) j;
            this.g = i;
            int i2 = length - i;
            this.h = i2;
            long j2 = pa6Var.g;
            if (j2 != -1) {
                this.h = (int) Math.min(i2, j2);
            }
            m(pa6Var);
            long j3 = pa6Var.g;
            return j3 != -1 ? j3 : this.h;
        }
        throw dl3.b("Unexpected URI format: ".concat(String.valueOf(uri)), null);
    }

    @Override // com.daaw.p46
    public final Uri zzc() {
        pa6 pa6Var = this.e;
        if (pa6Var != null) {
            return pa6Var.a;
        }
        return null;
    }

    @Override // com.daaw.p46
    public final void zzd() {
        if (this.f != null) {
            this.f = null;
            k();
        }
        this.e = null;
    }
}
