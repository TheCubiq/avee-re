package com.daaw;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.daaw.k3.d;
import com.daaw.pa;
import com.daaw.y70;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
/* loaded from: classes.dex */
public final class k3<O extends d> {
    public final a<?, O> a;
    public final g<?> b;
    public final String c;

    /* loaded from: classes.dex */
    public static abstract class a<T extends f, O> extends e<T, O> {
        public T a(Context context, Looper looper, xf xfVar, O o, ej ejVar, du0 du0Var) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }

        @Deprecated
        public T b(Context context, Looper looper, xf xfVar, O o, y70.a aVar, y70.b bVar) {
            return a(context, looper, xfVar, o, aVar, bVar);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static class c<C extends b> {
    }

    /* loaded from: classes.dex */
    public interface d {
        public static final c a = new c(null);

        /* loaded from: classes.dex */
        public interface a extends d {
            Account b();
        }

        /* loaded from: classes.dex */
        public interface b extends d {
            GoogleSignInAccount a();
        }

        /* loaded from: classes.dex */
        public static final class c implements d {
            public c() {
            }

            public /* synthetic */ c(oz1 oz1Var) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<T extends b, O> {
    }

    /* loaded from: classes.dex */
    public interface f extends b {
        Set<Scope> a();

        void connect(pa.c cVar);

        void disconnect();

        void disconnect(String str);

        Feature[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(com.google.android.gms.common.internal.b bVar, Set<Scope> set);

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(pa.e eVar);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    /* loaded from: classes.dex */
    public static final class g<C extends f> extends c<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends f> k3(String str, a<C, O> aVar, g<C> gVar) {
        ry0.k(aVar, "Cannot construct an Api with a null ClientBuilder");
        ry0.k(gVar, "Cannot construct an Api with a null ClientKey");
        this.c = str;
        this.a = aVar;
        this.b = gVar;
    }

    public final a<?, O> a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }
}
