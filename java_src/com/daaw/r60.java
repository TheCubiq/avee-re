package com.daaw;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
/* loaded from: classes.dex */
public class r60 {
    public static final String q = "r60";
    public static final Bitmap.Config r = Bitmap.Config.ARGB_8888;
    public int[] a;
    public ByteBuffer c;
    public short[] e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public int[] i;
    public int j;
    public byte[] k;
    public a m;
    public Bitmap n;
    public boolean o;
    public int p;
    public final int[] b = new int[256];
    public final byte[] d = new byte[256];
    public a70 l = new a70();

    /* loaded from: classes.dex */
    public interface a {
        Bitmap a(int i, int i2, Bitmap.Config config);

        void b(Bitmap bitmap);
    }

    public r60(a aVar) {
        this.m = aVar;
    }

    @TargetApi(12)
    public static void n(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
    }

    public void a() {
        this.j = (this.j + 1) % this.l.c;
    }

    public void b() {
        this.l = null;
        this.k = null;
        this.h = null;
        this.i = null;
        Bitmap bitmap = this.n;
        if (bitmap != null) {
            this.m.b(bitmap);
        }
        this.n = null;
        this.c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0137 A[LOOP:5: B:59:0x0135->B:60:0x0137, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.daaw.w60 r28) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.r60.c(com.daaw.w60):void");
    }

    public int d() {
        return this.j;
    }

    public int e(int i) {
        if (i >= 0) {
            a70 a70Var = this.l;
            if (i < a70Var.c) {
                return a70Var.e.get(i).i;
            }
        }
        return -1;
    }

    public int f() {
        return this.l.c;
    }

    public final Bitmap g() {
        a aVar = this.m;
        a70 a70Var = this.l;
        int i = a70Var.f;
        int i2 = a70Var.g;
        Bitmap.Config config = r;
        Bitmap a2 = aVar.a(i, i2, config);
        if (a2 == null) {
            a70 a70Var2 = this.l;
            a2 = Bitmap.createBitmap(a70Var2.f, a70Var2.g, config);
        }
        n(a2);
        return a2;
    }

    public int h() {
        int i;
        if (this.l.c <= 0 || (i = this.j) < 0) {
            return -1;
        }
        return e(i);
    }

    public synchronized Bitmap i() {
        if (this.l.c <= 0 || this.j < 0) {
            if (Log.isLoggable(q, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("unable to decode frame, frameCount=");
                sb.append(this.l.c);
                sb.append(" framePointer=");
                sb.append(this.j);
            }
            this.p = 1;
        }
        int i = this.p;
        if (i != 1 && i != 2) {
            this.p = 0;
            w60 w60Var = this.l.e.get(this.j);
            int i2 = this.j - 1;
            w60 w60Var2 = i2 >= 0 ? this.l.e.get(i2) : null;
            int[] iArr = w60Var.k;
            if (iArr == null) {
                iArr = this.l.a;
            }
            this.a = iArr;
            if (iArr == null) {
                Log.isLoggable(q, 3);
                this.p = 1;
                return null;
            }
            if (w60Var.f) {
                System.arraycopy(iArr, 0, this.b, 0, iArr.length);
                int[] iArr2 = this.b;
                this.a = iArr2;
                iArr2[w60Var.h] = 0;
            }
            return p(w60Var, w60Var2);
        }
        if (Log.isLoggable(q, 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to decode frame, status=");
            sb2.append(this.p);
        }
        return null;
    }

    public int j() {
        int i = this.l.m;
        if (i == -1) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        return i + 1;
    }

    public final int k() {
        try {
            return this.c.get() & 255;
        } catch (Exception unused) {
            this.p = 1;
            return 0;
        }
    }

    public final int l() {
        int k = k();
        int i = 0;
        if (k > 0) {
            while (i < k) {
                int i2 = k - i;
                try {
                    this.c.get(this.d, i, i2);
                    i += i2;
                } catch (Exception unused) {
                    this.p = 1;
                }
            }
        }
        return i;
    }

    public void m() {
        this.j = -1;
    }

    public void o(a70 a70Var, byte[] bArr) {
        this.l = a70Var;
        this.k = bArr;
        this.p = 0;
        this.j = -1;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.c = wrap;
        wrap.rewind();
        this.c.order(ByteOrder.LITTLE_ENDIAN);
        this.o = false;
        Iterator<w60> it = a70Var.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g == 3) {
                this.o = true;
                break;
            }
        }
        int i = a70Var.f;
        int i2 = a70Var.g;
        this.h = new byte[i * i2];
        this.i = new int[i * i2];
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r4.j == r17.h) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf A[EDGE_INSN: B:70:0x00bf->B:57:0x00bf ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap p(com.daaw.w60 r17, com.daaw.w60 r18) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.r60.p(com.daaw.w60, com.daaw.w60):android.graphics.Bitmap");
    }
}
