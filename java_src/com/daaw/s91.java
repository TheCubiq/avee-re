package com.daaw;

import android.content.Context;
import android.os.AsyncTask;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class s91<T1> extends AsyncTask<String, Object, Void> {
    public List<T1> a;
    public m10<T1> b;
    public WeakReference<b<T1>> c;
    public int d = 0;
    public c<T1> e = new a();

    /* loaded from: classes.dex */
    public class a implements c<T1> {
        public a() {
        }

        @Override // com.daaw.s91.c
        public void a(T1 t1) {
            s91.a(s91.this);
            s91.this.publishProgress(t1);
        }

        @Override // com.daaw.s91.c
        public boolean isCancelled() {
            return s91.this.isCancelled();
        }
    }

    /* loaded from: classes.dex */
    public interface b<T1> {
        void a(AsyncTask asyncTask, boolean z);

        void b(AsyncTask asyncTask);

        void c(AsyncTask asyncTask, T1 t1);
    }

    /* loaded from: classes.dex */
    public interface c<T1> {
        void a(T1 t1);

        boolean isCancelled();
    }

    public s91(Context context, List<T1> list, m10<T1> m10Var, WeakReference<b<T1>> weakReference) {
        this.a = list;
        this.b = m10Var;
        this.c = weakReference;
    }

    public static /* synthetic */ int a(s91 s91Var) {
        int i = s91Var.d;
        s91Var.d = i + 1;
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025 A[Catch: Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:6:0x000b, B:8:0x0011, B:10:0x0019, B:11:0x001f, B:13:0x0025, B:16:0x0032, B:17:0x0038, B:18:0x003e, B:20:0x0044, B:23:0x0051, B:25:0x0059), top: B:30:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[Catch: Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:6:0x000b, B:8:0x0011, B:10:0x0019, B:11:0x001f, B:13:0x0025, B:16:0x0032, B:17:0x0038, B:18:0x003e, B:20:0x0044, B:23:0x0051, B:25:0x0059), top: B:30:0x000b }] */
    @Override // android.os.AsyncTask
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Void doInBackground(java.lang.String... r5) {
        /*
            r4 = this;
            r0 = 0
            r5 = r5[r0]
            com.daaw.m10<T1> r0 = r4.b
            r1 = 0
            if (r0 != 0) goto L9
            return r1
        L9:
            if (r5 == 0) goto L18
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Exception -> L5f
            if (r0 != 0) goto L18
            com.daaw.m10<T1> r0 = r4.b     // Catch: java.lang.Exception -> L5f
            java.lang.String r5 = r0.a(r5)     // Catch: java.lang.Exception -> L5f
            goto L19
        L18:
            r5 = r1
        L19:
            java.util.List<T1> r0 = r4.a     // Catch: java.lang.Exception -> L5f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L5f
        L1f:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Exception -> L5f
            if (r2 == 0) goto L38
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Exception -> L5f
            com.daaw.s91$c<T1> r3 = r4.e     // Catch: java.lang.Exception -> L5f
            boolean r3 = r3.isCancelled()     // Catch: java.lang.Exception -> L5f
            if (r3 == 0) goto L32
            goto L38
        L32:
            com.daaw.m10<T1> r3 = r4.b     // Catch: java.lang.Exception -> L5f
            r3.c(r2)     // Catch: java.lang.Exception -> L5f
            goto L1f
        L38:
            java.util.List<T1> r0 = r4.a     // Catch: java.lang.Exception -> L5f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L5f
        L3e:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Exception -> L5f
            if (r2 == 0) goto L78
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Exception -> L5f
            com.daaw.s91$c<T1> r3 = r4.e     // Catch: java.lang.Exception -> L5f
            boolean r3 = r3.isCancelled()     // Catch: java.lang.Exception -> L5f
            if (r3 == 0) goto L51
            goto L78
        L51:
            com.daaw.m10<T1> r3 = r4.b     // Catch: java.lang.Exception -> L5f
            boolean r3 = r3.b(r5, r2)     // Catch: java.lang.Exception -> L5f
            if (r3 == 0) goto L3e
            com.daaw.s91$c<T1> r3 = r4.e     // Catch: java.lang.Exception -> L5f
            r3.a(r2)     // Catch: java.lang.Exception -> L5f
            goto L3e
        L5f:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "doInBackground Exception: "
            r0.append(r2)
            java.lang.String r5 = r5.getMessage()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            com.daaw.lz1.c(r5)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.s91.doInBackground(java.lang.String[]):java.lang.Void");
    }

    @Override // android.os.AsyncTask
    /* renamed from: d */
    public void onCancelled(Void r2) {
        b<T1> bVar = this.c.get();
        if (bVar != null) {
            bVar.a(this, false);
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: e */
    public void onPostExecute(Void r2) {
        b<T1> bVar = this.c.get();
        if (bVar != null) {
            bVar.a(this, true);
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        b<T1> bVar = this.c.get();
        if (bVar != null) {
            bVar.b(this);
        }
    }

    @Override // android.os.AsyncTask
    public void onProgressUpdate(Object... objArr) {
        b<T1> bVar = this.c.get();
        if (bVar != null) {
            bVar.c(this, objArr[0]);
        }
    }
}
