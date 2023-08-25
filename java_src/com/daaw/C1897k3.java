package com.daaw;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.daaw.AbstractC2527pa;
import com.daaw.C1897k3.InterfaceC1901d;
import com.daaw.y70;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.InterfaceC3989b;
import java.util.Set;
/* renamed from: com.daaw.k3 */
/* loaded from: classes.dex */
public final class C1897k3<O extends InterfaceC1901d> {

    /* renamed from: a */
    public final AbstractC1898a<?, O> f15629a;

    /* renamed from: b */
    public final C1907g<?> f15630b;

    /* renamed from: c */
    public final String f15631c;

    /* renamed from: com.daaw.k3$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1898a<T extends InterfaceC1906f, O> extends AbstractC1905e<T, O> {
        /* renamed from: a */
        public T mo8133a(Context context, Looper looper, C3536xf c3536xf, O o, InterfaceC1192ej interfaceC1192ej, du0 du0Var) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }

        @Deprecated
        /* renamed from: b */
        public T mo1753b(Context context, Looper looper, C3536xf c3536xf, O o, y70.InterfaceC3675a interfaceC3675a, y70.InterfaceC3676b interfaceC3676b) {
            return mo8133a(context, looper, c3536xf, o, interfaceC3675a, interfaceC3676b);
        }
    }

    /* renamed from: com.daaw.k3$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1899b {
    }

    /* renamed from: com.daaw.k3$c */
    /* loaded from: classes.dex */
    public static class C1900c<C extends InterfaceC1899b> {
    }

    /* renamed from: com.daaw.k3$d */
    /* loaded from: classes.dex */
    public interface InterfaceC1901d {

        /* renamed from: a */
        public static final C1904c f15632a = new C1904c(null);

        /* renamed from: com.daaw.k3$d$a */
        /* loaded from: classes.dex */
        public interface InterfaceC1902a extends InterfaceC1901d {
            /* renamed from: b */
            Account m18068b();
        }

        /* renamed from: com.daaw.k3$d$b */
        /* loaded from: classes.dex */
        public interface InterfaceC1903b extends InterfaceC1901d {
            /* renamed from: a */
            GoogleSignInAccount m18067a();
        }

        /* renamed from: com.daaw.k3$d$c */
        /* loaded from: classes.dex */
        public static final class C1904c implements InterfaceC1901d {
            public C1904c() {
            }

            public /* synthetic */ C1904c(oz1 oz1Var) {
            }
        }
    }

    /* renamed from: com.daaw.k3$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1905e<T extends InterfaceC1899b, O> {
    }

    /* renamed from: com.daaw.k3$f */
    /* loaded from: classes.dex */
    public interface InterfaceC1906f extends InterfaceC1899b {
        /* renamed from: a */
        Set<Scope> mo9478a();

        void connect(AbstractC2527pa.InterfaceC2530c interfaceC2530c);

        void disconnect();

        void disconnect(String str);

        Feature[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(InterfaceC3989b interfaceC3989b, Set<Scope> set);

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(AbstractC2527pa.InterfaceC2532e interfaceC2532e);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    /* renamed from: com.daaw.k3$g */
    /* loaded from: classes.dex */
    public static final class C1907g<C extends InterfaceC1906f> extends C1900c<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends InterfaceC1906f> C1897k3(String str, AbstractC1898a<C, O> abstractC1898a, C1907g<C> c1907g) {
        ry0.m10829k(abstractC1898a, "Cannot construct an Api with a null ClientBuilder");
        ry0.m10829k(c1907g, "Cannot construct an Api with a null ClientKey");
        this.f15631c = str;
        this.f15629a = abstractC1898a;
        this.f15630b = c1907g;
    }

    /* renamed from: a */
    public final AbstractC1898a<?, O> m18070a() {
        return this.f15629a;
    }

    /* renamed from: b */
    public final String m18069b() {
        return this.f15631c;
    }
}
