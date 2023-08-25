package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0344c;
import com.daaw.sj0;
import com.daaw.tj0;
/* renamed from: androidx.lifecycle.i */
/* loaded from: classes.dex */
public class FragmentC0358i extends Fragment {

    /* renamed from: p */
    public InterfaceC0359a f1782p;

    /* renamed from: androidx.lifecycle.i$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0359a {
        /* renamed from: a */
        void mo29007a();

        /* renamed from: b */
        void mo29006b();

        void onResume();
    }

    /* renamed from: androidx.lifecycle.i$b */
    /* loaded from: classes.dex */
    public static class C0360b implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new C0360b());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            FragmentC0358i.m29015a(activity, AbstractC0344c.EnumC0346b.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            FragmentC0358i.m29015a(activity, AbstractC0344c.EnumC0346b.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            FragmentC0358i.m29015a(activity, AbstractC0344c.EnumC0346b.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            FragmentC0358i.m29015a(activity, AbstractC0344c.EnumC0346b.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            FragmentC0358i.m29015a(activity, AbstractC0344c.EnumC0346b.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            FragmentC0358i.m29015a(activity, AbstractC0344c.EnumC0346b.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    public static void m29015a(Activity activity, AbstractC0344c.EnumC0346b enumC0346b) {
        if (activity instanceof tj0) {
            ((tj0) activity).mo2327a().m29041h(enumC0346b);
        } else if (activity instanceof sj0) {
            AbstractC0344c mo2327a = ((sj0) activity).mo2327a();
            if (mo2327a instanceof C0349e) {
                ((C0349e) mo2327a).m29041h(enumC0346b);
            }
        }
    }

    /* renamed from: f */
    public static FragmentC0358i m29010f(Activity activity) {
        return (FragmentC0358i) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    /* renamed from: g */
    public static void m29009g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C0360b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0358i(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: b */
    public final void m29014b(AbstractC0344c.EnumC0346b enumC0346b) {
        if (Build.VERSION.SDK_INT < 29) {
            m29015a(getActivity(), enumC0346b);
        }
    }

    /* renamed from: c */
    public final void m29013c(InterfaceC0359a interfaceC0359a) {
        if (interfaceC0359a != null) {
            interfaceC0359a.mo29006b();
        }
    }

    /* renamed from: d */
    public final void m29012d(InterfaceC0359a interfaceC0359a) {
        if (interfaceC0359a != null) {
            interfaceC0359a.onResume();
        }
    }

    /* renamed from: e */
    public final void m29011e(InterfaceC0359a interfaceC0359a) {
        if (interfaceC0359a != null) {
            interfaceC0359a.mo29007a();
        }
    }

    /* renamed from: h */
    public void m29008h(InterfaceC0359a interfaceC0359a) {
        this.f1782p = interfaceC0359a;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m29013c(this.f1782p);
        m29014b(AbstractC0344c.EnumC0346b.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m29014b(AbstractC0344c.EnumC0346b.ON_DESTROY);
        this.f1782p = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m29014b(AbstractC0344c.EnumC0346b.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m29012d(this.f1782p);
        m29014b(AbstractC0344c.EnumC0346b.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m29011e(this.f1782p);
        m29014b(AbstractC0344c.EnumC0346b.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m29014b(AbstractC0344c.EnumC0346b.ON_STOP);
    }
}
