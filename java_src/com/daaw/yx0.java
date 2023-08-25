package com.daaw;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.AsyncTask;
import com.daaw.avee.MainActivity;
import com.daaw.avee.R;
import com.daaw.o81;
import com.daaw.pw1;
import com.daaw.qw1;
import com.daaw.sw1;
import com.daaw.tw1;
import com.daaw.uw1;
import com.daaw.vw1;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class yx0 {

    /* renamed from: a */
    public t91 f34211a = new t91();

    /* renamed from: b */
    public C3774p f34212b = new C3774p();

    /* renamed from: c */
    public C3776r f34213c = new C3776r();

    /* renamed from: d */
    public List<Object> f34214d = new ArrayList();

    /* renamed from: com.daaw.yx0$a */
    /* loaded from: classes.dex */
    public class C3759a implements uw1.InterfaceC3263a<Context, Long, long[], List<String>, Boolean> {
        public C3759a() {
        }

        @Override // com.daaw.uw1.InterfaceC3263a
        /* renamed from: b */
        public void mo3116a(Context context, Long l, long[] jArr, List<String> list, Boolean bool) {
            int m10855a = rx0.m10855a(context, l.longValue(), jArr, bool.booleanValue());
            yx0.this.m3133m();
            boolean booleanValue = bool.booleanValue();
            Resources resources = context.getResources();
            C3385vy.f30703a.m12018a(booleanValue ? resources.getQuantityString(R.plurals.x_items_saved_in_playlist, m10855a, Integer.valueOf(m10855a)) : resources.getQuantityString(R.plurals.x_items_added_to_playlist, m10855a, Integer.valueOf(m10855a)));
        }
    }

    /* renamed from: com.daaw.yx0$b */
    /* loaded from: classes.dex */
    public class C3760b implements uw1.InterfaceC3263a<String, String, List<tx0>, Boolean, Boolean> {
        public C3760b() {
        }

        @Override // com.daaw.uw1.InterfaceC3263a
        /* renamed from: b */
        public void mo3116a(String str, String str2, List<tx0> list, Boolean bool, Boolean bool2) {
            qw1<String> qw1Var;
            String m6092e;
            wf1 wf1Var = new wf1();
            int m16398b = lx0.m16392h().m16398b(wf1Var, str2, list, bool.booleanValue(), bool2.booleanValue());
            yx0.this.m3133m();
            Context m23840b = dx0.m23840b();
            if (m23840b != null) {
                if (m16398b > 0) {
                    m6092e = bool.booleanValue() ? m23840b.getResources().getQuantityString(R.plurals.x_items_saved_in_playlist, m16398b, Integer.valueOf(m16398b)) : m23840b.getResources().getQuantityString(R.plurals.x_items_added_to_playlist, m16398b, Integer.valueOf(m16398b));
                    qw1Var = C3385vy.f30703a;
                } else if (!wf1Var.m6091f()) {
                    return;
                } else {
                    qw1Var = C3385vy.f30703a;
                    m6092e = wf1Var.m6092e();
                }
                qw1Var.m12018a(m6092e);
            }
        }
    }

    /* renamed from: com.daaw.yx0$c */
    /* loaded from: classes.dex */
    public class C3761c implements tw1.InterfaceC3140a<Context, Long, String, C0645al> {
        public C3761c() {
        }

        @Override // com.daaw.tw1.InterfaceC3140a
        /* renamed from: b */
        public void mo3114a(Context context, Long l, String str, C0645al c0645al) {
            if (c0645al.m27376c() != null) {
                v31.m7519a(c0645al, l, str);
            }
        }
    }

    /* renamed from: com.daaw.yx0$d */
    /* loaded from: classes.dex */
    public class C3762d implements sw1.InterfaceC2987a<Context, Long, String> {
        public C3762d() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(Context context, Long l, String str) {
            rx0.m10851e(context, l.longValue(), str);
            yx0.this.m3133m();
        }
    }

    /* renamed from: com.daaw.yx0$e */
    /* loaded from: classes.dex */
    public class C3763e implements tw1.InterfaceC3140a<Context, Long, String, C0645al> {
        public C3763e() {
        }

        @Override // com.daaw.tw1.InterfaceC3140a
        /* renamed from: b */
        public void mo3114a(Context context, Long l, String str, C0645al c0645al) {
            yx0.this.m3135k(context, l);
        }
    }

    /* renamed from: com.daaw.yx0$f */
    /* loaded from: classes.dex */
    public class C3764f implements vw1.InterfaceC3381a<er0<String, String>> {
        public C3764f() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public er0<String, String> mo3126a() {
            Context m23837e = dx0.m23837e();
            if (m23837e == null) {
                return null;
            }
            return SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18955H(m23837e);
        }
    }

    /* renamed from: com.daaw.yx0$g */
    /* loaded from: classes.dex */
    public class C3765g implements vw1.InterfaceC3381a<C3774p> {
        public C3765g() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public C3774p mo3126a() {
            return yx0.this.f34212b;
        }
    }

    /* renamed from: com.daaw.yx0$h */
    /* loaded from: classes.dex */
    public class C3766h implements pw1.InterfaceC2649a {
        public C3766h() {
        }

        @Override // com.daaw.pw1.InterfaceC2649a
        /* renamed from: a */
        public void mo3124a() {
            yx0.this.f34211a.m9426b(0);
        }
    }

    /* renamed from: com.daaw.yx0$i */
    /* loaded from: classes.dex */
    public class C3767i implements qw1.InterfaceC2788a<C0645al> {
        public C3767i() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(C0645al c0645al) {
            Context m23837e = dx0.m23837e();
            if (m23837e == null) {
                return;
            }
            yx0.this.f34213c.f34234a = c0645al;
            o81 m14459c = o81.m14459c(m23837e, new File("/storage/"), new C3777s(), new WeakReference(yx0.this.f34213c));
            yx0.this.f34211a.m9424d(m14459c, 0);
            m14459c.m14453i();
            if (c0645al.m27378a() != null) {
                n81.m15440b(c0645al);
            }
        }
    }

    /* renamed from: com.daaw.yx0$j */
    /* loaded from: classes.dex */
    public class C3768j implements tw1.InterfaceC3140a<Context, String, String, C0645al> {
        public C3768j() {
        }

        @Override // com.daaw.tw1.InterfaceC3140a
        /* renamed from: b */
        public void mo3114a(Context context, String str, String str2, C0645al c0645al) {
            yx0.this.m3137i(context, str, str2);
        }
    }

    /* renamed from: com.daaw.yx0$k */
    /* loaded from: classes.dex */
    public class C3769k implements sw1.InterfaceC2987a<long[], List<String>, C0645al> {
        public C3769k() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(long[] jArr, List<String> list, C0645al c0645al) {
            DialogFragmentC1113dn.m24213a(c0645al, jArr, list);
        }
    }

    /* renamed from: com.daaw.yx0$l */
    /* loaded from: classes.dex */
    public class C3770l implements sw1.InterfaceC2987a<long[], List<String>, C0645al> {
        public C3770l() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(long[] jArr, List<String> list, C0645al c0645al) {
            DialogFragmentC1113dn.m24213a(c0645al, jArr, list);
        }
    }

    /* renamed from: com.daaw.yx0$m */
    /* loaded from: classes.dex */
    public class C3771m implements sw1.InterfaceC2987a<String, long[], List<String>> {
        public C3771m() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(String str, long[] jArr, List<String> list) {
            int m10854b;
            if (str == null || str.length() <= 0) {
                return;
            }
            Context m23840b = dx0.m23840b();
            if (m23840b != null && (m10854b = rx0.m10854b(m23840b, str, jArr)) > 0) {
                C3385vy.f30703a.m12018a(m23840b.getResources().getQuantityString(R.plurals.x_items_saved_in_playlist, m10854b, Integer.valueOf(m10854b)));
            }
            yx0.this.m3133m();
        }
    }

    /* renamed from: com.daaw.yx0$n */
    /* loaded from: classes.dex */
    public class C3772n implements uw1.InterfaceC3263a<String, String, kx0, List<String>, Boolean> {
        public C3772n() {
        }

        @Override // com.daaw.uw1.InterfaceC3263a
        /* renamed from: b */
        public void mo3116a(String str, String str2, kx0 kx0Var, List<String> list, Boolean bool) {
            Context m23840b = dx0.m23840b();
            if (m23840b == null) {
                return;
            }
            if (str == null || str.length() <= 0) {
                str = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18947P(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18910p(m23840b), "pref_playlistDefaultPath", "\\Playlists\\");
            }
            if (str2 == null || str2.length() <= 0) {
                return;
            }
            wf1 wf1Var = new wf1();
            String m16394f = lx0.m16394f(str, str2, kx0Var);
            int m16397c = lx0.m16392h().m16397c(wf1Var, m16394f, kx0Var, list, bool.booleanValue());
            if (m16397c > 0) {
                C3385vy.f30703a.m12018a(m23840b.getResources().getQuantityString(R.plurals.x_items_saved_in_playlist, m16397c, Integer.valueOf(m16397c)));
            } else if (wf1Var.m6091f()) {
                C3385vy.f30703a.m12018a(wf1Var.m6092e());
            }
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18958E(m23840b, m16394f, true);
            yx0.this.m3133m();
        }
    }

    /* renamed from: com.daaw.yx0$o */
    /* loaded from: classes.dex */
    public class C3773o implements tw1.InterfaceC3140a<Context, List<tx0>, Boolean, C0645al> {
        public C3773o() {
        }

        @Override // com.daaw.tw1.InterfaceC3140a
        /* renamed from: b */
        public void mo3114a(Context context, List<tx0> list, Boolean bool, C0645al c0645al) {
            ox0.m13896c(c0645al, list, bool);
        }
    }

    /* renamed from: com.daaw.yx0$p */
    /* loaded from: classes.dex */
    public static class C3774p {

        /* renamed from: a */
        public String f34230a;

        /* renamed from: b */
        public boolean f34231b;
    }

    /* renamed from: com.daaw.yx0$q */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC3775q implements DialogInterface.OnClickListener {

        /* renamed from: p */
        public List<String> f34232p;

        public DialogInterface$OnClickListenerC3775q(List<String> list) {
            this.f34232p = list;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i != -1) {
                return;
            }
            yx0.this.m3136j(this.f34232p);
        }
    }

    /* renamed from: com.daaw.yx0$r */
    /* loaded from: classes.dex */
    public class C3776r implements o81.InterfaceC2422c {

        /* renamed from: a */
        public C0645al f34234a = null;

        public C3776r() {
        }

        @Override // com.daaw.o81.InterfaceC2422c
        /* renamed from: a */
        public void mo3112a(AsyncTask asyncTask, boolean z, List<String> list) {
            C0645al c0645al;
            if (yx0.this.f34211a.m9425c(asyncTask, 0)) {
                yx0.this.f34212b.f34231b = false;
                yx0.this.f34212b.f34230a = "Finished";
                n81.m15438d(yx0.this.f34212b);
                if (!z || list == null || (c0645al = this.f34234a) == null) {
                    return;
                }
                yx0.this.m3134l(c0645al, list);
            }
        }

        @Override // com.daaw.o81.InterfaceC2422c
        /* renamed from: b */
        public void mo3111b(AsyncTask asyncTask, String str) {
            if (yx0.this.f34211a.m9425c(asyncTask, 0)) {
                yx0.this.f34212b.f34231b = true;
                yx0.this.f34212b.f34230a = str;
                n81.m15438d(yx0.this.f34212b);
            }
        }

        @Override // com.daaw.o81.InterfaceC2422c
        /* renamed from: c */
        public void mo3110c(AsyncTask asyncTask) {
            if (yx0.this.f34211a.m9425c(asyncTask, 0)) {
                yx0.this.f34212b.f34231b = true;
                yx0.this.f34212b.f34230a = "Starting";
                n81.m15438d(yx0.this.f34212b);
            }
        }
    }

    /* renamed from: com.daaw.yx0$s */
    /* loaded from: classes.dex */
    public static class C3777s implements o81.InterfaceC2421b<File> {
        @Override // com.daaw.o81.InterfaceC2421b
        /* renamed from: a */
        public String mo3109a(String str) {
            return str.toLowerCase();
        }

        @Override // com.daaw.o81.InterfaceC2421b
        /* renamed from: c */
        public boolean mo3108b(String str, File file) {
            return kx0.m17366a(cr1.m25071i(file));
        }
    }

    public yx0() {
        n81.f19639r.m6691b(new C3765g(), this.f34214d);
        n81.f19640s.m12989b(new C3766h(), this.f34214d);
        dj0.f7154R.m12017b(new C3767i(), this.f34214d);
        dj0.f7145I.m8755b(new C3768j(), this.f34214d);
        dj0.f7155S.m9794b(new C3769k(), this.f34214d);
        ox0.f22048A.m9794b(new C3770l(), this.f34214d);
        DialogFragmentC1113dn.f7483p.m9794b(new C3771m(), this.f34214d);
        DialogFragmentC1113dn.f7484q.m7666b(new C3772n(), this.f34214d);
        dj0.f7186x.m8755b(new C3773o(), this.f34214d);
        ox0.f22049x.m7666b(new C3759a(), this.f34214d);
        ox0.f22050y.m7666b(new C3760b(), this.f34214d);
        dj0.f7146J.m8755b(new C3761c(), this.f34214d);
        v31.f29805p.m9794b(new C3762d(), this.f34214d);
        dj0.f7147K.m8755b(new C3763e(), this.f34214d);
        ox0.f22051z.m6691b(new C3764f(), this.f34214d);
    }

    /* renamed from: i */
    public final void m3137i(Context context, String str, String str2) {
        SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18953J(str, str2, context);
        m3133m();
    }

    /* renamed from: j */
    public final void m3136j(List<String> list) {
        Context m23837e = dx0.m23837e();
        if (m23837e == null) {
            return;
        }
        SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18957F(m23837e, list, true);
        m3133m();
    }

    /* renamed from: k */
    public final void m3135k(Context context, Long l) {
        if (rx0.m10853c(context, l.longValue()) > 0) {
            C3385vy.f30703a.m12018a(context.getResources().getString(R.string.playlist_deleted));
        }
        m3133m();
    }

    /* renamed from: l */
    public final void m3134l(C0645al c0645al, List<String> list) {
        Activity m27378a = c0645al.m27378a();
        if (m27378a == null) {
            return;
        }
        er0<String, String> m18955H = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18955H(m27378a);
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!m18955H.m23271k(str)) {
                arrayList.add(str);
            }
        }
        DialogInterface$OnClickListenerC3775q dialogInterface$OnClickListenerC3775q = new DialogInterface$OnClickListenerC3775q(arrayList);
        int size = arrayList.size();
        String quantityString = m27378a.getResources().getQuantityString(R.plurals.x_items_found_playlist_scan, size, Integer.valueOf(size));
        if (m27378a.isFinishing()) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(m27378a);
        builder.setTitle(R.string.dialog_playlist_scan_completed);
        builder.setMessage(quantityString);
        builder.setPositiveButton(R.string.dialog_ok, dialogInterface$OnClickListenerC3775q);
        builder.create().show();
    }

    /* renamed from: m */
    public final void m3133m() {
        m30 m26906o0 = MainActivity.m26906o0();
        if (m26906o0 != null) {
            m26906o0.m16263A();
        }
    }
}
