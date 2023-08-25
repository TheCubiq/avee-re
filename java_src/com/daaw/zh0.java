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
public final class zh0 implements InterfaceC0779ax<zh0> {

    /* renamed from: e */
    public static final lt0<Object> f35055e = new lt0() { // from class: com.daaw.wh0
        @Override // com.daaw.InterfaceC3756yw
        /* renamed from: a */
        public final void mo2307a(Object obj, mt0 mt0Var) {
            zh0.m2314l(obj, mt0Var);
        }
    };

    /* renamed from: f */
    public static final xr1<String> f35056f = new xr1() { // from class: com.daaw.yh0
        @Override // com.daaw.InterfaceC3756yw
        /* renamed from: a */
        public final void mo2307a(Object obj, yr1 yr1Var) {
            yr1Var.mo1755c((String) obj);
        }
    };

    /* renamed from: g */
    public static final xr1<Boolean> f35057g = new xr1() { // from class: com.daaw.xh0
        @Override // com.daaw.InterfaceC3756yw
        /* renamed from: a */
        public final void mo2307a(Object obj, yr1 yr1Var) {
            zh0.m2312n((Boolean) obj, yr1Var);
        }
    };

    /* renamed from: h */
    public static final C3841b f35058h = new C3841b(null);

    /* renamed from: a */
    public final Map<Class<?>, lt0<?>> f35059a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, xr1<?>> f35060b = new HashMap();

    /* renamed from: c */
    public lt0<Object> f35061c = f35055e;

    /* renamed from: d */
    public boolean f35062d = false;

    /* renamed from: com.daaw.zh0$a */
    /* loaded from: classes2.dex */
    public class C3840a implements InterfaceC1603hp {
        public C3840a() {
        }

        @Override // com.daaw.InterfaceC1603hp
        /* renamed from: a */
        public void mo2309a(Object obj, Writer writer) {
            ai0 ai0Var = new ai0(writer, zh0.this.f35059a, zh0.this.f35060b, zh0.this.f35061c, zh0.this.f35062d);
            ai0Var.m27466i(obj, false);
            ai0Var.m27457r();
        }

        @Override // com.daaw.InterfaceC1603hp
        /* renamed from: b */
        public String mo2308b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                mo2309a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* renamed from: com.daaw.zh0$b */
    /* loaded from: classes2.dex */
    public static final class C3841b implements xr1<Date> {

        /* renamed from: a */
        public static final DateFormat f35064a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f35064a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public C3841b() {
        }

        public /* synthetic */ C3841b(C3840a c3840a) {
            this();
        }

        @Override // com.daaw.InterfaceC3756yw
        /* renamed from: b */
        public void mo2307a(Date date, yr1 yr1Var) {
            yr1Var.mo1755c(f35064a.format(date));
        }
    }

    public zh0() {
        m2310p(String.class, f35056f);
        m2310p(Boolean.class, f35057g);
        m2310p(Date.class, f35058h);
    }

    /* renamed from: l */
    public static /* synthetic */ void m2314l(Object obj, mt0 mt0Var) {
        throw new C1012cx("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* renamed from: n */
    public static /* synthetic */ void m2312n(Boolean bool, yr1 yr1Var) {
        yr1Var.mo1754d(bool.booleanValue());
    }

    /* renamed from: i */
    public InterfaceC1603hp m2317i() {
        return new C3840a();
    }

    /* renamed from: j */
    public zh0 m2316j(InterfaceC1090dj interfaceC1090dj) {
        interfaceC1090dj.mo7393a(this);
        return this;
    }

    /* renamed from: k */
    public zh0 m2315k(boolean z) {
        this.f35062d = z;
        return this;
    }

    @Override // com.daaw.InterfaceC0779ax
    /* renamed from: o */
    public <T> zh0 mo2325a(Class<T> cls, lt0<? super T> lt0Var) {
        this.f35059a.put(cls, lt0Var);
        this.f35060b.remove(cls);
        return this;
    }

    /* renamed from: p */
    public <T> zh0 m2310p(Class<T> cls, xr1<? super T> xr1Var) {
        this.f35060b.put(cls, xr1Var);
        this.f35059a.remove(cls);
        return this;
    }
}
