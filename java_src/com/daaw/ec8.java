package com.daaw;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.daaw.y71;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzq;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes2.dex */
public final class ec8 extends pa8 {
    public ec8(yb8 yb8Var) {
        super(yb8Var);
    }

    /* renamed from: C */
    public static xd8 m23601C(xd8 xd8Var, byte[] bArr) {
        l88 m17099a = l88.m17099a();
        return m17099a != null ? xd8Var.mo5199g(bArr, m17099a) : xd8Var.mo5198h(bArr);
    }

    /* renamed from: H */
    public static List m23596H(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: L */
    public static boolean m23592L(List list, int i) {
        if (i < list.size() * 64) {
            return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    /* renamed from: N */
    public static boolean m23590N(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: P */
    public static final void m23588P(fs6 fs6Var, String str, Object obj) {
        List m22329H = fs6Var.m22329H();
        int i = 0;
        while (true) {
            if (i >= m22329H.size()) {
                i = -1;
                break;
            } else if (str.equals(((ix6) m22329H.get(i)).m19286J())) {
                break;
            } else {
                i++;
            }
        }
        fw6 m19288H = ix6.m19288H();
        m19288H.m22210B(str);
        if (obj instanceof Long) {
            m19288H.m22211A(((Long) obj).longValue());
        }
        if (i >= 0) {
            fs6Var.m22335B(i, m19288H);
        } else {
            fs6Var.m22323w(m19288H);
        }
    }

    /* renamed from: l */
    public static final boolean m23587l(zzaw zzawVar, zzq zzqVar) {
        ry0.m10830j(zzawVar);
        ry0.m10830j(zzqVar);
        return (TextUtils.isEmpty(zzqVar.f37093q) && TextUtils.isEmpty(zzqVar.f37084F)) ? false : true;
    }

    /* renamed from: m */
    public static final ix6 m23586m(it6 it6Var, String str) {
        for (ix6 ix6Var : it6Var.m19361L()) {
            if (ix6Var.m19286J().equals(str)) {
                return ix6Var;
            }
        }
        return null;
    }

    /* renamed from: n */
    public static final Object m23585n(it6 it6Var, String str) {
        ix6 m23586m = m23586m(it6Var, str);
        if (m23586m != null) {
            if (m23586m.m19269a0()) {
                return m23586m.m19285K();
            }
            if (m23586m.m19271Y()) {
                return Long.valueOf(m23586m.m19289G());
            }
            if (m23586m.m19273W()) {
                return Double.valueOf(m23586m.m19292D());
            }
            if (m23586m.m19290F() > 0) {
                List<ix6> m19284L = m23586m.m19284L();
                ArrayList arrayList = new ArrayList();
                for (ix6 ix6Var : m19284L) {
                    if (ix6Var != null) {
                        Bundle bundle = new Bundle();
                        for (ix6 ix6Var2 : ix6Var.m19284L()) {
                            if (ix6Var2.m19269a0()) {
                                bundle.putString(ix6Var2.m19286J(), ix6Var2.m19285K());
                            } else if (ix6Var2.m19271Y()) {
                                bundle.putLong(ix6Var2.m19286J(), ix6Var2.m19289G());
                            } else if (ix6Var2.m19273W()) {
                                bundle.putDouble(ix6Var2.m19286J(), ix6Var2.m19292D());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    /* renamed from: q */
    public static final void m23582q(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: s */
    public static final String m23581s(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: t */
    public static final void m23580t(StringBuilder sb, int i, String str, ka7 ka7Var) {
        if (ka7Var == null) {
            return;
        }
        m23582q(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (ka7Var.m17875E() != 0) {
            m23582q(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l : ka7Var.m17866N()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (ka7Var.m17873G() != 0) {
            m23582q(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l2 : ka7Var.m17864P()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (ka7Var.m17876D() != 0) {
            m23582q(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (er6 er6Var : ka7Var.m17867M()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(er6Var.m23235K() ? Integer.valueOf(er6Var.m23242D()) : null);
                sb.append(":");
                sb.append(er6Var.m23236J() ? Long.valueOf(er6Var.m23241E()) : null);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (ka7Var.m17874F() != 0) {
            m23582q(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (qc7 qc7Var : ka7Var.m17865O()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(qc7Var.m12614L() ? Integer.valueOf(qc7Var.m12621E()) : null);
                sb.append(": [");
                int i10 = 0;
                for (Long l3 : qc7Var.m12617I()) {
                    long longValue = l3.longValue();
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i10 = i11;
                }
                sb.append("]");
                i8 = i9;
            }
            sb.append("}\n");
        }
        m23582q(sb, 3);
        sb.append("}\n");
    }

    /* renamed from: u */
    public static final void m23579u(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m23582q(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    /* renamed from: v */
    public static final void m23578v(StringBuilder sb, int i, String str, tx5 tx5Var) {
        if (tx5Var == null) {
            return;
        }
        m23582q(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (tx5Var.m8714J()) {
            int m8709O = tx5Var.m8709O();
            m23579u(sb, i, "comparison_type", m8709O != 1 ? m8709O != 2 ? m8709O != 3 ? m8709O != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (tx5Var.m8712L()) {
            m23579u(sb, i, "match_as_float", Boolean.valueOf(tx5Var.m8715I()));
        }
        if (tx5Var.m8713K()) {
            m23579u(sb, i, "comparison_value", tx5Var.m8718F());
        }
        if (tx5Var.m8710N()) {
            m23579u(sb, i, "min_comparison_value", tx5Var.m8716H());
        }
        if (tx5Var.m8711M()) {
            m23579u(sb, i, "max_comparison_value", tx5Var.m8717G());
        }
        m23582q(sb, i);
        sb.append("}\n");
    }

    /* renamed from: w */
    public static int m23577w(g37 g37Var, String str) {
        for (int i = 0; i < g37Var.m21998n0(); i++) {
            if (str.equals(g37Var.m22004h0(i).m6123I())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: A */
    public final zzaw m23603A(s32 s32Var) {
        Object obj;
        Bundle m23575y = m23575y(s32Var.m10737e(), true);
        String obj2 = (!m23575y.containsKey("_o") || (obj = m23575y.get("_o")) == null) ? "app" : obj.toString();
        String m24377b = dh7.m24377b(s32Var.m10738d());
        if (m24377b == null) {
            m24377b = s32Var.m10738d();
        }
        return new zzaw(m24377b, new zzau(m23575y), obj2, s32Var.m10741a());
    }

    /* renamed from: B */
    public final it6 m23602B(on2 on2Var) {
        fs6 m19365H = it6.m19365H();
        m19365H.m22333D(on2Var.f21682e);
        xp2 xp2Var = new xp2(on2Var.f21683f);
        while (xp2Var.hasNext()) {
            String next = xp2Var.next();
            fw6 m19288H = ix6.m19288H();
            m19288H.m22210B(next);
            Object m1075u = on2Var.f21683f.m1075u(next);
            ry0.m10830j(m1075u);
            m23594J(m19288H, m1075u);
            m19365H.m22323w(m19288H);
        }
        return (it6) m19365H.m3975m();
    }

    /* renamed from: D */
    public final String m23600D(e27 e27Var) {
        if (e27Var == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (j47 j47Var : e27Var.m23786G()) {
            if (j47Var != null) {
                m23582q(sb, 1);
                sb.append("bundle {\n");
                if (j47Var.m18981q1()) {
                    m23579u(sb, 1, "protocol_version", Integer.valueOf(j47Var.m18963z1()));
                }
                zm8.m2111b();
                if (this.f25143a.m24020z().m12677B(null, m75.f18546n0) && this.f25143a.m24020z().m12677B(j47Var.m19031S1(), m75.f18550p0) && j47Var.m18975t1()) {
                    m23579u(sb, 1, "session_stitching_token", j47Var.m19048N());
                }
                m23579u(sb, 1, "platform", j47Var.m19054L());
                if (j47Var.m18989m1()) {
                    m23579u(sb, 1, "gmp_version", Long.valueOf(j47Var.m19064H1()));
                }
                if (j47Var.m18967x1()) {
                    m23579u(sb, 1, "uploading_gmp_version", Long.valueOf(j47Var.m19049M1()));
                }
                if (j47Var.m18993k1()) {
                    m23579u(sb, 1, "dynamite_version", Long.valueOf(j47Var.m19070F1()));
                }
                if (j47Var.m18999h1()) {
                    m23579u(sb, 1, "config_version", Long.valueOf(j47Var.m19076D1()));
                }
                m23579u(sb, 1, "gmp_app_id", j47Var.m19063I());
                m23579u(sb, 1, "admob_app_id", j47Var.m19034R1());
                m23579u(sb, 1, "app_id", j47Var.m19031S1());
                m23579u(sb, 1, "app_version", j47Var.m19078D());
                if (j47Var.m19080C0()) {
                    m23579u(sb, 1, "app_version_major", Integer.valueOf(j47Var.m19008d0()));
                }
                m23579u(sb, 1, "firebase_instance_id", j47Var.m19066H());
                if (j47Var.m18995j1()) {
                    m23579u(sb, 1, "dev_cert_hash", Long.valueOf(j47Var.m19073E1()));
                }
                m23579u(sb, 1, "app_store", j47Var.m19025U1());
                if (j47Var.m18969w1()) {
                    m23579u(sb, 1, "upload_timestamp_millis", Long.valueOf(j47Var.m19052L1()));
                }
                if (j47Var.m18973u1()) {
                    m23579u(sb, 1, "start_timestamp_millis", Long.valueOf(j47Var.m19055K1()));
                }
                if (j47Var.m18991l1()) {
                    m23579u(sb, 1, "end_timestamp_millis", Long.valueOf(j47Var.m19067G1()));
                }
                if (j47Var.m18983p1()) {
                    m23579u(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(j47Var.m19058J1()));
                }
                if (j47Var.m18985o1()) {
                    m23579u(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(j47Var.m19061I1()));
                }
                m23579u(sb, 1, "app_instance_id", j47Var.m19028T1());
                m23579u(sb, 1, "resettable_device_id", j47Var.m19051M());
                m23579u(sb, 1, "ds_id", j47Var.m19069G());
                if (j47Var.m18987n1()) {
                    m23579u(sb, 1, "limited_ad_tracking", Boolean.valueOf(j47Var.m19084A0()));
                }
                m23579u(sb, 1, "os_version", j47Var.m19057K());
                m23579u(sb, 1, "device_model", j47Var.m19072F());
                m23579u(sb, 1, "user_default_language", j47Var.m19045O());
                if (j47Var.m18971v1()) {
                    m23579u(sb, 1, "time_zone_offset_minutes", Integer.valueOf(j47Var.m19081B1()));
                }
                if (j47Var.m19077D0()) {
                    m23579u(sb, 1, "bundle_sequential_index", Integer.valueOf(j47Var.m19005e1()));
                }
                if (j47Var.m18977s1()) {
                    m23579u(sb, 1, "service_upload", Boolean.valueOf(j47Var.m19082B0()));
                }
                m23579u(sb, 1, "health_monitor", j47Var.m19060J());
                if (j47Var.m18979r1()) {
                    m23579u(sb, 1, "retry_counter", Integer.valueOf(j47Var.m19083A1()));
                }
                if (j47Var.m18997i1()) {
                    m23579u(sb, 1, "consent_signals", j47Var.m19075E());
                }
                List<we7> m19036R = j47Var.m19036R();
                if (m19036R != null) {
                    for (we7 we7Var : m19036R) {
                        if (we7Var != null) {
                            m23582q(sb, 2);
                            sb.append("user_property {\n");
                            m23579u(sb, 2, "set_timestamp_millis", we7Var.m6111U() ? Long.valueOf(we7Var.m6126F()) : null);
                            m23579u(sb, 2, "name", this.f25143a.m24055D().m5131f(we7Var.m6123I()));
                            m23579u(sb, 2, "string_value", we7Var.m6122J());
                            m23579u(sb, 2, "int_value", we7Var.m6112T() ? Long.valueOf(we7Var.m6127E()) : null);
                            m23579u(sb, 2, "double_value", we7Var.m6113S() ? Double.valueOf(we7Var.m6128D()) : null);
                            m23582q(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<xo6> m19042P = j47Var.m19042P();
                if (m19042P != null) {
                    for (xo6 xo6Var : m19042P) {
                        if (xo6Var != null) {
                            m23582q(sb, 2);
                            sb.append("audience_membership {\n");
                            if (xo6Var.m4864N()) {
                                m23579u(sb, 2, "audience_id", Integer.valueOf(xo6Var.m4874D()));
                            }
                            if (xo6Var.m4863O()) {
                                m23579u(sb, 2, "new_audience", Boolean.valueOf(xo6Var.m4865M()));
                            }
                            m23580t(sb, 2, "current_data", xo6Var.m4871G());
                            if (xo6Var.m4862P()) {
                                m23580t(sb, 2, "previous_data", xo6Var.m4870H());
                            }
                            m23582q(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<it6> m19039Q = j47Var.m19039Q();
                if (m19039Q != null) {
                    for (it6 it6Var : m19039Q) {
                        if (it6Var != null) {
                            m23582q(sb, 2);
                            sb.append("event {\n");
                            m23579u(sb, 2, "name", this.f25143a.m24055D().m5133d(it6Var.m19362K()));
                            if (it6Var.m19350W()) {
                                m23579u(sb, 2, "timestamp_millis", Long.valueOf(it6Var.m19366G()));
                            }
                            if (it6Var.m19351V()) {
                                m23579u(sb, 2, "previous_timestamp_millis", Long.valueOf(it6Var.m19367F()));
                            }
                            if (it6Var.m19352U()) {
                                m23579u(sb, 2, "count", Integer.valueOf(it6Var.m19369D()));
                            }
                            if (it6Var.m19368E() != 0) {
                                m23584o(sb, 2, it6Var.m19361L());
                            }
                            m23582q(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                m23582q(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: E */
    public final String m23599E(xp5 xp5Var) {
        if (xp5Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (xp5Var.m4838R()) {
            m23579u(sb, 0, "filter_id", Integer.valueOf(xp5Var.m4851E()));
        }
        m23579u(sb, 0, "event_name", this.f25143a.m24055D().m5133d(xp5Var.m4846J()));
        String m23581s = m23581s(xp5Var.m4842N(), xp5Var.m4841O(), xp5Var.m4840P());
        if (!m23581s.isEmpty()) {
            m23579u(sb, 0, "filter_type", m23581s);
        }
        if (xp5Var.m4839Q()) {
            m23578v(sb, 1, "event_count_filter", xp5Var.m4847I());
        }
        if (xp5Var.m4852D() > 0) {
            sb.append("  filters {\n");
            for (ds5 ds5Var : xp5Var.m4845K()) {
                m23583p(sb, 2, ds5Var);
            }
        }
        m23582q(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* renamed from: F */
    public final String m23598F(a06 a06Var) {
        if (a06Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (a06Var.m27756M()) {
            m23579u(sb, 0, "filter_id", Integer.valueOf(a06Var.m27765D()));
        }
        m23579u(sb, 0, "property_name", this.f25143a.m24055D().m5131f(a06Var.m27761H()));
        String m23581s = m23581s(a06Var.m27759J(), a06Var.m27758K(), a06Var.m27757L());
        if (!m23581s.isEmpty()) {
            m23579u(sb, 0, "filter_type", m23581s);
        }
        m23583p(sb, 1, a06Var.m27764E());
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: G */
    public final List m23597G(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f25143a.mo3895i().m14155w().m20652b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f25143a.mo3895i().m14155w().m20651c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (num.intValue() % 64)) ^ (-1))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r4 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r7 >= r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        r5.add(m23595I((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        if ((r3 instanceof java.util.ArrayList) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r7 >= r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
        r5.add(m23595I((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
        if ((r3 instanceof android.os.Bundle) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        r5.add(m23595I((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
        r0.put(r2, r5);
     */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map m23595I(Bundle bundle, boolean z) {
        HashMap hashMap = new HashMap();
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            Object obj = bundle.get(next);
            boolean z2 = obj instanceof Parcelable[];
            if (!z2 && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
                if (obj != null) {
                    hashMap.put(next, obj);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: J */
    public final void m23594J(fw6 fw6Var, Object obj) {
        Bundle[] bundleArr;
        ry0.m10830j(obj);
        fw6Var.m22202y();
        fw6Var.m22204w();
        fw6Var.m22205v();
        fw6Var.m22203x();
        if (obj instanceof String) {
            fw6Var.m22209C((String) obj);
        } else if (obj instanceof Long) {
            fw6Var.m22211A(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            fw6Var.m22201z(((Double) obj).doubleValue());
        } else if (!(obj instanceof Bundle[])) {
            this.f25143a.mo3895i().m14160q().m20652b("Ignoring invalid (type) event param value", obj);
        } else {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    fw6 m19288H = ix6.m19288H();
                    for (String str : bundle.keySet()) {
                        fw6 m19288H2 = ix6.m19288H();
                        m19288H2.m22210B(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            m19288H2.m22211A(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            m19288H2.m22209C((String) obj2);
                        } else if (obj2 instanceof Double) {
                            m19288H2.m22201z(((Double) obj2).doubleValue());
                        }
                        m19288H.m22206u(m19288H2);
                    }
                    if (m19288H.m22208s() > 0) {
                        arrayList.add((ix6) m19288H.m3975m());
                    }
                }
            }
            fw6Var.m22207t(arrayList);
        }
    }

    /* renamed from: K */
    public final void m23593K(td7 td7Var, Object obj) {
        ry0.m10830j(obj);
        td7Var.m9268u();
        td7Var.m9269t();
        td7Var.m9270s();
        if (obj instanceof String) {
            td7Var.m9263z((String) obj);
        } else if (obj instanceof Long) {
            td7Var.m9266w(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            td7Var.m9267v(((Double) obj).doubleValue());
        } else {
            this.f25143a.mo3895i().m14160q().m20652b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* renamed from: M */
    public final boolean m23591M(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(this.f25143a.mo3909b().mo15860a() - j) > j2;
    }

    /* renamed from: O */
    public final byte[] m23589O(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.f25143a.mo3895i().m14160q().m20652b("Failed to gzip content", e);
            throw e;
        }
    }

    @Override // com.daaw.pa8
    /* renamed from: k */
    public final boolean mo8149k() {
        return false;
    }

    /* renamed from: o */
    public final void m23584o(StringBuilder sb, int i, List list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ix6 ix6Var = (ix6) it.next();
            if (ix6Var != null) {
                m23582q(sb, i2);
                sb.append("param {\n");
                m23579u(sb, i2, "name", ix6Var.m19270Z() ? this.f25143a.m24055D().m5132e(ix6Var.m19286J()) : null);
                m23579u(sb, i2, "string_value", ix6Var.m19269a0() ? ix6Var.m19285K() : null);
                m23579u(sb, i2, "int_value", ix6Var.m19271Y() ? Long.valueOf(ix6Var.m19289G()) : null);
                m23579u(sb, i2, "double_value", ix6Var.m19273W() ? Double.valueOf(ix6Var.m19292D()) : null);
                if (ix6Var.m19290F() > 0) {
                    m23584o(sb, i2, ix6Var.m19284L());
                }
                m23582q(sb, i2);
                sb.append("}\n");
            }
        }
    }

    /* renamed from: p */
    public final void m23583p(StringBuilder sb, int i, ds5 ds5Var) {
        String str;
        if (ds5Var == null) {
            return;
        }
        m23582q(sb, i);
        sb.append("filter {\n");
        if (ds5Var.m23998K()) {
            m23579u(sb, i, "complement", Boolean.valueOf(ds5Var.m23999J()));
        }
        if (ds5Var.m23996M()) {
            m23579u(sb, i, "param_name", this.f25143a.m24055D().m5132e(ds5Var.m24001H()));
        }
        if (ds5Var.m23995N()) {
            int i2 = i + 1;
            q56 m24002G = ds5Var.m24002G();
            if (m24002G != null) {
                m23582q(sb, i2);
                sb.append("string_filter {\n");
                if (m24002G.m12759L()) {
                    switch (m24002G.m12758M()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    m23579u(sb, i2, "match_type", str);
                }
                if (m24002G.m12760K()) {
                    m23579u(sb, i2, "expression", m24002G.m12764G());
                }
                if (m24002G.m12761J()) {
                    m23579u(sb, i2, "case_sensitive", Boolean.valueOf(m24002G.m12762I()));
                }
                if (m24002G.m12767D() > 0) {
                    m23582q(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String str2 : m24002G.m12763H()) {
                        m23582q(sb, i2 + 2);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                m23582q(sb, i2);
                sb.append("}\n");
            }
        }
        if (ds5Var.m23997L()) {
            m23578v(sb, i + 1, "number_filter", ds5Var.m24003F());
        }
        m23582q(sb, i);
        sb.append("}\n");
    }

    /* renamed from: x */
    public final long m23576x(byte[] bArr) {
        ry0.m10830j(bArr);
        this.f25143a.m24045N().mo6991f();
        MessageDigest m24464t = dd8.m24464t();
        if (m24464t == null) {
            this.f25143a.mo3895i().m14160q().m20653a("Failed to get MD5");
            return 0L;
        }
        return dd8.m24468q0(m24464t.digest(bArr));
    }

    /* renamed from: y */
    public final Bundle m23575y(Map map, boolean z) {
        String str;
        Bundle bundle = new Bundle();
        for (String str2 : map.keySet()) {
            Object obj = map.get(str2);
            if (obj == null) {
                str = null;
            } else if (obj instanceof Long) {
                bundle.putLong(str2, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str2, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                str = obj.toString();
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(m23575y((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str2, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
            bundle.putString(str2, str);
        }
        return bundle;
    }

    /* renamed from: z */
    public final Parcelable m23574z(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (y71.C3677a unused) {
            this.f25143a.mo3895i().m14160q().m20653a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }
}
