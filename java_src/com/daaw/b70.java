package com.daaw;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
/* loaded from: classes.dex */
public class b70 {

    /* renamed from: b */
    public ByteBuffer f4477b;

    /* renamed from: c */
    public a70 f4478c;

    /* renamed from: a */
    public final byte[] f4476a = new byte[256];

    /* renamed from: d */
    public int f4479d = 0;

    /* renamed from: a */
    public void m26441a() {
        this.f4477b = null;
        this.f4478c = null;
    }

    /* renamed from: b */
    public final boolean m26440b() {
        return this.f4478c.f2945b != 0;
    }

    /* renamed from: c */
    public a70 m26439c() {
        if (this.f4477b != null) {
            if (m26440b()) {
                return this.f4478c;
            }
            m26432j();
            if (!m26440b()) {
                m26434h();
                a70 a70Var = this.f4478c;
                if (a70Var.f2946c < 0) {
                    a70Var.f2945b = 1;
                }
            }
            return this.f4478c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    /* renamed from: d */
    public final int m26438d() {
        try {
            return this.f4477b.get() & 255;
        } catch (Exception unused) {
            this.f4478c.f2945b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    public final void m26437e() {
        this.f4478c.f2947d.f30909a = m26429m();
        this.f4478c.f2947d.f30910b = m26429m();
        this.f4478c.f2947d.f30911c = m26429m();
        this.f4478c.f2947d.f30912d = m26429m();
        int m26438d = m26438d();
        boolean z = (m26438d & 128) != 0;
        int pow = (int) Math.pow(2.0d, (m26438d & 7) + 1);
        w60 w60Var = this.f4478c.f2947d;
        w60Var.f30913e = (m26438d & 64) != 0;
        if (z) {
            w60Var.f30919k = m26435g(pow);
        } else {
            w60Var.f30919k = null;
        }
        this.f4478c.f2947d.f30918j = this.f4477b.position();
        m26425q();
        if (m26440b()) {
            return;
        }
        a70 a70Var = this.f4478c;
        a70Var.f2946c++;
        a70Var.f2948e.add(a70Var.f2947d);
    }

    /* renamed from: f */
    public final int m26436f() {
        int m26438d = m26438d();
        this.f4479d = m26438d;
        int i = 0;
        if (m26438d > 0) {
            int i2 = 0;
            while (true) {
                try {
                    i2 = this.f4479d;
                    if (i >= i2) {
                        break;
                    }
                    i2 -= i;
                    this.f4477b.get(this.f4476a, i, i2);
                    i += i2;
                } catch (Exception unused) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error Reading Block n: ");
                        sb.append(i);
                        sb.append(" count: ");
                        sb.append(i2);
                        sb.append(" blockSize: ");
                        sb.append(this.f4479d);
                    }
                    this.f4478c.f2945b = 1;
                }
            }
        }
        return i;
    }

    /* renamed from: g */
    public final int[] m26435g(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f4477b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | (-16777216) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException unused) {
            this.f4478c.f2945b = 1;
        }
        return iArr;
    }

    /* renamed from: h */
    public final void m26434h() {
        boolean z = false;
        while (!z && !m26440b()) {
            int m26438d = m26438d();
            if (m26438d == 33) {
                int m26438d2 = m26438d();
                if (m26438d2 != 1) {
                    if (m26438d2 == 249) {
                        this.f4478c.f2947d = new w60();
                        m26433i();
                    } else if (m26438d2 != 254 && m26438d2 == 255) {
                        m26436f();
                        String str = "";
                        for (int i = 0; i < 11; i++) {
                            str = str + ((char) this.f4476a[i]);
                        }
                        if (str.equals("NETSCAPE2.0")) {
                            m26430l();
                        }
                    }
                }
                m26426p();
            } else if (m26438d == 44) {
                a70 a70Var = this.f4478c;
                if (a70Var.f2947d == null) {
                    a70Var.f2947d = new w60();
                }
                m26437e();
            } else if (m26438d != 59) {
                this.f4478c.f2945b = 1;
            } else {
                z = true;
            }
        }
    }

    /* renamed from: i */
    public final void m26433i() {
        m26438d();
        int m26438d = m26438d();
        w60 w60Var = this.f4478c.f2947d;
        int i = (m26438d & 28) >> 2;
        w60Var.f30915g = i;
        if (i == 0) {
            w60Var.f30915g = 1;
        }
        w60Var.f30914f = (m26438d & 1) != 0;
        int m26429m = m26429m();
        if (m26429m < 3) {
            m26429m = 10;
        }
        w60 w60Var2 = this.f4478c.f2947d;
        w60Var2.f30917i = m26429m * 10;
        w60Var2.f30916h = m26438d();
        m26438d();
    }

    /* renamed from: j */
    public final void m26432j() {
        String str = "";
        for (int i = 0; i < 6; i++) {
            str = str + ((char) m26438d());
        }
        if (!str.startsWith("GIF")) {
            this.f4478c.f2945b = 1;
            return;
        }
        m26431k();
        if (!this.f4478c.f2951h || m26440b()) {
            return;
        }
        a70 a70Var = this.f4478c;
        a70Var.f2944a = m26435g(a70Var.f2952i);
        a70 a70Var2 = this.f4478c;
        a70Var2.f2955l = a70Var2.f2944a[a70Var2.f2953j];
    }

    /* renamed from: k */
    public final void m26431k() {
        this.f4478c.f2949f = m26429m();
        this.f4478c.f2950g = m26429m();
        int m26438d = m26438d();
        a70 a70Var = this.f4478c;
        a70Var.f2951h = (m26438d & 128) != 0;
        a70Var.f2952i = 2 << (m26438d & 7);
        a70Var.f2953j = m26438d();
        this.f4478c.f2954k = m26438d();
    }

    /* renamed from: l */
    public final void m26430l() {
        do {
            m26436f();
            byte[] bArr = this.f4476a;
            if (bArr[0] == 1) {
                this.f4478c.f2956m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f4479d <= 0) {
                return;
            }
        } while (!m26440b());
    }

    /* renamed from: m */
    public final int m26429m() {
        return this.f4477b.getShort();
    }

    /* renamed from: n */
    public final void m26428n() {
        this.f4477b = null;
        Arrays.fill(this.f4476a, (byte) 0);
        this.f4478c = new a70();
        this.f4479d = 0;
    }

    /* renamed from: o */
    public b70 m26427o(byte[] bArr) {
        m26428n();
        if (bArr != null) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            this.f4477b = wrap;
            wrap.rewind();
            this.f4477b.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f4477b = null;
            this.f4478c.f2945b = 2;
        }
        return this;
    }

    /* renamed from: p */
    public final void m26426p() {
        int m26438d;
        do {
            m26438d = m26438d();
            ByteBuffer byteBuffer = this.f4477b;
            byteBuffer.position(byteBuffer.position() + m26438d);
        } while (m26438d > 0);
    }

    /* renamed from: q */
    public final void m26425q() {
        m26438d();
        m26426p();
    }
}
