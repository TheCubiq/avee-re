package com.daaw;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
/* loaded from: classes2.dex */
public final class zh0 implements ax<zh0> {
    public static final lt0<Object> e = new lt0() { // from class: com.daaw.wh0
        @Override // com.daaw.yw
        public final void a(Object obj, mt0 mt0Var) {
            zh0.l(obj, mt0Var);
        }
    };
    public static final xr1<String> f = new xr1() { // from class: com.daaw.yh0
        @Override // com.daaw.yw
        public final void a(Object obj, yr1 yr1Var) {
            yr1Var.c((String) obj);
        }
    };
    public static final xr1<Boolean> g = new xr1() { // from class: com.daaw.xh0
        @Override // com.daaw.yw
        public final void a(Object obj, yr1 yr1Var) {
            zh0.n((Boolean) obj, yr1Var);
        }
    };
    public static final b h = new b(null);
    public final Map<Class<?>, lt0<?>> a = new HashMap();
    public final Map<Class<?>, xr1<?>> b = new HashMap();
    public lt0<Object> c = e;
    public boolean d = false;

    /* loaded from: classes2.dex */
    public class a implements hp {
        public a() {
        }

        @Override // com.daaw.hp
        public void a(Object obj, Writer writer) {
            ai0 ai0Var = new ai0(writer, zh0.this.a, zh0.this.b, zh0.this.c, zh0.this.d);
            ai0Var.i(obj, false);
            ai0Var.r();
        }

        @Override // com.daaw.hp
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements xr1<Date> {
        public static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(Date date, yr1 yr1Var) {
            yr1Var.c(a.format(date));
        }
    }

    public zh0() {
        p(String.class, f);
        p(Boolean.class, g);
        p(Date.class, h);
    }

    public static /* synthetic */ void l(Object obj, mt0 mt0Var) {
        throw new cx("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public static /* synthetic */ void n(Boolean bool, yr1 yr1Var) {
        yr1Var.d(bool.booleanValue());
    }

    public hp i() {
        return new a();
    }

    public zh0 j(dj djVar) {
        djVar.a(this);
        return this;
    }

    public zh0 k(boolean z) {
        this.d = z;
        return this;
    }

    @Override // com.daaw.ax
    /* renamed from: o */
    public <T> zh0 a(Class<T> cls, lt0<? super T> lt0Var) {
        this.a.put(cls, lt0Var);
        this.b.remove(cls);
        return this;
    }

    public <T> zh0 p(Class<T> cls, xr1<? super T> xr1Var) {
        this.b.put(cls, xr1Var);
        this.a.remove(cls);
        return this;
    }
}
