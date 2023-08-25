package com.daaw;

import android.content.Context;
import android.os.AsyncTask;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class s91<T1> extends AsyncTask<String, Object, Void> {

    /* renamed from: a */
    public List<T1> f26013a;

    /* renamed from: b */
    public m10<T1> f26014b;

    /* renamed from: c */
    public WeakReference<InterfaceC2926b<T1>> f26015c;

    /* renamed from: d */
    public int f26016d = 0;

    /* renamed from: e */
    public InterfaceC2927c<T1> f26017e = new C2925a();

    /* renamed from: com.daaw.s91$a */
    /* loaded from: classes.dex */
    public class C2925a implements InterfaceC2927c<T1> {
        public C2925a() {
        }

        @Override // com.daaw.s91.InterfaceC2927c
        /* renamed from: a */
        public void mo10501a(T1 t1) {
            s91.m10509a(s91.this);
            s91.this.publishProgress(t1);
        }

        @Override // com.daaw.s91.InterfaceC2927c
        public boolean isCancelled() {
            return s91.this.isCancelled();
        }
    }

    /* renamed from: com.daaw.s91$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2926b<T1> {
        /* renamed from: a */
        void mo10504a(AsyncTask asyncTask, boolean z);

        /* renamed from: b */
        void mo10503b(AsyncTask asyncTask);

        /* renamed from: c */
        void mo10502c(AsyncTask asyncTask, T1 t1);
    }

    /* renamed from: com.daaw.s91$c */
    /* loaded from: classes.dex */
    public interface InterfaceC2927c<T1> {
        /* renamed from: a */
        void mo10501a(T1 t1);

        boolean isCancelled();
    }

    public s91(Context context, List<T1> list, m10<T1> m10Var, WeakReference<InterfaceC2926b<T1>> weakReference) {
        this.f26013a = list;
        this.f26014b = m10Var;
        this.f26015c = weakReference;
    }

    /* renamed from: a */
    public static /* synthetic */ int m10509a(s91 s91Var) {
        int i = s91Var.f26016d;
        s91Var.f26016d = i + 1;
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025 A[Catch: Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:6:0x000b, B:8:0x0011, B:10:0x0019, B:11:0x001f, B:13:0x0025, B:16:0x0032, B:17:0x0038, B:18:0x003e, B:20:0x0044, B:23:0x0051, B:25:0x0059), top: B:30:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[Catch: Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:6:0x000b, B:8:0x0011, B:10:0x0019, B:11:0x001f, B:13:0x0025, B:16:0x0032, B:17:0x0038, B:18:0x003e, B:20:0x0044, B:23:0x0051, B:25:0x0059), top: B:30:0x000b }] */
    @Override // android.os.AsyncTask
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Void doInBackground(String... strArr) {
        String mo11570a;
        String str = strArr[0];
        if (this.f26014b == null) {
            return null;
        }
        if (str != null) {
            try {
            } catch (Exception e) {
                lz1.m16363c("doInBackground Exception: " + e.getMessage());
            }
            if (!str.isEmpty()) {
                mo11570a = this.f26014b.mo11570a(str);
                for (T1 t1 : this.f26013a) {
                    if (this.f26017e.isCancelled()) {
                        break;
                    }
                    this.f26014b.mo11568c(t1);
                }
                for (T1 t12 : this.f26013a) {
                    if (this.f26017e.isCancelled()) {
                        break;
                    } else if (this.f26014b.mo11569b(mo11570a, t12)) {
                        this.f26017e.mo10501a(t12);
                    }
                }
                return null;
            }
        }
        mo11570a = null;
        while (r0.hasNext()) {
        }
        while (r0.hasNext()) {
        }
        return null;
    }

    @Override // android.os.AsyncTask
    /* renamed from: d */
    public void onCancelled(Void r2) {
        InterfaceC2926b<T1> interfaceC2926b = this.f26015c.get();
        if (interfaceC2926b != null) {
            interfaceC2926b.mo10504a(this, false);
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: e */
    public void onPostExecute(Void r2) {
        InterfaceC2926b<T1> interfaceC2926b = this.f26015c.get();
        if (interfaceC2926b != null) {
            interfaceC2926b.mo10504a(this, true);
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        InterfaceC2926b<T1> interfaceC2926b = this.f26015c.get();
        if (interfaceC2926b != null) {
            interfaceC2926b.mo10503b(this);
        }
    }

    @Override // android.os.AsyncTask
    public void onProgressUpdate(Object... objArr) {
        InterfaceC2926b<T1> interfaceC2926b = this.f26015c.get();
        if (interfaceC2926b != null) {
            interfaceC2926b.mo10502c(this, objArr[0]);
        }
    }
}
