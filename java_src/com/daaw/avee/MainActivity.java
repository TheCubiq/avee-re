package com.daaw.avee;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.AbstractC0344c;
import androidx.viewpager.widget.ViewPager;
import com.daaw.AbstractC1643i0;
import com.daaw.ActivityC2508p3;
import com.daaw.C0645al;
import com.daaw.C1652i2;
import com.daaw.C2026lc;
import com.daaw.C2407o5;
import com.daaw.C3146ty;
import com.daaw.C3385vy;
import com.daaw.C3866zk;
import com.daaw.InterfaceC1153e0;
import com.daaw.InterfaceC1492h0;
import com.daaw.SharedPreferences$OnSharedPreferenceChangeListenerC1788j5;
import com.daaw.af0;
import com.daaw.avee.Common.ListPreferenceLanguage;
import com.daaw.avee.CustomViewPager;
import com.daaw.avee.MainActivity;
import com.daaw.br1;
import com.daaw.df0;
import com.daaw.dx0;
import com.daaw.ee0;
import com.daaw.gj1;
import com.daaw.gr1;
import com.daaw.hj1;
import com.daaw.ij1;
import com.daaw.jj1;
import com.daaw.lo1;
import com.daaw.lz1;
import com.daaw.m30;
import com.daaw.n30;
import com.daaw.nc0;
import com.daaw.o30;
import com.daaw.pw1;
import com.daaw.qw1;
import com.daaw.rw1;
import com.daaw.tw1;
import com.daaw.tx0;
import com.daaw.ud1;
import com.daaw.vw1;
import com.daaw.ww1;
import com.daaw.x30;
import com.daaw.xw1;
import com.daaw.yw1;
import com.google.android.material.navigation.NavigationView;
import java.lang.ref.WeakReference;
import java.security.Security;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.net.ssl.HttpsURLConnection;
import org.conscrypt.Conscrypt;
/* loaded from: classes.dex */
public class MainActivity extends ActivityC2508p3 {

    /* renamed from: M */
    public dx0 f3734M;

    /* renamed from: O */
    public C0685g f3736O;

    /* renamed from: P */
    public CustomViewPager f3737P;

    /* renamed from: S */
    public Toast f3740S;

    /* renamed from: U */
    public gj1 f3742U;

    /* renamed from: V */
    public DrawerLayout f3743V;

    /* renamed from: W */
    public Toolbar f3744W;

    /* renamed from: X */
    public SwitchCompat f3745X;

    /* renamed from: Y */
    public SwitchCompat f3746Y;

    /* renamed from: d0 */
    public final Handler f3751d0;

    /* renamed from: e0 */
    public final List<Object> f3752e0;

    /* renamed from: f0 */
    public tx0.C3143b f3753f0;

    /* renamed from: g0 */
    public ValueAnimator f3754g0;

    /* renamed from: h0 */
    public static qw1<Activity> f3715h0 = new qw1<>();

    /* renamed from: i0 */
    public static qw1<Activity> f3716i0 = new qw1<>();

    /* renamed from: j0 */
    public static qw1<Activity> f3717j0 = new qw1<>();

    /* renamed from: k0 */
    public static qw1<Activity> f3718k0 = new qw1<>();

    /* renamed from: l0 */
    public static qw1<Activity> f3719l0 = new qw1<>();

    /* renamed from: m0 */
    public static qw1<Configuration> f3720m0 = new qw1<>();

    /* renamed from: n0 */
    public static qw1<C0645al> f3721n0 = new qw1<>();

    /* renamed from: o0 */
    public static pw1 f3722o0 = new pw1();

    /* renamed from: p0 */
    public static rw1<Integer, Activity> f3723p0 = new rw1<>();

    /* renamed from: q0 */
    public static qw1<Context> f3724q0 = new qw1<>();

    /* renamed from: r0 */
    public static rw1<Integer, C0645al> f3725r0 = new rw1<>();

    /* renamed from: s0 */
    public static tw1<C1652i2, af0, Integer, Integer> f3726s0 = new tw1<>();

    /* renamed from: t0 */
    public static vw1<ud1> f3727t0 = new vw1<>();

    /* renamed from: u0 */
    public static vw1<Boolean> f3728u0 = new vw1<>();

    /* renamed from: v0 */
    public static rw1<Integer, String> f3729v0 = new rw1<>();

    /* renamed from: w0 */
    public static qw1<Boolean> f3730w0 = new qw1<>();

    /* renamed from: x0 */
    public static qw1<Integer> f3731x0 = new qw1<>();

    /* renamed from: y0 */
    public static vw1<ee0> f3732y0 = new vw1<>();

    /* renamed from: z0 */
    public static rw1<List<tx0>, Integer> f3733z0 = new rw1<>();

    /* renamed from: A0 */
    public static qw1<Boolean> f3702A0 = new qw1<>();

    /* renamed from: B0 */
    public static qw1<Context> f3703B0 = new qw1<>();

