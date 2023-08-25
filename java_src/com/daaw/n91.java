package com.daaw;

import android.content.Context;
import android.os.AsyncTask;
import com.daaw.C3845zj;
import java.io.File;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class n91 extends AsyncTask<String, Object, Void> {

    /* renamed from: a */
    public Context f19730a;

    /* renamed from: b */
    public File f19731b;

    /* renamed from: c */
    public m10 f19732c;

    /* renamed from: d */
    public WeakReference<InterfaceC2269b> f19733d;

    /* renamed from: e */
    public int f19734e = 0;

    /* renamed from: f */
    public InterfaceC2270c f19735f = new C2268a();

    /* renamed from: com.daaw.n91$a */
    /* loaded from: classes.dex */
    public class C2268a implements InterfaceC2270c {
        public C2268a() {
        }

        @Override // com.daaw.n91.InterfaceC2270c
        /* renamed from: a */
        public void mo15383a(C3845zj.C3864s c3864s) {
        }

        @Override // com.daaw.n91.InterfaceC2270c
        /* renamed from: b */
        public void mo15382b(C3845zj.C3864s c3864s) {
            c3864s.m2205j(n91.this.f19734e);
            n91.m15390b(n91.this);
            n91.this.publishProgress(c3864s);
        }

        @Override // com.daaw.n91.InterfaceC2270c
        public boolean isCancelled() {
            return n91.this.isCancelled();
        }
    }

    /* renamed from: com.daaw.n91$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2269b {
        /* renamed from: a */
        void mo2226a(AsyncTask asyncTask, boolean z);

        /* renamed from: b */
        void mo2225b(AsyncTask asyncTask);

        /* renamed from: c */
        void mo2224c(AsyncTask asyncTask, C3845zj.C3864s c3864s);
    }

    /* renamed from: com.daaw.n91$c */
    /* loaded from: classes.dex */
    public interface InterfaceC2270c {
        /* renamed from: a */
        void mo15383a(C3845zj.C3864s c3864s);

        /* renamed from: b */
        void mo15382b(C3845zj.C3864s c3864s);

        boolean isCancelled();
    }

    public n91(Context context, File file, m10<tx0> m10Var, WeakReference<InterfaceC2269b> weakReference) {
        this.f19730a = context;
        this.f19731b = file;
        this.f19732c = m10Var;
        this.f19733d = weakReference;
    }

    /* renamed from: b */
    public static /* synthetic */ int m15390b(n91 n91Var) {
        int i = n91Var.f19734e;
        n91Var.f19734e = i + 1;
        return i;
    }

    /* renamed from: e */
    public static boolean m15387e(Context context, InterfaceC2270c interfaceC2270c, File file, boolean z, String str, m10 m10Var) {
        File[] listFiles;
        File[] listFiles2;
        try {
            for (File file2 : file.listFiles()) {
                if (interfaceC2270c.isCancelled()) {
                    return false;
                }
                if (!file2.isDirectory()) {
                    if (m10Var != null ? file2.getName().toLowerCase().contains(str) : true) {
                        interfaceC2270c.mo15382b(new C3845zj.C3864s(false, file2.getName(), file2.length(), file2.getCanonicalPath(), file2.lastModified(), new tx0(file2)));
                    }
                } else if (!z) {
                    if (m10Var == null) {
                        interfaceC2270c.mo15383a(new C3845zj.C3864s(true, file2.getName(), file2.listFiles() != null ? listFiles2.length : 0, file2.getCanonicalPath(), file2.lastModified()));
                    } else if (!m15387e(context, interfaceC2270c, file2, false, str, m10Var)) {
                        return false;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m15386f(Context context, InterfaceC2270c interfaceC2270c, File file, boolean z, String str, m10 m10Var) {
        String str2;
        m10 m10Var2;
        if (str == null || str.isEmpty() || m10Var == null) {
            str2 = null;
            m10Var2 = null;
        } else {
            m10Var2 = m10Var;
            str2 = m10Var.mo11570a(str);
        }
        return m15387e(context, interfaceC2270c, file, z, str2, m10Var2);
    }

    @Override // android.os.AsyncTask
    /* renamed from: d */
    public Void doInBackground(String... strArr) {
        m15386f(this.f19730a, this.f19735f, this.f19731b, false, strArr[0], this.f19732c);
        return null;
    }

    @Override // android.os.AsyncTask
    /* renamed from: g */
    public void onCancelled(Void r2) {
        InterfaceC2269b interfaceC2269b = this.f19733d.get();
        if (interfaceC2269b != null) {
            interfaceC2269b.mo2226a(this, false);
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: h */
    public void onPostExecute(Void r2) {
        InterfaceC2269b interfaceC2269b = this.f19733d.get();
        if (interfaceC2269b != null) {
            interfaceC2269b.mo2226a(this, true);
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        InterfaceC2269b interfaceC2269b = this.f19733d.get();
        if (interfaceC2269b != null) {
            interfaceC2269b.mo2225b(this);
        }
    }

    @Override // android.os.AsyncTask
    public void onProgressUpdate(Object... objArr) {
        InterfaceC2269b interfaceC2269b = this.f19733d.get();
        if (interfaceC2269b != null) {
            interfaceC2269b.mo2224c(this, (C3845zj.C3864s) objArr[0]);
        }
    }
}
