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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes2.dex */
public final class ec8 extends pa8 {
    public ec8(yb8 yb8Var) {
        super(yb8Var);
    }

    public static xd8 C(xd8 xd8Var, byte[] bArr) {
        l88 a = l88.a();
        return a != null ? xd8Var.g(bArr, a) : xd8Var.h(bArr);
    }

    public static List H(BitSet bitSet) {
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

    public static boolean L(List list, int i) {
        if (i < list.size() * 64) {
            return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static boolean N(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static final void P(fs6 fs6Var, String str, Object obj) {
        List H = fs6Var.H();
        int i = 0;
        while (true) {
            if (i >= H.size()) {
                i = -1;
                break;
            } else if (str.equals(((ix6) H.get(i)).J())) {
                break;
            } else {
                i++;
            }
        }
        fw6 H2 = ix6.H();
        H2.B(str);
        if (obj instanceof Long) {
            H2.A(((Long) obj).longValue());
        }
        if (i >= 0) {
            fs6Var.B(i, H2);
        } else {
            fs6Var.w(H2);
        }
    }

    public static final boolean l(zzaw zzawVar, zzq zzqVar) {
        ry0.j(zzawVar);
        ry0.j(zzqVar);
        return (TextUtils.isEmpty(zzqVar.q) && TextUtils.isEmpty(zzqVar.F)) ? false : true;
    }

    public static final ix6 m(it6 it6Var, String str) {
        for (ix6 ix6Var : it6Var.L()) {
            if (ix6Var.J().equals(str)) {
                return ix6Var;
            }
        }
        return null;
    }

    public static final Object n(it6 it6Var, String str) {
        ix6 m = m(it6Var, str);
        if (m != null) {
            if (m.a0()) {
                return m.K();
            }
            if (m.Y()) {
                return Long.valueOf(m.G());
            }
            if (m.W()) {
                return Double.valueOf(m.D());
            }
            if (m.F() > 0) {
                List<ix6> L = m.L();
                ArrayList arrayList = new ArrayList();
                for (ix6 ix6Var : L) {
                    if (ix6Var != null) {
                        Bundle bundle = new Bundle();
                        for (ix6 ix6Var2 : ix6Var.L()) {
                            if (ix6Var2.a0()) {
                                bundle.putString(ix6Var2.J(), ix6Var2.K());
                            } else if (ix6Var2.Y()) {
                                bundle.putLong(ix6Var2.J(), ix6Var2.G());
                            } else if (ix6Var2.W()) {
                                bundle.putDouble(ix6Var2.J(), ix6Var2.D());
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

    public static final void q(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static final String s(boolean z, boolean z2, boolean z3) {
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

    public static final void t(StringBuilder sb, int i, String str, ka7 ka7Var) {
        if (ka7Var == null) {
            return;
        }
        q(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (ka7Var.E() != 0) {
            q(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l : ka7Var.N()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (ka7Var.G() != 0) {
            q(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l2 : ka7Var.P()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (ka7Var.D() != 0) {
            q(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (er6 er6Var : ka7Var.M()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(er6Var.K() ? Integer.valueOf(er6Var.D()) : null);
                sb.append(":");
                sb.append(er6Var.J() ? Long.valueOf(er6Var.E()) : null);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (ka7Var.F() != 0) {
            q(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (qc7 qc7Var : ka7Var.O()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(qc7Var.L() ? Integer.valueOf(qc7Var.E()) : null);
                sb.append(": [");
                int i10 = 0;
                for (Long l3 : qc7Var.I()) {
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
        q(sb, 3);
        sb.append("}\n");
    }

    public static final void u(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        q(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void v(StringBuilder sb, int i, String str, tx5 tx5Var) {
        if (tx5Var == null) {
            return;
        }
        q(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (tx5Var.J()) {
            int O = tx5Var.O();
            u(sb, i, "comparison_type", O != 1 ? O != 2 ? O != 3 ? O != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (tx5Var.L()) {
            u(sb, i, "match_as_float", Boolean.valueOf(tx5Var.I()));
        }
        if (tx5Var.K()) {
            u(sb, i, "comparison_value", tx5Var.F());
        }
        if (tx5Var.N()) {
            u(sb, i, "min_comparison_value", tx5Var.H());
        }
        if (tx5Var.M()) {
            u(sb, i, "max_comparison_value", tx5Var.G());
        }
        q(sb, i);
        sb.append("}\n");
    }

    public static int w(g37 g37Var, String str) {
        for (int i = 0; i < g37Var.n0(); i++) {
            if (str.equals(g37Var.h0(i).I())) {
                return i;
            }
        }
        return -1;
    }

    public final zzaw A(s32 s32Var) {
        Object obj;
        Bundle y = y(s32Var.e(), true);
        String obj2 = (!y.containsKey("_o") || (obj = y.get("_o")) == null) ? "app" : obj.toString();
        String b = dh7.b(s32Var.d());
        if (b == null) {
            b = s32Var.d();
        }
        return new zzaw(b, new zzau(y), obj2, s32Var.a());
    }

    public final it6 B(on2 on2Var) {
        fs6 H = it6.H();
        H.D(on2Var.e);
        xp2 xp2Var = new xp2(on2Var.f);
        while (xp2Var.hasNext()) {
            String next = xp2Var.next();
            fw6 H2 = ix6.H();
            H2.B(next);
            Object u = on2Var.f.u(next);
            ry0.j(u);
            J(H2, u);
            H.w(H2);
        }
        return (it6) H.m();
    }

    public final String D(e27 e27Var) {
        if (e27Var == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (j47 j47Var : e27Var.G()) {
            if (j47Var != null) {
                q(sb, 1);
                sb.append("bundle {\n");
                if (j47Var.q1()) {
                    u(sb, 1, "protocol_version", Integer.valueOf(j47Var.z1()));
                }
                zm8.b();
                if (this.a.z().B(null, m75.n0) && this.a.z().B(j47Var.S1(), m75.p0) && j47Var.t1()) {
                    u(sb, 1, "session_stitching_token", j47Var.N());
                }
                u(sb, 1, "platform", j47Var.L());
                if (j47Var.m1()) {
                    u(sb, 1, "gmp_version", Long.valueOf(j47Var.H1()));
                }
                if (j47Var.x1()) {
                    u(sb, 1, "uploading_gmp_version", Long.valueOf(j47Var.M1()));
                }
                if (j47Var.k1()) {
                    u(sb, 1, "dynamite_version", Long.valueOf(j47Var.F1()));
                }
                if (j47Var.h1()) {
                    u(sb, 1, "config_version", Long.valueOf(j47Var.D1()));
                }
                u(sb, 1, "gmp_app_id", j47Var.I());
                u(sb, 1, "admob_app_id", j47Var.R1());
                u(sb, 1, "app_id", j47Var.S1());
                u(sb, 1, "app_version", j47Var.D());
                if (j47Var.C0()) {
                    u(sb, 1, "app_version_major", Integer.valueOf(j47Var.d0()));
                }
                u(sb, 1, "firebase_instance_id", j47Var.H());
                if (j47Var.j1()) {
                    u(sb, 1, "dev_cert_hash", Long.valueOf(j47Var.E1()));
                }
                u(sb, 1, "app_store", j47Var.U1());
                if (j47Var.w1()) {
                    u(sb, 1, "upload_timestamp_millis", Long.valueOf(j47Var.L1()));
                }
                if (j47Var.u1()) {
                    u(sb, 1, "start_timestamp_millis", Long.valueOf(j47Var.K1()));
                }
                if (j47Var.l1()) {
                    u(sb, 1, "end_timestamp_millis", Long.valueOf(j47Var.G1()));
                }
                if (j47Var.p1()) {
                    u(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(j47Var.J1()));
                }
                if (j47Var.o1()) {
                    u(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(j47Var.I1()));
                }
                u(sb, 1, "app_instance_id", j47Var.T1());
                u(sb, 1, "resettable_device_id", j47Var.M());
                u(sb, 1, "ds_id", j47Var.G());
                if (j47Var.n1()) {
                    u(sb, 1, "limited_ad_tracking", Boolean.valueOf(j47Var.A0()));
                }
                u(sb, 1, "os_version", j47Var.K());
                u(sb, 1, "device_model", j47Var.F());
                u(sb, 1, "user_default_language", j47Var.O());
                if (j47Var.v1()) {
                    u(sb, 1, "time_zone_offset_minutes", Integer.valueOf(j47Var.B1()));
                }
                if (j47Var.D0()) {
                    u(sb, 1, "bundle_sequential_index", Integer.valueOf(j47Var.e1()));
                }
                if (j47Var.s1()) {
                    u(sb, 1, "service_upload", Boolean.valueOf(j47Var.B0()));
                }
                u(sb, 1, "health_monitor", j47Var.J());
                if (j47Var.r1()) {
                    u(sb, 1, "retry_counter", Integer.valueOf(j47Var.A1()));
                }
                if (j47Var.i1()) {
                    u(sb, 1, "consent_signals", j47Var.E());
                }
                List<we7> R = j47Var.R();
                if (R != null) {
                    for (we7 we7Var : R) {
                        if (we7Var != null) {
                            q(sb, 2);
                            sb.append("user_property {\n");
                            u(sb, 2, "set_timestamp_millis", we7Var.U() ? Long.valueOf(we7Var.F()) : null);
                            u(sb, 2, "name", this.a.D().f(we7Var.I()));
                            u(sb, 2, "string_value", we7Var.J());
                            u(sb, 2, "int_value", we7Var.T() ? Long.valueOf(we7Var.E()) : null);
                            u(sb, 2, "double_value", we7Var.S() ? Double.valueOf(we7Var.D()) : null);
                            q(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<xo6> P = j47Var.P();
                if (P != null) {
                    for (xo6 xo6Var : P) {
                        if (xo6Var != null) {
                            q(sb, 2);
                            sb.append("audience_membership {\n");
                            if (xo6Var.N()) {
                                u(sb, 2, "audience_id", Integer.valueOf(xo6Var.D()));
                            }
                            if (xo6Var.O()) {
                                u(sb, 2, "new_audience", Boolean.valueOf(xo6Var.M()));
                            }
                            t(sb, 2, "current_data", xo6Var.G());
                            if (xo6Var.P()) {
                                t(sb, 2, "previous_data", xo6Var.H());
                            }
                            q(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<it6> Q = j47Var.Q();
                if (Q != null) {
                    for (it6 it6Var : Q) {
                        if (it6Var != null) {
                            q(sb, 2);
                            sb.append("event {\n");
                            u(sb, 2, "name", this.a.D().d(it6Var.K()));
                            if (it6Var.W()) {
                                u(sb, 2, "timestamp_millis", Long.valueOf(it6Var.G()));
                            }
                            if (it6Var.V()) {
                                u(sb, 2, "previous_timestamp_millis", Long.valueOf(it6Var.F()));
                            }
                            if (it6Var.U()) {
                                u(sb, 2, "count", Integer.valueOf(it6Var.D()));
                            }
                            if (it6Var.E() != 0) {
                                o(sb, 2, it6Var.L());
                            }
                            q(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                q(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    public final String E(xp5 xp5Var) {
        if (xp5Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (xp5Var.R()) {
            u(sb, 0, "filter_id", Integer.valueOf(xp5Var.E()));
        }
        u(sb, 0, "event_name", this.a.D().d(xp5Var.J()));
        String s = s(xp5Var.N(), xp5Var.O(), xp5Var.P());
        if (!s.isEmpty()) {
            u(sb, 0, "filter_type", s);
        }
        if (xp5Var.Q()) {
            v(sb, 1, "event_count_filter", xp5Var.I());
        }
        if (xp5Var.D() > 0) {
            sb.append("  filters {\n");
            for (ds5 ds5Var : xp5Var.K()) {
                p(sb, 2, ds5Var);
            }
        }
        q(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    public final String F(a06 a06Var) {
        if (a06Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (a06Var.M()) {
            u(sb, 0, "filter_id", Integer.valueOf(a06Var.D()));
        }
        u(sb, 0, "property_name", this.a.D().f(a06Var.H()));
        String s = s(a06Var.J(), a06Var.K(), a06Var.L());
        if (!s.isEmpty()) {
            u(sb, 0, "filter_type", s);
        }
        p(sb, 1, a06Var.E());
        sb.append("}\n");
        return sb.toString();
    }

    public final List G(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.a.i().w().b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.a.i().w().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
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
        r5.add(I((android.os.Bundle) r8, false));
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
        r5.add(I((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
        if ((r3 instanceof android.os.Bundle) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        r5.add(I((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
        r0.put(r2, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map I(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r12 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = 0
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.I(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = 0
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.I(r8, r6)
            r5.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.I(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ec8.I(android.os.Bundle, boolean):java.util.Map");
    }

    public final void J(fw6 fw6Var, Object obj) {
        Bundle[] bundleArr;
        ry0.j(obj);
        fw6Var.y();
        fw6Var.w();
        fw6Var.v();
        fw6Var.x();
        if (obj instanceof String) {
            fw6Var.C((String) obj);
        } else if (obj instanceof Long) {
            fw6Var.A(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            fw6Var.z(((Double) obj).doubleValue());
        } else if (!(obj instanceof Bundle[])) {
            this.a.i().q().b("Ignoring invalid (type) event param value", obj);
        } else {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    fw6 H = ix6.H();
                    for (String str : bundle.keySet()) {
                        fw6 H2 = ix6.H();
                        H2.B(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            H2.A(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            H2.C((String) obj2);
                        } else if (obj2 instanceof Double) {
                            H2.z(((Double) obj2).doubleValue());
                        }
                        H.u(H2);
                    }
                    if (H.s() > 0) {
                        arrayList.add((ix6) H.m());
                    }
                }
            }
            fw6Var.t(arrayList);
        }
    }

    public final void K(td7 td7Var, Object obj) {
        ry0.j(obj);
        td7Var.u();
        td7Var.t();
        td7Var.s();
        if (obj instanceof String) {
            td7Var.z((String) obj);
        } else if (obj instanceof Long) {
            td7Var.w(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            td7Var.v(((Double) obj).doubleValue());
        } else {
            this.a.i().q().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final boolean M(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(this.a.b().a() - j) > j2;
    }

    public final byte[] O(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.a.i().q().b("Failed to gzip content", e);
            throw e;
        }
    }

    @Override // com.daaw.pa8
    public final boolean k() {
        return false;
    }

    public final void o(StringBuilder sb, int i, List list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ix6 ix6Var = (ix6) it.next();
            if (ix6Var != null) {
                q(sb, i2);
                sb.append("param {\n");
                u(sb, i2, "name", ix6Var.Z() ? this.a.D().e(ix6Var.J()) : null);
                u(sb, i2, "string_value", ix6Var.a0() ? ix6Var.K() : null);
                u(sb, i2, "int_value", ix6Var.Y() ? Long.valueOf(ix6Var.G()) : null);
                u(sb, i2, "double_value", ix6Var.W() ? Double.valueOf(ix6Var.D()) : null);
                if (ix6Var.F() > 0) {
                    o(sb, i2, ix6Var.L());
                }
                q(sb, i2);
                sb.append("}\n");
            }
        }
    }

    public final void p(StringBuilder sb, int i, ds5 ds5Var) {
        String str;
        if (ds5Var == null) {
            return;
        }
        q(sb, i);
        sb.append("filter {\n");
        if (ds5Var.K()) {
            u(sb, i, "complement", Boolean.valueOf(ds5Var.J()));
        }
        if (ds5Var.M()) {
            u(sb, i, "param_name", this.a.D().e(ds5Var.H()));
        }
        if (ds5Var.N()) {
            int i2 = i + 1;
            q56 G = ds5Var.G();
            if (G != null) {
                q(sb, i2);
                sb.append("string_filter {\n");
                if (G.L()) {
                    switch (G.M()) {
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
                    u(sb, i2, "match_type", str);
                }
                if (G.K()) {
                    u(sb, i2, "expression", G.G());
                }
                if (G.J()) {
                    u(sb, i2, "case_sensitive", Boolean.valueOf(G.I()));
                }
                if (G.D() > 0) {
                    q(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String str2 : G.H()) {
                        q(sb, i2 + 2);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                q(sb, i2);
                sb.append("}\n");
            }
        }
        if (ds5Var.L()) {
            v(sb, i + 1, "number_filter", ds5Var.F());
        }
        q(sb, i);
        sb.append("}\n");
    }

    public final long x(byte[] bArr) {
        ry0.j(bArr);
        this.a.N().f();
        MessageDigest t = dd8.t();
        if (t == null) {
            this.a.i().q().a("Failed to get MD5");
            return 0L;
        }
        return dd8.q0(t.digest(bArr));
    }

    public final Bundle y(Map map, boolean z) {
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
                    arrayList2.add(y((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str2, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
            bundle.putString(str2, str);
        }
        return bundle;
    }

    public final Parcelable z(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (y71.a unused) {
            this.a.i().q().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }
}