    /* renamed from: C0 */
    public static rw1<Float, Context> f3704C0 = new rw1<>();

    /* renamed from: D0 */
    public static rw1<Activity, Integer> f3705D0 = new rw1<>();

    /* renamed from: E0 */
    public static yw1<Integer, Integer, Intent, Boolean> f3706E0 = new yw1<>();

    /* renamed from: F0 */
    public static rw1<Integer, Intent> f3707F0 = new rw1<>();

    /* renamed from: G0 */
    public static vw1<tx0.C3143b> f3708G0 = new vw1<>();

    /* renamed from: H0 */
    public static vw1<lo1<Boolean, Boolean>> f3709H0 = new vw1<>();

    /* renamed from: I0 */
    public static vw1<Boolean> f3710I0 = new vw1<>();

    /* renamed from: J0 */
    public static ww1<Activity, Boolean> f3711J0 = new ww1<>();

    /* renamed from: K0 */
    public static xw1<C0645al, Intent, Boolean> f3712K0 = new xw1<>();

    /* renamed from: L0 */
    public static xw1<C0645al, Integer, Boolean> f3713L0 = new xw1<>();

    /* renamed from: M0 */
    public static MainActivity f3714M0 = null;

    /* renamed from: N */
    public int f3735N = -1;

    /* renamed from: Q */
    public WeakReference<MenuItem> f3738Q = new WeakReference<>(null);

    /* renamed from: R */
    public boolean f3739R = false;

    /* renamed from: T */
    public Timer f3741T = null;

    /* renamed from: Z */
    public MenuItem f3747Z = null;

    /* renamed from: a0 */
    public MenuItem f3748a0 = null;

    /* renamed from: b0 */
    public MenuItem f3749b0 = null;

    /* renamed from: c0 */
    public MenuItem f3750c0 = null;

