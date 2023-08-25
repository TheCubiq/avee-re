package com.daaw;

import android.opengl.GLES20;
/* loaded from: classes2.dex */
public class e40 implements le0 {

    /* renamed from: a */
    public int f8110a;

    /* renamed from: b */
    public vk1 f8111b;

    /* renamed from: c */
    public boolean f8112c;

    public e40(vk1 vk1Var, boolean z) {
        this.f8111b = vk1Var;
        this.f8112c = z;
        if (!m23728d()) {
            throw new qi0("FBO extension not supported in hardware");
        }
        vk1Var.m7094c();
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        int i = iArr[0];
        this.f8110a = i;
        GLES20.glBindFramebuffer(36160, i);
        GLES20.glFramebufferTexture2D(36160, 36064, vk1Var.m7092e(), vk1Var.m7093d(), 0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        GLES20.glBindFramebuffer(36160, 0);
        if (glCheckFramebufferStatus == 36053) {
            return;
        }
        GLES20.glDeleteFramebuffers(1, new int[]{this.f8110a}, 0);
        throw new qi0("exception " + glCheckFramebufferStatus + " when checking FBO status");
    }

    /* renamed from: d */
    public static boolean m23728d() {
        return true;
    }

    @Override // com.daaw.le0
    /* renamed from: a */
    public void mo7096a() {
        if (this.f8110a == 0) {
            return;
        }
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteFramebuffers(1, new int[]{this.f8110a}, 0);
        if (this.f8112c) {
            this.f8111b.mo7096a();
        }
        this.f8110a = 0;
    }

    @Override // com.daaw.le0
    /* renamed from: b */
    public vk1 mo7095b() {
        return this.f8111b;
    }

    /* renamed from: c */
    public void mo14057c() {
        throw null;
    }

    @Override // com.daaw.le0
    public int getHeight() {
        return this.f8111b.getHeight();
    }

    @Override // com.daaw.le0
    public int getWidth() {
        return this.f8111b.getWidth();
    }
}
