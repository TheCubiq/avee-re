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
import androidx.lifecycle.c;
import androidx.viewpager.widget.ViewPager;
import com.daaw.af0;
import com.daaw.al;
import com.daaw.avee.Common.ListPreferenceLanguage;
import com.daaw.avee.CustomViewPager;
import com.daaw.avee.MainActivity;
import com.daaw.br1;
import com.daaw.df0;
import com.daaw.dx0;
import com.daaw.e0;
import com.daaw.ee0;
import com.daaw.gj1;
import com.daaw.gr1;
import com.daaw.h0;
import com.daaw.hj1;
import com.daaw.i0;
import com.daaw.i2;
import com.daaw.ij1;
import com.daaw.j5;
import com.daaw.jj1;
import com.daaw.lc;
import com.daaw.lo1;
import com.daaw.lz1;
import com.daaw.m30;
import com.daaw.n30;
import com.daaw.nc0;
import com.daaw.o30;
import com.daaw.o5;
import com.daaw.p3;
import com.daaw.pw1;
import com.daaw.qw1;
import com.daaw.rw1;
import com.daaw.tw1;
import com.daaw.tx0;
import com.daaw.ty;
import com.daaw.ud1;
import com.daaw.vw1;
import com.daaw.vy;
import com.daaw.ww1;
import com.daaw.x30;
import com.daaw.xw1;
import com.daaw.yw1;
import com.daaw.zk;
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
public class MainActivity extends p3 {
    public dx0 M;
    public g O;
    public CustomViewPager P;
    public Toast S;
    public gj1 U;
    public DrawerLayout V;
    public Toolbar W;
    public SwitchCompat X;
    public SwitchCompat Y;
    public final Handler d0;
    public final List<Object> e0;
    public tx0.b f0;
    public ValueAnimator g0;
    public static qw1<Activity> h0 = new qw1<>();
    public static qw1<Activity> i0 = new qw1<>();
    public static qw1<Activity> j0 = new qw1<>();
    public static qw1<Activity> k0 = new qw1<>();
    public static qw1<Activity> l0 = new qw1<>();
    public static qw1<Configuration> m0 = new qw1<>();
    public static qw1<al> n0 = new qw1<>();
    public static pw1 o0 = new pw1();
    public static rw1<Integer, Activity> p0 = new rw1<>();
    public static qw1<Context> q0 = new qw1<>();
    public static rw1<Integer, al> r0 = new rw1<>();
    public static tw1<i2, af0, Integer, Integer> s0 = new tw1<>();
    public static vw1<ud1> t0 = new vw1<>();
    public static vw1<Boolean> u0 = new vw1<>();
    public static rw1<Integer, String> v0 = new rw1<>();
    public static qw1<Boolean> w0 = new qw1<>();
    public static qw1<Integer> x0 = new qw1<>();
    public static vw1<ee0> y0 = new vw1<>();
    public static rw1<List<tx0>, Integer> z0 = new rw1<>();
    public static qw1<Boolean> A0 = new qw1<>();
    public static qw1<Context> B0 = new qw1<>();
    public static rw1<Float, Context> C0 = new rw1<>();
    public static rw1<Activity, Integer> D0 = new rw1<>();
    public static yw1<Integer, Integer, Intent, Boolean> E0 = new yw1<>();
    public static rw1<Integer, Intent> F0 = new rw1<>();
    public static vw1<tx0.b> G0 = new vw1<>();
    public static vw1<lo1<Boolean, Boolean>> H0 = new vw1<>();
    public static vw1<Boolean> I0 = new vw1<>();
    public static ww1<Activity, Boolean> J0 = new ww1<>();
    public static xw1<al, Intent, Boolean> K0 = new xw1<>();
    public static xw1<al, Integer, Boolean> L0 = new xw1<>();
    public static MainActivity M0 = null;
    public int N = -1;
    public WeakReference<MenuItem> Q = new WeakReference<>(null);
    public boolean R = false;
    public Timer T = null;
    public MenuItem Z = null;
    public MenuItem a0 = null;
    public MenuItem b0 = null;
    public MenuItem c0 = null;

    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            Message obtainMessage;
            Handler handler;
            long j;
            int i = message.what;
            if (i != 2) {
                if (i == 3) {
                    ty.b.a();
                    MainActivity.this.d0.removeMessages(3);
                    obtainMessage = MainActivity.this.d0.obtainMessage(3);
                    handler = MainActivity.this.d0;
                    j = 10000;
                } else if (i == 4) {
                    ty.a.a();
                    MainActivity.this.d0.removeMessages(4);
                    obtainMessage = MainActivity.this.d0.obtainMessage(4);
                    handler = MainActivity.this.d0;
                    j = 1000;
                }
                handler.sendMessageDelayed(obtainMessage, j);
            } else if (MainActivity.this.N == 2 && j5.e().h(j5.n)) {
                MainActivity mainActivity = MainActivity.this;
                mainActivity.N0(false, mainActivity.N);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements CustomViewPager.a {
        public b() {
        }

        @Override // com.daaw.avee.CustomViewPager.a
        public void a(float f) {
            MainActivity.C0.a(Float.valueOf(f), MainActivity.this.getApplicationContext());
        }

        @Override // com.daaw.avee.CustomViewPager.a
        public void b() {
            MainActivity.B0.a(MainActivity.this.getApplicationContext());
        }

        @Override // com.daaw.avee.CustomViewPager.a
        public void c() {
        }
    }

    /* loaded from: classes.dex */
    public class c implements ViewPager.j {
        public c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i) {
            MainActivity.this.H0(i);
        }
    }

