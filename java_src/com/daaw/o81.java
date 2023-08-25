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

    /* renamed from: a */
    public Context f21154a;

    /* renamed from: b */
    public File f21155b;

    /* renamed from: c */
    public InterfaceC2421b<File> f21156c;

    /* renamed from: d */
    public WeakReference<InterfaceC2422c> f21157d;

    /* renamed from: f */
    public List<String> f21159f = new ArrayList();

    /* renamed from: g */
    public InterfaceC2423d f21160g = new C2420a();

    /* renamed from: e */
    public String f21158e = "";

    /* renamed from: com.daaw.o81$a */
    /* loaded from: classes.dex */
    public class C2420a implements InterfaceC2423d {
        public C2420a() {
        }

        @Override // com.daaw.o81.InterfaceC2423d
        /* renamed from: a */
        public void mo14452a(File file) {
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

        @Override // com.daaw.o81.InterfaceC2423d
        /* renamed from: b */
        public void mo14451b(File file) {
            try {
                o81.this.f21159f.add(file.getCanonicalPath());
            } catch (IOException unused) {
            }
        }

        @Override // com.daaw.o81.InterfaceC2423d
        public boolean isCancelled() {
            return o81.this.isCancelled();
        }
    }

    /* renamed from: com.daaw.o81$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2421b<T1> {
        /* renamed from: a */
        String mo3109a(String str);

        /* renamed from: b */
        boolean mo3108b(String str, T1 t1);
    }

    /* renamed from: com.daaw.o81$c */
    /* loaded from: classes.dex */
    public interface InterfaceC2422c {
        /* renamed from: a */
        void mo3112a(AsyncTask asyncTask, boolean z, List<String> list);

        /* renamed from: b */
        void mo3111b(AsyncTask asyncTask, String str);

        /* renamed from: c */
        void mo3110c(AsyncTask asyncTask);
    }

    /* renamed from: com.daaw.o81$d */
    /* loaded from: classes.dex */
    public interface InterfaceC2423d {
        /* renamed from: a */
        void mo14452a(File file);

        /* renamed from: b */
        void mo14451b(File file);

        boolean isCancelled();
    }

    public o81(Context context, File file, InterfaceC2421b<File> interfaceC2421b, WeakReference<InterfaceC2422c> weakReference) {
        this.f21154a = context;
        this.f21155b = file;
        this.f21156c = interfaceC2421b;
        this.f21157d = weakReference;
    }

    /* renamed from: c */
    public static o81 m14459c(Context context, File file, InterfaceC2421b<File> interfaceC2421b, WeakReference<InterfaceC2422c> weakReference) {
        return new o81(context, file, interfaceC2421b, weakReference);
    }

    /* renamed from: e */
    public static boolean m14457e(Context context, InterfaceC2423d interfaceC2423d, File file, boolean z, String str, InterfaceC2421b<File> interfaceC2421b) {
        File[] listFiles;
        try {
            for (File file2 : file.listFiles()) {
                if (interfaceC2423d.isCancelled()) {
                    return false;
                }
                if (file2.isDirectory()) {
                    interfaceC2423d.mo14452a(file2);
                    if (!z && !m14457e(context, interfaceC2423d, file2, false, str, interfaceC2421b)) {
                        return false;
                    }
                } else if (interfaceC2421b != null ? interfaceC2421b.mo3108b(str, file2) : true) {
                    interfaceC2423d.mo14451b(file2);
                }
            }
        } catch (Exception unused) {
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m14456f(Context context, InterfaceC2423d interfaceC2423d, File file, boolean z, String str, InterfaceC2421b<File> interfaceC2421b) {
        return m14457e(context, interfaceC2423d, file, z, interfaceC2421b.mo3109a(str), interfaceC2421b);
    }

    @Override // android.os.AsyncTask
    /* renamed from: d */
    public Void doInBackground(String... strArr) {
        m14456f(this.f21154a, this.f21160g, this.f21155b, false, strArr[0], this.f21156c);
        return null;
    }

    @Override // android.os.AsyncTask
    /* renamed from: g */
    public void onCancelled(Void r3) {
        InterfaceC2422c interfaceC2422c = this.f21157d.get();
        if (interfaceC2422c != null) {
            interfaceC2422c.mo3112a(this, false, null);
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: h */
    public void onPostExecute(Void r3) {
        InterfaceC2422c interfaceC2422c = this.f21157d.get();
        if (interfaceC2422c != null) {
            interfaceC2422c.mo3112a(this, true, this.f21159f);
        }
    }

    /* renamed from: i */
    public void m14453i() {
        execute(this.f21158e);
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        InterfaceC2422c interfaceC2422c = this.f21157d.get();
        if (interfaceC2422c != null) {
            interfaceC2422c.mo3110c(this);
        }
    }

    @Override // android.os.AsyncTask
    public void onProgressUpdate(Object... objArr) {
        InterfaceC2422c interfaceC2422c = this.f21157d.get();
        if (interfaceC2422c != null) {
            interfaceC2422c.mo3111b(this, (String) objArr[0]);
        }
    }
}
