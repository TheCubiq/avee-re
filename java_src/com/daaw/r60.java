package com.daaw;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
/* loaded from: classes.dex */
public class r60 {

    /* renamed from: q */
    public static final String f24873q = "r60";

    /* renamed from: r */
    public static final Bitmap.Config f24874r = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public int[] f24875a;

    /* renamed from: c */
    public ByteBuffer f24877c;

    /* renamed from: e */
    public short[] f24879e;

    /* renamed from: f */
    public byte[] f24880f;

    /* renamed from: g */
    public byte[] f24881g;

    /* renamed from: h */
    public byte[] f24882h;

    /* renamed from: i */
    public int[] f24883i;

    /* renamed from: j */
    public int f24884j;

    /* renamed from: k */
    public byte[] f24885k;

    /* renamed from: m */
    public InterfaceC2829a f24887m;

    /* renamed from: n */
    public Bitmap f24888n;

    /* renamed from: o */
    public boolean f24889o;

    /* renamed from: p */
    public int f24890p;

    /* renamed from: b */
    public final int[] f24876b = new int[256];

    /* renamed from: d */
    public final byte[] f24878d = new byte[256];

    /* renamed from: l */
    public a70 f24886l = new a70();

    /* renamed from: com.daaw.r60$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2829a {
        /* renamed from: a */
        Bitmap mo11712a(int i, int i2, Bitmap.Config config);