    /* renamed from: com.daaw.avee.MainActivity$a */
    /* loaded from: classes.dex */
    public class C0679a implements Handler.Callback {
        public C0679a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            Message obtainMessage;
            Handler handler;
            long j;
            int i = message.what;
            if (i != 2) {
                if (i == 3) {
                    C3146ty.f28246b.m12990a();
                    MainActivity.this.f3751d0.removeMessages(3);
                    obtainMessage = MainActivity.this.f3751d0.obtainMessage(3);
                    handler = MainActivity.this.f3751d0;
                    j = 10000;
                } else if (i == 4) {
                    C3146ty.f28245a.m12990a();
                    MainActivity.this.f3751d0.removeMessages(4);
                    obtainMessage = MainActivity.this.f3751d0.obtainMessage(4);
                    handler = MainActivity.this.f3751d0;
                    j = 1000;
                }
                handler.sendMessageDelayed(obtainMessage, j);
            } else if (MainActivity.this.f3735N == 2 && SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18922h(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14311n)) {
                MainActivity mainActivity = MainActivity.this;
                mainActivity.m26938N0(false, mainActivity.f3735N);
            }
            return false;
        }
    }

    /* renamed from: com.daaw.avee.MainActivity$b */
    /* loaded from: classes.dex */
    public class C0680b implements CustomViewPager.InterfaceC0678a {
        public C0680b() {
        }

        @Override // com.daaw.avee.CustomViewPager.InterfaceC0678a
        /* renamed from: a */
        public void mo26894a(float f) {
            MainActivity.f3704C0.m10862a(Float.valueOf(f), MainActivity.this.getApplicationContext());
        }

        @Override // com.daaw.avee.CustomViewPager.InterfaceC0678a
        /* renamed from: b */
        public void mo26893b() {
            MainActivity.f3703B0.m12018a(MainActivity.this.getApplicationContext());
        }

        @Override // com.daaw.avee.CustomViewPager.InterfaceC0678a
        /* renamed from: c */
        public void mo26892c() {
        }
    }

    /* renamed from: com.daaw.avee.MainActivity$c */
    /* loaded from: classes.dex */
    public class C0681c implements ViewPager.InterfaceC0497j {
        public C0681c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0497j
        /* renamed from: a */
        public void mo26891a(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0497j
        /* renamed from: b */
        public void mo26890b(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0497j
        /* renamed from: c */
        public void mo26889c(int i) {
            MainActivity.this.m26944H0(i);
        }
    }

    /* renamed from: com.daaw.avee.MainActivity$d */
    /* loaded from: classes.dex */
    public class C0682d extends TimerTask {
        public C0682d() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            MainActivity.this.f3739R = false;
            MainActivity.this.f3740S.cancel();
            if (MainActivity.this.f3741T != null) {
                MainActivity.this.f3741T.cancel();
            }
            MainActivity.this.m26909l0();
        }
    }

    /* renamed from: com.daaw.avee.MainActivity$e */
    /* loaded from: classes.dex */
    public class C0683e implements SearchView.OnQueryTextListener {

        /* renamed from: a */
        public final /* synthetic */ SearchView f3759a;

        public C0683e(SearchView searchView) {
            this.f3759a = searchView;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String str) {
            if (this.f3759a.getTag() != null) {
                MainActivity.f3729v0.m10862a(Integer.valueOf(((Integer) this.f3759a.getTag()).intValue()), str);
                return true;
            }
            return true;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String str) {
            this.f3759a.clearFocus();
            if (this.f3759a.getTag() != null) {
                MainActivity.f3729v0.m10862a(Integer.valueOf(((Integer) this.f3759a.getTag()).intValue()), str);
                return true;
            }
            return true;
        }
    }

    /* renamed from: com.daaw.avee.MainActivity$f */
    /* loaded from: classes.dex */
    public class C0684f implements af0 {

        /* renamed from: a */
        public Object f3761a;

        public C0684f() {
        }

        @Override // com.daaw.af0
        /* renamed from: a */
        public void mo5908a(Object obj) {
            this.f3761a = obj;
        }

        @Override // com.daaw.af0
        /* renamed from: b */
        public void mo5907b(df0 df0Var, String str, String str2) {
            gr1.m21327h(df0.m24431g(df0Var));
            df0.m24433c(df0Var);
        }
    }

    /* renamed from: com.daaw.avee.MainActivity$g */
    /* loaded from: classes.dex */
    public class C0685g extends x30 {
        public C0685g(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // com.daaw.kv0
        /* renamed from: c */
        public int mo17418c() {
            return 3;
        }

        @Override // com.daaw.kv0
        /* renamed from: e */
        public CharSequence mo17416e(int i) {
            Drawable m2178e;
            SpannableStringBuilder spannableStringBuilder;
            if (i == 0) {
                m2178e = C3866zk.m2178e(MainActivity.this, R.drawable.ic_library_2_s);
                spannableStringBuilder = new SpannableStringBuilder("   ");
            } else if (i == 1) {
                m2178e = C3866zk.m2178e(MainActivity.this, R.drawable.ic_playlist4);
                spannableStringBuilder = new SpannableStringBuilder("   ");
            } else if (i != 2) {
                return " ";
            } else {
                m2178e = C3866zk.m2178e(MainActivity.this, R.drawable.ic_visual2);
                spannableStringBuilder = new SpannableStringBuilder("   ");
            }
            if (m2178e == null) {
                return "";
            }
            m2178e.setBounds(0, 0, m2178e.getIntrinsicWidth(), m2178e.getIntrinsicHeight());
            spannableStringBuilder.setSpan(new ImageSpan(m2178e, 1), 1, 2, 33);
            return spannableStringBuilder;
        }

        @Override // com.daaw.x30
        /* renamed from: p */
        public Fragment mo5594p(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return o30.m14590i();
                }
                return n30.m15558o();
            }
            return m30.m16247w();
        }
    }

    public MainActivity() {
        LinkedList linkedList = new LinkedList();
        this.f3752e0 = linkedList;
        this.f3753f0 = tx0.f28188h;
        C3385vy.f30703a.m12017b(new qw1.InterfaceC2788a() { // from class: com.daaw.pm0
            @Override // com.daaw.qw1.InterfaceC2788a
            /* renamed from: b */
            public final void mo3122b(Object obj) {
                MainActivity.this.m26900u0((String) obj);
            }
        }, linkedList);
        this.f3751d0 = new Handler(new C0679a());
    }

    /* renamed from: A0 */
    public static /* synthetic */ boolean m26951A0() {
        f3730w0.m12018a(Boolean.FALSE);
        return false;
    }

    /* renamed from: B0 */
    public static /* synthetic */ void m26950B0(View view, boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D0 */
    public /* synthetic */ void m26948D0(Integer num) {
        m26940L0(this.f3748a0, num);
        m26940L0(this.f3749b0, num);
        m26940L0(this.f3750c0, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E0 */
    public /* synthetic */ void m26947E0() {
        MenuItem menuItem = this.f3748a0;
        if (menuItem != null) {
            menuItem.setVisible(false);
        }
        MenuItem menuItem2 = this.f3749b0;
        if (menuItem2 != null) {
            menuItem2.setVisible(false);
        }
        MenuItem menuItem3 = this.f3750c0;
        if (menuItem3 != null) {
            menuItem3.setVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F0 */
    public /* synthetic */ void m26946F0(Integer num) {
        m26940L0(this.f3748a0, num);
        m26940L0(this.f3749b0, num);
        m26940L0(this.f3750c0, num);
    }

    /* renamed from: L0 */
    public static void m26940L0(MenuItem menuItem, Integer num) {
        Drawable icon;
        if (num == null || menuItem == null || (icon = menuItem.getIcon()) == null) {
            return;
        }
        icon.setAlpha(num.intValue());
    }

    /* renamed from: o0 */
    public static m30 m26906o0() {
        MainActivity mainActivity = f3714M0;
        if (mainActivity == null) {
            return null;
        }
        return (m30) mainActivity.m26907n0(0);
    }

    /* renamed from: p0 */
    public static n30 m26905p0() {
        MainActivity mainActivity = f3714M0;
        if (mainActivity == null) {
            return null;
        }
        return (n30) mainActivity.m26907n0(1);
    }

    /* renamed from: q0 */
    public static o30 m26904q0() {
        MainActivity mainActivity = f3714M0;
        if (mainActivity == null) {
            return null;
        }
        return (o30) mainActivity.m26907n0(2);
    }

    /* renamed from: r0 */
    public static MainActivity m26903r0() {
        return f3714M0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0 */
    public /* synthetic */ void m26901t0(String str) {
        if (isFinishing()) {
            return;
        }
        C2026lc.m17055d(this, str, 1).m17054e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0 */
    public /* synthetic */ void m26900u0(final String str) {
        if (!gr1.m21331d()) {
            runOnUiThread(new Runnable() { // from class: com.daaw.gm0
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.this.m26901t0(str);
                }
            });
        } else if (isFinishing()) {
        } else {
            C2026lc.m17055d(this, str, 1).m17054e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public /* synthetic */ Boolean m26899v0(Boolean bool) {
        if (mo2327a().mo29047b().m29049a(AbstractC0344c.EnumC0347c.RESUMED)) {
            C0702a.f3789H0.m26870c(m13655x());
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public /* synthetic */ boolean m26898w0(MenuItem menuItem) {
        if (m26945G0(menuItem)) {
            this.f3743V.m29628f();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public /* synthetic */ void m26897x0(CompoundButton compoundButton, boolean z) {
        int i;
        C0645al c0645al;
        rw1<Integer, C0645al> rw1Var = f3725r0;
        if (z) {
            i = 1;
            c0645al = new C0645al(this);
        } else {
            i = 10;
            c0645al = new C0645al(this);
        }
        rw1Var.m10862a(i, c0645al);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public /* synthetic */ void m26896y0(CompoundButton compoundButton, boolean z) {
        f3725r0.m10862a(2, new C0645al(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public /* synthetic */ void m26895z0(boolean z) {
        if (z) {
            m26937O0(f3710I0.m6692a(Boolean.TRUE).booleanValue(), this.f3735N, true);
        }
    }

    @SuppressLint({"NonConstantResourceId"})
    /* renamed from: G0 */
    public boolean m26945G0(MenuItem menuItem) {
        SwitchCompat switchCompat;
        switch (menuItem.getItemId()) {
            case R.id.menu_contact /* 2131296689 */:
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "Avee Player <support@aveeplayer.com>", null));
                intent.putExtra("android.intent.extra.SUBJECT", "Contact from application");
                intent.putExtra("android.intent.extra.TEXT", "");
                startActivity(Intent.createChooser(intent, "Choose an Email client:"));
                return true;
            case R.id.menu_equalizer /* 2131296690 */:
                f3725r0.m10862a(3, new C0645al(this));
                return true;
            case R.id.menu_lib /* 2131296691 */:
                this.f3737P.setCurrentItem(0);
                return true;
            case R.id.menu_lock_orient /* 2131296692 */:
                switchCompat = this.f3746Y;
                break;
            case R.id.menu_premium /* 2131296693 */:
                f3725r0.m10862a(4, new C0645al(this));
                return true;
            case R.id.menu_queue /* 2131296694 */:
                this.f3737P.setCurrentItem(1);
                return true;
            case R.id.menu_settings /* 2131296695 */:
                startActivity(new Intent(this, SettingsActivity.class));
                return true;
            case R.id.menu_sleep_timer /* 2131296696 */:
                switchCompat = this.f3745X;
                break;
            case R.id.menu_top /* 2131296697 */:
            default:
                return false;
            case R.id.menu_visual /* 2131296698 */:
                this.f3737P.setCurrentItem(2);
                return true;
            case R.id.menu_web /* 2131296699 */:
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.aveeplayer.com/")));
                return true;
        }
        switchCompat.toggle();
        return false;
    }

    /* renamed from: H0 */
    public void m26944H0(int i) {
        this.f3735N = i;
        m26938N0(f3710I0.m6692a(Boolean.TRUE).booleanValue(), this.f3735N);
        f3723p0.m10862a(Integer.valueOf(this.f3735N), this);
        f3731x0.m12018a(Integer.valueOf(this.f3735N));
    }

    /* renamed from: I0 */
    public void m26943I0() {
        DrawerLayout drawerLayout = this.f3743V;
        if (drawerLayout == null) {
            return;
        }
        drawerLayout.m29646H(8388611);
    }

    /* renamed from: J0 */
    public void m26942J0(boolean z) {
        if (SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18922h(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14311n)) {
            this.f3751d0.removeMessages(2);
            if (z) {
                int integer = getResources().getInteger(R.integer.video_maximize_timeout);
                this.f3751d0.sendMessageDelayed(this.f3751d0.obtainMessage(2), integer);
            }
        }
    }

    /* renamed from: K0 */
    public void m26941K0(boolean z, boolean z2) {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = z2 ? 1.0f : 0.0f;
        window.setAttributes(attributes);
        if (z) {
            window.addFlags(128);
        } else {
            window.clearFlags(128);
        }
    }

    /* renamed from: M0 */
    public final void m26939M0(SearchView searchView) {
        gr1.m21313v(searchView, C3866zk.m2180c(this, R.color.white_alpha_1), C3866zk.m2180c(this, R.color.text_color_m2));
    }

    /* renamed from: N0 */
    public void m26938N0(boolean z, int i) {
        m26937O0(z, i, false);
    }

    /* renamed from: O0 */
    public final void m26937O0(boolean z, int i, boolean z2) {
        gj1 gj1Var;
        gj1 gj1Var2;
        m26942J0(z);
        AbstractC1643i0 m13676G = m13676G();
        m26923X0(i == 2);
        if (z) {
            if (m13676G != null) {
                if (i == 2) {
                    m13676G.mo15688u(false);
                    m13676G.mo15689t(false);
                } else {
                    m13676G.mo15688u(true);
                    m13676G.mo15689t(true);
                }
                gr1.m21312w(m26902s0());
            }
            m26935Q0(f3708G0.m6692a(tx0.f28188h));
            if (!z2 && (gj1Var2 = this.f3742U) != null) {
                gj1Var2.mo19753d();
            }
        } else {
            if (m13676G != null) {
                gr1.m21317r(m26902s0());
            }
            if (!z2 && (gj1Var = this.f3742U) != null) {
                gj1Var.mo19755a();
            }
        }
        f3702A0.m12018a(Boolean.valueOf(!z));
    }

    /* renamed from: P0 */
    public void m26936P0(int i) {
        AbstractC1643i0 m13676G = m13676G();
        m26938N0((m13676G == null || m13676G.mo15694l()) ? false : true, i);
    }

    /* renamed from: Q0 */
    public void m26935Q0(tx0.C3143b c3143b) {
        if (c3143b.equals(this.f3753f0)) {
            return;
        }
        this.f3753f0 = c3143b;
        AbstractC1643i0 m13676G = m13676G();
        if (m13676G != null) {
            m13676G.mo15685x(c3143b.f28207e);
            m13676G.mo15686w(c3143b.m8724i() ? c3143b.f28210h : "");
        }
        f3726s0.m8756a(new C1652i2(c3143b.f28203a, c3143b.m8729d(), c3143b.m8731b()), new C0684f(), 200, 200);
    }

    /* renamed from: R0 */
    public void m26934R0(boolean z, boolean z2) {
        SwitchCompat switchCompat = this.f3746Y;
        if (switchCompat != null) {
            switchCompat.setChecked(z);
        }
    }

    /* renamed from: S0 */
    public void m26933S0() {
        boolean z;
        MenuItem menuItem = this.f3738Q.get();
        if (menuItem == null) {
            return;
        }
        vw1<lo1<Boolean, Boolean>> vw1Var = f3709H0;
        Boolean bool = Boolean.FALSE;
        lo1<Boolean, Boolean> m6692a = vw1Var.m6692a(new lo1<>(bool, bool));
        if (m6692a.f17577b.booleanValue()) {
            menuItem.setIcon(m6692a.f17576a.booleanValue() ? R.drawable.ic_info2 : R.drawable.ic_coin);
            z = true;
        } else {
            z = false;
        }
        menuItem.setVisible(z);
    }

    /* renamed from: T0 */
    public void m26931T0() {
        m26929U0(f3732y0.m6692a(null));
    }

    /* renamed from: U0 */
    public void m26929U0(ee0 ee0Var) {
        SearchView searchView;
        MenuItem menuItem = this.f3747Z;
        if (menuItem == null || (searchView = (SearchView) menuItem.getActionView()) == null) {
            return;
        }
        if (ee0Var == null || !ee0Var.isEnabled()) {
            this.f3747Z.setVisible(false);
            searchView.setQueryHint("");
            return;
        }
        String mo17092c = ee0Var.mo17092c();
        this.f3747Z.setVisible(true);
        if (mo17092c == null || mo17092c.isEmpty()) {
            searchView.setTag(Integer.valueOf(ee0Var.mo17093b()));
            searchView.setQuery("", false);
        } else {
            searchView.setTag(Integer.valueOf(ee0Var.mo17093b()));
            searchView.setQuery(mo17092c, false);
            if (searchView.isIconified()) {
                searchView.setIconified(false);
            }
        }
        searchView.setQueryHint(ee0Var.mo17094a());
    }

    /* renamed from: V0 */
    public void m26949C0(boolean z, boolean z2) {
        SwitchCompat switchCompat = this.f3745X;
        if (switchCompat != null) {
            switchCompat.setChecked(z);
        }
    }

    /* renamed from: W0 */
    public void m26925W0(final boolean z, final boolean z2) {
        this.f3751d0.post(new Runnable() { // from class: com.daaw.hm0
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.this.m26949C0(z, z2);
            }
        });
    }

    /* renamed from: X0 */
    public final void m26923X0(boolean z) {
        ValueAnimator m21330e;
        if (z) {
            MenuItem menuItem = this.f3748a0;
            if (menuItem == null || menuItem.isVisible()) {
                return;
            }
            int integer = getResources().getInteger(17694720);
            this.f3748a0.setVisible(true);
            this.f3749b0.setVisible(true);
            this.f3750c0.setVisible(true);
            m21330e = gr1.m21329f(this.f3754g0, new InterfaceC1153e0() { // from class: com.daaw.mm0
                @Override // com.daaw.InterfaceC1153e0
                /* renamed from: a */
                public final void mo7884a(Object obj) {
                    MainActivity.this.m26946F0((Integer) obj);
                }
            }, this.f3748a0.getIcon().getAlpha(), integer);
        } else {
            MenuItem menuItem2 = this.f3748a0;
            if (menuItem2 == null || !menuItem2.isVisible()) {
                return;
            }
            m21330e = gr1.m21330e(this.f3754g0, new InterfaceC1153e0() { // from class: com.daaw.lm0
                @Override // com.daaw.InterfaceC1153e0
                /* renamed from: a */
                public final void mo7884a(Object obj) {
                    MainActivity.this.m26948D0((Integer) obj);
                }
            }, this.f3748a0.getIcon().getAlpha(), getResources().getInteger(17694720), new InterfaceC1492h0() { // from class: com.daaw.nm0
                @Override // com.daaw.InterfaceC1492h0
                /* renamed from: a */
                public final void mo3002a() {
                    MainActivity.this.m26947E0();
                }
            });
        }
        this.f3754g0 = m21330e;
    }

    /* renamed from: k0 */
    public final boolean m26910k0() {
        SearchView searchView;
        MenuItem menuItem = this.f3747Z;
        if (menuItem == null || (searchView = (SearchView) menuItem.getActionView()) == null || searchView.isIconified()) {
            return false;
        }
        searchView.setTag(Integer.valueOf(this.f3735N));
        searchView.setQuery("", false);
        searchView.setIconified(true);
        return true;
    }

    /* renamed from: l0 */
    public void m26909l0() {
        f3722o0.m12990a();
        finish();
    }

    /* renamed from: m0 */
    public void m26908m0() {
        finish();
    }

    /* renamed from: n0 */
    public final Fragment m26907n0(int i) {
        C0685g c0685g;
        CustomViewPager customViewPager = this.f3737P;
        if (customViewPager == null || (c0685g = this.f3736O) == null) {
            return null;
        }
        FragmentManager fragmentManager = getFragmentManager();
        return fragmentManager.findFragmentByTag("android:switcher:" + customViewPager.getId() + ":" + c0685g.m5593q(i));
    }

    @Override // com.daaw.p30, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (f3706E0.m3155a(Integer.valueOf(i), Integer.valueOf(i2), intent, Boolean.FALSE).booleanValue() || i2 != -1) {
            return;
        }
        f3707F0.m10862a(Integer.valueOf(i2), intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (f3711J0.m5753a(this, Boolean.FALSE).booleanValue()) {
            return;
        }
        DrawerLayout drawerLayout = this.f3743V;
        if (drawerLayout != null && drawerLayout.m29653A(8388611)) {
            this.f3743V.m29628f();
            return;
        }
        CustomViewPager customViewPager = this.f3737P;
        if (customViewPager != null && customViewPager.getCurrentItem() != 0) {
            this.f3737P.setCurrentItem(0);
            return;
        }
        m30 m26906o0 = m26906o0();
        if (m26906o0 == null || !m26906o0.m16258l()) {
            super.onBackPressed();
        } else {
            m26906o0.m16253q();
        }
    }

    @Override // com.daaw.ActivityC2508p3, com.daaw.p30, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f3720m0.m12018a(configuration);
    }

    @Override // com.daaw.p30, androidx.activity.ComponentActivity, com.daaw.ActivityC3839zh, android.app.Activity
    public void onCreate(Bundle bundle) {
        Toast.makeText(this, "ᴡ ᴡ ᴡ . ғ ᴀ ʀ s ʀ ᴏ ɪ ᴅ . ᴄ ᴏ ᴍ", 1).show();
        super.onCreate(bundle);
        if (br1.f5068a) {
            try {
                Security.insertProviderAt(Conscrypt.newProvider(), 1);
                HttpsURLConnection.setDefaultSSLSocketFactory(new jj1());
            } catch (Exception e) {
                lz1.m16364b(e, "Failed adding TLSv1.3 - IceCast probably broken");
            }
        }
        f3714M0 = this;
        this.f3734M = dx0.m23834h();
        try {
            PreferenceManager.setDefaultValues(getApplicationContext(), R.xml.preferences, false);
            ListPreferenceLanguage.m26953a(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18947P(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()), "pref_appLang", "en"));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        nc0.f19996n.m5752b(new ww1.InterfaceC3477a() { // from class: com.daaw.qm0
            @Override // com.daaw.ww1.InterfaceC3477a
            /* renamed from: b */
            public final Object mo5751b(Object obj) {
                Boolean m26899v0;
                m26899v0 = MainActivity.this.m26899v0((Boolean) obj);
                return m26899v0;
            }
        }, this.f3752e0);
        f3724q0.m12018a(getApplicationContext());
        setTheme(C2407o5.m14554a(this));
        setContentView(R.layout.main_activity);
        f3715h0.m12018a(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.f3744W = toolbar;
        m13667P(toolbar);
        gr1.m21314u(findViewById(R.id.viewStatusBarBg));
        this.f3743V = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setBackgroundColor(gr1.m21320o(getTheme(), this, R.attr.containerBackground, R.color.white_alpha_1));
        ((TextView) navigationView.m338f(0).findViewById(R.id.nav_version_name)).setText(br1.m25896m());
        navigationView.setNavigationItemSelectedListener(new NavigationView.InterfaceC4115c() { // from class: com.daaw.fm0
            @Override // com.google.android.material.navigation.NavigationView.InterfaceC4115c
            /* renamed from: a */
            public final boolean mo328a(MenuItem menuItem) {
                boolean m26898w0;
                m26898w0 = MainActivity.this.m26898w0(menuItem);
                return m26898w0;
            }
        });
        MenuItem findItem = navigationView.getMenu().findItem(R.id.menu_premium);
        findItem.setTitle(Html.fromHtml("<b>" + ((Object) findItem.getTitle()) + "</b>"));
        this.f3738Q = new WeakReference<>(findItem);
        this.f3745X = (SwitchCompat) navigationView.getMenu().findItem(R.id.menu_sleep_timer).getActionView().findViewById(R.id.drawer_switch);
        this.f3746Y = (SwitchCompat) navigationView.getMenu().findItem(R.id.menu_lock_orient).getActionView().findViewById(R.id.drawer_switch);
        this.f3745X.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.daaw.im0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MainActivity.this.m26897x0(compoundButton, z);
            }
        });
        this.f3746Y.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.daaw.jm0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MainActivity.this.m26896y0(compoundButton, z);
            }
        });
        this.f3736O = new C0685g(getFragmentManager());
        CustomViewPager customViewPager = (CustomViewPager) findViewById(R.id.viewPager);
        this.f3737P = customViewPager;
        customViewPager.setAdapter(this.f3736O);
        this.f3737P.setOnSwipeOutListener(new C0680b());
        gj1 ij1Var = Build.VERSION.SDK_INT > 30 ? new ij1(this.f3737P, 2, getWindow()) : new hj1(this.f3737P, 2);
        this.f3742U = ij1Var;
        ij1Var.mo19754c();
        this.f3742U.mo19753d();
        this.f3742U.m21566b(new gj1.InterfaceC1427b() { // from class: com.daaw.om0
            @Override // com.daaw.gj1.InterfaceC1427b
            /* renamed from: a */
            public final void mo14171a(boolean z) {
                MainActivity.this.m26895z0(z);
            }
        });
        if (f3712K0.m4425a(new C0645al(this), getIntent(), Boolean.FALSE).booleanValue()) {
            this.f3737P.setCurrentItem(2);
            m26944H0(2);
        } else {
            int m18916k = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14271G);
            this.f3737P.setCurrentItem(m18916k);
            m26944H0(m18916k);
        }
        this.f3737P.m28043b(new C0681c());
        Message obtainMessage = this.f3751d0.obtainMessage(3);
        this.f3751d0.removeMessages(3);
        this.f3751d0.sendMessageDelayed(obtainMessage, 10000L);
        Message obtainMessage2 = this.f3751d0.obtainMessage(4);
        this.f3751d0.removeMessages(4);
        this.f3751d0.sendMessageDelayed(obtainMessage2, 1000L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        ud1 m6692a = f3727t0.m6692a(null);
        if (m6692a == null) {
            m6692a = new ud1();
        }
        m26949C0(m6692a.f28893a, true);
        m26934R0(f3728u0.m6692a(Boolean.FALSE).booleanValue(), true);
        MenuItem findItem = menu.findItem(R.id.action_bar_search);
        this.f3747Z = findItem;
        SearchView searchView = (SearchView) findItem.getActionView();
        if (searchView != null) {
            searchView.setIconifiedByDefault(true);
            searchView.setSubmitButtonEnabled(false);
            searchView.setOnQueryTextListener(new C0683e(searchView));
            searchView.setOnCloseListener(new SearchView.OnCloseListener() { // from class: com.daaw.km0
                @Override // android.widget.SearchView.OnCloseListener
                public final boolean onClose() {
                    boolean m26951A0;
                    m26951A0 = MainActivity.m26951A0();
                    return m26951A0;
                }
            });
            searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.daaw.em0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    MainActivity.m26950B0(view, z);
                }
            });
            m26939M0(searchView);
            m26931T0();
        }
        m26933S0();
        this.f3748a0 = menu.findItem(R.id.action_bar_viz_btn0);
        this.f3749b0 = menu.findItem(R.id.action_bar_viz_btn1);
        this.f3750c0 = menu.findItem(R.id.action_bar_viz_btn5);
        m26923X0(this.f3735N == 2);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.daaw.ActivityC2508p3, com.daaw.p30, android.app.Activity
    public void onDestroy() {
        lz1.m16365a("######### onDestroy");
        this.f3734M = null;
        this.f3736O = null;
        this.f3737P = null;
        this.f3740S = null;
        this.f3741T = null;
        this.f3742U = null;
        this.f3743V = null;
        this.f3744W = null;
        this.f3745X = null;
        this.f3746Y = null;
        this.f3747Z = null;
        this.f3748a0 = null;
        this.f3749b0 = null;
        this.f3750c0 = null;
        this.f3753f0 = null;
        f3714M0 = null;
        f3721n0.m12018a(new C0645al(this));
        m26941K0(false, false);
        super.onDestroy();
    }

    @Override // com.daaw.ActivityC2508p3, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && m26910k0()) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        int integer = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18952K(getApplicationContext(), "pref_hold_exit", true) ? getResources().getInteger(R.integer.hold_exit_ms) : 0;
        if (i != 4 || integer <= 0) {
            return super.onKeyLongPress(i, keyEvent);
        }
        this.f3739R = true;
        Toast makeText = Toast.makeText(getApplicationContext(), getString(R.string.hold_exit), 0);
        this.f3740S = makeText;
        makeText.show();
        Timer timer = new Timer();
        this.f3741T = timer;
        timer.schedule(new C0682d(), integer);
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4 && this.f3739R) {
            this.f3739R = false;
            Timer timer = this.f3741T;
            if (timer != null) {
                timer.cancel();
            }
            this.f3741T = null;
            this.f3740S.setText(getString(R.string.hold_exit_canceled));
            this.f3740S.setDuration(0);
            this.f3740S.show();
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // com.daaw.p30, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (f3712K0.m4425a(new C0645al(this), intent, Boolean.FALSE).booleanValue()) {
            this.f3737P.setCurrentItem(2);
            m26944H0(2);
        }
        super.onNewIntent(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"NonConstantResourceId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            m26943I0();
            return true;
        }
        switch (itemId) {
            case R.id.action_bar_viz_btn0 /* 2131296315 */:
                if (f3713L0.m4425a(new C0645al(this), 1, Boolean.FALSE).booleanValue()) {
                    return true;
                }
                if (f3713L0.m4425a(new C0645al(this), 2, Boolean.FALSE).booleanValue()) {
                    return true;
                }
                if (f3713L0.m4425a(new C0645al(this), 3, Boolean.FALSE).booleanValue()) {
                    return true;
                }
                if (m26945G0(menuItem)) {
                    return super.onOptionsItemSelected(menuItem);
                }
                return true;
            case R.id.action_bar_viz_btn1 /* 2131296316 */:
                if (f3713L0.m4425a(new C0645al(this), 2, Boolean.FALSE).booleanValue()) {
                }
                if (f3713L0.m4425a(new C0645al(this), 3, Boolean.FALSE).booleanValue()) {
                }
                if (m26945G0(menuItem)) {
                }
                break;
            case R.id.action_bar_viz_btn5 /* 2131296317 */:
                if (f3713L0.m4425a(new C0645al(this), 3, Boolean.FALSE).booleanValue()) {
                }
                if (m26945G0(menuItem)) {
                }
                break;
            default:
                if (m26945G0(menuItem)) {
                }
                break;
        }
    }

    @Override // com.daaw.p30, android.app.Activity
    public void onPause() {
        lz1.m16365a("######### onPause");
        f3718k0.m12018a(this);
        super.onPause();
    }

    @Override // com.daaw.p30, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        f3705D0.m10862a(this, Integer.valueOf(i));
    }

    @Override // com.daaw.p30, android.app.Activity
    public void onResume() {
        super.onResume();
        f3717j0.m12018a(this);
    }

    @Override // com.daaw.ActivityC2508p3, com.daaw.p30, android.app.Activity
    public void onStart() {
        f3716i0.m12018a(this);
        super.onStart();
        Message obtainMessage = this.f3751d0.obtainMessage(3);
        this.f3751d0.removeMessages(3);
        this.f3751d0.sendMessageDelayed(obtainMessage, 10000L);
    }

    @Override // com.daaw.ActivityC2508p3, com.daaw.p30, android.app.Activity
    public void onStop() {
        lz1.m16365a("######### onStop");
        super.onStop();
        f3719l0.m12018a(this);
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        m26942J0(true);
        super.onUserInteraction();
    }

    /* renamed from: s0 */
    public Toolbar m26902s0() {
        return this.f3744W;
    }
}
