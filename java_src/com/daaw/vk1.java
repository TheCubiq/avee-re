package com.daaw;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
/* loaded from: classes2.dex */
public class vk1 implements le0 {
    public int a;
    public int b;
    public int c;

    @Override // com.daaw.le0
    public void a() {
        if (k()) {
            GLES20.glDeleteTextures(1, new int[]{this.a}, 0);
            this.a = 0;
        }
    }

    @Override // com.daaw.le0
    public vk1 b() {
        return this;
    }

    public void c() {
        if (!k()) {
            throw new IllegalStateException("trying to bind a texture that was disposed");
        }
        GLES20.glBindTexture(e(), this.a);
    }

    public int d() {
        return this.a;
    }

    public int e() {
        return 3553;
    }

    public void f(int i) {
        g(i, i);
    }

    public void g(int i, int i2) {
        c();
        GLES20.glTexParameteri(e(), 10241, i);
        GLES20.glTexParameteri(e(), 10240, i2);
    }

    @Override // com.daaw.le0
    public int getHeight() {
        return this.c;
    }

    @Override // com.daaw.le0
    public int getWidth() {
        return this.b;
    }

    public void h() {
        GLES20.glPixelStorei(3317, 1);
        GLES20.glPixelStorei(3333, 1);
    }

    public void i(int i) {
        c();
        GLES20.glTexParameteri(e(), 10242, i);
        GLES20.glTexParameteri(e(), 10243, i);
    }

    public void j(int i, ByteBuffer byteBuffer) {
        c();
        h();
        GLES20.glTexImage2D(e(), 0, 6408, this.b, this.c, 0, i, 5121, byteBuffer);
    }

    public boolean k() {
        return this.a != 0;
    }
}
