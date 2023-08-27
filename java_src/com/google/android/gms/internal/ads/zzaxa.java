package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public enum zzaxa implements zzbbr {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA224(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    
    private static final zzbbs<zzaxa> zzall = new zzbbs<zzaxa>() { // from class: com.google.android.gms.internal.ads.zzaxb
        @Override // com.google.android.gms.internal.ads.zzbbs
        public final /* synthetic */ zzaxa zzq(int i) {
            return zzaxa.zzau(i);
        }
    };
    private final int value;

    zzaxa(int i) {
        this.value = i;
    }

    public static zzaxa zzau(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return SHA512;
                    }
                    return SHA256;
                }
                return SHA224;
            }
            return SHA1;
        }
        return UNKNOWN_HASH;
    }

    @Override // com.google.android.gms.internal.ads.zzbbr
    public final int zzhq() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
