package com.google.android.gms.internal.ads;
@zzadh
/* loaded from: classes2.dex */
public final class zzasi {
    public final int heightPixels;
    private final int type;
    public final int widthPixels;

    private zzasi(int i, int i2, int i3) {
        this.type = i;
        this.widthPixels = i2;
        this.heightPixels = i3;
    }

    public static zzasi zzb(zzjn zzjnVar) {
        return zzjnVar.zzarc ? new zzasi(3, 0, 0) : zzjnVar.zzarf ? new zzasi(2, 0, 0) : zzjnVar.zzare ? zzvq() : zzi(zzjnVar.widthPixels, zzjnVar.heightPixels);
    }

    public static zzasi zzi(int i, int i2) {
        return new zzasi(1, i, i2);
    }

    public static zzasi zzvq() {
        return new zzasi(0, 0, 0);
    }

    public static zzasi zzvr() {
        return new zzasi(4, 0, 0);
    }

    public final boolean isFluid() {
        return this.type == 2;
    }

    public final boolean zzvs() {
        return this.type == 3;
    }

    public final boolean zzvt() {
        return this.type == 0;
    }

    public final boolean zzvu() {
        return this.type == 4;
    }
}
