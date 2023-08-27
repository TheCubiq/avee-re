package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public enum zzayd implements zzbbr {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    
    private static final zzbbs<zzayd> zzall = new zzbbs<zzayd>() { // from class: com.google.android.gms.internal.ads.zzaye
        @Override // com.google.android.gms.internal.ads.zzbbs
        public final /* synthetic */ zzayd zzq(int i) {
            return zzayd.zzbg(i);
        }
    };
    private final int value;

    zzayd(int i) {
        this.value = i;
    }

    public static zzayd zzbg(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return CRUNCHY;
                    }
                    return RAW;
                }
                return LEGACY;
            }
            return TINK;
        }
        return UNKNOWN_PREFIX;
    }

    @Override // com.google.android.gms.internal.ads.zzbbr
    public final int zzhq() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
