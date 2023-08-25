package com.daaw;

import android.opengl.GLES20;
/* loaded from: classes2.dex */
public class e40 implements le0 {
    public int a;
    public vk1 b;
    public boolean c;

    public e40(vk1 vk1Var, boolean z) {
        this.b = vk1Var;
        this.c = z;
        if (!d()) {
            throw new qi0("FBO extension not supported in hardware");
        }
        vk1Var.c();
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        int i = iArr[0];
        this.a = i;
        GLES20.glBindFramebuffer(36160, i);
        GLES20.glFramebufferTexture2D(36160, 36064, vk1Var.e(), vk1Var.d(), 0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        GLES20.glBindFramebuffer(36160, 0);
        if (glCheckFramebufferStatus == 36053) {
            return;
        }
        GLES20.glDeleteFramebuffers(1, new int[]{this.a}, 0);
        throw new qi0("exception " + glCheckFramebufferStatus + " when checking FBO status");
    }

    public static boolean d() {
        return true;
    }

    @Override // com.daaw.le0
    public void a() {
        if (this.a == 0) {
            return;
        }
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteFramebuffers(1, new int[]{this.a}, 0);
        if (this.c) {
            this.b.a();
        }
        this.a = 0;
    }

    @Override // com.daaw.le0
    public vk1 b() {
        return this.b;
    }

    public void c() {
        throw null;
    }

    @Override // com.daaw.le0
    public int getHeight() {
        return this.b.getHeight();
    }

    @Override // com.daaw.le0
    public int getWidth() {
        return this.b.getWidth();
    }
}
