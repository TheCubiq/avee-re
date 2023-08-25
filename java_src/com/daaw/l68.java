package com.daaw;

import android.os.RemoteException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class l68 extends my8 {
    public final int p;

    public l68(byte[] bArr) {
        ry0.a(bArr.length == 25);
        this.p = Arrays.hashCode(bArr);
    }

    public static byte[] M(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        yd0 zzd;
        if (obj != null && (obj instanceof tz8)) {
            try {
                tz8 tz8Var = (tz8) obj;
                if (tz8Var.zzc() == this.p && (zzd = tz8Var.zzd()) != null) {
                    return Arrays.equals(g3(), (byte[]) nt0.M(zzd));
                }
                return false;
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public abstract byte[] g3();

    public final int hashCode() {
        return this.p;
    }

    @Override // com.daaw.tz8
    public final int zzc() {
        return this.p;
    }

    @Override // com.daaw.tz8
    public final yd0 zzd() {
        return nt0.g3(g3());
    }
}
