package com.daaw;

import com.daaw.InterfaceC2200mp;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public interface tb0 extends InterfaceC2200mp {

    /* renamed from: com.daaw.tb0$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC3036a implements InterfaceC3037b {

        /* renamed from: a */
        public final C3041f f27191a = new C3041f();

        @Override // com.daaw.InterfaceC2200mp.InterfaceC2201a
        /* renamed from: b */
        public final tb0 mo9376a() {
            return mo9374c(this.f27191a);
        }

        /* renamed from: c */
        public abstract tb0 mo9374c(C3041f c3041f);
    }

    /* renamed from: com.daaw.tb0$b */
    /* loaded from: classes.dex */
    public interface InterfaceC3037b extends InterfaceC2200mp.InterfaceC2201a {
    }

    /* renamed from: com.daaw.tb0$c */
    /* loaded from: classes.dex */
    public static class C3038c extends IOException {

        /* renamed from: p */
        public final int f27192p;

        /* renamed from: q */
        public final C2570pp f27193q;

        public C3038c(IOException iOException, C2570pp c2570pp, int i) {
            super(iOException);
            this.f27193q = c2570pp;
            this.f27192p = i;
        }

        public C3038c(String str, C2570pp c2570pp, int i) {
            super(str);
            this.f27193q = c2570pp;
            this.f27192p = i;
        }

        public C3038c(String str, IOException iOException, C2570pp c2570pp, int i) {
            super(str, iOException);
            this.f27193q = c2570pp;
            this.f27192p = i;
        }
    }

    /* renamed from: com.daaw.tb0$d */
    /* loaded from: classes.dex */
    public static final class C3039d extends C3038c {

        /* renamed from: r */
        public final String f27194r;

        public C3039d(String str, C2570pp c2570pp) {
            super("Invalid content type: " + str, c2570pp, 1);
            this.f27194r = str;
        }
    }

    /* renamed from: com.daaw.tb0$e */
    /* loaded from: classes.dex */
    public static final class C3040e extends C3038c {

        /* renamed from: r */
        public final int f27195r;

        /* renamed from: s */
        public final Map<String, List<String>> f27196s;

        public C3040e(int i, Map<String, List<String>> map, C2570pp c2570pp) {
            super("Response code: " + i, c2570pp, 1);
            this.f27195r = i;
            this.f27196s = map;
        }
    }

    /* renamed from: com.daaw.tb0$f */
    /* loaded from: classes.dex */
    public static final class C3041f {

        /* renamed from: a */
        public final Map<String, String> f27197a = new HashMap();

        /* renamed from: b */
        public Map<String, String> f27198b;

        /* renamed from: a */
        public synchronized Map<String, String> m9373a() {
            if (this.f27198b == null) {
                this.f27198b = Collections.unmodifiableMap(new HashMap(this.f27197a));
            }
            return this.f27198b;
        }
    }
}
