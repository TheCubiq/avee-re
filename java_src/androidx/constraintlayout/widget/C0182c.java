package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0188d;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.daaw.C2370nv;
import com.daaw.C3458wp;
import com.daaw.p11;
import com.daaw.p21;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: androidx.constraintlayout.widget.c */
/* loaded from: classes.dex */
public class C0182c {

    /* renamed from: d */
    public static final int[] f990d = {0, 4, 8};

    /* renamed from: e */
    public static SparseIntArray f991e;

    /* renamed from: a */
    public HashMap<String, C0178a> f992a = new HashMap<>();

    /* renamed from: b */
    public boolean f993b = true;

    /* renamed from: c */
    public HashMap<Integer, C0183a> f994c = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.c$a */
    /* loaded from: classes.dex */
    public static class C0183a {

        /* renamed from: a */
        public int f995a;

        /* renamed from: b */
        public final C0186d f996b = new C0186d();

        /* renamed from: c */
        public final C0185c f997c = new C0185c();

        /* renamed from: d */
        public final C0184b f998d = new C0184b();

        /* renamed from: e */
        public final C0187e f999e = new C0187e();

        /* renamed from: f */
        public HashMap<String, C0178a> f1000f = new HashMap<>();

        /* renamed from: d */
        public void m29841d(ConstraintLayout.C0175b c0175b) {
            C0184b c0184b = this.f998d;
            c0175b.f922d = c0184b.f1042h;
            c0175b.f924e = c0184b.f1044i;
            c0175b.f926f = c0184b.f1046j;
            c0175b.f928g = c0184b.f1048k;
            c0175b.f930h = c0184b.f1049l;
            c0175b.f932i = c0184b.f1050m;
            c0175b.f934j = c0184b.f1051n;
            c0175b.f936k = c0184b.f1052o;
            c0175b.f938l = c0184b.f1053p;
            c0175b.f946p = c0184b.f1054q;
            c0175b.f947q = c0184b.f1055r;
            c0175b.f948r = c0184b.f1056s;
            c0175b.f949s = c0184b.f1057t;
            ((ViewGroup.MarginLayoutParams) c0175b).leftMargin = c0184b.f1005D;
            ((ViewGroup.MarginLayoutParams) c0175b).rightMargin = c0184b.f1006E;
            ((ViewGroup.MarginLayoutParams) c0175b).topMargin = c0184b.f1007F;
            ((ViewGroup.MarginLayoutParams) c0175b).bottomMargin = c0184b.f1008G;
            c0175b.f954x = c0184b.f1016O;
            c0175b.f955y = c0184b.f1015N;
            c0175b.f951u = c0184b.f1012K;
            c0175b.f953w = c0184b.f1014M;
            c0175b.f956z = c0184b.f1058u;
            c0175b.f890A = c0184b.f1059v;
            c0175b.f940m = c0184b.f1061x;
            c0175b.f942n = c0184b.f1062y;
            c0175b.f944o = c0184b.f1063z;
            c0175b.f891B = c0184b.f1060w;
            c0175b.f906Q = c0184b.f1002A;
            c0175b.f907R = c0184b.f1003B;
            c0175b.f895F = c0184b.f1017P;
            c0175b.f894E = c0184b.f1018Q;
            c0175b.f897H = c0184b.f1020S;
            c0175b.f896G = c0184b.f1019R;
            c0175b.f909T = c0184b.f1043h0;
            c0175b.f910U = c0184b.f1045i0;
            c0175b.f898I = c0184b.f1021T;
            c0175b.f899J = c0184b.f1022U;
            c0175b.f902M = c0184b.f1023V;
            c0175b.f903N = c0184b.f1024W;
            c0175b.f900K = c0184b.f1025X;
            c0175b.f901L = c0184b.f1026Y;
            c0175b.f904O = c0184b.f1027Z;
            c0175b.f905P = c0184b.f1029a0;
            c0175b.f908S = c0184b.f1004C;
            c0175b.f920c = c0184b.f1040g;
            c0175b.f916a = c0184b.f1036e;
            c0175b.f918b = c0184b.f1038f;
            ((ViewGroup.MarginLayoutParams) c0175b).width = c0184b.f1032c;
            ((ViewGroup.MarginLayoutParams) c0175b).height = c0184b.f1034d;
            String str = c0184b.f1041g0;
            if (str != null) {
                c0175b.f911V = str;
            }
            c0175b.setMarginStart(c0184b.f1010I);
            c0175b.setMarginEnd(this.f998d.f1009H);
            c0175b.m29878a();
        }

        /* renamed from: e */
        public C0183a clone() {
            C0183a c0183a = new C0183a();
            c0183a.f998d.m29836a(this.f998d);
            c0183a.f997c.m29834a(this.f997c);
            c0183a.f996b.m29832a(this.f996b);
            c0183a.f999e.m29830a(this.f999e);
            c0183a.f995a = this.f995a;
            return c0183a;
        }

        /* renamed from: f */
        public final void m29839f(int i, ConstraintLayout.C0175b c0175b) {
            this.f995a = i;
            C0184b c0184b = this.f998d;
            c0184b.f1042h = c0175b.f922d;
            c0184b.f1044i = c0175b.f924e;
            c0184b.f1046j = c0175b.f926f;
            c0184b.f1048k = c0175b.f928g;
            c0184b.f1049l = c0175b.f930h;
            c0184b.f1050m = c0175b.f932i;
            c0184b.f1051n = c0175b.f934j;
            c0184b.f1052o = c0175b.f936k;
            c0184b.f1053p = c0175b.f938l;
            c0184b.f1054q = c0175b.f946p;
            c0184b.f1055r = c0175b.f947q;
            c0184b.f1056s = c0175b.f948r;
            c0184b.f1057t = c0175b.f949s;
            c0184b.f1058u = c0175b.f956z;
            c0184b.f1059v = c0175b.f890A;
            c0184b.f1060w = c0175b.f891B;
            c0184b.f1061x = c0175b.f940m;
            c0184b.f1062y = c0175b.f942n;
            c0184b.f1063z = c0175b.f944o;
            c0184b.f1002A = c0175b.f906Q;
            c0184b.f1003B = c0175b.f907R;
            c0184b.f1004C = c0175b.f908S;
            c0184b.f1040g = c0175b.f920c;
            c0184b.f1036e = c0175b.f916a;
            c0184b.f1038f = c0175b.f918b;
            c0184b.f1032c = ((ViewGroup.MarginLayoutParams) c0175b).width;
            c0184b.f1034d = ((ViewGroup.MarginLayoutParams) c0175b).height;
            c0184b.f1005D = ((ViewGroup.MarginLayoutParams) c0175b).leftMargin;
            c0184b.f1006E = ((ViewGroup.MarginLayoutParams) c0175b).rightMargin;
            c0184b.f1007F = ((ViewGroup.MarginLayoutParams) c0175b).topMargin;
            c0184b.f1008G = ((ViewGroup.MarginLayoutParams) c0175b).bottomMargin;
            c0184b.f1017P = c0175b.f895F;
            c0184b.f1018Q = c0175b.f894E;
            c0184b.f1020S = c0175b.f897H;
            c0184b.f1019R = c0175b.f896G;
            c0184b.f1043h0 = c0175b.f909T;
            c0184b.f1045i0 = c0175b.f910U;
            c0184b.f1021T = c0175b.f898I;
            c0184b.f1022U = c0175b.f899J;
            c0184b.f1023V = c0175b.f902M;
            c0184b.f1024W = c0175b.f903N;
            c0184b.f1025X = c0175b.f900K;
            c0184b.f1026Y = c0175b.f901L;
            c0184b.f1027Z = c0175b.f904O;
            c0184b.f1029a0 = c0175b.f905P;
            c0184b.f1041g0 = c0175b.f911V;
            c0184b.f1012K = c0175b.f951u;
            c0184b.f1014M = c0175b.f953w;
            c0184b.f1011J = c0175b.f950t;
            c0184b.f1013L = c0175b.f952v;
            c0184b.f1016O = c0175b.f954x;
            c0184b.f1015N = c0175b.f955y;
            c0184b.f1009H = c0175b.getMarginEnd();
            this.f998d.f1010I = c0175b.getMarginStart();
        }

