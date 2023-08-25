package com.daaw;

import android.content.Context;
import android.os.AsyncTask;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class o81 extends AsyncTask<String, Object, Void> {
    public Context a;
    public File b;
    public b<File> c;
    public WeakReference<c> d;
    public List<String> f = new ArrayList();
    public d g = new a();
    public String e = "";

    /* loaded from: classes.dex */
    public class a implements d {
        public a() {
        }

        @Override // com.daaw.o81.d
        public void a(File file) {
            String str;
            try {
                str = file.getCanonicalPath();
            } catch (IOException unused) {
                str = null;
            }
            if (str != null) {
                o81.this.publishProgress(str);
            }
        }

        @Override // com.daaw.o81.d
        public void b(File file) {
            try {
                o81.this.f.add(file.getCanonicalPath());
            } catch (IOException unused) {
            }
        }

        @Override // com.daaw.o81.d
        public boolean isCancelled() {
            return o81.this.isCancelled();
        }
    }

    /* loaded from: classes.dex */
    public interface b<T1> {
        String a(String str);

        boolean b(String str, T1 t1);
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(AsyncTask asyncTask, boolean z, List<String> list);

        void b(AsyncTask asyncTask, String str);

        void c(AsyncTask asyncTask);
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(File file);

        void b(File file);

        boolean isCancelled();
    }

    public o81(Context context, File file, b<File> bVar, WeakReference<c> weakReference) {
        this.a = context;
        this.b = file;
        this.c = bVar;
        this.d = weakReference;
    }

    public static o81 c(Context context, File file, b<File> bVar, WeakReference<c> weakReference) {
        return new o81(context, file, bVar, weakReference);
    }

    public static boolean e(Context context, d dVar, File file, boolean z, String str, b<File> bVar) {
        File[] listFiles;
        try {
            for (File file2 : file.listFiles()) {
                if (dVar.isCancelled()) {
                    return false;
                }
                if (file2.isDirectory()) {
                    dVar.a(file2);
                    if (!z && !e(context, dVar, file2, false, str, bVar)) {
                        return false;
                    }
                } else if (bVar != null ? bVar.b(str, file2) : true) {
                    dVar.b(file2);
                }
            }
        } catch (Exception unused) {
        }
        return true;
    }

    public static boolean f(Context context, d dVar, File file, boolean z, String str, b<File> bVar) {
        return e(context, dVar, file, z, bVar.a(str), bVar);
    }

    @Override // android.os.AsyncTask
    /* renamed from: d */
    public Void doInBackground(String... strArr) {
        f(this.a, this.g, this.b, false, strArr[0], this.c);
        return null;
    }

    @Override // android.os.AsyncTask
    /* renamed from: g */
    public void onCancelled(Void r3) {
        c cVar = this.d.get();
        if (cVar != null) {
            cVar.a(this, false, null);
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: h */
    public void onPostExecute(Void r3) {
        c cVar = this.d.get();
        if (cVar != null) {
            cVar.a(this, true, this.f);
        }
    }

    public void i() {
        execute(this.e);
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        c cVar = this.d.get();
        if (cVar != null) {
            cVar.c(this);
        }
    }

    @Override // android.os.AsyncTask
    public void onProgressUpdate(Object... objArr) {
        c cVar = this.d.get();
        if (cVar != null) {
            cVar.b(this, (String) objArr[0]);
        }
    }
}
