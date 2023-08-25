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
/* loaded from: classes2.dex */
public class cr implements va0, wa0 {
    public final b01<xa0> a;
    public final Context b;
    public final b01<lq1> c;
    public final Set<ta0> d;
    public final Executor e;

    public cr(final Context context, final String str, Set<ta0> set, b01<lq1> b01Var, Executor executor) {
        this(new b01() { // from class: com.daaw.zq
            @Override // com.daaw.b01
            public final Object get() {
                xa0 i;
                i = cr.i(context, str);
                return i;
            }
        }, set, executor, b01Var, context);
    }

    public cr(b01<xa0> b01Var, Set<ta0> set, Executor executor, b01<lq1> b01Var2, Context context) {
        this.a = b01Var;
        this.d = set;
        this.e = executor;
        this.c = b01Var2;
        this.b = context;
    }

    public static vh<cr> f() {
        final i01 a = i01.a(ea.class, Executor.class);
        return vh.f(cr.class, va0.class, wa0.class).b(ys.j(Context.class)).b(ys.j(s10.class)).b(ys.l(ta0.class)).b(ys.k(lq1.class)).b(ys.i(a)).e(new gi() { // from class: com.daaw.yq
            @Override // com.daaw.gi
            public final Object a(bi biVar) {
                cr g;
                g = cr.g(i01.this, biVar);
                return g;
            }
        }).c();
    }

    public static /* synthetic */ cr g(i01 i01Var, bi biVar) {
        return new cr((Context) biVar.a(Context.class), ((s10) biVar.a(s10.class)).n(), biVar.f(ta0.class), biVar.d(lq1.class), (Executor) biVar.c(i01Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String h() {
        String byteArrayOutputStream;
        synchronized (this) {
            xa0 xa0Var = this.a.get();
            List<ya0> c = xa0Var.c();
            xa0Var.b();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < c.size(); i++) {
                ya0 ya0Var = c.get(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", ya0Var.c());
                jSONObject.put("dates", new JSONArray((Collection) ya0Var.b()));
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

    public static /* synthetic */ xa0 i(Context context, String str) {
        return new xa0(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void j() {
        synchronized (this) {
            this.a.get().e(System.currentTimeMillis(), this.c.get().a());
        }
        return null;
    }

    @Override // com.daaw.va0
    public rj1<String> a() {
        return mq1.a(this.b) ^ true ? dk1.e("") : dk1.c(this.e, new Callable() { // from class: com.daaw.br
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String h;
                h = cr.this.h();
                return h;
            }
        });
    }

    public rj1<Void> k() {
        if (this.d.size() > 0 && !(!mq1.a(this.b))) {
            return dk1.c(this.e, new Callable() { // from class: com.daaw.ar
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void j;
                    j = cr.this.j();
                    return j;
                }
            });
        }
        return dk1.e(null);
    }
}
