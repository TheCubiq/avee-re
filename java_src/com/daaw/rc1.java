package com.daaw;

import com.daaw.uc1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class rc1<T, V extends List<T>, G, GList extends List<G>> {

    /* renamed from: d */
    public static final Object f25116d = new Object();

    /* renamed from: e */
    public static rc1 f25117e;

    /* renamed from: a */
    public String f25118a = "";

    /* renamed from: b */
    public final String f25119b;

    /* renamed from: c */
    public final uc1<G, GList, T, V> f25120c;

    public rc1(String str, uc1.InterfaceC3197c<G> interfaceC3197c, r40<G, GList> r40Var, uc1.InterfaceC3198d<T> interfaceC3198d, w40<V> w40Var) {
        this.f25120c = new uc1<>(interfaceC3197c, r40Var, interfaceC3198d, w40Var);
        this.f25119b = str;
    }

    /* renamed from: d */
    public static <T, V extends List<T>, G, GList extends List<G>> rc1<T, V, G, GList> m11428d(String str, uc1.InterfaceC3197c<G> interfaceC3197c, r40<G, GList> r40Var, uc1.InterfaceC3198d<T> interfaceC3198d, w40<V> w40Var) {
        rc1<T, V, G, GList> rc1Var;
        rc1<T, V, G, GList> rc1Var2 = f25117e;
        if (rc1Var2 != null) {
            return rc1Var2;
        }
        synchronized (f25116d) {
            if (f25117e == null) {
                f25117e = new rc1(str, interfaceC3197c, r40Var, interfaceC3198d, w40Var);
            }
            rc1Var = f25117e;
        }
        return rc1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ lo1 m11425g(File file, Boolean[] boolArr) {
        FileInputStream fileInputStream;
        String str;
        GList glist = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (IOException unused) {
            fileInputStream = null;
        }
        wf1 wf1Var = new wf1();
        if (fileInputStream == null) {
            wf1Var.m6096a("Network error");
            return new lo1(null, wf1Var);
        }
        try {
            glist = this.f25120c.m8338c(fileInputStream, wf1Var);
        } catch (IOException e) {
            e = e;
            str = "io";
            wf1Var.m6095b(str, e);
            boolArr[0] = Boolean.valueOf(glist == null && glist.size() > 0);
            return new lo1(glist, wf1Var);
        } catch (XmlPullParserException e2) {
            e = e2;
            str = "xml parser";
            wf1Var.m6095b(str, e);
            boolArr[0] = Boolean.valueOf(glist == null && glist.size() > 0);
            return new lo1(glist, wf1Var);
        }
        boolArr[0] = Boolean.valueOf(glist == null && glist.size() > 0);
        return new lo1(glist, wf1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ lo1 m11424h(File file, Boolean[] boolArr) {
        FileInputStream fileInputStream;
        String str;
        V v = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (IOException unused) {
            fileInputStream = null;
        }
        wf1 wf1Var = new wf1();
        if (fileInputStream == null) {
            wf1Var.m6096a("Network error");
            return new lo1(null, wf1Var);
        }
        try {
            v = this.f25120c.m8337d(fileInputStream, wf1Var);
        } catch (IOException e) {
            e = e;
            str = "io";
            wf1Var.m6095b(str, e);
            boolArr[0] = Boolean.valueOf(v == null && v.size() > 0);
            return new lo1(v, wf1Var);
        } catch (XmlPullParserException e2) {
            e = e2;
            str = "xml parser";
            wf1Var.m6095b(str, e);
            boolArr[0] = Boolean.valueOf(v == null && v.size() > 0);
            return new lo1(v, wf1Var);
        }
        boolArr[0] = Boolean.valueOf(v == null && v.size() > 0);
        return new lo1(v, wf1Var);
    }

    /* renamed from: i */
    public static /* synthetic */ List m11423i(File file, Boolean[] boolArr) {
        List<tx0> m16395e = lx0.m16392h().m16395e(file.getAbsolutePath());
        boolArr[0] = Boolean.valueOf(m16395e != null && m16395e.size() > 0);
        return m16395e;
    }

    /* renamed from: e */
    public ir1<lo1<List<G>, wf1>> m11427e(String str) {
        return tc1.m9329g("https://api.shoutcast.com/genre/secondary?parentid=" + str + "&k=" + tc1.m9330f() + "&f=xml", this.f25119b + "_genres_sec_" + str, new s40() { // from class: com.daaw.pc1
            @Override // com.daaw.s40
            /* renamed from: a */
            public final Object mo2432a(Object obj, Object obj2) {
                lo1 m11425g;
                m11425g = rc1.this.m11425g((File) obj, (Boolean[]) obj2);
                return m11425g;
            }
        }, 720);
    }

    /* renamed from: f */
    public ir1<lo1<V, wf1>> m11426f(String str) {
        return tc1.m9329g("https://api.shoutcast.com/station/advancedsearch?genre_id=" + str + "&limit=200&f=xml&k=" + tc1.m9330f(), this.f25119b + "_stations_" + str, new s40() { // from class: com.daaw.oc1
            @Override // com.daaw.s40
            /* renamed from: a */
            public final Object mo2432a(Object obj, Object obj2) {
                lo1 m11424h;
                m11424h = rc1.this.m11424h((File) obj, (Boolean[]) obj2);
                return m11424h;
            }
        }, 720);
    }

    /* renamed from: j */
    public ir1<List<tx0>> m11422j(String str, String str2) {
        return tc1.m9329g("https://yp.shoutcast.com/" + str + "?id=" + str2, this.f25119b + "_station_" + str2, new s40() { // from class: com.daaw.qc1
            @Override // com.daaw.s40
            /* renamed from: a */
            public final Object mo2432a(Object obj, Object obj2) {
                List m11423i;
                m11423i = rc1.m11423i((File) obj, (Boolean[]) obj2);
                return m11423i;
            }
        }, 720);
    }
}
