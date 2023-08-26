package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public final class zzia {
    public static int zzd(int i) {
        if (i < 0 || i > 1) {
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
}
