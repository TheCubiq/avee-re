package com.daaw;

import android.opengl.GLES20;
/* loaded from: classes.dex */
public class or1 extends e40 {
    public vp d;

    public or1(vr1 vr1Var, boolean z) {
        super(vr1Var, z);
        this.d = new vp();
    }

    public static or1 g(int i, int i2, int i3, int i4, boolean z) {
        vr1 m = new vr1(i, i2, i3, i4, z).m();
        if (m == null) {
            return null;
        }
        try {
            return new or1(m, true);
        } catch (Exception e) {
            lz1.c("exception " + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean i() {
        return Boolean.valueOf(!h());
    }

    @Override // com.daaw.e40
    public void c() {
        if (h()) {
            GLES20.glViewport(0, 0, getWidth(), getHeight());
            GLES20.glBindFramebuffer(36160, this.a);
        }
    }

    public or1 f() {
        if (h()) {
            return this;
        }
        a();
        lz1.c("FrameBuffer is not valid");
        return null;
    }

    public void finalize() {
        super.finalize();
        this.d.a(new w40() { // from class: com.daaw.nr1
            @Override // com.daaw.w40
            public final Object a() {
                Boolean i;
                i = or1.this.i();
                return i;
            }
        });
    }

    public boolean h() {
        return this.a != 0;
    }
}
