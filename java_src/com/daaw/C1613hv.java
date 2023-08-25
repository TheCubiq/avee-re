package com.daaw;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.daaw.hv */
/* loaded from: classes.dex */
public final class C1613hv {

    /* renamed from: h */
    public static final byte[] f12958h = {0, 7, 8, 15};

    /* renamed from: i */
    public static final byte[] f12959i = {0, 119, -120, -1};

    /* renamed from: j */
    public static final byte[] f12960j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a */
    public final Paint f12961a;

    /* renamed from: b */
    public final Paint f12962b;

    /* renamed from: c */
    public final Canvas f12963c;

    /* renamed from: d */
    public final C1615b f12964d;

    /* renamed from: e */
    public final C1614a f12965e;

    /* renamed from: f */
    public final C1621h f12966f;

    /* renamed from: g */
    public Bitmap f12967g;

    /* renamed from: com.daaw.hv$a */
    /* loaded from: classes.dex */
    public static final class C1614a {

        /* renamed from: a */
        public final int f12968a;

        /* renamed from: b */
        public final int[] f12969b;

        /* renamed from: c */
        public final int[] f12970c;

        /* renamed from: d */
        public final int[] f12971d;

        public C1614a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f12968a = i;
            this.f12969b = iArr;
            this.f12970c = iArr2;
            this.f12971d = iArr3;
        }
    }

    /* renamed from: com.daaw.hv$b */
    /* loaded from: classes.dex */
    public static final class C1615b {

        /* renamed from: a */
        public final int f12972a;

        /* renamed from: b */
        public final int f12973b;

        /* renamed from: c */
        public final int f12974c;

        /* renamed from: d */
        public final int f12975d;

        /* renamed from: e */
        public final int f12976e;

        /* renamed from: f */
        public final int f12977f;

        public C1615b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f12972a = i;
            this.f12973b = i2;
            this.f12974c = i3;
            this.f12975d = i4;
            this.f12976e = i5;
            this.f12977f = i6;
        }
    }

    /* renamed from: com.daaw.hv$c */
    /* loaded from: classes.dex */
    public static final class C1616c {

        /* renamed from: a */
        public final int f12978a;

        /* renamed from: b */
        public final boolean f12979b;

        /* renamed from: c */
        public final byte[] f12980c;

        /* renamed from: d */
        public final byte[] f12981d;

        public C1616c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f12978a = i;
            this.f12979b = z;
            this.f12980c = bArr;
            this.f12981d = bArr2;
        }
    }

    /* renamed from: com.daaw.hv$d */
    /* loaded from: classes.dex */
    public static final class C1617d {

        /* renamed from: a */
        public final int f12982a;

        /* renamed from: b */
        public final int f12983b;

        /* renamed from: c */
        public final int f12984c;

        /* renamed from: d */
        public final SparseArray<C1618e> f12985d;

        public C1617d(int i, int i2, int i3, SparseArray<C1618e> sparseArray) {
            this.f12982a = i;
            this.f12983b = i2;
            this.f12984c = i3;
            this.f12985d = sparseArray;
        }
    }

    /* renamed from: com.daaw.hv$e */
    /* loaded from: classes.dex */
    public static final class C1618e {

        /* renamed from: a */
        public final int f12986a;

        /* renamed from: b */
        public final int f12987b;

        public C1618e(int i, int i2) {
            this.f12986a = i;
            this.f12987b = i2;
        }
    }

    /* renamed from: com.daaw.hv$f */
    /* loaded from: classes.dex */
    public static final class C1619f {

        /* renamed from: a */
        public final int f12988a;

        /* renamed from: b */
        public final boolean f12989b;

        /* renamed from: c */
        public final int f12990c;

        /* renamed from: d */
        public final int f12991d;

        /* renamed from: e */
        public final int f12992e;

        /* renamed from: f */
        public final int f12993f;

        /* renamed from: g */
        public final int f12994g;

        /* renamed from: h */
        public final int f12995h;

        /* renamed from: i */
        public final int f12996i;

        /* renamed from: j */
        public final int f12997j;

        /* renamed from: k */
        public final SparseArray<C1620g> f12998k;

        public C1619f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<C1620g> sparseArray) {
            this.f12988a = i;
            this.f12989b = z;
            this.f12990c = i2;
            this.f12991d = i3;
            this.f12992e = i4;
            this.f12993f = i5;
            this.f12994g = i6;
            this.f12995h = i7;
            this.f12996i = i8;
            this.f12997j = i9;
            this.f12998k = sparseArray;
        }

        /* renamed from: a */
        public void m20392a(C1619f c1619f) {
            if (c1619f == null) {
                return;
            }
            SparseArray<C1620g> sparseArray = c1619f.f12998k;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.f12998k.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }

    /* renamed from: com.daaw.hv$g */
    /* loaded from: classes.dex */
    public static final class C1620g {

        /* renamed from: a */
        public final int f12999a;

        /* renamed from: b */
        public final int f13000b;

        /* renamed from: c */
        public final int f13001c;

        /* renamed from: d */
        public final int f13002d;

        /* renamed from: e */
        public final int f13003e;

        /* renamed from: f */
        public final int f13004f;

        public C1620g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f12999a = i;
            this.f13000b = i2;
            this.f13001c = i3;
            this.f13002d = i4;
            this.f13003e = i5;
            this.f13004f = i6;
        }
    }

    /* renamed from: com.daaw.hv$h */
    /* loaded from: classes.dex */
    public static final class C1621h {

        /* renamed from: a */
        public final int f13005a;

        /* renamed from: b */
        public final int f13006b;

        /* renamed from: c */
        public final SparseArray<C1619f> f13007c = new SparseArray<>();

        /* renamed from: d */
        public final SparseArray<C1614a> f13008d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<C1616c> f13009e = new SparseArray<>();

        /* renamed from: f */
        public final SparseArray<C1614a> f13010f = new SparseArray<>();

        /* renamed from: g */
        public final SparseArray<C1616c> f13011g = new SparseArray<>();

        /* renamed from: h */
        public C1615b f13012h;

        /* renamed from: i */
        public C1617d f13013i;

        public C1621h(int i, int i2) {
            this.f13005a = i;
            this.f13006b = i2;
        }

        /* renamed from: a */
        public void m20391a() {
            this.f13007c.clear();
            this.f13008d.clear();
            this.f13009e.clear();
            this.f13010f.clear();
            this.f13011g.clear();
            this.f13012h = null;
            this.f13013i = null;
        }
    }

    public C1613hv(int i, int i2) {
        Paint paint = new Paint();
        this.f12961a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f12962b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f12963c = new Canvas();
        this.f12964d = new C1615b(719, 575, 0, 719, 0, 575);
        this.f12965e = new C1614a(0, m20408c(), m20407d(), m20406e());
        this.f12966f = new C1621h(i, i2);
    }

    /* renamed from: a */
    public static byte[] m20410a(int i, int i2, qv0 qv0Var) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) qv0Var.m12125h(i2);
        }
        return bArr;
    }

    /* renamed from: c */
    public static int[] m20408c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* renamed from: d */
    public static int[] m20407d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m20405f(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = m20405f(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* renamed from: e */
    public static int[] m20406e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = m20405f(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = m20405f(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = m20405f(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = m20405f(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = m20405f(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* renamed from: f */
    public static int m20405f(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b A[LOOP:0: B:3:0x0009->B:33:0x007b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a A[SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m20404g(qv0 qv0Var, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        boolean z;
        int i3;
        int m12125h;
        int i4 = i;
        boolean z2 = false;
        while (true) {
            byte m12125h2 = qv0Var.m12125h(2);
            if (m12125h2 != 0) {
                z = z2;
            } else {
                if (qv0Var.m12126g()) {
                    m12125h = qv0Var.m12125h(3) + 3;
                } else if (qv0Var.m12126g()) {
                    z = z2;
                    m12125h2 = 0;
                } else {
                    int m12125h3 = qv0Var.m12125h(2);
                    if (m12125h3 == 0) {
                        m12125h2 = 0;
                        z = true;
                    } else if (m12125h3 == 1) {
                        z = z2;
                        m12125h2 = 0;
                        i3 = 2;
                        if (i3 != 0 && paint != null) {
                            if (bArr != null) {
                                m12125h2 = bArr[m12125h2];
                            }
                            paint.setColor(iArr[m12125h2]);
                            canvas.drawRect(i4, i2, i4 + i3, i2 + 1, paint);
                        }
                        i4 += i3;
                        if (!z) {
                            return i4;
                        }
                        z2 = z;
                    } else if (m12125h3 == 2) {
                        m12125h = qv0Var.m12125h(4) + 12;
                    } else if (m12125h3 != 3) {
                        z = z2;
                        m12125h2 = 0;
                    } else {
                        m12125h = qv0Var.m12125h(8) + 29;
                    }
                    i3 = 0;
                    if (i3 != 0) {
                        if (bArr != null) {
                        }
                        paint.setColor(iArr[m12125h2]);
                        canvas.drawRect(i4, i2, i4 + i3, i2 + 1, paint);
                    }
                    i4 += i3;
                    if (!z) {
                    }
                }
                z = z2;
                i3 = m12125h;
                m12125h2 = qv0Var.m12125h(2);
                if (i3 != 0) {
                }
                i4 += i3;
                if (!z) {
                }
            }
            i3 = 1;
            if (i3 != 0) {
            }
            i4 += i3;
            if (!z) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[LOOP:0: B:3:0x0009->B:36:0x0085, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084 A[SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m20403h(qv0 qv0Var, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        boolean z;
        int i3;
        int m12125h;
        int i4 = i;
        boolean z2 = false;
        while (true) {
            byte m12125h2 = qv0Var.m12125h(4);
            if (m12125h2 != 0) {
                z = z2;
            } else {
                if (qv0Var.m12126g()) {
                    if (qv0Var.m12126g()) {
                        int m12125h3 = qv0Var.m12125h(2);
                        if (m12125h3 == 0) {
                            z = z2;
                            m12125h2 = 0;
                        } else if (m12125h3 == 1) {
                            z = z2;
                            m12125h2 = 0;
                            i3 = 2;
                        } else if (m12125h3 == 2) {
                            m12125h = qv0Var.m12125h(4) + 9;
                        } else if (m12125h3 != 3) {
                            z = z2;
                            m12125h2 = 0;
                            i3 = 0;
                        } else {
                            m12125h = qv0Var.m12125h(8) + 25;
                        }
                    } else {
                        m12125h = qv0Var.m12125h(2) + 4;
                    }
                    m12125h2 = qv0Var.m12125h(4);
                    z = z2;
                    i3 = m12125h;
                } else {
                    int m12125h4 = qv0Var.m12125h(3);
                    if (m12125h4 != 0) {
                        z = z2;
                        i3 = m12125h4 + 2;
                        m12125h2 = 0;
                    } else {
                        m12125h2 = 0;
                        z = true;
                        i3 = 0;
                    }
                }
                if (i3 != 0 && paint != null) {
                    if (bArr != null) {
                        m12125h2 = bArr[m12125h2];
                    }
                    paint.setColor(iArr[m12125h2]);
                    canvas.drawRect(i4, i2, i4 + i3, i2 + 1, paint);
                }
                i4 += i3;
                if (!z) {
                    return i4;
                }
                z2 = z;
            }
            i3 = 1;
            if (i3 != 0) {
                if (bArr != null) {
                }
                paint.setColor(iArr[m12125h2]);
                canvas.drawRect(i4, i2, i4 + i3, i2 + 1, paint);
            }
            i4 += i3;
            if (!z) {
            }
        }
    }

    /* renamed from: i */
    public static int m20402i(qv0 qv0Var, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        boolean z;
        int m12125h;
        int i3 = i;
        boolean z2 = false;
        while (true) {
            byte m12125h2 = qv0Var.m12125h(8);
            if (m12125h2 != 0) {
                z = z2;
                m12125h = 1;
            } else if (qv0Var.m12126g()) {
                z = z2;
                m12125h = qv0Var.m12125h(7);
                m12125h2 = qv0Var.m12125h(8);
            } else {
                int m12125h3 = qv0Var.m12125h(7);
                if (m12125h3 != 0) {
                    z = z2;
                    m12125h = m12125h3;
                    m12125h2 = 0;
                } else {
                    m12125h2 = 0;
                    z = true;
                    m12125h = 0;
                }
            }
            if (m12125h != 0 && paint != null) {
                if (bArr != null) {
                    m12125h2 = bArr[m12125h2];
                }
                paint.setColor(iArr[m12125h2]);
                canvas.drawRect(i3, i2, i3 + m12125h, i2 + 1, paint);
            }
            i3 += m12125h;
            if (z) {
                return i3;
            }
            z2 = z;
        }
    }

    /* renamed from: j */
    public static void m20401j(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        qv0 qv0Var = new qv0(bArr);
        int i4 = i2;
        int i5 = i3;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (qv0Var.m12131b() != 0) {
            int m12125h = qv0Var.m12125h(8);
            if (m12125h != 240) {
                switch (m12125h) {
                    case 16:
                        if (i != 3) {
                            if (i != 2) {
                                bArr2 = null;
                                i4 = m20404g(qv0Var, iArr, bArr2, i4, i5, paint, canvas);
                                qv0Var.m12130c();
                                break;
                            } else {
                                bArr3 = bArr5 == null ? f12958h : bArr5;
                            }
                        } else {
                            bArr3 = bArr4 == null ? f12959i : bArr4;
                        }
                        bArr2 = bArr3;
                        i4 = m20404g(qv0Var, iArr, bArr2, i4, i5, paint, canvas);
                        qv0Var.m12130c();
                    case 17:
                        i4 = m20403h(qv0Var, iArr, i == 3 ? f12960j : null, i4, i5, paint, canvas);
                        qv0Var.m12130c();
                        break;
                    case 18:
                        i4 = m20402i(qv0Var, iArr, null, i4, i5, paint, canvas);
                        break;
                    default:
                        switch (m12125h) {
                            case 32:
                                bArr5 = m20410a(4, 4, qv0Var);
                                continue;
                            case 33:
                                bArr4 = m20410a(4, 8, qv0Var);
                                continue;
                            case 34:
                                bArr4 = m20410a(16, 8, qv0Var);
                                continue;
                        }
                }
            } else {
                i5 += 2;
                i4 = i2;
            }
        }
    }

    /* renamed from: k */
    public static void m20400k(C1616c c1616c, C1614a c1614a, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr = i == 3 ? c1614a.f12971d : i == 2 ? c1614a.f12970c : c1614a.f12969b;
        m20401j(c1616c.f12980c, iArr, i, i2, i3, paint, canvas);
        m20401j(c1616c.f12981d, iArr, i, i2, i3 + 1, paint, canvas);
    }

    /* renamed from: l */
    public static C1614a m20399l(qv0 qv0Var, int i) {
        int m12125h;
        int i2;
        int m12125h2;
        int m12125h3;
        int i3;
        int i4 = 8;
        int m12125h4 = qv0Var.m12125h(8);
        qv0Var.m12118o(8);
        int i5 = 2;
        int i6 = i - 2;
        int[] m20408c = m20408c();
        int[] m20407d = m20407d();
        int[] m20406e = m20406e();
        while (i6 > 0) {
            int m12125h5 = qv0Var.m12125h(i4);
            int m12125h6 = qv0Var.m12125h(i4);
            int i7 = i6 - 2;
            int[] iArr = (m12125h6 & 128) != 0 ? m20408c : (m12125h6 & 64) != 0 ? m20407d : m20406e;
            if ((m12125h6 & 1) != 0) {
                m12125h3 = qv0Var.m12125h(i4);
                i3 = qv0Var.m12125h(i4);
                m12125h = qv0Var.m12125h(i4);
                m12125h2 = qv0Var.m12125h(i4);
                i2 = i7 - 4;
            } else {
                int m12125h7 = qv0Var.m12125h(4) << 4;
                m12125h = qv0Var.m12125h(4) << 4;
                i2 = i7 - 2;
                m12125h2 = qv0Var.m12125h(i5) << 6;
                m12125h3 = qv0Var.m12125h(6) << i5;
                i3 = m12125h7;
            }
            if (m12125h3 == 0) {
                i3 = 0;
                m12125h = 0;
                m12125h2 = 255;
            }
            double d = m12125h3;
            double d2 = i3 - 128;
            Double.isNaN(d2);
            Double.isNaN(d);
            double d3 = m12125h - 128;
            Double.isNaN(d3);
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d3);
            Double.isNaN(d);
            iArr[m12125h5] = m20405f((byte) (255 - (m12125h2 & 255)), sq1.m10004l((int) (d + (1.402d * d2)), 0, 255), sq1.m10004l((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), sq1.m10004l((int) (d + (d3 * 1.772d)), 0, 255));
            i6 = i2;
            m12125h4 = m12125h4;
            i4 = 8;
            i5 = 2;
        }
        return new C1614a(m12125h4, m20408c, m20407d, m20406e);
    }

    /* renamed from: m */
    public static C1615b m20398m(qv0 qv0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        qv0Var.m12118o(4);
        boolean m12126g = qv0Var.m12126g();
        qv0Var.m12118o(3);
        int m12125h = qv0Var.m12125h(16);
        int m12125h2 = qv0Var.m12125h(16);
        if (m12126g) {
            int m12125h3 = qv0Var.m12125h(16);
            int m12125h4 = qv0Var.m12125h(16);
            int m12125h5 = qv0Var.m12125h(16);
            i2 = qv0Var.m12125h(16);
            i = m12125h4;
            i4 = m12125h5;
            i3 = m12125h3;
        } else {
            i = m12125h;
            i2 = m12125h2;
            i3 = 0;
            i4 = 0;
        }
        return new C1615b(m12125h, m12125h2, i3, i, i4, i2);
    }

    /* renamed from: n */
    public static C1616c m20397n(qv0 qv0Var) {
        byte[] bArr;
        int m12125h = qv0Var.m12125h(16);
        qv0Var.m12118o(4);
        int m12125h2 = qv0Var.m12125h(2);
        boolean m12126g = qv0Var.m12126g();
        qv0Var.m12118o(1);
        byte[] bArr2 = null;
        if (m12125h2 == 1) {
            qv0Var.m12118o(qv0Var.m12125h(8) * 16);
        } else if (m12125h2 == 0) {
            int m12125h3 = qv0Var.m12125h(16);
            int m12125h4 = qv0Var.m12125h(16);
            if (m12125h3 > 0) {
                bArr2 = new byte[m12125h3];
                qv0Var.m12123j(bArr2, 0, m12125h3);
            }
            if (m12125h4 > 0) {
                bArr = new byte[m12125h4];
                qv0Var.m12123j(bArr, 0, m12125h4);
                return new C1616c(m12125h, m12126g, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C1616c(m12125h, m12126g, bArr2, bArr);
    }

    /* renamed from: o */
    public static C1617d m20396o(qv0 qv0Var, int i) {
        int m12125h = qv0Var.m12125h(8);
        int m12125h2 = qv0Var.m12125h(4);
        int m12125h3 = qv0Var.m12125h(2);
        qv0Var.m12118o(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int m12125h4 = qv0Var.m12125h(8);
            qv0Var.m12118o(8);
            i2 -= 6;
            sparseArray.put(m12125h4, new C1618e(qv0Var.m12125h(16), qv0Var.m12125h(16)));
        }
        return new C1617d(m12125h, m12125h2, m12125h3, sparseArray);
    }

    /* renamed from: p */
    public static C1619f m20395p(qv0 qv0Var, int i) {
        int m12125h;
        int m12125h2;
        int m12125h3 = qv0Var.m12125h(8);
        qv0Var.m12118o(4);
        boolean m12126g = qv0Var.m12126g();
        qv0Var.m12118o(3);
        int i2 = 16;
        int m12125h4 = qv0Var.m12125h(16);
        int m12125h5 = qv0Var.m12125h(16);
        int m12125h6 = qv0Var.m12125h(3);
        int m12125h7 = qv0Var.m12125h(3);
        int i3 = 2;
        qv0Var.m12118o(2);
        int m12125h8 = qv0Var.m12125h(8);
        int m12125h9 = qv0Var.m12125h(8);
        int m12125h10 = qv0Var.m12125h(4);
        int m12125h11 = qv0Var.m12125h(2);
        qv0Var.m12118o(2);
        int i4 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i4 > 0) {
            int m12125h12 = qv0Var.m12125h(i2);
            int m12125h13 = qv0Var.m12125h(i3);
            int m12125h14 = qv0Var.m12125h(i3);
            int m12125h15 = qv0Var.m12125h(12);
            int i5 = m12125h11;
            qv0Var.m12118o(4);
            int m12125h16 = qv0Var.m12125h(12);
            i4 -= 6;
            if (m12125h13 == 1 || m12125h13 == 2) {
                i4 -= 2;
                m12125h = qv0Var.m12125h(8);
                m12125h2 = qv0Var.m12125h(8);
            } else {
                m12125h = 0;
                m12125h2 = 0;
            }
            sparseArray.put(m12125h12, new C1620g(m12125h13, m12125h14, m12125h15, m12125h16, m12125h, m12125h2));
            m12125h11 = i5;
            i3 = 2;
            i2 = 16;
        }
        return new C1619f(m12125h3, m12126g, m12125h4, m12125h5, m12125h6, m12125h7, m12125h8, m12125h9, m12125h10, m12125h11, sparseArray);
    }

    /* renamed from: q */
    public static void m20394q(qv0 qv0Var, C1621h c1621h) {
        SparseArray sparseArray;
        C1614a c1614a;
        int i;
        C1614a c1614a2;
        C1616c c1616c;
        int m12125h = qv0Var.m12125h(8);
        int m12125h2 = qv0Var.m12125h(16);
        int m12125h3 = qv0Var.m12125h(16);
        int m12129d = qv0Var.m12129d() + m12125h3;
        if (m12125h3 * 8 > qv0Var.m12131b()) {
            qv0Var.m12118o(qv0Var.m12131b());
            return;
        }
        switch (m12125h) {
            case 16:
                if (m12125h2 == c1621h.f13005a) {
                    C1617d c1617d = c1621h.f13013i;
                    C1617d m20396o = m20396o(qv0Var, m12125h3);
                    if (m20396o.f12984c == 0) {
                        if (c1617d != null && c1617d.f12983b != m20396o.f12983b) {
                            c1621h.f13013i = m20396o;
                            break;
                        }
                    } else {
                        c1621h.f13013i = m20396o;
                        c1621h.f13007c.clear();
                        c1621h.f13008d.clear();
                        c1621h.f13009e.clear();
                        break;
                    }
                }
                break;
            case 17:
                C1617d c1617d2 = c1621h.f13013i;
                if (m12125h2 == c1621h.f13005a && c1617d2 != null) {
                    C1619f m20395p = m20395p(qv0Var, m12125h3);
                    if (c1617d2.f12984c == 0) {
                        m20395p.m20392a(c1621h.f13007c.get(m20395p.f12988a));
                    }
                    c1621h.f13007c.put(m20395p.f12988a, m20395p);
                    break;
                }
                break;
            case 18:
                if (m12125h2 == c1621h.f13005a) {
                    C1614a m20399l = m20399l(qv0Var, m12125h3);
                    sparseArray = c1621h.f13008d;
                    c1614a = m20399l;
                } else if (m12125h2 == c1621h.f13006b) {
                    C1614a m20399l2 = m20399l(qv0Var, m12125h3);
                    sparseArray = c1621h.f13010f;
                    c1614a = m20399l2;
                }
                i = c1614a.f12968a;
                c1614a2 = c1614a;
                sparseArray.put(i, c1614a2);
                break;
            case 19:
                if (m12125h2 == c1621h.f13005a) {
                    C1616c m20397n = m20397n(qv0Var);
                    sparseArray = c1621h.f13009e;
                    c1616c = m20397n;
                } else if (m12125h2 == c1621h.f13006b) {
                    C1616c m20397n2 = m20397n(qv0Var);
                    sparseArray = c1621h.f13011g;
                    c1616c = m20397n2;
                }
                i = c1616c.f12978a;
                c1614a2 = c1616c;
                sparseArray.put(i, c1614a2);
                break;
            case 20:
                if (m12125h2 == c1621h.f13005a) {
                    c1621h.f13012h = m20398m(qv0Var);
                    break;
                }
                break;
        }
        qv0Var.m12117p(m12129d - qv0Var.m12129d());
    }

    /* renamed from: b */
    public List<C2099ln> m20409b(byte[] bArr, int i) {
        int i2;
        SparseArray<C1620g> sparseArray;
        qv0 qv0Var = new qv0(bArr, i);
        while (qv0Var.m12131b() >= 48 && qv0Var.m12125h(8) == 15) {
            m20394q(qv0Var, this.f12966f);
        }
        C1621h c1621h = this.f12966f;
        if (c1621h.f13013i == null) {
            return Collections.emptyList();
        }
        C1615b c1615b = c1621h.f13012h;
        if (c1615b == null) {
            c1615b = this.f12964d;
        }
        Bitmap bitmap = this.f12967g;
        if (bitmap == null || c1615b.f12972a + 1 != bitmap.getWidth() || c1615b.f12973b + 1 != this.f12967g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(c1615b.f12972a + 1, c1615b.f12973b + 1, Bitmap.Config.ARGB_8888);
            this.f12967g = createBitmap;
            this.f12963c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C1618e> sparseArray2 = this.f12966f.f13013i.f12985d;
        for (int i3 = 0; i3 < sparseArray2.size(); i3++) {
            C1618e valueAt = sparseArray2.valueAt(i3);
            C1619f c1619f = this.f12966f.f13007c.get(sparseArray2.keyAt(i3));
            int i4 = valueAt.f12986a + c1615b.f12974c;
            int i5 = valueAt.f12987b + c1615b.f12976e;
            float f = i4;
            float f2 = i5;
            this.f12963c.clipRect(f, f2, Math.min(c1619f.f12990c + i4, c1615b.f12975d), Math.min(c1619f.f12991d + i5, c1615b.f12977f), Region.Op.REPLACE);
            C1614a c1614a = this.f12966f.f13008d.get(c1619f.f12994g);
            if (c1614a == null && (c1614a = this.f12966f.f13010f.get(c1619f.f12994g)) == null) {
                c1614a = this.f12965e;
            }
            SparseArray<C1620g> sparseArray3 = c1619f.f12998k;
            int i6 = 0;
            while (i6 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i6);
                C1620g valueAt2 = sparseArray3.valueAt(i6);
                C1616c c1616c = this.f12966f.f13009e.get(keyAt);
                C1616c c1616c2 = c1616c == null ? this.f12966f.f13011g.get(keyAt) : c1616c;
                if (c1616c2 != null) {
                    i2 = i6;
                    sparseArray = sparseArray3;
                    m20400k(c1616c2, c1614a, c1619f.f12993f, valueAt2.f13001c + i4, i5 + valueAt2.f13002d, c1616c2.f12979b ? null : this.f12961a, this.f12963c);
                } else {
                    i2 = i6;
                    sparseArray = sparseArray3;
                }
                i6 = i2 + 1;
                sparseArray3 = sparseArray;
            }
            if (c1619f.f12989b) {
                int i7 = c1619f.f12993f;
                this.f12962b.setColor(i7 == 3 ? c1614a.f12971d[c1619f.f12995h] : i7 == 2 ? c1614a.f12970c[c1619f.f12996i] : c1614a.f12969b[c1619f.f12997j]);
                this.f12963c.drawRect(f, f2, c1619f.f12990c + i4, c1619f.f12991d + i5, this.f12962b);
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(this.f12967g, i4, i5, c1619f.f12990c, c1619f.f12991d);
            int i8 = c1615b.f12972a;
            int i9 = c1615b.f12973b;
            arrayList.add(new C2099ln(createBitmap2, f / i8, 0, f2 / i9, 0, c1619f.f12990c / i8, c1619f.f12991d / i9));
            this.f12963c.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        return arrayList;
    }

    /* renamed from: r */
    public void m20393r() {
        this.f12966f.m20391a();
    }
}
