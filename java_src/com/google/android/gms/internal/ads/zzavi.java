package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final /* synthetic */ class zzavi {
    static final /* synthetic */ int[] zzdhz;
    static final /* synthetic */ int[] zzdia;
    static final /* synthetic */ int[] zzdib;

    static {
        int[] iArr = new int[zzawk.values().length];
        zzdib = iArr;
        try {
            iArr[zzawk.UNCOMPRESSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zzdib[zzawk.COMPRESSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[zzawy.values().length];
        zzdia = iArr2;
        try {
            iArr2[zzawy.NIST_P256.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            zzdia[zzawy.NIST_P384.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            zzdia[zzawy.NIST_P521.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr3 = new int[zzaxa.values().length];
        zzdhz = iArr3;
        try {
            iArr3[zzaxa.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            zzdhz[zzaxa.SHA256.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            zzdhz[zzaxa.SHA512.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