        /* renamed from: b */
        void mo11711b(Bitmap bitmap);
    }

    public r60(InterfaceC2829a interfaceC2829a) {
        this.f24887m = interfaceC2829a;
    }

    @TargetApi(12)
    /* renamed from: n */
    public static void m11715n(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
    }

    /* renamed from: a */
    public void m11728a() {
        this.f24884j = (this.f24884j + 1) % this.f24886l.f2946c;
    }

    /* renamed from: b */
    public void m11727b() {
        this.f24886l = null;
        this.f24885k = null;
        this.f24882h = null;
        this.f24883i = null;
        Bitmap bitmap = this.f24888n;
        if (bitmap != null) {
            this.f24887m.mo11711b(bitmap);
        }
        this.f24888n = null;
        this.f24877c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0137 A[LOOP:5: B:59:0x0135->B:60:0x0137, LOOP_END] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m11726c(w60 w60Var) {
        int i;
        int i2;
        int i3;
        short s;
        if (w60Var != null) {
            this.f24877c.position(w60Var.f30918j);
        }
        if (w60Var == null) {
            a70 a70Var = this.f24886l;
            i = a70Var.f2949f;
            i2 = a70Var.f2950g;
        } else {
            i = w60Var.f30911c;
            i2 = w60Var.f30912d;
        }
        int i4 = i * i2;
        byte[] bArr = this.f24882h;
        if (bArr == null || bArr.length < i4) {
            this.f24882h = new byte[i4];
        }
        if (this.f24879e == null) {
            this.f24879e = new short[4096];
        }
        if (this.f24880f == null) {
            this.f24880f = new byte[4096];
        }
        if (this.f24881g == null) {
            this.f24881g = new byte[4097];
        }
        int m11718k = m11718k();
        int i5 = 1;
        int i6 = 1 << m11718k;
        int i7 = i6 + 1;
        int i8 = i6 + 2;
        int i9 = m11718k + 1;
        int i10 = (1 << i9) - 1;
        for (int i11 = 0; i11 < i6; i11++) {
            this.f24879e[i11] = 0;
            this.f24880f[i11] = (byte) i11;
        }
        int i12 = -1;
        int i13 = i9;
        int i14 = i8;
        int i15 = i10;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = -1;
        int i23 = 0;
        int i24 = 0;
        while (true) {
            if (i16 >= i4) {
                break;
            }
            int i25 = 3;
            if (i17 == 0) {
                i17 = m11717l();
                if (i17 <= 0) {
                    this.f24890p = 3;
                    break;
                }
                i18 = 0;
            }
            i20 += (this.f24878d[i18] & 255) << i19;
            i19 += 8;
            i18 += i5;
            i17 += i12;
            int i26 = i14;
            int i27 = i13;
            int i28 = i22;
            int i29 = i23;
            while (i19 >= i27) {
                int i30 = i20 & i15;
                i20 >>= i27;
                i19 -= i27;
                if (i30 != i6) {
                    if (i30 > i26) {
                        this.f24890p = i25;
                    } else if (i30 != i7) {
                        int i31 = i9;
                        int i32 = i28;
                        if (i32 == -1) {
                            this.f24881g[i24] = this.f24880f[i30];
                            i28 = i30;
                            i29 = i28;
                            i9 = i31;
                            i24++;
                            i25 = 3;
                            i12 = -1;
                        } else {
                            if (i30 >= i26) {
                                i3 = i7;
                                this.f24881g[i24] = (byte) i29;
                                s = i32;
                                i24++;
                            } else {
                                i3 = i7;
                                s = i30;
                            }
                            while (s >= i6) {
                                this.f24881g[i24] = this.f24880f[s];
                                s = this.f24879e[s];
                                i24++;
                                i6 = i6;
                            }
                            int i33 = i6;
                            byte[] bArr2 = this.f24880f;
                            int i34 = bArr2[s] & 255;
                            int i35 = i24 + 1;
                            int i36 = i8;
                            byte b = (byte) i34;
                            this.f24881g[i24] = b;
                            if (i26 < 4096) {
                                this.f24879e[i26] = (short) i32;
                                bArr2[i26] = b;
                                i26++;
                                if ((i26 & i15) == 0) {
                                    if (i26 < 4096) {
                                        i27++;
                                        i15 += i26;
                                    }
                                    i24 = i35;
                                    while (i24 > 0) {
                                        i24--;
                                        this.f24882h[i21] = this.f24881g[i24];
                                        i16++;
                                        i21++;
                                    }
                                    i28 = i30;
                                    i6 = i33;
                                    i7 = i3;
                                    i8 = i36;
                                    i25 = 3;
                                    i12 = -1;
                                    i29 = i34;
                                    i9 = i31;
                                }
                            }
                            i24 = i35;
                            while (i24 > 0) {
                            }
                            i28 = i30;
                            i6 = i33;
                            i7 = i3;
                            i8 = i36;
                            i25 = 3;
                            i12 = -1;
                            i29 = i34;
                            i9 = i31;
                        }
                    }
                    i14 = i26;
                    i13 = i27;
                    i22 = i28;
                    i23 = i29;
                    i5 = 1;
                    i12 = -1;
                    break;
                }
                i27 = i9;
                i26 = i8;
                i15 = i10;
                i12 = -1;
                i28 = -1;
            }
            i14 = i26;
            i13 = i27;
            i23 = i29;
            i22 = i28;
            i7 = i7;
            i5 = 1;
        }
        for (int i37 = i21; i37 < i4; i37++) {
            this.f24882h[i37] = 0;
        }
    }

    /* renamed from: d */
    public int m11725d() {
        return this.f24884j;
    }

    /* renamed from: e */
    public int m11724e(int i) {
        if (i >= 0) {
            a70 a70Var = this.f24886l;
            if (i < a70Var.f2946c) {
                return a70Var.f2948e.get(i).f30917i;
            }
        }
        return -1;
    }

    /* renamed from: f */
    public int m11723f() {
        return this.f24886l.f2946c;
    }

    /* renamed from: g */
    public final Bitmap m11722g() {
        InterfaceC2829a interfaceC2829a = this.f24887m;
        a70 a70Var = this.f24886l;
        int i = a70Var.f2949f;
        int i2 = a70Var.f2950g;
        Bitmap.Config config = f24874r;
        Bitmap mo11712a = interfaceC2829a.mo11712a(i, i2, config);
        if (mo11712a == null) {
            a70 a70Var2 = this.f24886l;
            mo11712a = Bitmap.createBitmap(a70Var2.f2949f, a70Var2.f2950g, config);
        }
        m11715n(mo11712a);
        return mo11712a;
    }

    /* renamed from: h */
    public int m11721h() {
        int i;
        if (this.f24886l.f2946c <= 0 || (i = this.f24884j) < 0) {
            return -1;
        }
        return m11724e(i);
    }

    /* renamed from: i */
    public synchronized Bitmap m11720i() {
        if (this.f24886l.f2946c <= 0 || this.f24884j < 0) {
            if (Log.isLoggable(f24873q, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("unable to decode frame, frameCount=");
                sb.append(this.f24886l.f2946c);
                sb.append(" framePointer=");
                sb.append(this.f24884j);
            }
            this.f24890p = 1;
        }
        int i = this.f24890p;
        if (i != 1 && i != 2) {
            this.f24890p = 0;
            w60 w60Var = this.f24886l.f2948e.get(this.f24884j);
            int i2 = this.f24884j - 1;
            w60 w60Var2 = i2 >= 0 ? this.f24886l.f2948e.get(i2) : null;
            int[] iArr = w60Var.f30919k;
            if (iArr == null) {
                iArr = this.f24886l.f2944a;
            }
            this.f24875a = iArr;
            if (iArr == null) {
                Log.isLoggable(f24873q, 3);
                this.f24890p = 1;
                return null;
            }
            if (w60Var.f30914f) {
                System.arraycopy(iArr, 0, this.f24876b, 0, iArr.length);
                int[] iArr2 = this.f24876b;
                this.f24875a = iArr2;
                iArr2[w60Var.f30916h] = 0;
            }
            return m11713p(w60Var, w60Var2);
        }
        if (Log.isLoggable(f24873q, 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to decode frame, status=");
            sb2.append(this.f24890p);
        }
        return null;
    }

    /* renamed from: j */
    public int m11719j() {
        int i = this.f24886l.f2956m;
        if (i == -1) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        return i + 1;
    }

    /* renamed from: k */
    public final int m11718k() {
        try {
            return this.f24877c.get() & 255;
        } catch (Exception unused) {
            this.f24890p = 1;
            return 0;
        }
    }

    /* renamed from: l */
    public final int m11717l() {
        int m11718k = m11718k();
        int i = 0;
        if (m11718k > 0) {
            while (i < m11718k) {
                int i2 = m11718k - i;
                try {
                    this.f24877c.get(this.f24878d, i, i2);
                    i += i2;
                } catch (Exception unused) {
                    this.f24890p = 1;
                }
            }
        }
        return i;
    }

    /* renamed from: m */
    public void m11716m() {
        this.f24884j = -1;
    }

    /* renamed from: o */
    public void m11714o(a70 a70Var, byte[] bArr) {
        this.f24886l = a70Var;
        this.f24885k = bArr;
        this.f24890p = 0;
        this.f24884j = -1;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.f24877c = wrap;
        wrap.rewind();
        this.f24877c.order(ByteOrder.LITTLE_ENDIAN);
        this.f24889o = false;
        Iterator<w60> it = a70Var.f2948e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().f30915g == 3) {
                this.f24889o = true;
                break;
            }
        }
        int i = a70Var.f2949f;
        int i2 = a70Var.f2950g;
        this.f24882h = new byte[i * i2];
        this.f24883i = new int[i * i2];
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r4.f2953j == r17.f30916h) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf A[EDGE_INSN: B:70:0x00bf->B:57:0x00bf ?: BREAK  , SYNTHETIC] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap m11713p(w60 w60Var, w60 w60Var2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Bitmap bitmap;
        int i7;
        int i8;
        int i9;
        a70 a70Var = this.f24886l;
        int i10 = a70Var.f2949f;
        int i11 = a70Var.f2950g;
        int[] iArr = this.f24883i;
        int i12 = 0;
        if (w60Var2 == null) {
            Arrays.fill(iArr, 0);
        }
        int i13 = 3;
        if (w60Var2 != null && (i6 = w60Var2.f30915g) > 0) {
            if (i6 == 2) {
                if (!w60Var.f30914f) {
                    a70 a70Var2 = this.f24886l;
                    i7 = a70Var2.f2955l;
                    if (w60Var.f30919k != null) {
                    }
                    i8 = (w60Var2.f30910b * i10) + w60Var2.f30909a;
                    i9 = (w60Var2.f30912d * i10) + i8;
                    while (i8 < i9) {
                        int i14 = w60Var2.f30911c + i8;
                        for (int i15 = i8; i15 < i14; i15++) {
                            iArr[i15] = i7;
                        }
                        i8 += i10;
                    }
                }
                i7 = 0;
                i8 = (w60Var2.f30910b * i10) + w60Var2.f30909a;
                i9 = (w60Var2.f30912d * i10) + i8;
                while (i8 < i9) {
                }
            } else if (i6 == 3 && (bitmap = this.f24888n) != null) {
                i = 2;
                bitmap.getPixels(iArr, 0, i10, 0, 0, i10, i11);
                m11726c(w60Var);
                int i16 = 8;
                i2 = 0;
                int i17 = 1;
                while (true) {
                    i3 = w60Var.f30912d;
                    if (i12 < i3) {
                        break;
                    }
                    if (w60Var.f30913e) {
                        if (i2 >= i3) {
                            i17++;
                            if (i17 == i) {
                                i2 = 4;
                            } else if (i17 == i13) {
                                i16 = 4;
                                i2 = 2;
                            } else if (i17 == 4) {
                                i16 = 2;
                                i2 = 1;
                            }
                        }
                        i5 = i2 + i16;
                    } else {
                        i5 = i2;
                        i2 = i12;
                    }
                    int i18 = i2 + w60Var.f30910b;
                    a70 a70Var3 = this.f24886l;
                    if (i18 < a70Var3.f2950g) {
                        int i19 = a70Var3.f2949f;
                        int i20 = i18 * i19;
                        int i21 = w60Var.f30909a + i20;
                        int i22 = w60Var.f30911c;
                        int i23 = i21 + i22;
                        if (i20 + i19 < i23) {
                            i23 = i20 + i19;
                        }
                        int i24 = i22 * i12;
                        while (i21 < i23) {
                            int i25 = i24 + 1;
                            int i26 = this.f24875a[this.f24882h[i24] & 255];
                            if (i26 != 0) {
                                iArr[i21] = i26;
                            }
                            i21++;
                            i24 = i25;
                        }
                    }
                    i12++;
                    i2 = i5;
                    i = 2;
                    i13 = 3;
                }
                if (this.f24889o && ((i4 = w60Var.f30915g) == 0 || i4 == 1)) {
                    if (this.f24888n == null) {
                        this.f24888n = m11722g();
                    }
                    this.f24888n.setPixels(iArr, 0, i10, 0, 0, i10, i11);
                }
                Bitmap m11722g = m11722g();
                m11722g.setPixels(iArr, 0, i10, 0, 0, i10, i11);
                return m11722g;
            }
        }
        i = 2;
        m11726c(w60Var);
        int i162 = 8;
        i2 = 0;
        int i172 = 1;
        while (true) {
            i3 = w60Var.f30912d;
            if (i12 < i3) {
            }
            i12++;
            i2 = i5;
            i = 2;
            i13 = 3;
        }
        if (this.f24889o) {
            if (this.f24888n == null) {
            }
            this.f24888n.setPixels(iArr, 0, i10, 0, 0, i10, i11);
        }
        Bitmap m11722g2 = m11722g();
        m11722g2.setPixels(iArr, 0, i10, 0, 0, i10, i11);
        return m11722g2;
    }
}
