package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
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
import com.daaw.AbstractC3080tj;
import com.daaw.C1387gb;
import com.daaw.C2041lj;
import com.daaw.C2294nj;
import com.daaw.C2716qj;
import com.daaw.C2865rj;
import com.daaw.k80;
import com.daaw.p21;
import com.daaw.qu1;
import com.daaw.ru1;
import java.util.ArrayList;
import java.util.HashMap;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: A */
    public int f866A;

    /* renamed from: B */
    public HashMap<String, Integer> f867B;

    /* renamed from: C */
    public int f868C;

    /* renamed from: D */
    public int f869D;

    /* renamed from: E */
    public int f870E;

    /* renamed from: F */
    public int f871F;

    /* renamed from: G */
    public int f872G;

    /* renamed from: H */
    public int f873H;

    /* renamed from: I */
    public SparseArray<C2716qj> f874I;

    /* renamed from: J */
    public C0177c f875J;

    /* renamed from: K */
    public int f876K;

    /* renamed from: L */
    public int f877L;

    /* renamed from: p */
    public SparseArray<View> f878p;

    /* renamed from: q */
    public ArrayList<AbstractC0181b> f879q;

    /* renamed from: r */
    public C2865rj f880r;

    /* renamed from: s */
    public int f881s;

    /* renamed from: t */
    public int f882t;

    /* renamed from: u */
    public int f883u;

    /* renamed from: v */
    public int f884v;

    /* renamed from: w */
    public boolean f885w;

    /* renamed from: x */
    public int f886x;

    /* renamed from: y */
    public C0182c f887y;

    /* renamed from: z */
    public C2294nj f888z;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0174a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f889a;

        static {
            int[] iArr = new int[C2716qj.EnumC2718b.values().length];
            f889a = iArr;
            try {
                iArr[C2716qj.EnumC2718b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f889a[C2716qj.EnumC2718b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f889a[C2716qj.EnumC2718b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f889a[C2716qj.EnumC2718b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    /* loaded from: classes.dex */
    public static class C0175b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public float f890A;

        /* renamed from: B */
        public String f891B;

        /* renamed from: C */
        public float f892C;

        /* renamed from: D */
        public int f893D;

        /* renamed from: E */
        public float f894E;

        /* renamed from: F */
        public float f895F;

        /* renamed from: G */
        public int f896G;

        /* renamed from: H */
        public int f897H;

        /* renamed from: I */
        public int f898I;

        /* renamed from: J */
        public int f899J;

        /* renamed from: K */
        public int f900K;

        /* renamed from: L */
        public int f901L;

        /* renamed from: M */
        public int f902M;

        /* renamed from: N */
        public int f903N;

        /* renamed from: O */
        public float f904O;

        /* renamed from: P */
        public float f905P;

        /* renamed from: Q */
        public int f906Q;

        /* renamed from: R */
        public int f907R;

        /* renamed from: S */
        public int f908S;

        /* renamed from: T */
        public boolean f909T;

        /* renamed from: U */
        public boolean f910U;

        /* renamed from: V */
        public String f911V;

        /* renamed from: W */
        public boolean f912W;

        /* renamed from: X */
        public boolean f913X;

        /* renamed from: Y */
        public boolean f914Y;

        /* renamed from: Z */
        public boolean f915Z;

        /* renamed from: a */
        public int f916a;

        /* renamed from: a0 */
        public boolean f917a0;

        /* renamed from: b */
        public int f918b;

        /* renamed from: b0 */
        public boolean f919b0;

        /* renamed from: c */
        public float f920c;

        /* renamed from: c0 */
        public boolean f921c0;

        /* renamed from: d */
        public int f922d;

        /* renamed from: d0 */
        public int f923d0;

        /* renamed from: e */
        public int f924e;

        /* renamed from: e0 */
        public int f925e0;

        /* renamed from: f */
        public int f926f;

        /* renamed from: f0 */
        public int f927f0;

        /* renamed from: g */
        public int f928g;

        /* renamed from: g0 */
        public int f929g0;

        /* renamed from: h */
        public int f930h;

        /* renamed from: h0 */
        public int f931h0;

        /* renamed from: i */
        public int f932i;

        /* renamed from: i0 */
        public int f933i0;

        /* renamed from: j */
        public int f934j;

        /* renamed from: j0 */
        public float f935j0;

        /* renamed from: k */
        public int f936k;

        /* renamed from: k0 */
        public int f937k0;

        /* renamed from: l */
        public int f938l;

        /* renamed from: l0 */
        public int f939l0;

        /* renamed from: m */
        public int f940m;

        /* renamed from: m0 */
        public float f941m0;

        /* renamed from: n */
        public int f942n;

        /* renamed from: n0 */
        public C2716qj f943n0;

        /* renamed from: o */
        public float f944o;

        /* renamed from: o0 */
        public boolean f945o0;

        /* renamed from: p */
        public int f946p;

        /* renamed from: q */
        public int f947q;

        /* renamed from: r */
        public int f948r;

        /* renamed from: s */
        public int f949s;

        /* renamed from: t */
        public int f950t;

        /* renamed from: u */
        public int f951u;

        /* renamed from: v */
        public int f952v;

        /* renamed from: w */
        public int f953w;

        /* renamed from: x */
        public int f954x;

        /* renamed from: y */
        public int f955y;

        /* renamed from: z */
        public float f956z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b$a */
        /* loaded from: classes.dex */
        public static class C0176a {

            /* renamed from: a */
            public static final SparseIntArray f957a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f957a = sparseIntArray;
                sparseIntArray.append(p21.f22287M1, 8);
                sparseIntArray.append(p21.f22293N1, 9);
                sparseIntArray.append(p21.f22305P1, 10);
                sparseIntArray.append(p21.f22311Q1, 11);
                sparseIntArray.append(p21.f22347W1, 12);
                sparseIntArray.append(p21.f22341V1, 13);
                sparseIntArray.append(p21.f22500u1, 14);
                sparseIntArray.append(p21.f22494t1, 15);
                sparseIntArray.append(p21.f22482r1, 16);
                sparseIntArray.append(p21.f22506v1, 2);
                sparseIntArray.append(p21.f22518x1, 3);
                sparseIntArray.append(p21.f22512w1, 4);
                sparseIntArray.append(p21.f22400e2, 49);
                sparseIntArray.append(p21.f22407f2, 50);
                sparseIntArray.append(p21.f22221B1, 5);
                sparseIntArray.append(p21.f22227C1, 6);
                sparseIntArray.append(p21.f22233D1, 7);
                sparseIntArray.append(p21.f22378b1, 1);
                sparseIntArray.append(p21.f22317R1, 17);
                sparseIntArray.append(p21.f22323S1, 18);
                sparseIntArray.append(p21.f22215A1, 19);
                sparseIntArray.append(p21.f22530z1, 20);
                sparseIntArray.append(p21.f22428i2, 21);
                sparseIntArray.append(p21.f22447l2, 22);
                sparseIntArray.append(p21.f22435j2, 23);
                sparseIntArray.append(p21.f22414g2, 24);
                sparseIntArray.append(p21.f22441k2, 25);
                sparseIntArray.append(p21.f22421h2, 26);
                sparseIntArray.append(p21.f22263I1, 29);
                sparseIntArray.append(p21.f22353X1, 30);
                sparseIntArray.append(p21.f22524y1, 44);
                sparseIntArray.append(p21.f22275K1, 45);
                sparseIntArray.append(p21.f22365Z1, 46);
                sparseIntArray.append(p21.f22269J1, 47);
                sparseIntArray.append(p21.f22359Y1, 48);
                sparseIntArray.append(p21.f22470p1, 27);
                sparseIntArray.append(p21.f22464o1, 28);
                sparseIntArray.append(p21.f22372a2, 31);
                sparseIntArray.append(p21.f22239E1, 32);
                sparseIntArray.append(p21.f22386c2, 33);
                sparseIntArray.append(p21.f22379b2, 34);
                sparseIntArray.append(p21.f22393d2, 35);
                sparseIntArray.append(p21.f22251G1, 36);
                sparseIntArray.append(p21.f22245F1, 37);
                sparseIntArray.append(p21.f22257H1, 38);
                sparseIntArray.append(p21.f22281L1, 39);
                sparseIntArray.append(p21.f22335U1, 40);
                sparseIntArray.append(p21.f22299O1, 41);
                sparseIntArray.append(p21.f22488s1, 42);
                sparseIntArray.append(p21.f22476q1, 43);
                sparseIntArray.append(p21.f22329T1, 51);
            }
        }

        public C0175b(int i, int i2) {
            super(i, i2);
            this.f916a = -1;
            this.f918b = -1;
            this.f920c = -1.0f;
            this.f922d = -1;
            this.f924e = -1;
            this.f926f = -1;
            this.f928g = -1;
            this.f930h = -1;
            this.f932i = -1;
            this.f934j = -1;
            this.f936k = -1;
            this.f938l = -1;
            this.f940m = -1;
            this.f942n = 0;
            this.f944o = 0.0f;
            this.f946p = -1;
            this.f947q = -1;
            this.f948r = -1;
            this.f949s = -1;
            this.f950t = -1;
            this.f951u = -1;
            this.f952v = -1;
            this.f953w = -1;
            this.f954x = -1;
            this.f955y = -1;
            this.f956z = 0.5f;
            this.f890A = 0.5f;
            this.f891B = null;
            this.f892C = 0.0f;
            this.f893D = 1;
            this.f894E = -1.0f;
            this.f895F = -1.0f;
            this.f896G = 0;
            this.f897H = 0;
            this.f898I = 0;
            this.f899J = 0;
            this.f900K = 0;
            this.f901L = 0;
            this.f902M = 0;
            this.f903N = 0;
            this.f904O = 1.0f;
            this.f905P = 1.0f;
            this.f906Q = -1;
            this.f907R = -1;
            this.f908S = -1;
            this.f909T = false;
            this.f910U = false;
            this.f911V = null;
            this.f912W = true;
            this.f913X = true;
            this.f914Y = false;
            this.f915Z = false;
            this.f917a0 = false;
            this.f919b0 = false;
            this.f921c0 = false;
            this.f923d0 = -1;
            this.f925e0 = -1;
            this.f927f0 = -1;
            this.f929g0 = -1;
            this.f931h0 = -1;
            this.f933i0 = -1;
            this.f935j0 = 0.5f;
            this.f943n0 = new C2716qj();
            this.f945o0 = false;
        }

        public C0175b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i;
            float parseFloat;
            this.f916a = -1;
            this.f918b = -1;
            this.f920c = -1.0f;
            this.f922d = -1;
            this.f924e = -1;
            this.f926f = -1;
            this.f928g = -1;
            this.f930h = -1;
            this.f932i = -1;
            this.f934j = -1;
            this.f936k = -1;
            this.f938l = -1;
            this.f940m = -1;
            this.f942n = 0;
            this.f944o = 0.0f;
            this.f946p = -1;
            this.f947q = -1;
            this.f948r = -1;
            this.f949s = -1;
            this.f950t = -1;
            this.f951u = -1;
            this.f952v = -1;
            this.f953w = -1;
            this.f954x = -1;
            this.f955y = -1;
            this.f956z = 0.5f;
            this.f890A = 0.5f;
            this.f891B = null;
            this.f892C = 0.0f;
            this.f893D = 1;
            this.f894E = -1.0f;
            this.f895F = -1.0f;
            this.f896G = 0;
            this.f897H = 0;
            this.f898I = 0;
            this.f899J = 0;
            this.f900K = 0;
            this.f901L = 0;
            this.f902M = 0;
            this.f903N = 0;
            this.f904O = 1.0f;
            this.f905P = 1.0f;
            this.f906Q = -1;
            this.f907R = -1;
            this.f908S = -1;
            this.f909T = false;
            this.f910U = false;
            this.f911V = null;
            this.f912W = true;
            this.f913X = true;
            this.f914Y = false;
            this.f915Z = false;
            this.f917a0 = false;
            this.f919b0 = false;
            this.f921c0 = false;
            this.f923d0 = -1;
            this.f925e0 = -1;
            this.f927f0 = -1;
            this.f929g0 = -1;
            this.f931h0 = -1;
            this.f933i0 = -1;
            this.f935j0 = 0.5f;
            this.f943n0 = new C2716qj();
            this.f945o0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p21.f22371a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = C0176a.f957a.get(index);
                switch (i3) {
                    case 1:
                        this.f908S = obtainStyledAttributes.getInt(index, this.f908S);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f940m);
                        this.f940m = resourceId;
                        if (resourceId == -1) {
                            this.f940m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f942n = obtainStyledAttributes.getDimensionPixelSize(index, this.f942n);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.f944o) % 360.0f;
                        this.f944o = f;
                        if (f < 0.0f) {
                            this.f944o = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f916a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f916a);
                        break;
                    case 6:
                        this.f918b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f918b);
                        break;
                    case 7:
                        this.f920c = obtainStyledAttributes.getFloat(index, this.f920c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f922d);
                        this.f922d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f922d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f924e);
                        this.f924e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f924e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f926f);
                        this.f926f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f926f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f928g);
                        this.f928g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f928g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f930h);
                        this.f930h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f930h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f932i);
                        this.f932i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f932i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f934j);
                        this.f934j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f934j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f936k);
                        this.f936k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f936k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f938l);
                        this.f938l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f938l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f946p);
                        this.f946p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f946p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f947q);
                        this.f947q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f947q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f948r);
                        this.f948r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f948r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f949s);
                        this.f949s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f949s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f950t = obtainStyledAttributes.getDimensionPixelSize(index, this.f950t);
                        break;
                    case 22:
                        this.f951u = obtainStyledAttributes.getDimensionPixelSize(index, this.f951u);
                        break;
                    case 23:
                        this.f952v = obtainStyledAttributes.getDimensionPixelSize(index, this.f952v);
                        break;
                    case 24:
                        this.f953w = obtainStyledAttributes.getDimensionPixelSize(index, this.f953w);
                        break;
                    case 25:
                        this.f954x = obtainStyledAttributes.getDimensionPixelSize(index, this.f954x);
                        break;
                    case 26:
                        this.f955y = obtainStyledAttributes.getDimensionPixelSize(index, this.f955y);
                        break;
                    case 27:
                        this.f909T = obtainStyledAttributes.getBoolean(index, this.f909T);
                        break;
                    case 28:
                        this.f910U = obtainStyledAttributes.getBoolean(index, this.f910U);
                        break;
                    case 29:
                        this.f956z = obtainStyledAttributes.getFloat(index, this.f956z);
                        break;
                    case 30:
                        this.f890A = obtainStyledAttributes.getFloat(index, this.f890A);
                        break;
                    case 31:
                        this.f898I = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.f899J = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.f900K = obtainStyledAttributes.getDimensionPixelSize(index, this.f900K);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f900K) == -2) {
                                this.f900K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f902M = obtainStyledAttributes.getDimensionPixelSize(index, this.f902M);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f902M) == -2) {
                                this.f902M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f904O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f904O));
                        this.f898I = 2;
                        break;
                    case 36:
                        try {
                            this.f901L = obtainStyledAttributes.getDimensionPixelSize(index, this.f901L);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f901L) == -2) {
                                this.f901L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f903N = obtainStyledAttributes.getDimensionPixelSize(index, this.f903N);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f903N) == -2) {
                                this.f903N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f905P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f905P));
                        this.f899J = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.f891B = string;
                                this.f892C = Float.NaN;
                                this.f893D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.f891B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.f891B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.f893D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.f893D = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.f891B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.f891B.substring(i, indexOf2);
                                        String substring3 = this.f891B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat2 = Float.parseFloat(substring2);
                                                float parseFloat3 = Float.parseFloat(substring3);
                                                parseFloat = (parseFloat2 > 0.0f && parseFloat3 > 0.0f) ? this.f893D == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3) : parseFloat;
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.f891B.substring(i);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            parseFloat = Float.parseFloat(substring4);
                                        }
                                    }
                                    this.f892C = parseFloat;
                                    break;
                                } else {
                                    continue;
                                }
                                break;
                            case 45:
                                this.f894E = obtainStyledAttributes.getFloat(index, this.f894E);
                                continue;
                            case 46:
                                this.f895F = obtainStyledAttributes.getFloat(index, this.f895F);
                                continue;
                            case 47:
                                this.f896G = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.f897H = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.f906Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f906Q);
                                continue;
                            case 50:
                                this.f907R = obtainStyledAttributes.getDimensionPixelOffset(index, this.f907R);
                                continue;
                            case 51:
                                this.f911V = obtainStyledAttributes.getString(index);
                                continue;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            m29878a();
        }

        public C0175b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f916a = -1;
            this.f918b = -1;
            this.f920c = -1.0f;
            this.f922d = -1;
            this.f924e = -1;
            this.f926f = -1;
            this.f928g = -1;
            this.f930h = -1;
            this.f932i = -1;
            this.f934j = -1;
            this.f936k = -1;
            this.f938l = -1;
            this.f940m = -1;
            this.f942n = 0;
            this.f944o = 0.0f;
            this.f946p = -1;
            this.f947q = -1;
            this.f948r = -1;
            this.f949s = -1;
            this.f950t = -1;
            this.f951u = -1;
            this.f952v = -1;
            this.f953w = -1;
            this.f954x = -1;
            this.f955y = -1;
            this.f956z = 0.5f;
            this.f890A = 0.5f;
            this.f891B = null;
            this.f892C = 0.0f;
            this.f893D = 1;
            this.f894E = -1.0f;
            this.f895F = -1.0f;
            this.f896G = 0;
            this.f897H = 0;
            this.f898I = 0;
            this.f899J = 0;
            this.f900K = 0;
            this.f901L = 0;
            this.f902M = 0;
            this.f903N = 0;
            this.f904O = 1.0f;
            this.f905P = 1.0f;
            this.f906Q = -1;
            this.f907R = -1;
            this.f908S = -1;
            this.f909T = false;
            this.f910U = false;
            this.f911V = null;
            this.f912W = true;
            this.f913X = true;
            this.f914Y = false;
            this.f915Z = false;
            this.f917a0 = false;
            this.f919b0 = false;
            this.f921c0 = false;
            this.f923d0 = -1;
            this.f925e0 = -1;
            this.f927f0 = -1;
            this.f929g0 = -1;
            this.f931h0 = -1;
            this.f933i0 = -1;
            this.f935j0 = 0.5f;
            this.f943n0 = new C2716qj();
            this.f945o0 = false;
        }

        /* renamed from: a */
        public void m29878a() {
            this.f915Z = false;
            this.f912W = true;
            this.f913X = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.f909T) {
                this.f912W = false;
                if (this.f898I == 0) {
                    this.f898I = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.f910U) {
                this.f913X = false;
                if (this.f899J == 0) {
                    this.f899J = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f912W = false;
                if (i == 0 && this.f898I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f909T = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f913X = false;
                if (i2 == 0 && this.f899J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f910U = true;
                }
            }
            if (this.f920c == -1.0f && this.f916a == -1 && this.f918b == -1) {
                return;
            }
            this.f915Z = true;
            this.f912W = true;
            this.f913X = true;
            if (!(this.f943n0 instanceof k80)) {
                this.f943n0 = new k80();
            }
            ((k80) this.f943n0).m17974O0(this.f908S);
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
        @TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void resolveLayoutDirection(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i8 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i);
            boolean z = false;
            boolean z2 = 1 == getLayoutDirection();
            this.f927f0 = -1;
            this.f929g0 = -1;
            this.f923d0 = -1;
            this.f925e0 = -1;
            this.f931h0 = this.f950t;
            this.f933i0 = this.f952v;
            float f = this.f956z;
            this.f935j0 = f;
            int i9 = this.f916a;
            this.f937k0 = i9;
            int i10 = this.f918b;
            this.f939l0 = i10;
            float f2 = this.f920c;
            this.f941m0 = f2;
            if (z2) {
                int i11 = this.f946p;
                if (i11 != -1) {
                    this.f927f0 = i11;
                } else {
                    int i12 = this.f947q;
                    if (i12 != -1) {
                        this.f929g0 = i12;
                    }
                    i3 = this.f948r;
                    if (i3 != -1) {
                        this.f925e0 = i3;
                        z = true;
                    }
                    i4 = this.f949s;
                    if (i4 != -1) {
                        this.f923d0 = i4;
                        z = true;
                    }
                    i5 = this.f954x;
                    if (i5 != -1) {
                        this.f933i0 = i5;
                    }
                    i6 = this.f955y;
                    if (i6 != -1) {
                        this.f931h0 = i6;
                    }
                    if (z) {
                        this.f935j0 = 1.0f - f;
                    }
                    if (this.f915Z && this.f908S == 1) {
                        if (f2 == -1.0f) {
                            this.f941m0 = 1.0f - f2;
                            this.f937k0 = -1;
                            this.f939l0 = -1;
                        } else {
                            if (i9 != -1) {
                                this.f939l0 = i9;
                                this.f937k0 = -1;
                            } else if (i10 != -1) {
                                this.f937k0 = i10;
                                this.f939l0 = -1;
                            }
                            this.f941m0 = -1.0f;
                        }
                    }
                }
                z = true;
                i3 = this.f948r;
                if (i3 != -1) {
                }
                i4 = this.f949s;
                if (i4 != -1) {
                }
                i5 = this.f954x;
                if (i5 != -1) {
                }
                i6 = this.f955y;
                if (i6 != -1) {
                }
                if (z) {
                }
                if (this.f915Z) {
                    if (f2 == -1.0f) {
                    }
                }
            } else {
                int i13 = this.f946p;
                if (i13 != -1) {
                    this.f925e0 = i13;
                }
                int i14 = this.f947q;
                if (i14 != -1) {
                    this.f923d0 = i14;
                }
                int i15 = this.f948r;
                if (i15 != -1) {
                    this.f927f0 = i15;
                }
                int i16 = this.f949s;
                if (i16 != -1) {
                    this.f929g0 = i16;
                }
                int i17 = this.f954x;
                if (i17 != -1) {
                    this.f931h0 = i17;
                }
                int i18 = this.f955y;
                if (i18 != -1) {
                    this.f933i0 = i18;
                }
            }
            if (this.f948r == -1 && this.f949s == -1 && this.f947q == -1 && this.f946p == -1) {
                int i19 = this.f926f;
                if (i19 == -1) {
                    int i20 = this.f928g;
                    if (i20 != -1) {
                        this.f929g0 = i20;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0) {
                        }
                    }
                    i2 = this.f922d;
                    if (i2 == -1) {
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i7;
                }
                this.f927f0 = i19;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0) {
                }
                i2 = this.f922d;
                if (i2 == -1) {
                    this.f923d0 = i2;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i7 <= 0) {
                        return;
                    }
                } else {
                    int i21 = this.f924e;
                    if (i21 == -1) {
                        return;
                    }
                    this.f925e0 = i21;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i7 <= 0) {
                        return;
                    }
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i7;
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$c */
    /* loaded from: classes.dex */
    public class C0177c implements C1387gb.InterfaceC1389b {

        /* renamed from: a */
        public ConstraintLayout f958a;

        /* renamed from: b */
        public int f959b;

        /* renamed from: c */
        public int f960c;

        /* renamed from: d */
        public int f961d;

        /* renamed from: e */
        public int f962e;

        /* renamed from: f */
        public int f963f;

        /* renamed from: g */
        public int f964g;

        public C0177c(ConstraintLayout constraintLayout) {
            this.f958a = constraintLayout;
        }

        @Override // com.daaw.C1387gb.InterfaceC1389b
        /* renamed from: a */
        public final void mo21829a() {
            int childCount = this.f958a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f958a.getChildAt(i);
                if (childAt instanceof C0190e) {
                    ((C0190e) childAt).m29826a(this.f958a);
                }
            }
            int size = this.f958a.f879q.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((AbstractC0181b) this.f958a.f879q.get(i2)).m29864j(this.f958a);
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
        @Override // com.daaw.C1387gb.InterfaceC1389b
        @SuppressLint({"WrongCall"})
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void mo21828b(C2716qj c2716qj, C1387gb.C1388a c1388a) {
            int i;
            boolean z;
            int i2;
            int makeMeasureSpec;
            boolean z2;
            boolean z3;
            boolean z4;
            int measuredWidth;
            int measuredHeight;
            int i3;
            int max;
            int i4;
            int max2;
            int i5;
            int measuredWidth2;
            int measuredHeight2;
            int baseline;
            int i6;
            boolean z5;
            int childMeasureSpec;
            int childMeasureSpec2;
            if (c2716qj == null) {
                return;
            }
            if (c2716qj.m12451M() == 8 && !c2716qj.m12443U()) {
                c1388a.f10990e = 0;
                c1388a.f10991f = 0;
                c1388a.f10992g = 0;
                return;
            }
            C2716qj.EnumC2718b enumC2718b = c1388a.f10986a;
            C2716qj.EnumC2718b enumC2718b2 = c1388a.f10987b;
            int i7 = c1388a.f10988c;
            int i8 = c1388a.f10989d;
            int i9 = this.f959b + this.f960c;
            int i10 = this.f961d;
            View view = (View) c2716qj.m12413o();
            int[] iArr = C0174a.f889a;
            int i11 = iArr[enumC2718b.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    i = ViewGroup.getChildMeasureSpec(this.f963f, i10, -2);
                    c2716qj.f24029h[2] = -2;
                } else if (i11 == 3) {
                    i = ViewGroup.getChildMeasureSpec(this.f963f, i10 + c2716qj.m12395x(), -1);
                    c2716qj.f24029h[2] = -1;
                } else if (i11 != 4) {
                    i = 0;
                } else {
                    i = ViewGroup.getChildMeasureSpec(this.f963f, i10, -2);
                    boolean z6 = c2716qj.f24037l == 1;
                    int[] iArr2 = c2716qj.f24029h;
                    iArr2[2] = 0;
                    if (c1388a.f10995j) {
                        boolean z7 = !(!z6 || iArr2[3] == 0 || iArr2[0] == c2716qj.m12450N()) || (view instanceof C0190e);
                        if (!z6 || z7) {
                            i = View.MeasureSpec.makeMeasureSpec(c2716qj.m12450N(), 1073741824);
                        }
                    }
                }
                z = true;
                i2 = iArr[enumC2718b2.ordinal()];
                if (i2 == 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f964g, i9 + c2716qj.m12452L(), -1);
                            c2716qj.f24029h[3] = -1;
                        } else if (i2 != 4) {
                            z2 = false;
                            makeMeasureSpec = 0;
                            C2716qj.EnumC2718b enumC2718b3 = C2716qj.EnumC2718b.MATCH_CONSTRAINT;
                            boolean z8 = enumC2718b != enumC2718b3;
                            boolean z9 = enumC2718b2 != enumC2718b3;
                            C2716qj.EnumC2718b enumC2718b4 = C2716qj.EnumC2718b.MATCH_PARENT;
                            boolean z10 = enumC2718b2 != enumC2718b4 || enumC2718b2 == C2716qj.EnumC2718b.FIXED;
                            boolean z11 = enumC2718b != enumC2718b4 || enumC2718b == C2716qj.EnumC2718b.FIXED;
                            z3 = !z8 && c2716qj.f24005Q > 0.0f;
                            z4 = !z9 && c2716qj.f24005Q > 0.0f;
                            C0175b c0175b = (C0175b) view.getLayoutParams();
                            if (c1388a.f10995j && z8 && c2716qj.f24037l == 0 && z9 && c2716qj.f24039m == 0) {
                                measuredWidth2 = 0;
                                measuredHeight2 = 0;
                                baseline = 0;
                                i6 = -1;
                            } else {
                                if ((view instanceof qu1) || !(c2716qj instanceof ru1)) {
                                    view.measure(i, makeMeasureSpec);
                                } else {
                                    ((qu1) view).m12219n((ru1) c2716qj, i, makeMeasureSpec);
                                }
                                measuredWidth = view.getMeasuredWidth();
                                measuredHeight = view.getMeasuredHeight();
                                int baseline2 = view.getBaseline();
                                if (z) {
                                    i3 = 0;
                                    int[] iArr3 = c2716qj.f24029h;
                                    iArr3[0] = 0;
                                    iArr3[2] = 0;
                                } else {
                                    int[] iArr4 = c2716qj.f24029h;
                                    i3 = 0;
                                    iArr4[0] = measuredWidth;
                                    iArr4[2] = measuredHeight;
                                }
                                if (z2) {
                                    int[] iArr5 = c2716qj.f24029h;
                                    iArr5[1] = i3;
                                    iArr5[3] = i3;
                                } else {
                                    int[] iArr6 = c2716qj.f24029h;
                                    iArr6[1] = measuredHeight;
                                    iArr6[3] = measuredWidth;
                                }
                                int i12 = c2716qj.f24043o;
                                max = i12 <= 0 ? Math.max(i12, measuredWidth) : measuredWidth;
                                i4 = c2716qj.f24045p;
                                if (i4 > 0) {
                                    max = Math.min(i4, max);
                                }
                                int i13 = c2716qj.f24049r;
                                max2 = i13 <= 0 ? Math.max(i13, measuredHeight) : measuredHeight;
                                i5 = c2716qj.f24051s;
                                if (i5 > 0) {
                                    max2 = Math.min(i5, max2);
                                }
                                if (!z3 && z10) {
                                    max = (int) ((max2 * c2716qj.f24005Q) + 0.5f);
                                } else if (z4 && z11) {
                                    max2 = (int) ((max / c2716qj.f24005Q) + 0.5f);
                                }
                                if (measuredWidth == max || measuredHeight != max2) {
                                    if (measuredWidth != max) {
                                        i = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                                    }
                                    if (measuredHeight != max2) {
                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
                                    }
                                    view.measure(i, makeMeasureSpec);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                } else {
                                    measuredWidth2 = max;
                                    measuredHeight2 = max2;
                                    baseline = baseline2;
                                }
                                i6 = -1;
                            }
                            boolean z12 = baseline == i6;
                            c1388a.f10994i = measuredWidth2 == c1388a.f10988c || measuredHeight2 != c1388a.f10989d;
                            z5 = !c0175b.f914Y ? true : z12;
                            if (z5 && baseline != -1 && c2716qj.m12419l() != baseline) {
                                c1388a.f10994i = true;
                            }
                            c1388a.f10990e = measuredWidth2;
                            c1388a.f10991f = measuredHeight2;
                            c1388a.f10993h = z5;
                            c1388a.f10992g = baseline;
                        } else {
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f964g, i9, -2);
                            boolean z13 = c2716qj.f24039m == 1;
                            int[] iArr7 = c2716qj.f24029h;
                            iArr7[3] = 0;
                            if (c1388a.f10995j) {
                                boolean z14 = !(!z13 || iArr7[2] == 0 || iArr7[1] == c2716qj.m12403t()) || (view instanceof C0190e);
                                if (!z13 || z14) {
                                    childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c2716qj.m12403t(), 1073741824);
                                }
                            }
                        }
                        makeMeasureSpec = childMeasureSpec2;
                    } else {
                        childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f964g, i9, -2);
                        c2716qj.f24029h[3] = -2;
                    }
                    makeMeasureSpec = childMeasureSpec;
                    z2 = true;
                    C2716qj.EnumC2718b enumC2718b32 = C2716qj.EnumC2718b.MATCH_CONSTRAINT;
                    if (enumC2718b != enumC2718b32) {
                    }
                    if (enumC2718b2 != enumC2718b32) {
                    }
                    C2716qj.EnumC2718b enumC2718b42 = C2716qj.EnumC2718b.MATCH_PARENT;
                    if (enumC2718b2 != enumC2718b42) {
                    }
                    if (enumC2718b != enumC2718b42) {
                    }
                    if (z8) {
                    }
                    if (z9) {
                    }
                    C0175b c0175b2 = (C0175b) view.getLayoutParams();
                    if (c1388a.f10995j) {
                    }
                    if (view instanceof qu1) {
                    }
                    view.measure(i, makeMeasureSpec);
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    int baseline22 = view.getBaseline();
                    if (z) {
                    }
                    if (z2) {
                    }
                    int i122 = c2716qj.f24043o;
                    if (i122 <= 0) {
                    }
                    i4 = c2716qj.f24045p;
                    if (i4 > 0) {
                    }
                    int i132 = c2716qj.f24049r;
                    if (i132 <= 0) {
                    }
                    i5 = c2716qj.f24051s;
                    if (i5 > 0) {
                    }
                    if (!z3) {
                    }
                    if (z4) {
                        max2 = (int) ((max / c2716qj.f24005Q) + 0.5f);
                    }
                    if (measuredWidth == max) {
                    }
                    if (measuredWidth != max) {
                    }
                    if (measuredHeight != max2) {
                    }
                    view.measure(i, makeMeasureSpec);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    i6 = -1;
                    if (baseline == i6) {
                    }
                    c1388a.f10994i = measuredWidth2 == c1388a.f10988c || measuredHeight2 != c1388a.f10989d;
                    if (!c0175b2.f914Y) {
                    }
                    if (z5) {
                        c1388a.f10994i = true;
                    }
                    c1388a.f10990e = measuredWidth2;
                    c1388a.f10991f = measuredHeight2;
                    c1388a.f10993h = z5;
                    c1388a.f10992g = baseline;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                c2716qj.f24029h[3] = i8;
                z2 = false;
                C2716qj.EnumC2718b enumC2718b322 = C2716qj.EnumC2718b.MATCH_CONSTRAINT;
                if (enumC2718b != enumC2718b322) {
                }
                if (enumC2718b2 != enumC2718b322) {
                }
                C2716qj.EnumC2718b enumC2718b422 = C2716qj.EnumC2718b.MATCH_PARENT;
                if (enumC2718b2 != enumC2718b422) {
                }
                if (enumC2718b != enumC2718b422) {
                }
                if (z8) {
                }
                if (z9) {
                }
                C0175b c0175b22 = (C0175b) view.getLayoutParams();
                if (c1388a.f10995j) {
                }
                if (view instanceof qu1) {
                }
                view.measure(i, makeMeasureSpec);
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                int baseline222 = view.getBaseline();
                if (z) {
                }
                if (z2) {
                }
                int i1222 = c2716qj.f24043o;
                if (i1222 <= 0) {
                }
                i4 = c2716qj.f24045p;
                if (i4 > 0) {
                }
                int i1322 = c2716qj.f24049r;
                if (i1322 <= 0) {
                }
                i5 = c2716qj.f24051s;
                if (i5 > 0) {
                }
                if (!z3) {
                }
                if (z4) {
                }
                if (measuredWidth == max) {
                }
                if (measuredWidth != max) {
                }
                if (measuredHeight != max2) {
                }
                view.measure(i, makeMeasureSpec);
                measuredWidth2 = view.getMeasuredWidth();
                measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                i6 = -1;
                if (baseline == i6) {
                }
                c1388a.f10994i = measuredWidth2 == c1388a.f10988c || measuredHeight2 != c1388a.f10989d;
                if (!c0175b22.f914Y) {
                }
                if (z5) {
                }
                c1388a.f10990e = measuredWidth2;
                c1388a.f10991f = measuredHeight2;
                c1388a.f10993h = z5;
                c1388a.f10992g = baseline;
            }
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
            c2716qj.f24029h[2] = i7;
            i = makeMeasureSpec2;
            z = false;
            i2 = iArr[enumC2718b2.ordinal()];
            if (i2 == 1) {
            }
            z2 = false;
            C2716qj.EnumC2718b enumC2718b3222 = C2716qj.EnumC2718b.MATCH_CONSTRAINT;
            if (enumC2718b != enumC2718b3222) {
            }
            if (enumC2718b2 != enumC2718b3222) {
            }
            C2716qj.EnumC2718b enumC2718b4222 = C2716qj.EnumC2718b.MATCH_PARENT;
            if (enumC2718b2 != enumC2718b4222) {
            }
            if (enumC2718b != enumC2718b4222) {
            }
            if (z8) {
            }
            if (z9) {
            }
            C0175b c0175b222 = (C0175b) view.getLayoutParams();
            if (c1388a.f10995j) {
            }
            if (view instanceof qu1) {
            }
            view.measure(i, makeMeasureSpec);
            measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
            int baseline2222 = view.getBaseline();
            if (z) {
            }
            if (z2) {
            }
            int i12222 = c2716qj.f24043o;
            if (i12222 <= 0) {
            }
            i4 = c2716qj.f24045p;
            if (i4 > 0) {
            }
            int i13222 = c2716qj.f24049r;
            if (i13222 <= 0) {
            }
            i5 = c2716qj.f24051s;
            if (i5 > 0) {
            }
            if (!z3) {
            }
            if (z4) {
            }
            if (measuredWidth == max) {
            }
            if (measuredWidth != max) {
            }
            if (measuredHeight != max2) {
            }
            view.measure(i, makeMeasureSpec);
            measuredWidth2 = view.getMeasuredWidth();
            measuredHeight2 = view.getMeasuredHeight();
            baseline = view.getBaseline();
            i6 = -1;
            if (baseline == i6) {
            }
            c1388a.f10994i = measuredWidth2 == c1388a.f10988c || measuredHeight2 != c1388a.f10989d;
            if (!c0175b222.f914Y) {
            }
            if (z5) {
            }
            c1388a.f10990e = measuredWidth2;
            c1388a.f10991f = measuredHeight2;
            c1388a.f10993h = z5;
            c1388a.f10992g = baseline;
        }

        /* renamed from: c */
        public void m29877c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f959b = i3;
            this.f960c = i4;
            this.f961d = i5;
            this.f962e = i6;
            this.f963f = i;
            this.f964g = i2;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f878p = new SparseArray<>();
        this.f879q = new ArrayList<>(4);
        this.f880r = new C2865rj();
        this.f881s = 0;
        this.f882t = 0;
        this.f883u = Integer.MAX_VALUE;
        this.f884v = Integer.MAX_VALUE;
        this.f885w = true;
        this.f886x = 263;
        this.f887y = null;
        this.f888z = null;
        this.f866A = -1;
        this.f867B = new HashMap<>();
        this.f868C = -1;
        this.f869D = -1;
        this.f870E = -1;
        this.f871F = -1;
        this.f872G = 0;
        this.f873H = 0;
        this.f874I = new SparseArray<>();
        this.f875J = new C0177c(this);
        this.f876K = 0;
        this.f877L = 0;
        m29888j(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f878p = new SparseArray<>();
        this.f879q = new ArrayList<>(4);
        this.f880r = new C2865rj();
        this.f881s = 0;
        this.f882t = 0;
        this.f883u = Integer.MAX_VALUE;
        this.f884v = Integer.MAX_VALUE;
        this.f885w = true;
        this.f886x = 263;
        this.f887y = null;
        this.f888z = null;
        this.f866A = -1;
        this.f867B = new HashMap<>();
        this.f868C = -1;
        this.f869D = -1;
        this.f870E = -1;
        this.f871F = -1;
        this.f872G = 0;
        this.f873H = 0;
        this.f874I = new SparseArray<>();
        this.f875J = new C0177c(this);
        this.f876K = 0;
        this.f877L = 0;
        m29888j(attributeSet, i, 0);
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
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m29895c(boolean z, View view, C2716qj c2716qj, C0175b c0175b, SparseArray<C2716qj> sparseArray) {
        float f;
        C2716qj c2716qj2;
        C2041lj.EnumC2043b enumC2043b;
        C2041lj.EnumC2043b enumC2043b2;
        int i;
        C2716qj c2716qj3;
        C2716qj c2716qj4;
        C2041lj.EnumC2043b enumC2043b3;
        int i2;
        C2716qj c2716qj5;
        C2041lj.EnumC2043b enumC2043b4;
        int i3;
        C2716qj c2716qj6;
        C2041lj.EnumC2043b enumC2043b5;
        C2041lj.EnumC2043b enumC2043b6;
        int i4;
        int i5;
        C2716qj c2716qj7;
        int i6;
        C2716qj c2716qj8;
        C2041lj.EnumC2043b enumC2043b7;
        int i7;
        int i8;
        C2716qj c2716qj9;
        C2041lj.EnumC2043b enumC2043b8;
        int i9;
        float f2;
        float f3;
        int i10;
        c0175b.m29878a();
        c0175b.f945o0 = false;
        c2716qj.m12468A0(view.getVisibility());
        if (c0175b.f919b0) {
            c2716qj.m12416m0(true);
            c2716qj.m12468A0(8);
        }
        c2716qj.m12439Z(view);
        if (view instanceof AbstractC0181b) {
            ((AbstractC0181b) view).mo29866h(c2716qj, this.f880r.m11259W0());
        }
        if (c0175b.f915Z) {
            k80 k80Var = (k80) c2716qj;
            int i11 = c0175b.f937k0;
            int i12 = c0175b.f939l0;
            float f4 = c0175b.f941m0;
            if (f4 != -1.0f) {
                k80Var.m17975N0(f4);
                return;
            } else if (i11 != -1) {
                k80Var.m17977L0(i11);
                return;
            } else if (i12 != -1) {
                k80Var.m17976M0(i12);
                return;
            } else {
                return;
            }
        }
        int i13 = c0175b.f923d0;
        int i14 = c0175b.f925e0;
        int i15 = c0175b.f927f0;
        int i16 = c0175b.f929g0;
        int i17 = c0175b.f931h0;
        int i18 = c0175b.f933i0;
        float f5 = c0175b.f935j0;
        int i19 = c0175b.f940m;
        if (i19 != -1) {
            C2716qj c2716qj10 = sparseArray.get(i19);
            if (c2716qj10 != null) {
                c2716qj.m12425i(c2716qj10, c0175b.f944o, c0175b.f942n);
            }
        } else if (i13 != -1) {
            c2716qj2 = sparseArray.get(i13);
            if (c2716qj2 != null) {
                enumC2043b2 = C2041lj.EnumC2043b.LEFT;
                c2716qj3 = c2716qj;
                enumC2043b = enumC2043b2;
                f = f5;
                i = ((ViewGroup.MarginLayoutParams) c0175b).leftMargin;
                c2716qj3.m12446R(enumC2043b, c2716qj2, enumC2043b2, i, i17);
                if (i15 != -1) {
                    c2716qj4 = sparseArray.get(i15);
                    if (c2716qj4 != null) {
                        enumC2043b4 = C2041lj.EnumC2043b.RIGHT;
                        enumC2043b3 = C2041lj.EnumC2043b.LEFT;
                        i2 = ((ViewGroup.MarginLayoutParams) c0175b).rightMargin;
                        c2716qj5 = c2716qj;
                        c2716qj5.m12446R(enumC2043b4, c2716qj4, enumC2043b3, i2, i18);
                    }
                    i3 = c0175b.f930h;
                    if (i3 == -1) {
                        c2716qj6 = sparseArray.get(i3);
                        if (c2716qj6 != null) {
                            enumC2043b6 = C2041lj.EnumC2043b.TOP;
                            i4 = ((ViewGroup.MarginLayoutParams) c0175b).topMargin;
                            i5 = c0175b.f951u;
                            c2716qj7 = c2716qj;
                            enumC2043b5 = enumC2043b6;
                            c2716qj7.m12446R(enumC2043b5, c2716qj6, enumC2043b6, i4, i5);
                        }
                        i6 = c0175b.f934j;
                        if (i6 == -1) {
                            c2716qj8 = sparseArray.get(i6);
                            if (c2716qj8 != null) {
                                enumC2043b8 = C2041lj.EnumC2043b.BOTTOM;
                                enumC2043b7 = C2041lj.EnumC2043b.TOP;
                                i7 = ((ViewGroup.MarginLayoutParams) c0175b).bottomMargin;
                                i8 = c0175b.f953w;
                                c2716qj9 = c2716qj;
                                c2716qj9.m12446R(enumC2043b8, c2716qj8, enumC2043b7, i7, i8);
                            }
                            i9 = c0175b.f938l;
                            if (i9 != -1) {
                                View view2 = this.f878p.get(i9);
                                C2716qj c2716qj11 = sparseArray.get(c0175b.f938l);
                                if (c2716qj11 != null && view2 != null && (view2.getLayoutParams() instanceof C0175b)) {
                                    C0175b c0175b2 = (C0175b) view2.getLayoutParams();
                                    c0175b.f914Y = true;
                                    c0175b2.f914Y = true;
                                    C2041lj.EnumC2043b enumC2043b9 = C2041lj.EnumC2043b.BASELINE;
                                    c2716qj.mo12421k(enumC2043b9).m16931a(c2716qj11.mo12421k(enumC2043b9), 0, -1, true);
                                    c2716qj.m12434d0(true);
                                    c0175b2.f943n0.m12434d0(true);
                                    c2716qj.mo12421k(C2041lj.EnumC2043b.TOP).m16921k();
                                    c2716qj.mo12421k(C2041lj.EnumC2043b.BOTTOM).m16921k();
                                }
                            }
                            f2 = f;
                            if (f2 >= 0.0f) {
                                c2716qj.m12430f0(f2);
                            }
                            f3 = c0175b.f890A;
                            if (f3 >= 0.0f) {
                                c2716qj.m12400u0(f3);
                            }
                        } else {
                            int i20 = c0175b.f936k;
                            if (i20 != -1 && (c2716qj8 = sparseArray.get(i20)) != null) {
                                enumC2043b7 = C2041lj.EnumC2043b.BOTTOM;
                                i7 = ((ViewGroup.MarginLayoutParams) c0175b).bottomMargin;
                                i8 = c0175b.f953w;
                                c2716qj9 = c2716qj;
                                enumC2043b8 = enumC2043b7;
                                c2716qj9.m12446R(enumC2043b8, c2716qj8, enumC2043b7, i7, i8);
                            }
                            i9 = c0175b.f938l;
                            if (i9 != -1) {
                            }
                            f2 = f;
                            if (f2 >= 0.0f) {
                            }
                            f3 = c0175b.f890A;
                            if (f3 >= 0.0f) {
                            }
                        }
                    } else {
                        int i21 = c0175b.f932i;
                        if (i21 != -1 && (c2716qj6 = sparseArray.get(i21)) != null) {
                            enumC2043b5 = C2041lj.EnumC2043b.TOP;
                            enumC2043b6 = C2041lj.EnumC2043b.BOTTOM;
                            i4 = ((ViewGroup.MarginLayoutParams) c0175b).topMargin;
                            i5 = c0175b.f951u;
                            c2716qj7 = c2716qj;
                            c2716qj7.m12446R(enumC2043b5, c2716qj6, enumC2043b6, i4, i5);
                        }
                        i6 = c0175b.f934j;
                        if (i6 == -1) {
                        }
                    }
                } else {
                    if (i16 != -1 && (c2716qj4 = sparseArray.get(i16)) != null) {
                        enumC2043b3 = C2041lj.EnumC2043b.RIGHT;
                        i2 = ((ViewGroup.MarginLayoutParams) c0175b).rightMargin;
                        c2716qj5 = c2716qj;
                        enumC2043b4 = enumC2043b3;
                        c2716qj5.m12446R(enumC2043b4, c2716qj4, enumC2043b3, i2, i18);
                    }
                    i3 = c0175b.f930h;
                    if (i3 == -1) {
                    }
                }
            } else {
                f = f5;
                if (i15 != -1) {
                }
            }
        } else {
            f = f5;
            if (i14 != -1 && (c2716qj2 = sparseArray.get(i14)) != null) {
                enumC2043b = C2041lj.EnumC2043b.LEFT;
                enumC2043b2 = C2041lj.EnumC2043b.RIGHT;
                i = ((ViewGroup.MarginLayoutParams) c0175b).leftMargin;
                c2716qj3 = c2716qj;
                c2716qj3.m12446R(enumC2043b, c2716qj2, enumC2043b2, i, i17);
            }
            if (i15 != -1) {
            }
        }
        if (z && ((i10 = c0175b.f906Q) != -1 || c0175b.f907R != -1)) {
            c2716qj.m12404s0(i10, c0175b.f907R);
        }
        if (c0175b.f912W) {
            c2716qj.m12424i0(C2716qj.EnumC2718b.FIXED);
            c2716qj.m12466B0(((ViewGroup.MarginLayoutParams) c0175b).width);
            if (((ViewGroup.MarginLayoutParams) c0175b).width == -2) {
                c2716qj.m12424i0(C2716qj.EnumC2718b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) c0175b).width == -1) {
            c2716qj.m12424i0(c0175b.f909T ? C2716qj.EnumC2718b.MATCH_CONSTRAINT : C2716qj.EnumC2718b.MATCH_PARENT);
            c2716qj.mo12421k(C2041lj.EnumC2043b.LEFT).f17434e = ((ViewGroup.MarginLayoutParams) c0175b).leftMargin;
            c2716qj.mo12421k(C2041lj.EnumC2043b.RIGHT).f17434e = ((ViewGroup.MarginLayoutParams) c0175b).rightMargin;
        } else {
            c2716qj.m12424i0(C2716qj.EnumC2718b.MATCH_CONSTRAINT);
            c2716qj.m12466B0(0);
        }
        if (c0175b.f913X) {
            c2716qj.m12394x0(C2716qj.EnumC2718b.FIXED);
            c2716qj.m12432e0(((ViewGroup.MarginLayoutParams) c0175b).height);
            if (((ViewGroup.MarginLayoutParams) c0175b).height == -2) {
                c2716qj.m12394x0(C2716qj.EnumC2718b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) c0175b).height == -1) {
            c2716qj.m12394x0(c0175b.f910U ? C2716qj.EnumC2718b.MATCH_CONSTRAINT : C2716qj.EnumC2718b.MATCH_PARENT);
            c2716qj.mo12421k(C2041lj.EnumC2043b.TOP).f17434e = ((ViewGroup.MarginLayoutParams) c0175b).topMargin;
            c2716qj.mo12421k(C2041lj.EnumC2043b.BOTTOM).f17434e = ((ViewGroup.MarginLayoutParams) c0175b).bottomMargin;
        } else {
            c2716qj.m12394x0(C2716qj.EnumC2718b.MATCH_CONSTRAINT);
            c2716qj.m12432e0(0);
        }
        c2716qj.m12437b0(c0175b.f891B);
        c2716qj.m12420k0(c0175b.f894E);
        c2716qj.m12390z0(c0175b.f895F);
        c2716qj.m12428g0(c0175b.f896G);
        c2716qj.m12398v0(c0175b.f897H);
        c2716qj.m12422j0(c0175b.f898I, c0175b.f900K, c0175b.f902M, c0175b.f904O);
        c2716qj.m12392y0(c0175b.f899J, c0175b.f901L, c0175b.f903N, c0175b.f905P);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0175b;
    }

    @Override // android.view.ViewGroup
    /* renamed from: d */
    public C0175b generateDefaultLayoutParams() {
        return new C0175b(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<AbstractC0181b> arrayList = this.f879q;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.f879q.get(i).m29863k(this);
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
    public C0175b generateLayoutParams(AttributeSet attributeSet) {
        return new C0175b(getContext(), attributeSet);
    }

    /* renamed from: f */
    public Object m29892f(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.f867B;
            if (hashMap == null || !hashMap.containsKey(str)) {
                return null;
            }
            return this.f867B.get(str);
        }
        return null;
    }

    @Override // android.view.View
    public void forceLayout() {
        m29886l();
        super.forceLayout();
    }

    /* renamed from: g */
    public final C2716qj m29891g(int i) {
        if (i == 0) {
            return this.f880r;
        }
        View view = this.f878p.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f880r;
        }
        if (view == null) {
            return null;
        }
        return ((C0175b) view.getLayoutParams()).f943n0;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0175b(layoutParams);
    }

    public int getMaxHeight() {
        return this.f884v;
    }

    public int getMaxWidth() {
        return this.f883u;
    }

    public int getMinHeight() {
        return this.f882t;
    }

    public int getMinWidth() {
        return this.f881s;
    }

    public int getOptimizationLevel() {
        return this.f880r.m11264S0();
    }

    /* renamed from: h */
    public View m29890h(int i) {
        return this.f878p.get(i);
    }

    /* renamed from: i */
    public final C2716qj m29889i(View view) {
        if (view == this) {
            return this.f880r;
        }
        if (view == null) {
            return null;
        }
        return ((C0175b) view.getLayoutParams()).f943n0;
    }

    /* renamed from: j */
    public final void m29888j(AttributeSet attributeSet, int i, int i2) {
        this.f880r.m12439Z(this);
        this.f880r.m11254b1(this.f875J);
        this.f878p.put(getId(), this);
        this.f887y = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p21.f22371a1, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == p21.f22406f1) {
                    this.f881s = obtainStyledAttributes.getDimensionPixelOffset(index, this.f881s);
                } else if (index == p21.f22413g1) {
                    this.f882t = obtainStyledAttributes.getDimensionPixelOffset(index, this.f882t);
                } else if (index == p21.f22392d1) {
                    this.f883u = obtainStyledAttributes.getDimensionPixelOffset(index, this.f883u);
                } else if (index == p21.f22399e1) {
                    this.f884v = obtainStyledAttributes.getDimensionPixelOffset(index, this.f884v);
                } else if (index == p21.f22453m2) {
                    this.f886x = obtainStyledAttributes.getInt(index, this.f886x);
                } else if (index == p21.f22458n1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m29885m(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f888z = null;
                        }
                    }
                } else if (index == p21.f22446l1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0182c c0182c = new C0182c();
                        this.f887y = c0182c;
                        c0182c.m29848m(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f887y = null;
                    }
                    this.f866A = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f880r.m11253c1(this.f886x);
    }

    /* renamed from: k */
    public boolean m29887k() {
        return ((getContext().getApplicationInfo().flags & NativeConstants.SSL_OP_CIPHER_SERVER_PREFERENCE) != 0) && 1 == getLayoutDirection();
    }

    /* renamed from: l */
    public final void m29886l() {
        this.f885w = true;
        this.f868C = -1;
        this.f869D = -1;
        this.f870E = -1;
        this.f871F = -1;
        this.f872G = 0;
        this.f873H = 0;
    }

    /* renamed from: m */
    public void m29885m(int i) {
        this.f888z = new C2294nj(getContext(), this, i);
    }

    /* renamed from: n */
    public void m29884n(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C0177c c0177c = this.f875J;
        int i5 = c0177c.f962e;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i3 + c0177c.f961d, i, 0);
        int min = Math.min(this.f883u, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f884v, ViewGroup.resolveSizeAndState(i4 + i5, i2, 0) & 16777215);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f868C = min;
        this.f869D = min2;
    }

    /* renamed from: o */
    public void m29883o(C2865rj c2865rj, int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i4 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f875J.m29877c(i2, i3, max, max2, paddingWidth, i4);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        int max5 = (max3 > 0 || max4 > 0) ? m29887k() ? max4 : max3 : Math.max(0, getPaddingLeft());
        int i5 = size - paddingWidth;
        int i6 = size2 - i4;
        m29880r(c2865rj, mode, i5, mode2, i6);
        c2865rj.m11257Y0(i, mode, i5, mode2, i6, this.f868C, this.f869D, max5, max);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0175b c0175b = (C0175b) childAt.getLayoutParams();
            C2716qj c2716qj = c0175b.f943n0;
            if ((childAt.getVisibility() != 8 || c0175b.f915Z || c0175b.f917a0 || c0175b.f921c0 || isInEditMode) && !c0175b.f919b0) {
                int m12449O = c2716qj.m12449O();
                int m12448P = c2716qj.m12448P();
                int m12450N = c2716qj.m12450N() + m12449O;
                int m12403t = c2716qj.m12403t() + m12448P;
                childAt.layout(m12449O, m12448P, m12450N, m12403t);
                if ((childAt instanceof C0190e) && (content = ((C0190e) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(m12449O, m12448P, m12450N, m12403t);
                }
            }
        }
        int size = this.f879q.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.f879q.get(i6).mo29865i(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        this.f876K = i;
        this.f877L = i2;
        this.f880r.m11252d1(m29887k());
        if (this.f885w) {
            this.f885w = false;
            if (m29879s()) {
                this.f880r.m11250f1();
            }
        }
        m29883o(this.f880r, this.f886x, i, i2);
        m29884n(i, i2, this.f880r.m12450N(), this.f880r.m12403t(), this.f880r.m11258X0(), this.f880r.m11261V0());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C2716qj m29889i = m29889i(view);
        if ((view instanceof Guideline) && !(m29889i instanceof k80)) {
            C0175b c0175b = (C0175b) view.getLayoutParams();
            k80 k80Var = new k80();
            c0175b.f943n0 = k80Var;
            c0175b.f915Z = true;
            k80Var.m17974O0(c0175b.f908S);
        }
        if (view instanceof AbstractC0181b) {
            AbstractC0181b abstractC0181b = (AbstractC0181b) view;
            abstractC0181b.m29861m();
            ((C0175b) view.getLayoutParams()).f917a0 = true;
            if (!this.f879q.contains(abstractC0181b)) {
                this.f879q.add(abstractC0181b);
            }
        }
        this.f878p.put(view.getId(), view);
        this.f885w = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f878p.remove(view.getId());
        this.f880r.m18180I0(m29889i(view));
        this.f879q.remove(view);
        this.f885w = true;
    }

    /* renamed from: p */
    public final void m29882p() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C2716qj m29889i = m29889i(getChildAt(i));
            if (m29889i != null) {
                m29889i.mo11260W();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    m29881q(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    m29891g(childAt.getId()).m12438a0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f866A != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.f866A && (childAt2 instanceof C0188d)) {
                    this.f887y = ((C0188d) childAt2).getConstraintSet();
                }
            }
        }
        C0182c c0182c = this.f887y;
        if (c0182c != null) {
            c0182c.m29857d(this, true);
        }
        this.f880r.m18179J0();
        int size = this.f879q.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.f879q.get(i4).m29862l(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof C0190e) {
                ((C0190e) childAt3).m29825b(this);
            }
        }
        this.f874I.clear();
        this.f874I.put(0, this.f880r);
        this.f874I.put(getId(), this.f880r);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.f874I.put(childAt4.getId(), m29889i(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            C2716qj m29889i2 = m29889i(childAt5);
            if (m29889i2 != null) {
                C0175b c0175b = (C0175b) childAt5.getLayoutParams();
                this.f880r.m18178c(m29889i2);
                m29895c(isInEditMode, childAt5, m29889i2, c0175b, this.f874I);
            }
        }
    }

    /* renamed from: q */
    public void m29881q(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f867B == null) {
                this.f867B = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f867B.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r3 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r3 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        r10 = java.lang.Math.max(0, r7.f881s);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
        if (r3 == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
        if (r3 == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
        r12 = java.lang.Math.max(0, r7.f882t);
     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m29880r(C2865rj c2865rj, int i, int i2, int i3, int i4) {
        C2716qj.EnumC2718b enumC2718b;
        C0177c c0177c = this.f875J;
        int i5 = c0177c.f962e;
        int i6 = c0177c.f961d;
        C2716qj.EnumC2718b enumC2718b2 = C2716qj.EnumC2718b.FIXED;
        int childCount = getChildCount();
        if (i != Integer.MIN_VALUE) {
            if (i == 0) {
                enumC2718b = C2716qj.EnumC2718b.WRAP_CONTENT;
            } else if (i != 1073741824) {
                enumC2718b = enumC2718b2;
            } else {
                i2 = Math.min(this.f883u - i6, i2);
                enumC2718b = enumC2718b2;
            }
            i2 = 0;
        } else {
            enumC2718b = C2716qj.EnumC2718b.WRAP_CONTENT;
        }
        if (i3 != Integer.MIN_VALUE) {
            if (i3 == 0) {
                enumC2718b2 = C2716qj.EnumC2718b.WRAP_CONTENT;
            } else if (i3 == 1073741824) {
                i4 = Math.min(this.f884v - i5, i4);
            }
            i4 = 0;
        } else {
            enumC2718b2 = C2716qj.EnumC2718b.WRAP_CONTENT;
        }
        if (i2 != c2865rj.m12450N() || i4 != c2865rj.m12403t()) {
            c2865rj.m11262U0();
        }
        c2865rj.m12464C0(0);
        c2865rj.m12462D0(0);
        c2865rj.m12410p0(this.f883u - i6);
        c2865rj.m12412o0(this.f884v - i5);
        c2865rj.m12406r0(0);
        c2865rj.m12408q0(0);
        c2865rj.m12424i0(enumC2718b);
        c2865rj.m12466B0(i2);
        c2865rj.m12394x0(enumC2718b2);
        c2865rj.m12432e0(i4);
        c2865rj.m12406r0(this.f881s - i6);
        c2865rj.m12408q0(this.f882t - i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        m29886l();
        super.requestLayout();
    }

    /* renamed from: s */
    public final boolean m29879s() {
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
            m29882p();
        }
        return z;
    }

    public void setConstraintSet(C0182c c0182c) {
        this.f887y = c0182c;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.f878p.remove(getId());
        super.setId(i);
        this.f878p.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f884v) {
            return;
        }
        this.f884v = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f883u) {
            return;
        }
        this.f883u = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f882t) {
            return;
        }
        this.f882t = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f881s) {
            return;
        }
        this.f881s = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC3080tj abstractC3080tj) {
        C2294nj c2294nj = this.f888z;
        if (c2294nj != null) {
            c2294nj.m15156c(abstractC3080tj);
        }
    }

    public void setOptimizationLevel(int i) {
        this.f886x = i;
        this.f880r.m11253c1(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
