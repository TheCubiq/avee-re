package com.daaw;

import android.os.AsyncTask;
import com.daaw.ir1;
/* loaded from: classes.dex */
public class ak1<Result> {

    /* renamed from: a */
    public String f3265a = null;

    /* renamed from: b */
    public me0<Result> f3266b = null;

    /* renamed from: com.daaw.ak1$a */
    /* loaded from: classes.dex */
    public class C0644a implements ir1.InterfaceC1750b<Result> {

        /* renamed from: a */
        public final /* synthetic */ ir1.InterfaceC1750b f3267a;

        public C0644a(ir1.InterfaceC1750b interfaceC1750b) {
            this.f3267a = interfaceC1750b;
        }

        @Override // com.daaw.ir1.InterfaceC1750b
        /* renamed from: a */
        public void mo15140a(Result result, boolean z) {
            ak1.this.f3266b = null;
            ak1.this.f3265a = null;
            this.f3267a.mo15140a(result, z);
        }
    }

    /* renamed from: a */
    public void m27394a() {
        me0<Result> me0Var = this.f3266b;
        if (me0Var != null) {
            me0Var.cancel(true);
        }
        this.f3266b = null;
        this.f3265a = null;
    }

    /* renamed from: b */
    public void m27393b(String str, me0<Result> me0Var, ir1.InterfaceC1750b<Result> interfaceC1750b) {
        m27394a();
        this.f3266b = me0Var;
        this.f3265a = str;
        me0Var.mo8856a(new C0644a(interfaceC1750b));
    }

    /* renamed from: e */
    public boolean m27390e(String str) {
        me0<Result> me0Var;
        return br1.m25901h(this.f3265a, str) && (me0Var = this.f3266b) != null && me0Var.getStatus() == AsyncTask.Status.RUNNING;
    }
}
