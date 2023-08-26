package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public enum zzawy implements zzbbr {
    UNKNOWN_CURVE(0),
    NIST_P224(1),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    UNRECOGNIZED(-1);
    
    private static final zzbbs<zzawy> zzall = new zzbbs<zzawy>() { // from class: com.google.android.gms.internal.ads.zzawz
        @Override // com.google.android.gms.internal.ads.zzbbs
        public final /* synthetic */ zzawy zzq(int i) {
            return zzawy.zzat(i);
        }
    };
    private final int value;

    zzawy(int i) {
        this.value = i;
    }

    public static zzawy zzat(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return NIST_P521;
                    }
                    return NIST_P384;
                }
                return NIST_P256;
            }
            return NIST_P224;
        }
        return UNKNOWN_CURVE;
    }

    @Override // com.google.android.gms.internal.ads.zzbbr
    public final int zzhq() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
