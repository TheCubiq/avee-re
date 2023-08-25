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
/* loaded from: classes.dex */
public final class hv {
    public static final byte[] h = {0, 7, 8, 15};
    public static final byte[] i = {0, 119, -120, -1};
    public static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint a;
    public final Paint b;
    public final Canvas c;
    public final b d;
    public final a e;
    public final h f;
    public Bitmap g;

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final int[] b;
        public final int[] c;
        public final int[] d;

        public a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.a = i;
            this.b = iArr;
            this.c = iArr2;
            this.d = iArr3;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final int a;
        public final boolean b;
        public final byte[] c;
        public final byte[] d;

        public c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.a = i;
            this.b = z;
            this.c = bArr;
            this.d = bArr2;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public final int a;
        public final int b;
        public final int c;
        public final SparseArray<e> d;

        public d(int i, int i2, int i3, SparseArray<e> sparseArray) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = sparseArray;
        }
    }

    /* loaded from: classes.dex */
    public static final class e {
        public final int a;
        public final int b;

        public e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final SparseArray<g> k;

        public f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<g> sparseArray) {
            this.a = i;
            this.b = z;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = i8;
            this.j = i9;
            this.k = sparseArray;
        }

        public void a(f fVar) {
            if (fVar == null) {
                return;
            }
            SparseArray<g> sparseArray = fVar.k;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.k.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class g {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    /* loaded from: classes.dex */
    public static final class h {
        public final int a;
        public final int b;
        public final SparseArray<f> c = new SparseArray<>();
        public final SparseArray<a> d = new SparseArray<>();
        public final SparseArray<c> e = new SparseArray<>();
        public final SparseArray<a> f = new SparseArray<>();
        public final SparseArray<c> g = new SparseArray<>();
        public b h;
        public d i;

        public h(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public void a() {
            this.c.clear();
            this.d.clear();
            this.e.clear();
            this.f.clear();
            this.g.clear();
            this.h = null;
            this.i = null;
        }
    }

    public hv(int i2, int i3) {
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new Canvas();
        this.d = new b(719, 575, 0, 719, 0, 575);
        this.e = new a(0, c(), d(), e());
        this.f = new h(i2, i3);
    }

    public static byte[] a(int i2, int i3, qv0 qv0Var) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) qv0Var.h(i3);
        }
        return bArr;
    }

    public static int[] c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    public static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = f(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = f(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = f(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = f(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = f(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = f(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = f(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int f(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b A[LOOP:0: B:3:0x0009->B:33:0x007b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int g(com.daaw.qv0 r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L9:
            r3 = 2
            int r4 = r13.h(r3)
            r5 = 1
            if (r4 == 0) goto L14
            r11 = r2
        L12:
            r12 = 1
            goto L59
        L14:
            boolean r4 = r13.g()
            r6 = 3
            if (r4 == 0) goto L28
            int r4 = r13.h(r6)
            int r4 = r4 + r6
        L20:
            int r3 = r13.h(r3)
            r11 = r2
            r12 = r4
            r4 = r3
            goto L59
        L28:
            boolean r4 = r13.g()
            if (r4 == 0) goto L31
            r11 = r2
            r4 = 0
            goto L12
        L31:
            int r4 = r13.h(r3)
            if (r4 == 0) goto L56
            if (r4 == r5) goto L52
            if (r4 == r3) goto L4a
            if (r4 == r6) goto L41
            r11 = r2
            r4 = 0
        L3f:
            r12 = 0
            goto L59
        L41:
            r4 = 8
            int r4 = r13.h(r4)
            int r4 = r4 + 29
            goto L20
        L4a:
            r4 = 4
            int r4 = r13.h(r4)
            int r4 = r4 + 12
            goto L20
        L52:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L59
        L56:
            r4 = 0
            r11 = 1
            goto L3f
        L59:
            if (r12 == 0) goto L77
            if (r8 == 0) goto L77
            if (r15 == 0) goto L61
            r4 = r15[r4]
        L61:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L77:
            int r10 = r10 + r12
            if (r11 == 0) goto L7b
            return r10
        L7b:
            r2 = r11
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.hv.g(com.daaw.qv0, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[LOOP:0: B:3:0x0009->B:36:0x0085, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int h(com.daaw.qv0 r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L9:
            r3 = 4
            int r4 = r13.h(r3)
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L15
            r11 = r2
        L13:
            r12 = 1
            goto L65
        L15:
            boolean r4 = r13.g()
            r7 = 3
            if (r4 != 0) goto L2b
            int r3 = r13.h(r7)
            if (r3 == 0) goto L28
            int r5 = r3 + 2
            r11 = r2
            r12 = r5
            r4 = 0
            goto L65
        L28:
            r4 = 0
            r11 = 1
            goto L4c
        L2b:
            boolean r4 = r13.g()
            if (r4 != 0) goto L3e
            int r4 = r13.h(r5)
            int r5 = r4 + 4
        L37:
            int r4 = r13.h(r3)
            r11 = r2
            r12 = r5
            goto L65
        L3e:
            int r4 = r13.h(r5)
            if (r4 == 0) goto L62
            if (r4 == r6) goto L5e
            if (r4 == r5) goto L57
            if (r4 == r7) goto L4e
            r11 = r2
            r4 = 0
        L4c:
            r12 = 0
            goto L65
        L4e:
            r4 = 8
            int r4 = r13.h(r4)
            int r5 = r4 + 25
            goto L37
        L57:
            int r4 = r13.h(r3)
            int r5 = r4 + 9
            goto L37
        L5e:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L65
        L62:
            r11 = r2
            r4 = 0
            goto L13
        L65:
            if (r12 == 0) goto L81
            if (r8 == 0) goto L81
            if (r15 == 0) goto L6d
            r4 = r15[r4]
        L6d:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r5 = (float) r2
            int r2 = r1 + 1
            float r6 = (float) r2
            r2 = r19
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L81:
            int r10 = r10 + r12
            if (r11 == 0) goto L85
            return r10
        L85:
            r2 = r11
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.hv.h(com.daaw.qv0, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    public static int i(qv0 qv0Var, int[] iArr, byte[] bArr, int i2, int i3, Paint paint, Canvas canvas) {
        boolean z;
        int h2;
        int i4 = i2;
        boolean z2 = false;
        while (true) {
            byte h3 = qv0Var.h(8);
            if (h3 != 0) {
                z = z2;
                h2 = 1;
            } else if (qv0Var.g()) {
                z = z2;
                h2 = qv0Var.h(7);
                h3 = qv0Var.h(8);
            } else {
                int h4 = qv0Var.h(7);
                if (h4 != 0) {
                    z = z2;
                    h2 = h4;
                    h3 = 0;
                } else {
                    h3 = 0;
                    z = true;
                    h2 = 0;
                }
            }
            if (h2 != 0 && paint != null) {
                if (bArr != null) {
                    h3 = bArr[h3];
                }
                paint.setColor(iArr[h3]);
                canvas.drawRect(i4, i3, i4 + h2, i3 + 1, paint);
            }
            i4 += h2;
            if (z) {
                return i4;
            }
            z2 = z;
        }
    }

    public static void j(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        qv0 qv0Var = new qv0(bArr);
        int i5 = i3;
        int i6 = i4;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (qv0Var.b() != 0) {
            int h2 = qv0Var.h(8);
            if (h2 != 240) {
                switch (h2) {
                    case 16:
                        if (i2 != 3) {
                            if (i2 != 2) {
                                bArr2 = null;
                                i5 = g(qv0Var, iArr, bArr2, i5, i6, paint, canvas);
                                qv0Var.c();
                                break;
                            } else {
                                bArr3 = bArr5 == null ? h : bArr5;
                            }
                        } else {
                            bArr3 = bArr4 == null ? i : bArr4;
                        }
                        bArr2 = bArr3;
                        i5 = g(qv0Var, iArr, bArr2, i5, i6, paint, canvas);
                        qv0Var.c();
                    case 17:
                        i5 = h(qv0Var, iArr, i2 == 3 ? j : null, i5, i6, paint, canvas);
                        qv0Var.c();
                        break;
                    case 18:
                        i5 = i(qv0Var, iArr, null, i5, i6, paint, canvas);
                        break;
                    default:
                        switch (h2) {
                            case 32:
                                bArr5 = a(4, 4, qv0Var);
                                continue;
                            case 33:
                                bArr4 = a(4, 8, qv0Var);
                                continue;
                            case 34:
                                bArr4 = a(16, 8, qv0Var);
                                continue;
                        }
                }
            } else {
                i6 += 2;
                i5 = i3;
            }
        }
    }

    public static void k(c cVar, a aVar, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        int[] iArr = i2 == 3 ? aVar.d : i2 == 2 ? aVar.c : aVar.b;
        j(cVar.c, iArr, i2, i3, i4, paint, canvas);
        j(cVar.d, iArr, i2, i3, i4 + 1, paint, canvas);
    }

    public static a l(qv0 qv0Var, int i2) {
        int h2;
        int i3;
        int h3;
        int h4;
        int i4;
        int i5 = 8;
        int h5 = qv0Var.h(8);
        qv0Var.o(8);
        int i6 = 2;
        int i7 = i2 - 2;
        int[] c2 = c();
        int[] d2 = d();
        int[] e2 = e();
        while (i7 > 0) {
            int h6 = qv0Var.h(i5);
            int h7 = qv0Var.h(i5);
            int i8 = i7 - 2;
            int[] iArr = (h7 & 128) != 0 ? c2 : (h7 & 64) != 0 ? d2 : e2;
            if ((h7 & 1) != 0) {
                h4 = qv0Var.h(i5);
                i4 = qv0Var.h(i5);
                h2 = qv0Var.h(i5);
                h3 = qv0Var.h(i5);
                i3 = i8 - 4;
            } else {
                int h8 = qv0Var.h(4) << 4;
                h2 = qv0Var.h(4) << 4;
                i3 = i8 - 2;
                h3 = qv0Var.h(i6) << 6;
                h4 = qv0Var.h(6) << i6;
                i4 = h8;
            }
            if (h4 == 0) {
                i4 = 0;
                h2 = 0;
                h3 = 255;
            }
            double d3 = h4;
            double d4 = i4 - 128;
            Double.isNaN(d4);
            Double.isNaN(d3);
            double d5 = h2 - 128;
            Double.isNaN(d5);
            Double.isNaN(d3);
            Double.isNaN(d4);
            Double.isNaN(d5);
            Double.isNaN(d3);
            iArr[h6] = f((byte) (255 - (h3 & 255)), sq1.l((int) (d3 + (1.402d * d4)), 0, 255), sq1.l((int) ((d3 - (0.34414d * d5)) - (d4 * 0.71414d)), 0, 255), sq1.l((int) (d3 + (d5 * 1.772d)), 0, 255));
            i7 = i3;
            h5 = h5;
            i5 = 8;
            i6 = 2;
        }
        return new a(h5, c2, d2, e2);
    }

    public static b m(qv0 qv0Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        qv0Var.o(4);
        boolean g2 = qv0Var.g();
        qv0Var.o(3);
        int h2 = qv0Var.h(16);
        int h3 = qv0Var.h(16);
        if (g2) {
            int h4 = qv0Var.h(16);
            int h5 = qv0Var.h(16);
            int h6 = qv0Var.h(16);
            i3 = qv0Var.h(16);
            i2 = h5;
            i5 = h6;
            i4 = h4;
        } else {
            i2 = h2;
            i3 = h3;
            i4 = 0;
            i5 = 0;
        }
        return new b(h2, h3, i4, i2, i5, i3);
    }

    public static c n(qv0 qv0Var) {
        byte[] bArr;
        int h2 = qv0Var.h(16);
        qv0Var.o(4);
        int h3 = qv0Var.h(2);
        boolean g2 = qv0Var.g();
        qv0Var.o(1);
        byte[] bArr2 = null;
        if (h3 == 1) {
            qv0Var.o(qv0Var.h(8) * 16);
        } else if (h3 == 0) {
            int h4 = qv0Var.h(16);
            int h5 = qv0Var.h(16);
            if (h4 > 0) {
                bArr2 = new byte[h4];
                qv0Var.j(bArr2, 0, h4);
            }
            if (h5 > 0) {
                bArr = new byte[h5];
                qv0Var.j(bArr, 0, h5);
                return new c(h2, g2, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(h2, g2, bArr2, bArr);
    }

    public static d o(qv0 qv0Var, int i2) {
        int h2 = qv0Var.h(8);
        int h3 = qv0Var.h(4);
        int h4 = qv0Var.h(2);
        qv0Var.o(2);
        int i3 = i2 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i3 > 0) {
            int h5 = qv0Var.h(8);
            qv0Var.o(8);
            i3 -= 6;
            sparseArray.put(h5, new e(qv0Var.h(16), qv0Var.h(16)));
        }
        return new d(h2, h3, h4, sparseArray);
    }

    public static f p(qv0 qv0Var, int i2) {
        int h2;
        int h3;
        int h4 = qv0Var.h(8);
        qv0Var.o(4);
        boolean g2 = qv0Var.g();
        qv0Var.o(3);
        int i3 = 16;
        int h5 = qv0Var.h(16);
        int h6 = qv0Var.h(16);
        int h7 = qv0Var.h(3);
        int h8 = qv0Var.h(3);
        int i4 = 2;
        qv0Var.o(2);
        int h9 = qv0Var.h(8);
        int h10 = qv0Var.h(8);
        int h11 = qv0Var.h(4);
        int h12 = qv0Var.h(2);
        qv0Var.o(2);
        int i5 = i2 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i5 > 0) {
            int h13 = qv0Var.h(i3);
            int h14 = qv0Var.h(i4);
            int h15 = qv0Var.h(i4);
            int h16 = qv0Var.h(12);
            int i6 = h12;
            qv0Var.o(4);
            int h17 = qv0Var.h(12);
            i5 -= 6;
            if (h14 == 1 || h14 == 2) {
                i5 -= 2;
                h2 = qv0Var.h(8);
                h3 = qv0Var.h(8);
            } else {
                h2 = 0;
                h3 = 0;
            }
            sparseArray.put(h13, new g(h14, h15, h16, h17, h2, h3));
            h12 = i6;
            i4 = 2;
            i3 = 16;
        }
        return new f(h4, g2, h5, h6, h7, h8, h9, h10, h11, h12, sparseArray);
    }

    public static void q(qv0 qv0Var, h hVar) {
        SparseArray sparseArray;
        a aVar;
        int i2;
        a aVar2;
        c cVar;
        int h2 = qv0Var.h(8);
        int h3 = qv0Var.h(16);
        int h4 = qv0Var.h(16);
        int d2 = qv0Var.d() + h4;
        if (h4 * 8 > qv0Var.b()) {
            qv0Var.o(qv0Var.b());
            return;
        }
        switch (h2) {
            case 16:
                if (h3 == hVar.a) {
                    d dVar = hVar.i;
                    d o = o(qv0Var, h4);
                    if (o.c == 0) {
                        if (dVar != null && dVar.b != o.b) {
                            hVar.i = o;
                            break;
                        }
                    } else {
                        hVar.i = o;
                        hVar.c.clear();
                        hVar.d.clear();
                        hVar.e.clear();
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.i;
                if (h3 == hVar.a && dVar2 != null) {
                    f p = p(qv0Var, h4);
                    if (dVar2.c == 0) {
                        p.a(hVar.c.get(p.a));
                    }
                    hVar.c.put(p.a, p);
                    break;
                }
                break;
            case 18:
                if (h3 == hVar.a) {
                    a l = l(qv0Var, h4);
                    sparseArray = hVar.d;
                    aVar = l;
                } else if (h3 == hVar.b) {
                    a l2 = l(qv0Var, h4);
                    sparseArray = hVar.f;
                    aVar = l2;
                }
                i2 = aVar.a;
                aVar2 = aVar;
                sparseArray.put(i2, aVar2);
                break;
            case 19:
                if (h3 == hVar.a) {
                    c n = n(qv0Var);
                    sparseArray = hVar.e;
                    cVar = n;
                } else if (h3 == hVar.b) {
                    c n2 = n(qv0Var);
                    sparseArray = hVar.g;
                    cVar = n2;
                }
                i2 = cVar.a;
                aVar2 = cVar;
                sparseArray.put(i2, aVar2);
                break;
            case 20:
                if (h3 == hVar.a) {
                    hVar.h = m(qv0Var);
                    break;
                }
                break;
        }
        qv0Var.p(d2 - qv0Var.d());
    }

    public List<ln> b(byte[] bArr, int i2) {
        int i3;
        SparseArray<g> sparseArray;
        qv0 qv0Var = new qv0(bArr, i2);
        while (qv0Var.b() >= 48 && qv0Var.h(8) == 15) {
            q(qv0Var, this.f);
        }
        h hVar = this.f;
        if (hVar.i == null) {
            return Collections.emptyList();
        }
        b bVar = hVar.h;
        if (bVar == null) {
            bVar = this.d;
        }
        Bitmap bitmap = this.g;
        if (bitmap == null || bVar.a + 1 != bitmap.getWidth() || bVar.b + 1 != this.g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.a + 1, bVar.b + 1, Bitmap.Config.ARGB_8888);
            this.g = createBitmap;
            this.c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = this.f.i.d;
        for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
            e valueAt = sparseArray2.valueAt(i4);
            f fVar = this.f.c.get(sparseArray2.keyAt(i4));
            int i5 = valueAt.a + bVar.c;
            int i6 = valueAt.b + bVar.e;
            float f2 = i5;
            float f3 = i6;
            this.c.clipRect(f2, f3, Math.min(fVar.c + i5, bVar.d), Math.min(fVar.d + i6, bVar.f), Region.Op.REPLACE);
            a aVar = this.f.d.get(fVar.g);
            if (aVar == null && (aVar = this.f.f.get(fVar.g)) == null) {
                aVar = this.e;
            }
            SparseArray<g> sparseArray3 = fVar.k;
            int i7 = 0;
            while (i7 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i7);
                g valueAt2 = sparseArray3.valueAt(i7);
                c cVar = this.f.e.get(keyAt);
                c cVar2 = cVar == null ? this.f.g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i3 = i7;
                    sparseArray = sparseArray3;
                    k(cVar2, aVar, fVar.f, valueAt2.c + i5, i6 + valueAt2.d, cVar2.b ? null : this.a, this.c);
                } else {
                    i3 = i7;
                    sparseArray = sparseArray3;
                }
                i7 = i3 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.b) {
                int i8 = fVar.f;
                this.b.setColor(i8 == 3 ? aVar.d[fVar.h] : i8 == 2 ? aVar.c[fVar.i] : aVar.b[fVar.j]);
                this.c.drawRect(f2, f3, fVar.c + i5, fVar.d + i6, this.b);
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(this.g, i5, i6, fVar.c, fVar.d);
            int i9 = bVar.a;
            int i10 = bVar.b;
            arrayList.add(new ln(createBitmap2, f2 / i9, 0, f3 / i10, 0, fVar.c / i9, fVar.d / i10));
            this.c.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        return arrayList;
    }

    public void r() {
        this.f.a();
    }
}
