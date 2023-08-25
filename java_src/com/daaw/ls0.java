package com.daaw;

import android.util.SparseArray;
import com.daaw.C1923k9;
import com.google.auto.value.AutoValue;
@AutoValue
/* loaded from: classes.dex */
public abstract class ls0 {

    @AutoValue.Builder
    /* renamed from: com.daaw.ls0$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2112a {
        /* renamed from: a */
        public abstract ls0 mo16616a();

        /* renamed from: b */
        public abstract AbstractC2112a mo16615b(EnumC2113b enumC2113b);

        /* renamed from: c */
        public abstract AbstractC2112a mo16614c(EnumC2114c enumC2114c);
    }

    /* renamed from: com.daaw.ls0$b */
    /* loaded from: classes.dex */
    public enum EnumC2113b {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        

        /* renamed from: L */
        public static final SparseArray<EnumC2113b> f17690L;

        /* renamed from: p */
        public final int f17702p;

        static {
            EnumC2113b enumC2113b = UNKNOWN_MOBILE_SUBTYPE;
            EnumC2113b enumC2113b2 = GPRS;
            EnumC2113b enumC2113b3 = EDGE;
            EnumC2113b enumC2113b4 = UMTS;
            EnumC2113b enumC2113b5 = CDMA;
            EnumC2113b enumC2113b6 = EVDO_0;
            EnumC2113b enumC2113b7 = EVDO_A;
            EnumC2113b enumC2113b8 = RTT;
            EnumC2113b enumC2113b9 = HSDPA;
            EnumC2113b enumC2113b10 = HSUPA;
            EnumC2113b enumC2113b11 = HSPA;
            EnumC2113b enumC2113b12 = IDEN;
            EnumC2113b enumC2113b13 = EVDO_B;
            EnumC2113b enumC2113b14 = LTE;
            EnumC2113b enumC2113b15 = EHRPD;
            EnumC2113b enumC2113b16 = HSPAP;
            EnumC2113b enumC2113b17 = GSM;
            EnumC2113b enumC2113b18 = TD_SCDMA;
            EnumC2113b enumC2113b19 = IWLAN;
            EnumC2113b enumC2113b20 = LTE_CA;
            SparseArray<EnumC2113b> sparseArray = new SparseArray<>();
            f17690L = sparseArray;
            sparseArray.put(0, enumC2113b);
            sparseArray.put(1, enumC2113b2);
            sparseArray.put(2, enumC2113b3);
            sparseArray.put(3, enumC2113b4);
            sparseArray.put(4, enumC2113b5);
            sparseArray.put(5, enumC2113b6);
            sparseArray.put(6, enumC2113b7);
            sparseArray.put(7, enumC2113b8);
            sparseArray.put(8, enumC2113b9);
            sparseArray.put(9, enumC2113b10);
            sparseArray.put(10, enumC2113b11);
            sparseArray.put(11, enumC2113b12);
            sparseArray.put(12, enumC2113b13);
            sparseArray.put(13, enumC2113b14);
            sparseArray.put(14, enumC2113b15);
            sparseArray.put(15, enumC2113b16);
            sparseArray.put(16, enumC2113b17);
            sparseArray.put(17, enumC2113b18);
            sparseArray.put(18, enumC2113b19);
            sparseArray.put(19, enumC2113b20);
        }

        EnumC2113b(int i) {
            this.f17702p = i;
        }

        /* renamed from: a */
        public static EnumC2113b m16613a(int i) {
            return f17690L.get(i);
        }

        /* renamed from: b */
        public int m16612b() {
            return this.f17702p;
        }
    }

    /* renamed from: com.daaw.ls0$c */
    /* loaded from: classes.dex */
    public enum EnumC2114c {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);
        

        /* renamed from: J */
        public static final SparseArray<EnumC2114c> f17712J;

        /* renamed from: p */
        public final int f17724p;

        static {
            EnumC2114c enumC2114c = MOBILE;
            EnumC2114c enumC2114c2 = WIFI;
            EnumC2114c enumC2114c3 = MOBILE_MMS;
            EnumC2114c enumC2114c4 = MOBILE_SUPL;
            EnumC2114c enumC2114c5 = MOBILE_DUN;
            EnumC2114c enumC2114c6 = MOBILE_HIPRI;
            EnumC2114c enumC2114c7 = WIMAX;
            EnumC2114c enumC2114c8 = BLUETOOTH;
            EnumC2114c enumC2114c9 = DUMMY;
            EnumC2114c enumC2114c10 = ETHERNET;
            EnumC2114c enumC2114c11 = MOBILE_FOTA;
            EnumC2114c enumC2114c12 = MOBILE_IMS;
            EnumC2114c enumC2114c13 = MOBILE_CBS;
            EnumC2114c enumC2114c14 = WIFI_P2P;
            EnumC2114c enumC2114c15 = MOBILE_IA;
            EnumC2114c enumC2114c16 = MOBILE_EMERGENCY;
            EnumC2114c enumC2114c17 = PROXY;
            EnumC2114c enumC2114c18 = VPN;
            EnumC2114c enumC2114c19 = NONE;
            SparseArray<EnumC2114c> sparseArray = new SparseArray<>();
            f17712J = sparseArray;
            sparseArray.put(0, enumC2114c);
            sparseArray.put(1, enumC2114c2);
            sparseArray.put(2, enumC2114c3);
            sparseArray.put(3, enumC2114c4);
            sparseArray.put(4, enumC2114c5);
            sparseArray.put(5, enumC2114c6);
            sparseArray.put(6, enumC2114c7);
            sparseArray.put(7, enumC2114c8);
            sparseArray.put(8, enumC2114c9);
            sparseArray.put(9, enumC2114c10);
            sparseArray.put(10, enumC2114c11);
            sparseArray.put(11, enumC2114c12);
            sparseArray.put(12, enumC2114c13);
            sparseArray.put(13, enumC2114c14);
            sparseArray.put(14, enumC2114c15);
            sparseArray.put(15, enumC2114c16);
            sparseArray.put(16, enumC2114c17);
            sparseArray.put(17, enumC2114c18);
            sparseArray.put(-1, enumC2114c19);
        }

        EnumC2114c(int i) {
            this.f17724p = i;
        }

        /* renamed from: a */
        public static EnumC2114c m16611a(int i) {
            return f17712J.get(i);
        }

        /* renamed from: b */
        public int m16610b() {
            return this.f17724p;
        }
    }

    /* renamed from: a */
    public static AbstractC2112a m16619a() {
        return new C1923k9.C1925b();
    }

    /* renamed from: b */
    public abstract EnumC2113b mo16618b();

    /* renamed from: c */
    public abstract EnumC2114c mo16617c();
}
