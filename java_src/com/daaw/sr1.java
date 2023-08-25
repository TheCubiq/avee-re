package com.daaw;

import android.opengl.GLES20;
/* loaded from: classes.dex */
public class sr1 extends dc1 {

    /* renamed from: j */
    public C3358vp f26562j;

    public sr1(String str, String str2) {
        super(str, str2);
        this.f26562j = new C3358vp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ Boolean m9966C() {
        return Boolean.valueOf(this.f6906a == 0);
    }

    /* renamed from: D */
    public void m9965D(int i, boolean z, float[] fArr) {
        GLES20.glUniformMatrix4fv(i, 1, z, fArr, 0);
    }

    /* renamed from: E */
    public void m9964E(String str, boolean z, float[] fArr) {
        m9965D(m24546l(str), z, fArr);
    }

    public void finalize() {
        super.finalize();
        this.f26562j.m6959a(new w40() { // from class: com.daaw.rr1
            @Override // com.daaw.w40
            /* renamed from: a */
            public final Object mo3478a() {
                Boolean m9966C;
                m9966C = sr1.this.m9966C();
                return m9966C;
            }
        });
    }
}