    /* loaded from: classes.dex */
    public class d extends TimerTask {
        public d() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            MainActivity.this.R = false;
            MainActivity.this.S.cancel();
            if (MainActivity.this.T != null) {
                MainActivity.this.T.cancel();
            }
            MainActivity.this.l0();
        }
    }

    /* loaded from: classes.dex */
    public class e implements SearchView.OnQueryTextListener {
        public final /* synthetic */ SearchView a;

        public e(SearchView searchView) {
            this.a = searchView;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String str) {
            if (this.a.getTag() != null) {
                MainActivity.v0.a(Integer.valueOf(((Integer) this.a.getTag()).intValue()), str);
                return true;
            }
            return true;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String str) {
            this.a.clearFocus();
            if (this.a.getTag() != null) {
                MainActivity.v0.a(Integer.valueOf(((Integer) this.a.getTag()).intValue()), str);
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class f implements af0 {
        public Object a;

        public f() {
        }

        @Override // com.daaw.af0
        public void a(Object obj) {
            this.a = obj;
        }

        @Override // com.daaw.af0
        public void b(df0 df0Var, String str, String str2) {
            gr1.h(df0.g(df0Var));
            df0.c(df0Var);
        }
    }

    /* loaded from: classes.dex */
    public class g extends x30 {
        public g(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // com.daaw.kv0
        public int c() {
            return 3;
        }

        @Override // com.daaw.kv0
        public CharSequence e(int i) {
            Drawable e;
            SpannableStringBuilder spannableStringBuilder;
            if (i == 0) {
                e = zk.e(MainActivity.this, R.drawable.ic_library_2_s);
                spannableStringBuilder = new SpannableStringBuilder("   ");
            } else if (i == 1) {
                e = zk.e(MainActivity.this, R.drawable.ic_playlist4);
                spannableStringBuilder = new SpannableStringBuilder("   ");
            } else if (i != 2) {
                return " ";
            } else {
                e = zk.e(MainActivity.this, R.drawable.ic_visual2);
                spannableStringBuilder = new SpannableStringBuilder("   ");
            }
            if (e == null) {
                return "";
            }
            e.setBounds(0, 0, e.getIntrinsicWidth(), e.getIntrinsicHeight());
            spannableStringBuilder.setSpan(new ImageSpan(e, 1), 1, 2, 33);
            return spannableStringBuilder;
        }

        @Override // com.daaw.x30
        public Fragment p(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return o30.i();
                }
                return n30.o();
            }
            return m30.w();
        }
    }

    public MainActivity() {
        LinkedList linkedList = new LinkedList();
        this.e0 = linkedList;
        this.f0 = tx0.h;
        vy.a.b(new qw1.a() { // from class: com.daaw.pm0
            @Override // com.daaw.qw1.a
            public final void b(Object obj) {
                MainActivity.this.u0((String) obj);
            }
        }, linkedList);
        this.d0 = new Handler(new a());
    }

    public static /* synthetic */ boolean A0() {
        w0.a(Boolean.FALSE);
        return false;
    }

    public static /* synthetic */ void B0(View view, boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D0(Integer num) {
        L0(this.a0, num);
        L0(this.b0, num);
        L0(this.c0, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E0() {
        MenuItem menuItem = this.a0;
        if (menuItem != null) {
            menuItem.setVisible(false);
        }
        MenuItem menuItem2 = this.b0;
        if (menuItem2 != null) {
            menuItem2.setVisible(false);
        }
        MenuItem menuItem3 = this.c0;
        if (menuItem3 != null) {
            menuItem3.setVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F0(Integer num) {
        L0(this.a0, num);
        L0(this.b0, num);
        L0(this.c0, num);
    }

    public static void L0(MenuItem menuItem, Integer num) {
        Drawable icon;
        if (num == null || menuItem == null || (icon = menuItem.getIcon()) == null) {
            return;
        }
        icon.setAlpha(num.intValue());
    }

    public static m30 o0() {
        MainActivity mainActivity = M0;
        if (mainActivity == null) {
            return null;
        }
        return (m30) mainActivity.n0(0);
    }

    public static n30 p0() {
        MainActivity mainActivity = M0;
        if (mainActivity == null) {
            return null;
        }
        return (n30) mainActivity.n0(1);
    }

    public static o30 q0() {
        MainActivity mainActivity = M0;
        if (mainActivity == null) {
            return null;
        }
        return (o30) mainActivity.n0(2);
    }

    public static MainActivity r0() {
        return M0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(String str) {
        if (isFinishing()) {
            return;
        }
        lc.d(this, str, 1).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0(final String str) {
        if (!gr1.d()) {
            runOnUiThread(new Runnable() { // from class: com.daaw.gm0
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.this.t0(str);
                }
            });
        } else if (isFinishing()) {
        } else {
            lc.d(this, str, 1).e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean v0(Boolean bool) {
        if (a().b().a(c.EnumC0020c.RESUMED)) {
            com.daaw.avee.a.H0.c(x());
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean w0(MenuItem menuItem) {
        if (G0(menuItem)) {
            this.V.f();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x0(CompoundButton compoundButton, boolean z) {
        int i;
        al alVar;
        rw1<Integer, al> rw1Var = r0;
        if (z) {
            i = 1;
            alVar = new al(this);
        } else {
            i = 10;
            alVar = new al(this);
        }
        rw1Var.a(i, alVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0(CompoundButton compoundButton, boolean z) {
        r0.a(2, new al(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(boolean z) {
        if (z) {
            O0(I0.a(Boolean.TRUE).booleanValue(), this.N, true);
        }
    }

    @SuppressLint({"NonConstantResourceId"})
    public boolean G0(MenuItem menuItem) {
        SwitchCompat switchCompat;
        switch (menuItem.getItemId()) {
            case R.id.menu_contact /* 2131296689 */:
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "Avee Player <support@aveeplayer.com>", null));
                intent.putExtra("android.intent.extra.SUBJECT", "Contact from application");
                intent.putExtra("android.intent.extra.TEXT", "");
                startActivity(Intent.createChooser(intent, "Choose an Email client:"));
                return true;
            case R.id.menu_equalizer /* 2131296690 */:
                r0.a(3, new al(this));
                return true;
            case R.id.menu_lib /* 2131296691 */:
                this.P.setCurrentItem(0);
                return true;
            case R.id.menu_lock_orient /* 2131296692 */:
                switchCompat = this.Y;
                break;
            case R.id.menu_premium /* 2131296693 */:
                r0.a(4, new al(this));
                return true;
            case R.id.menu_queue /* 2131296694 */:
                this.P.setCurrentItem(1);
                return true;
            case R.id.menu_settings /* 2131296695 */:
                startActivity(new Intent(this, SettingsActivity.class));
                return true;
            case R.id.menu_sleep_timer /* 2131296696 */:
                switchCompat = this.X;
                break;
            case R.id.menu_top /* 2131296697 */:
            default:
                return false;
            case R.id.menu_visual /* 2131296698 */:
                this.P.setCurrentItem(2);
                return true;
            case R.id.menu_web /* 2131296699 */:
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.aveeplayer.com/")));
                return true;
        }
        switchCompat.toggle();
        return false;
    }

    public void H0(int i) {
        this.N = i;
        N0(I0.a(Boolean.TRUE).booleanValue(), this.N);
        p0.a(Integer.valueOf(this.N), this);
        x0.a(Integer.valueOf(this.N));
    }

    public void I0() {
        DrawerLayout drawerLayout = this.V;
        if (drawerLayout == null) {
            return;
        }
        drawerLayout.H(8388611);
    }

    public void J0(boolean z) {
        if (j5.e().h(j5.n)) {
            this.d0.removeMessages(2);
            if (z) {
                int integer = getResources().getInteger(R.integer.video_maximize_timeout);
                this.d0.sendMessageDelayed(this.d0.obtainMessage(2), integer);
            }
        }
    }

    public void K0(boolean z, boolean z2) {
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

    public final void M0(SearchView searchView) {
        gr1.v(searchView, zk.c(this, R.color.white_alpha_1), zk.c(this, R.color.text_color_m2));
    }

    public void N0(boolean z, int i) {
        O0(z, i, false);
    }

    public final void O0(boolean z, int i, boolean z2) {
        gj1 gj1Var;
        gj1 gj1Var2;
        J0(z);
        i0 G = G();
        X0(i == 2);
        if (z) {
            if (G != null) {
                if (i == 2) {
                    G.u(false);
                    G.t(false);
                } else {
                    G.u(true);
                    G.t(true);
                }
                gr1.w(s0());
            }
            Q0(G0.a(tx0.h));
            if (!z2 && (gj1Var2 = this.U) != null) {
                gj1Var2.d();
            }
        } else {
            if (G != null) {
                gr1.r(s0());
            }
            if (!z2 && (gj1Var = this.U) != null) {
                gj1Var.a();
            }
        }
        A0.a(Boolean.valueOf(!z));
    }

    public void P0(int i) {
        i0 G = G();
        N0((G == null || G.l()) ? false : true, i);
    }

    public void Q0(tx0.b bVar) {
        if (bVar.equals(this.f0)) {
            return;
        }
        this.f0 = bVar;
        i0 G = G();
        if (G != null) {
            G.x(bVar.e);
            G.w(bVar.i() ? bVar.h : "");
        }
        s0.a(new i2(bVar.a, bVar.d(), bVar.b()), new f(), 200, 200);
    }

    public void R0(boolean z, boolean z2) {
        SwitchCompat switchCompat = this.Y;
        if (switchCompat != null) {
            switchCompat.setChecked(z);
        }
    }

    public void S0() {
        boolean z;
        MenuItem menuItem = this.Q.get();
        if (menuItem == null) {
            return;
        }
        vw1<lo1<Boolean, Boolean>> vw1Var = H0;
        Boolean bool = Boolean.FALSE;
        lo1<Boolean, Boolean> a2 = vw1Var.a(new lo1<>(bool, bool));
        if (a2.b.booleanValue()) {
            menuItem.setIcon(a2.a.booleanValue() ? R.drawable.ic_info2 : R.drawable.ic_coin);
            z = true;
        } else {
            z = false;
        }
        menuItem.setVisible(z);
    }

    public void T0() {
        U0(y0.a(null));
    }

    public void U0(ee0 ee0Var) {
        SearchView searchView;
        MenuItem menuItem = this.Z;
        if (menuItem == null || (searchView = (SearchView) menuItem.getActionView()) == null) {
            return;
        }
        if (ee0Var == null || !ee0Var.isEnabled()) {
            this.Z.setVisible(false);
            searchView.setQueryHint("");
            return;
        }
        String c2 = ee0Var.c();
        this.Z.setVisible(true);
        if (c2 == null || c2.isEmpty()) {
            searchView.setTag(Integer.valueOf(ee0Var.b()));
            searchView.setQuery("", false);
        } else {
            searchView.setTag(Integer.valueOf(ee0Var.b()));
            searchView.setQuery(c2, false);
            if (searchView.isIconified()) {
                searchView.setIconified(false);
            }
        }
        searchView.setQueryHint(ee0Var.a());
    }

    /* renamed from: V0 */
    public void C0(boolean z, boolean z2) {
        SwitchCompat switchCompat = this.X;
        if (switchCompat != null) {
            switchCompat.setChecked(z);
        }
    }

    public void W0(final boolean z, final boolean z2) {
        this.d0.post(new Runnable() { // from class: com.daaw.hm0
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.this.C0(z, z2);
            }
        });
    }

    public final void X0(boolean z) {
        ValueAnimator e2;
        if (z) {
            MenuItem menuItem = this.a0;
            if (menuItem == null || menuItem.isVisible()) {
                return;
            }
            int integer = getResources().getInteger(17694720);
            this.a0.setVisible(true);
            this.b0.setVisible(true);
            this.c0.setVisible(true);
            e2 = gr1.f(this.g0, new e0() { // from class: com.daaw.mm0
                @Override // com.daaw.e0
                public final void a(Object obj) {
                    MainActivity.this.F0((Integer) obj);
                }
            }, this.a0.getIcon().getAlpha(), integer);
        } else {
            MenuItem menuItem2 = this.a0;
            if (menuItem2 == null || !menuItem2.isVisible()) {
                return;
            }
            e2 = gr1.e(this.g0, new e0() { // from class: com.daaw.lm0
                @Override // com.daaw.e0
                public final void a(Object obj) {
                    MainActivity.this.D0((Integer) obj);
                }
            }, this.a0.getIcon().getAlpha(), getResources().getInteger(17694720), new h0() { // from class: com.daaw.nm0
                @Override // com.daaw.h0
                public final void a() {
                    MainActivity.this.E0();
                }
            });
        }
        this.g0 = e2;
    }

    public final boolean k0() {
        SearchView searchView;
        MenuItem menuItem = this.Z;
        if (menuItem == null || (searchView = (SearchView) menuItem.getActionView()) == null || searchView.isIconified()) {
            return false;
        }
        searchView.setTag(Integer.valueOf(this.N));
        searchView.setQuery("", false);
        searchView.setIconified(true);
        return true;
    }

    public void l0() {
        o0.a();
        finish();
    }

    public void m0() {
        finish();
    }

    public final Fragment n0(int i) {
        g gVar;
        CustomViewPager customViewPager = this.P;
        if (customViewPager == null || (gVar = this.O) == null) {
            return null;
        }
        FragmentManager fragmentManager = getFragmentManager();
        return fragmentManager.findFragmentByTag("android:switcher:" + customViewPager.getId() + ":" + gVar.q(i));
    }

    @Override // com.daaw.p30, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (E0.a(Integer.valueOf(i), Integer.valueOf(i2), intent, Boolean.FALSE).booleanValue() || i2 != -1) {
            return;
        }
        F0.a(Integer.valueOf(i2), intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (J0.a(this, Boolean.FALSE).booleanValue()) {
            return;
        }
        DrawerLayout drawerLayout = this.V;
        if (drawerLayout != null && drawerLayout.A(8388611)) {
            this.V.f();
            return;
        }
        CustomViewPager customViewPager = this.P;
        if (customViewPager != null && customViewPager.getCurrentItem() != 0) {
            this.P.setCurrentItem(0);
            return;
        }
        m30 o02 = o0();
        if (o02 == null || !o02.l()) {
            super.onBackPressed();
        } else {
            o02.q();
        }
    }

    @Override // com.daaw.p3, com.daaw.p30, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m0.a(configuration);
    }

    @Override // com.daaw.p30, androidx.activity.ComponentActivity, com.daaw.zh, android.app.Activity
    public void onCreate(Bundle bundle) {
        Toast.makeText(this, "ᴡ ᴡ ᴡ . ғ ᴀ ʀ s ʀ ᴏ ɪ ᴅ . ᴄ ᴏ ᴍ", 1).show();
        super.onCreate(bundle);
        if (br1.a) {
            try {
                Security.insertProviderAt(Conscrypt.newProvider(), 1);
                HttpsURLConnection.setDefaultSSLSocketFactory(new jj1());
            } catch (Exception e2) {
                lz1.b(e2, "Failed adding TLSv1.3 - IceCast probably broken");
            }
        }
        M0 = this;
        this.M = dx0.h();
        try {
            PreferenceManager.setDefaultValues(getApplicationContext(), R.xml.preferences, false);
            ListPreferenceLanguage.a(j5.P(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()), "pref_appLang", "en"));
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        nc0.n.b(new ww1.a() { // from class: com.daaw.qm0
            @Override // com.daaw.ww1.a
            public final Object b(Object obj) {
                Boolean v02;
                v02 = MainActivity.this.v0((Boolean) obj);
                return v02;
            }
        }, this.e0);
        q0.a(getApplicationContext());
        setTheme(o5.a(this));
        setContentView(R.layout.main_activity);
        h0.a(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.W = toolbar;
        P(toolbar);
        gr1.u(findViewById(R.id.viewStatusBarBg));
        this.V = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setBackgroundColor(gr1.o(getTheme(), this, R.attr.containerBackground, R.color.white_alpha_1));
        ((TextView) navigationView.f(0).findViewById(R.id.nav_version_name)).setText(br1.m());
        navigationView.setNavigationItemSelectedListener(new NavigationView.c() { // from class: com.daaw.fm0
            @Override // com.google.android.material.navigation.NavigationView.c
            public final boolean a(MenuItem menuItem) {
                boolean w02;
                w02 = MainActivity.this.w0(menuItem);
                return w02;
            }
        });
        MenuItem findItem = navigationView.getMenu().findItem(R.id.menu_premium);
        findItem.setTitle(Html.fromHtml("<b>" + ((Object) findItem.getTitle()) + "</b>"));
        this.Q = new WeakReference<>(findItem);
        this.X = (SwitchCompat) navigationView.getMenu().findItem(R.id.menu_sleep_timer).getActionView().findViewById(R.id.drawer_switch);
        this.Y = (SwitchCompat) navigationView.getMenu().findItem(R.id.menu_lock_orient).getActionView().findViewById(R.id.drawer_switch);
        this.X.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.daaw.im0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MainActivity.this.x0(compoundButton, z);
            }
        });
        this.Y.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.daaw.jm0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MainActivity.this.y0(compoundButton, z);
            }
        });
        this.O = new g(getFragmentManager());
        CustomViewPager customViewPager = (CustomViewPager) findViewById(R.id.viewPager);
        this.P = customViewPager;
        customViewPager.setAdapter(this.O);
        this.P.setOnSwipeOutListener(new b());
        gj1 ij1Var = Build.VERSION.SDK_INT > 30 ? new ij1(this.P, 2, getWindow()) : new hj1(this.P, 2);
        this.U = ij1Var;
        ij1Var.c();
        this.U.d();
        this.U.b(new gj1.b() { // from class: com.daaw.om0
            @Override // com.daaw.gj1.b
            public final void a(boolean z) {
                MainActivity.this.z0(z);
            }
        });
        if (K0.a(new al(this), getIntent(), Boolean.FALSE).booleanValue()) {
            this.P.setCurrentItem(2);
            H0(2);
        } else {
            int k = j5.e().k(j5.G);
            this.P.setCurrentItem(k);
            H0(k);
        }
        this.P.b(new c());
        Message obtainMessage = this.d0.obtainMessage(3);
        this.d0.removeMessages(3);
        this.d0.sendMessageDelayed(obtainMessage, 10000L);
        Message obtainMessage2 = this.d0.obtainMessage(4);
        this.d0.removeMessages(4);
        this.d0.sendMessageDelayed(obtainMessage2, 1000L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        ud1 a2 = t0.a(null);
        if (a2 == null) {
            a2 = new ud1();
        }
        C0(a2.a, true);
        R0(u0.a(Boolean.FALSE).booleanValue(), true);
        MenuItem findItem = menu.findItem(R.id.action_bar_search);
        this.Z = findItem;
        SearchView searchView = (SearchView) findItem.getActionView();
        if (searchView != null) {
            searchView.setIconifiedByDefault(true);
            searchView.setSubmitButtonEnabled(false);
            searchView.setOnQueryTextListener(new e(searchView));
            searchView.setOnCloseListener(new SearchView.OnCloseListener() { // from class: com.daaw.km0
                @Override // android.widget.SearchView.OnCloseListener
                public final boolean onClose() {
                    boolean A02;
                    A02 = MainActivity.A0();
                    return A02;
                }
            });
            searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.daaw.em0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    MainActivity.B0(view, z);
                }
            });
            M0(searchView);
            T0();
        }
        S0();
        this.a0 = menu.findItem(R.id.action_bar_viz_btn0);
        this.b0 = menu.findItem(R.id.action_bar_viz_btn1);
        this.c0 = menu.findItem(R.id.action_bar_viz_btn5);
        X0(this.N == 2);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.daaw.p3, com.daaw.p30, android.app.Activity
    public void onDestroy() {
        lz1.a("######### onDestroy");
        this.M = null;
        this.O = null;
        this.P = null;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.a0 = null;
        this.b0 = null;
        this.c0 = null;
        this.f0 = null;
        M0 = null;
        n0.a(new al(this));
        K0(false, false);
        super.onDestroy();
    }

    @Override // com.daaw.p3, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && k0()) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        int integer = j5.e().K(getApplicationContext(), "pref_hold_exit", true) ? getResources().getInteger(R.integer.hold_exit_ms) : 0;
        if (i != 4 || integer <= 0) {
            return super.onKeyLongPress(i, keyEvent);
        }
        this.R = true;
        Toast makeText = Toast.makeText(getApplicationContext(), getString(R.string.hold_exit), 0);
        this.S = makeText;
        makeText.show();
        Timer timer = new Timer();
        this.T = timer;
        timer.schedule(new d(), integer);
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4 && this.R) {
            this.R = false;
            Timer timer = this.T;
            if (timer != null) {
                timer.cancel();
            }
            this.T = null;
            this.S.setText(getString(R.string.hold_exit_canceled));
            this.S.setDuration(0);
            this.S.show();
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // com.daaw.p30, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (K0.a(new al(this), intent, Boolean.FALSE).booleanValue()) {
            this.P.setCurrentItem(2);
            H0(2);
        }
        super.onNewIntent(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @android.annotation.SuppressLint({"NonConstantResourceId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onOptionsItemSelected(android.view.MenuItem r6) {
        /*
            r5 = this;
            int r0 = r6.getItemId()
            r1 = 16908332(0x102002c, float:2.3877352E-38)
            r2 = 1
            if (r0 == r1) goto L6a
            switch(r0) {
                case 2131296315: goto Le;
                case 2131296316: goto L28;
                case 2131296317: goto L43;
                default: goto Ld;
            }
        Ld:
            goto L5e
        Le:
            com.daaw.xw1<com.daaw.al, java.lang.Integer, java.lang.Boolean> r0 = com.daaw.avee.MainActivity.L0
            com.daaw.al r1 = new com.daaw.al
            r1.<init>(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r0.a(r1, r3, r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L28
            return r2
        L28:
            com.daaw.xw1<com.daaw.al, java.lang.Integer, java.lang.Boolean> r0 = com.daaw.avee.MainActivity.L0
            com.daaw.al r1 = new com.daaw.al
            r1.<init>(r5)
            r3 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r0.a(r1, r3, r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L43
            return r2
        L43:
            com.daaw.xw1<com.daaw.al, java.lang.Integer, java.lang.Boolean> r0 = com.daaw.avee.MainActivity.L0
            com.daaw.al r1 = new com.daaw.al
            r1.<init>(r5)
            r3 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r0.a(r1, r3, r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5e
            return r2
        L5e:
            boolean r0 = r5.G0(r6)
            if (r0 == 0) goto L65
            return r2
        L65:
            boolean r6 = super.onOptionsItemSelected(r6)
            return r6
        L6a:
            r5.I0()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.avee.MainActivity.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // com.daaw.p30, android.app.Activity
    public void onPause() {
        lz1.a("######### onPause");
        k0.a(this);
        super.onPause();
    }

    @Override // com.daaw.p30, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        D0.a(this, Integer.valueOf(i));
    }

    @Override // com.daaw.p30, android.app.Activity
    public void onResume() {
        super.onResume();
        j0.a(this);
    }

    @Override // com.daaw.p3, com.daaw.p30, android.app.Activity
    public void onStart() {
        i0.a(this);
        super.onStart();
        Message obtainMessage = this.d0.obtainMessage(3);
        this.d0.removeMessages(3);
        this.d0.sendMessageDelayed(obtainMessage, 10000L);
    }

    @Override // com.daaw.p3, com.daaw.p30, android.app.Activity
    public void onStop() {
        lz1.a("######### onStop");
        super.onStop();
        l0.a(this);
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        J0(true);
        super.onUserInteraction();
    }

    public Toolbar s0() {
        return this.W;
    }
}
