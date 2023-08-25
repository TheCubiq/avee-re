package com.daaw;
/* loaded from: classes.dex */
public final class mn2 extends no2 {
    public mn2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2) {
        super(wm2Var, "YC+pJVOZY25wDvtlWBPChLSjLU0iUh44DqTcbsbdAncZlcvrsOhFkSGXkkm3Hf4Z", "a17x9Lt/WQTGhUJAM6t8VqFWsXteADIsbbHvy7b7aMM=", hi2Var, i, 5);
    }

    @Override // com.daaw.no2
    public final void a() {
        this.e.k0(-1L);
        this.e.j0(-1L);
        int[] iArr = (int[]) this.f.invoke(null, this.b.b());
        synchronized (this.e) {
            this.e.k0(iArr[0]);
            this.e.j0(iArr[1]);
            int i = iArr[2];
            if (i != Integer.MIN_VALUE) {
                this.e.i0(i);
            }
        }
    }
}
