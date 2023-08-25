package com.daaw;

import android.content.Context;
import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.daaw.cr */
/* loaded from: classes2.dex */
public class C0989cr implements va0, wa0 {

    /* renamed from: a */
    public final b01<xa0> f6103a;

    /* renamed from: b */
    public final Context f6104b;

    /* renamed from: c */
    public final b01<lq1> f6105c;

    /* renamed from: d */
    public final Set<ta0> f6106d;

    /* renamed from: e */
    public final Executor f6107e;

    public C0989cr(final Context context, final String str, Set<ta0> set, b01<lq1> b01Var, Executor executor) {
        this(new b01() { // from class: com.daaw.zq
            @Override // com.daaw.b01
            public final Object get() {
                xa0 m25099i;
                m25099i = C0989cr.m25099i(context, str);
                return m25099i;
            }
        }, set, executor, b01Var, context);
    }

    public C0989cr(b01<xa0> b01Var, Set<ta0> set, Executor executor, b01<lq1> b01Var2, Context context) {
        this.f6103a = b01Var;
        this.f6106d = set;
        this.f6107e = executor;
        this.f6105c = b01Var2;
        this.f6104b = context;
    }

    /* renamed from: f */
    public static C3330vh<C0989cr> m25102f() {
        final i01 m20272a = i01.m20272a(InterfaceC1171ea.class, Executor.class);
        return C3330vh.m7172f(C0989cr.class, va0.class, wa0.class).m7156b(C3740ys.m3349j(Context.class)).m7156b(C3740ys.m3349j(s10.class)).m7156b(C3740ys.m3347l(ta0.class)).m7156b(C3740ys.m3348k(lq1.class)).m7156b(C3740ys.m3350i(m20272a)).m7153e(new InterfaceC1421gi() { // from class: com.daaw.yq
            @Override // com.daaw.InterfaceC1421gi
            /* renamed from: a */
            public final Object mo3451a(InterfaceC0842bi interfaceC0842bi) {
                C0989cr m25101g;
                m25101g = C0989cr.m25101g(i01.this, interfaceC0842bi);
                return m25101g;
            }
        }).m7155c();
    }

    /* renamed from: g */
    public static /* synthetic */ C0989cr m25101g(i01 i01Var, InterfaceC0842bi interfaceC0842bi) {
        return new C0989cr((Context) interfaceC0842bi.mo12506a(Context.class), ((s10) interfaceC0842bi.mo12506a(s10.class)).m10782n(), interfaceC0842bi.mo12501f(ta0.class), interfaceC0842bi.mo12503d(lq1.class), (Executor) interfaceC0842bi.mo12504c(i01Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ String m25100h() {
        String byteArrayOutputStream;
        synchronized (this) {
            xa0 xa0Var = this.f6103a.get();
            List<ya0> m5343c = xa0Var.m5343c();
            xa0Var.m5344b();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < m5343c.size(); i++) {
                ya0 ya0Var = m5343c.get(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", ya0Var.mo3960c());
                jSONObject.put("dates", new JSONArray((Collection) ya0Var.mo3961b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
            try {
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return byteArrayOutputStream;
    }

    /* renamed from: i */
    public static /* synthetic */ xa0 m25099i(Context context, String str) {
        return new xa0(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ Void m25098j() {
        synchronized (this) {
            this.f6103a.get().m5341e(System.currentTimeMillis(), this.f6105c.get().mo16668a());
        }
        return null;
    }

    @Override // com.daaw.va0
    /* renamed from: a */
    public rj1<String> mo7304a() {
        return mq1.m15856a(this.f6104b) ^ true ? dk1.m24304e("") : dk1.m24306c(this.f6107e, new Callable() { // from class: com.daaw.br
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String m25100h;
                m25100h = C0989cr.this.m25100h();
                return m25100h;
            }
        });
    }

    /* renamed from: k */
    public rj1<Void> m25097k() {
        if (this.f6106d.size() > 0 && !(!mq1.m15856a(this.f6104b))) {
            return dk1.m24306c(this.f6107e, new Callable() { // from class: com.daaw.ar
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void m25098j;
                    m25098j = C0989cr.this.m25098j();
                    return m25098j;
                }
            });
        }
        return dk1.m24304e(null);
    }
}
