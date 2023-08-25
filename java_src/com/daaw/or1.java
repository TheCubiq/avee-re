package com.daaw;

import android.opengl.GLES20;
/* loaded from: classes.dex */
public class or1 extends e40 {

    /* renamed from: d */
    public C3358vp f21852d;

    public or1(vr1 vr1Var, boolean z) {
        super(vr1Var, z);
        this.f21852d = new C3358vp();
    }

    /* renamed from: g */
    public static or1 m14054g(int i, int i2, int i3, int i4, boolean z) {
        vr1 m6846m = new vr1(i, i2, i3, i4, z).m6846m();
        if (m6846m == null) {
            return null;
        }
        try {
            return new or1(m6846m, true);
        } catch (Exception e) {
            lz1.m16363c("exception " + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Boolean m14052i() {
        return Boolean.valueOf(!m14053h());
    }

    @Override // com.daaw.e40
    /* renamed from: c */
    public void mo14057c() {
        if (m14053h()) {
            GLES20.glViewport(0, 0, getWidth(), getHeight());
            GLES20.glBindFramebuffer(36160, this.f8110a);
        }
    }

    /* renamed from: f */
    public or1 m14055f() {
        if (m14053h()) {
            return this;
        }
        mo7096a();
        lz1.m16363c("FrameBuffer is not valid");
        return null;
    }

    public void finalize() {
        super.finalize();
        this.f21852d.m6959a(new w40() { // from class: com.daaw.nr1
            @Override // com.daaw.w40
            /* renamed from: a */
            public final Object mo3478a() {
                Boolean m14052i;
                m14052i = or1.this.m14052i();
                return m14052i;
            }
        });
    }

    /* renamed from: h */
    public boolean m14053h() {
        return this.f8110a != 0;
    }
}
