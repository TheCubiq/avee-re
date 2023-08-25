package com.daaw;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
/* loaded from: classes.dex */
public class mr1 implements rc0 {

    /* renamed from: b */
    public int f19096b;

    /* renamed from: c */
    public FloatBuffer f19097c;

    /* renamed from: e */
    public float[] f19099e;

    /* renamed from: f */
    public int f19100f;

    /* renamed from: g */
    public int f19101g;

    /* renamed from: a */
    public C3358vp f19095a = new C3358vp();

    /* renamed from: d */
    public int f19098d = 0;

    /* renamed from: h */
    public final int f19102h = 4;

    public mr1(int i, int i2) {
        this.f19101g = 0;
        this.f19096b = i2;
        this.f19100f = i;
        float[] fArr = new float[i * ((int) Math.ceil(i2 / 4.0f))];
        this.f19099e = fArr;
        this.f19097c = FloatBuffer.wrap(fArr);
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        int i3 = iArr[0];
        this.f19101g = i3;
        GLES20.glBindBuffer(34962, i3);
        m15820e();
        this.f19097c.clear();
        GLES20.glBufferData(34962, this.f19097c.capacity() * 4, this.f19097c, 35048);
        m15820e();
        GLES20.glBindBuffer(34962, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ Boolean m15815j() {
        return Boolean.valueOf(this.f19101g == 0);
    }

    @Override // com.daaw.rc0
    /* renamed from: a */
    public void mo11434a() {
        GLES20.glBindBuffer(34962, 0);
    }

    @Override // com.daaw.rc0
    /* renamed from: b */
    public void mo11433b() {
        this.f19097c.limit(this.f19098d);
        GLES20.glBindBuffer(34962, this.f19101g);
        m15820e();
        GLES20.glBufferSubData(34962, 0, this.f19097c.limit() * 4, this.f19097c);
        m15820e();
    }

    @Override // com.daaw.rc0
    /* renamed from: c */
    public void mo11432c(int i, int i2, int i3) {
        GLES20.glDrawArrays(i, i2, i3);
    }

    /* renamed from: e */
    public final void m15820e() {
    }

    /* renamed from: f */
    public void m15819f() {
        this.f19098d = 0;
    }

    public void finalize() {
        super.finalize();
        this.f19095a.m6959a(new w40() { // from class: com.daaw.lr1
            @Override // com.daaw.w40
            /* renamed from: a */
            public final Object mo3478a() {
                Boolean m15815j;
                m15815j = mr1.this.m15815j();
                return m15815j;
            }
        });
    }

    /* renamed from: g */
    public void m15818g() {
        int i = this.f19101g;
        if (i != 0) {
            GLES20.glDeleteBuffers(1, new int[]{i}, 0);
            m15820e();
            this.f19101g = 0;
        }
    }

    /* renamed from: h */
    public void m15817h() {
    }

    /* renamed from: i */
    public int m15816i() {
        return this.f19096b;
    }

    /* renamed from: k */
    public void m15814k(float f) {
        float[] fArr = this.f19099e;
        int i = this.f19098d;
        fArr[i] = f;
        this.f19098d = i + 1;
    }

    /* renamed from: l */
    public void m15813l(int i) {
        this.f19099e[this.f19098d] = Float.intBitsToFloat(i);
        this.f19098d++;
    }

    /* renamed from: m */
    public int m15812m() {
        return (this.f19099e.length - this.f19098d) * 4;
    }
}
