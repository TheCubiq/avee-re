package com.daaw;

import android.content.Context;
import com.daaw.AsyncTaskC1984ku;
import com.daaw.er0;
import com.daaw.ir1;
import com.daaw.uc1;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class tc1 {

    /* JADX INFO: Add missing generic type declarations: [J] */
    /* renamed from: com.daaw.tc1$a */
    /* loaded from: classes.dex */
    public class C3048a<J> implements ir1.InterfaceC1751c<J> {
        @Override // com.daaw.ir1.InterfaceC1751c
        /* renamed from: a */
        public J mo9328a(ir1<J> ir1Var) {
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [J] */
    /* renamed from: com.daaw.tc1$b */
    /* loaded from: classes.dex */
    public class C3049b<J> implements ir1.InterfaceC1751c<J> {

        /* renamed from: a */
        public final /* synthetic */ Context f27362a;

        /* renamed from: b */
        public final /* synthetic */ String f27363b;

        /* renamed from: c */
        public final /* synthetic */ long f27364c;

        /* renamed from: d */
        public final /* synthetic */ s40 f27365d;

        /* renamed from: e */
        public final /* synthetic */ String f27366e;

        /* renamed from: com.daaw.tc1$b$a */
        /* loaded from: classes.dex */
        public class C3050a implements AsyncTaskC1984ku.InterfaceC1985a {
            public C3050a() {
            }

            @Override // com.daaw.AsyncTaskC1984ku.InterfaceC1985a
            /* renamed from: a */
            public FileOutputStream mo9327a() {
                return new FileOutputStream(new File(C3049b.this.f27362a.getCacheDir(), C3049b.this.f27363b));
            }
        }

        /* renamed from: com.daaw.tc1$b$b */
        /* loaded from: classes.dex */
        public class C3051b implements w40<Boolean> {

            /* renamed from: a */
            public final /* synthetic */ ir1 f27368a;

            public C3051b(ir1 ir1Var) {
                this.f27368a = ir1Var;
            }

            @Override // com.daaw.w40
            /* renamed from: b */
            public Boolean mo3478a() {
                return Boolean.valueOf(this.f27368a.isCancelled());
            }
        }

        public C3049b(Context context, String str, long j, s40 s40Var, String str2) {
            this.f27362a = context;
            this.f27363b = str;
            this.f27364c = j;
            this.f27365d = s40Var;
            this.f27366e = str2;
        }

        @Override // com.daaw.ir1.InterfaceC1751c
        /* renamed from: a */
        public J mo9328a(ir1<J> ir1Var) {
            Boolean[] boolArr = {Boolean.FALSE};
            File file = new File(this.f27362a.getCacheDir(), this.f27363b);
            if (file.lastModified() + this.f27364c > System.currentTimeMillis()) {
                J j = (J) this.f27365d.mo2432a(file, boolArr);
                if (boolArr[0].booleanValue()) {
                    lz1.m16365a("returning cached file");
                    return j;
                }
            }
            AsyncTaskC1984ku.m17433a(this.f27366e, new C3050a(), new C3051b(ir1Var), null);
            return (J) this.f27365d.mo2432a(new File(this.f27362a.getCacheDir(), this.f27363b), boolArr);
        }
    }

    /* renamed from: com.daaw.tc1$c */
    /* loaded from: classes.dex */
    public class C3052c implements uc1.InterfaceC3197c<h60> {
        @Override // com.daaw.uc1.InterfaceC3197c
        /* renamed from: b */
        public h60 mo8324a(String str, String str2) {
            return new h60(str, str2);
        }
    }

    /* renamed from: com.daaw.tc1$d */
    /* loaded from: classes.dex */
    public class C3053d implements r40<h60, List<h60>> {
        @Override // com.daaw.r40
        /* renamed from: b */
        public List<h60> mo5050a(h60 h60Var) {
            return h60Var != null ? h60Var.m20997a() : new ArrayList();
        }
    }

    /* renamed from: com.daaw.tc1$e */
    /* loaded from: classes.dex */
    public class C3054e implements uc1.InterfaceC3198d<lo1<tx0, sc1>> {
        @Override // com.daaw.uc1.InterfaceC3198d
        /* renamed from: b */
        public lo1<tx0, sc1> mo8323a(String str, String str2, int i, String str3, String str4, String[] strArr) {
            return new lo1<>(null, new sc1(str, str2, i, str3, str4, strArr));
        }
    }

    /* renamed from: com.daaw.tc1$f */
    /* loaded from: classes.dex */
    public class C3055f implements r40<lo1<List<h60>, wf1>, String> {

        /* renamed from: a */
        public final /* synthetic */ String f27370a;

        public C3055f(String str) {
            this.f27370a = str;
        }

        @Override // com.daaw.r40
        /* renamed from: b */
        public String mo5050a(lo1<List<h60>, wf1> lo1Var) {
            List<h60> list;
            String str = this.f27370a;
            if (str == null || (list = lo1Var.f17576a) == null) {
                return null;
            }
            h60 m9335a = tc1.m9335a(str, list);
            return m9335a != null ? m9335a.f12079a : ".....";
        }
    }

    /* renamed from: com.daaw.tc1$g */
    /* loaded from: classes.dex */
    public class C3056g implements r40<lo1<List<h60>, wf1>, lo1<List<h60>, wf1>> {

        /* renamed from: a */
        public final /* synthetic */ String f27371a;

        public C3056g(String str) {
            this.f27371a = str;
        }

        @Override // com.daaw.r40
        /* renamed from: b */
        public lo1<List<h60>, wf1> mo5050a(lo1<List<h60>, wf1> lo1Var) {
            List m9334b = tc1.m9334b(this.f27371a, lo1Var.f17576a);
            if (m9334b == null || m9334b.size() == 0) {
                m9334b = new ArrayList();
                h60 m9335a = tc1.m9335a(this.f27371a, lo1Var.f17576a);
                if (m9335a != null) {
                    m9334b.add(m9335a);
                }
            }
            return new lo1<>(m9334b, lo1Var.f17577b);
        }
    }

    /* renamed from: a */
    public static h60 m9335a(String str, List<h60> list) {
        if (str != null && str.length() != 0) {
            for (int i = 0; i < list.size(); i++) {
                if (str.equals(list.get(i).f12080b)) {
                    return list.get(i);
                }
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                h60 m9335a = m9335a(str, list.get(i2).m20997a());
                if (m9335a != null) {
                    return m9335a;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static List<h60> m9334b(String str, List<h60> list) {
        if (list == null) {
            return null;
        }
        if (str != null && str.length() != 0 && !str.equals("0")) {
            for (int i = 0; i < list.size(); i++) {
                if (str.equals(list.get(i).f12080b)) {
                    return list.get(i).m20997a();
                }
            }
        }
        return list;
    }

    /* renamed from: c */
    public static me0<lo1<List<h60>, wf1>> m9333c(String str) {
        return new kr1(m9331e().m11427e("0"), new C3056g(str));
    }

    /* renamed from: d */
    public static me0<String> m9332d(String str, String str2) {
        return new kr1(m9331e().m11427e("0"), new C3055f(str2));
    }

    /* renamed from: e */
    public static rc1<lo1<tx0, sc1>, er0<tx0, sc1>, h60, List<h60>> m9331e() {
        return rc1.m11428d("shoutcast_com_yp", new C3052c(), new C3053d(), new C3054e(), new er0.C1213a());
    }

    /* renamed from: f */
    public static String m9330f() {
        return C0874bn.m25984a("zC0wX0Pwb5nJy7o2");
    }

    /* renamed from: g */
    public static <J> ir1<J> m9329g(String str, String str2, s40<File, Boolean[], J> s40Var, int i) {
        Context m23837e = dx0.m23837e();
        return m23837e == null ? new ir1<>(new C3048a()) : new ir1<>(new C3049b(m23837e, str2, i * 60 * 1000, s40Var, str));
    }
}
