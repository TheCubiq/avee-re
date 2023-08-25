package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.daaw.gb;
import com.daaw.k80;
import com.daaw.nj;
import com.daaw.p21;
import com.daaw.qj;
import com.daaw.rj;
import com.daaw.tj;
import java.util.ArrayList;
import java.util.HashMap;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public int A;
    public HashMap<String, Integer> B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public SparseArray<qj> I;
    public c J;
    public int K;
    public int L;
    public SparseArray<View> p;
    public ArrayList<androidx.constraintlayout.widget.b> q;
    public rj r;
    public int s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public int x;
    public androidx.constraintlayout.widget.c y;
    public nj z;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[qj.b.values().length];
            a = iArr;
            try {
                iArr[qj.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[qj.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[qj.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[qj.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public float A;
        public String B;
        public float C;
        public int D;
        public float E;
        public float F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public float O;
        public float P;
        public int Q;
        public int R;
        public int S;
        public boolean T;
        public boolean U;
        public String V;
        public boolean W;
        public boolean X;
        public boolean Y;
        public boolean Z;
        public int a;
        public boolean a0;
        public int b;
        public boolean b0;
        public float c;
        public boolean c0;
        public int d;
        public int d0;
        public int e;
        public int e0;
        public int f;
        public int f0;
        public int g;
        public int g0;
        public int h;
        public int h0;
        public int i;
        public int i0;
        public int j;
        public float j0;
        public int k;
        public int k0;
        public int l;
        public int l0;
        public int m;
        public float m0;
        public int n;
        public qj n0;
        public float o;
        public boolean o0;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public int x;
        public int y;
        public float z;

        /* loaded from: classes.dex */
        public static class a {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                a = sparseIntArray;
                sparseIntArray.append(p21.M1, 8);
                sparseIntArray.append(p21.N1, 9);
                sparseIntArray.append(p21.P1, 10);
                sparseIntArray.append(p21.Q1, 11);
                sparseIntArray.append(p21.W1, 12);
                sparseIntArray.append(p21.V1, 13);
                sparseIntArray.append(p21.u1, 14);
                sparseIntArray.append(p21.t1, 15);
                sparseIntArray.append(p21.r1, 16);
                sparseIntArray.append(p21.v1, 2);
                sparseIntArray.append(p21.x1, 3);
                sparseIntArray.append(p21.w1, 4);
                sparseIntArray.append(p21.e2, 49);
                sparseIntArray.append(p21.f2, 50);
                sparseIntArray.append(p21.B1, 5);
                sparseIntArray.append(p21.C1, 6);
                sparseIntArray.append(p21.D1, 7);
                sparseIntArray.append(p21.b1, 1);
                sparseIntArray.append(p21.R1, 17);
                sparseIntArray.append(p21.S1, 18);
                sparseIntArray.append(p21.A1, 19);
                sparseIntArray.append(p21.z1, 20);
                sparseIntArray.append(p21.i2, 21);
                sparseIntArray.append(p21.l2, 22);
                sparseIntArray.append(p21.j2, 23);
                sparseIntArray.append(p21.g2, 24);
                sparseIntArray.append(p21.k2, 25);
                sparseIntArray.append(p21.h2, 26);
                sparseIntArray.append(p21.I1, 29);
                sparseIntArray.append(p21.X1, 30);
                sparseIntArray.append(p21.y1, 44);
                sparseIntArray.append(p21.K1, 45);
                sparseIntArray.append(p21.Z1, 46);
                sparseIntArray.append(p21.J1, 47);
                sparseIntArray.append(p21.Y1, 48);
                sparseIntArray.append(p21.p1, 27);
                sparseIntArray.append(p21.o1, 28);
                sparseIntArray.append(p21.a2, 31);
                sparseIntArray.append(p21.E1, 32);
                sparseIntArray.append(p21.c2, 33);
                sparseIntArray.append(p21.b2, 34);
                sparseIntArray.append(p21.d2, 35);
                sparseIntArray.append(p21.G1, 36);
                sparseIntArray.append(p21.F1, 37);
                sparseIntArray.append(p21.H1, 38);
                sparseIntArray.append(p21.L1, 39);
                sparseIntArray.append(p21.U1, 40);
                sparseIntArray.append(p21.O1, 41);
                sparseIntArray.append(p21.s1, 42);
                sparseIntArray.append(p21.q1, 43);
                sparseIntArray.append(p21.T1, 51);
            }
        }

        public b(int i, int i2) {
            super(i, i2);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = false;
            this.c0 = false;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = 0.5f;
            this.n0 = new qj();
            this.o0 = false;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i;
            float parseFloat;
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = false;
            this.c0 = false;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = 0.5f;
            this.n0 = new qj();
            this.o0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p21.a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = a.a.get(index);
                switch (i3) {
                    case 1:
                        this.S = obtainStyledAttributes.getInt(index, this.S);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId;
                        if (resourceId == -1) {
                            this.m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.n = obtainStyledAttributes.getDimensionPixelSize(index, this.n);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.o) % 360.0f;
                        this.o = f;
                        if (f < 0.0f) {
                            this.o = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.a = obtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        break;
                    case 6:
                        this.b = obtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 7:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.d);
                        this.d = resourceId2;
                        if (resourceId2 == -1) {
                            this.d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId3;
                        if (resourceId3 == -1) {
                            this.e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId5;
                        if (resourceId5 == -1) {
                            this.g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId6;
                        if (resourceId6 == -1) {
                            this.h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId7;
                        if (resourceId7 == -1) {
                            this.i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId8;
                        if (resourceId8 == -1) {
                            this.j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId9;
                        if (resourceId9 == -1) {
                            this.k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId10;
                        if (resourceId10 == -1) {
                            this.l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId11;
                        if (resourceId11 == -1) {
                            this.p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.q);
                        this.q = resourceId12;
                        if (resourceId12 == -1) {
                            this.q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.r);
                        this.r = resourceId13;
                        if (resourceId13 == -1) {
                            this.r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId14;
                        if (resourceId14 == -1) {
                            this.s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.t = obtainStyledAttributes.getDimensionPixelSize(index, this.t);
                        break;
                    case 22:
                        this.u = obtainStyledAttributes.getDimensionPixelSize(index, this.u);
                        break;
                    case 23:
                        this.v = obtainStyledAttributes.getDimensionPixelSize(index, this.v);
                        break;
                    case 24:
                        this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 25:
                        this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case 26:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 27:
                        this.T = obtainStyledAttributes.getBoolean(index, this.T);
                        break;
                    case 28:
                        this.U = obtainStyledAttributes.getBoolean(index, this.U);
                        break;
                    case 29:
                        this.z = obtainStyledAttributes.getFloat(index, this.z);
                        break;
                    case 30:
                        this.A = obtainStyledAttributes.getFloat(index, this.A);
                        break;
                    case 31:
                        this.I = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.J = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.O));
                        this.I = 2;
                        break;
                    case 36:
                        try {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.P));
                        this.J = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = Float.NaN;
                                this.D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.D = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.B.substring(i, indexOf2);
                                        String substring3 = this.B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat2 = Float.parseFloat(substring2);
                                                float parseFloat3 = Float.parseFloat(substring3);
                                                parseFloat = (parseFloat2 > 0.0f && parseFloat3 > 0.0f) ? this.D == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3) : parseFloat;
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.B.substring(i);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            parseFloat = Float.parseFloat(substring4);
                                        }
                                    }
                                    this.C = parseFloat;
                                    break;
                                } else {
                                    continue;
                                }
                                break;
                            case 45:
                                this.E = obtainStyledAttributes.getFloat(index, this.E);
                                continue;
                            case 46:
                                this.F = obtainStyledAttributes.getFloat(index, this.F);
                                continue;
                            case 47:
                                this.G = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.H = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                continue;
                            case 50:
                                this.R = obtainStyledAttributes.getDimensionPixelOffset(index, this.R);
                                continue;
                            case 51:
                                this.V = obtainStyledAttributes.getString(index);
                                continue;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = false;
            this.c0 = false;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = 0.5f;
            this.n0 = new qj();
            this.o0 = false;
        }

        public void a() {
            this.Z = false;
            this.W = true;
            this.X = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.T) {
                this.W = false;
                if (this.I == 0) {
                    this.I = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.U) {
                this.X = false;
                if (this.J == 0) {
                    this.J = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.W = false;
                if (i == 0 && this.I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.T = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.X = false;
                if (i2 == 0 && this.J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.U = true;
                }
            }
            if (this.c == -1.0f && this.a == -1 && this.b == -1) {
                return;
            }
            this.Z = true;
            this.W = true;
            this.X = true;
            if (!(this.n0 instanceof k80)) {
                this.n0 = new k80();
            }
            ((k80) this.n0).O0(this.S);
        }

        /* JADX WARN: Code restructure failed: missing block: B:72:0x00ca, code lost:
            if (r1 > 0) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x00cc, code lost:
            ((android.view.ViewGroup.MarginLayoutParams) r9).rightMargin = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x00d9, code lost:
            if (r1 > 0) goto L50;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x00eb  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instructions count: 249
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }
    }

    /* loaded from: classes.dex */
    public class c implements gb.b {
        public ConstraintLayout a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public c(ConstraintLayout constraintLayout) {
            this.a = constraintLayout;
        }

        @Override // com.daaw.gb.b
        public final void a() {
            int childCount = this.a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.a.getChildAt(i);
                if (childAt instanceof e) {
                    ((e) childAt).a(this.a);
                }
            }
            int size = this.a.q.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((androidx.constraintlayout.widget.b) this.a.q.get(i2)).j(this.a);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:104:0x016c A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:114:0x0185  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x01a4  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x01bb  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x01d2  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x01d7  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x01dc  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x01e4  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x01e9  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x01ee  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x01f6 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:144:0x0203 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:147:0x020e A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:153:0x021a  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x0220  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x0236  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x0238  */
        /* JADX WARN: Removed duplicated region for block: B:162:0x023d  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x024b  */
        /* JADX WARN: Removed duplicated region for block: B:170:0x024d  */
        /* JADX WARN: Removed duplicated region for block: B:172:0x0250  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0159  */
        @Override // com.daaw.gb.b
        @android.annotation.SuppressLint({"WrongCall"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(com.daaw.qj r20, com.daaw.gb.a r21) {
            /*
                Method dump skipped, instructions count: 613
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c.b(com.daaw.qj, com.daaw.gb$a):void");
        }

        public void c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.b = i3;
            this.c = i4;
            this.d = i5;
            this.e = i6;
            this.f = i;
            this.g = i2;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = new SparseArray<>();
        this.q = new ArrayList<>(4);
        this.r = new rj();
        this.s = 0;
        this.t = 0;
        this.u = Integer.MAX_VALUE;
        this.v = Integer.MAX_VALUE;
        this.w = true;
        this.x = 263;
        this.y = null;
        this.z = null;
        this.A = -1;
        this.B = new HashMap<>();
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = 0;
        this.H = 0;
        this.I = new SparseArray<>();
        this.J = new c(this);
        this.K = 0;
        this.L = 0;
        j(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p = new SparseArray<>();
        this.q = new ArrayList<>(4);
        this.r = new rj();
        this.s = 0;
        this.t = 0;
        this.u = Integer.MAX_VALUE;
        this.v = Integer.MAX_VALUE;
        this.w = true;
        this.x = 263;
        this.y = null;
        this.z = null;
        this.A = -1;
        this.B = new HashMap<>();
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = 0;
        this.H = 0;
        this.I = new SparseArray<>();
        this.J = new c(this);
        this.K = 0;
        this.L = 0;
        j(attributeSet, i, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(boolean r19, android.view.View r20, com.daaw.qj r21, androidx.constraintlayout.widget.ConstraintLayout.b r22, android.util.SparseArray<com.daaw.qj> r23) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c(boolean, android.view.View, com.daaw.qj, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup
    /* renamed from: d */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.q;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.q.get(i).k(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: e */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object f(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.B;
            if (hashMap == null || !hashMap.containsKey(str)) {
                return null;
            }
            return this.B.get(str);
        }
        return null;
    }

    @Override // android.view.View
    public void forceLayout() {
        l();
        super.forceLayout();
    }

    public final qj g(int i) {
        if (i == 0) {
            return this.r;
        }
        View view = this.p.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.r;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).n0;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getMaxHeight() {
        return this.v;
    }

    public int getMaxWidth() {
        return this.u;
    }

    public int getMinHeight() {
        return this.t;
    }

    public int getMinWidth() {
        return this.s;
    }

    public int getOptimizationLevel() {
        return this.r.S0();
    }

    public View h(int i) {
        return this.p.get(i);
    }

    public final qj i(View view) {
        if (view == this) {
            return this.r;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).n0;
    }

    public final void j(AttributeSet attributeSet, int i, int i2) {
        this.r.Z(this);
        this.r.b1(this.J);
        this.p.put(getId(), this);
        this.y = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p21.a1, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == p21.f1) {
                    this.s = obtainStyledAttributes.getDimensionPixelOffset(index, this.s);
                } else if (index == p21.g1) {
                    this.t = obtainStyledAttributes.getDimensionPixelOffset(index, this.t);
                } else if (index == p21.d1) {
                    this.u = obtainStyledAttributes.getDimensionPixelOffset(index, this.u);
                } else if (index == p21.e1) {
                    this.v = obtainStyledAttributes.getDimensionPixelOffset(index, this.v);
                } else if (index == p21.m2) {
                    this.x = obtainStyledAttributes.getInt(index, this.x);
                } else if (index == p21.n1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.z = null;
                        }
                    }
                } else if (index == p21.l1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.y = cVar;
                        cVar.m(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.y = null;
                    }
                    this.A = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.r.c1(this.x);
    }

    public boolean k() {
        return ((getContext().getApplicationInfo().flags & NativeConstants.SSL_OP_CIPHER_SERVER_PREFERENCE) != 0) && 1 == getLayoutDirection();
    }

    public final void l() {
        this.w = true;
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = 0;
        this.H = 0;
    }

    public void m(int i) {
        this.z = new nj(getContext(), this, i);
    }

    public void n(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        c cVar = this.J;
        int i5 = cVar.e;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i3 + cVar.d, i, 0);
        int min = Math.min(this.u, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.v, ViewGroup.resolveSizeAndState(i4 + i5, i2, 0) & 16777215);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.C = min;
        this.D = min2;
    }

    public void o(rj rjVar, int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i4 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.J.c(i2, i3, max, max2, paddingWidth, i4);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        int max5 = (max3 > 0 || max4 > 0) ? k() ? max4 : max3 : Math.max(0, getPaddingLeft());
        int i5 = size - paddingWidth;
        int i6 = size2 - i4;
        r(rjVar, mode, i5, mode2, i6);
        rjVar.Y0(i, mode, i5, mode2, i6, this.C, this.D, max5, max);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            b bVar = (b) childAt.getLayoutParams();
            qj qjVar = bVar.n0;
            if ((childAt.getVisibility() != 8 || bVar.Z || bVar.a0 || bVar.c0 || isInEditMode) && !bVar.b0) {
                int O = qjVar.O();
                int P = qjVar.P();
                int N = qjVar.N() + O;
                int t = qjVar.t() + P;
                childAt.layout(O, P, N, t);
                if ((childAt instanceof e) && (content = ((e) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(O, P, N, t);
                }
            }
        }
        int size = this.q.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.q.get(i6).i(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        this.K = i;
        this.L = i2;
        this.r.d1(k());
        if (this.w) {
            this.w = false;
            if (s()) {
                this.r.f1();
            }
        }
        o(this.r, this.x, i, i2);
        n(i, i2, this.r.N(), this.r.t(), this.r.X0(), this.r.V0());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        qj i = i(view);
        if ((view instanceof Guideline) && !(i instanceof k80)) {
            b bVar = (b) view.getLayoutParams();
            k80 k80Var = new k80();
            bVar.n0 = k80Var;
            bVar.Z = true;
            k80Var.O0(bVar.S);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.m();
            ((b) view.getLayoutParams()).a0 = true;
            if (!this.q.contains(bVar2)) {
                this.q.add(bVar2);
            }
        }
        this.p.put(view.getId(), view);
        this.w = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.p.remove(view.getId());
        this.r.I0(i(view));
        this.q.remove(view);
        this.w = true;
    }

    public final void p() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            qj i2 = i(getChildAt(i));
            if (i2 != null) {
                i2.W();
            }
        }
        if (isInEditMode) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    q(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    g(childAt.getId()).a0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.A != -1) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt2 = getChildAt(i4);
                if (childAt2.getId() == this.A && (childAt2 instanceof d)) {
                    this.y = ((d) childAt2).getConstraintSet();
                }
            }
        }
        androidx.constraintlayout.widget.c cVar = this.y;
        if (cVar != null) {
            cVar.d(this, true);
        }
        this.r.J0();
        int size = this.q.size();
        if (size > 0) {
            for (int i5 = 0; i5 < size; i5++) {
                this.q.get(i5).l(this);
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt3 = getChildAt(i6);
            if (childAt3 instanceof e) {
                ((e) childAt3).b(this);
            }
        }
        this.I.clear();
        this.I.put(0, this.r);
        this.I.put(getId(), this.r);
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt4 = getChildAt(i7);
            this.I.put(childAt4.getId(), i(childAt4));
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt5 = getChildAt(i8);
            qj i9 = i(childAt5);
            if (i9 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.r.c(i9);
                c(isInEditMode, childAt5, i9, bVar, this.I);
            }
        }
    }

    public void q(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.B == null) {
                this.B = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.B.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r3 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r3 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        r10 = java.lang.Math.max(0, r7.s);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
        if (r3 == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
        if (r3 == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
        r12 = java.lang.Math.max(0, r7.t);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(com.daaw.rj r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.J
            int r1 = r0.e
            int r0 = r0.d
            com.daaw.qj$b r2 = com.daaw.qj.b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L28
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = 0
            goto L32
        L1a:
            int r9 = r7.u
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L32
        L23:
            com.daaw.qj$b r9 = com.daaw.qj.b.WRAP_CONTENT
            if (r3 != 0) goto L18
            goto L2c
        L28:
            com.daaw.qj$b r9 = com.daaw.qj.b.WRAP_CONTENT
            if (r3 != 0) goto L32
        L2c:
            int r10 = r7.s
            int r10 = java.lang.Math.max(r6, r10)
        L32:
            if (r11 == r5) goto L47
            if (r11 == 0) goto L42
            if (r11 == r4) goto L3a
        L38:
            r12 = 0
            goto L51
        L3a:
            int r11 = r7.v
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L51
        L42:
            com.daaw.qj$b r2 = com.daaw.qj.b.WRAP_CONTENT
            if (r3 != 0) goto L38
            goto L4b
        L47:
            com.daaw.qj$b r2 = com.daaw.qj.b.WRAP_CONTENT
            if (r3 != 0) goto L51
        L4b:
            int r11 = r7.t
            int r12 = java.lang.Math.max(r6, r11)
        L51:
            int r11 = r8.N()
            if (r10 != r11) goto L5d
            int r11 = r8.t()
            if (r12 == r11) goto L60
        L5d:
            r8.U0()
        L60:
            r8.C0(r6)
            r8.D0(r6)
            int r11 = r7.u
            int r11 = r11 - r0
            r8.p0(r11)
            int r11 = r7.v
            int r11 = r11 - r1
            r8.o0(r11)
            r8.r0(r6)
            r8.q0(r6)
            r8.i0(r9)
            r8.B0(r10)
            r8.x0(r2)
            r8.e0(r12)
            int r9 = r7.s
            int r9 = r9 - r0
            r8.r0(r9)
            int r9 = r7.t
            int r9 = r9 - r1
            r8.q0(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.r(com.daaw.rj, int, int, int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        l();
        super.requestLayout();
    }

    public final boolean s() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            p();
        }
        return z;
    }

    public void setConstraintSet(androidx.constraintlayout.widget.c cVar) {
        this.y = cVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.p.remove(getId());
        super.setId(i);
        this.p.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.v) {
            return;
        }
        this.v = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.u) {
            return;
        }
        this.u = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.t) {
            return;
        }
        this.t = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.s) {
            return;
        }
        this.s = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(tj tjVar) {
        nj njVar = this.z;
        if (njVar != null) {
            njVar.c(tjVar);
        }
    }

    public void setOptimizationLevel(int i) {
        this.x = i;
        this.r.c1(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
