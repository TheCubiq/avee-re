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
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.j;
import androidx.fragment.app.k;
import androidx.lifecycle.c;
import com.daaw.j6;
import com.daaw.kl0;
import com.daaw.mt1;
import com.daaw.ne1;
import com.daaw.r11;
import com.daaw.r30;
import com.daaw.s30;
import com.daaw.sj0;
import com.daaw.u0;
import com.daaw.v0;
import com.daaw.v30;
import com.daaw.w30;
import com.daaw.wd;
import com.daaw.wt0;
import com.daaw.y0;
import com.daaw.y30;
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
    public static boolean O = false;
    public static boolean P = true;
    public y0<IntentSenderRequest> A;
    public y0<String[]> B;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList<androidx.fragment.app.a> I;
    public ArrayList<Boolean> J;
    public ArrayList<Fragment> K;
    public ArrayList<o> L;
    public v30 M;
    public boolean b;
    public ArrayList<androidx.fragment.app.a> d;
    public ArrayList<Fragment> e;
    public OnBackPressedDispatcher g;
    public ArrayList<l> l;
    public androidx.fragment.app.e<?> r;
    public r30 s;
    public Fragment t;
    public Fragment u;
    public y0<Intent> z;
    public final ArrayList<m> a = new ArrayList<>();
    public final androidx.fragment.app.i c = new androidx.fragment.app.i();
    public final androidx.fragment.app.f f = new androidx.fragment.app.f(this);
    public final wt0 h = new c(false);
    public final AtomicInteger i = new AtomicInteger();
    public final Map<String, Bundle> j = Collections.synchronizedMap(new HashMap());
    public final Map<String, Object> k = Collections.synchronizedMap(new HashMap());
    public Map<Fragment, HashSet<wd>> m = Collections.synchronizedMap(new HashMap());
    public final k.g n = new d();
    public final androidx.fragment.app.g o = new androidx.fragment.app.g(this);
    public final CopyOnWriteArrayList<w30> p = new CopyOnWriteArrayList<>();
    public int q = -1;
    public androidx.fragment.app.d v = null;
    public androidx.fragment.app.d w = new e();
    public ne1 x = null;
    public ne1 y = new f();
    public ArrayDeque<LaunchedFragmentInfo> C = new ArrayDeque<>();
    public Runnable N = new g();

    /* renamed from: androidx.fragment.app.FragmentManager$6  reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass6 implements androidx.lifecycle.d {
        public final /* synthetic */ String a;
        public final /* synthetic */ y30 b;
        public final /* synthetic */ androidx.lifecycle.c c;
        public final /* synthetic */ FragmentManager d;

        @Override // androidx.lifecycle.d
        public void a(sj0 sj0Var, c.b bVar) {
            Bundle bundle;
            if (bVar == c.b.ON_START && (bundle = (Bundle) this.d.j.get(this.a)) != null) {
                this.b.a(this.a, bundle);
                this.d.q(this.a);
            }
            if (bVar == c.b.ON_DESTROY) {
                this.c.c(this);
                this.d.k.remove(this.a);
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();
        public String p;
        public int q;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<LaunchedFragmentInfo> {
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
            this.p = parcel.readString();
            this.q = parcel.readInt();
        }

        public LaunchedFragmentInfo(String str, int i) {
            this.p = str;
            this.q = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.p);
            parcel.writeInt(this.q);
        }
    }

    /* loaded from: classes.dex */
    public class a implements u0<ActivityResult> {
        public a() {
        }

        @Override // com.daaw.u0
        /* renamed from: b */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.C.pollFirst();
            if (pollFirst == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("No IntentSenders were started for ");
                sb.append(this);
                return;
            }
            String str = pollFirst.p;
            int i = pollFirst.q;
            Fragment i2 = FragmentManager.this.c.i(str);
            if (i2 != null) {
                i2.j0(i, activityResult.b(), activityResult.a());
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Intent Sender result delivered for unknown Fragment ");
            sb2.append(str);
        }
    }

    /* loaded from: classes.dex */
    public class b implements u0<Map<String, Boolean>> {
        public b() {
        }

        @Override // com.daaw.u0
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo pollFirst = FragmentManager.this.C.pollFirst();
            if (pollFirst == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("No permissions were requested for ");
                sb.append(this);
                return;
            }
            String str = pollFirst.p;
            int i2 = pollFirst.q;
            Fragment i3 = FragmentManager.this.c.i(str);
            if (i3 != null) {
                i3.I0(i2, strArr, iArr);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Permission request result delivered for unknown Fragment ");
            sb2.append(str);
        }
    }

    /* loaded from: classes.dex */
    public class c extends wt0 {
        public c(boolean z) {
            super(z);
        }

        @Override // com.daaw.wt0
        public void b() {
            FragmentManager.this.A0();
        }
    }

    /* loaded from: classes.dex */
    public class d implements k.g {
        public d() {
        }

        @Override // androidx.fragment.app.k.g
        public void a(Fragment fragment, wd wdVar) {
            FragmentManager.this.f(fragment, wdVar);
        }

        @Override // androidx.fragment.app.k.g
        public void b(Fragment fragment, wd wdVar) {
            if (wdVar.b()) {
                return;
            }
            FragmentManager.this.Y0(fragment, wdVar);
        }
    }

    /* loaded from: classes.dex */
    public class e extends androidx.fragment.app.d {
        public e() {
        }

        @Override // androidx.fragment.app.d
        public Fragment a(ClassLoader classLoader, String str) {
            return FragmentManager.this.s0().d(FragmentManager.this.s0().k(), str, null);
        }
    }

    /* loaded from: classes.dex */
    public class f implements ne1 {
        public f() {
        }

        @Override // com.daaw.ne1
        public androidx.fragment.app.l a(ViewGroup viewGroup) {
            return new androidx.fragment.app.b(viewGroup);
        }
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.a0(true);
        }
    }

    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ View b;
        public final /* synthetic */ Fragment c;

        public h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.a = viewGroup;
            this.b = view;
            this.c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.b);
            animator.removeListener(this);
            Fragment fragment = this.c;
            View view = fragment.W;
            if (view == null || !fragment.O) {
                return;
            }
            view.setVisibility(8);
        }
    }

    /* loaded from: classes.dex */
    public class i implements w30 {
        public final /* synthetic */ Fragment p;

        public i(Fragment fragment) {
            this.p = fragment;
        }

        @Override // com.daaw.w30
        public void b(FragmentManager fragmentManager, Fragment fragment) {
            this.p.m0(fragment);
        }
    }

    /* loaded from: classes.dex */
    public class j implements u0<ActivityResult> {
        public j() {
        }

        @Override // com.daaw.u0
        /* renamed from: b */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.C.pollFirst();
            if (pollFirst == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("No Activities were started for result for ");
                sb.append(this);
                return;
            }
            String str = pollFirst.p;
            int i = pollFirst.q;
            Fragment i2 = FragmentManager.this.c.i(str);
            if (i2 != null) {
                i2.j0(i, activityResult.b(), activityResult.a());
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Activity result delivered for unknown Fragment ");
            sb2.append(str);
        }
    }

    /* loaded from: classes.dex */
    public static class k extends v0<IntentSenderRequest, ActivityResult> {
        @Override // com.daaw.v0
        /* renamed from: d */
        public Intent a(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a = intentSenderRequest.a();
            if (a != null && (bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.b(intentSenderRequest.g()).b(null).c(intentSenderRequest.c(), intentSenderRequest.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.E0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("CreateIntent created the following intent: ");
                sb.append(intent);
            }
            return intent;
        }

        @Override // com.daaw.v0
        /* renamed from: e */
        public ActivityResult c(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* loaded from: classes.dex */
    public interface l {
        void a();
    }

    /* loaded from: classes.dex */
    public interface m {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* loaded from: classes.dex */
    public class n implements m {
        public final String a;
        public final int b;
        public final int c;

        public n(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.u;
            if (fragment == null || this.b >= 0 || this.a != null || !fragment.t().U0()) {
                return FragmentManager.this.W0(arrayList, arrayList2, this.a, this.b, this.c);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class o implements Fragment.h {
        public final boolean a;
        public final androidx.fragment.app.a b;
        public int c;

        public o(androidx.fragment.app.a aVar, boolean z) {
            this.a = z;
            this.b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.h
        public void a() {
            this.c++;
        }

        @Override // androidx.fragment.app.Fragment.h
        public void b() {
            int i = this.c - 1;
            this.c = i;
            if (i != 0) {
                return;
            }
            this.b.t.f1();
        }

        public void c() {
            androidx.fragment.app.a aVar = this.b;
            aVar.t.t(aVar, this.a, false, false);
        }

        public void d() {
            boolean z = this.c > 0;
            for (Fragment fragment : this.b.t.r0()) {
                fragment.A1(null);
                if (z && fragment.d0()) {
                    fragment.F1();
                }
            }
            androidx.fragment.app.a aVar = this.b;
            aVar.t.t(aVar, this.a, !z, true);
        }

        public boolean e() {
            return this.c == 0;
        }
    }

    public static boolean E0(int i2) {
        return O || Log.isLoggable("FragmentManager", i2);
    }

    public static void c0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            androidx.fragment.app.a aVar = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue()) {
                aVar.p(-1);
                aVar.u(i2 == i3 + (-1));
            } else {
                aVar.p(1);
                aVar.t();
            }
            i2++;
        }
    }

    public static int d1(int i2) {
        if (i2 != 4097) {
            if (i2 != 4099) {
                return i2 != 8194 ? 0 : 4097;
            }
            return 4099;
        }
        return 8194;
    }

    public static Fragment y0(View view) {
        Object tag = view.getTag(r11.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public void A(Configuration configuration) {
        for (Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.R0(configuration);
            }
        }
    }

    public void A0() {
        a0(true);
        if (this.h.c()) {
            U0();
        } else {
            this.g.f();
        }
    }

    public boolean B(MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (Fragment fragment : this.c.n()) {
            if (fragment != null && fragment.S0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void B0(Fragment fragment) {
        if (E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(fragment);
        }
        if (fragment.O) {
            return;
        }
        fragment.O = true;
        fragment.c0 = true ^ fragment.c0;
        j1(fragment);
    }

    public void C() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        S(1);
    }

    public void C0(Fragment fragment) {
        if (fragment.A && F0(fragment)) {
            this.D = true;
        }
    }

    public boolean D(Menu menu, MenuInflater menuInflater) {
        if (this.q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.c.n()) {
            if (fragment != null && G0(fragment) && fragment.U0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                Fragment fragment2 = this.e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.u0();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public boolean D0() {
        return this.G;
    }

    public void E() {
        this.G = true;
        a0(true);
        X();
        S(-1);
        this.r = null;
        this.s = null;
        this.t = null;
        if (this.g != null) {
            this.h.d();
            this.g = null;
        }
        y0<Intent> y0Var = this.z;
        if (y0Var != null) {
            y0Var.c();
            this.A.c();
            this.B.c();
        }
    }

    public void F() {
        S(1);
    }

    public final boolean F0(Fragment fragment) {
        return (fragment.S && fragment.T) || fragment.J.n();
    }

    public void G() {
        for (Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.a1();
            }
        }
    }

    public boolean G0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.c0();
    }

    public void H(boolean z) {
        for (Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.b1(z);
            }
        }
    }

    public boolean H0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.H;
        return fragment.equals(fragmentManager.w0()) && H0(fragmentManager.t);
    }

    public void I(Fragment fragment) {
        Iterator<w30> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().b(this, fragment);
        }
    }

    public boolean I0(int i2) {
        return this.q >= i2;
    }

    public boolean J(MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (Fragment fragment : this.c.n()) {
            if (fragment != null && fragment.c1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean J0() {
        return this.E || this.F;
    }

    public void K(Menu menu) {
        if (this.q < 1) {
            return;
        }
        for (Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.d1(menu);
            }
        }
    }

    public void K0(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (this.z == null) {
            this.r.p(fragment, intent, i2, bundle);
            return;
        }
        this.C.addLast(new LaunchedFragmentInfo(fragment.u, i2));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.z.a(intent);
    }

    public final void L(Fragment fragment) {
        if (fragment == null || !fragment.equals(f0(fragment.u))) {
            return;
        }
        fragment.h1();
    }

    public final void L0(j6<Fragment> j6Var) {
        int size = j6Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment n2 = j6Var.n(i2);
            if (!n2.A) {
                View p1 = n2.p1();
                n2.d0 = p1.getAlpha();
                p1.setAlpha(0.0f);
            }
        }
    }

    public void M() {
        S(5);
    }

    public void M0(Fragment fragment) {
        if (!this.c.c(fragment.u)) {
            if (E0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Ignoring moving ");
                sb.append(fragment);
                sb.append(" to state ");
                sb.append(this.q);
                sb.append("since it is not added to ");
                sb.append(this);
                return;
            }
            return;
        }
        O0(fragment);
        View view = fragment.W;
        if (view != null && fragment.b0 && fragment.V != null) {
            float f2 = fragment.d0;
            if (f2 > 0.0f) {
                view.setAlpha(f2);
            }
            fragment.d0 = 0.0f;
            fragment.b0 = false;
            c.d c2 = androidx.fragment.app.c.c(this.r.k(), fragment, true, fragment.I());
            if (c2 != null) {
                Animation animation = c2.a;
                if (animation != null) {
                    fragment.W.startAnimation(animation);
                } else {
                    c2.b.setTarget(fragment.W);
                    c2.b.start();
                }
            }
        }
        if (fragment.c0) {
            u(fragment);
        }
    }

    public void N(boolean z) {
        for (Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.f1(z);
            }
        }
    }

    public void N0(int i2, boolean z) {
        androidx.fragment.app.e<?> eVar;
        if (this.r == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.q) {
            this.q = i2;
            if (P) {
                this.c.r();
            } else {
                for (Fragment fragment : this.c.n()) {
                    M0(fragment);
                }
                for (androidx.fragment.app.h hVar : this.c.k()) {
                    Fragment k2 = hVar.k();
                    if (!k2.b0) {
                        M0(k2);
                    }
                    if (k2.B && !k2.b0()) {
                        this.c.q(hVar);
                    }
                }
            }
            l1();
            if (this.D && (eVar = this.r) != null && this.q == 7) {
                eVar.q();
                this.D = false;
            }
        }
    }

    public boolean O(Menu menu) {
        boolean z = false;
        if (this.q < 1) {
            return false;
        }
        for (Fragment fragment : this.c.n()) {
            if (fragment != null && G0(fragment) && fragment.g1(menu)) {
                z = true;
            }
        }
        return z;
    }

    public void O0(Fragment fragment) {
        P0(fragment, this.q);
    }

    public void P() {
        m1();
        L(this.u);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void P0(androidx.fragment.app.Fragment r10, int r11) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.P0(androidx.fragment.app.Fragment, int):void");
    }

    public void Q() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        S(7);
    }

    public void Q0() {
        if (this.r == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.M.n(false);
        for (Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.h0();
            }
        }
    }

    public void R() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        S(5);
    }

    public void R0(s30 s30Var) {
        View view;
        for (androidx.fragment.app.h hVar : this.c.k()) {
            Fragment k2 = hVar.k();
            if (k2.M == s30Var.getId() && (view = k2.W) != null && view.getParent() == null) {
                k2.V = s30Var;
                hVar.b();
            }
        }
    }

    public final void S(int i2) {
        try {
            this.b = true;
            this.c.d(i2);
            N0(i2, false);
            if (P) {
                for (androidx.fragment.app.l lVar : r()) {
                    lVar.j();
                }
            }
            this.b = false;
            a0(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public void S0(androidx.fragment.app.h hVar) {
        Fragment k2 = hVar.k();
        if (k2.X) {
            if (this.b) {
                this.H = true;
                return;
            }
            k2.X = false;
            if (P) {
                hVar.m();
            } else {
                O0(k2);
            }
        }
    }

    public void T() {
        this.F = true;
        this.M.n(true);
        S(4);
    }

    public void T0(int i2, int i3) {
        if (i2 >= 0) {
            Y(new n(null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    public void U() {
        S(2);
    }

    public boolean U0() {
        return V0(null, -1, 0);
    }

    public final void V() {
        if (this.H) {
            this.H = false;
            l1();
        }
    }

    public final boolean V0(String str, int i2, int i3) {
        a0(false);
        Z(true);
        Fragment fragment = this.u;
        if (fragment == null || i2 >= 0 || str != null || !fragment.t().U0()) {
            boolean W0 = W0(this.I, this.J, str, i2, i3);
            if (W0) {
                this.b = true;
                try {
                    a1(this.I, this.J);
                } finally {
                    p();
                }
            }
            m1();
            V();
            this.c.b();
            return W0;
        }
        return true;
    }

    public void W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.e.get(i2).toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                androidx.fragment.app.a aVar = this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.r(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            int size3 = this.a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size3; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(this.a.get(i4));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.s);
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public boolean W0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.d.get(size2);
                    if ((str != null && str.equals(aVar.w())) || (i2 >= 0 && i2 == aVar.v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = this.d.get(size2);
                        if (str == null || !str.equals(aVar2.w())) {
                            if (i2 < 0 || i2 != aVar2.v) {
                                break;
                            }
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.d.size() - 1) {
                return false;
            }
            for (int size3 = this.d.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public final void X() {
        if (P) {
            for (androidx.fragment.app.l lVar : r()) {
                lVar.j();
            }
        } else if (!this.m.isEmpty()) {
            for (Fragment fragment : this.m.keySet()) {
                m(fragment);
                O0(fragment);
            }
        }
    }

    public final int X0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, j6<Fragment> j6Var) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            androidx.fragment.app.a aVar = arrayList.get(i5);
            boolean booleanValue = arrayList2.get(i5).booleanValue();
            if (aVar.A() && !aVar.y(arrayList, i5 + 1, i3)) {
                if (this.L == null) {
                    this.L = new ArrayList<>();
                }
                o oVar = new o(aVar, booleanValue);
                this.L.add(oVar);
                aVar.C(oVar);
                if (booleanValue) {
                    aVar.t();
                } else {
                    aVar.u(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, aVar);
                }
                d(j6Var);
            }
        }
        return i4;
    }

    public void Y(m mVar, boolean z) {
        if (!z) {
            if (this.r == null) {
                if (!this.G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            o();
        }
        synchronized (this.a) {
            if (this.r == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.a.add(mVar);
            f1();
        }
    }

    public void Y0(Fragment fragment, wd wdVar) {
        HashSet<wd> hashSet = this.m.get(fragment);
        if (hashSet != null && hashSet.remove(wdVar) && hashSet.isEmpty()) {
            this.m.remove(fragment);
            if (fragment.p < 5) {
                w(fragment);
                O0(fragment);
            }
        }
    }

    public final void Z(boolean z) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.r == null) {
            if (!this.G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        } else if (Looper.myLooper() != this.r.l().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else {
            if (!z) {
                o();
            }
            if (this.I == null) {
                this.I = new ArrayList<>();
                this.J = new ArrayList<>();
            }
            this.b = true;
            try {
                e0(null, null);
            } finally {
                this.b = false;
            }
        }
    }

    public void Z0(Fragment fragment) {
        if (E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(fragment);
            sb.append(" nesting=");
            sb.append(fragment.G);
        }
        boolean z = !fragment.b0();
        if (!fragment.P || z) {
            this.c.s(fragment);
            if (F0(fragment)) {
                this.D = true;
            }
            fragment.B = true;
            j1(fragment);
        }
    }

    public boolean a0(boolean z) {
        Z(z);
        boolean z2 = false;
        while (k0(this.I, this.J)) {
            this.b = true;
            try {
                a1(this.I, this.J);
                p();
                z2 = true;
            } catch (Throwable th) {
                p();
                throw th;
            }
        }
        m1();
        V();
        this.c.b();
        return z2;
    }

    public final void a1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        e0(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).r) {
                if (i3 != i2) {
                    d0(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).r) {
                        i3++;
                    }
                }
                d0(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            d0(arrayList, arrayList2, i3, size);
        }
    }

    public void b0(m mVar, boolean z) {
        if (z && (this.r == null || this.G)) {
            return;
        }
        Z(z);
        if (mVar.a(this.I, this.J)) {
            this.b = true;
            try {
                a1(this.I, this.J);
            } finally {
                p();
            }
        }
        m1();
        V();
        this.c.b();
    }

    public final void b1() {
        if (this.l != null) {
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                this.l.get(i2).a();
            }
        }
    }

    public void c1(Parcelable parcelable) {
        androidx.fragment.app.h hVar;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.p == null) {
            return;
        }
        this.c.t();
        Iterator<FragmentState> it = fragmentManagerState.p.iterator();
        while (it.hasNext()) {
            FragmentState next = it.next();
            if (next != null) {
                Fragment g2 = this.M.g(next.q);
                if (g2 != null) {
                    if (E0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("restoreSaveState: re-attaching retained ");
                        sb.append(g2);
                    }
                    hVar = new androidx.fragment.app.h(this.o, this.c, g2, next);
                } else {
                    hVar = new androidx.fragment.app.h(this.o, this.c, this.r.k().getClassLoader(), p0(), next);
                }
                Fragment k2 = hVar.k();
                k2.H = this;
                if (E0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("restoreSaveState: active (");
                    sb2.append(k2.u);
                    sb2.append("): ");
                    sb2.append(k2);
                }
                hVar.o(this.r.k().getClassLoader());
                this.c.p(hVar);
                hVar.t(this.q);
            }
        }
        for (Fragment fragment : this.M.j()) {
            if (!this.c.c(fragment.u)) {
                if (E0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Discarding retained Fragment ");
                    sb3.append(fragment);
                    sb3.append(" that was not found in the set of active Fragments ");
                    sb3.append(fragmentManagerState.p);
                }
                this.M.m(fragment);
                fragment.H = this;
                androidx.fragment.app.h hVar2 = new androidx.fragment.app.h(this.o, this.c, fragment);
                hVar2.t(1);
                hVar2.m();
                fragment.B = true;
                hVar2.m();
            }
        }
        this.c.u(fragmentManagerState.q);
        if (fragmentManagerState.r != null) {
            this.d = new ArrayList<>(fragmentManagerState.r.length);
            int i2 = 0;
            while (true) {
                BackStackState[] backStackStateArr = fragmentManagerState.r;
                if (i2 >= backStackStateArr.length) {
                    break;
                }
                androidx.fragment.app.a a2 = backStackStateArr[i2].a(this);
                if (E0(2)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("restoreAllState: back stack #");
                    sb4.append(i2);
                    sb4.append(" (index ");
                    sb4.append(a2.v);
                    sb4.append("): ");
                    sb4.append(a2);
                    PrintWriter printWriter = new PrintWriter(new kl0("FragmentManager"));
                    a2.s("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(a2);
                i2++;
            }
        } else {
            this.d = null;
        }
        this.i.set(fragmentManagerState.s);
        String str = fragmentManagerState.t;
        if (str != null) {
            Fragment f0 = f0(str);
            this.u = f0;
            L(f0);
        }
        ArrayList<String> arrayList = fragmentManagerState.u;
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                Bundle bundle = fragmentManagerState.v.get(i3);
                bundle.setClassLoader(this.r.k().getClassLoader());
                this.j.put(arrayList.get(i3), bundle);
            }
        }
        this.C = new ArrayDeque<>(fragmentManagerState.w);
    }

    public final void d(j6<Fragment> j6Var) {
        int i2 = this.q;
        if (i2 < 1) {
            return;
        }
        int min = Math.min(i2, 5);
        for (Fragment fragment : this.c.n()) {
            if (fragment.p < min) {
                P0(fragment, min);
                if (fragment.W != null && !fragment.O && fragment.b0) {
                    j6Var.add(fragment);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d0(java.util.ArrayList<androidx.fragment.app.a> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.d0(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public void e(androidx.fragment.app.a aVar) {
        if (this.d == null) {
            this.d = new ArrayList<>();
        }
        this.d.add(aVar);
    }

    public final void e0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<o> arrayList3 = this.L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            o oVar = this.L.get(i2);
            if (arrayList == null || oVar.a || (indexOf2 = arrayList.indexOf(oVar.b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if (oVar.e() || (arrayList != null && oVar.b.y(arrayList, 0, arrayList.size()))) {
                    this.L.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || oVar.a || (indexOf = arrayList.indexOf(oVar.b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        oVar.d();
                    }
                }
                i2++;
            } else {
                this.L.remove(i2);
                i2--;
                size--;
            }
            oVar.c();
            i2++;
        }
    }

    public Parcelable e1() {
        int size;
        j0();
        X();
        a0(true);
        this.E = true;
        this.M.n(true);
        ArrayList<FragmentState> v = this.c.v();
        BackStackState[] backStackStateArr = null;
        if (v.isEmpty()) {
            E0(2);
            return null;
        }
        ArrayList<String> w = this.c.w();
        ArrayList<androidx.fragment.app.a> arrayList = this.d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i2 = 0; i2 < size; i2++) {
                backStackStateArr[i2] = new BackStackState(this.d.get(i2));
                if (E0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("saveAllState: adding back stack #");
                    sb.append(i2);
                    sb.append(": ");
                    sb.append(this.d.get(i2));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.p = v;
        fragmentManagerState.q = w;
        fragmentManagerState.r = backStackStateArr;
        fragmentManagerState.s = this.i.get();
        Fragment fragment = this.u;
        if (fragment != null) {
            fragmentManagerState.t = fragment.u;
        }
        fragmentManagerState.u.addAll(this.j.keySet());
        fragmentManagerState.v.addAll(this.j.values());
        fragmentManagerState.w = new ArrayList<>(this.C);
        return fragmentManagerState;
    }

    public void f(Fragment fragment, wd wdVar) {
        if (this.m.get(fragment) == null) {
            this.m.put(fragment, new HashSet<>());
        }
        this.m.get(fragment).add(wdVar);
    }

    public Fragment f0(String str) {
        return this.c.f(str);
    }

    public void f1() {
        synchronized (this.a) {
            ArrayList<o> arrayList = this.L;
            boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z2 = this.a.size() == 1;
            if (z || z2) {
                this.r.l().removeCallbacks(this.N);
                this.r.l().post(this.N);
                m1();
            }
        }
    }

    public androidx.fragment.app.h g(Fragment fragment) {
        if (E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(fragment);
        }
        androidx.fragment.app.h v = v(fragment);
        fragment.H = this;
        this.c.p(v);
        if (!fragment.P) {
            this.c.a(fragment);
            fragment.B = false;
            if (fragment.W == null) {
                fragment.c0 = false;
            }
            if (F0(fragment)) {
                this.D = true;
            }
        }
        return v;
    }

    public Fragment g0(int i2) {
        return this.c.g(i2);
    }

    public void g1(Fragment fragment, boolean z) {
        ViewGroup o0 = o0(fragment);
        if (o0 == null || !(o0 instanceof s30)) {
            return;
        }
        ((s30) o0).setDrawDisappearingViewsLast(!z);
    }

    public void h(w30 w30Var) {
        this.p.add(w30Var);
    }

    public Fragment h0(String str) {
        return this.c.h(str);
    }

    public void h1(Fragment fragment, c.EnumC0020c enumC0020c) {
        if (fragment.equals(f0(fragment.u)) && (fragment.I == null || fragment.H == this)) {
            fragment.g0 = enumC0020c;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public int i() {
        return this.i.getAndIncrement();
    }

    public Fragment i0(String str) {
        return this.c.i(str);
    }

    public void i1(Fragment fragment) {
        if (fragment == null || (fragment.equals(f0(fragment.u)) && (fragment.I == null || fragment.H == this))) {
            Fragment fragment2 = this.u;
            this.u = fragment;
            L(fragment2);
            L(this.u);
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
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(androidx.fragment.app.e<?> r3, com.daaw.r30 r4, androidx.fragment.app.Fragment r5) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.j(androidx.fragment.app.e, com.daaw.r30, androidx.fragment.app.Fragment):void");
    }

    public final void j0() {
        if (P) {
            for (androidx.fragment.app.l lVar : r()) {
                lVar.k();
            }
        } else if (this.L != null) {
            while (!this.L.isEmpty()) {
                this.L.remove(0).d();
            }
        }
    }

    public final void j1(Fragment fragment) {
        ViewGroup o0 = o0(fragment);
        if (o0 == null || fragment.v() + fragment.y() + fragment.J() + fragment.K() <= 0) {
            return;
        }
        int i2 = r11.visible_removing_fragment_view_tag;
        if (o0.getTag(i2) == null) {
            o0.setTag(i2, fragment);
        }
        ((Fragment) o0.getTag(i2)).B1(fragment.I());
    }

    public void k(Fragment fragment) {
        if (E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(fragment);
        }
        if (fragment.P) {
            fragment.P = false;
            if (fragment.A) {
                return;
            }
            this.c.a(fragment);
            if (E0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("add from attach: ");
                sb2.append(fragment);
            }
            if (F0(fragment)) {
                this.D = true;
            }
        }
    }

    public final boolean k0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return false;
            }
            int size = this.a.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                z |= this.a.get(i2).a(arrayList, arrayList2);
            }
            this.a.clear();
            this.r.l().removeCallbacks(this.N);
            return z;
        }
    }

    public void k1(Fragment fragment) {
        if (E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(fragment);
        }
        if (fragment.O) {
            fragment.O = false;
            fragment.c0 = !fragment.c0;
        }
    }

    public androidx.fragment.app.j l() {
        return new androidx.fragment.app.a(this);
    }

    public int l0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final void l1() {
        for (androidx.fragment.app.h hVar : this.c.k()) {
            S0(hVar);
        }
    }

    public final void m(Fragment fragment) {
        HashSet<wd> hashSet = this.m.get(fragment);
        if (hashSet != null) {
            Iterator<wd> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            hashSet.clear();
            w(fragment);
            this.m.remove(fragment);
        }
    }

    public final v30 m0(Fragment fragment) {
        return this.M.h(fragment);
    }

    public final void m1() {
        synchronized (this.a) {
            boolean z = true;
            if (this.a.isEmpty()) {
                this.h.f((l0() <= 0 || !H0(this.t)) ? false : false);
            } else {
                this.h.f(true);
            }
        }
    }

    public boolean n() {
        boolean z = false;
        for (Fragment fragment : this.c.l()) {
            if (fragment != null) {
                z = F0(fragment);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public r30 n0() {
        return this.s;
    }

    public final void o() {
        if (J0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public final ViewGroup o0(Fragment fragment) {
        ViewGroup viewGroup = fragment.V;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.M > 0 && this.s.h()) {
            View f2 = this.s.f(fragment.M);
            if (f2 instanceof ViewGroup) {
                return (ViewGroup) f2;
            }
        }
        return null;
    }

    public final void p() {
        this.b = false;
        this.J.clear();
        this.I.clear();
    }

    public androidx.fragment.app.d p0() {
        androidx.fragment.app.d dVar = this.v;
        if (dVar != null) {
            return dVar;
        }
        Fragment fragment = this.t;
        return fragment != null ? fragment.H.p0() : this.w;
    }

    public final void q(String str) {
        this.j.remove(str);
    }

    public androidx.fragment.app.i q0() {
        return this.c;
    }

    public final Set<androidx.fragment.app.l> r() {
        HashSet hashSet = new HashSet();
        for (androidx.fragment.app.h hVar : this.c.k()) {
            ViewGroup viewGroup = hVar.k().V;
            if (viewGroup != null) {
                hashSet.add(androidx.fragment.app.l.o(viewGroup, x0()));
            }
        }
        return hashSet;
    }

    public List<Fragment> r0() {
        return this.c.n();
    }

    public final Set<androidx.fragment.app.l> s(ArrayList<androidx.fragment.app.a> arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            Iterator<j.a> it = arrayList.get(i2).c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().b;
                if (fragment != null && (viewGroup = fragment.V) != null) {
                    hashSet.add(androidx.fragment.app.l.n(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    public androidx.fragment.app.e<?> s0() {
        return this.r;
    }

    public void t(androidx.fragment.app.a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.u(z3);
        } else {
            aVar.t();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.q >= 1) {
            androidx.fragment.app.k.B(this.r.k(), this.s, arrayList, arrayList2, 0, 1, true, this.n);
        }
        if (z3) {
            N0(this.q, true);
        }
        for (Fragment fragment : this.c.l()) {
            if (fragment != null && fragment.W != null && fragment.b0 && aVar.x(fragment.M)) {
                float f2 = fragment.d0;
                if (f2 > 0.0f) {
                    fragment.W.setAlpha(f2);
                }
                if (z3) {
                    fragment.d0 = 0.0f;
                } else {
                    fragment.d0 = -1.0f;
                    fragment.b0 = false;
                }
            }
        }
    }

    public LayoutInflater.Factory2 t0() {
        return this.f;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.t;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.t;
        } else {
            androidx.fragment.app.e<?> eVar = this.r;
            if (eVar == null) {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
            sb.append(eVar.getClass().getSimpleName());
            sb.append("{");
            obj = this.r;
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    public final void u(Fragment fragment) {
        Animator animator;
        if (fragment.W != null) {
            c.d c2 = androidx.fragment.app.c.c(this.r.k(), fragment, !fragment.O, fragment.I());
            if (c2 == null || (animator = c2.b) == null) {
                if (c2 != null) {
                    fragment.W.startAnimation(c2.a);
                    c2.a.start();
                }
                fragment.W.setVisibility((!fragment.O || fragment.a0()) ? 0 : 8);
                if (fragment.a0()) {
                    fragment.y1(false);
                }
            } else {
                animator.setTarget(fragment.W);
                if (!fragment.O) {
                    fragment.W.setVisibility(0);
                } else if (fragment.a0()) {
                    fragment.y1(false);
                } else {
                    ViewGroup viewGroup = fragment.V;
                    View view = fragment.W;
                    viewGroup.startViewTransition(view);
                    c2.b.addListener(new h(viewGroup, view, fragment));
                }
                c2.b.start();
            }
        }
        C0(fragment);
        fragment.c0 = false;
        fragment.y0(fragment.O);
    }

    public androidx.fragment.app.g u0() {
        return this.o;
    }

    public androidx.fragment.app.h v(Fragment fragment) {
        androidx.fragment.app.h m2 = this.c.m(fragment.u);
        if (m2 != null) {
            return m2;
        }
        androidx.fragment.app.h hVar = new androidx.fragment.app.h(this.o, this.c, fragment);
        hVar.o(this.r.k().getClassLoader());
        hVar.t(this.q);
        return hVar;
    }

    public Fragment v0() {
        return this.t;
    }

    public final void w(Fragment fragment) {
        fragment.X0();
        this.o.n(fragment, false);
        fragment.V = null;
        fragment.W = null;
        fragment.i0 = null;
        fragment.j0.j(null);
        fragment.D = false;
    }

    public Fragment w0() {
        return this.u;
    }

    public void x(Fragment fragment) {
        if (E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(fragment);
        }
        if (fragment.P) {
            return;
        }
        fragment.P = true;
        if (fragment.A) {
            if (E0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("remove from detach: ");
                sb2.append(fragment);
            }
            this.c.s(fragment);
            if (F0(fragment)) {
                this.D = true;
            }
            j1(fragment);
        }
    }

    public ne1 x0() {
        ne1 ne1Var = this.x;
        if (ne1Var != null) {
            return ne1Var;
        }
        Fragment fragment = this.t;
        return fragment != null ? fragment.H.x0() : this.y;
    }

    public void y() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        S(4);
    }

    public void z() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        S(0);
    }

    public mt1 z0(Fragment fragment) {
        return this.M.k(fragment);
    }
}
