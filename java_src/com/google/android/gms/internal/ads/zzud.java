package com.google.android.gms.internal.ads;
@zzadh
/* loaded from: classes2.dex */
final class zzud {
    private static final zzua zzbpe = zzua.zzlk();
    private static final float zzbpf = ((Float) zzkb.zzik().zzd(zznk.zzazk)).floatValue();
    private static final long zzbpg = ((Long) zzkb.zzik().zzd(zznk.zzazi)).longValue();
    private static final float zzbph = ((Float) zzkb.zzik().zzd(zznk.zzazl)).floatValue();
    private static final long zzbpi = ((Long) zzkb.zzik().zzd(zznk.zzazj)).longValue();

    private static int zzb(long j, int i) {
        return (int) ((j >>> ((i % 16) * 4)) & 15);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zzlv() {
        int i;
        int zzlr = zzbpe.zzlr();
        int zzls = zzbpe.zzls();
        int zzlq = zzbpe.zzlq() + zzbpe.zzlp();
        int i2 = Integer.MAX_VALUE;
        if (zzlr < 16) {
            long j = zzbpi;
            if (j != 0) {
                i = zzb(j, zzlr);
                if (zzls <= i) {
                    return false;
                }
                if (zzlr < 16) {
                    long j2 = zzbpg;
                    if (j2 != 0) {
                        i2 = zzb(j2, zzlr);
                        return zzlq > i2;
                    }
                }
                float f = zzbpf;
                if (f != 0.0f) {
                    i2 = (int) (f * zzlr);
                }
                if (zzlq > i2) {
                }
            }
        }
        float f2 = zzbph;
        i = f2 != 0.0f ? ((int) (f2 * zzlr)) + 1 : Integer.MAX_VALUE;
        if (zzls <= i) {
        }
    }
}
