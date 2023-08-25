package com.daaw;

import android.opengl.GLES20;
/* loaded from: classes.dex */
public class sr1 extends dc1 {
    public vp j;

    public sr1(String str, String str2) {
        super(str, str2);
        this.j = new vp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean C() {
        return Boolean.valueOf(this.a == 0);
    }

    public void D(int i, boolean z, float[] fArr) {
        GLES20.glUniformMatrix4fv(i, 1, z, fArr, 0);
    }

    public void E(String str, boolean z, float[] fArr) {
        D(l(str), z, fArr);
    }

    public void finalize() {
        super.finalize();
        this.j.a(new w40() { // from class: com.daaw.rr1
            @Override // com.daaw.w40
            public final Object a() {
                Boolean C;
                C = sr1.this.C();
                return C;
            }
        });
    }
}