        /* renamed from: g */
        public final void m29838g(int i, C0188d.C0189a c0189a) {
            m29839f(i, c0189a);
            this.f996b.f1075d = c0189a.f1094p0;
            C0187e c0187e = this.f999e;
            c0187e.f1079b = c0189a.f1097s0;
            c0187e.f1080c = c0189a.f1098t0;
            c0187e.f1081d = c0189a.f1099u0;
            c0187e.f1082e = c0189a.f1100v0;
            c0187e.f1083f = c0189a.f1101w0;
            c0187e.f1084g = c0189a.f1102x0;
            c0187e.f1085h = c0189a.f1103y0;
            c0187e.f1086i = c0189a.f1104z0;
            c0187e.f1087j = c0189a.f1092A0;
            c0187e.f1088k = c0189a.f1093B0;
            c0187e.f1090m = c0189a.f1096r0;
            c0187e.f1089l = c0189a.f1095q0;
        }

        /* renamed from: h */
        public final void m29837h(AbstractC0181b abstractC0181b, int i, C0188d.C0189a c0189a) {
            m29838g(i, c0189a);
            if (abstractC0181b instanceof Barrier) {
                C0184b c0184b = this.f998d;
                c0184b.f1035d0 = 1;
                Barrier barrier = (Barrier) abstractC0181b;
                c0184b.f1031b0 = barrier.getType();
                this.f998d.f1037e0 = barrier.getReferencedIds();
                this.f998d.f1033c0 = barrier.getMargin();
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$b */
    /* loaded from: classes.dex */
    public static class C0184b {

        /* renamed from: k0 */
        public static SparseIntArray f1001k0;

        /* renamed from: c */
        public int f1032c;

        /* renamed from: d */
        public int f1034d;

        /* renamed from: e0 */
        public int[] f1037e0;

        /* renamed from: f0 */
        public String f1039f0;

        /* renamed from: g0 */
        public String f1041g0;

        /* renamed from: a */
        public boolean f1028a = false;

        /* renamed from: b */
        public boolean f1030b = false;

        /* renamed from: e */
        public int f1036e = -1;

        /* renamed from: f */
        public int f1038f = -1;

        /* renamed from: g */
        public float f1040g = -1.0f;

        /* renamed from: h */
        public int f1042h = -1;

        /* renamed from: i */
        public int f1044i = -1;

        /* renamed from: j */
        public int f1046j = -1;

        /* renamed from: k */
        public int f1048k = -1;

        /* renamed from: l */
        public int f1049l = -1;

        /* renamed from: m */
        public int f1050m = -1;

        /* renamed from: n */
        public int f1051n = -1;

        /* renamed from: o */
        public int f1052o = -1;

        /* renamed from: p */
        public int f1053p = -1;

        /* renamed from: q */
        public int f1054q = -1;

        /* renamed from: r */
        public int f1055r = -1;

        /* renamed from: s */
        public int f1056s = -1;

        /* renamed from: t */
        public int f1057t = -1;

        /* renamed from: u */
        public float f1058u = 0.5f;

        /* renamed from: v */
        public float f1059v = 0.5f;

        /* renamed from: w */
        public String f1060w = null;

        /* renamed from: x */
        public int f1061x = -1;

        /* renamed from: y */
        public int f1062y = 0;

        /* renamed from: z */
        public float f1063z = 0.0f;

        /* renamed from: A */
        public int f1002A = -1;

        /* renamed from: B */
        public int f1003B = -1;

        /* renamed from: C */
        public int f1004C = -1;

        /* renamed from: D */
        public int f1005D = -1;

        /* renamed from: E */
        public int f1006E = -1;

        /* renamed from: F */
        public int f1007F = -1;

        /* renamed from: G */
        public int f1008G = -1;

        /* renamed from: H */
        public int f1009H = -1;

        /* renamed from: I */
        public int f1010I = -1;

        /* renamed from: J */
        public int f1011J = -1;

        /* renamed from: K */
        public int f1012K = -1;

        /* renamed from: L */
        public int f1013L = -1;

        /* renamed from: M */
        public int f1014M = -1;

        /* renamed from: N */
        public int f1015N = -1;

        /* renamed from: O */
        public int f1016O = -1;

        /* renamed from: P */
        public float f1017P = -1.0f;

        /* renamed from: Q */
        public float f1018Q = -1.0f;

        /* renamed from: R */
        public int f1019R = 0;

        /* renamed from: S */
        public int f1020S = 0;

        /* renamed from: T */
        public int f1021T = 0;

        /* renamed from: U */
        public int f1022U = 0;

        /* renamed from: V */
        public int f1023V = -1;

        /* renamed from: W */
        public int f1024W = -1;

        /* renamed from: X */
        public int f1025X = -1;

        /* renamed from: Y */
        public int f1026Y = -1;

        /* renamed from: Z */
        public float f1027Z = 1.0f;

        /* renamed from: a0 */
        public float f1029a0 = 1.0f;

        /* renamed from: b0 */
        public int f1031b0 = -1;

        /* renamed from: c0 */
        public int f1033c0 = 0;

        /* renamed from: d0 */
        public int f1035d0 = -1;

        /* renamed from: h0 */
        public boolean f1043h0 = false;

        /* renamed from: i0 */
        public boolean f1045i0 = false;

        /* renamed from: j0 */
        public boolean f1047j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1001k0 = sparseIntArray;
            sparseIntArray.append(p21.f22241E3, 24);
            f1001k0.append(p21.f22247F3, 25);
            f1001k0.append(p21.f22259H3, 28);
            f1001k0.append(p21.f22265I3, 29);
            f1001k0.append(p21.f22295N3, 35);
            f1001k0.append(p21.f22289M3, 34);
            f1001k0.append(p21.f22472p3, 4);
            f1001k0.append(p21.f22466o3, 3);
            f1001k0.append(p21.f22454m3, 1);
            f1001k0.append(p21.f22325S3, 6);
            f1001k0.append(p21.f22331T3, 7);
            f1001k0.append(p21.f22514w3, 17);
            f1001k0.append(p21.f22520x3, 18);
            f1001k0.append(p21.f22526y3, 19);
            f1001k0.append(p21.f22354X2, 26);
            f1001k0.append(p21.f22271J3, 31);
            f1001k0.append(p21.f22277K3, 32);
            f1001k0.append(p21.f22508v3, 10);
            f1001k0.append(p21.f22502u3, 9);
            f1001k0.append(p21.f22349W3, 13);
            f1001k0.append(p21.f22367Z3, 16);
            f1001k0.append(p21.f22355X3, 14);
            f1001k0.append(p21.f22337U3, 11);
            f1001k0.append(p21.f22361Y3, 15);
            f1001k0.append(p21.f22343V3, 12);
            f1001k0.append(p21.f22313Q3, 38);
            f1001k0.append(p21.f22229C3, 37);
            f1001k0.append(p21.f22223B3, 39);
            f1001k0.append(p21.f22307P3, 40);
            f1001k0.append(p21.f22217A3, 20);
            f1001k0.append(p21.f22301O3, 36);
            f1001k0.append(p21.f22496t3, 5);
            f1001k0.append(p21.f22235D3, 76);
            f1001k0.append(p21.f22283L3, 76);
            f1001k0.append(p21.f22253G3, 76);
            f1001k0.append(p21.f22460n3, 76);
            f1001k0.append(p21.f22448l3, 76);
            f1001k0.append(p21.f22373a3, 23);
            f1001k0.append(p21.f22387c3, 27);
            f1001k0.append(p21.f22401e3, 30);
            f1001k0.append(p21.f22408f3, 8);
            f1001k0.append(p21.f22380b3, 33);
            f1001k0.append(p21.f22394d3, 2);
            f1001k0.append(p21.f22360Y2, 22);
            f1001k0.append(p21.f22366Z2, 21);
            f1001k0.append(p21.f22478q3, 61);
            f1001k0.append(p21.f22490s3, 62);
            f1001k0.append(p21.f22484r3, 63);
            f1001k0.append(p21.f22319R3, 69);
            f1001k0.append(p21.f22532z3, 70);
            f1001k0.append(p21.f22436j3, 71);
            f1001k0.append(p21.f22422h3, 72);
            f1001k0.append(p21.f22429i3, 73);
            f1001k0.append(p21.f22442k3, 74);
            f1001k0.append(p21.f22415g3, 75);
        }

        /* renamed from: a */
        public void m29836a(C0184b c0184b) {
            this.f1028a = c0184b.f1028a;
            this.f1032c = c0184b.f1032c;
            this.f1030b = c0184b.f1030b;
            this.f1034d = c0184b.f1034d;
            this.f1036e = c0184b.f1036e;
            this.f1038f = c0184b.f1038f;
            this.f1040g = c0184b.f1040g;
            this.f1042h = c0184b.f1042h;
            this.f1044i = c0184b.f1044i;
            this.f1046j = c0184b.f1046j;
            this.f1048k = c0184b.f1048k;
            this.f1049l = c0184b.f1049l;
            this.f1050m = c0184b.f1050m;
            this.f1051n = c0184b.f1051n;
            this.f1052o = c0184b.f1052o;
            this.f1053p = c0184b.f1053p;
            this.f1054q = c0184b.f1054q;
            this.f1055r = c0184b.f1055r;
            this.f1056s = c0184b.f1056s;
            this.f1057t = c0184b.f1057t;
            this.f1058u = c0184b.f1058u;
            this.f1059v = c0184b.f1059v;
            this.f1060w = c0184b.f1060w;
            this.f1061x = c0184b.f1061x;
            this.f1062y = c0184b.f1062y;
            this.f1063z = c0184b.f1063z;
            this.f1002A = c0184b.f1002A;
            this.f1003B = c0184b.f1003B;
            this.f1004C = c0184b.f1004C;
            this.f1005D = c0184b.f1005D;
            this.f1006E = c0184b.f1006E;
            this.f1007F = c0184b.f1007F;
            this.f1008G = c0184b.f1008G;
            this.f1009H = c0184b.f1009H;
            this.f1010I = c0184b.f1010I;
            this.f1011J = c0184b.f1011J;
            this.f1012K = c0184b.f1012K;
            this.f1013L = c0184b.f1013L;
            this.f1014M = c0184b.f1014M;
            this.f1015N = c0184b.f1015N;
            this.f1016O = c0184b.f1016O;
            this.f1017P = c0184b.f1017P;
            this.f1018Q = c0184b.f1018Q;
            this.f1019R = c0184b.f1019R;
            this.f1020S = c0184b.f1020S;
            this.f1021T = c0184b.f1021T;
            this.f1022U = c0184b.f1022U;
            this.f1023V = c0184b.f1023V;
            this.f1024W = c0184b.f1024W;
            this.f1025X = c0184b.f1025X;
            this.f1026Y = c0184b.f1026Y;
            this.f1027Z = c0184b.f1027Z;
            this.f1029a0 = c0184b.f1029a0;
            this.f1031b0 = c0184b.f1031b0;
            this.f1033c0 = c0184b.f1033c0;
            this.f1035d0 = c0184b.f1035d0;
            this.f1041g0 = c0184b.f1041g0;
            int[] iArr = c0184b.f1037e0;
            if (iArr != null) {
                this.f1037e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f1037e0 = null;
            }
            this.f1039f0 = c0184b.f1039f0;
            this.f1043h0 = c0184b.f1043h0;
            this.f1045i0 = c0184b.f1045i0;
            this.f1047j0 = c0184b.f1047j0;
        }

        /* renamed from: b */
        public void m29835b(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            String str;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p21.f22348W2);
            this.f1030b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = f1001k0.get(index);
                if (i2 == 80) {
                    this.f1043h0 = obtainStyledAttributes.getBoolean(index, this.f1043h0);
                } else if (i2 != 81) {
                    switch (i2) {
                        case 1:
                            this.f1053p = C0182c.m29846o(obtainStyledAttributes, index, this.f1053p);
                            continue;
                        case 2:
                            this.f1008G = obtainStyledAttributes.getDimensionPixelSize(index, this.f1008G);
                            continue;
                        case 3:
                            this.f1052o = C0182c.m29846o(obtainStyledAttributes, index, this.f1052o);
                            continue;
                        case 4:
                            this.f1051n = C0182c.m29846o(obtainStyledAttributes, index, this.f1051n);
                            continue;
                        case 5:
                            this.f1060w = obtainStyledAttributes.getString(index);
                            continue;
                        case 6:
                            this.f1002A = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1002A);
                            continue;
                        case 7:
                            this.f1003B = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1003B);
                            continue;
                        case 8:
                            this.f1009H = obtainStyledAttributes.getDimensionPixelSize(index, this.f1009H);
                            continue;
                        case 9:
                            this.f1057t = C0182c.m29846o(obtainStyledAttributes, index, this.f1057t);
                            continue;
                        case 10:
                            this.f1056s = C0182c.m29846o(obtainStyledAttributes, index, this.f1056s);
                            continue;
                        case 11:
                            this.f1014M = obtainStyledAttributes.getDimensionPixelSize(index, this.f1014M);
                            continue;
                        case 12:
                            this.f1015N = obtainStyledAttributes.getDimensionPixelSize(index, this.f1015N);
                            continue;
                        case 13:
                            this.f1011J = obtainStyledAttributes.getDimensionPixelSize(index, this.f1011J);
                            continue;
                        case 14:
                            this.f1013L = obtainStyledAttributes.getDimensionPixelSize(index, this.f1013L);
                            continue;
                        case 15:
                            this.f1016O = obtainStyledAttributes.getDimensionPixelSize(index, this.f1016O);
                            continue;
                        case 16:
                            this.f1012K = obtainStyledAttributes.getDimensionPixelSize(index, this.f1012K);
                            continue;
                        case 17:
                            this.f1036e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1036e);
                            continue;
                        case 18:
                            this.f1038f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1038f);
                            continue;
                        case 19:
                            this.f1040g = obtainStyledAttributes.getFloat(index, this.f1040g);
                            continue;
                        case 20:
                            this.f1058u = obtainStyledAttributes.getFloat(index, this.f1058u);
                            continue;
                        case 21:
                            this.f1034d = obtainStyledAttributes.getLayoutDimension(index, this.f1034d);
                            continue;
                        case 22:
                            this.f1032c = obtainStyledAttributes.getLayoutDimension(index, this.f1032c);
                            continue;
                        case 23:
                            this.f1005D = obtainStyledAttributes.getDimensionPixelSize(index, this.f1005D);
                            continue;
                        case 24:
                            this.f1042h = C0182c.m29846o(obtainStyledAttributes, index, this.f1042h);
                            continue;
                        case 25:
                            this.f1044i = C0182c.m29846o(obtainStyledAttributes, index, this.f1044i);
                            continue;
                        case 26:
                            this.f1004C = obtainStyledAttributes.getInt(index, this.f1004C);
                            continue;
                        case 27:
                            this.f1006E = obtainStyledAttributes.getDimensionPixelSize(index, this.f1006E);
                            continue;
                        case 28:
                            this.f1046j = C0182c.m29846o(obtainStyledAttributes, index, this.f1046j);
                            continue;
                        case 29:
                            this.f1048k = C0182c.m29846o(obtainStyledAttributes, index, this.f1048k);
                            continue;
                        case 30:
                            this.f1010I = obtainStyledAttributes.getDimensionPixelSize(index, this.f1010I);
                            continue;
                        case 31:
                            this.f1054q = C0182c.m29846o(obtainStyledAttributes, index, this.f1054q);
                            continue;
                        case 32:
                            this.f1055r = C0182c.m29846o(obtainStyledAttributes, index, this.f1055r);
                            continue;
                        case 33:
                            this.f1007F = obtainStyledAttributes.getDimensionPixelSize(index, this.f1007F);
                            continue;
                        case 34:
                            this.f1050m = C0182c.m29846o(obtainStyledAttributes, index, this.f1050m);
                            continue;
                        case 35:
                            this.f1049l = C0182c.m29846o(obtainStyledAttributes, index, this.f1049l);
                            continue;
                        case 36:
                            this.f1059v = obtainStyledAttributes.getFloat(index, this.f1059v);
                            continue;
                        case 37:
                            this.f1018Q = obtainStyledAttributes.getFloat(index, this.f1018Q);
                            continue;
                        case 38:
                            this.f1017P = obtainStyledAttributes.getFloat(index, this.f1017P);
                            continue;
                        case 39:
                            this.f1019R = obtainStyledAttributes.getInt(index, this.f1019R);
                            continue;
                        case 40:
                            this.f1020S = obtainStyledAttributes.getInt(index, this.f1020S);
                            continue;
                        default:
                            switch (i2) {
                                case 54:
                                    this.f1021T = obtainStyledAttributes.getInt(index, this.f1021T);
                                    continue;
                                case 55:
                                    this.f1022U = obtainStyledAttributes.getInt(index, this.f1022U);
                                    continue;
                                case 56:
                                    this.f1023V = obtainStyledAttributes.getDimensionPixelSize(index, this.f1023V);
                                    continue;
                                case 57:
                                    this.f1024W = obtainStyledAttributes.getDimensionPixelSize(index, this.f1024W);
                                    continue;
                                case 58:
                                    this.f1025X = obtainStyledAttributes.getDimensionPixelSize(index, this.f1025X);
                                    continue;
                                case 59:
                                    this.f1026Y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1026Y);
                                    continue;
                                default:
                                    switch (i2) {
                                        case 61:
                                            this.f1061x = C0182c.m29846o(obtainStyledAttributes, index, this.f1061x);
                                            continue;
                                        case 62:
                                            this.f1062y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1062y);
                                            continue;
                                        case 63:
                                            this.f1063z = obtainStyledAttributes.getFloat(index, this.f1063z);
                                            continue;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.f1027Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f1029a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    continue;
                                                    continue;
                                                    continue;
                                                case 72:
                                                    this.f1031b0 = obtainStyledAttributes.getInt(index, this.f1031b0);
                                                    break;
                                                case 73:
                                                    this.f1033c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1033c0);
                                                    break;
                                                case 74:
                                                    this.f1039f0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f1047j0 = obtainStyledAttributes.getBoolean(index, this.f1047j0);
                                                    break;
                                                case 76:
                                                    sb = new StringBuilder();
                                                    str = "unused attribute 0x";
                                                    sb.append(str);
                                                    sb.append(Integer.toHexString(index));
                                                    sb.append("   ");
                                                    sb.append(f1001k0.get(index));
                                                    break;
                                                case 77:
                                                    this.f1041g0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    sb = new StringBuilder();
                                                    str = "Unknown attribute 0x";
                                                    sb.append(str);
                                                    sb.append(Integer.toHexString(index));
                                                    sb.append("   ");
                                                    sb.append(f1001k0.get(index));
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    this.f1045i0 = obtainStyledAttributes.getBoolean(index, this.f1045i0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$c */
    /* loaded from: classes.dex */
    public static class C0185c {

        /* renamed from: h */
        public static SparseIntArray f1064h;

        /* renamed from: a */
        public boolean f1065a = false;

        /* renamed from: b */
        public int f1066b = -1;

        /* renamed from: c */
        public String f1067c = null;

        /* renamed from: d */
        public int f1068d = -1;

        /* renamed from: e */
        public int f1069e = 0;

        /* renamed from: f */
        public float f1070f = Float.NaN;

        /* renamed from: g */
        public float f1071g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1064h = sparseIntArray;
            sparseIntArray.append(p21.f22443k4, 1);
            f1064h.append(p21.f22455m4, 2);
            f1064h.append(p21.f22461n4, 3);
            f1064h.append(p21.f22437j4, 4);
            f1064h.append(p21.f22430i4, 5);
            f1064h.append(p21.f22449l4, 6);
        }

        /* renamed from: a */
        public void m29834a(C0185c c0185c) {
            this.f1065a = c0185c.f1065a;
            this.f1066b = c0185c.f1066b;
            this.f1067c = c0185c.f1067c;
            this.f1068d = c0185c.f1068d;
            this.f1069e = c0185c.f1069e;
            this.f1071g = c0185c.f1071g;
            this.f1070f = c0185c.f1070f;
        }

        /* renamed from: b */
        public void m29833b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p21.f22423h4);
            this.f1065a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f1064h.get(index)) {
                    case 1:
                        this.f1071g = obtainStyledAttributes.getFloat(index, this.f1071g);
                        break;
                    case 2:
                        this.f1068d = obtainStyledAttributes.getInt(index, this.f1068d);
                        break;
                    case 3:
                        this.f1067c = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : C2370nv.f20745c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f1069e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f1066b = C0182c.m29846o(obtainStyledAttributes, index, this.f1066b);
                        break;
                    case 6:
                        this.f1070f = obtainStyledAttributes.getFloat(index, this.f1070f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$d */
    /* loaded from: classes.dex */
    public static class C0186d {

        /* renamed from: a */
        public boolean f1072a = false;

        /* renamed from: b */
        public int f1073b = 0;

        /* renamed from: c */
        public int f1074c = 0;

        /* renamed from: d */
        public float f1075d = 1.0f;

        /* renamed from: e */
        public float f1076e = Float.NaN;

        /* renamed from: a */
        public void m29832a(C0186d c0186d) {
            this.f1072a = c0186d.f1072a;
            this.f1073b = c0186d.f1073b;
            this.f1075d = c0186d.f1075d;
            this.f1076e = c0186d.f1076e;
            this.f1074c = c0186d.f1074c;
        }

        /* renamed from: b */
        public void m29831b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p21.f22515w4);
            this.f1072a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == p21.f22527y4) {
                    this.f1075d = obtainStyledAttributes.getFloat(index, this.f1075d);
                } else if (index == p21.f22521x4) {
                    this.f1073b = obtainStyledAttributes.getInt(index, this.f1073b);
                    this.f1073b = C0182c.f990d[this.f1073b];
                } else if (index == p21.f22218A4) {
                    this.f1074c = obtainStyledAttributes.getInt(index, this.f1074c);
                } else if (index == p21.f22533z4) {
                    this.f1076e = obtainStyledAttributes.getFloat(index, this.f1076e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$e */
    /* loaded from: classes.dex */
    public static class C0187e {

        /* renamed from: n */
        public static SparseIntArray f1077n;

        /* renamed from: a */
        public boolean f1078a = false;

        /* renamed from: b */
        public float f1079b = 0.0f;

        /* renamed from: c */
        public float f1080c = 0.0f;

        /* renamed from: d */
        public float f1081d = 0.0f;

        /* renamed from: e */
        public float f1082e = 1.0f;

        /* renamed from: f */
        public float f1083f = 1.0f;

        /* renamed from: g */
        public float f1084g = Float.NaN;

        /* renamed from: h */
        public float f1085h = Float.NaN;

        /* renamed from: i */
        public float f1086i = 0.0f;

        /* renamed from: j */
        public float f1087j = 0.0f;

        /* renamed from: k */
        public float f1088k = 0.0f;

        /* renamed from: l */
        public boolean f1089l = false;

        /* renamed from: m */
        public float f1090m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1077n = sparseIntArray;
            sparseIntArray.append(p21.f22338U4, 1);
            f1077n.append(p21.f22344V4, 2);
            f1077n.append(p21.f22350W4, 3);
            f1077n.append(p21.f22326S4, 4);
            f1077n.append(p21.f22332T4, 5);
            f1077n.append(p21.f22302O4, 6);
            f1077n.append(p21.f22308P4, 7);
            f1077n.append(p21.f22314Q4, 8);
            f1077n.append(p21.f22320R4, 9);
            f1077n.append(p21.f22356X4, 10);
            f1077n.append(p21.f22362Y4, 11);
        }

        /* renamed from: a */
        public void m29830a(C0187e c0187e) {
            this.f1078a = c0187e.f1078a;
            this.f1079b = c0187e.f1079b;
            this.f1080c = c0187e.f1080c;
            this.f1081d = c0187e.f1081d;
            this.f1082e = c0187e.f1082e;
            this.f1083f = c0187e.f1083f;
            this.f1084g = c0187e.f1084g;
            this.f1085h = c0187e.f1085h;
            this.f1086i = c0187e.f1086i;
            this.f1087j = c0187e.f1087j;
            this.f1088k = c0187e.f1088k;
            this.f1089l = c0187e.f1089l;
            this.f1090m = c0187e.f1090m;
        }

        /* renamed from: b */
        public void m29829b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p21.f22296N4);
            this.f1078a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f1077n.get(index)) {
                    case 1:
                        this.f1079b = obtainStyledAttributes.getFloat(index, this.f1079b);
                        break;
                    case 2:
                        this.f1080c = obtainStyledAttributes.getFloat(index, this.f1080c);
                        break;
                    case 3:
                        this.f1081d = obtainStyledAttributes.getFloat(index, this.f1081d);
                        break;
                    case 4:
                        this.f1082e = obtainStyledAttributes.getFloat(index, this.f1082e);
                        break;
                    case 5:
                        this.f1083f = obtainStyledAttributes.getFloat(index, this.f1083f);
                        break;
                    case 6:
                        this.f1084g = obtainStyledAttributes.getDimension(index, this.f1084g);
                        break;
                    case 7:
                        this.f1085h = obtainStyledAttributes.getDimension(index, this.f1085h);
                        break;
                    case 8:
                        this.f1086i = obtainStyledAttributes.getDimension(index, this.f1086i);
                        break;
                    case 9:
                        this.f1087j = obtainStyledAttributes.getDimension(index, this.f1087j);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f1088k = obtainStyledAttributes.getDimension(index, this.f1088k);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f1089l = true;
                            this.f1090m = obtainStyledAttributes.getDimension(index, this.f1090m);
                            break;
                        } else {
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f991e = sparseIntArray;
        sparseIntArray.append(p21.f22499u0, 25);
        f991e.append(p21.f22505v0, 26);
        f991e.append(p21.f22517x0, 29);
        f991e.append(p21.f22523y0, 30);
        f991e.append(p21.f22238E0, 36);
        f991e.append(p21.f22232D0, 35);
        f991e.append(p21.f22384c0, 4);
        f991e.append(p21.f22377b0, 3);
        f991e.append(p21.f22363Z, 1);
        f991e.append(p21.f22286M0, 6);
        f991e.append(p21.f22292N0, 7);
        f991e.append(p21.f22433j0, 17);
        f991e.append(p21.f22439k0, 18);
        f991e.append(p21.f22445l0, 19);
        f991e.append(p21.f22486s, 27);
        f991e.append(p21.f22529z0, 32);
        f991e.append(p21.f22214A0, 33);
        f991e.append(p21.f22426i0, 10);
        f991e.append(p21.f22419h0, 9);
        f991e.append(p21.f22310Q0, 13);
        f991e.append(p21.f22328T0, 16);
        f991e.append(p21.f22316R0, 14);
        f991e.append(p21.f22298O0, 11);
        f991e.append(p21.f22322S0, 15);
        f991e.append(p21.f22304P0, 12);
        f991e.append(p21.f22256H0, 40);
        f991e.append(p21.f22487s0, 39);
        f991e.append(p21.f22481r0, 41);
        f991e.append(p21.f22250G0, 42);
        f991e.append(p21.f22475q0, 20);
        f991e.append(p21.f22244F0, 37);
        f991e.append(p21.f22412g0, 5);
        f991e.append(p21.f22493t0, 82);
        f991e.append(p21.f22226C0, 82);
        f991e.append(p21.f22511w0, 82);
        f991e.append(p21.f22370a0, 82);
        f991e.append(p21.f22357Y, 82);
        f991e.append(p21.f22516x, 24);
        f991e.append(p21.f22528z, 28);
        f991e.append(p21.f22279L, 31);
        f991e.append(p21.f22285M, 8);
        f991e.append(p21.f22522y, 34);
        f991e.append(p21.f22213A, 2);
        f991e.append(p21.f22504v, 23);
        f991e.append(p21.f22510w, 21);
        f991e.append(p21.f22498u, 22);
        f991e.append(p21.f22219B, 43);
        f991e.append(p21.f22297O, 44);
        f991e.append(p21.f22267J, 45);
        f991e.append(p21.f22273K, 46);
        f991e.append(p21.f22261I, 60);
        f991e.append(p21.f22249G, 47);
        f991e.append(p21.f22255H, 48);
        f991e.append(p21.f22225C, 49);
        f991e.append(p21.f22231D, 50);
        f991e.append(p21.f22237E, 51);
        f991e.append(p21.f22243F, 52);
        f991e.append(p21.f22291N, 53);
        f991e.append(p21.f22262I0, 54);
        f991e.append(p21.f22451m0, 55);
        f991e.append(p21.f22268J0, 56);
        f991e.append(p21.f22457n0, 57);
        f991e.append(p21.f22274K0, 58);
        f991e.append(p21.f22463o0, 59);
        f991e.append(p21.f22391d0, 61);
        f991e.append(p21.f22405f0, 62);
        f991e.append(p21.f22398e0, 63);
        f991e.append(p21.f22303P, 64);
        f991e.append(p21.f22352X0, 65);
        f991e.append(p21.f22339V, 66);
        f991e.append(p21.f22358Y0, 67);
        f991e.append(p21.f22340V0, 79);
        f991e.append(p21.f22492t, 38);
        f991e.append(p21.f22334U0, 68);
        f991e.append(p21.f22280L0, 69);
        f991e.append(p21.f22469p0, 70);
        f991e.append(p21.f22327T, 71);
        f991e.append(p21.f22315R, 72);
        f991e.append(p21.f22321S, 73);
        f991e.append(p21.f22333U, 74);
        f991e.append(p21.f22309Q, 75);
        f991e.append(p21.f22346W0, 76);
        f991e.append(p21.f22220B0, 77);
        f991e.append(p21.f22364Z0, 78);
        f991e.append(p21.f22351X, 80);
        f991e.append(p21.f22345W, 81);
    }

    /* renamed from: o */
    public static int m29846o(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: c */
    public void m29858c(ConstraintLayout constraintLayout) {
        m29857d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* renamed from: d */
    public void m29857d(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f994c.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f994c.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder();
                sb.append("id unknown ");
                sb.append(C3458wp.m5880a(childAt));
            } else if (this.f993b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id != -1) {
                    if (this.f994c.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C0183a c0183a = this.f994c.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            c0183a.f998d.f1035d0 = 1;
                        }
                        int i2 = c0183a.f998d.f1035d0;
                        if (i2 != -1 && i2 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(c0183a.f998d.f1031b0);
                            barrier.setMargin(c0183a.f998d.f1033c0);
                            barrier.setAllowsGoneWidget(c0183a.f998d.f1047j0);
                            C0184b c0184b = c0183a.f998d;
                            int[] iArr = c0184b.f1037e0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = c0184b.f1039f0;
                                if (str != null) {
                                    c0184b.f1037e0 = m29851j(barrier, str);
                                    barrier.setReferencedIds(c0183a.f998d.f1037e0);
                                }
                            }
                        }
                        ConstraintLayout.C0175b c0175b = (ConstraintLayout.C0175b) childAt.getLayoutParams();
                        c0175b.m29878a();
                        c0183a.m29841d(c0175b);
                        if (z) {
                            C0178a.m29874c(childAt, c0183a.f1000f);
                        }
                        childAt.setLayoutParams(c0175b);
                        C0186d c0186d = c0183a.f996b;
                        if (c0186d.f1074c == 0) {
                            childAt.setVisibility(c0186d.f1073b);
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        childAt.setAlpha(c0183a.f996b.f1075d);
                        childAt.setRotation(c0183a.f999e.f1079b);
                        childAt.setRotationX(c0183a.f999e.f1080c);
                        childAt.setRotationY(c0183a.f999e.f1081d);
                        childAt.setScaleX(c0183a.f999e.f1082e);
                        childAt.setScaleY(c0183a.f999e.f1083f);
                        if (!Float.isNaN(c0183a.f999e.f1084g)) {
                            childAt.setPivotX(c0183a.f999e.f1084g);
                        }
                        if (!Float.isNaN(c0183a.f999e.f1085h)) {
                            childAt.setPivotY(c0183a.f999e.f1085h);
                        }
                        childAt.setTranslationX(c0183a.f999e.f1086i);
                        childAt.setTranslationY(c0183a.f999e.f1087j);
                        if (i3 >= 21) {
                            childAt.setTranslationZ(c0183a.f999e.f1088k);
                            C0187e c0187e = c0183a.f999e;
                            if (c0187e.f1089l) {
                                childAt.setElevation(c0187e.f1090m);
                            }
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("WARNING NO CONSTRAINTS for view ");
                        sb2.append(id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0183a c0183a2 = this.f994c.get(num);
            int i4 = c0183a2.f998d.f1035d0;
            if (i4 != -1 && i4 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                C0184b c0184b2 = c0183a2.f998d;
                int[] iArr2 = c0184b2.f1037e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = c0184b2.f1039f0;
                    if (str2 != null) {
                        c0184b2.f1037e0 = m29851j(barrier2, str2);
                        barrier2.setReferencedIds(c0183a2.f998d.f1037e0);
                    }
                }
                barrier2.setType(c0183a2.f998d.f1031b0);
                barrier2.setMargin(c0183a2.f998d.f1033c0);
                ConstraintLayout.C0175b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.m29861m();
                c0183a2.m29841d(generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, generateDefaultLayoutParams);
            }
            if (c0183a2.f998d.f1028a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.C0175b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                c0183a2.m29841d(generateDefaultLayoutParams2);
                constraintLayout.addView(guideline, generateDefaultLayoutParams2);
            }
        }
    }

    /* renamed from: e */
    public void m29856e(int i, int i2) {
        if (this.f994c.containsKey(Integer.valueOf(i))) {
            C0183a c0183a = this.f994c.get(Integer.valueOf(i));
            switch (i2) {
                case 1:
                    C0184b c0184b = c0183a.f998d;
                    c0184b.f1044i = -1;
                    c0184b.f1042h = -1;
                    c0184b.f1005D = -1;
                    c0184b.f1011J = -1;
                    return;
                case 2:
                    C0184b c0184b2 = c0183a.f998d;
                    c0184b2.f1048k = -1;
                    c0184b2.f1046j = -1;
                    c0184b2.f1006E = -1;
                    c0184b2.f1013L = -1;
                    return;
                case 3:
                    C0184b c0184b3 = c0183a.f998d;
                    c0184b3.f1050m = -1;
                    c0184b3.f1049l = -1;
                    c0184b3.f1007F = -1;
                    c0184b3.f1012K = -1;
                    return;
                case 4:
                    C0184b c0184b4 = c0183a.f998d;
                    c0184b4.f1051n = -1;
                    c0184b4.f1052o = -1;
                    c0184b4.f1008G = -1;
                    c0184b4.f1014M = -1;
                    return;
                case 5:
                    c0183a.f998d.f1053p = -1;
                    return;
                case 6:
                    C0184b c0184b5 = c0183a.f998d;
                    c0184b5.f1054q = -1;
                    c0184b5.f1055r = -1;
                    c0184b5.f1010I = -1;
                    c0184b5.f1016O = -1;
                    return;
                case 7:
                    C0184b c0184b6 = c0183a.f998d;
                    c0184b6.f1056s = -1;
                    c0184b6.f1057t = -1;
                    c0184b6.f1009H = -1;
                    c0184b6.f1015N = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    /* renamed from: f */
    public void m29855f(Context context, int i) {
        m29854g((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    /* renamed from: g */
    public void m29854g(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f994c.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.C0175b c0175b = (ConstraintLayout.C0175b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f993b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f994c.containsKey(Integer.valueOf(id))) {
                this.f994c.put(Integer.valueOf(id), new C0183a());
            }
            C0183a c0183a = this.f994c.get(Integer.valueOf(id));
            c0183a.f1000f = C0178a.m29876a(this.f992a, childAt);
            c0183a.m29839f(id, c0175b);
            c0183a.f996b.f1073b = childAt.getVisibility();
            int i2 = Build.VERSION.SDK_INT;
            c0183a.f996b.f1075d = childAt.getAlpha();
            c0183a.f999e.f1079b = childAt.getRotation();
            c0183a.f999e.f1080c = childAt.getRotationX();
            c0183a.f999e.f1081d = childAt.getRotationY();
            c0183a.f999e.f1082e = childAt.getScaleX();
            c0183a.f999e.f1083f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                C0187e c0187e = c0183a.f999e;
                c0187e.f1084g = pivotX;
                c0187e.f1085h = pivotY;
            }
            c0183a.f999e.f1086i = childAt.getTranslationX();
            c0183a.f999e.f1087j = childAt.getTranslationY();
            if (i2 >= 21) {
                c0183a.f999e.f1088k = childAt.getTranslationZ();
                C0187e c0187e2 = c0183a.f999e;
                if (c0187e2.f1089l) {
                    c0187e2.f1090m = childAt.getElevation();
                }
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                c0183a.f998d.f1047j0 = barrier.m29898n();
                c0183a.f998d.f1037e0 = barrier.getReferencedIds();
                c0183a.f998d.f1031b0 = barrier.getType();
                c0183a.f998d.f1033c0 = barrier.getMargin();
            }
        }
    }

    /* renamed from: h */
    public void m29853h(C0188d c0188d) {
        int childCount = c0188d.getChildCount();
        this.f994c.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = c0188d.getChildAt(i);
            C0188d.C0189a c0189a = (C0188d.C0189a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f993b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f994c.containsKey(Integer.valueOf(id))) {
                this.f994c.put(Integer.valueOf(id), new C0183a());
            }
            C0183a c0183a = this.f994c.get(Integer.valueOf(id));
            if (childAt instanceof AbstractC0181b) {
                c0183a.m29837h((AbstractC0181b) childAt, id, c0189a);
            }
            c0183a.m29838g(id, c0189a);
        }
    }

    /* renamed from: i */
    public void m29852i(int i, int i2, int i3, float f) {
        C0184b c0184b = m29849l(i).f998d;
        c0184b.f1061x = i2;
        c0184b.f1062y = i3;
        c0184b.f1063z = f;
    }

    /* renamed from: j */
    public final int[] m29851j(View view, String str) {
        int i;
        Object m29892f;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = p11.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (m29892f = ((ConstraintLayout) view.getParent()).m29892f(0, trim)) != null && (m29892f instanceof Integer)) {
                i = ((Integer) m29892f).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* renamed from: k */
    public final C0183a m29850k(Context context, AttributeSet attributeSet) {
        C0183a c0183a = new C0183a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p21.f22480r);
        m29845p(context, c0183a, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return c0183a;
    }

    /* renamed from: l */
    public final C0183a m29849l(int i) {
        if (!this.f994c.containsKey(Integer.valueOf(i))) {
            this.f994c.put(Integer.valueOf(i), new C0183a());
        }
        return this.f994c.get(Integer.valueOf(i));
    }

    /* renamed from: m */
    public void m29848m(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    C0183a m29850k = m29850k(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        m29850k.f998d.f1028a = true;
                    }
                    this.f994c.put(Integer.valueOf(m29850k.f995a), m29850k);
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0179, code lost:
        continue;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m29847n(Context context, XmlPullParser xmlPullParser) {
        C0183a m29850k;
        try {
            int eventType = xmlPullParser.getEventType();
            C0183a c0183a = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    char c = 3;
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1791837707:
                                if (name.equals("CustomAttribute")) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                m29850k = m29850k(context, Xml.asAttributeSet(xmlPullParser));
                                c0183a = m29850k;
                                break;
                            case 1:
                                m29850k = m29850k(context, Xml.asAttributeSet(xmlPullParser));
                                C0184b c0184b = m29850k.f998d;
                                c0184b.f1028a = true;
                                c0184b.f1030b = true;
                                c0183a = m29850k;
                                break;
                            case 2:
                                m29850k = m29850k(context, Xml.asAttributeSet(xmlPullParser));
                                m29850k.f998d.f1035d0 = 1;
                                c0183a = m29850k;
                                break;
                            case 3:
                                if (c0183a == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                c0183a.f996b.m29831b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            case 4:
                                if (c0183a == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                c0183a.f999e.m29829b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            case 5:
                                if (c0183a == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                c0183a.f998d.m29835b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            case 6:
                                if (c0183a == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                c0183a.f997c.m29833b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            case 7:
                                if (c0183a == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                C0178a.m29875b(context, xmlPullParser, c0183a.f1000f);
                                break;
                        }
                    } else if (eventType != 3) {
                        continue;
                    } else {
                        String name2 = xmlPullParser.getName();
                        if ("ConstraintSet".equals(name2)) {
                            return;
                        }
                        if (name2.equalsIgnoreCase("Constraint")) {
                            this.f994c.put(Integer.valueOf(c0183a.f995a), c0183a);
                            c0183a = null;
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: p */
    public final void m29845p(Context context, C0183a c0183a, TypedArray typedArray) {
        C0185c c0185c;
        String str;
        StringBuilder sb;
        String str2;
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index != p21.f22492t && p21.f22279L != index && p21.f22285M != index) {
                c0183a.f997c.f1065a = true;
                c0183a.f998d.f1030b = true;
                c0183a.f996b.f1072a = true;
                c0183a.f999e.f1078a = true;
            }
            switch (f991e.get(index)) {
                case 1:
                    C0184b c0184b = c0183a.f998d;
                    c0184b.f1053p = m29846o(typedArray, index, c0184b.f1053p);
                    continue;
                case 2:
                    C0184b c0184b2 = c0183a.f998d;
                    c0184b2.f1008G = typedArray.getDimensionPixelSize(index, c0184b2.f1008G);
                    continue;
                case 3:
                    C0184b c0184b3 = c0183a.f998d;
                    c0184b3.f1052o = m29846o(typedArray, index, c0184b3.f1052o);
                    continue;
                case 4:
                    C0184b c0184b4 = c0183a.f998d;
                    c0184b4.f1051n = m29846o(typedArray, index, c0184b4.f1051n);
                    continue;
                case 5:
                    c0183a.f998d.f1060w = typedArray.getString(index);
                    continue;
                case 6:
                    C0184b c0184b5 = c0183a.f998d;
                    c0184b5.f1002A = typedArray.getDimensionPixelOffset(index, c0184b5.f1002A);
                    continue;
                case 7:
                    C0184b c0184b6 = c0183a.f998d;
                    c0184b6.f1003B = typedArray.getDimensionPixelOffset(index, c0184b6.f1003B);
                    continue;
                case 8:
                    C0184b c0184b7 = c0183a.f998d;
                    c0184b7.f1009H = typedArray.getDimensionPixelSize(index, c0184b7.f1009H);
                    continue;
                case 9:
                    C0184b c0184b8 = c0183a.f998d;
                    c0184b8.f1057t = m29846o(typedArray, index, c0184b8.f1057t);
                    continue;
                case 10:
                    C0184b c0184b9 = c0183a.f998d;
                    c0184b9.f1056s = m29846o(typedArray, index, c0184b9.f1056s);
                    continue;
                case 11:
                    C0184b c0184b10 = c0183a.f998d;
                    c0184b10.f1014M = typedArray.getDimensionPixelSize(index, c0184b10.f1014M);
                    continue;
                case 12:
                    C0184b c0184b11 = c0183a.f998d;
                    c0184b11.f1015N = typedArray.getDimensionPixelSize(index, c0184b11.f1015N);
                    continue;
                case 13:
                    C0184b c0184b12 = c0183a.f998d;
                    c0184b12.f1011J = typedArray.getDimensionPixelSize(index, c0184b12.f1011J);
                    continue;
                case 14:
                    C0184b c0184b13 = c0183a.f998d;
                    c0184b13.f1013L = typedArray.getDimensionPixelSize(index, c0184b13.f1013L);
                    continue;
                case 15:
                    C0184b c0184b14 = c0183a.f998d;
                    c0184b14.f1016O = typedArray.getDimensionPixelSize(index, c0184b14.f1016O);
                    continue;
                case 16:
                    C0184b c0184b15 = c0183a.f998d;
                    c0184b15.f1012K = typedArray.getDimensionPixelSize(index, c0184b15.f1012K);
                    continue;
                case 17:
                    C0184b c0184b16 = c0183a.f998d;
                    c0184b16.f1036e = typedArray.getDimensionPixelOffset(index, c0184b16.f1036e);
                    continue;
                case 18:
                    C0184b c0184b17 = c0183a.f998d;
                    c0184b17.f1038f = typedArray.getDimensionPixelOffset(index, c0184b17.f1038f);
                    continue;
                case 19:
                    C0184b c0184b18 = c0183a.f998d;
                    c0184b18.f1040g = typedArray.getFloat(index, c0184b18.f1040g);
                    continue;
                case 20:
                    C0184b c0184b19 = c0183a.f998d;
                    c0184b19.f1058u = typedArray.getFloat(index, c0184b19.f1058u);
                    continue;
                case 21:
                    C0184b c0184b20 = c0183a.f998d;
                    c0184b20.f1034d = typedArray.getLayoutDimension(index, c0184b20.f1034d);
                    continue;
                case 22:
                    C0186d c0186d = c0183a.f996b;
                    c0186d.f1073b = typedArray.getInt(index, c0186d.f1073b);
                    C0186d c0186d2 = c0183a.f996b;
                    c0186d2.f1073b = f990d[c0186d2.f1073b];
                    continue;
                case 23:
                    C0184b c0184b21 = c0183a.f998d;
                    c0184b21.f1032c = typedArray.getLayoutDimension(index, c0184b21.f1032c);
                    continue;
                case 24:
                    C0184b c0184b22 = c0183a.f998d;
                    c0184b22.f1005D = typedArray.getDimensionPixelSize(index, c0184b22.f1005D);
                    continue;
                case 25:
                    C0184b c0184b23 = c0183a.f998d;
                    c0184b23.f1042h = m29846o(typedArray, index, c0184b23.f1042h);
                    continue;
                case 26:
                    C0184b c0184b24 = c0183a.f998d;
                    c0184b24.f1044i = m29846o(typedArray, index, c0184b24.f1044i);
                    continue;
                case 27:
                    C0184b c0184b25 = c0183a.f998d;
                    c0184b25.f1004C = typedArray.getInt(index, c0184b25.f1004C);
                    continue;
                case 28:
                    C0184b c0184b26 = c0183a.f998d;
                    c0184b26.f1006E = typedArray.getDimensionPixelSize(index, c0184b26.f1006E);
                    continue;
                case 29:
                    C0184b c0184b27 = c0183a.f998d;
                    c0184b27.f1046j = m29846o(typedArray, index, c0184b27.f1046j);
                    continue;
                case 30:
                    C0184b c0184b28 = c0183a.f998d;
                    c0184b28.f1048k = m29846o(typedArray, index, c0184b28.f1048k);
                    continue;
                case 31:
                    C0184b c0184b29 = c0183a.f998d;
                    c0184b29.f1010I = typedArray.getDimensionPixelSize(index, c0184b29.f1010I);
                    continue;
                case 32:
                    C0184b c0184b30 = c0183a.f998d;
                    c0184b30.f1054q = m29846o(typedArray, index, c0184b30.f1054q);
                    continue;
                case 33:
                    C0184b c0184b31 = c0183a.f998d;
                    c0184b31.f1055r = m29846o(typedArray, index, c0184b31.f1055r);
                    continue;
                case 34:
                    C0184b c0184b32 = c0183a.f998d;
                    c0184b32.f1007F = typedArray.getDimensionPixelSize(index, c0184b32.f1007F);
                    continue;
                case 35:
                    C0184b c0184b33 = c0183a.f998d;
                    c0184b33.f1050m = m29846o(typedArray, index, c0184b33.f1050m);
                    continue;
                case 36:
                    C0184b c0184b34 = c0183a.f998d;
                    c0184b34.f1049l = m29846o(typedArray, index, c0184b34.f1049l);
                    continue;
                case 37:
                    C0184b c0184b35 = c0183a.f998d;
                    c0184b35.f1059v = typedArray.getFloat(index, c0184b35.f1059v);
                    continue;
                case 38:
                    c0183a.f995a = typedArray.getResourceId(index, c0183a.f995a);
                    continue;
                case 39:
                    C0184b c0184b36 = c0183a.f998d;
                    c0184b36.f1018Q = typedArray.getFloat(index, c0184b36.f1018Q);
                    continue;
                case 40:
                    C0184b c0184b37 = c0183a.f998d;
                    c0184b37.f1017P = typedArray.getFloat(index, c0184b37.f1017P);
                    continue;
                case 41:
                    C0184b c0184b38 = c0183a.f998d;
                    c0184b38.f1019R = typedArray.getInt(index, c0184b38.f1019R);
                    continue;
                case 42:
                    C0184b c0184b39 = c0183a.f998d;
                    c0184b39.f1020S = typedArray.getInt(index, c0184b39.f1020S);
                    continue;
                case 43:
                    C0186d c0186d3 = c0183a.f996b;
                    c0186d3.f1075d = typedArray.getFloat(index, c0186d3.f1075d);
                    continue;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        C0187e c0187e = c0183a.f999e;
                        c0187e.f1089l = true;
                        c0187e.f1090m = typedArray.getDimension(index, c0187e.f1090m);
                    } else {
                        continue;
                    }
                case 45:
                    C0187e c0187e2 = c0183a.f999e;
                    c0187e2.f1080c = typedArray.getFloat(index, c0187e2.f1080c);
                    continue;
                case 46:
                    C0187e c0187e3 = c0183a.f999e;
                    c0187e3.f1081d = typedArray.getFloat(index, c0187e3.f1081d);
                    continue;
                case 47:
                    C0187e c0187e4 = c0183a.f999e;
                    c0187e4.f1082e = typedArray.getFloat(index, c0187e4.f1082e);
                    continue;
                case 48:
                    C0187e c0187e5 = c0183a.f999e;
                    c0187e5.f1083f = typedArray.getFloat(index, c0187e5.f1083f);
                    continue;
                case 49:
                    C0187e c0187e6 = c0183a.f999e;
                    c0187e6.f1084g = typedArray.getDimension(index, c0187e6.f1084g);
                    continue;
                case 50:
                    C0187e c0187e7 = c0183a.f999e;
                    c0187e7.f1085h = typedArray.getDimension(index, c0187e7.f1085h);
                    continue;
                case 51:
                    C0187e c0187e8 = c0183a.f999e;
                    c0187e8.f1086i = typedArray.getDimension(index, c0187e8.f1086i);
                    continue;
                case 52:
                    C0187e c0187e9 = c0183a.f999e;
                    c0187e9.f1087j = typedArray.getDimension(index, c0187e9.f1087j);
                    continue;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        C0187e c0187e10 = c0183a.f999e;
                        c0187e10.f1088k = typedArray.getDimension(index, c0187e10.f1088k);
                    } else {
                        continue;
                    }
                case 54:
                    C0184b c0184b40 = c0183a.f998d;
                    c0184b40.f1021T = typedArray.getInt(index, c0184b40.f1021T);
                    continue;
                case 55:
                    C0184b c0184b41 = c0183a.f998d;
                    c0184b41.f1022U = typedArray.getInt(index, c0184b41.f1022U);
                    continue;
                case 56:
                    C0184b c0184b42 = c0183a.f998d;
                    c0184b42.f1023V = typedArray.getDimensionPixelSize(index, c0184b42.f1023V);
                    continue;
                case 57:
                    C0184b c0184b43 = c0183a.f998d;
                    c0184b43.f1024W = typedArray.getDimensionPixelSize(index, c0184b43.f1024W);
                    continue;
                case 58:
                    C0184b c0184b44 = c0183a.f998d;
                    c0184b44.f1025X = typedArray.getDimensionPixelSize(index, c0184b44.f1025X);
                    continue;
                case 59:
                    C0184b c0184b45 = c0183a.f998d;
                    c0184b45.f1026Y = typedArray.getDimensionPixelSize(index, c0184b45.f1026Y);
                    continue;
                case 60:
                    C0187e c0187e11 = c0183a.f999e;
                    c0187e11.f1079b = typedArray.getFloat(index, c0187e11.f1079b);
                    continue;
                case 61:
                    C0184b c0184b46 = c0183a.f998d;
                    c0184b46.f1061x = m29846o(typedArray, index, c0184b46.f1061x);
                    continue;
                case 62:
                    C0184b c0184b47 = c0183a.f998d;
                    c0184b47.f1062y = typedArray.getDimensionPixelSize(index, c0184b47.f1062y);
                    continue;
                case 63:
                    C0184b c0184b48 = c0183a.f998d;
                    c0184b48.f1063z = typedArray.getFloat(index, c0184b48.f1063z);
                    continue;
                case 64:
                    C0185c c0185c2 = c0183a.f997c;
                    c0185c2.f1066b = m29846o(typedArray, index, c0185c2.f1066b);
                    continue;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0185c = c0183a.f997c;
                        str = typedArray.getString(index);
                    } else {
                        c0185c = c0183a.f997c;
                        str = C2370nv.f20745c[typedArray.getInteger(index, 0)];
                    }
                    c0185c.f1067c = str;
                    continue;
                case 66:
                    c0183a.f997c.f1069e = typedArray.getInt(index, 0);
                    continue;
                case 67:
                    C0185c c0185c3 = c0183a.f997c;
                    c0185c3.f1071g = typedArray.getFloat(index, c0185c3.f1071g);
                    continue;
                case 68:
                    C0186d c0186d4 = c0183a.f996b;
                    c0186d4.f1076e = typedArray.getFloat(index, c0186d4.f1076e);
                    continue;
                case 69:
                    c0183a.f998d.f1027Z = typedArray.getFloat(index, 1.0f);
                    continue;
                case 70:
                    c0183a.f998d.f1029a0 = typedArray.getFloat(index, 1.0f);
                    continue;
                case 71:
                case 72:
                    C0184b c0184b49 = c0183a.f998d;
                    c0184b49.f1031b0 = typedArray.getInt(index, c0184b49.f1031b0);
                    continue;
                case 73:
                    C0184b c0184b50 = c0183a.f998d;
                    c0184b50.f1033c0 = typedArray.getDimensionPixelSize(index, c0184b50.f1033c0);
                    continue;
                case 74:
                    c0183a.f998d.f1039f0 = typedArray.getString(index);
                    continue;
                case 75:
                    C0184b c0184b51 = c0183a.f998d;
                    c0184b51.f1047j0 = typedArray.getBoolean(index, c0184b51.f1047j0);
                    continue;
                case 76:
                    C0185c c0185c4 = c0183a.f997c;
                    c0185c4.f1068d = typedArray.getInt(index, c0185c4.f1068d);
                    continue;
                case 77:
                    c0183a.f998d.f1041g0 = typedArray.getString(index);
                    continue;
                case 78:
                    C0186d c0186d5 = c0183a.f996b;
                    c0186d5.f1074c = typedArray.getInt(index, c0186d5.f1074c);
                    continue;
                case 79:
                    C0185c c0185c5 = c0183a.f997c;
                    c0185c5.f1070f = typedArray.getFloat(index, c0185c5.f1070f);
                    continue;
                case 80:
                    C0184b c0184b52 = c0183a.f998d;
                    c0184b52.f1043h0 = typedArray.getBoolean(index, c0184b52.f1043h0);
                    continue;
                case 81:
                    C0184b c0184b53 = c0183a.f998d;
                    c0184b53.f1045i0 = typedArray.getBoolean(index, c0184b53.f1045i0);
                    continue;
                case 82:
                    sb = new StringBuilder();
                    str2 = "unused attribute 0x";
                    break;
                default:
                    sb = new StringBuilder();
                    str2 = "Unknown attribute 0x";
                    break;
            }
            sb.append(str2);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(f991e.get(index));
        }
    }
}
