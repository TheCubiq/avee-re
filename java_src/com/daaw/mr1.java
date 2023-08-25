package com.daaw;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
/* loaded from: classes.dex */
public class mr1 implements rc0 {
    public int b;
    public FloatBuffer c;
    public float[] e;
    public int f;
    public int g;
    public vp a = new vp();
    public int d = 0;
    public final int h = 4;

    public mr1(int i, int i2) {
        this.g = 0;
        this.b = i2;
        this.f = i;
        float[] fArr = new float[i * ((int) Math.ceil(i2 / 4.0f))];
        this.e = fArr;
        this.c = FloatBuffer.wrap(fArr);
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        int i3 = iArr[0];
        this.g = i3;
        GLES20.glBindBuffer(34962, i3);
        e();
        this.c.clear();
        GLES20.glBufferData(34962, this.c.capacity() * 4, this.c, 35048);
        e();
        GLES20.glBindBuffer(34962, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean j() {
        return Boolean.valueOf(this.g == 0);
    }

    @Override // com.daaw.rc0
    public void a() {
        GLES20.glBindBuffer(34962, 0);
    }

    @Override // com.daaw.rc0
    public void b() {
        this.c.limit(this.d);
        GLES20.glBindBuffer(34962, this.g);
        e();
        GLES20.glBufferSubData(34962, 0, this.c.limit() * 4, this.c);
        e();
    }

    @Override // com.daaw.rc0
    public void c(int i, int i2, int i3) {
        GLES20.glDrawArrays(i, i2, i3);
    }

    public final void e() {
    }

    public void f() {
        this.d = 0;
    }

    public void finalize() {
        super.finalize();
        this.a.a(new w40() { // from class: com.daaw.lr1
            @Override // com.daaw.w40
            public final Object a() {
                Boolean j;
                j = mr1.this.j();
                return j;
            }
        });
    }

    public void g() {
        int i = this.g;
        if (i != 0) {
            GLES20.glDeleteBuffers(1, new int[]{i}, 0);
            e();
            this.g = 0;
        }
    }

    public void h() {
    }

    public int i() {
        return this.b;
    }

    public void k(float f) {
        float[] fArr = this.e;
        int i = this.d;
        fArr[i] = f;
        this.d = i + 1;
    }

    public void l(int i) {
        this.e[this.d] = Float.intBitsToFloat(i);
        this.d++;
    }

    public int m() {
        return (this.e.length - this.d) * 4;
    }
}
