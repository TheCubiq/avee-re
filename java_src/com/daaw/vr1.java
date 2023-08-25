package com.daaw;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.util.Arrays;
/* loaded from: classes.dex */
public class vr1 extends vk1 {

    /* renamed from: d */
    public C3358vp f30525d;

    public vr1(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this(Bitmap.createBitmap(m6845n(i, i2 * i3), 0, i2, i2, i3, Bitmap.Config.ARGB_8888), i4, i5, i6, z);
    }

    public vr1(int i, int i2, int i3, int i4, boolean z) {
        this.f30525d = new C3358vp();
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        this.f30280a = iArr[0];
        this.f30281b = Math.min(i, 4096);
        this.f30282c = Math.min(i2, 4096);
        m7094c();
        m7091f(i3);
        m7088i(i4);
        m7087j(6408, null);
        if (z && br1.m25906c(i) && br1.m25906c(i2)) {
            GLES20.glGenerateMipmap(m7092e());
        }
    }

    public vr1(Bitmap bitmap, int i, int i2, int i3, boolean z) {
        this(bitmap, i, i2, i3, z, 0, 0, bitmap.getWidth(), bitmap.getHeight());
    }

    public vr1(Bitmap bitmap, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7) {
        this.f30525d = new C3358vp();
        this.f30281b = i6;
        this.f30282c = i7;
        GLES20.glEnable(m7092e());
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        this.f30280a = iArr[0];
        m7094c();
        m7090g(i, i2);
        m7088i(i3);
        if (bitmap != null) {
            Bitmap.Config config = bitmap.getConfig();
            if (config == Bitmap.Config.ARGB_4444 || config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
                m6843p(6408, bitmap);
            } else {
                int[] m6845n = m6845n(-32768, this.f30281b * this.f30282c);
                int i8 = this.f30281b;
                Bitmap createBitmap = Bitmap.createBitmap(m6845n, 0, i8, i8, this.f30282c, Bitmap.Config.ARGB_8888);
                m6843p(6408, createBitmap);
                createBitmap.recycle();
            }
        }
        if (z && br1.m25906c(this.f30281b) && br1.m25906c(this.f30282c)) {
            GLES20.glGenerateMipmap(m7092e());
        }
    }

    /* renamed from: n */
    public static int[] m6845n(int i, int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, i);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Boolean m6844o() {
        return Boolean.valueOf(!m7086k());
    }

    public void finalize() {
        super.finalize();
        this.f30525d.m6959a(new w40() { // from class: com.daaw.ur1
            @Override // com.daaw.w40
            /* renamed from: a */
            public final Object mo3478a() {
                Boolean m6844o;
                m6844o = vr1.this.m6844o();
                return m6844o;
            }
        });
    }

    /* renamed from: m */
    public vr1 m6846m() {
        if (m7086k()) {
            return this;
        }
        mo7096a();
        lz1.m16363c("Texture is not valid");
        return null;
    }

    /* renamed from: p */
    public void m6843p(int i, Bitmap bitmap) {
        m7094c();
        m7089h();
        GLUtils.texImage2D(m7092e(), 0, bitmap, 0);
    }
}
