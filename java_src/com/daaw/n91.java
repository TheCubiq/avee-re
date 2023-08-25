package com.daaw;

import android.content.Context;
import android.os.AsyncTask;
import com.daaw.zj;
import java.io.File;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class n91 extends AsyncTask<String, Object, Void> {
    public Context a;
    public File b;
    public m10 c;
    public WeakReference<b> d;
    public int e = 0;
    public c f = new a();

    /* loaded from: classes.dex */
    public class a implements c {
        public a() {
        }

        @Override // com.daaw.n91.c
        public void a(zj.s sVar) {
        }

        @Override // com.daaw.n91.c
        public void b(zj.s sVar) {
            sVar.j(n91.this.e);
            n91.b(n91.this);
            n91.this.publishProgress(sVar);
        }

        @Override // com.daaw.n91.c
        public boolean isCancelled() {
            return n91.this.isCancelled();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(AsyncTask asyncTask, boolean z);

        void b(AsyncTask asyncTask);

        void c(AsyncTask asyncTask, zj.s sVar);
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(zj.s sVar);

        void b(zj.s sVar);

        boolean isCancelled();
    }

    public n91(Context context, File file, m10<tx0> m10Var, WeakReference<b> weakReference) {
        this.a = context;
        this.b = file;
        this.c = m10Var;
        this.d = weakReference;
    }

    public static /* synthetic */ int b(n91 n91Var) {
        int i = n91Var.e;
        n91Var.e = i + 1;
        return i;
    }

    public static boolean e(Context context, c cVar, File file, boolean z, String str, m10 m10Var) {
        File[] listFiles;
        File[] listFiles2;
        try {
            for (File file2 : file.listFiles()) {
                if (cVar.isCancelled()) {
                    return false;
                }
                if (!file2.isDirectory()) {
                    if (m10Var != null ? file2.getName().toLowerCase().contains(str) : true) {
                        cVar.b(new zj.s(false, file2.getName(), file2.length(), file2.getCanonicalPath(), file2.lastModified(), new tx0(file2)));
                    }
                } else if (!z) {
                    if (m10Var == null) {
                        cVar.a(new zj.s(true, file2.getName(), file2.listFiles() != null ? listFiles2.length : 0, file2.getCanonicalPath(), file2.lastModified()));
                    } else if (!e(context, cVar, file2, false, str, m10Var)) {
                        return false;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return true;
    }

    public static boolean f(Context context, c cVar, File file, boolean z, String str, m10 m10Var) {
        String str2;
        m10 m10Var2;
        if (str == null || str.isEmpty() || m10Var == null) {
            str2 = null;
            m10Var2 = null;
        } else {
            m10Var2 = m10Var;
            str2 = m10Var.a(str);
        }
        return e(context, cVar, file, z, str2, m10Var2);
    }

    @Override // android.os.AsyncTask
    /* renamed from: d */
    public Void doInBackground(String... strArr) {
        f(this.a, this.f, this.b, false, strArr[0], this.c);
        return null;
    }

    @Override // android.os.AsyncTask
    /* renamed from: g */
    public void onCancelled(Void r2) {
        b bVar = this.d.get();
        if (bVar != null) {
            bVar.a(this, false);
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: h */
    public void onPostExecute(Void r2) {
        b bVar = this.d.get();
        if (bVar != null) {
            bVar.a(this, true);
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        b bVar = this.d.get();
        if (bVar != null) {
            bVar.b(this);
        }
    }

    @Override // android.os.AsyncTask
    public void onProgressUpdate(Object... objArr) {
        b bVar = this.d.get();
        if (bVar != null) {
            bVar.c(this, (zj.s) objArr[0]);
        }
    }
}
