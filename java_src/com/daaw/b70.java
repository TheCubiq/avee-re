package com.daaw;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
/* loaded from: classes.dex */
public class b70 {
    public ByteBuffer b;
    public a70 c;
    public final byte[] a = new byte[256];
    public int d = 0;

    public void a() {
        this.b = null;
        this.c = null;
    }

    public final boolean b() {
        return this.c.b != 0;
    }

    public a70 c() {
        if (this.b != null) {
            if (b()) {
                return this.c;
            }
            j();
            if (!b()) {
                h();
                a70 a70Var = this.c;
                if (a70Var.c < 0) {
                    a70Var.b = 1;
                }
            }
            return this.c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public final int d() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    public final void e() {
        this.c.d.a = m();
        this.c.d.b = m();
        this.c.d.c = m();
        this.c.d.d = m();
        int d = d();
        boolean z = (d & 128) != 0;
        int pow = (int) Math.pow(2.0d, (d & 7) + 1);
        w60 w60Var = this.c.d;
        w60Var.e = (d & 64) != 0;
        if (z) {
            w60Var.k = g(pow);
        } else {
            w60Var.k = null;
        }
        this.c.d.j = this.b.position();
        q();
        if (b()) {
            return;
        }
        a70 a70Var = this.c;
        a70Var.c++;
        a70Var.e.add(a70Var.d);
    }

    public final int f() {
        int d = d();
        this.d = d;
        int i = 0;
        if (d > 0) {
            int i2 = 0;
            while (true) {
                try {
                    i2 = this.d;
                    if (i >= i2) {
                        break;
                    }
                    i2 -= i;
                    this.b.get(this.a, i, i2);
                    i += i2;
                } catch (Exception unused) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error Reading Block n: ");
                        sb.append(i);
                        sb.append(" count: ");
                        sb.append(i2);
                        sb.append(" blockSize: ");
                        sb.append(this.d);
                    }
                    this.c.b = 1;
                }
            }
        }
        return i;
    }

    public final int[] g(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
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
            this.c.b = 1;
        }
        return iArr;
    }

    public final void h() {
        boolean z = false;
        while (!z && !b()) {
            int d = d();
            if (d == 33) {
                int d2 = d();
                if (d2 != 1) {
                    if (d2 == 249) {
                        this.c.d = new w60();
                        i();
                    } else if (d2 != 254 && d2 == 255) {
                        f();
                        String str = "";
                        for (int i = 0; i < 11; i++) {
                            str = str + ((char) this.a[i]);
                        }
                        if (str.equals("NETSCAPE2.0")) {
                            l();
                        }
                    }
                }
                p();
            } else if (d == 44) {
                a70 a70Var = this.c;
                if (a70Var.d == null) {
                    a70Var.d = new w60();
                }
                e();
            } else if (d != 59) {
                this.c.b = 1;
            } else {
                z = true;
            }
        }
    }

    public final void i() {
        d();
        int d = d();
        w60 w60Var = this.c.d;
        int i = (d & 28) >> 2;
        w60Var.g = i;
        if (i == 0) {
            w60Var.g = 1;
        }
        w60Var.f = (d & 1) != 0;
        int m = m();
        if (m < 3) {
            m = 10;
        }
        w60 w60Var2 = this.c.d;
        w60Var2.i = m * 10;
        w60Var2.h = d();
        d();
    }

    public final void j() {
        String str = "";
        for (int i = 0; i < 6; i++) {
            str = str + ((char) d());
        }
        if (!str.startsWith("GIF")) {
            this.c.b = 1;
            return;
        }
        k();
        if (!this.c.h || b()) {
            return;
        }
        a70 a70Var = this.c;
        a70Var.a = g(a70Var.i);
        a70 a70Var2 = this.c;
        a70Var2.l = a70Var2.a[a70Var2.j];
    }

    public final void k() {
        this.c.f = m();
        this.c.g = m();
        int d = d();
        a70 a70Var = this.c;
        a70Var.h = (d & 128) != 0;
        a70Var.i = 2 << (d & 7);
        a70Var.j = d();
        this.c.k = d();
    }

    public final void l() {
        do {
            f();
            byte[] bArr = this.a;
            if (bArr[0] == 1) {
                this.c.m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.d <= 0) {
                return;
            }
        } while (!b());
    }

    public final int m() {
        return this.b.getShort();
    }

    public final void n() {
        this.b = null;
        Arrays.fill(this.a, (byte) 0);
        this.c = new a70();
        this.d = 0;
    }

    public b70 o(byte[] bArr) {
        n();
        if (bArr != null) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            this.b = wrap;
            wrap.rewind();
            this.b.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.b = null;
            this.c.b = 2;
        }
        return this;
    }

    public final void p() {
        int d;
        do {
            d = d();
            ByteBuffer byteBuffer = this.b;
            byteBuffer.position(byteBuffer.position() + d);
        } while (d > 0);
    }

    public final void q() {
        d();
        p();
    }
}
