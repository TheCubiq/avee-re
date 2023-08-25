package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.AbstractC0051a;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.AbstractC0314j;
import androidx.fragment.app.C0297c;
import androidx.fragment.app.C0316k;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0344c;
import androidx.lifecycle.InterfaceC0348d;
import com.daaw.AbstractC3274v0;
import com.daaw.AbstractC3658y0;
import com.daaw.C1798j6;
import com.daaw.C3391w0;
import com.daaw.C3423wd;
import com.daaw.C3489x0;
import com.daaw.InterfaceC3153u0;
import com.daaw.InterfaceC3790z0;
import com.daaw.kl0;
import com.daaw.mt1;
import com.daaw.ne1;
import com.daaw.nt1;
import com.daaw.r11;
import com.daaw.r30;
import com.daaw.s30;
import com.daaw.sj0;
import com.daaw.v30;
import com.daaw.w30;
import com.daaw.wt0;
import com.daaw.y30;
import com.daaw.yt0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class FragmentManager {

    /* renamed from: O */
    public static boolean f1435O = false;

    /* renamed from: P */
    public static boolean f1436P = true;

    /* renamed from: A */
    public AbstractC3658y0<IntentSenderRequest> f1437A;

    /* renamed from: B */
    public AbstractC3658y0<String[]> f1438B;

    /* renamed from: D */
    public boolean f1440D;

    /* renamed from: E */
    public boolean f1441E;

    /* renamed from: F */
    public boolean f1442F;

    /* renamed from: G */
    public boolean f1443G;

    /* renamed from: H */
    public boolean f1444H;

    /* renamed from: I */
    public ArrayList<C0281a> f1445I;

    /* renamed from: J */
    public ArrayList<Boolean> f1446J;

    /* renamed from: K */
    public ArrayList<Fragment> f1447K;

    /* renamed from: L */
    public ArrayList<C0278o> f1448L;

    /* renamed from: M */
    public v30 f1449M;

    /* renamed from: b */
    public boolean f1452b;

    /* renamed from: d */
    public ArrayList<C0281a> f1454d;

    /* renamed from: e */
    public ArrayList<Fragment> f1455e;

    /* renamed from: g */
    public OnBackPressedDispatcher f1457g;

    /* renamed from: l */
    public ArrayList<InterfaceC0275l> f1462l;

    /* renamed from: r */
    public AbstractC0305e<?> f1468r;

    /* renamed from: s */
    public r30 f1469s;

    /* renamed from: t */
    public Fragment f1470t;

    /* renamed from: u */
    public Fragment f1471u;

    /* renamed from: z */
    public AbstractC3658y0<Intent> f1476z;

    /* renamed from: a */
    public final ArrayList<InterfaceC0276m> f1451a = new ArrayList<>();

    /* renamed from: c */
    public final C0313i f1453c = new C0313i();

    /* renamed from: f */
    public final LayoutInflater$Factory2C0306f f1456f = new LayoutInflater$Factory2C0306f(this);

    /* renamed from: h */
    public final wt0 f1458h = new C0266c(false);

    /* renamed from: i */
    public final AtomicInteger f1459i = new AtomicInteger();

    /* renamed from: j */
    public final Map<String, Bundle> f1460j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    public final Map<String, Object> f1461k = Collections.synchronizedMap(new HashMap());

    /* renamed from: m */
    public Map<Fragment, HashSet<C3423wd>> f1463m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n */
    public final C0316k.InterfaceC0323g f1464n = new C0267d();

    /* renamed from: o */
    public final C0308g f1465o = new C0308g(this);

    /* renamed from: p */
    public final CopyOnWriteArrayList<w30> f1466p = new CopyOnWriteArrayList<>();

    /* renamed from: q */
    public int f1467q = -1;

    /* renamed from: v */
    public C0304d f1472v = null;

    /* renamed from: w */
    public C0304d f1473w = new C0268e();

    /* renamed from: x */
    public ne1 f1474x = null;

    /* renamed from: y */
    public ne1 f1475y = new C0269f();

    /* renamed from: C */
    public ArrayDeque<LaunchedFragmentInfo> f1439C = new ArrayDeque<>();

    /* renamed from: N */
    public Runnable f1450N = new RunnableC0270g();

    /* renamed from: androidx.fragment.app.FragmentManager$6 */
    /* loaded from: classes.dex */
    class C02626 implements InterfaceC0348d {

        /* renamed from: a */
        public final /* synthetic */ String f1477a;

        /* renamed from: b */
        public final /* synthetic */ y30 f1478b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC0344c f1479c;

        /* renamed from: d */
        public final /* synthetic */ FragmentManager f1480d;

        @Override // androidx.lifecycle.InterfaceC0348d
        /* renamed from: a */
        public void mo18735a(sj0 sj0Var, AbstractC0344c.EnumC0346b enumC0346b) {
            Bundle bundle;
            if (enumC0346b == AbstractC0344c.EnumC0346b.ON_START && (bundle = (Bundle) this.f1480d.f1460j.get(this.f1477a)) != null) {
                this.f1478b.m4230a(this.f1477a, bundle);
                this.f1480d.m29293q(this.f1477a);
            }
            if (enumC0346b == AbstractC0344c.EnumC0346b.ON_DESTROY) {
                this.f1479c.mo29046c(this);
                this.f1480d.f1461k.remove(this.f1477a);
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new C0263a();

        /* renamed from: p */
        public String f1481p;

        /* renamed from: q */
        public int f1482q;

        /* renamed from: androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$a */
        /* loaded from: classes.dex */
        public class C0263a implements Parcelable.Creator<LaunchedFragmentInfo> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public LaunchedFragmentInfo[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        public LaunchedFragmentInfo(Parcel parcel) {
            this.f1481p = parcel.readString();
            this.f1482q = parcel.readInt();
        }

        public LaunchedFragmentInfo(String str, int i) {
            this.f1481p = str;
            this.f1482q = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f1481p);
            parcel.writeInt(this.f1482q);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$a */
    /* loaded from: classes.dex */
    public class C0264a implements InterfaceC3153u0<ActivityResult> {
        public C0264a() {
        }

        @Override // com.daaw.InterfaceC3153u0
        /* renamed from: b */
        public void mo8646a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f1439C.pollFirst();
            if (pollFirst == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("No IntentSenders were started for ");
                sb.append(this);
                return;
            }
            String str = pollFirst.f1481p;
            int i = pollFirst.f1482q;
            Fragment m29167i = FragmentManager.this.f1453c.m29167i(str);
            if (m29167i != null) {
                m29167i.mo25244j0(i, activityResult.m30363b(), activityResult.m30364a());
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Intent Sender result delivered for unknown Fragment ");
            sb2.append(str);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$b */
    /* loaded from: classes.dex */
    public class C0265b implements InterfaceC3153u0<Map<String, Boolean>> {
        public C0265b() {
        }

        @Override // com.daaw.InterfaceC3153u0
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void mo8646a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f1439C.pollFirst();
            if (pollFirst == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("No permissions were requested for ");
                sb.append(this);
                return;
            }
            String str = pollFirst.f1481p;
            int i2 = pollFirst.f1482q;
            Fragment m29167i = FragmentManager.this.f1453c.m29167i(str);
            if (m29167i != null) {
                m29167i.m29478I0(i2, strArr, iArr);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Permission request result delivered for unknown Fragment ");
            sb2.append(str);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$c */
    /* loaded from: classes.dex */
    public class C0266c extends wt0 {
        public C0266c(boolean z) {
            super(z);
        }

        @Override // com.daaw.wt0
        /* renamed from: b */
        public void mo5816b() {
            FragmentManager.this.m29389A0();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$d */
    /* loaded from: classes.dex */
    public class C0267d implements C0316k.InterfaceC0323g {
        public C0267d() {
        }

        @Override // androidx.fragment.app.C0316k.InterfaceC0323g
        /* renamed from: a */
        public void mo29109a(Fragment fragment, C3423wd c3423wd) {
            FragmentManager.this.m29323f(fragment, c3423wd);
        }

        @Override // androidx.fragment.app.C0316k.InterfaceC0323g
        /* renamed from: b */
        public void mo29108b(Fragment fragment, C3423wd c3423wd) {
            if (c3423wd.m6172b()) {
                return;
            }
            FragmentManager.this.m29341Y0(fragment, c3423wd);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$e */
    /* loaded from: classes.dex */
    public class C0268e extends C0304d {
        public C0268e() {
        }

        @Override // androidx.fragment.app.C0304d
        /* renamed from: a */
        public Fragment mo29219a(ClassLoader classLoader, String str) {
            return FragmentManager.this.m29288s0().m11811d(FragmentManager.this.m29288s0().m29214k(), str, null);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$f */
    /* loaded from: classes.dex */
    public class C0269f implements ne1 {
        public C0269f() {
        }

        @Override // com.daaw.ne1
        /* renamed from: a */
        public AbstractC0325l mo15210a(ViewGroup viewGroup) {
            return new C0282b(viewGroup);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$g */
    /* loaded from: classes.dex */
    public class RunnableC0270g implements Runnable {
        public RunnableC0270g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.m29337a0(true);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$h */
    /* loaded from: classes.dex */
    public class C0271h extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f1490a;

        /* renamed from: b */
        public final /* synthetic */ View f1491b;

        /* renamed from: c */
        public final /* synthetic */ Fragment f1492c;

        public C0271h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f1490a = viewGroup;
            this.f1491b = view;
            this.f1492c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1490a.endViewTransition(this.f1491b);
            animator.removeListener(this);
            Fragment fragment = this.f1492c;
            View view = fragment.f1376W;
            if (view == null || !fragment.f1368O) {
                return;
            }
            view.setVisibility(8);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$i */
    /* loaded from: classes.dex */
    public class C0272i implements w30 {

        /* renamed from: p */
        public final /* synthetic */ Fragment f1494p;

        public C0272i(Fragment fragment) {
            this.f1494p = fragment;
        }

        @Override // com.daaw.w30
        /* renamed from: b */
        public void mo6558b(FragmentManager fragmentManager, Fragment fragment) {
            this.f1494p.m29426m0(fragment);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$j */
    /* loaded from: classes.dex */
    public class C0273j implements InterfaceC3153u0<ActivityResult> {
        public C0273j() {
        }

        @Override // com.daaw.InterfaceC3153u0
        /* renamed from: b */
        public void mo8646a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f1439C.pollFirst();
            if (pollFirst == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("No Activities were started for result for ");
                sb.append(this);
                return;
            }
            String str = pollFirst.f1481p;
            int i = pollFirst.f1482q;
            Fragment m29167i = FragmentManager.this.f1453c.m29167i(str);
            if (m29167i != null) {
                m29167i.mo25244j0(i, activityResult.m30363b(), activityResult.m30364a());
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Activity result delivered for unknown Fragment ");
            sb2.append(str);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$k */
    /* loaded from: classes.dex */
    public static class C0274k extends AbstractC3274v0<IntentSenderRequest, ActivityResult> {
        @Override // com.daaw.AbstractC3274v0
        /* renamed from: d */
        public Intent mo5672a(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent m30359a = intentSenderRequest.m30359a();
            if (m30359a != null && (bundleExtra = m30359a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                m30359a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (m30359a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.C0050b(intentSenderRequest.m30356g()).m30352b(null).m30351c(intentSenderRequest.m30357c(), intentSenderRequest.m30358b()).m30353a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.m29381E0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("CreateIntent created the following intent: ");
                sb.append(intent);
            }
            return intent;
        }

        @Override // com.daaw.AbstractC3274v0
        /* renamed from: e */
        public ActivityResult mo5671c(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$l */
    /* loaded from: classes.dex */
    public interface InterfaceC0275l {
        /* renamed from: a */
        void m29266a();
    }

    /* renamed from: androidx.fragment.app.FragmentManager$m */
    /* loaded from: classes.dex */
    public interface InterfaceC0276m {
        /* renamed from: a */
        boolean mo29252a(ArrayList<C0281a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.FragmentManager$n */
    /* loaded from: classes.dex */
    public class C0277n implements InterfaceC0276m {

        /* renamed from: a */
        public final String f1497a;

        /* renamed from: b */
        public final int f1498b;

        /* renamed from: c */
        public final int f1499c;

        public C0277n(String str, int i, int i2) {
            this.f1497a = str;
            this.f1498b = i;
            this.f1499c = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC0276m
        /* renamed from: a */
        public boolean mo29252a(ArrayList<C0281a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f1471u;
            if (fragment == null || this.f1498b >= 0 || this.f1497a != null || !fragment.m29408t().m29349U0()) {
                return FragmentManager.this.m29345W0(arrayList, arrayList2, this.f1497a, this.f1498b, this.f1499c);
            }
            return false;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$o */
    /* loaded from: classes.dex */
    public static class C0278o implements Fragment.InterfaceC0261h {

        /* renamed from: a */
        public final boolean f1501a;

        /* renamed from: b */
        public final C0281a f1502b;

        /* renamed from: c */
        public int f1503c;

        public C0278o(C0281a c0281a, boolean z) {
            this.f1501a = z;
            this.f1502b = c0281a;
        }

        @Override // androidx.fragment.app.Fragment.InterfaceC0261h
        /* renamed from: a */
        public void mo29265a() {
            this.f1503c++;
        }

        @Override // androidx.fragment.app.Fragment.InterfaceC0261h
        /* renamed from: b */
        public void mo29264b() {
            int i = this.f1503c - 1;
            this.f1503c = i;
            if (i != 0) {
                return;
            }
            this.f1502b.f1525t.m29321f1();
        }

        /* renamed from: c */
        public void m29263c() {
            C0281a c0281a = this.f1502b;
            c0281a.f1525t.m29287t(c0281a, this.f1501a, false, false);
        }

        /* renamed from: d */
        public void m29262d() {
            boolean z = this.f1503c > 0;
            for (Fragment fragment : this.f1502b.f1525t.m29290r0()) {
                fragment.m29499A1(null);
                if (z && fragment.m29444d0()) {
                    fragment.m29484F1();
                }
            }
            C0281a c0281a = this.f1502b;
            c0281a.f1525t.m29287t(c0281a, this.f1501a, !z, true);
        }

        /* renamed from: e */
        public boolean m29261e() {
            return this.f1503c == 0;
        }
    }

    /* renamed from: E0 */
    public static boolean m29381E0(int i) {
        return f1435O || Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: c0 */
    public static void m29331c0(ArrayList<C0281a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0281a c0281a = arrayList.get(i);
            if (arrayList2.get(i).booleanValue()) {
                c0281a.m29251p(-1);
                c0281a.m29246u(i == i2 + (-1));
            } else {
                c0281a.m29251p(1);
                c0281a.m29247t();
            }
            i++;
        }
    }

    /* renamed from: d1 */
    public static int m29327d1(int i) {
        if (i != 4097) {
            if (i != 4099) {
                return i != 8194 ? 0 : 4097;
            }
            return 4099;
        }
        return 8194;
    }

    /* renamed from: y0 */
    public static Fragment m29276y0(View view) {
        Object tag = view.getTag(r11.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* renamed from: A */
    public void m29390A(Configuration configuration) {
        for (Fragment fragment : this.f1453c.m29162n()) {
            if (fragment != null) {
                fragment.m29466R0(configuration);
            }
        }
    }

    /* renamed from: A0 */
    public void m29389A0() {
        m29337a0(true);
        if (this.f1458h.m5815c()) {
            m29349U0();
        } else {
            this.f1457g.m30369f();
        }
    }

    /* renamed from: B */
    public boolean m29388B(MenuItem menuItem) {
        if (this.f1467q < 1) {
            return false;
        }
        for (Fragment fragment : this.f1453c.m29162n()) {
            if (fragment != null && fragment.m29464S0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B0 */
    public void m29387B0(Fragment fragment) {
        if (m29381E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(fragment);
        }
        if (fragment.f1368O) {
            return;
        }
        fragment.f1368O = true;
        fragment.f1382c0 = true ^ fragment.f1382c0;
        m29309j1(fragment);
    }

    /* renamed from: C */
    public void m29386C() {
        this.f1441E = false;
        this.f1442F = false;
        this.f1449M.m7521n(false);
        m29354S(1);
    }

    /* renamed from: C0 */
    public void m29385C0(Fragment fragment) {
        if (fragment.f1354A && m29379F0(fragment)) {
            this.f1440D = true;
        }
    }

    /* renamed from: D */
    public boolean m29384D(Menu menu, MenuInflater menuInflater) {
        if (this.f1467q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f1453c.m29162n()) {
            if (fragment != null && m29377G0(fragment) && fragment.m29460U0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f1455e != null) {
            for (int i = 0; i < this.f1455e.size(); i++) {
                Fragment fragment2 = this.f1455e.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.m29405u0();
                }
            }
        }
        this.f1455e = arrayList;
        return z;
    }

    /* renamed from: D0 */
    public boolean m29383D0() {
        return this.f1443G;
    }

    /* renamed from: E */
    public void m29382E() {
        this.f1443G = true;
        m29337a0(true);
        m29344X();
        m29354S(-1);
        this.f1468r = null;
        this.f1469s = null;
        this.f1470t = null;
        if (this.f1457g != null) {
            this.f1458h.m5814d();
            this.f1457g = null;
        }
        AbstractC3658y0<Intent> abstractC3658y0 = this.f1476z;
        if (abstractC3658y0 != null) {
            abstractC3658y0.mo4277c();
            this.f1437A.mo4277c();
            this.f1438B.mo4277c();
        }
    }

    /* renamed from: F */
    public void m29380F() {
        m29354S(1);
    }

    /* renamed from: F0 */
    public final boolean m29379F0(Fragment fragment) {
        return (fragment.f1372S && fragment.f1373T) || fragment.f1363J.m29299n();
    }

    /* renamed from: G */
    public void m29378G() {
        for (Fragment fragment : this.f1453c.m29162n()) {
            if (fragment != null) {
                fragment.m29449a1();
            }
        }
    }

    /* renamed from: G0 */
    public boolean m29377G0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.m29446c0();
    }

    /* renamed from: H */
    public void m29376H(boolean z) {
        for (Fragment fragment : this.f1453c.m29162n()) {
            if (fragment != null) {
                fragment.m29447b1(z);
            }
        }
    }

    /* renamed from: H0 */
    public boolean m29375H0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.f1361H;
        return fragment.equals(fragmentManager.m29280w0()) && m29375H0(fragmentManager.f1470t);
    }

    /* renamed from: I */
    public void m29374I(Fragment fragment) {
        Iterator<w30> it = this.f1466p.iterator();
        while (it.hasNext()) {
            it.next().mo6558b(this, fragment);
        }
    }

    /* renamed from: I0 */
    public boolean m29373I0(int i) {
        return this.f1467q >= i;
    }

    /* renamed from: J */
    public boolean m29372J(MenuItem menuItem) {
        if (this.f1467q < 1) {
            return false;
        }
        for (Fragment fragment : this.f1453c.m29162n()) {
            if (fragment != null && fragment.m29445c1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J0 */
    public boolean m29371J0() {
        return this.f1441E || this.f1442F;
    }

    /* renamed from: K */
    public void m29370K(Menu menu) {
        if (this.f1467q < 1) {
            return;
        }
        for (Fragment fragment : this.f1453c.m29162n()) {
            if (fragment != null) {
                fragment.m29443d1(menu);
            }
        }
    }

    /* renamed from: K0 */
    public void m29369K0(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (this.f1476z == null) {
            this.f1468r.m29212p(fragment, intent, i, bundle);
            return;
        }
        this.f1439C.addLast(new LaunchedFragmentInfo(fragment.f1400u, i));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f1476z.m4279a(intent);
    }

    /* renamed from: L */
    public final void m29368L(Fragment fragment) {
        if (fragment == null || !fragment.equals(m29322f0(fragment.f1400u))) {
            return;
        }
        fragment.m29434h1();
    }

    /* renamed from: L0 */
    public final void m29367L0(C1798j6<Fragment> c1798j6) {
        int size = c1798j6.size();
        for (int i = 0; i < size; i++) {
            Fragment m18787n = c1798j6.m18787n(i);
            if (!m18787n.f1354A) {
                View m29417p1 = m18787n.m29417p1();
                m18787n.f1383d0 = m29417p1.getAlpha();
                m29417p1.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: M */
    public void m29366M() {
        m29354S(5);
    }

    /* renamed from: M0 */
    public void m29365M0(Fragment fragment) {
        if (!this.f1453c.m29173c(fragment.f1400u)) {
            if (m29381E0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Ignoring moving ");
                sb.append(fragment);
                sb.append(" to state ");
                sb.append(this.f1467q);
                sb.append("since it is not added to ");
                sb.append(this);
                return;
            }
            return;
        }
        m29361O0(fragment);
        View view = fragment.f1376W;
        if (view != null && fragment.f1381b0 && fragment.f1375V != null) {
            float f = fragment.f1383d0;
            if (f > 0.0f) {
                view.setAlpha(f);
            }
            fragment.f1383d0 = 0.0f;
            fragment.f1381b0 = false;
            C0297c.C0302d m29221c = C0297c.m29221c(this.f1468r.m29214k(), fragment, true, fragment.m29479I());
            if (m29221c != null) {
                Animation animation = m29221c.f1581a;
                if (animation != null) {
                    fragment.f1376W.startAnimation(animation);
                } else {
                    m29221c.f1582b.setTarget(fragment.f1376W);
                    m29221c.f1582b.start();
                }
            }
        }
        if (fragment.f1382c0) {
            m29285u(fragment);
        }
    }

    /* renamed from: N */
    public void m29364N(boolean z) {
        for (Fragment fragment : this.f1453c.m29162n()) {
            if (fragment != null) {
                fragment.m29439f1(z);
            }
        }
    }

    /* renamed from: N0 */
    public void m29363N0(int i, boolean z) {
        AbstractC0305e<?> abstractC0305e;
        if (this.f1468r == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f1467q) {
            this.f1467q = i;
            if (f1436P) {
                this.f1453c.m29158r();
            } else {
                for (Fragment fragment : this.f1453c.m29162n()) {
                    m29365M0(fragment);
                }
                for (C0310h c0310h : this.f1453c.m29165k()) {
                    Fragment m29187k = c0310h.m29187k();
                    if (!m29187k.f1381b0) {
                        m29365M0(m29187k);
                    }
                    if (m29187k.f1355B && !m29187k.m29448b0()) {
                        this.f1453c.m29159q(c0310h);
                    }
                }
            }
            m29303l1();
            if (this.f1440D && (abstractC0305e = this.f1468r) != null && this.f1467q == 7) {
                abstractC0305e.mo13648q();
                this.f1440D = false;
            }
        }
    }

    /* renamed from: O */
    public boolean m29362O(Menu menu) {
        boolean z = false;
        if (this.f1467q < 1) {
            return false;
        }
        for (Fragment fragment : this.f1453c.m29162n()) {
            if (fragment != null && m29377G0(fragment) && fragment.m29437g1(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: O0 */
    public void m29361O0(Fragment fragment) {
        m29359P0(fragment, this.f1467q);
    }

    /* renamed from: P */
    public void m29360P() {
        m29300m1();
        m29368L(this.f1471u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (r2 != 5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0150  */
    /* renamed from: P0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m29359P0(Fragment fragment, int i) {
        ViewGroup viewGroup;
        C0310h m29163m = this.f1453c.m29163m(fragment.f1400u);
        int i2 = 1;
        if (m29163m == null) {
            m29163m = new C0310h(this.f1465o, this.f1453c, fragment);
            m29163m.m29178t(1);
        }
        if (fragment.f1356C && fragment.f1357D && fragment.f1395p == 2) {
            i = Math.max(i, 2);
        }
        int min = Math.min(i, m29163m.m29194d());
        int i3 = fragment.f1395p;
        if (i3 <= min) {
            if (i3 < min && !this.f1463m.isEmpty()) {
                m29302m(fragment);
            }
            int i4 = fragment.f1395p;
            if (i4 != -1) {
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 4) {
                            }
                            if (min > 4) {
                                m29163m.m29177u();
                            }
                            if (min > 5) {
                                m29163m.m29182p();
                            }
                        }
                        if (min > 2) {
                            m29163m.m29197a();
                        }
                        if (min > 4) {
                        }
                        if (min > 5) {
                        }
                    }
                    if (min > -1) {
                        m29163m.m29188j();
                    }
                    if (min > 1) {
                        m29163m.m29192f();
                    }
                    if (min > 2) {
                    }
                    if (min > 4) {
                    }
                    if (min > 5) {
                    }
                }
            } else if (min > -1) {
                m29163m.m29195c();
            }
            if (min > 0) {
                m29163m.m29193e();
            }
            if (min > -1) {
            }
            if (min > 1) {
            }
            if (min > 2) {
            }
            if (min > 4) {
            }
            if (min > 5) {
            }
        } else if (i3 > min) {
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                if (i3 == 7) {
                                    if (min < 7) {
                                        m29163m.m29184n();
                                    }
                                }
                            }
                            if (min < 5) {
                                m29163m.m29176v();
                            }
                        }
                        if (min < 4) {
                            if (m29381E0(3)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("movefrom ACTIVITY_CREATED: ");
                                sb.append(fragment);
                            }
                            if (fragment.f1376W != null && this.f1468r.mo13649o(fragment) && fragment.f1397r == null) {
                                m29163m.m29179s();
                            }
                        }
                    }
                    if (min < 2) {
                        C0297c.C0302d c0302d = null;
                        View view = fragment.f1376W;
                        if (view != null && (viewGroup = fragment.f1375V) != null) {
                            viewGroup.endViewTransition(view);
                            fragment.f1376W.clearAnimation();
                            if (!fragment.m29440f0()) {
                                if (this.f1467q > -1 && !this.f1443G && fragment.f1376W.getVisibility() == 0 && fragment.f1383d0 >= 0.0f) {
                                    c0302d = C0297c.m29221c(this.f1468r.m29214k(), fragment, false, fragment.m29479I());
                                }
                                fragment.f1383d0 = 0.0f;
                                ViewGroup viewGroup2 = fragment.f1375V;
                                View view2 = fragment.f1376W;
                                if (c0302d != null) {
                                    C0297c.m29223a(fragment, c0302d, this.f1464n);
                                }
                                viewGroup2.removeView(view2);
                                if (m29381E0(2)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Removing view ");
                                    sb2.append(view2);
                                    sb2.append(" for fragment ");
                                    sb2.append(fragment);
                                    sb2.append(" from container ");
                                    sb2.append(viewGroup2);
                                }
                                if (viewGroup2 != fragment.f1375V) {
                                    return;
                                }
                            }
                        }
                        if (this.f1463m.get(fragment) == null) {
                            m29163m.m29190h();
                        }
                    }
                }
                if (min < 1) {
                    if (this.f1463m.get(fragment) == null) {
                        m29163m.m29191g();
                    }
                    if (i2 < 0) {
                        m29163m.m29189i();
                    }
                    min = i2;
                }
            }
            i2 = min;
            if (i2 < 0) {
            }
            min = i2;
        }
        if (fragment.f1395p != min) {
            if (m29381E0(3)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("moveToState: Fragment state for ");
                sb3.append(fragment);
                sb3.append(" not updated inline; expected state ");
                sb3.append(min);
                sb3.append(" found ");
                sb3.append(fragment.f1395p);
            }
            fragment.f1395p = min;
        }
    }

    /* renamed from: Q */
    public void m29358Q() {
        this.f1441E = false;
        this.f1442F = false;
        this.f1449M.m7521n(false);
        m29354S(7);
    }

    /* renamed from: Q0 */
    public void m29357Q0() {
        if (this.f1468r == null) {
            return;
        }
        this.f1441E = false;
        this.f1442F = false;
        this.f1449M.m7521n(false);
        for (Fragment fragment : this.f1453c.m29162n()) {
            if (fragment != null) {
                fragment.m29435h0();
            }
        }
    }

    /* renamed from: R */
    public void m29356R() {
        this.f1441E = false;
        this.f1442F = false;
        this.f1449M.m7521n(false);
        m29354S(5);
    }

    /* renamed from: R0 */
    public void m29355R0(s30 s30Var) {
        View view;
        for (C0310h c0310h : this.f1453c.m29165k()) {
            Fragment m29187k = c0310h.m29187k();
            if (m29187k.f1366M == s30Var.getId() && (view = m29187k.f1376W) != null && view.getParent() == null) {
                m29187k.f1375V = s30Var;
                c0310h.m29196b();
            }
        }
    }

    /* renamed from: S */
    public final void m29354S(int i) {
        try {
            this.f1452b = true;
            this.f1453c.m29172d(i);
            m29363N0(i, false);
            if (f1436P) {
                for (AbstractC0325l abstractC0325l : m29291r()) {
                    abstractC0325l.m29098j();
                }
            }
            this.f1452b = false;
            m29337a0(true);
        } catch (Throwable th) {
            this.f1452b = false;
            throw th;
        }
    }

    /* renamed from: S0 */
    public void m29353S0(C0310h c0310h) {
        Fragment m29187k = c0310h.m29187k();
        if (m29187k.f1377X) {
            if (this.f1452b) {
                this.f1444H = true;
                return;
            }
            m29187k.f1377X = false;
            if (f1436P) {
                c0310h.m29185m();
            } else {
                m29361O0(m29187k);
            }
        }
    }

    /* renamed from: T */
    public void m29352T() {
        this.f1442F = true;
        this.f1449M.m7521n(true);
        m29354S(4);
    }

    /* renamed from: T0 */
    public void m29351T0(int i, int i2) {
        if (i >= 0) {
            m29342Y(new C0277n(null, i, i2), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* renamed from: U */
    public void m29350U() {
        m29354S(2);
    }

    /* renamed from: U0 */
    public boolean m29349U0() {
        return m29347V0(null, -1, 0);
    }

    /* renamed from: V */
    public final void m29348V() {
        if (this.f1444H) {
            this.f1444H = false;
            m29303l1();
        }
    }

    /* renamed from: V0 */
    public final boolean m29347V0(String str, int i, int i2) {
        m29337a0(false);
        m29340Z(true);
        Fragment fragment = this.f1471u;
        if (fragment == null || i >= 0 || str != null || !fragment.m29408t().m29349U0()) {
            boolean m29345W0 = m29345W0(this.f1445I, this.f1446J, str, i, i2);
            if (m29345W0) {
                this.f1452b = true;
                try {
                    m29336a1(this.f1445I, this.f1446J);
                } finally {
                    m29295p();
                }
            }
            m29300m1();
            m29348V();
            this.f1453c.m29174b();
            return m29345W0;
        }
        return true;
    }

    /* renamed from: W */
    public void m29346W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f1453c.m29171e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f1455e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f1455e.get(i).toString());
            }
        }
        ArrayList<C0281a> arrayList2 = this.f1454d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C0281a c0281a = this.f1454d.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(c0281a.toString());
                c0281a.m29249r(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1459i.get());
        synchronized (this.f1451a) {
            int size3 = this.f1451a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(this.f1451a.get(i3));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1468r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1469s);
        if (this.f1470t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1470t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1467q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1441E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1442F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1443G);
        if (this.f1440D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1440D);
        }
    }

    /* renamed from: W0 */
    public boolean m29345W0(ArrayList<C0281a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C0281a> arrayList3 = this.f1454d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f1454d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C0281a c0281a = this.f1454d.get(size2);
                    if ((str != null && str.equals(c0281a.m29244w())) || (i >= 0 && i == c0281a.f1527v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C0281a c0281a2 = this.f1454d.get(size2);
                        if (str == null || !str.equals(c0281a2.m29244w())) {
                            if (i < 0 || i != c0281a2.f1527v) {
                                break;
                            }
                        }
                    }
                }
                i3 = size2;
            } else {
                i3 = -1;
            }
            if (i3 == this.f1454d.size() - 1) {
                return false;
            }
            for (int size3 = this.f1454d.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f1454d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* renamed from: X */
    public final void m29344X() {
        if (f1436P) {
            for (AbstractC0325l abstractC0325l : m29291r()) {
                abstractC0325l.m29098j();
            }
        } else if (!this.f1463m.isEmpty()) {
            for (Fragment fragment : this.f1463m.keySet()) {
                m29302m(fragment);
                m29361O0(fragment);
            }
        }
    }

    /* renamed from: X0 */
    public final int m29343X0(ArrayList<C0281a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C1798j6<Fragment> c1798j6) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0281a c0281a = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (c0281a.m29256A() && !c0281a.m29242y(arrayList, i4 + 1, i2)) {
                if (this.f1448L == null) {
                    this.f1448L = new ArrayList<>();
                }
                C0278o c0278o = new C0278o(c0281a, booleanValue);
                this.f1448L.add(c0278o);
                c0281a.m29254C(c0278o);
                if (booleanValue) {
                    c0281a.m29247t();
                } else {
                    c0281a.m29246u(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, c0281a);
                }
                m29329d(c1798j6);
            }
        }
        return i3;
    }

    /* renamed from: Y */
    public void m29342Y(InterfaceC0276m interfaceC0276m, boolean z) {
        if (!z) {
            if (this.f1468r == null) {
                if (!this.f1443G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            m29297o();
        }
        synchronized (this.f1451a) {
            if (this.f1468r == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.f1451a.add(interfaceC0276m);
            m29321f1();
        }
    }

    /* renamed from: Y0 */
    public void m29341Y0(Fragment fragment, C3423wd c3423wd) {
        HashSet<C3423wd> hashSet = this.f1463m.get(fragment);
        if (hashSet != null && hashSet.remove(c3423wd) && hashSet.isEmpty()) {
            this.f1463m.remove(fragment);
            if (fragment.f1395p < 5) {
                m29281w(fragment);
                m29361O0(fragment);
            }
        }
    }

    /* renamed from: Z */
    public final void m29340Z(boolean z) {
        if (this.f1452b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1468r == null) {
            if (!this.f1443G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        } else if (Looper.myLooper() != this.f1468r.m29213l().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else {
            if (!z) {
                m29297o();
            }
            if (this.f1445I == null) {
                this.f1445I = new ArrayList<>();
                this.f1446J = new ArrayList<>();
            }
            this.f1452b = true;
            try {
                m29325e0(null, null);
            } finally {
                this.f1452b = false;
            }
        }
    }

    /* renamed from: Z0 */
    public void m29339Z0(Fragment fragment) {
        if (m29381E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(fragment);
            sb.append(" nesting=");
            sb.append(fragment.f1360G);
        }
        boolean z = !fragment.m29448b0();
        if (!fragment.f1369P || z) {
            this.f1453c.m29157s(fragment);
            if (m29379F0(fragment)) {
                this.f1440D = true;
            }
            fragment.f1355B = true;
            m29309j1(fragment);
        }
    }

    /* renamed from: a0 */
    public boolean m29337a0(boolean z) {
        m29340Z(z);
        boolean z2 = false;
        while (m29307k0(this.f1445I, this.f1446J)) {
            this.f1452b = true;
            try {
                m29336a1(this.f1445I, this.f1446J);
                m29295p();
                z2 = true;
            } catch (Throwable th) {
                m29295p();
                throw th;
            }
        }
        m29300m1();
        m29348V();
        this.f1453c.m29174b();
        return z2;
    }

    /* renamed from: a1 */
    public final void m29336a1(ArrayList<C0281a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        m29325e0(arrayList, arrayList2);
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!arrayList.get(i).f1628r) {
                if (i2 != i) {
                    m29328d0(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (arrayList2.get(i).booleanValue()) {
                    while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f1628r) {
                        i2++;
                    }
                }
                m29328d0(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m29328d0(arrayList, arrayList2, i2, size);
        }
    }

    /* renamed from: b0 */
    public void m29334b0(InterfaceC0276m interfaceC0276m, boolean z) {
        if (z && (this.f1468r == null || this.f1443G)) {
            return;
        }
        m29340Z(z);
        if (interfaceC0276m.mo29252a(this.f1445I, this.f1446J)) {
            this.f1452b = true;
            try {
                m29336a1(this.f1445I, this.f1446J);
            } finally {
                m29295p();
            }
        }
        m29300m1();
        m29348V();
        this.f1453c.m29174b();
    }

    /* renamed from: b1 */
    public final void m29333b1() {
        if (this.f1462l != null) {
            for (int i = 0; i < this.f1462l.size(); i++) {
                this.f1462l.get(i).m29266a();
            }
        }
    }

    /* renamed from: c1 */
    public void m29330c1(Parcelable parcelable) {
        C0310h c0310h;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.f1504p == null) {
            return;
        }
        this.f1453c.m29156t();
        Iterator<FragmentState> it = fragmentManagerState.f1504p.iterator();
        while (it.hasNext()) {
            FragmentState next = it.next();
            if (next != null) {
                Fragment m7528g = this.f1449M.m7528g(next.f1515q);
                if (m7528g != null) {
                    if (m29381E0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("restoreSaveState: re-attaching retained ");
                        sb.append(m7528g);
                    }
                    c0310h = new C0310h(this.f1465o, this.f1453c, m7528g, next);
                } else {
                    c0310h = new C0310h(this.f1465o, this.f1453c, this.f1468r.m29214k().getClassLoader(), m29294p0(), next);
                }
                Fragment m29187k = c0310h.m29187k();
                m29187k.f1361H = this;
                if (m29381E0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("restoreSaveState: active (");
                    sb2.append(m29187k.f1400u);
                    sb2.append("): ");
                    sb2.append(m29187k);
                }
                c0310h.m29183o(this.f1468r.m29214k().getClassLoader());
                this.f1453c.m29160p(c0310h);
                c0310h.m29178t(this.f1467q);
            }
        }
        for (Fragment fragment : this.f1449M.m7525j()) {
            if (!this.f1453c.m29173c(fragment.f1400u)) {
                if (m29381E0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Discarding retained Fragment ");
                    sb3.append(fragment);
                    sb3.append(" that was not found in the set of active Fragments ");
                    sb3.append(fragmentManagerState.f1504p);
                }
                this.f1449M.m7522m(fragment);
                fragment.f1361H = this;
                C0310h c0310h2 = new C0310h(this.f1465o, this.f1453c, fragment);
                c0310h2.m29178t(1);
                c0310h2.m29185m();
                fragment.f1355B = true;
                c0310h2.m29185m();
            }
        }
        this.f1453c.m29155u(fragmentManagerState.f1505q);
        if (fragmentManagerState.f1506r != null) {
            this.f1454d = new ArrayList<>(fragmentManagerState.f1506r.length);
            int i = 0;
            while (true) {
                BackStackState[] backStackStateArr = fragmentManagerState.f1506r;
                if (i >= backStackStateArr.length) {
                    break;
                }
                C0281a m29504a = backStackStateArr[i].m29504a(this);
                if (m29381E0(2)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("restoreAllState: back stack #");
                    sb4.append(i);
                    sb4.append(" (index ");
                    sb4.append(m29504a.f1527v);
                    sb4.append("): ");
                    sb4.append(m29504a);
                    PrintWriter printWriter = new PrintWriter(new kl0("FragmentManager"));
                    m29504a.m29248s("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1454d.add(m29504a);
                i++;
            }
        } else {
            this.f1454d = null;
        }
        this.f1459i.set(fragmentManagerState.f1507s);
        String str = fragmentManagerState.f1508t;
        if (str != null) {
            Fragment m29322f0 = m29322f0(str);
            this.f1471u = m29322f0;
            m29368L(m29322f0);
        }
        ArrayList<String> arrayList = fragmentManagerState.f1509u;
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Bundle bundle = fragmentManagerState.f1510v.get(i2);
                bundle.setClassLoader(this.f1468r.m29214k().getClassLoader());
                this.f1460j.put(arrayList.get(i2), bundle);
            }
        }
        this.f1439C = new ArrayDeque<>(fragmentManagerState.f1511w);
    }

    /* renamed from: d */
    public final void m29329d(C1798j6<Fragment> c1798j6) {
        int i = this.f1467q;
        if (i < 1) {
            return;
        }
        int min = Math.min(i, 5);
        for (Fragment fragment : this.f1453c.m29162n()) {
            if (fragment.f1395p < min) {
                m29359P0(fragment, min);
                if (fragment.f1376W != null && !fragment.f1368O && fragment.f1381b0) {
                    c1798j6.add(fragment);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01be  */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m29328d0(ArrayList<C0281a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        ?? r1;
        boolean z;
        int i3;
        int i4;
        ArrayList<Boolean> arrayList3;
        int i5;
        int i6;
        ArrayList<Boolean> arrayList4;
        int i7;
        boolean z2;
        int i8;
        boolean z3 = arrayList.get(i).f1628r;
        ArrayList<Fragment> arrayList5 = this.f1447K;
        if (arrayList5 == null) {
            this.f1447K = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.f1447K.addAll(this.f1453c.m29162n());
        Fragment m29280w0 = m29280w0();
        boolean z4 = false;
        for (int i9 = i; i9 < i2; i9++) {
            C0281a c0281a = arrayList.get(i9);
            m29280w0 = !arrayList2.get(i9).booleanValue() ? c0281a.m29245v(this.f1447K, m29280w0) : c0281a.m29253D(this.f1447K, m29280w0);
            z4 = z4 || c0281a.f1619i;
        }
        this.f1447K.clear();
        if (!z3 && this.f1467q >= 1) {
            if (!f1436P) {
                r1 = 1;
                C0316k.m29136B(this.f1468r.m29214k(), this.f1469s, arrayList, arrayList2, i, i2, false, this.f1464n);
                m29331c0(arrayList, arrayList2, i, i2);
                if (f1436P) {
                    if (z3) {
                        C1798j6 c1798j6 = new C1798j6();
                        m29329d(c1798j6);
                        i5 = 1;
                        z = z3;
                        i3 = i2;
                        i4 = i;
                        arrayList3 = arrayList2;
                        i6 = m29343X0(arrayList, arrayList2, i, i2, c1798j6);
                        m29367L0(c1798j6);
                    } else {
                        z = z3;
                        i3 = i2;
                        i4 = i;
                        arrayList3 = arrayList2;
                        i5 = 1;
                        i6 = i3;
                    }
                    if (i6 == i4 || !z) {
                        arrayList4 = arrayList3;
                        i7 = i3;
                    } else {
                        if (this.f1467q >= i5) {
                            arrayList4 = arrayList3;
                            int i10 = i6;
                            i7 = i3;
                            z2 = true;
                            C0316k.m29136B(this.f1468r.m29214k(), this.f1469s, arrayList, arrayList2, i, i10, true, this.f1464n);
                        } else {
                            arrayList4 = arrayList3;
                            i7 = i3;
                            z2 = true;
                        }
                        m29363N0(this.f1467q, z2);
                    }
                } else {
                    boolean booleanValue = arrayList2.get(i2 - 1).booleanValue();
                    for (int i11 = i; i11 < i2; i11++) {
                        C0281a c0281a2 = arrayList.get(i11);
                        if (booleanValue) {
                            for (int size = c0281a2.f1613c.size() - r1; size >= 0; size--) {
                                Fragment fragment = c0281a2.f1613c.get(size).f1631b;
                                if (fragment != null) {
                                    m29283v(fragment).m29185m();
                                }
                            }
                        } else {
                            Iterator<AbstractC0314j.C0315a> it = c0281a2.f1613c.iterator();
                            while (it.hasNext()) {
                                Fragment fragment2 = it.next().f1631b;
                                if (fragment2 != null) {
                                    m29283v(fragment2).m29185m();
                                }
                            }
                        }
                    }
                    m29363N0(this.f1467q, r1);
                    for (AbstractC0325l abstractC0325l : m29289s(arrayList, i, i2)) {
                        abstractC0325l.m29090r(booleanValue);
                        abstractC0325l.m29092p();
                        abstractC0325l.m29101g();
                    }
                    i7 = i2;
                    arrayList4 = arrayList2;
                }
                for (i8 = i; i8 < i7; i8++) {
                    C0281a c0281a3 = arrayList.get(i8);
                    if (arrayList4.get(i8).booleanValue() && c0281a3.f1527v >= 0) {
                        c0281a3.f1527v = -1;
                    }
                    c0281a3.m29255B();
                }
                if (z4) {
                    return;
                }
                m29333b1();
                return;
            }
            for (int i12 = i; i12 < i2; i12++) {
                Iterator<AbstractC0314j.C0315a> it2 = arrayList.get(i12).f1613c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = it2.next().f1631b;
                    if (fragment3 != null && fragment3.f1361H != null) {
                        this.f1453c.m29160p(m29283v(fragment3));
                    }
                }
            }
        }
        r1 = 1;
        m29331c0(arrayList, arrayList2, i, i2);
        if (f1436P) {
        }
        while (i8 < i7) {
        }
        if (z4) {
        }
    }

    /* renamed from: e */
    public void m29326e(C0281a c0281a) {
        if (this.f1454d == null) {
            this.f1454d = new ArrayList<>();
        }
        this.f1454d.add(c0281a);
    }

    /* renamed from: e0 */
    public final void m29325e0(ArrayList<C0281a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<C0278o> arrayList3 = this.f1448L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C0278o c0278o = this.f1448L.get(i);
            if (arrayList == null || c0278o.f1501a || (indexOf2 = arrayList.indexOf(c0278o.f1502b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if (c0278o.m29261e() || (arrayList != null && c0278o.f1502b.m29242y(arrayList, 0, arrayList.size()))) {
                    this.f1448L.remove(i);
                    i--;
                    size--;
                    if (arrayList == null || c0278o.f1501a || (indexOf = arrayList.indexOf(c0278o.f1502b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        c0278o.m29262d();
                    }
                }
                i++;
            } else {
                this.f1448L.remove(i);
                i--;
                size--;
            }
            c0278o.m29263c();
            i++;
        }
    }

    /* renamed from: e1 */
    public Parcelable m29324e1() {
        int size;
        m29310j0();
        m29344X();
        m29337a0(true);
        this.f1441E = true;
        this.f1449M.m7521n(true);
        ArrayList<FragmentState> m29154v = this.f1453c.m29154v();
        BackStackState[] backStackStateArr = null;
        if (m29154v.isEmpty()) {
            m29381E0(2);
            return null;
        }
        ArrayList<String> m29153w = this.f1453c.m29153w();
        ArrayList<C0281a> arrayList = this.f1454d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i = 0; i < size; i++) {
                backStackStateArr[i] = new BackStackState(this.f1454d.get(i));
                if (m29381E0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("saveAllState: adding back stack #");
                    sb.append(i);
                    sb.append(": ");
                    sb.append(this.f1454d.get(i));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f1504p = m29154v;
        fragmentManagerState.f1505q = m29153w;
        fragmentManagerState.f1506r = backStackStateArr;
        fragmentManagerState.f1507s = this.f1459i.get();
        Fragment fragment = this.f1471u;
        if (fragment != null) {
            fragmentManagerState.f1508t = fragment.f1400u;
        }
        fragmentManagerState.f1509u.addAll(this.f1460j.keySet());
        fragmentManagerState.f1510v.addAll(this.f1460j.values());
        fragmentManagerState.f1511w = new ArrayList<>(this.f1439C);
        return fragmentManagerState;
    }

    /* renamed from: f */
    public void m29323f(Fragment fragment, C3423wd c3423wd) {
        if (this.f1463m.get(fragment) == null) {
            this.f1463m.put(fragment, new HashSet<>());
        }
        this.f1463m.get(fragment).add(c3423wd);
    }

    /* renamed from: f0 */
    public Fragment m29322f0(String str) {
        return this.f1453c.m29170f(str);
    }

    /* renamed from: f1 */
    public void m29321f1() {
        synchronized (this.f1451a) {
            ArrayList<C0278o> arrayList = this.f1448L;
            boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z2 = this.f1451a.size() == 1;
            if (z || z2) {
                this.f1468r.m29213l().removeCallbacks(this.f1450N);
                this.f1468r.m29213l().post(this.f1450N);
                m29300m1();
            }
        }
    }

    /* renamed from: g */
    public C0310h m29320g(Fragment fragment) {
        if (m29381E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(fragment);
        }
        C0310h m29283v = m29283v(fragment);
        fragment.f1361H = this;
        this.f1453c.m29160p(m29283v);
        if (!fragment.f1369P) {
            this.f1453c.m29175a(fragment);
            fragment.f1355B = false;
            if (fragment.f1376W == null) {
                fragment.f1382c0 = false;
            }
            if (m29379F0(fragment)) {
                this.f1440D = true;
            }
        }
        return m29283v;
    }

    /* renamed from: g0 */
    public Fragment m29319g0(int i) {
        return this.f1453c.m29169g(i);
    }

    /* renamed from: g1 */
    public void m29318g1(Fragment fragment, boolean z) {
        ViewGroup m29296o0 = m29296o0(fragment);
        if (m29296o0 == null || !(m29296o0 instanceof s30)) {
            return;
        }
        ((s30) m29296o0).setDrawDisappearingViewsLast(!z);
    }

    /* renamed from: h */
    public void m29317h(w30 w30Var) {
        this.f1466p.add(w30Var);
    }

    /* renamed from: h0 */
    public Fragment m29316h0(String str) {
        return this.f1453c.m29168h(str);
    }

    /* renamed from: h1 */
    public void m29315h1(Fragment fragment, AbstractC0344c.EnumC0347c enumC0347c) {
        if (fragment.equals(m29322f0(fragment.f1400u)) && (fragment.f1362I == null || fragment.f1361H == this)) {
            fragment.f1386g0 = enumC0347c;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: i */
    public int m29314i() {
        return this.f1459i.getAndIncrement();
    }

    /* renamed from: i0 */
    public Fragment m29313i0(String str) {
        return this.f1453c.m29167i(str);
    }

    /* renamed from: i1 */
    public void m29312i1(Fragment fragment) {
        if (fragment == null || (fragment.equals(m29322f0(fragment.f1400u)) && (fragment.f1362I == null || fragment.f1361H == this))) {
            Fragment fragment2 = this.f1471u;
            this.f1471u = fragment;
            m29368L(fragment2);
            m29368L(this.f1471u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @SuppressLint({"SyntheticAccessor"})
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m29311j(AbstractC0305e<?> abstractC0305e, r30 r30Var, Fragment fragment) {
        w30 w30Var;
        AbstractC0305e<?> abstractC0305e2;
        String str;
        if (this.f1468r != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f1468r = abstractC0305e;
        this.f1469s = r30Var;
        this.f1470t = fragment;
        if (fragment == null) {
            if (abstractC0305e instanceof w30) {
                w30Var = (w30) abstractC0305e;
            }
            if (this.f1470t != null) {
                m29300m1();
            }
            if (abstractC0305e instanceof yt0) {
                yt0 yt0Var = (yt0) abstractC0305e;
                OnBackPressedDispatcher mo3233c = yt0Var.mo3233c();
                this.f1457g = mo3233c;
                sj0 sj0Var = yt0Var;
                if (fragment != null) {
                    sj0Var = fragment;
                }
                mo3233c.m30373b(sj0Var, this.f1458h);
            }
            this.f1449M = fragment == null ? fragment.f1361H.m29301m0(fragment) : abstractC0305e instanceof nt1 ? v30.m7526i(((nt1) abstractC0305e).mo13652g()) : new v30(false);
            this.f1449M.m7521n(m29371J0());
            this.f1453c.m29152x(this.f1449M);
            abstractC0305e2 = this.f1468r;
            if (abstractC0305e2 instanceof InterfaceC3790z0) {
                return;
            }
            AbstractC0051a mo3011e = ((InterfaceC3790z0) abstractC0305e2).mo3011e();
            if (fragment != null) {
                str = fragment.f1400u + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f1476z = mo3011e.m30342i(str2 + "StartActivityForResult", new C3489x0(), new C0273j());
            this.f1437A = mo3011e.m30342i(str2 + "StartIntentSenderForResult", new C0274k(), new C0264a());
            this.f1438B = mo3011e.m30342i(str2 + "RequestPermissions", new C3391w0(), new C0265b());
            return;
        }
        w30Var = new C0272i(fragment);
        m29317h(w30Var);
        if (this.f1470t != null) {
        }
        if (abstractC0305e instanceof yt0) {
        }
        this.f1449M = fragment == null ? fragment.f1361H.m29301m0(fragment) : abstractC0305e instanceof nt1 ? v30.m7526i(((nt1) abstractC0305e).mo13652g()) : new v30(false);
        this.f1449M.m7521n(m29371J0());
        this.f1453c.m29152x(this.f1449M);
        abstractC0305e2 = this.f1468r;
        if (abstractC0305e2 instanceof InterfaceC3790z0) {
        }
    }

    /* renamed from: j0 */
    public final void m29310j0() {
        if (f1436P) {
            for (AbstractC0325l abstractC0325l : m29291r()) {
                abstractC0325l.m29097k();
            }
        } else if (this.f1448L != null) {
            while (!this.f1448L.isEmpty()) {
                this.f1448L.remove(0).m29262d();
            }
        }
    }

    /* renamed from: j1 */
    public final void m29309j1(Fragment fragment) {
        ViewGroup m29296o0 = m29296o0(fragment);
        if (m29296o0 == null || fragment.m29403v() + fragment.m29397y() + fragment.m29477J() + fragment.m29476K() <= 0) {
            return;
        }
        int i = r11.visible_removing_fragment_view_tag;
        if (m29296o0.getTag(i) == null) {
            m29296o0.setTag(i, fragment);
        }
        ((Fragment) m29296o0.getTag(i)).m29496B1(fragment.m29479I());
    }

    /* renamed from: k */
    public void m29308k(Fragment fragment) {
        if (m29381E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(fragment);
        }
        if (fragment.f1369P) {
            fragment.f1369P = false;
            if (fragment.f1354A) {
                return;
            }
            this.f1453c.m29175a(fragment);
            if (m29381E0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("add from attach: ");
                sb2.append(fragment);
            }
            if (m29379F0(fragment)) {
                this.f1440D = true;
            }
        }
    }

    /* renamed from: k0 */
    public final boolean m29307k0(ArrayList<C0281a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f1451a) {
            if (this.f1451a.isEmpty()) {
                return false;
            }
            int size = this.f1451a.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= this.f1451a.get(i).mo29252a(arrayList, arrayList2);
            }
            this.f1451a.clear();
            this.f1468r.m29213l().removeCallbacks(this.f1450N);
            return z;
        }
    }

    /* renamed from: k1 */
    public void m29306k1(Fragment fragment) {
        if (m29381E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(fragment);
        }
        if (fragment.f1368O) {
            fragment.f1368O = false;
            fragment.f1382c0 = !fragment.f1382c0;
        }
    }

    /* renamed from: l */
    public AbstractC0314j m29305l() {
        return new C0281a(this);
    }

    /* renamed from: l0 */
    public int m29304l0() {
        ArrayList<C0281a> arrayList = this.f1454d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: l1 */
    public final void m29303l1() {
        for (C0310h c0310h : this.f1453c.m29165k()) {
            m29353S0(c0310h);
        }
    }

    /* renamed from: m */
    public final void m29302m(Fragment fragment) {
        HashSet<C3423wd> hashSet = this.f1463m.get(fragment);
        if (hashSet != null) {
            Iterator<C3423wd> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().m6173a();
            }
            hashSet.clear();
            m29281w(fragment);
            this.f1463m.remove(fragment);
        }
    }

    /* renamed from: m0 */
    public final v30 m29301m0(Fragment fragment) {
        return this.f1449M.m7527h(fragment);
    }

    /* renamed from: m1 */
    public final void m29300m1() {
        synchronized (this.f1451a) {
            boolean z = true;
            if (this.f1451a.isEmpty()) {
                this.f1458h.m5812f((m29304l0() <= 0 || !m29375H0(this.f1470t)) ? false : false);
            } else {
                this.f1458h.m5812f(true);
            }
        }
    }

    /* renamed from: n */
    public boolean m29299n() {
        boolean z = false;
        for (Fragment fragment : this.f1453c.m29164l()) {
            if (fragment != null) {
                z = m29379F0(fragment);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n0 */
    public r30 m29298n0() {
        return this.f1469s;
    }

    /* renamed from: o */
    public final void m29297o() {
        if (m29371J0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: o0 */
    public final ViewGroup m29296o0(Fragment fragment) {
        ViewGroup viewGroup = fragment.f1375V;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.f1366M > 0 && this.f1469s.mo11809h()) {
            View mo11810f = this.f1469s.mo11810f(fragment.f1366M);
            if (mo11810f instanceof ViewGroup) {
                return (ViewGroup) mo11810f;
            }
        }
        return null;
    }

    /* renamed from: p */
    public final void m29295p() {
        this.f1452b = false;
        this.f1446J.clear();
        this.f1445I.clear();
    }

    /* renamed from: p0 */
    public C0304d m29294p0() {
        C0304d c0304d = this.f1472v;
        if (c0304d != null) {
            return c0304d;
        }
        Fragment fragment = this.f1470t;
        return fragment != null ? fragment.f1361H.m29294p0() : this.f1473w;
    }

    /* renamed from: q */
    public final void m29293q(String str) {
        this.f1460j.remove(str);
    }

    /* renamed from: q0 */
    public C0313i m29292q0() {
        return this.f1453c;
    }

    /* renamed from: r */
    public final Set<AbstractC0325l> m29291r() {
        HashSet hashSet = new HashSet();
        for (C0310h c0310h : this.f1453c.m29165k()) {
            ViewGroup viewGroup = c0310h.m29187k().f1375V;
            if (viewGroup != null) {
                hashSet.add(AbstractC0325l.m29093o(viewGroup, m29278x0()));
            }
        }
        return hashSet;
    }

    /* renamed from: r0 */
    public List<Fragment> m29290r0() {
        return this.f1453c.m29162n();
    }

    /* renamed from: s */
    public final Set<AbstractC0325l> m29289s(ArrayList<C0281a> arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator<AbstractC0314j.C0315a> it = arrayList.get(i).f1613c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f1631b;
                if (fragment != null && (viewGroup = fragment.f1375V) != null) {
                    hashSet.add(AbstractC0325l.m29094n(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    /* renamed from: s0 */
    public AbstractC0305e<?> m29288s0() {
        return this.f1468r;
    }

    /* renamed from: t */
    public void m29287t(C0281a c0281a, boolean z, boolean z2, boolean z3) {
        if (z) {
            c0281a.m29246u(z3);
        } else {
            c0281a.m29247t();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c0281a);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.f1467q >= 1) {
            C0316k.m29136B(this.f1468r.m29214k(), this.f1469s, arrayList, arrayList2, 0, 1, true, this.f1464n);
        }
        if (z3) {
            m29363N0(this.f1467q, true);
        }
        for (Fragment fragment : this.f1453c.m29164l()) {
            if (fragment != null && fragment.f1376W != null && fragment.f1381b0 && c0281a.m29243x(fragment.f1366M)) {
                float f = fragment.f1383d0;
                if (f > 0.0f) {
                    fragment.f1376W.setAlpha(f);
                }
                if (z3) {
                    fragment.f1383d0 = 0.0f;
                } else {
                    fragment.f1383d0 = -1.0f;
                    fragment.f1381b0 = false;
                }
            }
        }
    }

    /* renamed from: t0 */
    public LayoutInflater.Factory2 m29286t0() {
        return this.f1456f;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f1470t;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.f1470t;
        } else {
            AbstractC0305e<?> abstractC0305e = this.f1468r;
            if (abstractC0305e == null) {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
            sb.append(abstractC0305e.getClass().getSimpleName());
            sb.append("{");
            obj = this.f1468r;
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public final void m29285u(Fragment fragment) {
        Animator animator;
        if (fragment.f1376W != null) {
            C0297c.C0302d m29221c = C0297c.m29221c(this.f1468r.m29214k(), fragment, !fragment.f1368O, fragment.m29479I());
            if (m29221c == null || (animator = m29221c.f1582b) == null) {
                if (m29221c != null) {
                    fragment.f1376W.startAnimation(m29221c.f1581a);
                    m29221c.f1581a.start();
                }
                fragment.f1376W.setVisibility((!fragment.f1368O || fragment.m29450a0()) ? 0 : 8);
                if (fragment.m29450a0()) {
                    fragment.m29395y1(false);
                }
            } else {
                animator.setTarget(fragment.f1376W);
                if (!fragment.f1368O) {
                    fragment.f1376W.setVisibility(0);
                } else if (fragment.m29450a0()) {
                    fragment.m29395y1(false);
                } else {
                    ViewGroup viewGroup = fragment.f1375V;
                    View view = fragment.f1376W;
                    viewGroup.startViewTransition(view);
                    m29221c.f1582b.addListener(new C0271h(viewGroup, view, fragment));
                }
                m29221c.f1582b.start();
            }
        }
        m29385C0(fragment);
        fragment.f1382c0 = false;
        fragment.m29396y0(fragment.f1368O);
    }

    /* renamed from: u0 */
    public C0308g m29284u0() {
        return this.f1465o;
    }

    /* renamed from: v */
    public C0310h m29283v(Fragment fragment) {
        C0310h m29163m = this.f1453c.m29163m(fragment.f1400u);
        if (m29163m != null) {
            return m29163m;
        }
        C0310h c0310h = new C0310h(this.f1465o, this.f1453c, fragment);
        c0310h.m29183o(this.f1468r.m29214k().getClassLoader());
        c0310h.m29178t(this.f1467q);
        return c0310h;
    }

    /* renamed from: v0 */
    public Fragment m29282v0() {
        return this.f1470t;
    }

    /* renamed from: w */
    public final void m29281w(Fragment fragment) {
        fragment.m29455X0();
        this.f1465o.m29198n(fragment, false);
        fragment.f1375V = null;
        fragment.f1376W = null;
        fragment.f1388i0 = null;
        fragment.f1389j0.mo15133j(null);
        fragment.f1357D = false;
    }

    /* renamed from: w0 */
    public Fragment m29280w0() {
        return this.f1471u;
    }

    /* renamed from: x */
    public void m29279x(Fragment fragment) {
        if (m29381E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(fragment);
        }
        if (fragment.f1369P) {
            return;
        }
        fragment.f1369P = true;
        if (fragment.f1354A) {
            if (m29381E0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("remove from detach: ");
                sb2.append(fragment);
            }
            this.f1453c.m29157s(fragment);
            if (m29379F0(fragment)) {
                this.f1440D = true;
            }
            m29309j1(fragment);
        }
    }

    /* renamed from: x0 */
    public ne1 m29278x0() {
        ne1 ne1Var = this.f1474x;
        if (ne1Var != null) {
            return ne1Var;
        }
        Fragment fragment = this.f1470t;
        return fragment != null ? fragment.f1361H.m29278x0() : this.f1475y;
    }

    /* renamed from: y */
    public void m29277y() {
        this.f1441E = false;
        this.f1442F = false;
        this.f1449M.m7521n(false);
        m29354S(4);
    }

    /* renamed from: z */
    public void m29275z() {
        this.f1441E = false;
        this.f1442F = false;
        this.f1449M.m7521n(false);
        m29354S(0);
    }

    /* renamed from: z0 */
    public mt1 m29274z0(Fragment fragment) {
        return this.f1449M.m7524k(fragment);
    }
}
