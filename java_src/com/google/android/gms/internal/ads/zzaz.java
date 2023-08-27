package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public final class zzaz {
    public static int zzd(int i) {
        if (i < 0 || i > 2) {
            if (i < 1000 || i > 1000) {
                StringBuilder sb = new StringBuilder(43);
                sb.append(i);
                sb.append(" is not a valid enum EnumBoolean");
                throw new IllegalArgumentException(sb.toString());
            }
            return i;
        }
        return i;
    }

    public static int zze(int i) {
        if (i < 0 || i > 2) {
            StringBuilder sb = new StringBuilder(41);
            sb.append(i);
            sb.append(" is not a valid enum ProtoName");
            throw new IllegalArgumentException(sb.toString());
        }
        return i;
    }

    public static int zzf(int i) {
        if (i < 0 || i > 3) {
            StringBuilder sb = new StringBuilder(48);
            sb.append(i);
            sb.append(" is not a valid enum EncryptionMethod");
            throw new IllegalArgumentException(sb.toString());
        }
        return i;
    }
}
