package com.daaw;

import android.content.Context;
import com.daaw.er0;
import com.daaw.ir1;
import com.daaw.ku;
import com.daaw.uc1;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class tc1 {

    /* JADX INFO: Add missing generic type declarations: [J] */
    /* loaded from: classes.dex */
    public class a<J> implements ir1.c<J> {
        @Override // com.daaw.ir1.c
        public J a(ir1<J> ir1Var) {
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [J] */
    /* loaded from: classes.dex */
    public class b<J> implements ir1.c<J> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;
        public final /* synthetic */ s40 d;
        public final /* synthetic */ String e;

        /* loaded from: classes.dex */
        public class a implements ku.a {
            public a() {
            }

            @Override // com.daaw.ku.a
            public FileOutputStream a() {
                return new FileOutputStream(new File(b.this.a.getCacheDir(), b.this.b));
            }
        }

        /* renamed from: com.daaw.tc1$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0088b implements w40<Boolean> {
            public final /* synthetic */ ir1 a;

            public C0088b(ir1 ir1Var) {
                this.a = ir1Var;
            }

            @Override // com.daaw.w40
            /* renamed from: b */
            public Boolean a() {
                return Boolean.valueOf(this.a.isCancelled());
            }
        }

        public b(Context context, String str, long j, s40 s40Var, String str2) {
            this.a = context;
            this.b = str;
            this.c = j;
            this.d = s40Var;
            this.e = str2;
        }

        @Override // com.daaw.ir1.c
        public J a(ir1<J> ir1Var) {
            Boolean[] boolArr = {Boolean.FALSE};
            File file = new File(this.a.getCacheDir(), this.b);
            if (file.lastModified() + this.c > System.currentTimeMillis()) {
                J j = (J) this.d.a(file, boolArr);
                if (boolArr[0].booleanValue()) {
                    lz1.a("returning cached file");
                    return j;
                }
            }
            ku.a(this.e, new a(), new C0088b(ir1Var), null);
            return (J) this.d.a(new File(this.a.getCacheDir(), this.b), boolArr);
        }
    }

    /* loaded from: classes.dex */
    public class c implements uc1.c<h60> {
        @Override // com.daaw.uc1.c
        /* renamed from: b */
        public h60 a(String str, String str2) {
            return new h60(str, str2);
        }
    }

    /* loaded from: classes.dex */
    public class d implements r40<h60, List<h60>> {
        @Override // com.daaw.r40
        /* renamed from: b */
        public List<h60> a(h60 h60Var) {
            return h60Var != null ? h60Var.a() : new ArrayList();
        }
    }

    /* loaded from: classes.dex */
    public class e implements uc1.d<lo1<tx0, sc1>> {
        @Override // com.daaw.uc1.d
        /* renamed from: b */
        public lo1<tx0, sc1> a(String str, String str2, int i, String str3, String str4, String[] strArr) {
            return new lo1<>(null, new sc1(str, str2, i, str3, str4, strArr));
        }
    }

    /* loaded from: classes.dex */
    public class f implements r40<lo1<List<h60>, wf1>, String> {
        public final /* synthetic */ String a;

        public f(String str) {
            this.a = str;
        }

        @Override // com.daaw.r40
        /* renamed from: b */
        public String a(lo1<List<h60>, wf1> lo1Var) {
            List<h60> list;
            String str = this.a;
            if (str == null || (list = lo1Var.a) == null) {
                return null;
            }
            h60 a = tc1.a(str, list);
            return a != null ? a.a : ".....";
        }
    }

    /* loaded from: classes.dex */
    public class g implements r40<lo1<List<h60>, wf1>, lo1<List<h60>, wf1>> {
        public final /* synthetic */ String a;

        public g(String str) {
            this.a = str;
        }

        @Override // com.daaw.r40
        /* renamed from: b */
        public lo1<List<h60>, wf1> a(lo1<List<h60>, wf1> lo1Var) {
            List b = tc1.b(this.a, lo1Var.a);
            if (b == null || b.size() == 0) {
                b = new ArrayList();
                h60 a = tc1.a(this.a, lo1Var.a);
                if (a != null) {
                    b.add(a);
                }
            }
            return new lo1<>(b, lo1Var.b);
        }
    }

    public static h60 a(String str, List<h60> list) {
        if (str != null && str.length() != 0) {
            for (int i = 0; i < list.size(); i++) {
                if (str.equals(list.get(i).b)) {
                    return list.get(i);
                }
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                h60 a2 = a(str, list.get(i2).a());
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }

    public static List<h60> b(String str, List<h60> list) {
        if (list == null) {
            return null;
        }
        if (str != null && str.length() != 0 && !str.equals("0")) {
            for (int i = 0; i < list.size(); i++) {
                if (str.equals(list.get(i).b)) {
                    return list.get(i).a();
                }
            }
        }
        return list;
    }

    public static me0<lo1<List<h60>, wf1>> c(String str) {
        return new kr1(e().e("0"), new g(str));
    }

    public static me0<String> d(String str, String str2) {
        return new kr1(e().e("0"), new f(str2));
    }

    public static rc1<lo1<tx0, sc1>, er0<tx0, sc1>, h60, List<h60>> e() {
        return rc1.d("shoutcast_com_yp", new c(), new d(), new e(), new er0.a());
    }

    public static String f() {
        return bn.a("zC0wX0Pwb5nJy7o2");
    }

    public static <J> ir1<J> g(String str, String str2, s40<File, Boolean[], J> s40Var, int i) {
        Context e2 = dx0.e();
        return e2 == null ? new ir1<>(new a()) : new ir1<>(new b(e2, str2, i * 60 * 1000, s40Var, str));
    }
}
