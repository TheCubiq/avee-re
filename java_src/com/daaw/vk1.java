package com.daaw;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
/* loaded from: classes2.dex */
public class vk1 implements le0 {

    /* renamed from: a */
    public int f30280a;

    /* renamed from: b */
    public int f30281b;

    /* renamed from: c */
    public int f30282c;

    @Override // com.daaw.le0
    /* renamed from: a */
    public void mo7096a() {
        if (m7086k()) {
            GLES20.glDeleteTextures(1, new int[]{this.f30280a}, 0);
            this.f30280a = 0;
        }
    }

    @Override // com.daaw.le0
    /* renamed from: b */
    public vk1 mo7095b() {
        return this;
    }

    /* renamed from: c */
    public void m7094c() {
        if (!m7086k()) {
            throw new IllegalStateException("trying to bind a texture that was disposed");
        }
        GLES20.glBindTexture(m7092e(), this.f30280a);
    }

    /* renamed from: d */
    public int m7093d() {
        return this.f30280a;
    }

    /* renamed from: e */
    public int m7092e() {
        return 3553;
    }

    /* renamed from: f */
    public void m7091f(int i) {
        m7090g(i, i);
    }

    /* renamed from: g */
    public void m7090g(int i, int i2) {
        m7094c();
        GLES20.glTexParameteri(m7092e(), 10241, i);
        GLES20.glTexParameteri(m7092e(), 10240, i2);
    }

    @Override // com.daaw.le0
    public int getHeight() {
        return this.f30282c;
    }

    @Override // com.daaw.le0
    public int getWidth() {
        return this.f30281b;
    }

    /* renamed from: h */
    public void m7089h() {
        GLES20.glPixelStorei(3317, 1);
        GLES20.glPixelStorei(3333, 1);
    }

    /* renamed from: i */
    public void m7088i(int i) {
        m7094c();
        GLES20.glTexParameteri(m7092e(), 10242, i);
        GLES20.glTexParameteri(m7092e(), 10243, i);
    }

    /* renamed from: j */
    public void m7087j(int i, ByteBuffer byteBuffer) {
        m7094c();
        m7089h();
        GLES20.glTexImage2D(m7092e(), 0, 6408, this.f30281b, this.f30282c, 0, i, 5121, byteBuffer);
    }

    /* renamed from: k */
    public boolean m7086k() {
        return this.f30280a != 0;
    }
}
