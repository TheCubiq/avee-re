package com.daaw;

import com.daaw.gz1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class oe0<T, V extends List<T>> {

    /* renamed from: a */
    public String f21514a;

    /* renamed from: b */
    public final String f21515b;

    /* renamed from: c */
    public gz1<T, V> f21516c;

    /* renamed from: d */
    public w40<V> f21517d;

    /* renamed from: com.daaw.oe0$a */
    /* loaded from: classes.dex */
    public class C2433a implements s40<File, Boolean[], lo1<V, wf1>> {
        public C2433a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
        @Override // com.daaw.s40
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public lo1<V, wf1> mo2432a(File file, Boolean[] boolArr) {
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
                return new lo1<>(null, wf1Var);
            }
            try {
                v = oe0.this.f21516c.m21135a(fileInputStream, wf1Var);
            } catch (IOException e) {
                e = e;
                str = "io";
                wf1Var.m6095b(str, e);
                boolArr[0] = Boolean.valueOf(v == null && v.size() > 0);
                return new lo1<>(v, wf1Var);
            } catch (XmlPullParserException e2) {
                e = e2;
                str = "xml parser";
                wf1Var.m6095b(str, e);
                boolArr[0] = Boolean.valueOf(v == null && v.size() > 0);
                return new lo1<>(v, wf1Var);
            }
            boolArr[0] = Boolean.valueOf(v == null && v.size() > 0);
            return new lo1<>(v, wf1Var);
        }
    }

    public oe0(String str, String str2, gz1.InterfaceC1490a<T> interfaceC1490a, w40<V> w40Var) {
        this.f21516c = new gz1<>(interfaceC1490a, w40Var);
        this.f21517d = w40Var;
        this.f21514a = str;
        this.f21515b = str2;
    }

    /* renamed from: a */
    public ir1<lo1<V, wf1>> m14325a() {
        return tc1.m9329g(this.f21514a, this.f21515b, new C2433a(), 720);
    }
}
