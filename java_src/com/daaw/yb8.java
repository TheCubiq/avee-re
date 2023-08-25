package com.daaw;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
import com.google.android.gms.measurement.internal.zzq;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.GZIPInputStream;
import org.conscrypt.NativeConstants;
/* loaded from: classes2.dex */
public final class yb8 implements xe7 {

    /* renamed from: F */
    public static volatile yb8 f33484F;

    /* renamed from: A */
    public final Map f33485A;

    /* renamed from: B */
    public final Map f33486B;

    /* renamed from: C */
    public t38 f33487C;

    /* renamed from: D */
    public String f33488D;

    /* renamed from: a */
    public final gh6 f33490a;

    /* renamed from: b */
    public final ht5 f33491b;

    /* renamed from: c */
    public uh2 f33492c;

    /* renamed from: d */
    public nv5 f33493d;

    /* renamed from: e */
    public ka8 f33494e;

    /* renamed from: f */
    public u32 f33495f;

    /* renamed from: g */
    public final ec8 f33496g;

    /* renamed from: h */
    public n38 f33497h;

    /* renamed from: i */
    public d88 f33498i;

    /* renamed from: j */
    public final sa8 f33499j;

    /* renamed from: k */
    public u66 f33500k;

    /* renamed from: l */
    public final dr6 f33501l;

    /* renamed from: n */
    public boolean f33503n;

    /* renamed from: o */
    public long f33504o;

    /* renamed from: p */
    public List f33505p;

    /* renamed from: q */
    public int f33506q;

    /* renamed from: r */
    public int f33507r;

    /* renamed from: s */
    public boolean f33508s;

    /* renamed from: t */
    public boolean f33509t;

    /* renamed from: u */
    public boolean f33510u;

    /* renamed from: v */
    public FileLock f33511v;

    /* renamed from: w */
    public FileChannel f33512w;

    /* renamed from: x */
    public List f33513x;

    /* renamed from: y */
    public List f33514y;

    /* renamed from: z */
    public long f33515z;

    /* renamed from: m */
    public boolean f33502m = false;

    /* renamed from: E */
    public final ad8 f33489E = new kb8(this);

    public yb8(bc8 bc8Var, dr6 dr6Var) {
        ry0.m10830j(bc8Var);
        this.f33501l = dr6.m24051H(bc8Var.f4708a, null, null);
        this.f33515z = -1L;
        this.f33499j = new sa8(this);
        ec8 ec8Var = new ec8(this);
        ec8Var.m13532h();
        this.f33496g = ec8Var;
        ht5 ht5Var = new ht5(this);
        ht5Var.m13532h();
        this.f33491b = ht5Var;
        gh6 gh6Var = new gh6(this);
        gh6Var.m13532h();
        this.f33490a = gh6Var;
        this.f33485A = new HashMap();
        this.f33486B = new HashMap();
        mo3882r().m6978z(new va8(this, bc8Var));
    }

    /* renamed from: G */
    public static final void m3931G(fs6 fs6Var, int i, String str) {
        List m22329H = fs6Var.m22329H();
        for (int i2 = 0; i2 < m22329H.size(); i2++) {
            if ("_err".equals(((ix6) m22329H.get(i2)).m19286J())) {
                return;
            }
        }
        fw6 m19288H = ix6.m19288H();
        m19288H.m22210B("_err");
        m19288H.m22211A(Long.valueOf(i).longValue());
        fw6 m19288H2 = ix6.m19288H();
        m19288H2.m22210B("_ev");
        m19288H2.m22209C(str);
        fs6Var.m22322x((ix6) m19288H.m3975m());
        fs6Var.m22322x((ix6) m19288H2.m3975m());
    }

    /* renamed from: H */
    public static final void m3930H(fs6 fs6Var, String str) {
        List m22329H = fs6Var.m22329H();
        for (int i = 0; i < m22329H.size(); i++) {
            if (str.equals(((ix6) m22329H.get(i)).m19286J())) {
                fs6Var.m22320z(i);
                return;
            }
        }
    }

    /* renamed from: Q */
    public static final boolean m3921Q(zzq zzqVar) {
        return (TextUtils.isEmpty(zzqVar.f37093q) && TextUtils.isEmpty(zzqVar.f37084F)) ? false : true;
    }

    /* renamed from: R */
    public static final pa8 m3920R(pa8 pa8Var) {
        if (pa8Var != null) {
            if (pa8Var.m13531j()) {
                return pa8Var;
            }
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(pa8Var.getClass())));
        }
        throw new IllegalStateException("Upload Component not created");
    }

    /* renamed from: f0 */
    public static yb8 m3900f0(Context context) {
        ry0.m10830j(context);
        ry0.m10830j(context.getApplicationContext());
        if (f33484F == null) {
            synchronized (yb8.class) {
                if (f33484F == null) {
                    f33484F = new yb8((bc8) ry0.m10830j(new bc8(context)), null);
                }
            }
        }
        return f33484F;
    }

    /* renamed from: k0 */
    public static /* bridge */ /* synthetic */ void m3890k0(yb8 yb8Var, bc8 bc8Var) {
        yb8Var.mo3882r().mo6991f();
        yb8Var.f33500k = new u66(yb8Var);
        uh2 uh2Var = new uh2(yb8Var);
        uh2Var.m13532h();
        yb8Var.f33492c = uh2Var;
        yb8Var.m3917U().m12652z((i92) ry0.m10830j(yb8Var.f33490a));
        d88 d88Var = new d88(yb8Var);
        d88Var.m13532h();
        yb8Var.f33498i = d88Var;
        u32 u32Var = new u32(yb8Var);
        u32Var.m13532h();
        yb8Var.f33495f = u32Var;
        n38 n38Var = new n38(yb8Var);
        n38Var.m13532h();
        yb8Var.f33497h = n38Var;
        ka8 ka8Var = new ka8(yb8Var);
        ka8Var.m13532h();
        yb8Var.f33494e = ka8Var;
        yb8Var.f33493d = new nv5(yb8Var);
        if (yb8Var.f33506q != yb8Var.f33507r) {
            yb8Var.mo3895i().m14160q().m20651c("Not all upload components initialized", Integer.valueOf(yb8Var.f33506q), Integer.valueOf(yb8Var.f33507r));
        }
        yb8Var.f33502m = true;
    }

    /* renamed from: A */
    public final void m3937A(String str, cd2 cd2Var) {
        mo3882r().mo6991f();
        m3903e();
        this.f33485A.put(str, cd2Var);
        uh2 uh2Var = this.f33492c;
        m3920R(uh2Var);
        ry0.m10830j(str);
        ry0.m10830j(cd2Var);
        uh2Var.mo6991f();
        uh2Var.m13533g();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", cd2Var.m25424h());
        try {
            if (uh2Var.m8168P().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                uh2Var.f25143a.mo3895i().m14160q().m20652b("Failed to insert/update consent setting (got -1). appId", om5.m14152z(str));
            }
        } catch (SQLiteException e) {
            uh2Var.f25143a.mo3895i().m14160q().m20651c("Error storing consent setting. appId, error", om5.m14152z(str), e);
        }
    }

    /* renamed from: B */
    public final void m3936B(zzkw zzkwVar, zzq zzqVar) {
        long j;
        mo3882r().mo6991f();
        m3903e();
        if (m3921Q(zzqVar)) {
            if (!zzqVar.f37099w) {
                m3919S(zzqVar);
                return;
            }
            int m24474n0 = m3896h0().m24474n0(zzkwVar.f37073q);
            if (m24474n0 != 0) {
                dd8 m3896h0 = m3896h0();
                String str = zzkwVar.f37073q;
                m3917U();
                String m24469q = m3896h0.m24469q(str, 24, true);
                String str2 = zzkwVar.f37073q;
                m3896h0().m24513B(this.f33489E, zzqVar.f37092p, m24474n0, "_ev", m24469q, str2 != null ? str2.length() : 0);
                return;
            }
            int m24479j0 = m3896h0().m24479j0(zzkwVar.f37073q, zzkwVar.m1073h());
            if (m24479j0 != 0) {
                dd8 m3896h02 = m3896h0();
                String str3 = zzkwVar.f37073q;
                m3917U();
                String m24469q2 = m3896h02.m24469q(str3, 24, true);
                Object m1073h = zzkwVar.m1073h();
                m3896h0().m24513B(this.f33489E, zzqVar.f37092p, m24479j0, "_ev", m24469q2, (m1073h == null || !((m1073h instanceof String) || (m1073h instanceof CharSequence))) ? 0 : m1073h.toString().length());
                return;
            }
            Object m24473o = m3896h0().m24473o(zzkwVar.f37073q, zzkwVar.m1073h());
            if (m24473o == null) {
                return;
            }
            if ("_sid".equals(zzkwVar.f37073q)) {
                long j2 = zzkwVar.f37074r;
                String str4 = zzkwVar.f37077u;
                String str5 = (String) ry0.m10830j(zzqVar.f37092p);
                uh2 uh2Var = this.f33492c;
                m3920R(uh2Var);
                mc8 m8160X = uh2Var.m8160X(str5, "_sno");
                if (m8160X != null) {
                    Object obj = m8160X.f18798e;
                    if (obj instanceof Long) {
                        j = ((Long) obj).longValue();
                        m3936B(new zzkw("_sno", j2, Long.valueOf(j + 1), str4), zzqVar);
                    }
                }
                if (m8160X != null) {
                    mo3895i().m14155w().m20652b("Retrieved last session number from database does not contain a valid (long) value", m8160X.f18798e);
                }
                uh2 uh2Var2 = this.f33492c;
                m3920R(uh2Var2);
                to2 m8162V = uh2Var2.m8162V(str5, "_s");
                if (m8162V != null) {
                    j = m8162V.f27918c;
                    mo3895i().m14156v().m20652b("Backfill the session number. Last used session number", Long.valueOf(j));
                } else {
                    j = 0;
                }
                m3936B(new zzkw("_sno", j2, Long.valueOf(j + 1), str4), zzqVar);
            }
            mc8 mc8Var = new mc8((String) ry0.m10830j(zzqVar.f37092p), (String) ry0.m10830j(zzkwVar.f37077u), zzkwVar.f37073q, zzkwVar.f37074r, m24473o);
            mo3895i().m14156v().m20651c("Setting user property", this.f33501l.m24055D().m5131f(mc8Var.f18796c), m24473o);
            uh2 uh2Var3 = this.f33492c;
            m3920R(uh2Var3);
            uh2Var3.m8153e0();
            try {
                if ("_id".equals(mc8Var.f18796c)) {
                    uh2 uh2Var4 = this.f33492c;
                    m3920R(uh2Var4);
                    mc8 m8160X2 = uh2Var4.m8160X(zzqVar.f37092p, "_id");
                    if (m8160X2 != null && !mc8Var.f18798e.equals(m8160X2.f18798e)) {
                        uh2 uh2Var5 = this.f33492c;
                        m3920R(uh2Var5);
                        uh2Var5.m8148l(zzqVar.f37092p, "_lair");
                    }
                }
                m3919S(zzqVar);
                uh2 uh2Var6 = this.f33492c;
                m3920R(uh2Var6);
                boolean m8137x = uh2Var6.m8137x(mc8Var);
                uh2 uh2Var7 = this.f33492c;
                m3920R(uh2Var7);
                uh2Var7.m8146n();
                if (!m8137x) {
                    mo3895i().m14160q().m20651c("Too many unique user properties are set. Ignoring user property", this.f33501l.m24055D().m5131f(mc8Var.f18796c), mc8Var.f18798e);
                    m3896h0().m24513B(this.f33489E, zzqVar.f37092p, 9, null, null, 0);
                }
            } finally {
                uh2 uh2Var8 = this.f33492c;
                m3920R(uh2Var8);
                uh2Var8.m8152f0();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:219:0x0548, code lost:
        if (r11 == null) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0115, code lost:
        if (r11 == null) goto L43;
     */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0566: MOVE  (r9 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:229:0x0566 */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028a A[Catch: all -> 0x056d, TryCatch #11 {all -> 0x056d, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:10:0x0034, B:12:0x003a, B:13:0x0045, B:15:0x004d, B:16:0x0051, B:18:0x005c, B:19:0x0067, B:21:0x0072, B:22:0x0080, B:24:0x009f, B:26:0x00a5, B:27:0x00a8, B:29:0x00b4, B:30:0x00cb, B:32:0x00dc, B:34:0x00e2, B:38:0x00f7, B:51:0x0118, B:55:0x011f, B:56:0x0122, B:57:0x0123, B:61:0x014b, B:65:0x0153, B:70:0x0187, B:128:0x0284, B:130:0x028a, B:132:0x0296, B:133:0x029a, B:135:0x02a0, B:137:0x02b4, B:141:0x02bd, B:143:0x02c3, B:149:0x02e8, B:146:0x02d8, B:148:0x02e2, B:150:0x02eb, B:152:0x0306, B:156:0x0315, B:158:0x0339, B:164:0x034b, B:166:0x0385, B:168:0x038a, B:170:0x0392, B:171:0x0395, B:173:0x039a, B:174:0x039d, B:176:0x03a9, B:177:0x03bf, B:178:0x03c7, B:180:0x03d8, B:182:0x03ea, B:184:0x040c, B:186:0x044a, B:188:0x045c, B:190:0x0471, B:192:0x047c, B:193:0x0485, B:189:0x046a, B:195:0x04c9, B:185:0x0441, B:115:0x0255, B:127:0x0281, B:199:0x04e0, B:200:0x04e3, B:201:0x04e4, B:206:0x0525, B:222:0x054c, B:224:0x0552, B:226:0x055d, B:210:0x052e, B:231:0x0569, B:232:0x056c), top: B:249:0x0010, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0552 A[Catch: all -> 0x056d, TryCatch #11 {all -> 0x056d, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:10:0x0034, B:12:0x003a, B:13:0x0045, B:15:0x004d, B:16:0x0051, B:18:0x005c, B:19:0x0067, B:21:0x0072, B:22:0x0080, B:24:0x009f, B:26:0x00a5, B:27:0x00a8, B:29:0x00b4, B:30:0x00cb, B:32:0x00dc, B:34:0x00e2, B:38:0x00f7, B:51:0x0118, B:55:0x011f, B:56:0x0122, B:57:0x0123, B:61:0x014b, B:65:0x0153, B:70:0x0187, B:128:0x0284, B:130:0x028a, B:132:0x0296, B:133:0x029a, B:135:0x02a0, B:137:0x02b4, B:141:0x02bd, B:143:0x02c3, B:149:0x02e8, B:146:0x02d8, B:148:0x02e2, B:150:0x02eb, B:152:0x0306, B:156:0x0315, B:158:0x0339, B:164:0x034b, B:166:0x0385, B:168:0x038a, B:170:0x0392, B:171:0x0395, B:173:0x039a, B:174:0x039d, B:176:0x03a9, B:177:0x03bf, B:178:0x03c7, B:180:0x03d8, B:182:0x03ea, B:184:0x040c, B:186:0x044a, B:188:0x045c, B:190:0x0471, B:192:0x047c, B:193:0x0485, B:189:0x046a, B:195:0x04c9, B:185:0x0441, B:115:0x0255, B:127:0x0281, B:199:0x04e0, B:200:0x04e3, B:201:0x04e4, B:206:0x0525, B:222:0x054c, B:224:0x0552, B:226:0x055d, B:210:0x052e, B:231:0x0569, B:232:0x056c), top: B:249:0x0010, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0255 A[ADDED_TO_REGION, EDGE_INSN: B:273:0x0255->B:115:0x0255 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011f A[Catch: all -> 0x056d, TryCatch #11 {all -> 0x056d, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:10:0x0034, B:12:0x003a, B:13:0x0045, B:15:0x004d, B:16:0x0051, B:18:0x005c, B:19:0x0067, B:21:0x0072, B:22:0x0080, B:24:0x009f, B:26:0x00a5, B:27:0x00a8, B:29:0x00b4, B:30:0x00cb, B:32:0x00dc, B:34:0x00e2, B:38:0x00f7, B:51:0x0118, B:55:0x011f, B:56:0x0122, B:57:0x0123, B:61:0x014b, B:65:0x0153, B:70:0x0187, B:128:0x0284, B:130:0x028a, B:132:0x0296, B:133:0x029a, B:135:0x02a0, B:137:0x02b4, B:141:0x02bd, B:143:0x02c3, B:149:0x02e8, B:146:0x02d8, B:148:0x02e2, B:150:0x02eb, B:152:0x0306, B:156:0x0315, B:158:0x0339, B:164:0x034b, B:166:0x0385, B:168:0x038a, B:170:0x0392, B:171:0x0395, B:173:0x039a, B:174:0x039d, B:176:0x03a9, B:177:0x03bf, B:178:0x03c7, B:180:0x03d8, B:182:0x03ea, B:184:0x040c, B:186:0x044a, B:188:0x045c, B:190:0x0471, B:192:0x047c, B:193:0x0485, B:189:0x046a, B:195:0x04c9, B:185:0x0441, B:115:0x0255, B:127:0x0281, B:199:0x04e0, B:200:0x04e3, B:201:0x04e4, B:206:0x0525, B:222:0x054c, B:224:0x0552, B:226:0x055d, B:210:0x052e, B:231:0x0569, B:232:0x056c), top: B:249:0x0010, inners: #3 }] */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3935C() {
        Cursor cursor;
        Cursor cursor2;
        uh2 uh2Var;
        long m12670I;
        Cursor cursor3;
        String str;
        Cursor cursor4;
        long j;
        Cursor cursor5;
        List emptyList;
        String str2;
        String str3;
        String str4;
        hk5 m14160q;
        String str5;
        Object m14152z;
        byte[] blob;
        ec8 ec8Var;
        Cursor cursor6;
        hk5 m14156v;
        String str6;
        mo3882r().mo6991f();
        m3903e();
        int i = 1;
        this.f33510u = true;
        int i2 = 0;
        try {
            this.f33501l.mo3911a();
            Boolean m5474J = this.f33501l.m24047L().m5474J();
            if (m5474J == null) {
                m14156v = mo3895i().m14155w();
                str6 = "Upload data called on the client side before use of service was decided";
            } else if (!m5474J.booleanValue()) {
                if (this.f33504o <= 0) {
                    mo3882r().mo6991f();
                    if (this.f33513x != null) {
                        m14156v = mo3895i().m14156v();
                        str6 = "Uploading requested multiple times";
                    } else {
                        ht5 ht5Var = this.f33491b;
                        m3920R(ht5Var);
                        if (ht5Var.m20430l()) {
                            long mo15860a = mo3909b().mo15860a();
                            Cursor cursor7 = null;
                            int m12663n = m3917U().m12663n(null, m75.f18510R);
                            m3917U();
                            long m12670I2 = mo15860a - qa2.m12670I();
                            for (int i3 = 0; i3 < m12663n && m3924N(null, m12670I2); i3++) {
                            }
                            long m4400a = this.f33498i.f6617g.m4400a();
                            if (m4400a != 0) {
                                mo3895i().m14161p().m20652b("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(mo15860a - m4400a)));
                            }
                            uh2 uh2Var2 = this.f33492c;
                            m3920R(uh2Var2);
                            String m8158Z = uh2Var2.m8158Z();
                            long j2 = -1;
                            if (TextUtils.isEmpty(m8158Z)) {
                                try {
                                    this.f33515z = -1L;
                                    uh2Var = this.f33492c;
                                    m3920R(uh2Var);
                                    m3917U();
                                    m12670I = mo15860a - qa2.m12670I();
                                    uh2Var.mo6991f();
                                    uh2Var.m13533g();
                                } catch (Throwable th) {
                                    th = th;
                                    cursor2 = cursor;
                                }
                                try {
                                    cursor3 = uh2Var.m8168P().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(m12670I)});
                                    try {
                                    } catch (SQLiteException e) {
                                        e = e;
                                        uh2Var.f25143a.mo3895i().m14160q().m20652b("Error selecting expired configs", e);
                                    }
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    cursor3 = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor2 = null;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                                if (cursor3.moveToFirst()) {
                                    str = cursor3.getString(0);
                                    cursor3.close();
                                    if (!TextUtils.isEmpty(str)) {
                                    }
                                } else {
                                    uh2Var.f25143a.mo3895i().m14156v().m20653a("No expired configs for apps with pending events");
                                    cursor3.close();
                                    str = null;
                                    if (!TextUtils.isEmpty(str)) {
                                        uh2 uh2Var3 = this.f33492c;
                                        m3920R(uh2Var3);
                                        qu7 m8166R = uh2Var3.m8166R(str);
                                        if (m8166R != null) {
                                            m3899g(m8166R);
                                        }
                                    }
                                }
                            } else {
                                if (this.f33515z == -1) {
                                    uh2 uh2Var4 = this.f33492c;
                                    m3920R(uh2Var4);
                                    try {
                                        cursor6 = uh2Var4.m8168P().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                        try {
                                            try {
                                                if (cursor6.moveToFirst()) {
                                                    j2 = cursor6.getLong(0);
                                                }
                                            } catch (SQLiteException e3) {
                                                e = e3;
                                                uh2Var4.f25143a.mo3895i().m14160q().m20652b("Error querying raw events", e);
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            cursor7 = cursor6;
                                            if (cursor7 != null) {
                                                cursor7.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteException e4) {
                                        e = e4;
                                        cursor6 = null;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        if (cursor7 != null) {
                                        }
                                        throw th;
                                    }
                                    cursor6.close();
                                    this.f33515z = j2;
                                }
                                int m12663n2 = m3917U().m12663n(m8158Z, m75.f18533h);
                                int max = Math.max(0, m3917U().m12663n(m8158Z, m75.f18535i));
                                uh2 uh2Var5 = this.f33492c;
                                m3920R(uh2Var5);
                                uh2Var5.mo6991f();
                                uh2Var5.m13533g();
                                ry0.m10839a(m12663n2 > 0);
                                ry0.m10839a(max > 0);
                                ry0.m10834f(m8158Z);
                                try {
                                    cursor5 = uh2Var5.m8168P().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{m8158Z}, null, null, "rowid", String.valueOf(m12663n2));
                                    try {
                                        try {
                                            if (cursor5.moveToFirst()) {
                                                ArrayList arrayList = new ArrayList();
                                                int i4 = 0;
                                                while (true) {
                                                    long j3 = cursor5.getLong(i2);
                                                    try {
                                                        blob = cursor5.getBlob(i);
                                                        ec8Var = uh2Var5.f19771b.f33496g;
                                                        m3920R(ec8Var);
                                                    } catch (IOException e5) {
                                                        e = e5;
                                                        j = mo15860a;
                                                    }
                                                    try {
                                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                                        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                        byte[] bArr = new byte[NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV];
                                                        j = mo15860a;
                                                        while (true) {
                                                            try {
                                                                try {
                                                                    int read = gZIPInputStream.read(bArr);
                                                                    if (read <= 0) {
                                                                        break;
                                                                    }
                                                                    byteArrayOutputStream.write(bArr, 0, read);
                                                                } catch (IOException e6) {
                                                                    e = e6;
                                                                    try {
                                                                        ec8Var.f25143a.mo3895i().m14160q().m20652b("Failed to ungzip content", e);
                                                                        throw e;
                                                                        break;
                                                                    } catch (IOException e7) {
                                                                        e = e7;
                                                                        m14160q = uh2Var5.f25143a.mo3895i().m14160q();
                                                                        str5 = "Failed to unzip queued bundle. appId";
                                                                        m14152z = om5.m14152z(m8158Z);
                                                                        m14160q.m20651c(str5, m14152z, e);
                                                                        if (!cursor5.moveToNext()) {
                                                                            break;
                                                                        }
                                                                        mo15860a = j;
                                                                        i = 1;
                                                                        i2 = 0;
                                                                        cursor5.close();
                                                                        emptyList = arrayList;
                                                                        if (!emptyList.isEmpty()) {
                                                                        }
                                                                        this.f33510u = false;
                                                                        m3927K();
                                                                    }
                                                                }
                                                            } catch (SQLiteException e8) {
                                                                e = e8;
                                                                uh2Var5.f25143a.mo3895i().m14160q().m20651c("Error querying bundles. appId", om5.m14152z(m8158Z), e);
                                                                emptyList = Collections.emptyList();
                                                                if (cursor5 != null) {
                                                                    cursor5.close();
                                                                }
                                                                if (!emptyList.isEmpty()) {
                                                                }
                                                                this.f33510u = false;
                                                                m3927K();
                                                            }
                                                        }
                                                        gZIPInputStream.close();
                                                        byteArrayInputStream.close();
                                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                        if (!arrayList.isEmpty() && byteArray.length + i4 > max) {
                                                            break;
                                                        }
                                                        try {
                                                            g37 g37Var = (g37) ec8.m23601C(j47.m19043O1(), byteArray);
                                                            if (!cursor5.isNull(2)) {
                                                                g37Var.m22013Y(cursor5.getInt(2));
                                                            }
                                                            i4 += byteArray.length;
                                                            arrayList.add(Pair.create((j47) g37Var.m3975m(), Long.valueOf(j3)));
                                                        } catch (IOException e9) {
                                                            e = e9;
                                                            m14160q = uh2Var5.f25143a.mo3895i().m14160q();
                                                            str5 = "Failed to merge queued bundle. appId";
                                                            m14152z = om5.m14152z(m8158Z);
                                                            m14160q.m20651c(str5, m14152z, e);
                                                            if (!cursor5.moveToNext()) {
                                                            }
                                                            cursor5.close();
                                                            emptyList = arrayList;
                                                            if (!emptyList.isEmpty()) {
                                                            }
                                                            this.f33510u = false;
                                                            m3927K();
                                                        }
                                                        if (!cursor5.moveToNext() || i4 > max) {
                                                            break;
                                                            break;
                                                        }
                                                        mo15860a = j;
                                                        i = 1;
                                                        i2 = 0;
                                                    } catch (IOException e10) {
                                                        e = e10;
                                                        j = mo15860a;
                                                    }
                                                }
                                            } else {
                                                emptyList = Collections.emptyList();
                                                cursor5.close();
                                                j = mo15860a;
                                            }
                                        } catch (SQLiteException e11) {
                                            e = e11;
                                            j = mo15860a;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        cursor4 = cursor5;
                                        if (cursor4 != null) {
                                            cursor4.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e12) {
                                    e = e12;
                                    j = mo15860a;
                                    cursor5 = null;
                                } catch (Throwable th6) {
                                    th = th6;
                                    cursor4 = null;
                                }
                                if (!emptyList.isEmpty()) {
                                    if (m3916V(m8158Z).m25423i(vb2.AD_STORAGE)) {
                                        Iterator it = emptyList.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                str4 = null;
                                                break;
                                            }
                                            j47 j47Var = (j47) ((Pair) it.next()).first;
                                            if (!j47Var.m19051M().isEmpty()) {
                                                str4 = j47Var.m19051M();
                                                break;
                                            }
                                        }
                                        if (str4 != null) {
                                            int i5 = 0;
                                            while (true) {
                                                if (i5 >= emptyList.size()) {
                                                    break;
                                                }
                                                j47 j47Var2 = (j47) ((Pair) emptyList.get(i5)).first;
                                                if (!j47Var2.m19051M().isEmpty() && !j47Var2.m19051M().equals(str4)) {
                                                    emptyList = emptyList.subList(0, i5);
                                                    break;
                                                }
                                                i5++;
                                            }
                                        }
                                    }
                                    b17 m23789D = e27.m23789D();
                                    int size = emptyList.size();
                                    ArrayList arrayList2 = new ArrayList(emptyList.size());
                                    boolean z = m3917U().m12676C(m8158Z) && m3916V(m8158Z).m25423i(vb2.AD_STORAGE);
                                    boolean m25423i = m3916V(m8158Z).m25423i(vb2.AD_STORAGE);
                                    boolean m25423i2 = m3916V(m8158Z).m25423i(vb2.ANALYTICS_STORAGE);
                                    zm8.m2111b();
                                    boolean z2 = m3917U().m12677B(null, m75.f18546n0) && m3917U().m12677B(m8158Z, m75.f18550p0);
                                    int i6 = 0;
                                    while (i6 < size) {
                                        g37 g37Var2 = (g37) ((j47) ((Pair) emptyList.get(i6)).first).m18675A();
                                        arrayList2.add((Long) ((Pair) emptyList.get(i6)).second);
                                        m3917U().m12661p();
                                        g37Var2.m22007e0(74029L);
                                        long j4 = j;
                                        g37Var2.m22008d0(j4);
                                        this.f33501l.mo3911a();
                                        g37Var2.m22012Z(false);
                                        if (!z) {
                                            g37Var2.m22044C0();
                                        }
                                        if (!m25423i) {
                                            g37Var2.m22030J0();
                                            g37Var2.m22038F0();
                                        }
                                        if (!m25423i2) {
                                            g37Var2.m21978z0();
                                        }
                                        m3901f(m8158Z, g37Var2);
                                        if (!z2) {
                                            g37Var2.m22028K0();
                                        }
                                        if (m3917U().m12677B(m8158Z, m75.f18514V)) {
                                            byte[] m6531i = ((j47) g37Var2.m3975m()).m6531i();
                                            ec8 ec8Var2 = this.f33496g;
                                            m3920R(ec8Var2);
                                            g37Var2.m22047B(ec8Var2.m23576x(m6531i));
                                        }
                                        m23789D.m26525s(g37Var2);
                                        i6++;
                                        j = j4;
                                    }
                                    long j5 = j;
                                    if (Log.isLoggable(mo3895i().m14168C(), 2)) {
                                        ec8 ec8Var3 = this.f33496g;
                                        m3920R(ec8Var3);
                                        str2 = ec8Var3.m23600D((e27) m23789D.m3975m());
                                    } else {
                                        str2 = null;
                                    }
                                    m3920R(this.f33496g);
                                    byte[] m6531i2 = ((e27) m23789D.m3975m()).m6531i();
                                    gh6 gh6Var = this.f33499j.f19771b.f33490a;
                                    m3920R(gh6Var);
                                    String m21609w = gh6Var.m21609w(m8158Z);
                                    if (TextUtils.isEmpty(m21609w)) {
                                        str3 = (String) m75.f18553r.m18786a(null);
                                    } else {
                                        Uri parse = Uri.parse((String) m75.f18553r.m18786a(null));
                                        Uri.Builder buildUpon = parse.buildUpon();
                                        buildUpon.authority(m21609w + "." + parse.getAuthority());
                                        str3 = buildUpon.build().toString();
                                    }
                                    try {
                                        URL url = new URL(str3);
                                        ry0.m10839a(!arrayList2.isEmpty());
                                        if (this.f33513x != null) {
                                            mo3895i().m14160q().m20653a("Set uploading progress before finishing the previous upload");
                                        } else {
                                            this.f33513x = new ArrayList(arrayList2);
                                        }
                                        this.f33498i.f6618h.m4399b(j5);
                                        mo3895i().m14156v().m20650d("Uploading data. app, uncompressed size, data", size > 0 ? m23789D.m26524t(0).m19031S1() : "?", Integer.valueOf(m6531i2.length), str2);
                                        this.f33509t = true;
                                        ht5 ht5Var2 = this.f33491b;
                                        m3920R(ht5Var2);
                                        ya8 ya8Var = new ya8(this, m8158Z);
                                        ht5Var2.mo6991f();
                                        ht5Var2.m13533g();
                                        ry0.m10830j(url);
                                        ry0.m10830j(m6531i2);
                                        ry0.m10830j(ya8Var);
                                        ht5Var2.f25143a.mo3882r().m6979y(new es5(ht5Var2, m8158Z, url, m6531i2, null, ya8Var));
                                    } catch (MalformedURLException unused) {
                                        mo3895i().m14160q().m20651c("Failed to parse upload URL. Not uploading. appId", om5.m14152z(m8158Z), str3);
                                    }
                                }
                            }
                            this.f33510u = false;
                            m3927K();
                        }
                        mo3895i().m14156v().m20653a("Network not connected, ignoring upload request");
                    }
                }
                m3925M();
                this.f33510u = false;
                m3927K();
            } else {
                m14156v = mo3895i().m14160q();
                str6 = "Upload called in the client side when service should be used";
            }
            m14156v.m20653a(str6);
            this.f33510u = false;
            m3927K();
        } catch (Throwable th7) {
            this.f33510u = false;
            m3927K();
            throw th7;
        }
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:686)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:544)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:365)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:313)
        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:302)
        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:137)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:302)
        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /* JADX WARN: Can't wrap try/catch for region: R(12:(3:91|92|93)|197|198|199|(2:200|(2:202|(1:204))(3:219|220|(1:225)(1:224)))|206|207|208|(1:210)(2:215|216)|211|212|213) */
    /* JADX WARN: Can't wrap try/catch for region: R(18:281|(2:283|(1:285)(7:286|287|(1:289)|46|(0)(0)|49|(0)(0)))|290|291|292|293|294|295|296|297|298|299|287|(0)|46|(0)(0)|49|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(49:(2:58|(5:60|(1:62)|63|64|65))|66|(2:68|(5:70|(1:72)|73|74|75))|76|77|(1:79)|80|(2:82|(1:86))|87|(3:88|89|90)|(12:(3:91|92|93)|197|198|199|(2:200|(2:202|(1:204))(3:219|220|(1:225)(1:224)))|206|207|208|(1:210)(2:215|216)|211|212|213)|94|(1:96)|97|(2:99|(1:105)(3:102|103|104))(1:244)|106|(1:108)|109|(1:111)|112|(1:114)|115|(1:121)|122|(1:124)|125|(1:127)|128|(1:132)|133|(1:135)|136|(4:141|(4:144|(3:146|147|(3:149|150|(3:152|153|155)(1:234))(1:236))(1:241)|235|142)|242|156)|243|(1:159)|160|(2:164|(2:168|(1:170)))|171|(2:173|(1:175))|176|(3:178|(1:180)|181)|182|(1:186)|187|(1:189)|190|(3:193|194|191)|195|196) */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0748, code lost:
        if (r14.isEmpty() == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x093b, code lost:
        r13 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x09f7, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x09f8, code lost:
        r2.f25143a.mo3895i().m14160q().m20651c("Error storing raw event. appId", com.daaw.om5.m14152z(r5.f21678a), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0a29, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0a2b, code lost:
        mo3895i().m14160q().m20651c("Data loss. Failed to insert raw event metadata. appId", com.daaw.om5.m14152z(r2.m22003i0()), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x027a, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x027c, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x027d, code lost:
        r33 = "metadata_fingerprint";
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0280, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0281, code lost:
        r33 = "metadata_fingerprint";
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0287, code lost:
        r11.f25143a.mo3895i().m14160q().m20651c("Error pruning currencies. appId", com.daaw.om5.m14152z(r10), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0372 A[Catch: all -> 0x0a73, TryCatch #3 {all -> 0x0a73, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:95:0x02f8, B:104:0x032e, B:106:0x0372, B:108:0x0377, B:109:0x038e, B:113:0x03a1, B:115:0x03ba, B:117:0x03c1, B:118:0x03d8, B:123:0x0402, B:127:0x0425, B:128:0x043c, B:131:0x044d, B:134:0x046a, B:135:0x047e, B:137:0x0488, B:139:0x0495, B:141:0x049b, B:142:0x04a4, B:143:0x04b2, B:145:0x04ca, B:155:0x0502, B:156:0x0517, B:158:0x0541, B:161:0x0559, B:164:0x059c, B:166:0x05c8, B:168:0x0607, B:169:0x060c, B:171:0x0614, B:172:0x0619, B:174:0x0621, B:175:0x0626, B:177:0x0635, B:179:0x0643, B:181:0x064b, B:182:0x0650, B:184:0x0659, B:185:0x065d, B:187:0x066a, B:188:0x066f, B:190:0x0696, B:192:0x069e, B:193:0x06a3, B:195:0x06ab, B:196:0x06ae, B:198:0x06c6, B:201:0x06ce, B:202:0x06e7, B:204:0x06ed, B:206:0x0701, B:208:0x070d, B:210:0x071a, B:214:0x0734, B:215:0x0744, B:219:0x074d, B:220:0x0750, B:222:0x076e, B:224:0x0772, B:226:0x0784, B:228:0x0788, B:230:0x0793, B:231:0x079c, B:233:0x07db, B:235:0x07e4, B:236:0x07e7, B:238:0x07f4, B:240:0x0814, B:241:0x0821, B:242:0x0857, B:244:0x085f, B:246:0x0869, B:247:0x0876, B:249:0x0880, B:250:0x088d, B:251:0x0899, B:253:0x089f, B:255:0x08cf, B:256:0x0915, B:257:0x091f, B:258:0x092b, B:260:0x0931, B:269:0x097e, B:270:0x09cc, B:272:0x09dc, B:286:0x0a40, B:275:0x09f4, B:277:0x09f8, B:263:0x093d, B:265:0x0969, B:281:0x0a11, B:282:0x0a28, B:285:0x0a2b, B:165:0x05ba, B:152:0x04e7, B:98:0x030e, B:99:0x0315, B:101:0x031b, B:103:0x0327, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:56:0x01a3, B:64:0x01e3, B:66:0x01e9, B:68:0x01f7, B:70:0x0208, B:73:0x020f, B:91:0x02b6, B:93:0x02c1, B:74:0x023d, B:75:0x025a, B:77:0x0261, B:79:0x0272, B:90:0x029a, B:89:0x0287, B:59:0x01b1, B:63:0x01d9), top: B:299:0x0124, inners: #0, #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0502 A[Catch: all -> 0x0a73, TryCatch #3 {all -> 0x0a73, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:95:0x02f8, B:104:0x032e, B:106:0x0372, B:108:0x0377, B:109:0x038e, B:113:0x03a1, B:115:0x03ba, B:117:0x03c1, B:118:0x03d8, B:123:0x0402, B:127:0x0425, B:128:0x043c, B:131:0x044d, B:134:0x046a, B:135:0x047e, B:137:0x0488, B:139:0x0495, B:141:0x049b, B:142:0x04a4, B:143:0x04b2, B:145:0x04ca, B:155:0x0502, B:156:0x0517, B:158:0x0541, B:161:0x0559, B:164:0x059c, B:166:0x05c8, B:168:0x0607, B:169:0x060c, B:171:0x0614, B:172:0x0619, B:174:0x0621, B:175:0x0626, B:177:0x0635, B:179:0x0643, B:181:0x064b, B:182:0x0650, B:184:0x0659, B:185:0x065d, B:187:0x066a, B:188:0x066f, B:190:0x0696, B:192:0x069e, B:193:0x06a3, B:195:0x06ab, B:196:0x06ae, B:198:0x06c6, B:201:0x06ce, B:202:0x06e7, B:204:0x06ed, B:206:0x0701, B:208:0x070d, B:210:0x071a, B:214:0x0734, B:215:0x0744, B:219:0x074d, B:220:0x0750, B:222:0x076e, B:224:0x0772, B:226:0x0784, B:228:0x0788, B:230:0x0793, B:231:0x079c, B:233:0x07db, B:235:0x07e4, B:236:0x07e7, B:238:0x07f4, B:240:0x0814, B:241:0x0821, B:242:0x0857, B:244:0x085f, B:246:0x0869, B:247:0x0876, B:249:0x0880, B:250:0x088d, B:251:0x0899, B:253:0x089f, B:255:0x08cf, B:256:0x0915, B:257:0x091f, B:258:0x092b, B:260:0x0931, B:269:0x097e, B:270:0x09cc, B:272:0x09dc, B:286:0x0a40, B:275:0x09f4, B:277:0x09f8, B:263:0x093d, B:265:0x0969, B:281:0x0a11, B:282:0x0a28, B:285:0x0a2b, B:165:0x05ba, B:152:0x04e7, B:98:0x030e, B:99:0x0315, B:101:0x031b, B:103:0x0327, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:56:0x01a3, B:64:0x01e3, B:66:0x01e9, B:68:0x01f7, B:70:0x0208, B:73:0x020f, B:91:0x02b6, B:93:0x02c1, B:74:0x023d, B:75:0x025a, B:77:0x0261, B:79:0x0272, B:90:0x029a, B:89:0x0287, B:59:0x01b1, B:63:0x01d9), top: B:299:0x0124, inners: #0, #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0541 A[Catch: all -> 0x0a73, TryCatch #3 {all -> 0x0a73, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:95:0x02f8, B:104:0x032e, B:106:0x0372, B:108:0x0377, B:109:0x038e, B:113:0x03a1, B:115:0x03ba, B:117:0x03c1, B:118:0x03d8, B:123:0x0402, B:127:0x0425, B:128:0x043c, B:131:0x044d, B:134:0x046a, B:135:0x047e, B:137:0x0488, B:139:0x0495, B:141:0x049b, B:142:0x04a4, B:143:0x04b2, B:145:0x04ca, B:155:0x0502, B:156:0x0517, B:158:0x0541, B:161:0x0559, B:164:0x059c, B:166:0x05c8, B:168:0x0607, B:169:0x060c, B:171:0x0614, B:172:0x0619, B:174:0x0621, B:175:0x0626, B:177:0x0635, B:179:0x0643, B:181:0x064b, B:182:0x0650, B:184:0x0659, B:185:0x065d, B:187:0x066a, B:188:0x066f, B:190:0x0696, B:192:0x069e, B:193:0x06a3, B:195:0x06ab, B:196:0x06ae, B:198:0x06c6, B:201:0x06ce, B:202:0x06e7, B:204:0x06ed, B:206:0x0701, B:208:0x070d, B:210:0x071a, B:214:0x0734, B:215:0x0744, B:219:0x074d, B:220:0x0750, B:222:0x076e, B:224:0x0772, B:226:0x0784, B:228:0x0788, B:230:0x0793, B:231:0x079c, B:233:0x07db, B:235:0x07e4, B:236:0x07e7, B:238:0x07f4, B:240:0x0814, B:241:0x0821, B:242:0x0857, B:244:0x085f, B:246:0x0869, B:247:0x0876, B:249:0x0880, B:250:0x088d, B:251:0x0899, B:253:0x089f, B:255:0x08cf, B:256:0x0915, B:257:0x091f, B:258:0x092b, B:260:0x0931, B:269:0x097e, B:270:0x09cc, B:272:0x09dc, B:286:0x0a40, B:275:0x09f4, B:277:0x09f8, B:263:0x093d, B:265:0x0969, B:281:0x0a11, B:282:0x0a28, B:285:0x0a2b, B:165:0x05ba, B:152:0x04e7, B:98:0x030e, B:99:0x0315, B:101:0x031b, B:103:0x0327, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:56:0x01a3, B:64:0x01e3, B:66:0x01e9, B:68:0x01f7, B:70:0x0208, B:73:0x020f, B:91:0x02b6, B:93:0x02c1, B:74:0x023d, B:75:0x025a, B:77:0x0261, B:79:0x0272, B:90:0x029a, B:89:0x0287, B:59:0x01b1, B:63:0x01d9), top: B:299:0x0124, inners: #0, #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05ba A[Catch: all -> 0x0a73, TryCatch #3 {all -> 0x0a73, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:95:0x02f8, B:104:0x032e, B:106:0x0372, B:108:0x0377, B:109:0x038e, B:113:0x03a1, B:115:0x03ba, B:117:0x03c1, B:118:0x03d8, B:123:0x0402, B:127:0x0425, B:128:0x043c, B:131:0x044d, B:134:0x046a, B:135:0x047e, B:137:0x0488, B:139:0x0495, B:141:0x049b, B:142:0x04a4, B:143:0x04b2, B:145:0x04ca, B:155:0x0502, B:156:0x0517, B:158:0x0541, B:161:0x0559, B:164:0x059c, B:166:0x05c8, B:168:0x0607, B:169:0x060c, B:171:0x0614, B:172:0x0619, B:174:0x0621, B:175:0x0626, B:177:0x0635, B:179:0x0643, B:181:0x064b, B:182:0x0650, B:184:0x0659, B:185:0x065d, B:187:0x066a, B:188:0x066f, B:190:0x0696, B:192:0x069e, B:193:0x06a3, B:195:0x06ab, B:196:0x06ae, B:198:0x06c6, B:201:0x06ce, B:202:0x06e7, B:204:0x06ed, B:206:0x0701, B:208:0x070d, B:210:0x071a, B:214:0x0734, B:215:0x0744, B:219:0x074d, B:220:0x0750, B:222:0x076e, B:224:0x0772, B:226:0x0784, B:228:0x0788, B:230:0x0793, B:231:0x079c, B:233:0x07db, B:235:0x07e4, B:236:0x07e7, B:238:0x07f4, B:240:0x0814, B:241:0x0821, B:242:0x0857, B:244:0x085f, B:246:0x0869, B:247:0x0876, B:249:0x0880, B:250:0x088d, B:251:0x0899, B:253:0x089f, B:255:0x08cf, B:256:0x0915, B:257:0x091f, B:258:0x092b, B:260:0x0931, B:269:0x097e, B:270:0x09cc, B:272:0x09dc, B:286:0x0a40, B:275:0x09f4, B:277:0x09f8, B:263:0x093d, B:265:0x0969, B:281:0x0a11, B:282:0x0a28, B:285:0x0a2b, B:165:0x05ba, B:152:0x04e7, B:98:0x030e, B:99:0x0315, B:101:0x031b, B:103:0x0327, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:56:0x01a3, B:64:0x01e3, B:66:0x01e9, B:68:0x01f7, B:70:0x0208, B:73:0x020f, B:91:0x02b6, B:93:0x02c1, B:74:0x023d, B:75:0x025a, B:77:0x0261, B:79:0x0272, B:90:0x029a, B:89:0x0287, B:59:0x01b1, B:63:0x01d9), top: B:299:0x0124, inners: #0, #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0607 A[Catch: all -> 0x0a73, TryCatch #3 {all -> 0x0a73, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:95:0x02f8, B:104:0x032e, B:106:0x0372, B:108:0x0377, B:109:0x038e, B:113:0x03a1, B:115:0x03ba, B:117:0x03c1, B:118:0x03d8, B:123:0x0402, B:127:0x0425, B:128:0x043c, B:131:0x044d, B:134:0x046a, B:135:0x047e, B:137:0x0488, B:139:0x0495, B:141:0x049b, B:142:0x04a4, B:143:0x04b2, B:145:0x04ca, B:155:0x0502, B:156:0x0517, B:158:0x0541, B:161:0x0559, B:164:0x059c, B:166:0x05c8, B:168:0x0607, B:169:0x060c, B:171:0x0614, B:172:0x0619, B:174:0x0621, B:175:0x0626, B:177:0x0635, B:179:0x0643, B:181:0x064b, B:182:0x0650, B:184:0x0659, B:185:0x065d, B:187:0x066a, B:188:0x066f, B:190:0x0696, B:192:0x069e, B:193:0x06a3, B:195:0x06ab, B:196:0x06ae, B:198:0x06c6, B:201:0x06ce, B:202:0x06e7, B:204:0x06ed, B:206:0x0701, B:208:0x070d, B:210:0x071a, B:214:0x0734, B:215:0x0744, B:219:0x074d, B:220:0x0750, B:222:0x076e, B:224:0x0772, B:226:0x0784, B:228:0x0788, B:230:0x0793, B:231:0x079c, B:233:0x07db, B:235:0x07e4, B:236:0x07e7, B:238:0x07f4, B:240:0x0814, B:241:0x0821, B:242:0x0857, B:244:0x085f, B:246:0x0869, B:247:0x0876, B:249:0x0880, B:250:0x088d, B:251:0x0899, B:253:0x089f, B:255:0x08cf, B:256:0x0915, B:257:0x091f, B:258:0x092b, B:260:0x0931, B:269:0x097e, B:270:0x09cc, B:272:0x09dc, B:286:0x0a40, B:275:0x09f4, B:277:0x09f8, B:263:0x093d, B:265:0x0969, B:281:0x0a11, B:282:0x0a28, B:285:0x0a2b, B:165:0x05ba, B:152:0x04e7, B:98:0x030e, B:99:0x0315, B:101:0x031b, B:103:0x0327, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:56:0x01a3, B:64:0x01e3, B:66:0x01e9, B:68:0x01f7, B:70:0x0208, B:73:0x020f, B:91:0x02b6, B:93:0x02c1, B:74:0x023d, B:75:0x025a, B:77:0x0261, B:79:0x0272, B:90:0x029a, B:89:0x0287, B:59:0x01b1, B:63:0x01d9), top: B:299:0x0124, inners: #0, #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0614 A[Catch: all -> 0x0a73, TryCatch #3 {all -> 0x0a73, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:95:0x02f8, B:104:0x032e, B:106:0x0372, B:108:0x0377, B:109:0x038e, B:113:0x03a1, B:115:0x03ba, B:117:0x03c1, B:118:0x03d8, B:123:0x0402, B:127:0x0425, B:128:0x043c, B:131:0x044d, B:134:0x046a, B:135:0x047e, B:137:0x0488, B:139:0x0495, B:141:0x049b, B:142:0x04a4, B:143:0x04b2, B:145:0x04ca, B:155:0x0502, B:156:0x0517, B:158:0x0541, B:161:0x0559, B:164:0x059c, B:166:0x05c8, B:168:0x0607, B:169:0x060c, B:171:0x0614, B:172:0x0619, B:174:0x0621, B:175:0x0626, B:177:0x0635, B:179:0x0643, B:181:0x064b, B:182:0x0650, B:184:0x0659, B:185:0x065d, B:187:0x066a, B:188:0x066f, B:190:0x0696, B:192:0x069e, B:193:0x06a3, B:195:0x06ab, B:196:0x06ae, B:198:0x06c6, B:201:0x06ce, B:202:0x06e7, B:204:0x06ed, B:206:0x0701, B:208:0x070d, B:210:0x071a, B:214:0x0734, B:215:0x0744, B:219:0x074d, B:220:0x0750, B:222:0x076e, B:224:0x0772, B:226:0x0784, B:228:0x0788, B:230:0x0793, B:231:0x079c, B:233:0x07db, B:235:0x07e4, B:236:0x07e7, B:238:0x07f4, B:240:0x0814, B:241:0x0821, B:242:0x0857, B:244:0x085f, B:246:0x0869, B:247:0x0876, B:249:0x0880, B:250:0x088d, B:251:0x0899, B:253:0x089f, B:255:0x08cf, B:256:0x0915, B:257:0x091f, B:258:0x092b, B:260:0x0931, B:269:0x097e, B:270:0x09cc, B:272:0x09dc, B:286:0x0a40, B:275:0x09f4, B:277:0x09f8, B:263:0x093d, B:265:0x0969, B:281:0x0a11, B:282:0x0a28, B:285:0x0a2b, B:165:0x05ba, B:152:0x04e7, B:98:0x030e, B:99:0x0315, B:101:0x031b, B:103:0x0327, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:56:0x01a3, B:64:0x01e3, B:66:0x01e9, B:68:0x01f7, B:70:0x0208, B:73:0x020f, B:91:0x02b6, B:93:0x02c1, B:74:0x023d, B:75:0x025a, B:77:0x0261, B:79:0x0272, B:90:0x029a, B:89:0x0287, B:59:0x01b1, B:63:0x01d9), top: B:299:0x0124, inners: #0, #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0621 A[Catch: all -> 0x0a73, TryCatch #3 {all -> 0x0a73, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:95:0x02f8, B:104:0x032e, B:106:0x0372, B:108:0x0377, B:109:0x038e, B:113:0x03a1, B:115:0x03ba, B:117:0x03c1, B:118:0x03d8, B:123:0x0402, B:127:0x0425, B:128:0x043c, B:131:0x044d, B:134:0x046a, B:135:0x047e, B:137:0x0488, B:139:0x0495, B:141:0x049b, B:142:0x04a4, B:143:0x04b2, B:145:0x04ca, B:155:0x0502, B:156:0x0517, B:158:0x0541, B:161:0x0559, B:164:0x059c, B:166:0x05c8, B:168:0x0607, B:169:0x060c, B:171:0x0614, B:172:0x0619, B:174:0x0621, B:175:0x0626, B:177:0x0635, B:179:0x0643, B:181:0x064b, B:182:0x0650, B:184:0x0659, B:185:0x065d, B:187:0x066a, B:188:0x066f, B:190:0x0696, B:192:0x069e, B:193:0x06a3, B:195:0x06ab, B:196:0x06ae, B:198:0x06c6, B:201:0x06ce, B:202:0x06e7, B:204:0x06ed, B:206:0x0701, B:208:0x070d, B:210:0x071a, B:214:0x0734, B:215:0x0744, B:219:0x074d, B:220:0x0750, B:222:0x076e, B:224:0x0772, B:226:0x0784, B:228:0x0788, B:230:0x0793, B:231:0x079c, B:233:0x07db, B:235:0x07e4, B:236:0x07e7, B:238:0x07f4, B:240:0x0814, B:241:0x0821, B:242:0x0857, B:244:0x085f, B:246:0x0869, B:247:0x0876, B:249:0x0880, B:250:0x088d, B:251:0x0899, B:253:0x089f, B:255:0x08cf, B:256:0x0915, B:257:0x091f, B:258:0x092b, B:260:0x0931, B:269:0x097e, B:270:0x09cc, B:272:0x09dc, B:286:0x0a40, B:275:0x09f4, B:277:0x09f8, B:263:0x093d, B:265:0x0969, B:281:0x0a11, B:282:0x0a28, B:285:0x0a2b, B:165:0x05ba, B:152:0x04e7, B:98:0x030e, B:99:0x0315, B:101:0x031b, B:103:0x0327, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:56:0x01a3, B:64:0x01e3, B:66:0x01e9, B:68:0x01f7, B:70:0x0208, B:73:0x020f, B:91:0x02b6, B:93:0x02c1, B:74:0x023d, B:75:0x025a, B:77:0x0261, B:79:0x0272, B:90:0x029a, B:89:0x0287, B:59:0x01b1, B:63:0x01d9), top: B:299:0x0124, inners: #0, #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0659 A[Catch: all -> 0x0a73, TryCatch #3 {all -> 0x0a73, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:95:0x02f8, B:104:0x032e, B:106:0x0372, B:108:0x0377, B:109:0x038e, B:113:0x03a1, B:115:0x03ba, B:117:0x03c1, B:118:0x03d8, B:123:0x0402, B:127:0x0425, B:128:0x043c, B:131:0x044d, B:134:0x046a, B:135:0x047e, B:137:0x0488, B:139:0x0495, B:141:0x049b, B:142:0x04a4, B:143:0x04b2, B:145:0x04ca, B:155:0x0502, B:156:0x0517, B:158:0x0541, B:161:0x0559, B:164:0x059c, B:166:0x05c8, B:168:0x0607, B:169:0x060c, B:171:0x0614, B:172:0x0619, B:174:0x0621, B:175:0x0626, B:177:0x0635, B:179:0x0643, B:181:0x064b, B:182:0x0650, B:184:0x0659, B:185:0x065d, B:187:0x066a, B:188:0x066f, B:190:0x0696, B:192:0x069e, B:193:0x06a3, B:195:0x06ab, B:196:0x06ae, B:198:0x06c6, B:201:0x06ce, B:202:0x06e7, B:204:0x06ed, B:206:0x0701, B:208:0x070d, B:210:0x071a, B:214:0x0734, B:215:0x0744, B:219:0x074d, B:220:0x0750, B:222:0x076e, B:224:0x0772, B:226:0x0784, B:228:0x0788, B:230:0x0793, B:231:0x079c, B:233:0x07db, B:235:0x07e4, B:236:0x07e7, B:238:0x07f4, B:240:0x0814, B:241:0x0821, B:242:0x0857, B:244:0x085f, B:246:0x0869, B:247:0x0876, B:249:0x0880, B:250:0x088d, B:251:0x0899, B:253:0x089f, B:255:0x08cf, B:256:0x0915, B:257:0x091f, B:258:0x092b, B:260:0x0931, B:269:0x097e, B:270:0x09cc, B:272:0x09dc, B:286:0x0a40, B:275:0x09f4, B:277:0x09f8, B:263:0x093d, B:265:0x0969, B:281:0x0a11, B:282:0x0a28, B:285:0x0a2b, B:165:0x05ba, B:152:0x04e7, B:98:0x030e, B:99:0x0315, B:101:0x031b, B:103:0x0327, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:56:0x01a3, B:64:0x01e3, B:66:0x01e9, B:68:0x01f7, B:70:0x0208, B:73:0x020f, B:91:0x02b6, B:93:0x02c1, B:74:0x023d, B:75:0x025a, B:77:0x0261, B:79:0x0272, B:90:0x029a, B:89:0x0287, B:59:0x01b1, B:63:0x01d9), top: B:299:0x0124, inners: #0, #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x066a A[Catch: all -> 0x0a73, TryCatch #3 {all -> 0x0a73, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:95:0x02f8, B:104:0x032e, B:106:0x0372, B:108:0x0377, B:109:0x038e, B:113:0x03a1, B:115:0x03ba, B:117:0x03c1, B:118:0x03d8, B:123:0x0402, B:127:0x0425, B:128:0x043c, B:131:0x044d, B:134:0x046a, B:135:0x047e, B:137:0x0488, B:139:0x0495, B:141:0x049b, B:142:0x04a4, B:143:0x04b2, B:145:0x04ca, B:155:0x0502, B:156:0x0517, B:158:0x0541, B:161:0x0559, B:164:0x059c, B:166:0x05c8, B:168:0x0607, B:169:0x060c, B:171:0x0614, B:172:0x0619, B:174:0x0621, B:175:0x0626, B:177:0x0635, B:179:0x0643, B:181:0x064b, B:182:0x0650, B:184:0x0659, B:185:0x065d, B:187:0x066a, B:188:0x066f, B:190:0x0696, B:192:0x069e, B:193:0x06a3, B:195:0x06ab, B:196:0x06ae, B:198:0x06c6, B:201:0x06ce, B:202:0x06e7, B:204:0x06ed, B:206:0x0701, B:208:0x070d, B:210:0x071a, B:214:0x0734, B:215:0x0744, B:219:0x074d, B:220:0x0750, B:222:0x076e, B:224:0x0772, B:226:0x0784, B:228:0x0788, B:230:0x0793, B:231:0x079c, B:233:0x07db, B:235:0x07e4, B:236:0x07e7, B:238:0x07f4, B:240:0x0814, B:241:0x0821, B:242:0x0857, B:244:0x085f, B:246:0x0869, B:247:0x0876, B:249:0x0880, B:250:0x088d, B:251:0x0899, B:253:0x089f, B:255:0x08cf, B:256:0x0915, B:257:0x091f, B:258:0x092b, B:260:0x0931, B:269:0x097e, B:270:0x09cc, B:272:0x09dc, B:286:0x0a40, B:275:0x09f4, B:277:0x09f8, B:263:0x093d, B:265:0x0969, B:281:0x0a11, B:282:0x0a28, B:285:0x0a2b, B:165:0x05ba, B:152:0x04e7, B:98:0x030e, B:99:0x0315, B:101:0x031b, B:103:0x0327, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:56:0x01a3, B:64:0x01e3, B:66:0x01e9, B:68:0x01f7, B:70:0x0208, B:73:0x020f, B:91:0x02b6, B:93:0x02c1, B:74:0x023d, B:75:0x025a, B:77:0x0261, B:79:0x0272, B:90:0x029a, B:89:0x0287, B:59:0x01b1, B:63:0x01d9), top: B:299:0x0124, inners: #0, #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x06ab A[Catch: all -> 0x0a73, TryCatch #3 {all -> 0x0a73, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:95:0x02f8, B:104:0x032e, B:106:0x0372, B:108:0x0377, B:109:0x038e, B:113:0x03a1, B:115:0x03ba, B:117:0x03c1, B:118:0x03d8, B:123:0x0402, B:127:0x0425, B:128:0x043c, B:131:0x044d, B:134:0x046a, B:135:0x047e, B:137:0x0488, B:139:0x0495, B:141:0x049b, B:142:0x04a4, B:143:0x04b2, B:145:0x04ca, B:155:0x0502, B:156:0x0517, B:158:0x0541, B:161:0x0559, B:164:0x059c, B:166:0x05c8, B:168:0x0607, B:169:0x060c, B:171:0x0614, B:172:0x0619, B:174:0x0621, B:175:0x0626, B:177:0x0635, B:179:0x0643, B:181:0x064b, B:182:0x0650, B:184:0x0659, B:185:0x065d, B:187:0x066a, B:188:0x066f, B:190:0x0696, B:192:0x069e, B:193:0x06a3, B:195:0x06ab, B:196:0x06ae, B:198:0x06c6, B:201:0x06ce, B:202:0x06e7, B:204:0x06ed, B:206:0x0701, B:208:0x070d, B:210:0x071a, B:214:0x0734, B:215:0x0744, B:219:0x074d, B:220:0x0750, B:222:0x076e, B:224:0x0772, B:226:0x0784, B:228:0x0788, B:230:0x0793, B:231:0x079c, B:233:0x07db, B:235:0x07e4, B:236:0x07e7, B:238:0x07f4, B:240:0x0814, B:241:0x0821, B:242:0x0857, B:244:0x085f, B:246:0x0869, B:247:0x0876, B:249:0x0880, B:250:0x088d, B:251:0x0899, B:253:0x089f, B:255:0x08cf, B:256:0x0915, B:257:0x091f, B:258:0x092b, B:260:0x0931, B:269:0x097e, B:270:0x09cc, B:272:0x09dc, B:286:0x0a40, B:275:0x09f4, B:277:0x09f8, B:263:0x093d, B:265:0x0969, B:281:0x0a11, B:282:0x0a28, B:285:0x0a2b, B:165:0x05ba, B:152:0x04e7, B:98:0x030e, B:99:0x0315, B:101:0x031b, B:103:0x0327, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:56:0x01a3, B:64:0x01e3, B:66:0x01e9, B:68:0x01f7, B:70:0x0208, B:73:0x020f, B:91:0x02b6, B:93:0x02c1, B:74:0x023d, B:75:0x025a, B:77:0x0261, B:79:0x0272, B:90:0x029a, B:89:0x0287, B:59:0x01b1, B:63:0x01d9), top: B:299:0x0124, inners: #0, #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x06ed A[Catch: all -> 0x0a73, TRY_LEAVE, TryCatch #3 {all -> 0x0a73, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:95:0x02f8, B:104:0x032e, B:106:0x0372, B:108:0x0377, B:109:0x038e, B:113:0x03a1, B:115:0x03ba, B:117:0x03c1, B:118:0x03d8, B:123:0x0402, B:127:0x0425, B:128:0x043c, B:131:0x044d, B:134:0x046a, B:135:0x047e, B:137:0x0488, B:139:0x0495, B:141:0x049b, B:142:0x04a4, B:143:0x04b2, B:145:0x04ca, B:155:0x0502, B:156:0x0517, B:158:0x0541, B:161:0x0559, B:164:0x059c, B:166:0x05c8, B:168:0x0607, B:169:0x060c, B:171:0x0614, B:172:0x0619, B:174:0x0621, B:175:0x0626, B:177:0x0635, B:179:0x0643, B:181:0x064b, B:182:0x0650, B:184:0x0659, B:185:0x065d, B:187:0x066a, B:188:0x066f, B:190:0x0696, B:192:0x069e, B:193:0x06a3, B:195:0x06ab, B:196:0x06ae, B:198:0x06c6, B:201:0x06ce, B:202:0x06e7, B:204:0x06ed, B:206:0x0701, B:208:0x070d, B:210:0x071a, B:214:0x0734, B:215:0x0744, B:219:0x074d, B:220:0x0750, B:222:0x076e, B:224:0x0772, B:226:0x0784, B:228:0x0788, B:230:0x0793, B:231:0x079c, B:233:0x07db, B:235:0x07e4, B:236:0x07e7, B:238:0x07f4, B:240:0x0814, B:241:0x0821, B:242:0x0857, B:244:0x085f, B:246:0x0869, B:247:0x0876, B:249:0x0880, B:250:0x088d, B:251:0x0899, B:253:0x089f, B:255:0x08cf, B:256:0x0915, B:257:0x091f, B:258:0x092b, B:260:0x0931, B:269:0x097e, B:270:0x09cc, B:272:0x09dc, B:286:0x0a40, B:275:0x09f4, B:277:0x09f8, B:263:0x093d, B:265:0x0969, B:281:0x0a11, B:282:0x0a28, B:285:0x0a2b, B:165:0x05ba, B:152:0x04e7, B:98:0x030e, B:99:0x0315, B:101:0x031b, B:103:0x0327, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:56:0x01a3, B:64:0x01e3, B:66:0x01e9, B:68:0x01f7, B:70:0x0208, B:73:0x020f, B:91:0x02b6, B:93:0x02c1, B:74:0x023d, B:75:0x025a, B:77:0x0261, B:79:0x0272, B:90:0x029a, B:89:0x0287, B:59:0x01b1, B:63:0x01d9), top: B:299:0x0124, inners: #0, #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x074d A[Catch: all -> 0x0a73, TryCatch #3 {all -> 0x0a73, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:95:0x02f8, B:104:0x032e, B:106:0x0372, B:108:0x0377, B:109:0x038e, B:113:0x03a1, B:115:0x03ba, B:117:0x03c1, B:118:0x03d8, B:123:0x0402, B:127:0x0425, B:128:0x043c, B:131:0x044d, B:134:0x046a, B:135:0x047e, B:137:0x0488, B:139:0x0495, B:141:0x049b, B:142:0x04a4, B:143:0x04b2, B:145:0x04ca, B:155:0x0502, B:156:0x0517, B:158:0x0541, B:161:0x0559, B:164:0x059c, B:166:0x05c8, B:168:0x0607, B:169:0x060c, B:171:0x0614, B:172:0x0619, B:174:0x0621, B:175:0x0626, B:177:0x0635, B:179:0x0643, B:181:0x064b, B:182:0x0650, B:184:0x0659, B:185:0x065d, B:187:0x066a, B:188:0x066f, B:190:0x0696, B:192:0x069e, B:193:0x06a3, B:195:0x06ab, B:196:0x06ae, B:198:0x06c6, B:201:0x06ce, B:202:0x06e7, B:204:0x06ed, B:206:0x0701, B:208:0x070d, B:210:0x071a, B:214:0x0734, B:215:0x0744, B:219:0x074d, B:220:0x0750, B:222:0x076e, B:224:0x0772, B:226:0x0784, B:228:0x0788, B:230:0x0793, B:231:0x079c, B:233:0x07db, B:235:0x07e4, B:236:0x07e7, B:238:0x07f4, B:240:0x0814, B:241:0x0821, B:242:0x0857, B:244:0x085f, B:246:0x0869, B:247:0x0876, B:249:0x0880, B:250:0x088d, B:251:0x0899, B:253:0x089f, B:255:0x08cf, B:256:0x0915, B:257:0x091f, B:258:0x092b, B:260:0x0931, B:269:0x097e, B:270:0x09cc, B:272:0x09dc, B:286:0x0a40, B:275:0x09f4, B:277:0x09f8, B:263:0x093d, B:265:0x0969, B:281:0x0a11, B:282:0x0a28, B:285:0x0a2b, B:165:0x05ba, B:152:0x04e7, B:98:0x030e, B:99:0x0315, B:101:0x031b, B:103:0x0327, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:56:0x01a3, B:64:0x01e3, B:66:0x01e9, B:68:0x01f7, B:70:0x0208, B:73:0x020f, B:91:0x02b6, B:93:0x02c1, B:74:0x023d, B:75:0x025a, B:77:0x0261, B:79:0x0272, B:90:0x029a, B:89:0x0287, B:59:0x01b1, B:63:0x01d9), top: B:299:0x0124, inners: #0, #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0793 A[Catch: all -> 0x0a73, TryCatch #3 {all -> 0x0a73, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:95:0x02f8, B:104:0x032e, B:106:0x0372, B:108:0x0377, B:109:0x038e, B:113:0x03a1, B:115:0x03ba, B:117:0x03c1, B:118:0x03d8, B:123:0x0402, B:127:0x0425, B:128:0x043c, B:131:0x044d, B:134:0x046a, B:135:0x047e, B:137:0x0488, B:139:0x0495, B:141:0x049b, B:142:0x04a4, B:143:0x04b2, B:145:0x04ca, B:155:0x0502, B:156:0x0517, B:158:0x0541, B:161:0x0559, B:164:0x059c, B:166:0x05c8, B:168:0x0607, B:169:0x060c, B:171:0x0614, B:172:0x0619, B:174:0x0621, B:175:0x0626, B:177:0x0635, B:179:0x0643, B:181:0x064b, B:182:0x0650, B:184:0x0659, B:185:0x065d, B:187:0x066a, B:188:0x066f, B:190:0x0696, B:192:0x069e, B:193:0x06a3, B:195:0x06ab, B:196:0x06ae, B:198:0x06c6, B:201:0x06ce, B:202:0x06e7, B:204:0x06ed, B:206:0x0701, B:208:0x070d, B:210:0x071a, B:214:0x0734, B:215:0x0744, B:219:0x074d, B:220:0x0750, B:222:0x076e, B:224:0x0772, B:226:0x0784, B:228:0x0788, B:230:0x0793, B:231:0x079c, B:233:0x07db, B:235:0x07e4, B:236:0x07e7, B:238:0x07f4, B:240:0x0814, B:241:0x0821, B:242:0x0857, B:244:0x085f, B:246:0x0869, B:247:0x0876, B:249:0x0880, B:250:0x088d, B:251:0x0899, B:253:0x089f, B:255:0x08cf, B:256:0x0915, B:257:0x091f, B:258:0x092b, B:260:0x0931, B:269:0x097e, B:270:0x09cc, B:272:0x09dc, B:286:0x0a40, B:275:0x09f4, B:277:0x09f8, B:263:0x093d, B:265:0x0969, B:281:0x0a11, B:282:0x0a28, B:285:0x0a2b, B:165:0x05ba, B:152:0x04e7, B:98:0x030e, B:99:0x0315, B:101:0x031b, B:103:0x0327, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:56:0x01a3, B:64:0x01e3, B:66:0x01e9, B:68:0x01f7, B:70:0x0208, B:73:0x020f, B:91:0x02b6, B:93:0x02c1, B:74:0x023d, B:75:0x025a, B:77:0x0261, B:79:0x0272, B:90:0x029a, B:89:0x0287, B:59:0x01b1, B:63:0x01d9), top: B:299:0x0124, inners: #0, #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x07db A[Catch: all -> 0x0a73, TryCatch #3 {all -> 0x0a73, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:95:0x02f8, B:104:0x032e, B:106:0x0372, B:108:0x0377, B:109:0x038e, B:113:0x03a1, B:115:0x03ba, B:117:0x03c1, B:118:0x03d8, B:123:0x0402, B:127:0x0425, B:128:0x043c, B:131:0x044d, B:134:0x046a, B:135:0x047e, B:137:0x0488, B:139:0x0495, B:141:0x049b, B:142:0x04a4, B:143:0x04b2, B:145:0x04ca, B:155:0x0502, B:156:0x0517, B:158:0x0541, B:161:0x0559, B:164:0x059c, B:166:0x05c8, B:168:0x0607, B:169:0x060c, B:171:0x0614, B:172:0x0619, B:174:0x0621, B:175:0x0626, B:177:0x0635, B:179:0x0643, B:181:0x064b, B:182:0x0650, B:184:0x0659, B:185:0x065d, B:187:0x066a, B:188:0x066f, B:190:0x0696, B:192:0x069e, B:193:0x06a3, B:195:0x06ab, B:196:0x06ae, B:198:0x06c6, B:201:0x06ce, B:202:0x06e7, B:204:0x06ed, B:206:0x0701, B:208:0x070d, B:210:0x071a, B:214:0x0734, B:215:0x0744, B:219:0x074d, B:220:0x0750, B:222:0x076e, B:224:0x0772, B:226:0x0784, B:228:0x0788, B:230:0x0793, B:231:0x079c, B:233:0x07db, B:235:0x07e4, B:236:0x07e7, B:238:0x07f4, B:240:0x0814, B:241:0x0821, B:242:0x0857, B:244:0x085f, B:246:0x0869, B:247:0x0876, B:249:0x0880, B:250:0x088d, B:251:0x0899, B:253:0x089f, B:255:0x08cf, B:256:0x0915, B:257:0x091f, B:258:0x092b, B:260:0x0931, B:269:0x097e, B:270:0x09cc, B:272:0x09dc, B:286:0x0a40, B:275:0x09f4, B:277:0x09f8, B:263:0x093d, B:265:0x0969, B:281:0x0a11, B:282:0x0a28, B:285:0x0a2b, B:165:0x05ba, B:152:0x04e7, B:98:0x030e, B:99:0x0315, B:101:0x031b, B:103:0x0327, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:56:0x01a3, B:64:0x01e3, B:66:0x01e9, B:68:0x01f7, B:70:0x0208, B:73:0x020f, B:91:0x02b6, B:93:0x02c1, B:74:0x023d, B:75:0x025a, B:77:0x0261, B:79:0x0272, B:90:0x029a, B:89:0x0287, B:59:0x01b1, B:63:0x01d9), top: B:299:0x0124, inners: #0, #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x07f4 A[Catch: all -> 0x0a73, TryCatch #3 {all -> 0x0a73, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:95:0x02f8, B:104:0x032e, B:106:0x0372, B:108:0x0377, B:109:0x038e, B:113:0x03a1, B:115:0x03ba, B:117:0x03c1, B:118:0x03d8, B:123:0x0402, B:127:0x0425, B:128:0x043c, B:131:0x044d, B:134:0x046a, B:135:0x047e, B:137:0x0488, B:139:0x0495, B:141:0x049b, B:142:0x04a4, B:143:0x04b2, B:145:0x04ca, B:155:0x0502, B:156:0x0517, B:158:0x0541, B:161:0x0559, B:164:0x059c, B:166:0x05c8, B:168:0x0607, B:169:0x060c, B:171:0x0614, B:172:0x0619, B:174:0x0621, B:175:0x0626, B:177:0x0635, B:179:0x0643, B:181:0x064b, B:182:0x0650, B:184:0x0659, B:185:0x065d, B:187:0x066a, B:188:0x066f, B:190:0x0696, B:192:0x069e, B:193:0x06a3, B:195:0x06ab, B:196:0x06ae, B:198:0x06c6, B:201:0x06ce, B:202:0x06e7, B:204:0x06ed, B:206:0x0701, B:208:0x070d, B:210:0x071a, B:214:0x0734, B:215:0x0744, B:219:0x074d, B:220:0x0750, B:222:0x076e, B:224:0x0772, B:226:0x0784, B:228:0x0788, B:230:0x0793, B:231:0x079c, B:233:0x07db, B:235:0x07e4, B:236:0x07e7, B:238:0x07f4, B:240:0x0814, B:241:0x0821, B:242:0x0857, B:244:0x085f, B:246:0x0869, B:247:0x0876, B:249:0x0880, B:250:0x088d, B:251:0x0899, B:253:0x089f, B:255:0x08cf, B:256:0x0915, B:257:0x091f, B:258:0x092b, B:260:0x0931, B:269:0x097e, B:270:0x09cc, B:272:0x09dc, B:286:0x0a40, B:275:0x09f4, B:277:0x09f8, B:263:0x093d, B:265:0x0969, B:281:0x0a11, B:282:0x0a28, B:285:0x0a2b, B:165:0x05ba, B:152:0x04e7, B:98:0x030e, B:99:0x0315, B:101:0x031b, B:103:0x0327, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:56:0x01a3, B:64:0x01e3, B:66:0x01e9, B:68:0x01f7, B:70:0x0208, B:73:0x020f, B:91:0x02b6, B:93:0x02c1, B:74:0x023d, B:75:0x025a, B:77:0x0261, B:79:0x0272, B:90:0x029a, B:89:0x0287, B:59:0x01b1, B:63:0x01d9), top: B:299:0x0124, inners: #0, #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0880 A[Catch: all -> 0x0a73, TryCatch #3 {all -> 0x0a73, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:95:0x02f8, B:104:0x032e, B:106:0x0372, B:108:0x0377, B:109:0x038e, B:113:0x03a1, B:115:0x03ba, B:117:0x03c1, B:118:0x03d8, B:123:0x0402, B:127:0x0425, B:128:0x043c, B:131:0x044d, B:134:0x046a, B:135:0x047e, B:137:0x0488, B:139:0x0495, B:141:0x049b, B:142:0x04a4, B:143:0x04b2, B:145:0x04ca, B:155:0x0502, B:156:0x0517, B:158:0x0541, B:161:0x0559, B:164:0x059c, B:166:0x05c8, B:168:0x0607, B:169:0x060c, B:171:0x0614, B:172:0x0619, B:174:0x0621, B:175:0x0626, B:177:0x0635, B:179:0x0643, B:181:0x064b, B:182:0x0650, B:184:0x0659, B:185:0x065d, B:187:0x066a, B:188:0x066f, B:190:0x0696, B:192:0x069e, B:193:0x06a3, B:195:0x06ab, B:196:0x06ae, B:198:0x06c6, B:201:0x06ce, B:202:0x06e7, B:204:0x06ed, B:206:0x0701, B:208:0x070d, B:210:0x071a, B:214:0x0734, B:215:0x0744, B:219:0x074d, B:220:0x0750, B:222:0x076e, B:224:0x0772, B:226:0x0784, B:228:0x0788, B:230:0x0793, B:231:0x079c, B:233:0x07db, B:235:0x07e4, B:236:0x07e7, B:238:0x07f4, B:240:0x0814, B:241:0x0821, B:242:0x0857, B:244:0x085f, B:246:0x0869, B:247:0x0876, B:249:0x0880, B:250:0x088d, B:251:0x0899, B:253:0x089f, B:255:0x08cf, B:256:0x0915, B:257:0x091f, B:258:0x092b, B:260:0x0931, B:269:0x097e, B:270:0x09cc, B:272:0x09dc, B:286:0x0a40, B:275:0x09f4, B:277:0x09f8, B:263:0x093d, B:265:0x0969, B:281:0x0a11, B:282:0x0a28, B:285:0x0a2b, B:165:0x05ba, B:152:0x04e7, B:98:0x030e, B:99:0x0315, B:101:0x031b, B:103:0x0327, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:56:0x01a3, B:64:0x01e3, B:66:0x01e9, B:68:0x01f7, B:70:0x0208, B:73:0x020f, B:91:0x02b6, B:93:0x02c1, B:74:0x023d, B:75:0x025a, B:77:0x0261, B:79:0x0272, B:90:0x029a, B:89:0x0287, B:59:0x01b1, B:63:0x01d9), top: B:299:0x0124, inners: #0, #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x089f A[Catch: all -> 0x0a73, TRY_LEAVE, TryCatch #3 {all -> 0x0a73, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:95:0x02f8, B:104:0x032e, B:106:0x0372, B:108:0x0377, B:109:0x038e, B:113:0x03a1, B:115:0x03ba, B:117:0x03c1, B:118:0x03d8, B:123:0x0402, B:127:0x0425, B:128:0x043c, B:131:0x044d, B:134:0x046a, B:135:0x047e, B:137:0x0488, B:139:0x0495, B:141:0x049b, B:142:0x04a4, B:143:0x04b2, B:145:0x04ca, B:155:0x0502, B:156:0x0517, B:158:0x0541, B:161:0x0559, B:164:0x059c, B:166:0x05c8, B:168:0x0607, B:169:0x060c, B:171:0x0614, B:172:0x0619, B:174:0x0621, B:175:0x0626, B:177:0x0635, B:179:0x0643, B:181:0x064b, B:182:0x0650, B:184:0x0659, B:185:0x065d, B:187:0x066a, B:188:0x066f, B:190:0x0696, B:192:0x069e, B:193:0x06a3, B:195:0x06ab, B:196:0x06ae, B:198:0x06c6, B:201:0x06ce, B:202:0x06e7, B:204:0x06ed, B:206:0x0701, B:208:0x070d, B:210:0x071a, B:214:0x0734, B:215:0x0744, B:219:0x074d, B:220:0x0750, B:222:0x076e, B:224:0x0772, B:226:0x0784, B:228:0x0788, B:230:0x0793, B:231:0x079c, B:233:0x07db, B:235:0x07e4, B:236:0x07e7, B:238:0x07f4, B:240:0x0814, B:241:0x0821, B:242:0x0857, B:244:0x085f, B:246:0x0869, B:247:0x0876, B:249:0x0880, B:250:0x088d, B:251:0x0899, B:253:0x089f, B:255:0x08cf, B:256:0x0915, B:257:0x091f, B:258:0x092b, B:260:0x0931, B:269:0x097e, B:270:0x09cc, B:272:0x09dc, B:286:0x0a40, B:275:0x09f4, B:277:0x09f8, B:263:0x093d, B:265:0x0969, B:281:0x0a11, B:282:0x0a28, B:285:0x0a2b, B:165:0x05ba, B:152:0x04e7, B:98:0x030e, B:99:0x0315, B:101:0x031b, B:103:0x0327, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:56:0x01a3, B:64:0x01e3, B:66:0x01e9, B:68:0x01f7, B:70:0x0208, B:73:0x020f, B:91:0x02b6, B:93:0x02c1, B:74:0x023d, B:75:0x025a, B:77:0x0261, B:79:0x0272, B:90:0x029a, B:89:0x0287, B:59:0x01b1, B:63:0x01d9), top: B:299:0x0124, inners: #0, #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0931 A[Catch: all -> 0x0a73, TryCatch #3 {all -> 0x0a73, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:95:0x02f8, B:104:0x032e, B:106:0x0372, B:108:0x0377, B:109:0x038e, B:113:0x03a1, B:115:0x03ba, B:117:0x03c1, B:118:0x03d8, B:123:0x0402, B:127:0x0425, B:128:0x043c, B:131:0x044d, B:134:0x046a, B:135:0x047e, B:137:0x0488, B:139:0x0495, B:141:0x049b, B:142:0x04a4, B:143:0x04b2, B:145:0x04ca, B:155:0x0502, B:156:0x0517, B:158:0x0541, B:161:0x0559, B:164:0x059c, B:166:0x05c8, B:168:0x0607, B:169:0x060c, B:171:0x0614, B:172:0x0619, B:174:0x0621, B:175:0x0626, B:177:0x0635, B:179:0x0643, B:181:0x064b, B:182:0x0650, B:184:0x0659, B:185:0x065d, B:187:0x066a, B:188:0x066f, B:190:0x0696, B:192:0x069e, B:193:0x06a3, B:195:0x06ab, B:196:0x06ae, B:198:0x06c6, B:201:0x06ce, B:202:0x06e7, B:204:0x06ed, B:206:0x0701, B:208:0x070d, B:210:0x071a, B:214:0x0734, B:215:0x0744, B:219:0x074d, B:220:0x0750, B:222:0x076e, B:224:0x0772, B:226:0x0784, B:228:0x0788, B:230:0x0793, B:231:0x079c, B:233:0x07db, B:235:0x07e4, B:236:0x07e7, B:238:0x07f4, B:240:0x0814, B:241:0x0821, B:242:0x0857, B:244:0x085f, B:246:0x0869, B:247:0x0876, B:249:0x0880, B:250:0x088d, B:251:0x0899, B:253:0x089f, B:255:0x08cf, B:256:0x0915, B:257:0x091f, B:258:0x092b, B:260:0x0931, B:269:0x097e, B:270:0x09cc, B:272:0x09dc, B:286:0x0a40, B:275:0x09f4, B:277:0x09f8, B:263:0x093d, B:265:0x0969, B:281:0x0a11, B:282:0x0a28, B:285:0x0a2b, B:165:0x05ba, B:152:0x04e7, B:98:0x030e, B:99:0x0315, B:101:0x031b, B:103:0x0327, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:56:0x01a3, B:64:0x01e3, B:66:0x01e9, B:68:0x01f7, B:70:0x0208, B:73:0x020f, B:91:0x02b6, B:93:0x02c1, B:74:0x023d, B:75:0x025a, B:77:0x0261, B:79:0x0272, B:90:0x029a, B:89:0x0287, B:59:0x01b1, B:63:0x01d9), top: B:299:0x0124, inners: #0, #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x09dc A[Catch: SQLiteException -> 0x09f7, all -> 0x0a73, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x09f7, blocks: (B:270:0x09cc, B:272:0x09dc), top: B:295:0x09cc, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x09f2  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x093d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016b A[Catch: all -> 0x0a73, TRY_ENTER, TryCatch #3 {all -> 0x0a73, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:95:0x02f8, B:104:0x032e, B:106:0x0372, B:108:0x0377, B:109:0x038e, B:113:0x03a1, B:115:0x03ba, B:117:0x03c1, B:118:0x03d8, B:123:0x0402, B:127:0x0425, B:128:0x043c, B:131:0x044d, B:134:0x046a, B:135:0x047e, B:137:0x0488, B:139:0x0495, B:141:0x049b, B:142:0x04a4, B:143:0x04b2, B:145:0x04ca, B:155:0x0502, B:156:0x0517, B:158:0x0541, B:161:0x0559, B:164:0x059c, B:166:0x05c8, B:168:0x0607, B:169:0x060c, B:171:0x0614, B:172:0x0619, B:174:0x0621, B:175:0x0626, B:177:0x0635, B:179:0x0643, B:181:0x064b, B:182:0x0650, B:184:0x0659, B:185:0x065d, B:187:0x066a, B:188:0x066f, B:190:0x0696, B:192:0x069e, B:193:0x06a3, B:195:0x06ab, B:196:0x06ae, B:198:0x06c6, B:201:0x06ce, B:202:0x06e7, B:204:0x06ed, B:206:0x0701, B:208:0x070d, B:210:0x071a, B:214:0x0734, B:215:0x0744, B:219:0x074d, B:220:0x0750, B:222:0x076e, B:224:0x0772, B:226:0x0784, B:228:0x0788, B:230:0x0793, B:231:0x079c, B:233:0x07db, B:235:0x07e4, B:236:0x07e7, B:238:0x07f4, B:240:0x0814, B:241:0x0821, B:242:0x0857, B:244:0x085f, B:246:0x0869, B:247:0x0876, B:249:0x0880, B:250:0x088d, B:251:0x0899, B:253:0x089f, B:255:0x08cf, B:256:0x0915, B:257:0x091f, B:258:0x092b, B:260:0x0931, B:269:0x097e, B:270:0x09cc, B:272:0x09dc, B:286:0x0a40, B:275:0x09f4, B:277:0x09f8, B:263:0x093d, B:265:0x0969, B:281:0x0a11, B:282:0x0a28, B:285:0x0a2b, B:165:0x05ba, B:152:0x04e7, B:98:0x030e, B:99:0x0315, B:101:0x031b, B:103:0x0327, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:56:0x01a3, B:64:0x01e3, B:66:0x01e9, B:68:0x01f7, B:70:0x0208, B:73:0x020f, B:91:0x02b6, B:93:0x02c1, B:74:0x023d, B:75:0x025a, B:77:0x0261, B:79:0x0272, B:90:0x029a, B:89:0x0287, B:59:0x01b1, B:63:0x01d9), top: B:299:0x0124, inners: #0, #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e9 A[Catch: all -> 0x0a73, TryCatch #3 {all -> 0x0a73, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:95:0x02f8, B:104:0x032e, B:106:0x0372, B:108:0x0377, B:109:0x038e, B:113:0x03a1, B:115:0x03ba, B:117:0x03c1, B:118:0x03d8, B:123:0x0402, B:127:0x0425, B:128:0x043c, B:131:0x044d, B:134:0x046a, B:135:0x047e, B:137:0x0488, B:139:0x0495, B:141:0x049b, B:142:0x04a4, B:143:0x04b2, B:145:0x04ca, B:155:0x0502, B:156:0x0517, B:158:0x0541, B:161:0x0559, B:164:0x059c, B:166:0x05c8, B:168:0x0607, B:169:0x060c, B:171:0x0614, B:172:0x0619, B:174:0x0621, B:175:0x0626, B:177:0x0635, B:179:0x0643, B:181:0x064b, B:182:0x0650, B:184:0x0659, B:185:0x065d, B:187:0x066a, B:188:0x066f, B:190:0x0696, B:192:0x069e, B:193:0x06a3, B:195:0x06ab, B:196:0x06ae, B:198:0x06c6, B:201:0x06ce, B:202:0x06e7, B:204:0x06ed, B:206:0x0701, B:208:0x070d, B:210:0x071a, B:214:0x0734, B:215:0x0744, B:219:0x074d, B:220:0x0750, B:222:0x076e, B:224:0x0772, B:226:0x0784, B:228:0x0788, B:230:0x0793, B:231:0x079c, B:233:0x07db, B:235:0x07e4, B:236:0x07e7, B:238:0x07f4, B:240:0x0814, B:241:0x0821, B:242:0x0857, B:244:0x085f, B:246:0x0869, B:247:0x0876, B:249:0x0880, B:250:0x088d, B:251:0x0899, B:253:0x089f, B:255:0x08cf, B:256:0x0915, B:257:0x091f, B:258:0x092b, B:260:0x0931, B:269:0x097e, B:270:0x09cc, B:272:0x09dc, B:286:0x0a40, B:275:0x09f4, B:277:0x09f8, B:263:0x093d, B:265:0x0969, B:281:0x0a11, B:282:0x0a28, B:285:0x0a2b, B:165:0x05ba, B:152:0x04e7, B:98:0x030e, B:99:0x0315, B:101:0x031b, B:103:0x0327, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:56:0x01a3, B:64:0x01e3, B:66:0x01e9, B:68:0x01f7, B:70:0x0208, B:73:0x020f, B:91:0x02b6, B:93:0x02c1, B:74:0x023d, B:75:0x025a, B:77:0x0261, B:79:0x0272, B:90:0x029a, B:89:0x0287, B:59:0x01b1, B:63:0x01d9), top: B:299:0x0124, inners: #0, #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02c1 A[Catch: all -> 0x0a73, TryCatch #3 {all -> 0x0a73, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:95:0x02f8, B:104:0x032e, B:106:0x0372, B:108:0x0377, B:109:0x038e, B:113:0x03a1, B:115:0x03ba, B:117:0x03c1, B:118:0x03d8, B:123:0x0402, B:127:0x0425, B:128:0x043c, B:131:0x044d, B:134:0x046a, B:135:0x047e, B:137:0x0488, B:139:0x0495, B:141:0x049b, B:142:0x04a4, B:143:0x04b2, B:145:0x04ca, B:155:0x0502, B:156:0x0517, B:158:0x0541, B:161:0x0559, B:164:0x059c, B:166:0x05c8, B:168:0x0607, B:169:0x060c, B:171:0x0614, B:172:0x0619, B:174:0x0621, B:175:0x0626, B:177:0x0635, B:179:0x0643, B:181:0x064b, B:182:0x0650, B:184:0x0659, B:185:0x065d, B:187:0x066a, B:188:0x066f, B:190:0x0696, B:192:0x069e, B:193:0x06a3, B:195:0x06ab, B:196:0x06ae, B:198:0x06c6, B:201:0x06ce, B:202:0x06e7, B:204:0x06ed, B:206:0x0701, B:208:0x070d, B:210:0x071a, B:214:0x0734, B:215:0x0744, B:219:0x074d, B:220:0x0750, B:222:0x076e, B:224:0x0772, B:226:0x0784, B:228:0x0788, B:230:0x0793, B:231:0x079c, B:233:0x07db, B:235:0x07e4, B:236:0x07e7, B:238:0x07f4, B:240:0x0814, B:241:0x0821, B:242:0x0857, B:244:0x085f, B:246:0x0869, B:247:0x0876, B:249:0x0880, B:250:0x088d, B:251:0x0899, B:253:0x089f, B:255:0x08cf, B:256:0x0915, B:257:0x091f, B:258:0x092b, B:260:0x0931, B:269:0x097e, B:270:0x09cc, B:272:0x09dc, B:286:0x0a40, B:275:0x09f4, B:277:0x09f8, B:263:0x093d, B:265:0x0969, B:281:0x0a11, B:282:0x0a28, B:285:0x0a2b, B:165:0x05ba, B:152:0x04e7, B:98:0x030e, B:99:0x0315, B:101:0x031b, B:103:0x0327, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:56:0x01a3, B:64:0x01e3, B:66:0x01e9, B:68:0x01f7, B:70:0x0208, B:73:0x020f, B:91:0x02b6, B:93:0x02c1, B:74:0x023d, B:75:0x025a, B:77:0x0261, B:79:0x0272, B:90:0x029a, B:89:0x0287, B:59:0x01b1, B:63:0x01d9), top: B:299:0x0124, inners: #0, #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x030e A[Catch: all -> 0x0a73, TryCatch #3 {all -> 0x0a73, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:95:0x02f8, B:104:0x032e, B:106:0x0372, B:108:0x0377, B:109:0x038e, B:113:0x03a1, B:115:0x03ba, B:117:0x03c1, B:118:0x03d8, B:123:0x0402, B:127:0x0425, B:128:0x043c, B:131:0x044d, B:134:0x046a, B:135:0x047e, B:137:0x0488, B:139:0x0495, B:141:0x049b, B:142:0x04a4, B:143:0x04b2, B:145:0x04ca, B:155:0x0502, B:156:0x0517, B:158:0x0541, B:161:0x0559, B:164:0x059c, B:166:0x05c8, B:168:0x0607, B:169:0x060c, B:171:0x0614, B:172:0x0619, B:174:0x0621, B:175:0x0626, B:177:0x0635, B:179:0x0643, B:181:0x064b, B:182:0x0650, B:184:0x0659, B:185:0x065d, B:187:0x066a, B:188:0x066f, B:190:0x0696, B:192:0x069e, B:193:0x06a3, B:195:0x06ab, B:196:0x06ae, B:198:0x06c6, B:201:0x06ce, B:202:0x06e7, B:204:0x06ed, B:206:0x0701, B:208:0x070d, B:210:0x071a, B:214:0x0734, B:215:0x0744, B:219:0x074d, B:220:0x0750, B:222:0x076e, B:224:0x0772, B:226:0x0784, B:228:0x0788, B:230:0x0793, B:231:0x079c, B:233:0x07db, B:235:0x07e4, B:236:0x07e7, B:238:0x07f4, B:240:0x0814, B:241:0x0821, B:242:0x0857, B:244:0x085f, B:246:0x0869, B:247:0x0876, B:249:0x0880, B:250:0x088d, B:251:0x0899, B:253:0x089f, B:255:0x08cf, B:256:0x0915, B:257:0x091f, B:258:0x092b, B:260:0x0931, B:269:0x097e, B:270:0x09cc, B:272:0x09dc, B:286:0x0a40, B:275:0x09f4, B:277:0x09f8, B:263:0x093d, B:265:0x0969, B:281:0x0a11, B:282:0x0a28, B:285:0x0a2b, B:165:0x05ba, B:152:0x04e7, B:98:0x030e, B:99:0x0315, B:101:0x031b, B:103:0x0327, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:56:0x01a3, B:64:0x01e3, B:66:0x01e9, B:68:0x01f7, B:70:0x0208, B:73:0x020f, B:91:0x02b6, B:93:0x02c1, B:74:0x023d, B:75:0x025a, B:77:0x0261, B:79:0x0272, B:90:0x029a, B:89:0x0287, B:59:0x01b1, B:63:0x01d9), top: B:299:0x0124, inners: #0, #1, #5 }] */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3934D(com.google.android.gms.measurement.internal.zzaw r35, com.google.android.gms.measurement.internal.zzq r36) {
        /*
            Method dump skipped, instructions count: 2690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.yb8.m3934D(com.google.android.gms.measurement.internal.zzaw, com.google.android.gms.measurement.internal.zzq):void");
    }

    /* renamed from: E */
    public final boolean m3933E() {
        hk5 m14155w;
        String str;
        mo3882r().mo6991f();
        FileLock fileLock = this.f33511v;
        if (fileLock != null && fileLock.isValid()) {
            mo3895i().m14156v().m20653a("Storage concurrent access okay");
            return true;
        }
        this.f33492c.f25143a.m24020z();
        try {
            FileChannel channel = new RandomAccessFile(new File(this.f33501l.mo3905d().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.f33512w = channel;
            FileLock tryLock = channel.tryLock();
            this.f33511v = tryLock;
            if (tryLock != null) {
                mo3895i().m14156v().m20653a("Storage concurrent access okay");
                return true;
            }
            mo3895i().m14160q().m20653a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            e = e;
            m14155w = mo3895i().m14160q();
            str = "Failed to acquire storage lock";
            m14155w.m20652b(str, e);
            return false;
        } catch (IOException e2) {
            e = e2;
            m14155w = mo3895i().m14160q();
            str = "Failed to access storage lock file";
            m14155w.m20652b(str, e);
            return false;
        } catch (OverlappingFileLockException e3) {
            e = e3;
            m14155w = mo3895i().m14155w();
            str = "Storage lock already acquired";
            m14155w.m20652b(str, e);
            return false;
        }
    }

    /* renamed from: F */
    public final long m3932F() {
        long mo15860a = mo3909b().mo15860a();
        d88 d88Var = this.f33498i;
        d88Var.m13533g();
        d88Var.mo6991f();
        long m4400a = d88Var.f6619i.m4400a();
        if (m4400a == 0) {
            m4400a = d88Var.f25143a.m24045N().m24462u().nextInt(86400000) + 1;
            d88Var.f6619i.m4399b(m4400a);
        }
        return ((((mo15860a + m4400a) / 1000) / 60) / 60) / 24;
    }

    /* renamed from: I */
    public final zzq m3929I(String str) {
        hk5 m14161p;
        String str2;
        String str3;
        String str4 = str;
        uh2 uh2Var = this.f33492c;
        m3920R(uh2Var);
        qu7 m8166R = uh2Var.m8166R(str4);
        if (m8166R == null || TextUtils.isEmpty(m8166R.m12163g0())) {
            m14161p = mo3895i().m14161p();
            str2 = "No app data available; dropping";
            str3 = str4;
        } else {
            Boolean m3928J = m3928J(m8166R);
            if (m3928J == null || m3928J.booleanValue()) {
                String m12159i0 = m8166R.m12159i0();
                String m12163g0 = m8166R.m12163g0();
                long m12191L = m8166R.m12191L();
                String m12165f0 = m8166R.m12165f0();
                long m12180W = m8166R.m12180W();
                long m12183T = m8166R.m12183T();
                boolean m12193J = m8166R.m12193J();
                String m12161h0 = m8166R.m12161h0();
                m8166R.m12202A();
                return new zzq(str, m12159i0, m12163g0, m12191L, m12165f0, m12180W, m12183T, (String) null, m12193J, false, m12161h0, 0L, 0L, 0, m8166R.m12194I(), false, m8166R.m12173b0(), m8166R.m12175a0(), m8166R.m12182U(), m8166R.m12172c(), (String) null, m3916V(str).m25424h(), "", (String) null);
            }
            m14161p = mo3895i().m14160q();
            str2 = "App version does not match; dropping. appId";
            str3 = om5.m14152z(str);
        }
        m14161p.m20652b(str2, str3);
        return null;
    }

    /* renamed from: J */
    public final Boolean m3928J(qu7 qu7Var) {
        try {
            if (qu7Var.m12191L() != -2147483648L) {
                if (qu7Var.m12191L() == ez1.m22979a(this.f33501l.mo3905d()).m19341f(qu7Var.m12169d0(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = ez1.m22979a(this.f33501l.mo3905d()).m19341f(qu7Var.m12169d0(), 0).versionName;
                String m12163g0 = qu7Var.m12163g0();
                if (m12163g0 != null && m12163g0.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: K */
    public final void m3927K() {
        mo3882r().mo6991f();
        if (this.f33508s || this.f33509t || this.f33510u) {
            mo3895i().m14156v().m20650d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f33508s), Boolean.valueOf(this.f33509t), Boolean.valueOf(this.f33510u));
            return;
        }
        mo3895i().m14156v().m20653a("Stopping uploading service(s)");
        List<Runnable> list = this.f33505p;
        if (list == null) {
            return;
        }
        for (Runnable runnable : list) {
            runnable.run();
        }
        ((List) ry0.m10830j(this.f33505p)).clear();
    }

    /* renamed from: L */
    public final void m3926L(g37 g37Var, long j, boolean z) {
        String str = true != z ? "_lte" : "_se";
        uh2 uh2Var = this.f33492c;
        m3920R(uh2Var);
        mc8 m8160X = uh2Var.m8160X(g37Var.m22003i0(), str);
        mc8 mc8Var = (m8160X == null || m8160X.f18798e == null) ? new mc8(g37Var.m22003i0(), "auto", str, mo3909b().mo15860a(), Long.valueOf(j)) : new mc8(g37Var.m22003i0(), "auto", str, mo3909b().mo15860a(), Long.valueOf(((Long) m8160X.f18798e).longValue() + j));
        td7 m6125G = we7.m6125G();
        m6125G.m9265x(str);
        m6125G.m9264y(mo3909b().mo15860a());
        m6125G.m9266w(((Long) mc8Var.f18798e).longValue());
        we7 we7Var = (we7) m6125G.m3975m();
        int m23577w = ec8.m23577w(g37Var, str);
        if (m23577w >= 0) {
            g37Var.m22006f0(m23577w, we7Var);
        } else {
            g37Var.m21980y0(we7Var);
        }
        if (j > 0) {
            uh2 uh2Var2 = this.f33492c;
            m3920R(uh2Var2);
            uh2Var2.m8137x(mc8Var);
            mo3895i().m14156v().m20651c("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", mc8Var.f18798e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x021c  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3925M() {
        j65 j65Var;
        long j;
        mo3882r().mo6991f();
        m3903e();
        if (this.f33504o > 0) {
            long abs = 3600000 - Math.abs(mo3909b().mo15859b() - this.f33504o);
            if (abs > 0) {
                mo3895i().m14156v().m20652b("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(abs));
                m3912Z().m14773c();
                ka8 ka8Var = this.f33494e;
                m3920R(ka8Var);
                ka8Var.m17851l();
                return;
            }
            this.f33504o = 0L;
        }
        if (!this.f33501l.m24028q() || !m3923O()) {
            mo3895i().m14156v().m20653a("Nothing to upload or uploading impossible");
            m3912Z().m14773c();
            ka8 ka8Var2 = this.f33494e;
            m3920R(ka8Var2);
            ka8Var2.m17851l();
            return;
        }
        long mo15860a = mo3909b().mo15860a();
        m3917U();
        long max = Math.max(0L, ((Long) m75.f18494B.m18786a(null)).longValue());
        uh2 uh2Var = this.f33492c;
        m3920R(uh2Var);
        boolean z = true;
        if (!uh2Var.m8141t()) {
            uh2 uh2Var2 = this.f33492c;
            m3920R(uh2Var2);
            if (!uh2Var2.m8142s()) {
                z = false;
            }
        }
        if (z) {
            String m12657u = m3917U().m12657u();
            if (TextUtils.isEmpty(m12657u) || ".none.".equals(m12657u)) {
                m3917U();
                j65Var = m75.f18561v;
            } else {
                m3917U();
                j65Var = m75.f18563w;
            }
        } else {
            m3917U();
            j65Var = m75.f18559u;
        }
        long max2 = Math.max(0L, ((Long) j65Var.m18786a(null)).longValue());
        long m4400a = this.f33498i.f6617g.m4400a();
        long m4400a2 = this.f33498i.f6618h.m4400a();
        uh2 uh2Var3 = this.f33492c;
        m3920R(uh2Var3);
        boolean z2 = z;
        long m8171M = uh2Var3.m8171M();
        uh2 uh2Var4 = this.f33492c;
        m3920R(uh2Var4);
        long max3 = Math.max(m8171M, uh2Var4.m8170N());
        if (max3 != 0) {
            long abs2 = mo15860a - Math.abs(max3 - mo15860a);
            long abs3 = Math.abs(m4400a - mo15860a);
            long abs4 = mo15860a - Math.abs(m4400a2 - mo15860a);
            long max4 = Math.max(mo15860a - abs3, abs4);
            j = abs2 + max;
            if (z2 && max4 > 0) {
                j = Math.min(abs2, max4) + max2;
            }
            ec8 ec8Var = this.f33496g;
            m3920R(ec8Var);
            if (!ec8Var.m23591M(max4, max2)) {
                j = max4 + max2;
            }
            if (abs4 != 0 && abs4 >= abs2) {
                int i = 0;
                while (true) {
                    m3917U();
                    if (i >= Math.min(20, Math.max(0, ((Integer) m75.f18496D.m18786a(null)).intValue()))) {
                        break;
                    }
                    m3917U();
                    j += Math.max(0L, ((Long) m75.f18495C.m18786a(null)).longValue()) * (1 << i);
                    if (j > abs4) {
                        break;
                    }
                    i++;
                }
            }
            if (j != 0) {
                mo3895i().m14156v().m20653a("Next upload time is 0");
                m3912Z().m14773c();
                ka8 ka8Var3 = this.f33494e;
                m3920R(ka8Var3);
                ka8Var3.m17851l();
                return;
            }
            ht5 ht5Var = this.f33491b;
            m3920R(ht5Var);
            if (!ht5Var.m20430l()) {
                mo3895i().m14156v().m20653a("No network");
                m3912Z().m14774b();
                ka8 ka8Var4 = this.f33494e;
                m3920R(ka8Var4);
                ka8Var4.m17851l();
                return;
            }
            long m4400a3 = this.f33498i.f6616f.m4400a();
            m3917U();
            long max5 = Math.max(0L, ((Long) m75.f18555s.m18786a(null)).longValue());
            ec8 ec8Var2 = this.f33496g;
            m3920R(ec8Var2);
            if (!ec8Var2.m23591M(m4400a3, max5)) {
                j = Math.max(j, m4400a3 + max5);
            }
            m3912Z().m14773c();
            long mo15860a2 = j - mo3909b().mo15860a();
            if (mo15860a2 <= 0) {
                m3917U();
                mo15860a2 = Math.max(0L, ((Long) m75.f18565x.m18786a(null)).longValue());
                this.f33498i.f6617g.m4399b(mo3909b().mo15860a());
            }
            mo3895i().m14156v().m20652b("Upload scheduled in approximately ms", Long.valueOf(mo15860a2));
            ka8 ka8Var5 = this.f33494e;
            m3920R(ka8Var5);
            ka8Var5.m17850m(mo15860a2);
            return;
        }
        j = 0;
        if (j != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:372:0x0b76, code lost:
        if (r10 > (com.daaw.qa2.m12669g() + r8)) goto L404;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03a7 A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:421:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x046b A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:421:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04c5 A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:421:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x081f A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:421:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0868 A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:421:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0888 A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:421:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0909 A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:421:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0932 A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:421:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0b66 A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:421:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0bed A[Catch: all -> 0x0d0d, TRY_LEAVE, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:421:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0c09 A[Catch: SQLiteException -> 0x0c21, all -> 0x0d0d, TRY_LEAVE, TryCatch #2 {SQLiteException -> 0x0c21, blocks: (B:379:0x0bfa, B:381:0x0c09), top: B:419:0x0bfa, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0c70  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0ca1 A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:421:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cb  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3924N(String str, long j) {
        int i;
        String str2;
        g37 g37Var;
        qb8 qb8Var;
        List list;
        int i2;
        int delete;
        uh2 uh2Var;
        uh2 uh2Var2;
        j47 j47Var;
        long mo15860a;
        long m19067G1;
        Throwable th;
        hk5 m14160q;
        String str3;
        Object m14152z;
        ContentValues contentValues;
        long parseLong;
        int m21614q;
        long j2;
        SecureRandom secureRandom;
        g37 g37Var2;
        Long l;
        qb8 qb8Var2;
        HashMap hashMap;
        long m24465s0;
        HashMap hashMap2;
        String m22330G;
        to2 m8906a;
        g37 g37Var3;
        fs6 fs6Var;
        int i3;
        String str4;
        g37 g37Var4;
        fs6 fs6Var2;
        int i4;
        fs6 fs6Var3;
        int i5;
        int i6;
        g37 g37Var5;
        int i7;
        fs6 fs6Var4;
        int i8;
        int i9;
        fs6 fs6Var5;
        char c;
        String str5 = "_npa";
        String str6 = "_ai";
        uh2 uh2Var3 = this.f33492c;
        m3920R(uh2Var3);
        uh2Var3.m8153e0();
        try {
            qb8 qb8Var3 = new qb8(this, null);
            uh2 uh2Var4 = this.f33492c;
            m3920R(uh2Var4);
            uh2Var4.m8177G(null, j, this.f33515z, qb8Var3);
            List list2 = qb8Var3.f23848c;
            if (list2 != null && !list2.isEmpty()) {
                g37 g37Var6 = (g37) qb8Var3.f23846a.m18675A();
                g37Var6.m22042D0();
                fs6 fs6Var6 = null;
                fs6 fs6Var7 = null;
                int i10 = 0;
                int i11 = 0;
                int i12 = -1;
                int i13 = -1;
                int i14 = 0;
                while (true) {
                    i = i14;
                    str2 = str5;
                    String str7 = str6;
                    if (i10 >= qb8Var3.f23848c.size()) {
                        break;
                    }
                    fs6 fs6Var8 = (fs6) ((it6) qb8Var3.f23848c.get(i10)).m18675A();
                    gh6 gh6Var = this.f33490a;
                    m3920R(gh6Var);
                    int i15 = i11;
                    if (gh6Var.m21628F(qb8Var3.f23846a.m19031S1(), fs6Var8.m22330G())) {
                        mo3895i().m14155w().m20651c("Dropping blocked raw event. appId", om5.m14152z(qb8Var3.f23846a.m19031S1()), this.f33501l.m24055D().m5133d(fs6Var8.m22330G()));
                        gh6 gh6Var2 = this.f33490a;
                        m3920R(gh6Var2);
                        if (!gh6Var2.m21630D(qb8Var3.f23846a.m19031S1())) {
                            gh6 gh6Var3 = this.f33490a;
                            m3920R(gh6Var3);
                            if (!gh6Var3.m21627G(qb8Var3.f23846a.m19031S1()) && !"_err".equals(fs6Var8.m22330G())) {
                                m3896h0().m24513B(this.f33489E, qb8Var3.f23846a.m19031S1(), 11, "_ev", fs6Var8.m22330G(), 0);
                            }
                        }
                        i8 = i10;
                        fs6Var = fs6Var6;
                        i14 = i;
                        i11 = i15;
                        g37Var5 = g37Var6;
                    } else {
                        if (fs6Var8.m22330G().equals(dh7.m24378a(str7))) {
                            fs6Var8.m22336A(str7);
                            str7 = str7;
                            mo3895i().m14156v().m20653a("Renaming ad_impression to _ai");
                            if (Log.isLoggable(mo3895i().m14168C(), 5)) {
                                int i16 = 0;
                                while (i16 < fs6Var8.m22327s()) {
                                    int i17 = i10;
                                    if ("ad_platform".equals(fs6Var8.m22331F(i16).m19286J()) && !fs6Var8.m22331F(i16).m19285K().isEmpty() && "admob".equalsIgnoreCase(fs6Var8.m22331F(i16).m19285K())) {
                                        mo3895i().m14154x().m20653a("AdMob ad impression logged from app. Potentially duplicative.");
                                    }
                                    i16++;
                                    i10 = i17;
                                }
                            }
                        }
                        int i18 = i10;
                        gh6 gh6Var4 = this.f33490a;
                        m3920R(gh6Var4);
                        boolean m21629E = gh6Var4.m21629E(qb8Var3.f23846a.m19031S1(), fs6Var8.m22330G());
                        if (m21629E) {
                            fs6Var = fs6Var6;
                            i3 = i12;
                        } else {
                            m3920R(this.f33496g);
                            String m22330G2 = fs6Var8.m22330G();
                            ry0.m10834f(m22330G2);
                            i3 = i12;
                            int hashCode = m22330G2.hashCode();
                            fs6Var = fs6Var6;
                            if (hashCode == 94660) {
                                if (m22330G2.equals("_in")) {
                                    c = 0;
                                    if (c != 0) {
                                    }
                                }
                                c = 65535;
                                if (c != 0) {
                                }
                            } else if (hashCode != 95025) {
                                if (hashCode == 95027 && m22330G2.equals("_ui")) {
                                    c = 1;
                                    if (c != 0 && c != 1 && c != 2) {
                                        g37Var4 = g37Var6;
                                        str4 = "_et";
                                        fs6Var2 = fs6Var7;
                                        i4 = i13;
                                        m21629E = false;
                                        if (m21629E) {
                                            ArrayList arrayList = new ArrayList(fs6Var8.m22329H());
                                            int i19 = -1;
                                            int i20 = -1;
                                            for (int i21 = 0; i21 < arrayList.size(); i21++) {
                                                if ("value".equals(((ix6) arrayList.get(i21)).m19286J())) {
                                                    i19 = i21;
                                                } else if ("currency".equals(((ix6) arrayList.get(i21)).m19286J())) {
                                                    i20 = i21;
                                                }
                                            }
                                            if (i19 != -1) {
                                                if (((ix6) arrayList.get(i19)).m19271Y() || ((ix6) arrayList.get(i19)).m19273W()) {
                                                    if (i20 != -1) {
                                                        String m19285K = ((ix6) arrayList.get(i20)).m19285K();
                                                        if (m19285K.length() == 3) {
                                                            int i22 = 0;
                                                            while (i22 < m19285K.length()) {
                                                                int codePointAt = m19285K.codePointAt(i22);
                                                                if (Character.isLetter(codePointAt)) {
                                                                    i22 += Character.charCount(codePointAt);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    mo3895i().m14154x().m20653a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                                    fs6Var8.m22320z(i19);
                                                    m3930H(fs6Var8, "_c");
                                                    m3931G(fs6Var8, 19, "currency");
                                                    break;
                                                }
                                                mo3895i().m14154x().m20653a("Value must be specified with a numeric type.");
                                                fs6Var8.m22320z(i19);
                                                m3930H(fs6Var8, "_c");
                                                m3931G(fs6Var8, 18, "value");
                                            }
                                            if ("_e".equals(fs6Var8.m22330G())) {
                                                i6 = i4;
                                                g37Var5 = g37Var4;
                                                if ("_vs".equals(fs6Var8.m22330G())) {
                                                    m3920R(this.f33496g);
                                                    if (ec8.m23586m((it6) fs6Var8.m3975m(), str4) == null) {
                                                        if (fs6Var == null || Math.abs(fs6Var.m22325u() - fs6Var8.m22325u()) > 1000) {
                                                            fs6Var7 = fs6Var8;
                                                            i12 = i3;
                                                            i13 = i15;
                                                        } else {
                                                            fs6 fs6Var9 = (fs6) fs6Var.clone();
                                                            if (m3922P(fs6Var9, fs6Var8)) {
                                                                i7 = i3;
                                                                g37Var5.m22029K(i7, fs6Var9);
                                                                i13 = i6;
                                                                fs6Var4 = null;
                                                                fs6Var = null;
                                                            } else {
                                                                i7 = i3;
                                                                fs6Var4 = fs6Var8;
                                                                i13 = i15;
                                                            }
                                                            fs6Var7 = fs6Var4;
                                                            i12 = i7;
                                                        }
                                                    }
                                                }
                                                i7 = i3;
                                                i13 = i6;
                                                fs6Var7 = fs6Var2;
                                                i12 = i7;
                                            } else {
                                                m3920R(this.f33496g);
                                                if (ec8.m23586m((it6) fs6Var8.m3975m(), "_fr") != null) {
                                                    i6 = i4;
                                                    g37Var5 = g37Var4;
                                                    i7 = i3;
                                                    i13 = i6;
                                                    fs6Var7 = fs6Var2;
                                                    i12 = i7;
                                                } else if (fs6Var2 == null || Math.abs(fs6Var2.m22325u() - fs6Var8.m22325u()) > 1000) {
                                                    g37Var5 = g37Var4;
                                                    fs6Var = fs6Var8;
                                                    i13 = i4;
                                                    fs6Var7 = fs6Var2;
                                                    i12 = i15;
                                                } else {
                                                    fs6 fs6Var10 = (fs6) fs6Var2.clone();
                                                    if (m3922P(fs6Var8, fs6Var10)) {
                                                        i9 = i4;
                                                        g37Var5 = g37Var4;
                                                        g37Var5.m22029K(i9, fs6Var10);
                                                        i12 = i3;
                                                        fs6Var5 = null;
                                                        fs6Var7 = null;
                                                    } else {
                                                        i9 = i4;
                                                        g37Var5 = g37Var4;
                                                        fs6Var5 = fs6Var8;
                                                        fs6Var7 = fs6Var2;
                                                        i12 = i15;
                                                    }
                                                    fs6Var = fs6Var5;
                                                    i13 = i9;
                                                }
                                            }
                                            i8 = i18;
                                            qb8Var3.f23848c.set(i8, (it6) fs6Var8.m3975m());
                                            i11 = i15 + 1;
                                            g37Var5.m21984w0(fs6Var8);
                                            i14 = i;
                                        }
                                        if ("_e".equals(fs6Var8.m22330G())) {
                                        }
                                        i8 = i18;
                                        qb8Var3.f23848c.set(i8, (it6) fs6Var8.m3975m());
                                        i11 = i15 + 1;
                                        g37Var5.m21984w0(fs6Var8);
                                        i14 = i;
                                    }
                                }
                                c = 65535;
                                if (c != 0) {
                                    g37Var4 = g37Var6;
                                    str4 = "_et";
                                    fs6Var2 = fs6Var7;
                                    i4 = i13;
                                    m21629E = false;
                                    if (m21629E) {
                                    }
                                    if ("_e".equals(fs6Var8.m22330G())) {
                                    }
                                    i8 = i18;
                                    qb8Var3.f23848c.set(i8, (it6) fs6Var8.m3975m());
                                    i11 = i15 + 1;
                                    g37Var5.m21984w0(fs6Var8);
                                    i14 = i;
                                }
                            } else {
                                if (m22330G2.equals("_ug")) {
                                    c = 2;
                                    if (c != 0) {
                                    }
                                }
                                c = 65535;
                                if (c != 0) {
                                }
                            }
                        }
                        str4 = "_et";
                        int i23 = 0;
                        boolean z = false;
                        boolean z2 = false;
                        while (true) {
                            g37Var4 = g37Var6;
                            if (i23 >= fs6Var8.m22327s()) {
                                break;
                            }
                            if ("_c".equals(fs6Var8.m22331F(i23).m19286J())) {
                                fw6 fw6Var = (fw6) fs6Var8.m22331F(i23).m18675A();
                                fs6Var3 = fs6Var7;
                                i5 = i13;
                                fw6Var.m22211A(1L);
                                fs6Var8.m22334C(i23, (ix6) fw6Var.m3975m());
                                z = true;
                            } else {
                                fs6Var3 = fs6Var7;
                                i5 = i13;
                                if ("_r".equals(fs6Var8.m22331F(i23).m19286J())) {
                                    fw6 fw6Var2 = (fw6) fs6Var8.m22331F(i23).m18675A();
                                    fw6Var2.m22211A(1L);
                                    fs6Var8.m22334C(i23, (ix6) fw6Var2.m3975m());
                                    z2 = true;
                                }
                            }
                            i23++;
                            fs6Var7 = fs6Var3;
                            i13 = i5;
                            g37Var6 = g37Var4;
                        }
                        fs6Var2 = fs6Var7;
                        i4 = i13;
                        if (!z && m21629E) {
                            mo3895i().m14156v().m20652b("Marking event as conversion", this.f33501l.m24055D().m5133d(fs6Var8.m22330G()));
                            fw6 m19288H = ix6.m19288H();
                            m19288H.m22210B("_c");
                            m19288H.m22211A(1L);
                            fs6Var8.m22323w(m19288H);
                        }
                        if (!z2) {
                            mo3895i().m14156v().m20652b("Marking event as real-time", this.f33501l.m24055D().m5133d(fs6Var8.m22330G()));
                            fw6 m19288H2 = ix6.m19288H();
                            m19288H2.m22210B("_r");
                            m19288H2.m22211A(1L);
                            fs6Var8.m22323w(m19288H2);
                        }
                        uh2 uh2Var5 = this.f33492c;
                        m3920R(uh2Var5);
                        if (uh2Var5.m8164T(m3932F(), qb8Var3.f23846a.m19031S1(), false, false, false, false, true).f16345e > m3917U().m12663n(qb8Var3.f23846a.m19031S1(), m75.f18549p)) {
                            m3930H(fs6Var8, "_r");
                        } else {
                            i = 1;
                        }
                        if (dd8.m24491X(fs6Var8.m22330G()) && m21629E) {
                            uh2 uh2Var6 = this.f33492c;
                            m3920R(uh2Var6);
                            if (uh2Var6.m8164T(m3932F(), qb8Var3.f23846a.m19031S1(), false, false, true, false, false).f16343c > m3917U().m12663n(qb8Var3.f23846a.m19031S1(), m75.f18547o)) {
                                mo3895i().m14155w().m20652b("Too many conversions. Not logging as conversion. appId", om5.m14152z(qb8Var3.f23846a.m19031S1()));
                                fw6 fw6Var3 = null;
                                boolean z3 = false;
                                int i24 = -1;
                                for (int i25 = 0; i25 < fs6Var8.m22327s(); i25++) {
                                    ix6 m22331F = fs6Var8.m22331F(i25);
                                    if ("_c".equals(m22331F.m19286J())) {
                                        fw6Var3 = (fw6) m22331F.m18675A();
                                        i24 = i25;
                                    } else if ("_err".equals(m22331F.m19286J())) {
                                        z3 = true;
                                    }
                                }
                                if (z3) {
                                    if (fw6Var3 != null) {
                                        fs6Var8.m22320z(i24);
                                    } else {
                                        fw6Var3 = null;
                                    }
                                }
                                if (fw6Var3 != null) {
                                    fw6 fw6Var4 = (fw6) fw6Var3.clone();
                                    fw6Var4.m22210B("_err");
                                    fw6Var4.m22211A(10L);
                                    fs6Var8.m22334C(i24, (ix6) fw6Var4.m3975m());
                                } else {
                                    mo3895i().m14160q().m20652b("Did not find conversion parameter. appId", om5.m14152z(qb8Var3.f23846a.m19031S1()));
                                }
                            }
                        }
                        if (m21629E) {
                        }
                        if ("_e".equals(fs6Var8.m22330G())) {
                        }
                        i8 = i18;
                        qb8Var3.f23848c.set(i8, (it6) fs6Var8.m3975m());
                        i11 = i15 + 1;
                        g37Var5.m21984w0(fs6Var8);
                        i14 = i;
                    }
                    i10 = i8 + 1;
                    g37Var6 = g37Var5;
                    str5 = str2;
                    str6 = str7;
                    fs6Var6 = fs6Var;
                }
                g37 g37Var7 = g37Var6;
                long j3 = 0;
                int i26 = 0;
                while (i26 < i11) {
                    it6 m21995q0 = g37Var7.m21995q0(i26);
                    if ("_e".equals(m21995q0.m19362K())) {
                        m3920R(this.f33496g);
                        if (ec8.m23586m(m21995q0, "_fr") != null) {
                            g37Var7.m21993s(i26);
                            i11--;
                            i26--;
                            i26++;
                        }
                    }
                    m3920R(this.f33496g);
                    ix6 m23586m = ec8.m23586m(m21995q0, "_et");
                    if (m23586m != null) {
                        Long valueOf = m23586m.m19271Y() ? Long.valueOf(m23586m.m19289G()) : null;
                        if (valueOf != null && valueOf.longValue() > 0) {
                            j3 += valueOf.longValue();
                        }
                    }
                    i26++;
                }
                m3926L(g37Var7, j3, false);
                Iterator it = g37Var7.m22000l0().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if ("_s".equals(((it6) it.next()).m19362K())) {
                            uh2 uh2Var7 = this.f33492c;
                            m3920R(uh2Var7);
                            uh2Var7.m8148l(g37Var7.m22003i0(), "_se");
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (ec8.m23577w(g37Var7, "_sid") >= 0) {
                    m3926L(g37Var7, j3, true);
                } else {
                    int m23577w = ec8.m23577w(g37Var7, "_se");
                    if (m23577w >= 0) {
                        g37Var7.m21991t(m23577w);
                        mo3895i().m14160q().m20652b("Session engagement user property is in the bundle without session ID. appId", om5.m14152z(qb8Var3.f23846a.m19031S1()));
                    }
                }
                ec8 ec8Var = this.f33496g;
                m3920R(ec8Var);
                ec8Var.f25143a.mo3895i().m14156v().m20653a("Checking account type status for ad personalization signals");
                gh6 gh6Var5 = ec8Var.f19771b.f33490a;
                m3920R(gh6Var5);
                if (gh6Var5.m21632B(g37Var7.m22003i0())) {
                    uh2 uh2Var8 = ec8Var.f19771b.f33492c;
                    m3920R(uh2Var8);
                    qu7 m8166R = uh2Var8.m8166R(g37Var7.m22003i0());
                    if (m8166R != null && m8166R.m12194I() && ec8Var.f25143a.m24058A().m16722s()) {
                        ec8Var.f25143a.mo3895i().m14161p().m20653a("Turning off ad personalization due to account type");
                        td7 m6125G = we7.m6125G();
                        m6125G.m9265x(str2);
                        m6125G.m9264y(ec8Var.f25143a.m24058A().m16726n());
                        m6125G.m9266w(1L);
                        we7 we7Var = (we7) m6125G.m3975m();
                        int i27 = 0;
                        while (true) {
                            if (i27 >= g37Var7.m21998n0()) {
                                g37Var7.m21980y0(we7Var);
                                break;
                            } else if (str2.equals(g37Var7.m22004h0(i27).m6123I())) {
                                g37Var7.m22006f0(i27, we7Var);
                                break;
                            } else {
                                i27++;
                            }
                        }
                    }
                }
                g37Var7.m22010b0(Long.MAX_VALUE);
                g37Var7.m22033I(Long.MIN_VALUE);
                for (int i28 = 0; i28 < g37Var7.m22019S(); i28++) {
                    it6 m21995q02 = g37Var7.m21995q0(i28);
                    if (m21995q02.m19366G() < g37Var7.m21996p0()) {
                        g37Var7.m22010b0(m21995q02.m19366G());
                    }
                    if (m21995q02.m19366G() > g37Var7.m21997o0()) {
                        g37Var7.m22033I(m21995q02.m19366G());
                    }
                }
                g37Var7.m22026L0();
                g37Var7.m22048A0();
                u32 u32Var = this.f33495f;
                m3920R(u32Var);
                g37Var7.m21994r0(u32Var.m8607l(g37Var7.m22003i0(), g37Var7.m22000l0(), g37Var7.m21999m0(), Long.valueOf(g37Var7.m21996p0()), Long.valueOf(g37Var7.m21997o0())));
                if (m3917U().m12673F(qb8Var3.f23846a.m19031S1())) {
                    HashMap hashMap3 = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    SecureRandom m24462u = m3896h0().m24462u();
                    int i29 = 0;
                    while (i29 < g37Var7.m22019S()) {
                        fs6 fs6Var11 = (fs6) g37Var7.m21995q0(i29).m18675A();
                        if (fs6Var11.m22330G().equals("_ep")) {
                            m3920R(this.f33496g);
                            String str8 = (String) ec8.m23585n((it6) fs6Var11.m3975m(), "_en");
                            to2 to2Var = (to2) hashMap3.get(str8);
                            if (to2Var == null) {
                                uh2 uh2Var9 = this.f33492c;
                                m3920R(uh2Var9);
                                to2Var = uh2Var9.m8162V(qb8Var3.f23846a.m19031S1(), (String) ry0.m10830j(str8));
                                if (to2Var != null) {
                                    hashMap3.put(str8, to2Var);
                                }
                            }
                            if (to2Var != null && to2Var.f27924i == null) {
                                Long l2 = to2Var.f27925j;
                                if (l2 != null && l2.longValue() > 1) {
                                    m3920R(this.f33496g);
                                    ec8.m23588P(fs6Var11, "_sr", to2Var.f27925j);
                                }
                                Boolean bool = to2Var.f27926k;
                                if (bool != null && bool.booleanValue()) {
                                    m3920R(this.f33496g);
                                    ec8.m23588P(fs6Var11, "_efs", 1L);
                                }
                                arrayList2.add((it6) fs6Var11.m3975m());
                            }
                        } else {
                            gh6 gh6Var6 = this.f33490a;
                            m3920R(gh6Var6);
                            String m19031S1 = qb8Var3.f23846a.m19031S1();
                            String mo20012c = gh6Var6.mo20012c(m19031S1, "measurement.account.time_zone_offset_minutes");
                            if (!TextUtils.isEmpty(mo20012c)) {
                                try {
                                    parseLong = Long.parseLong(mo20012c);
                                } catch (NumberFormatException e) {
                                    gh6Var6.f25143a.mo3895i().m14155w().m20651c("Unable to parse timezone offset. appId", om5.m14152z(m19031S1), e);
                                }
                                long m24465s02 = m3896h0().m24465s0(fs6Var11.m22325u(), parseLong);
                                it6 it6Var = (it6) fs6Var11.m3975m();
                                Long l3 = 1L;
                                long j4 = parseLong;
                                if (!TextUtils.isEmpty("_dbg")) {
                                    Iterator it2 = it6Var.m19361L().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        ix6 ix6Var = (ix6) it2.next();
                                        Iterator it3 = it2;
                                        if (!"_dbg".equals(ix6Var.m19286J())) {
                                            it2 = it3;
                                        } else if (l3.equals(Long.valueOf(ix6Var.m19289G()))) {
                                            m21614q = 1;
                                        }
                                    }
                                }
                                gh6 gh6Var7 = this.f33490a;
                                m3920R(gh6Var7);
                                m21614q = gh6Var7.m21614q(qb8Var3.f23846a.m19031S1(), fs6Var11.m22330G());
                                if (m21614q > 0) {
                                    mo3895i().m14155w().m20651c("Sample rate must be positive. event, rate", fs6Var11.m22330G(), Integer.valueOf(m21614q));
                                    arrayList2.add((it6) fs6Var11.m3975m());
                                } else {
                                    to2 to2Var2 = (to2) hashMap3.get(fs6Var11.m22330G());
                                    if (to2Var2 == null) {
                                        uh2 uh2Var10 = this.f33492c;
                                        m3920R(uh2Var10);
                                        to2Var2 = uh2Var10.m8162V(qb8Var3.f23846a.m19031S1(), fs6Var11.m22330G());
                                        if (to2Var2 == null) {
                                            j2 = m24465s02;
                                            mo3895i().m14155w().m20651c("Event being bundled has no eventAggregate. appId, eventName", qb8Var3.f23846a.m19031S1(), fs6Var11.m22330G());
                                            to2Var2 = new to2(qb8Var3.f23846a.m19031S1(), fs6Var11.m22330G(), 1L, 1L, 1L, fs6Var11.m22325u(), 0L, null, null, null, null);
                                            m3920R(this.f33496g);
                                            Long l4 = (Long) ec8.m23585n((it6) fs6Var11.m3975m(), "_eid");
                                            Boolean valueOf2 = Boolean.valueOf(l4 == null);
                                            if (m21614q != 1) {
                                                arrayList2.add((it6) fs6Var11.m3975m());
                                                if (valueOf2.booleanValue() && (to2Var2.f27924i != null || to2Var2.f27925j != null || to2Var2.f27926k != null)) {
                                                    hashMap3.put(fs6Var11.m22330G(), to2Var2.m8906a(null, null, null));
                                                }
                                            } else {
                                                if (m24462u.nextInt(m21614q) == 0) {
                                                    m3920R(this.f33496g);
                                                    Long valueOf3 = Long.valueOf(m21614q);
                                                    ec8.m23588P(fs6Var11, "_sr", valueOf3);
                                                    arrayList2.add((it6) fs6Var11.m3975m());
                                                    if (valueOf2.booleanValue()) {
                                                        to2Var2 = to2Var2.m8906a(null, valueOf3, null);
                                                    }
                                                    hashMap3.put(fs6Var11.m22330G(), to2Var2.m8905b(fs6Var11.m22325u(), j2));
                                                    qb8Var2 = qb8Var3;
                                                    secureRandom = m24462u;
                                                    g37Var3 = g37Var7;
                                                    hashMap2 = hashMap3;
                                                } else {
                                                    long j5 = j2;
                                                    secureRandom = m24462u;
                                                    Long l5 = to2Var2.f27923h;
                                                    if (l5 != null) {
                                                        m24465s0 = l5.longValue();
                                                        qb8Var2 = qb8Var3;
                                                        hashMap = hashMap3;
                                                        g37Var2 = g37Var7;
                                                        l = l4;
                                                    } else {
                                                        g37Var2 = g37Var7;
                                                        l = l4;
                                                        qb8Var2 = qb8Var3;
                                                        hashMap = hashMap3;
                                                        m24465s0 = m3896h0().m24465s0(fs6Var11.m22326t(), j4);
                                                    }
                                                    if (m24465s0 != j5) {
                                                        m3920R(this.f33496g);
                                                        ec8.m23588P(fs6Var11, "_efs", 1L);
                                                        m3920R(this.f33496g);
                                                        Long valueOf4 = Long.valueOf(m21614q);
                                                        ec8.m23588P(fs6Var11, "_sr", valueOf4);
                                                        arrayList2.add((it6) fs6Var11.m3975m());
                                                        if (valueOf2.booleanValue()) {
                                                            to2Var2 = to2Var2.m8906a(null, valueOf4, Boolean.TRUE);
                                                        }
                                                        m22330G = fs6Var11.m22330G();
                                                        m8906a = to2Var2.m8905b(fs6Var11.m22325u(), j5);
                                                        hashMap2 = hashMap;
                                                    } else {
                                                        hashMap2 = hashMap;
                                                        if (valueOf2.booleanValue()) {
                                                            m22330G = fs6Var11.m22330G();
                                                            m8906a = to2Var2.m8906a(l, null, null);
                                                        }
                                                        g37Var3 = g37Var2;
                                                    }
                                                    hashMap2.put(m22330G, m8906a);
                                                    g37Var3 = g37Var2;
                                                }
                                                g37Var3.m22029K(i29, fs6Var11);
                                                i29++;
                                                g37Var7 = g37Var3;
                                                hashMap3 = hashMap2;
                                                m24462u = secureRandom;
                                                qb8Var3 = qb8Var2;
                                            }
                                        }
                                    }
                                    j2 = m24465s02;
                                    m3920R(this.f33496g);
                                    Long l42 = (Long) ec8.m23585n((it6) fs6Var11.m3975m(), "_eid");
                                    Boolean valueOf22 = Boolean.valueOf(l42 == null);
                                    if (m21614q != 1) {
                                    }
                                }
                            }
                            parseLong = 0;
                            long m24465s022 = m3896h0().m24465s0(fs6Var11.m22325u(), parseLong);
                            it6 it6Var2 = (it6) fs6Var11.m3975m();
                            Long l32 = 1L;
                            long j42 = parseLong;
                            if (!TextUtils.isEmpty("_dbg")) {
                            }
                            gh6 gh6Var72 = this.f33490a;
                            m3920R(gh6Var72);
                            m21614q = gh6Var72.m21614q(qb8Var3.f23846a.m19031S1(), fs6Var11.m22330G());
                            if (m21614q > 0) {
                            }
                        }
                        g37Var7.m22029K(i29, fs6Var11);
                        qb8Var2 = qb8Var3;
                        secureRandom = m24462u;
                        g37Var3 = g37Var7;
                        hashMap2 = hashMap3;
                        i29++;
                        g37Var7 = g37Var3;
                        hashMap3 = hashMap2;
                        m24462u = secureRandom;
                        qb8Var3 = qb8Var2;
                    }
                    qb8 qb8Var4 = qb8Var3;
                    HashMap hashMap4 = hashMap3;
                    g37Var = g37Var7;
                    if (arrayList2.size() < g37Var.m22019S()) {
                        g37Var.m22042D0();
                        g37Var.m21992s0(arrayList2);
                    }
                    for (Map.Entry entry : hashMap4.entrySet()) {
                        uh2 uh2Var11 = this.f33492c;
                        m3920R(uh2Var11);
                        uh2Var11.m8144p((to2) entry.getValue());
                    }
                    qb8Var = qb8Var4;
                } else {
                    g37Var = g37Var7;
                    qb8Var = qb8Var3;
                }
                String m19031S12 = qb8Var.f23846a.m19031S1();
                uh2 uh2Var12 = this.f33492c;
                m3920R(uh2Var12);
                qu7 m8166R2 = uh2Var12.m8166R(m19031S12);
                if (m8166R2 == null) {
                    mo3895i().m14160q().m20652b("Bundling raw events w/o app info. appId", om5.m14152z(qb8Var.f23846a.m19031S1()));
                } else if (g37Var.m22019S() > 0) {
                    long m12179X = m8166R2.m12179X();
                    if (m12179X != 0) {
                        g37Var.m22017U(m12179X);
                    } else {
                        g37Var.m22034H0();
                    }
                    long m12177Z = m8166R2.m12177Z();
                    if (m12177Z != 0) {
                        m12179X = m12177Z;
                    }
                    if (m12179X != 0) {
                        g37Var.m22016V(m12179X);
                    } else {
                        g37Var.m22032I0();
                    }
                    m8166R2.m12168e();
                    g37Var.m22049A((int) m8166R2.m12178Y());
                    m8166R2.m12200C(g37Var.m21996p0());
                    m8166R2.m12141z(g37Var.m21997o0());
                    String m12171c0 = m8166R2.m12171c0();
                    if (m12171c0 != null) {
                        g37Var.m22023O(m12171c0);
                    } else {
                        g37Var.m22040E0();
                    }
                    uh2 uh2Var13 = this.f33492c;
                    m3920R(uh2Var13);
                    uh2Var13.m8145o(m8166R2);
                }
                if (g37Var.m22019S() > 0) {
                    this.f33501l.mo3911a();
                    gh6 gh6Var8 = this.f33490a;
                    m3920R(gh6Var8);
                    wd6 m21612t = gh6Var8.m21612t(qb8Var.f23846a.m19031S1());
                    try {
                        try {
                            if (m21612t != null && m21612t.m6136U()) {
                                g37Var.m22045C(m21612t.m6151F());
                                uh2Var2 = this.f33492c;
                                m3920R(uh2Var2);
                                j47Var = (j47) g37Var.m3975m();
                                uh2Var2.mo6991f();
                                uh2Var2.m13533g();
                                ry0.m10830j(j47Var);
                                ry0.m10834f(j47Var.m19031S1());
                                ry0.m10827m(j47Var.m18991l1());
                                uh2Var2.m8150h0();
                                mo15860a = uh2Var2.f25143a.mo3909b().mo15860a();
                                m19067G1 = j47Var.m19067G1();
                                uh2Var2.f25143a.m24020z();
                                if (m19067G1 >= mo15860a - qa2.m12669g()) {
                                    long m19067G12 = j47Var.m19067G1();
                                    uh2Var2.f25143a.m24020z();
                                }
                                uh2Var2.f25143a.mo3895i().m14155w().m20650d("Storing bundle outside of the max uploading time span. appId, now, timestamp", om5.m14152z(j47Var.m19031S1()), Long.valueOf(mo15860a), Long.valueOf(j47Var.m19067G1()));
                                byte[] m6531i = j47Var.m6531i();
                                ec8 ec8Var2 = uh2Var2.f19771b.f33496g;
                                m3920R(ec8Var2);
                                byte[] m23589O = ec8Var2.m23589O(m6531i);
                                uh2Var2.f25143a.mo3895i().m14156v().m20652b("Saving bundle, size", Integer.valueOf(m23589O.length));
                                contentValues = new ContentValues();
                                contentValues.put("app_id", j47Var.m19031S1());
                                contentValues.put("bundle_end_timestamp", Long.valueOf(j47Var.m19067G1()));
                                contentValues.put("data", m23589O);
                                contentValues.put("has_realtime", Integer.valueOf(i));
                                if (j47Var.m18979r1()) {
                                    contentValues.put("retry_count", Integer.valueOf(j47Var.m19083A1()));
                                }
                                if (uh2Var2.m8168P().insert("queue", null, contentValues) == -1) {
                                    uh2Var2.f25143a.mo3895i().m14160q().m20652b("Failed to insert bundle (got -1). appId", om5.m14152z(j47Var.m19031S1()));
                                }
                            }
                            if (uh2Var2.m8168P().insert("queue", null, contentValues) == -1) {
                            }
                        } catch (SQLiteException e2) {
                            th = e2;
                            m14160q = uh2Var2.f25143a.mo3895i().m14160q();
                            str3 = "Error storing bundle. appId";
                            m14152z = om5.m14152z(j47Var.m19031S1());
                            m14160q.m20651c(str3, m14152z, th);
                            uh2 uh2Var14 = this.f33492c;
                            m3920R(uh2Var14);
                            list = qb8Var.f23847b;
                            ry0.m10830j(list);
                            uh2Var14.mo6991f();
                            uh2Var14.m13533g();
                            StringBuilder sb = new StringBuilder("rowid in (");
                            while (i2 < list.size()) {
                            }
                            sb.append(")");
                            delete = uh2Var14.m8168P().delete("raw_events", sb.toString(), null);
                            if (delete != list.size()) {
                            }
                            uh2Var = this.f33492c;
                            m3920R(uh2Var);
                            uh2Var.m8168P().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{m19031S12, m19031S12});
                            uh2 uh2Var15 = this.f33492c;
                            m3920R(uh2Var15);
                            uh2Var15.m8146n();
                            uh2 uh2Var16 = this.f33492c;
                            m3920R(uh2Var16);
                            uh2Var16.m8152f0();
                            return true;
                        }
                        ec8 ec8Var22 = uh2Var2.f19771b.f33496g;
                        m3920R(ec8Var22);
                        byte[] m23589O2 = ec8Var22.m23589O(m6531i);
                        uh2Var2.f25143a.mo3895i().m14156v().m20652b("Saving bundle, size", Integer.valueOf(m23589O2.length));
                        contentValues = new ContentValues();
                        contentValues.put("app_id", j47Var.m19031S1());
                        contentValues.put("bundle_end_timestamp", Long.valueOf(j47Var.m19067G1()));
                        contentValues.put("data", m23589O2);
                        contentValues.put("has_realtime", Integer.valueOf(i));
                        if (j47Var.m18979r1()) {
                        }
                    } catch (IOException e3) {
                        th = e3;
                        m14160q = uh2Var2.f25143a.mo3895i().m14160q();
                        str3 = "Data loss. Failed to serialize bundle. appId";
                        m14152z = om5.m14152z(j47Var.m19031S1());
                    }
                    if (qb8Var.f23846a.m19063I().isEmpty()) {
                        g37Var.m22045C(-1L);
                    } else {
                        mo3895i().m14155w().m20652b("Did not find measurement config or missing version info. appId", om5.m14152z(qb8Var.f23846a.m19031S1()));
                    }
                    uh2Var2 = this.f33492c;
                    m3920R(uh2Var2);
                    j47Var = (j47) g37Var.m3975m();
                    uh2Var2.mo6991f();
                    uh2Var2.m13533g();
                    ry0.m10830j(j47Var);
                    ry0.m10834f(j47Var.m19031S1());
                    ry0.m10827m(j47Var.m18991l1());
                    uh2Var2.m8150h0();
                    mo15860a = uh2Var2.f25143a.mo3909b().mo15860a();
                    m19067G1 = j47Var.m19067G1();
                    uh2Var2.f25143a.m24020z();
                    if (m19067G1 >= mo15860a - qa2.m12669g()) {
                    }
                    uh2Var2.f25143a.mo3895i().m14155w().m20650d("Storing bundle outside of the max uploading time span. appId, now, timestamp", om5.m14152z(j47Var.m19031S1()), Long.valueOf(mo15860a), Long.valueOf(j47Var.m19067G1()));
                    byte[] m6531i2 = j47Var.m6531i();
                }
                uh2 uh2Var142 = this.f33492c;
                m3920R(uh2Var142);
                list = qb8Var.f23847b;
                ry0.m10830j(list);
                uh2Var142.mo6991f();
                uh2Var142.m13533g();
                StringBuilder sb2 = new StringBuilder("rowid in (");
                for (i2 = 0; i2 < list.size(); i2++) {
                    if (i2 != 0) {
                        sb2.append(",");
                    }
                    sb2.append(((Long) list.get(i2)).longValue());
                }
                sb2.append(")");
                delete = uh2Var142.m8168P().delete("raw_events", sb2.toString(), null);
                if (delete != list.size()) {
                    uh2Var142.f25143a.mo3895i().m14160q().m20651c("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list.size()));
                }
                uh2Var = this.f33492c;
                m3920R(uh2Var);
                try {
                    uh2Var.m8168P().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{m19031S12, m19031S12});
                } catch (SQLiteException e4) {
                    uh2Var.f25143a.mo3895i().m14160q().m20651c("Failed to remove unused event metadata. appId", om5.m14152z(m19031S12), e4);
                }
                uh2 uh2Var152 = this.f33492c;
                m3920R(uh2Var152);
                uh2Var152.m8146n();
                uh2 uh2Var162 = this.f33492c;
                m3920R(uh2Var162);
                uh2Var162.m8152f0();
                return true;
            }
            uh2 uh2Var17 = this.f33492c;
            m3920R(uh2Var17);
            uh2Var17.m8146n();
            uh2 uh2Var18 = this.f33492c;
            m3920R(uh2Var18);
            uh2Var18.m8152f0();
            return false;
        } catch (Throwable th2) {
            uh2 uh2Var19 = this.f33492c;
            m3920R(uh2Var19);
            uh2Var19.m8152f0();
            throw th2;
        }
    }

    /* renamed from: O */
    public final boolean m3923O() {
        mo3882r().mo6991f();
        m3903e();
        uh2 uh2Var = this.f33492c;
        m3920R(uh2Var);
        if (uh2Var.m8143q()) {
            return true;
        }
        uh2 uh2Var2 = this.f33492c;
        m3920R(uh2Var2);
        return !TextUtils.isEmpty(uh2Var2.m8158Z());
    }

    /* renamed from: P */
    public final boolean m3922P(fs6 fs6Var, fs6 fs6Var2) {
        ry0.m10839a("_e".equals(fs6Var.m22330G()));
        m3920R(this.f33496g);
        ix6 m23586m = ec8.m23586m((it6) fs6Var.m3975m(), "_sc");
        String m19285K = m23586m == null ? null : m23586m.m19285K();
        m3920R(this.f33496g);
        ix6 m23586m2 = ec8.m23586m((it6) fs6Var2.m3975m(), "_pc");
        String m19285K2 = m23586m2 != null ? m23586m2.m19285K() : null;
        if (m19285K2 == null || !m19285K2.equals(m19285K)) {
            return false;
        }
        ry0.m10839a("_e".equals(fs6Var.m22330G()));
        m3920R(this.f33496g);
        ix6 m23586m3 = ec8.m23586m((it6) fs6Var.m3975m(), "_et");
        if (m23586m3 == null || !m23586m3.m19271Y() || m23586m3.m19289G() <= 0) {
            return true;
        }
        long m19289G = m23586m3.m19289G();
        m3920R(this.f33496g);
        ix6 m23586m4 = ec8.m23586m((it6) fs6Var2.m3975m(), "_et");
        if (m23586m4 != null && m23586m4.m19289G() > 0) {
            m19289G += m23586m4.m19289G();
        }
        m3920R(this.f33496g);
        ec8.m23588P(fs6Var2, "_et", Long.valueOf(m19289G));
        m3920R(this.f33496g);
        ec8.m23588P(fs6Var, "_fr", 1L);
        return true;
    }

    /* renamed from: S */
    public final qu7 m3919S(zzq zzqVar) {
        mo3882r().mo6991f();
        m3903e();
        ry0.m10830j(zzqVar);
        ry0.m10834f(zzqVar.f37092p);
        if (!zzqVar.f37090L.isEmpty()) {
            this.f33486B.put(zzqVar.f37092p, new vb8(this, zzqVar.f37090L));
        }
        uh2 uh2Var = this.f33492c;
        m3920R(uh2Var);
        qu7 m8166R = uh2Var.m8166R(zzqVar.f37092p);
        cd2 m25429c = m3916V(zzqVar.f37092p).m25429c(cd2.m25430b(zzqVar.f37089K));
        vb2 vb2Var = vb2.AD_STORAGE;
        String m24595n = m25429c.m25423i(vb2Var) ? this.f33498i.m24595n(zzqVar.f37092p, zzqVar.f37082D) : "";
        if (m8166R == null) {
            m8166R = new qu7(this.f33501l, zzqVar.f37092p);
            if (m25429c.m25423i(vb2.ANALYTICS_STORAGE)) {
                m8166R.m12162h(m3894i0(m25429c));
            }
            if (m25429c.m25423i(vb2Var)) {
                m8166R.m12197F(m24595n);
            }
        } else if (m25429c.m25423i(vb2Var) && m24595n != null && !m24595n.equals(m8166R.m12176a())) {
            m8166R.m12197F(m24595n);
            if (zzqVar.f37082D && !"00000000-0000-0000-0000-000000000000".equals(this.f33498i.m24596m(zzqVar.f37092p, m25429c).first)) {
                m8166R.m12162h(m3894i0(m25429c));
                uh2 uh2Var2 = this.f33492c;
                m3920R(uh2Var2);
                if (uh2Var2.m8160X(zzqVar.f37092p, "_id") != null) {
                    uh2 uh2Var3 = this.f33492c;
                    m3920R(uh2Var3);
                    if (uh2Var3.m8160X(zzqVar.f37092p, "_lair") == null) {
                        mc8 mc8Var = new mc8(zzqVar.f37092p, "auto", "_lair", mo3909b().mo15860a(), 1L);
                        uh2 uh2Var4 = this.f33492c;
                        m3920R(uh2Var4);
                        uh2Var4.m8137x(mc8Var);
                    }
                }
            }
        } else if (TextUtils.isEmpty(m8166R.m12167e0()) && m25429c.m25423i(vb2.ANALYTICS_STORAGE)) {
            m8166R.m12162h(m3894i0(m25429c));
        }
        m8166R.m12144w(zzqVar.f37093q);
        m8166R.m12166f(zzqVar.f37084F);
        if (!TextUtils.isEmpty(zzqVar.f37102z)) {
            m8166R.m12145v(zzqVar.f37102z);
        }
        long j = zzqVar.f37096t;
        if (j != 0) {
            m8166R.m12143x(j);
        }
        if (!TextUtils.isEmpty(zzqVar.f37094r)) {
            m8166R.m12158j(zzqVar.f37094r);
        }
        m8166R.m12156k(zzqVar.f37101y);
        String str = zzqVar.f37095s;
        if (str != null) {
            m8166R.m12160i(str);
        }
        m8166R.m12148s(zzqVar.f37097u);
        m8166R.m12199D(zzqVar.f37099w);
        if (!TextUtils.isEmpty(zzqVar.f37098v)) {
            m8166R.m12142y(zzqVar.f37098v);
        }
        m8166R.m12164g(zzqVar.f37082D);
        m8166R.m12198E(zzqVar.f37085G);
        m8166R.m12147t(zzqVar.f37086H);
        zm8.m2111b();
        if (m3917U().m12677B(null, m75.f18546n0) && m3917U().m12677B(zzqVar.f37092p, m75.f18550p0)) {
            m8166R.m12195H(zzqVar.f37091M);
        }
        kj8.m17686b();
        if (m3917U().m12677B(null, m75.f18542l0)) {
            m8166R.m12196G(zzqVar.f37087I);
        } else {
            kj8.m17686b();
            if (m3917U().m12677B(null, m75.f18540k0)) {
                m8166R.m12196G(null);
            }
        }
        if (m8166R.m12192K()) {
            uh2 uh2Var5 = this.f33492c;
            m3920R(uh2Var5);
            uh2Var5.m8145o(m8166R);
        }
        return m8166R;
    }

    /* renamed from: T */
    public final u32 m3918T() {
        u32 u32Var = this.f33495f;
        m3920R(u32Var);
        return u32Var;
    }

    /* renamed from: U */
    public final qa2 m3917U() {
        return ((dr6) ry0.m10830j(this.f33501l)).m24020z();
    }

    /* renamed from: V */
    public final cd2 m3916V(String str) {
        String str2;
        cd2 cd2Var = cd2.f5740b;
        mo3882r().mo6991f();
        m3903e();
        cd2 cd2Var2 = (cd2) this.f33485A.get(str);
        if (cd2Var2 == null) {
            uh2 uh2Var = this.f33492c;
            m3920R(uh2Var);
            ry0.m10830j(str);
            uh2Var.mo6991f();
            uh2Var.m13533g();
            Cursor cursor = null;
            try {
                try {
                    cursor = uh2Var.m8168P().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                    if (cursor.moveToFirst()) {
                        str2 = cursor.getString(0);
                        cursor.close();
                    } else {
                        cursor.close();
                        str2 = "G1";
                    }
                    cd2 m25430b = cd2.m25430b(str2);
                    m3937A(str, m25430b);
                    return m25430b;
                } catch (SQLiteException e) {
                    uh2Var.f25143a.mo3895i().m14160q().m20651c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
                    throw e;
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        return cd2Var2;
    }

    /* renamed from: W */
    public final uh2 m3915W() {
        uh2 uh2Var = this.f33492c;
        m3920R(uh2Var);
        return uh2Var;
    }

    /* renamed from: X */
    public final xg5 m3914X() {
        return this.f33501l.m24055D();
    }

    /* renamed from: Y */
    public final ht5 m3913Y() {
        ht5 ht5Var = this.f33491b;
        m3920R(ht5Var);
        return ht5Var;
    }

    /* renamed from: Z */
    public final nv5 m3912Z() {
        nv5 nv5Var = this.f33493d;
        if (nv5Var != null) {
            return nv5Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    @Override // com.daaw.xe7
    /* renamed from: a */
    public final b52 mo3911a() {
        throw null;
    }

    /* renamed from: a0 */
    public final gh6 m3910a0() {
        gh6 gh6Var = this.f33490a;
        m3920R(gh6Var);
        return gh6Var;
    }

    @Override // com.daaw.xe7
    /* renamed from: b */
    public final InterfaceC0623ag mo3909b() {
        return ((dr6) ry0.m10830j(this.f33501l)).mo3909b();
    }

    /* renamed from: c */
    public final void m3907c() {
        hk5 m14160q;
        Integer valueOf;
        Integer valueOf2;
        String str;
        mo3882r().mo6991f();
        m3903e();
        if (this.f33503n) {
            return;
        }
        this.f33503n = true;
        if (m3933E()) {
            FileChannel fileChannel = this.f33512w;
            mo3882r().mo6991f();
            int i = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                mo3895i().m14160q().m20653a("Bad channel to read from");
            } else {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int read = fileChannel.read(allocate);
                    if (read == 4) {
                        allocate.flip();
                        i = allocate.getInt();
                    } else if (read != -1) {
                        mo3895i().m14155w().m20652b("Unexpected data length. Bytes read", Integer.valueOf(read));
                    }
                } catch (IOException e) {
                    mo3895i().m14160q().m20652b("Failed to read from channel", e);
                }
            }
            int m5304o = this.f33501l.m24057B().m5304o();
            mo3882r().mo6991f();
            if (i > m5304o) {
                m14160q = mo3895i().m14160q();
                valueOf = Integer.valueOf(i);
                valueOf2 = Integer.valueOf(m5304o);
                str = "Panic: can't downgrade version. Previous, current version";
            } else if (i >= m5304o) {
                return;
            } else {
                FileChannel fileChannel2 = this.f33512w;
                mo3882r().mo6991f();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    mo3895i().m14160q().m20653a("Bad channel to read from");
                } else {
                    ByteBuffer allocate2 = ByteBuffer.allocate(4);
                    allocate2.putInt(m5304o);
                    allocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(allocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            mo3895i().m14160q().m20652b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        m14160q = mo3895i().m14156v();
                        valueOf = Integer.valueOf(i);
                        valueOf2 = Integer.valueOf(m5304o);
                        str = "Storage version upgraded. Previous, current version";
                    } catch (IOException e2) {
                        mo3895i().m14160q().m20652b("Failed to write to channel", e2);
                    }
                }
                m14160q = mo3895i().m14160q();
                valueOf = Integer.valueOf(i);
                valueOf2 = Integer.valueOf(m5304o);
                str = "Storage version upgrade failed. Previous, current version";
            }
            m14160q.m20651c(str, valueOf, valueOf2);
        }
    }

    /* renamed from: c0 */
    public final dr6 m3906c0() {
        return this.f33501l;
    }

    @Override // com.daaw.xe7
    /* renamed from: d */
    public final Context mo3905d() {
        return this.f33501l.mo3905d();
    }

    /* renamed from: d0 */
    public final n38 m3904d0() {
        n38 n38Var = this.f33497h;
        m3920R(n38Var);
        return n38Var;
    }

    /* renamed from: e */
    public final void m3903e() {
        if (!this.f33502m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* renamed from: e0 */
    public final d88 m3902e0() {
        return this.f33498i;
    }

    /* renamed from: f */
    public final void m3901f(String str, g37 g37Var) {
        int m23577w;
        int indexOf;
        gh6 gh6Var = this.f33490a;
        m3920R(gh6Var);
        Set m21607y = gh6Var.m21607y(str);
        if (m21607y != null) {
            g37Var.m21988u0(m21607y);
        }
        gh6 gh6Var2 = this.f33490a;
        m3920R(gh6Var2);
        if (gh6Var2.m21624J(str)) {
            g37Var.m22046B0();
        }
        gh6 gh6Var3 = this.f33490a;
        m3920R(gh6Var3);
        if (gh6Var3.m21621M(str)) {
            if (m3917U().m12677B(str, m75.f18556s0)) {
                String m22001k0 = g37Var.m22001k0();
                if (!TextUtils.isEmpty(m22001k0) && (indexOf = m22001k0.indexOf(".")) != -1) {
                    g37Var.m22021Q(m22001k0.substring(0, indexOf));
                }
            } else {
                g37Var.m22036G0();
            }
        }
        gh6 gh6Var4 = this.f33490a;
        m3920R(gh6Var4);
        if (gh6Var4.m21620N(str) && (m23577w = ec8.m23577w(g37Var, "_id")) != -1) {
            g37Var.m21991t(m23577w);
        }
        gh6 gh6Var5 = this.f33490a;
        m3920R(gh6Var5);
        if (gh6Var5.m21622L(str)) {
            g37Var.m22044C0();
        }
        gh6 gh6Var6 = this.f33490a;
        m3920R(gh6Var6);
        if (gh6Var6.m21625I(str)) {
            g37Var.m21978z0();
            vb8 vb8Var = (vb8) this.f33486B.get(str);
            if (vb8Var == null || vb8Var.f30116b + m3917U().m12660q(str, m75.f18512T) < mo3909b().mo15859b()) {
                vb8Var = new vb8(this);
                this.f33486B.put(str, vb8Var);
            }
            g37Var.m22031J(vb8Var.f30115a);
        }
        gh6 gh6Var7 = this.f33490a;
        m3920R(gh6Var7);
        if (gh6Var7.m21623K(str)) {
            g37Var.m22028K0();
        }
    }

    /* renamed from: g */
    public final void m3899g(qu7 qu7Var) {
        C1370g6 c1370g6;
        C1370g6 c1370g62;
        mo3882r().mo6991f();
        if (TextUtils.isEmpty(qu7Var.m12159i0()) && TextUtils.isEmpty(qu7Var.m12173b0())) {
            m3887m((String) ry0.m10830j(qu7Var.m12169d0()), 204, null, null, null);
            return;
        }
        sa8 sa8Var = this.f33499j;
        Uri.Builder builder = new Uri.Builder();
        String m12159i0 = qu7Var.m12159i0();
        if (TextUtils.isEmpty(m12159i0)) {
            m12159i0 = qu7Var.m12173b0();
        }
        C1370g6 c1370g63 = null;
        Uri.Builder appendQueryParameter = builder.scheme((String) m75.f18529f.m18786a(null)).encodedAuthority((String) m75.f18531g.m18786a(null)).path("config/app/".concat(String.valueOf(m12159i0))).appendQueryParameter("platform", "android");
        sa8Var.f25143a.m24020z().m12661p();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(74029L)).appendQueryParameter("runtime_version", "0");
        String uri = builder.build().toString();
        try {
            String str = (String) ry0.m10830j(qu7Var.m12169d0());
            URL url = new URL(uri);
            mo3895i().m14156v().m20652b("Fetching remote configuration", str);
            gh6 gh6Var = this.f33490a;
            m3920R(gh6Var);
            wd6 m21612t = gh6Var.m21612t(str);
            gh6 gh6Var2 = this.f33490a;
            m3920R(gh6Var2);
            String m21610v = gh6Var2.m21610v(str);
            if (m21612t != null) {
                if (TextUtils.isEmpty(m21610v)) {
                    c1370g62 = null;
                } else {
                    c1370g62 = new C1370g6();
                    c1370g62.put("If-Modified-Since", m21610v);
                }
                bm8.m25989b();
                if (m3917U().m12677B(null, m75.f18552q0)) {
                    gh6 gh6Var3 = this.f33490a;
                    m3920R(gh6Var3);
                    String m21611u = gh6Var3.m21611u(str);
                    if (!TextUtils.isEmpty(m21611u)) {
                        if (c1370g62 == null) {
                            c1370g62 = new C1370g6();
                        }
                        c1370g63 = c1370g62;
                        c1370g63.put("If-None-Match", m21611u);
                    }
                }
                c1370g6 = c1370g62;
                this.f33508s = true;
                ht5 ht5Var = this.f33491b;
                m3920R(ht5Var);
                bb8 bb8Var = new bb8(this);
                ht5Var.mo6991f();
                ht5Var.m13533g();
                ry0.m10830j(url);
                ry0.m10830j(bb8Var);
                ht5Var.f25143a.mo3882r().m6979y(new es5(ht5Var, str, url, null, c1370g6, bb8Var));
            }
            c1370g6 = c1370g63;
            this.f33508s = true;
            ht5 ht5Var2 = this.f33491b;
            m3920R(ht5Var2);
            bb8 bb8Var2 = new bb8(this);
            ht5Var2.mo6991f();
            ht5Var2.m13533g();
            ry0.m10830j(url);
            ry0.m10830j(bb8Var2);
            ht5Var2.f25143a.mo3882r().m6979y(new es5(ht5Var2, str, url, null, c1370g6, bb8Var2));
        } catch (MalformedURLException unused) {
            mo3895i().m14160q().m20651c("Failed to parse config URL. Not fetching. appId", om5.m14152z(qu7Var.m12169d0()), uri);
        }
    }

    /* renamed from: g0 */
    public final ec8 m3898g0() {
        ec8 ec8Var = this.f33496g;
        m3920R(ec8Var);
        return ec8Var;
    }

    /* renamed from: h */
    public final void m3897h(zzaw zzawVar, zzq zzqVar) {
        zzaw zzawVar2;
        List<zzac> m8156b0;
        List<zzac> m8156b02;
        List<zzac> m8156b03;
        hk5 m14160q;
        String str;
        Object m14152z;
        String m5131f;
        Object obj;
        String str2;
        ry0.m10830j(zzqVar);
        ry0.m10834f(zzqVar.f37092p);
        mo3882r().mo6991f();
        m3903e();
        String str3 = zzqVar.f37092p;
        long j = zzawVar.f37071s;
        sn5 m10141b = sn5.m10141b(zzawVar);
        mo3882r().mo6991f();
        t38 t38Var = null;
        if (this.f33487C != null && (str2 = this.f33488D) != null && str2.equals(str3)) {
            t38Var = this.f33487C;
        }
        dd8.m24455y(t38Var, m10141b.f26433d, false);
        zzaw m10142a = m10141b.m10142a();
        m3920R(this.f33496g);
        if (ec8.m23587l(m10142a, zzqVar)) {
            if (!zzqVar.f37099w) {
                m3919S(zzqVar);
                return;
            }
            List list = zzqVar.f37087I;
            if (list == null) {
                zzawVar2 = m10142a;
            } else if (!list.contains(m10142a.f37068p)) {
                mo3895i().m14161p().m20650d("Dropping non-safelisted event. appId, event name, origin", str3, m10142a.f37068p, m10142a.f37070r);
                return;
            } else {
                Bundle m1078q = m10142a.f37069q.m1078q();
                m1078q.putLong("ga_safelisted", 1L);
                zzawVar2 = new zzaw(m10142a.f37068p, new zzau(m1078q), m10142a.f37070r, m10142a.f37071s);
            }
            uh2 uh2Var = this.f33492c;
            m3920R(uh2Var);
            uh2Var.m8153e0();
            try {
                uh2 uh2Var2 = this.f33492c;
                m3920R(uh2Var2);
                ry0.m10834f(str3);
                uh2Var2.mo6991f();
                uh2Var2.m13533g();
                if (j < 0) {
                    uh2Var2.f25143a.mo3895i().m14155w().m20651c("Invalid time querying timed out conditional properties", om5.m14152z(str3), Long.valueOf(j));
                    m8156b0 = Collections.emptyList();
                } else {
                    m8156b0 = uh2Var2.m8156b0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str3, String.valueOf(j)});
                }
                for (zzac zzacVar : m8156b0) {
                    if (zzacVar != null) {
                        mo3895i().m14156v().m20650d("User property timed out", zzacVar.f37056p, this.f33501l.m24055D().m5131f(zzacVar.f37058r.f37073q), zzacVar.f37058r.m1073h());
                        zzaw zzawVar3 = zzacVar.f37062v;
                        if (zzawVar3 != null) {
                            m3934D(new zzaw(zzawVar3, j), zzqVar);
                        }
                        uh2 uh2Var3 = this.f33492c;
                        m3920R(uh2Var3);
                        uh2Var3.m8174J(str3, zzacVar.f37058r.f37073q);
                    }
                }
                uh2 uh2Var4 = this.f33492c;
                m3920R(uh2Var4);
                ry0.m10834f(str3);
                uh2Var4.mo6991f();
                uh2Var4.m13533g();
                if (j < 0) {
                    uh2Var4.f25143a.mo3895i().m14155w().m20651c("Invalid time querying expired conditional properties", om5.m14152z(str3), Long.valueOf(j));
                    m8156b02 = Collections.emptyList();
                } else {
                    m8156b02 = uh2Var4.m8156b0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str3, String.valueOf(j)});
                }
                ArrayList<zzaw> arrayList = new ArrayList(m8156b02.size());
                for (zzac zzacVar2 : m8156b02) {
                    if (zzacVar2 != null) {
                        mo3895i().m14156v().m20650d("User property expired", zzacVar2.f37056p, this.f33501l.m24055D().m5131f(zzacVar2.f37058r.f37073q), zzacVar2.f37058r.m1073h());
                        uh2 uh2Var5 = this.f33492c;
                        m3920R(uh2Var5);
                        uh2Var5.m8148l(str3, zzacVar2.f37058r.f37073q);
                        zzaw zzawVar4 = zzacVar2.f37066z;
                        if (zzawVar4 != null) {
                            arrayList.add(zzawVar4);
                        }
                        uh2 uh2Var6 = this.f33492c;
                        m3920R(uh2Var6);
                        uh2Var6.m8174J(str3, zzacVar2.f37058r.f37073q);
                    }
                }
                for (zzaw zzawVar5 : arrayList) {
                    m3934D(new zzaw(zzawVar5, j), zzqVar);
                }
                uh2 uh2Var7 = this.f33492c;
                m3920R(uh2Var7);
                String str4 = zzawVar2.f37068p;
                ry0.m10834f(str3);
                ry0.m10834f(str4);
                uh2Var7.mo6991f();
                uh2Var7.m13533g();
                if (j < 0) {
                    uh2Var7.f25143a.mo3895i().m14155w().m20650d("Invalid time querying triggered conditional properties", om5.m14152z(str3), uh2Var7.f25143a.m24055D().m5133d(str4), Long.valueOf(j));
                    m8156b03 = Collections.emptyList();
                } else {
                    m8156b03 = uh2Var7.m8156b0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str3, str4, String.valueOf(j)});
                }
                ArrayList<zzaw> arrayList2 = new ArrayList(m8156b03.size());
                for (zzac zzacVar3 : m8156b03) {
                    if (zzacVar3 != null) {
                        zzkw zzkwVar = zzacVar3.f37058r;
                        mc8 mc8Var = new mc8((String) ry0.m10830j(zzacVar3.f37056p), zzacVar3.f37057q, zzkwVar.f37073q, j, ry0.m10830j(zzkwVar.m1073h()));
                        uh2 uh2Var8 = this.f33492c;
                        m3920R(uh2Var8);
                        if (uh2Var8.m8137x(mc8Var)) {
                            m14160q = mo3895i().m14156v();
                            str = "User property triggered";
                            m14152z = zzacVar3.f37056p;
                            m5131f = this.f33501l.m24055D().m5131f(mc8Var.f18796c);
                            obj = mc8Var.f18798e;
                        } else {
                            m14160q = mo3895i().m14160q();
                            str = "Too many active user properties, ignoring";
                            m14152z = om5.m14152z(zzacVar3.f37056p);
                            m5131f = this.f33501l.m24055D().m5131f(mc8Var.f18796c);
                            obj = mc8Var.f18798e;
                        }
                        m14160q.m20650d(str, m14152z, m5131f, obj);
                        zzaw zzawVar6 = zzacVar3.f37064x;
                        if (zzawVar6 != null) {
                            arrayList2.add(zzawVar6);
                        }
                        zzacVar3.f37058r = new zzkw(mc8Var);
                        zzacVar3.f37060t = true;
                        uh2 uh2Var9 = this.f33492c;
                        m3920R(uh2Var9);
                        uh2Var9.m8138w(zzacVar3);
                    }
                }
                m3934D(zzawVar2, zzqVar);
                for (zzaw zzawVar7 : arrayList2) {
                    m3934D(new zzaw(zzawVar7, j), zzqVar);
                }
                uh2 uh2Var10 = this.f33492c;
                m3920R(uh2Var10);
                uh2Var10.m8146n();
            } finally {
                uh2 uh2Var11 = this.f33492c;
                m3920R(uh2Var11);
                uh2Var11.m8152f0();
            }
        }
    }

    /* renamed from: h0 */
    public final dd8 m3896h0() {
        return ((dr6) ry0.m10830j(this.f33501l)).m24045N();
    }

    @Override // com.daaw.xe7
    /* renamed from: i */
    public final om5 mo3895i() {
        return ((dr6) ry0.m10830j(this.f33501l)).mo3895i();
    }

    /* renamed from: i0 */
    public final String m3894i0(cd2 cd2Var) {
        if (cd2Var.m25423i(vb2.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            m3896h0().m24462u().nextBytes(bArr);
            return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        return null;
    }

    /* renamed from: j */
    public final void m3893j(zzaw zzawVar, String str) {
        uh2 uh2Var = this.f33492c;
        m3920R(uh2Var);
        qu7 m8166R = uh2Var.m8166R(str);
        if (m8166R == null || TextUtils.isEmpty(m8166R.m12163g0())) {
            mo3895i().m14161p().m20652b("No app data available; dropping event", str);
            return;
        }
        Boolean m3928J = m3928J(m8166R);
        if (m3928J == null) {
            if (!"_ui".equals(zzawVar.f37068p)) {
                mo3895i().m14155w().m20652b("Could not find package. appId", om5.m14152z(str));
            }
        } else if (!m3928J.booleanValue()) {
            mo3895i().m14160q().m20652b("App version does not match; dropping event. appId", om5.m14152z(str));
            return;
        }
        String m12159i0 = m8166R.m12159i0();
        String m12163g0 = m8166R.m12163g0();
        long m12191L = m8166R.m12191L();
        String m12165f0 = m8166R.m12165f0();
        long m12180W = m8166R.m12180W();
        long m12183T = m8166R.m12183T();
        boolean m12193J = m8166R.m12193J();
        String m12161h0 = m8166R.m12161h0();
        m8166R.m12202A();
        m3891k(zzawVar, new zzq(str, m12159i0, m12163g0, m12191L, m12165f0, m12180W, m12183T, (String) null, m12193J, false, m12161h0, 0L, 0L, 0, m8166R.m12194I(), false, m8166R.m12173b0(), m8166R.m12175a0(), m8166R.m12182U(), m8166R.m12172c(), (String) null, m3916V(str).m25424h(), "", (String) null));
    }

    /* renamed from: j0 */
    public final String m3892j0(zzq zzqVar) {
        try {
            return (String) mo3882r().m6985s(new eb8(this, zzqVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            mo3895i().m14160q().m20651c("Failed to get app instance id. appId", om5.m14152z(zzqVar.f37092p), e);
            return null;
        }
    }

    /* renamed from: k */
    public final void m3891k(zzaw zzawVar, zzq zzqVar) {
        ry0.m10834f(zzqVar.f37092p);
        sn5 m10141b = sn5.m10141b(zzawVar);
        dd8 m3896h0 = m3896h0();
        Bundle bundle = m10141b.f26433d;
        uh2 uh2Var = this.f33492c;
        m3920R(uh2Var);
        m3896h0.m24454z(bundle, uh2Var.m8167Q(zzqVar.f37092p));
        m3896h0().m24514A(m10141b, m3917U().m12664m(zzqVar.f37092p));
        zzaw m10142a = m10141b.m10142a();
        if ("_cmp".equals(m10142a.f37068p) && "referrer API v2".equals(m10142a.f37069q.m1074v("_cis"))) {
            String m1074v = m10142a.f37069q.m1074v("gclid");
            if (!TextUtils.isEmpty(m1074v)) {
                m3936B(new zzkw("_lgclid", m10142a.f37071s, m1074v, "auto"), zzqVar);
            }
        }
        m3897h(m10142a, zzqVar);
    }

    /* renamed from: l */
    public final void m3889l() {
        this.f33507r++;
    }

    /* renamed from: l0 */
    public final void m3888l0(Runnable runnable) {
        mo3882r().mo6991f();
        if (this.f33505p == null) {
            this.f33505p = new ArrayList();
        }
        this.f33505p.add(runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a A[Catch: all -> 0x0182, TryCatch #1 {all -> 0x018c, blocks: (B:4:0x0010, B:5:0x0012, B:63:0x0174, B:6:0x002c, B:16:0x004a, B:62:0x016c, B:21:0x0064, B:26:0x00b6, B:25:0x00a7, B:29:0x00be, B:32:0x00ca, B:34:0x00d0, B:36:0x00d8, B:39:0x00e9, B:42:0x00f5, B:44:0x00fb, B:49:0x0108, B:53:0x0124, B:55:0x0139, B:57:0x0158, B:59:0x0163, B:61:0x0169, B:56:0x0147, B:50:0x0111, B:52:0x011c), top: B:73:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011c A[Catch: all -> 0x0182, TryCatch #1 {all -> 0x018c, blocks: (B:4:0x0010, B:5:0x0012, B:63:0x0174, B:6:0x002c, B:16:0x004a, B:62:0x016c, B:21:0x0064, B:26:0x00b6, B:25:0x00a7, B:29:0x00be, B:32:0x00ca, B:34:0x00d0, B:36:0x00d8, B:39:0x00e9, B:42:0x00f5, B:44:0x00fb, B:49:0x0108, B:53:0x0124, B:55:0x0139, B:57:0x0158, B:59:0x0163, B:61:0x0169, B:56:0x0147, B:50:0x0111, B:52:0x011c), top: B:73:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0139 A[Catch: all -> 0x0182, TryCatch #1 {all -> 0x018c, blocks: (B:4:0x0010, B:5:0x0012, B:63:0x0174, B:6:0x002c, B:16:0x004a, B:62:0x016c, B:21:0x0064, B:26:0x00b6, B:25:0x00a7, B:29:0x00be, B:32:0x00ca, B:34:0x00d0, B:36:0x00d8, B:39:0x00e9, B:42:0x00f5, B:44:0x00fb, B:49:0x0108, B:53:0x0124, B:55:0x0139, B:57:0x0158, B:59:0x0163, B:61:0x0169, B:56:0x0147, B:50:0x0111, B:52:0x011c), top: B:73:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0147 A[Catch: all -> 0x0182, TryCatch #1 {all -> 0x018c, blocks: (B:4:0x0010, B:5:0x0012, B:63:0x0174, B:6:0x002c, B:16:0x004a, B:62:0x016c, B:21:0x0064, B:26:0x00b6, B:25:0x00a7, B:29:0x00be, B:32:0x00ca, B:34:0x00d0, B:36:0x00d8, B:39:0x00e9, B:42:0x00f5, B:44:0x00fb, B:49:0x0108, B:53:0x0124, B:55:0x0139, B:57:0x0158, B:59:0x0163, B:61:0x0169, B:56:0x0147, B:50:0x0111, B:52:0x011c), top: B:73:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0163 A[Catch: all -> 0x0182, TryCatch #1 {all -> 0x018c, blocks: (B:4:0x0010, B:5:0x0012, B:63:0x0174, B:6:0x002c, B:16:0x004a, B:62:0x016c, B:21:0x0064, B:26:0x00b6, B:25:0x00a7, B:29:0x00be, B:32:0x00ca, B:34:0x00d0, B:36:0x00d8, B:39:0x00e9, B:42:0x00f5, B:44:0x00fb, B:49:0x0108, B:53:0x0124, B:55:0x0139, B:57:0x0158, B:59:0x0163, B:61:0x0169, B:56:0x0147, B:50:0x0111, B:52:0x011c), top: B:73:0x0010 }] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3887m(String str, int i, Throwable th, byte[] bArr, Map map) {
        boolean z;
        String str2;
        gh6 gh6Var;
        ht5 ht5Var;
        mo3882r().mo6991f();
        m3903e();
        ry0.m10834f(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.f33508s = false;
                m3927K();
            }
        }
        hk5 m14156v = mo3895i().m14156v();
        Integer valueOf = Integer.valueOf(bArr.length);
        m14156v.m20652b("onConfigFetched. Response size", valueOf);
        uh2 uh2Var = this.f33492c;
        m3920R(uh2Var);
        uh2Var.m8153e0();
        uh2 uh2Var2 = this.f33492c;
        m3920R(uh2Var2);
        qu7 m8166R = uh2Var2.m8166R(str);
        if (i != 200 && i != 204) {
            if (i == 304) {
                i = 304;
            }
            z = false;
            if (m8166R == null) {
                mo3895i().m14155w().m20652b("App does not exist in onConfigFetched. appId", om5.m14152z(str));
            } else {
                if (!z && i != 404) {
                    m8166R.m12146u(mo3909b().mo15860a());
                    uh2 uh2Var3 = this.f33492c;
                    m3920R(uh2Var3);
                    uh2Var3.m8145o(m8166R);
                    mo3895i().m14156v().m20651c("Fetching config failed. code, error", Integer.valueOf(i), th);
                    gh6 gh6Var2 = this.f33490a;
                    m3920R(gh6Var2);
                    gh6Var2.m21606z(str);
                    this.f33498i.f6618h.m4399b(mo3909b().mo15860a());
                    if (i == 503 || i == 429) {
                        this.f33498i.f6616f.m4399b(mo3909b().mo15860a());
                    }
                    m3925M();
                }
                List list = map != null ? (List) map.get("Last-Modified") : null;
                String str3 = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                bm8.m25989b();
                if (m3917U().m12677B(null, m75.f18552q0)) {
                    List list2 = map != null ? (List) map.get("ETag") : null;
                    if (list2 != null && !list2.isEmpty()) {
                        str2 = (String) list2.get(0);
                        if (i != 404 && i != 304) {
                            gh6 gh6Var3 = this.f33490a;
                            m3920R(gh6Var3);
                            gh6Var3.m21626H(str, bArr, str3, str2);
                            m8166R.m12155l(mo3909b().mo15860a());
                            uh2 uh2Var4 = this.f33492c;
                            m3920R(uh2Var4);
                            uh2Var4.m8145o(m8166R);
                            if (i != 404) {
                                mo3895i().m14154x().m20652b("Config not found. Using empty config. appId", str);
                            } else {
                                mo3895i().m14156v().m20651c("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), valueOf);
                            }
                            ht5Var = this.f33491b;
                            m3920R(ht5Var);
                            if (ht5Var.m20430l() && m3923O()) {
                                m3935C();
                            }
                            m3925M();
                        }
                        gh6Var = this.f33490a;
                        m3920R(gh6Var);
                        if (gh6Var.m21612t(str) == null) {
                            gh6 gh6Var4 = this.f33490a;
                            m3920R(gh6Var4);
                            gh6Var4.m21626H(str, null, null, null);
                        }
                        m8166R.m12155l(mo3909b().mo15860a());
                        uh2 uh2Var42 = this.f33492c;
                        m3920R(uh2Var42);
                        uh2Var42.m8145o(m8166R);
                        if (i != 404) {
                        }
                        ht5Var = this.f33491b;
                        m3920R(ht5Var);
                        if (ht5Var.m20430l()) {
                            m3935C();
                        }
                        m3925M();
                    }
                }
                str2 = null;
                if (i != 404) {
                    gh6 gh6Var32 = this.f33490a;
                    m3920R(gh6Var32);
                    gh6Var32.m21626H(str, bArr, str3, str2);
                    m8166R.m12155l(mo3909b().mo15860a());
                    uh2 uh2Var422 = this.f33492c;
                    m3920R(uh2Var422);
                    uh2Var422.m8145o(m8166R);
                    if (i != 404) {
                    }
                    ht5Var = this.f33491b;
                    m3920R(ht5Var);
                    if (ht5Var.m20430l()) {
                    }
                    m3925M();
                }
                gh6Var = this.f33490a;
                m3920R(gh6Var);
                if (gh6Var.m21612t(str) == null) {
                }
                m8166R.m12155l(mo3909b().mo15860a());
                uh2 uh2Var4222 = this.f33492c;
                m3920R(uh2Var4222);
                uh2Var4222.m8145o(m8166R);
                if (i != 404) {
                }
                ht5Var = this.f33491b;
                m3920R(ht5Var);
                if (ht5Var.m20430l()) {
                }
                m3925M();
            }
            uh2 uh2Var5 = this.f33492c;
            m3920R(uh2Var5);
            uh2Var5.m8146n();
            uh2 uh2Var6 = this.f33492c;
            m3920R(uh2Var6);
            uh2Var6.m8152f0();
        }
        if (th == null) {
            z = true;
            if (m8166R == null) {
            }
            uh2 uh2Var52 = this.f33492c;
            m3920R(uh2Var52);
            uh2Var52.m8146n();
            uh2 uh2Var62 = this.f33492c;
            m3920R(uh2Var62);
            uh2Var62.m8152f0();
        }
        z = false;
        if (m8166R == null) {
        }
        uh2 uh2Var522 = this.f33492c;
        m3920R(uh2Var522);
        uh2Var522.m8146n();
        uh2 uh2Var622 = this.f33492c;
        m3920R(uh2Var622);
        uh2Var622.m8152f0();
    }

    /* renamed from: n */
    public final void m3886n(boolean z) {
        m3925M();
    }

    /* renamed from: o */
    public final void m3885o(int i, Throwable th, byte[] bArr, String str) {
        uh2 uh2Var;
        long longValue;
        mo3882r().mo6991f();
        m3903e();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.f33509t = false;
                m3927K();
            }
        }
        List<Long> list = (List) ry0.m10830j(this.f33513x);
        this.f33513x = null;
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            mo3895i().m14156v().m20651c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.f33498i.f6618h.m4399b(mo3909b().mo15860a());
            if (i != 503 || i == 429) {
                this.f33498i.f6616f.m4399b(mo3909b().mo15860a());
            }
            uh2 uh2Var2 = this.f33492c;
            m3920R(uh2Var2);
            uh2Var2.m8151g0(list);
            m3925M();
        }
        if (th == null) {
            try {
                this.f33498i.f6617g.m4399b(mo3909b().mo15860a());
                this.f33498i.f6618h.m4399b(0L);
                m3925M();
                mo3895i().m14156v().m20651c("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                uh2 uh2Var3 = this.f33492c;
                m3920R(uh2Var3);
                uh2Var3.m8153e0();
            } catch (SQLiteException e) {
                mo3895i().m14160q().m20652b("Database error while trying to delete uploaded bundles", e);
                this.f33504o = mo3909b().mo15859b();
                mo3895i().m14156v().m20652b("Disable upload, time", Long.valueOf(this.f33504o));
            }
            try {
                for (Long l : list) {
                    try {
                        uh2Var = this.f33492c;
                        m3920R(uh2Var);
                        longValue = l.longValue();
                        uh2Var.mo6991f();
                        uh2Var.m13533g();
                    } catch (SQLiteException e2) {
                        List list2 = this.f33514y;
                        if (list2 == null || !list2.contains(l)) {
                            throw e2;
                        }
                    }
                    try {
                        if (uh2Var.m8168P().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                            throw new SQLiteException("Deleted fewer rows from queue than expected");
                            break;
                        }
                    } catch (SQLiteException e3) {
                        uh2Var.f25143a.mo3895i().m14160q().m20652b("Failed to delete a bundle in a queue table", e3);
                        throw e3;
                        break;
                    }
                }
                uh2 uh2Var4 = this.f33492c;
                m3920R(uh2Var4);
                uh2Var4.m8146n();
                uh2 uh2Var5 = this.f33492c;
                m3920R(uh2Var5);
                uh2Var5.m8152f0();
                this.f33514y = null;
                ht5 ht5Var = this.f33491b;
                m3920R(ht5Var);
                if (ht5Var.m20430l() && m3923O()) {
                    m3935C();
                } else {
                    this.f33515z = -1L;
                    m3925M();
                }
                this.f33504o = 0L;
            } catch (Throwable th2) {
                uh2 uh2Var6 = this.f33492c;
                m3920R(uh2Var6);
                uh2Var6.m8152f0();
                throw th2;
            }
        }
        mo3895i().m14156v().m20651c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
        this.f33498i.f6618h.m4399b(mo3909b().mo15860a());
        if (i != 503) {
        }
        this.f33498i.f6616f.m4399b(mo3909b().mo15860a());
        uh2 uh2Var22 = this.f33492c;
        m3920R(uh2Var22);
        uh2Var22.m8151g0(list);
        m3925M();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:94|95|(2:97|(11:99|(3:101|(2:103|(1:105))(1:130)|129)(1:131)|106|(1:108)(1:128)|109|110|111|112|113|114|(4:116|(1:118)|119|(1:121))))|132|110|111|112|113|114|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x04af, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x04b1, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x04b2, code lost:
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x04b4, code lost:
        mo3895i().m14160q().m20651c("Application info is null, first open report might be inaccurate. appId", com.daaw.om5.m14152z(r3), r0);
        r0 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03e1 A[Catch: all -> 0x0570, TryCatch #1 {all -> 0x0570, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0293, B:90:0x02b9, B:93:0x02c1, B:95:0x02d0, B:96:0x02dc, B:125:0x03ad, B:127:0x03e1, B:128:0x03e4, B:130:0x040d, B:174:0x04e4, B:175:0x04e7, B:184:0x055f, B:132:0x0422, B:137:0x0447, B:139:0x044f, B:141:0x0457, B:145:0x046a, B:149:0x047d, B:153:0x0489, B:156:0x049d, B:158:0x04aa, B:166:0x04c8, B:168:0x04ce, B:169:0x04d3, B:171:0x04d9, B:164:0x04b4, B:147:0x0475, B:135:0x0433, B:97:0x02e1, B:99:0x030c, B:100:0x0319, B:102:0x0320, B:104:0x0326, B:106:0x0330, B:108:0x0336, B:110:0x033c, B:112:0x0342, B:113:0x0347, B:118:0x036a, B:121:0x036f, B:122:0x0383, B:123:0x0391, B:124:0x039f, B:176:0x04fc, B:178:0x052c, B:179:0x052f, B:180:0x0540, B:181:0x0544, B:183:0x0548, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:193:0x00a4, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x040d A[Catch: all -> 0x0570, TRY_LEAVE, TryCatch #1 {all -> 0x0570, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0293, B:90:0x02b9, B:93:0x02c1, B:95:0x02d0, B:96:0x02dc, B:125:0x03ad, B:127:0x03e1, B:128:0x03e4, B:130:0x040d, B:174:0x04e4, B:175:0x04e7, B:184:0x055f, B:132:0x0422, B:137:0x0447, B:139:0x044f, B:141:0x0457, B:145:0x046a, B:149:0x047d, B:153:0x0489, B:156:0x049d, B:158:0x04aa, B:166:0x04c8, B:168:0x04ce, B:169:0x04d3, B:171:0x04d9, B:164:0x04b4, B:147:0x0475, B:135:0x0433, B:97:0x02e1, B:99:0x030c, B:100:0x0319, B:102:0x0320, B:104:0x0326, B:106:0x0330, B:108:0x0336, B:110:0x033c, B:112:0x0342, B:113:0x0347, B:118:0x036a, B:121:0x036f, B:122:0x0383, B:123:0x0391, B:124:0x039f, B:176:0x04fc, B:178:0x052c, B:179:0x052f, B:180:0x0540, B:181:0x0544, B:183:0x0548, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:193:0x00a4, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04c8 A[Catch: all -> 0x0570, TryCatch #1 {all -> 0x0570, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0293, B:90:0x02b9, B:93:0x02c1, B:95:0x02d0, B:96:0x02dc, B:125:0x03ad, B:127:0x03e1, B:128:0x03e4, B:130:0x040d, B:174:0x04e4, B:175:0x04e7, B:184:0x055f, B:132:0x0422, B:137:0x0447, B:139:0x044f, B:141:0x0457, B:145:0x046a, B:149:0x047d, B:153:0x0489, B:156:0x049d, B:158:0x04aa, B:166:0x04c8, B:168:0x04ce, B:169:0x04d3, B:171:0x04d9, B:164:0x04b4, B:147:0x0475, B:135:0x0433, B:97:0x02e1, B:99:0x030c, B:100:0x0319, B:102:0x0320, B:104:0x0326, B:106:0x0330, B:108:0x0336, B:110:0x033c, B:112:0x0342, B:113:0x0347, B:118:0x036a, B:121:0x036f, B:122:0x0383, B:123:0x0391, B:124:0x039f, B:176:0x04fc, B:178:0x052c, B:179:0x052f, B:180:0x0540, B:181:0x0544, B:183:0x0548, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:193:0x00a4, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04e4 A[Catch: all -> 0x0570, TryCatch #1 {all -> 0x0570, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0293, B:90:0x02b9, B:93:0x02c1, B:95:0x02d0, B:96:0x02dc, B:125:0x03ad, B:127:0x03e1, B:128:0x03e4, B:130:0x040d, B:174:0x04e4, B:175:0x04e7, B:184:0x055f, B:132:0x0422, B:137:0x0447, B:139:0x044f, B:141:0x0457, B:145:0x046a, B:149:0x047d, B:153:0x0489, B:156:0x049d, B:158:0x04aa, B:166:0x04c8, B:168:0x04ce, B:169:0x04d3, B:171:0x04d9, B:164:0x04b4, B:147:0x0475, B:135:0x0433, B:97:0x02e1, B:99:0x030c, B:100:0x0319, B:102:0x0320, B:104:0x0326, B:106:0x0330, B:108:0x0336, B:110:0x033c, B:112:0x0342, B:113:0x0347, B:118:0x036a, B:121:0x036f, B:122:0x0383, B:123:0x0391, B:124:0x039f, B:176:0x04fc, B:178:0x052c, B:179:0x052f, B:180:0x0540, B:181:0x0544, B:183:0x0548, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:193:0x00a4, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0544 A[Catch: all -> 0x0570, TryCatch #1 {all -> 0x0570, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0293, B:90:0x02b9, B:93:0x02c1, B:95:0x02d0, B:96:0x02dc, B:125:0x03ad, B:127:0x03e1, B:128:0x03e4, B:130:0x040d, B:174:0x04e4, B:175:0x04e7, B:184:0x055f, B:132:0x0422, B:137:0x0447, B:139:0x044f, B:141:0x0457, B:145:0x046a, B:149:0x047d, B:153:0x0489, B:156:0x049d, B:158:0x04aa, B:166:0x04c8, B:168:0x04ce, B:169:0x04d3, B:171:0x04d9, B:164:0x04b4, B:147:0x0475, B:135:0x0433, B:97:0x02e1, B:99:0x030c, B:100:0x0319, B:102:0x0320, B:104:0x0326, B:106:0x0330, B:108:0x0336, B:110:0x033c, B:112:0x0342, B:113:0x0347, B:118:0x036a, B:121:0x036f, B:122:0x0383, B:123:0x0391, B:124:0x039f, B:176:0x04fc, B:178:0x052c, B:179:0x052f, B:180:0x0540, B:181:0x0544, B:183:0x0548, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:193:0x00a4, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0422 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0206 A[Catch: all -> 0x0570, TryCatch #1 {all -> 0x0570, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0293, B:90:0x02b9, B:93:0x02c1, B:95:0x02d0, B:96:0x02dc, B:125:0x03ad, B:127:0x03e1, B:128:0x03e4, B:130:0x040d, B:174:0x04e4, B:175:0x04e7, B:184:0x055f, B:132:0x0422, B:137:0x0447, B:139:0x044f, B:141:0x0457, B:145:0x046a, B:149:0x047d, B:153:0x0489, B:156:0x049d, B:158:0x04aa, B:166:0x04c8, B:168:0x04ce, B:169:0x04d3, B:171:0x04d9, B:164:0x04b4, B:147:0x0475, B:135:0x0433, B:97:0x02e1, B:99:0x030c, B:100:0x0319, B:102:0x0320, B:104:0x0326, B:106:0x0330, B:108:0x0336, B:110:0x033c, B:112:0x0342, B:113:0x0347, B:118:0x036a, B:121:0x036f, B:122:0x0383, B:123:0x0391, B:124:0x039f, B:176:0x04fc, B:178:0x052c, B:179:0x052f, B:180:0x0540, B:181:0x0544, B:183:0x0548, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:193:0x00a4, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0260 A[Catch: all -> 0x0570, TryCatch #1 {all -> 0x0570, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0293, B:90:0x02b9, B:93:0x02c1, B:95:0x02d0, B:96:0x02dc, B:125:0x03ad, B:127:0x03e1, B:128:0x03e4, B:130:0x040d, B:174:0x04e4, B:175:0x04e7, B:184:0x055f, B:132:0x0422, B:137:0x0447, B:139:0x044f, B:141:0x0457, B:145:0x046a, B:149:0x047d, B:153:0x0489, B:156:0x049d, B:158:0x04aa, B:166:0x04c8, B:168:0x04ce, B:169:0x04d3, B:171:0x04d9, B:164:0x04b4, B:147:0x0475, B:135:0x0433, B:97:0x02e1, B:99:0x030c, B:100:0x0319, B:102:0x0320, B:104:0x0326, B:106:0x0330, B:108:0x0336, B:110:0x033c, B:112:0x0342, B:113:0x0347, B:118:0x036a, B:121:0x036f, B:122:0x0383, B:123:0x0391, B:124:0x039f, B:176:0x04fc, B:178:0x052c, B:179:0x052f, B:180:0x0540, B:181:0x0544, B:183:0x0548, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:193:0x00a4, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026f A[Catch: all -> 0x0570, TryCatch #1 {all -> 0x0570, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0293, B:90:0x02b9, B:93:0x02c1, B:95:0x02d0, B:96:0x02dc, B:125:0x03ad, B:127:0x03e1, B:128:0x03e4, B:130:0x040d, B:174:0x04e4, B:175:0x04e7, B:184:0x055f, B:132:0x0422, B:137:0x0447, B:139:0x044f, B:141:0x0457, B:145:0x046a, B:149:0x047d, B:153:0x0489, B:156:0x049d, B:158:0x04aa, B:166:0x04c8, B:168:0x04ce, B:169:0x04d3, B:171:0x04d9, B:164:0x04b4, B:147:0x0475, B:135:0x0433, B:97:0x02e1, B:99:0x030c, B:100:0x0319, B:102:0x0320, B:104:0x0326, B:106:0x0330, B:108:0x0336, B:110:0x033c, B:112:0x0342, B:113:0x0347, B:118:0x036a, B:121:0x036f, B:122:0x0383, B:123:0x0391, B:124:0x039f, B:176:0x04fc, B:178:0x052c, B:179:0x052f, B:180:0x0540, B:181:0x0544, B:183:0x0548, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:193:0x00a4, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027f A[Catch: all -> 0x0570, TRY_LEAVE, TryCatch #1 {all -> 0x0570, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0293, B:90:0x02b9, B:93:0x02c1, B:95:0x02d0, B:96:0x02dc, B:125:0x03ad, B:127:0x03e1, B:128:0x03e4, B:130:0x040d, B:174:0x04e4, B:175:0x04e7, B:184:0x055f, B:132:0x0422, B:137:0x0447, B:139:0x044f, B:141:0x0457, B:145:0x046a, B:149:0x047d, B:153:0x0489, B:156:0x049d, B:158:0x04aa, B:166:0x04c8, B:168:0x04ce, B:169:0x04d3, B:171:0x04d9, B:164:0x04b4, B:147:0x0475, B:135:0x0433, B:97:0x02e1, B:99:0x030c, B:100:0x0319, B:102:0x0320, B:104:0x0326, B:106:0x0330, B:108:0x0336, B:110:0x033c, B:112:0x0342, B:113:0x0347, B:118:0x036a, B:121:0x036f, B:122:0x0383, B:123:0x0391, B:124:0x039f, B:176:0x04fc, B:178:0x052c, B:179:0x052f, B:180:0x0540, B:181:0x0544, B:183:0x0548, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:193:0x00a4, inners: #3, #4 }] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3884p(zzq zzqVar) {
        String str;
        String str2;
        int i;
        qu7 m8166R;
        String str3;
        to2 m8162V;
        boolean z;
        zzaw zzawVar;
        hk5 m14153y;
        String str4;
        long m8172L;
        PackageInfo packageInfo;
        String str5;
        String str6;
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        boolean z2;
        mo3882r().mo6991f();
        m3903e();
        ry0.m10830j(zzqVar);
        ry0.m10834f(zzqVar.f37092p);
        if (!m3921Q(zzqVar)) {
            return;
        }
        uh2 uh2Var = this.f33492c;
        m3920R(uh2Var);
        qu7 m8166R2 = uh2Var.m8166R(zzqVar.f37092p);
        if (m8166R2 != null && TextUtils.isEmpty(m8166R2.m12159i0()) && !TextUtils.isEmpty(zzqVar.f37093q)) {
            m8166R2.m12155l(0L);
            uh2 uh2Var2 = this.f33492c;
            m3920R(uh2Var2);
            uh2Var2.m8145o(m8166R2);
            gh6 gh6Var = this.f33490a;
            m3920R(gh6Var);
            gh6Var.m21633A(zzqVar.f37092p);
        }
        if (!zzqVar.f37099w) {
            m3919S(zzqVar);
            return;
        }
        long j = zzqVar.f37080B;
        if (j == 0) {
            j = mo3909b().mo15860a();
        }
        this.f33501l.m24058A().m16723q();
        int i2 = zzqVar.f37081C;
        if (i2 != 0 && i2 != 1) {
            mo3895i().m14155w().m20651c("Incorrect app type, assuming installed app. appId, appType", om5.m14152z(zzqVar.f37092p), Integer.valueOf(i2));
            i2 = 0;
        }
        uh2 uh2Var3 = this.f33492c;
        m3920R(uh2Var3);
        uh2Var3.m8153e0();
        try {
            uh2 uh2Var4 = this.f33492c;
            m3920R(uh2Var4);
            mc8 m8160X = uh2Var4.m8160X(zzqVar.f37092p, "_npa");
            if (m8160X != null && !"auto".equals(m8160X.f18795b)) {
                str = "_sysu";
                str2 = "_sys";
                i = 1;
                uh2 uh2Var5 = this.f33492c;
                m3920R(uh2Var5);
                m8166R = uh2Var5.m8166R((String) ry0.m10830j(zzqVar.f37092p));
                if (m8166R == null && m3896h0().m24487b0(zzqVar.f37093q, m8166R.m12159i0(), zzqVar.f37084F, m8166R.m12173b0())) {
                    mo3895i().m14155w().m20652b("New GMP App Id passed in. Removing cached database data. appId", om5.m14152z(m8166R.m12169d0()));
                    uh2 uh2Var6 = this.f33492c;
                    m3920R(uh2Var6);
                    String m12169d0 = m8166R.m12169d0();
                    uh2Var6.m13533g();
                    uh2Var6.mo6991f();
                    ry0.m10834f(m12169d0);
                    try {
                        SQLiteDatabase m8168P = uh2Var6.m8168P();
                        String[] strArr = new String[i];
                        strArr[0] = m12169d0;
                        int delete = m8168P.delete("events", "app_id=?", strArr) + m8168P.delete("user_attributes", "app_id=?", strArr) + m8168P.delete("conditional_properties", "app_id=?", strArr) + m8168P.delete("apps", "app_id=?", strArr) + m8168P.delete("raw_events", "app_id=?", strArr) + m8168P.delete("raw_events_metadata", "app_id=?", strArr) + m8168P.delete("event_filters", "app_id=?", strArr) + m8168P.delete("property_filters", "app_id=?", strArr) + m8168P.delete("audience_filter_values", "app_id=?", strArr) + m8168P.delete("consent_settings", "app_id=?", strArr);
                        xk8.m5019b();
                        str3 = "_pfo";
                        try {
                            if (uh2Var6.f25143a.m24020z().m12677B(null, m75.f18562v0)) {
                                delete += m8168P.delete("default_event_params", "app_id=?", strArr);
                            }
                            if (delete > 0) {
                                uh2Var6.f25143a.mo3895i().m14156v().m20651c("Deleted application data. app, records", m12169d0, Integer.valueOf(delete));
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            uh2Var6.f25143a.mo3895i().m14160q().m20651c("Error deleting application data. appId, error", om5.m14152z(m12169d0), e);
                            m8166R = null;
                            if (m8166R != null) {
                            }
                            m3919S(zzqVar);
                            if (i2 == 0) {
                            }
                            if (m8162V != null) {
                            }
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        str3 = "_pfo";
                    }
                    m8166R = null;
                } else {
                    str3 = "_pfo";
                }
                if (m8166R != null) {
                    boolean z3 = (m8166R.m12191L() == -2147483648L || m8166R.m12191L() == zzqVar.f37101y) ? false : true;
                    String m12163g0 = m8166R.m12163g0();
                    if (z3 | ((m8166R.m12191L() != -2147483648L || m12163g0 == null || m12163g0.equals(zzqVar.f37094r)) ? false : true)) {
                        Bundle bundle = new Bundle();
                        bundle.putString("_pv", m12163g0);
                        m3897h(new zzaw("_au", new zzau(bundle), "auto", j), zzqVar);
                    }
                }
                m3919S(zzqVar);
                if (i2 == 0) {
                    uh2 uh2Var7 = this.f33492c;
                    m3920R(uh2Var7);
                    m8162V = uh2Var7.m8162V(zzqVar.f37092p, "_f");
                    z = false;
                } else {
                    uh2 uh2Var8 = this.f33492c;
                    m3920R(uh2Var8);
                    m8162V = uh2Var8.m8162V(zzqVar.f37092p, "_v");
                    z = true;
                }
                if (m8162V != null) {
                    if (zzqVar.f37100x) {
                        zzawVar = new zzaw("_cd", new zzau(new Bundle()), "auto", j);
                        m3891k(zzawVar, zzqVar);
                    }
                    uh2 uh2Var9 = this.f33492c;
                    m3920R(uh2Var9);
                    uh2Var9.m8146n();
                    return;
                }
                long j2 = ((j / 3600000) + 1) * 3600000;
                if (z) {
                    m3936B(new zzkw("_fvt", j, Long.valueOf(j2), "auto"), zzqVar);
                    mo3882r().mo6991f();
                    m3903e();
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("_c", 1L);
                    bundle2.putLong("_r", 1L);
                    bundle2.putLong("_et", 1L);
                    if (zzqVar.f37083E) {
                        bundle2.putLong("_dac", 1L);
                    }
                    zzawVar = new zzaw("_v", new zzau(bundle2), "auto", j);
                    m3891k(zzawVar, zzqVar);
                    uh2 uh2Var92 = this.f33492c;
                    m3920R(uh2Var92);
                    uh2Var92.m8146n();
                    return;
                }
                m3936B(new zzkw("_fot", j, Long.valueOf(j2), "auto"), zzqVar);
                mo3882r().mo6991f();
                u66 u66Var = (u66) ry0.m10830j(this.f33500k);
                String str7 = zzqVar.f37092p;
                if (str7 != null && !str7.isEmpty()) {
                    u66Var.f28593a.mo3882r().mo6991f();
                    if (u66Var.m8545a()) {
                        r56 r56Var = new r56(u66Var, str7);
                        u66Var.f28593a.mo3882r().mo6991f();
                        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                        PackageManager packageManager = u66Var.f28593a.mo3905d().getPackageManager();
                        if (packageManager == null) {
                            m14153y = u66Var.f28593a.mo3895i().m14153y();
                            str4 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer";
                        } else {
                            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                                ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                                if (serviceInfo != null) {
                                    String str8 = serviceInfo.packageName;
                                    if (serviceInfo.name != null && "com.android.vending".equals(str8) && u66Var.m8545a()) {
                                        try {
                                            u66Var.f28593a.mo3895i().m14156v().m20652b("Install Referrer Service is", true != C1291fj.m22614b().m22615a(u66Var.f28593a.mo3905d(), new Intent(intent), r56Var, 1) ? "not available" : "available");
                                        } catch (RuntimeException e3) {
                                            u66Var.f28593a.mo3895i().m14160q().m20652b("Exception occurred while binding to Install Referrer Service", e3.getMessage());
                                        }
                                    } else {
                                        m14153y = u66Var.f28593a.mo3895i().m14155w();
                                        str4 = "Play Store version 8.3.73 or higher required for Install Referrer";
                                    }
                                }
                                mo3882r().mo6991f();
                                m3903e();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("_c", 1L);
                                bundle3.putLong("_r", 1L);
                                bundle3.putLong("_uwa", 0L);
                                String str9 = str3;
                                bundle3.putLong(str9, 0L);
                                String str10 = str2;
                                bundle3.putLong(str10, 0L);
                                String str11 = str;
                                bundle3.putLong(str11, 0L);
                                bundle3.putLong("_et", 1L);
                                if (zzqVar.f37083E) {
                                    bundle3.putLong("_dac", 1L);
                                }
                                String str12 = (String) ry0.m10830j(zzqVar.f37092p);
                                uh2 uh2Var10 = this.f33492c;
                                m3920R(uh2Var10);
                                ry0.m10834f(str12);
                                uh2Var10.mo6991f();
                                uh2Var10.m13533g();
                                m8172L = uh2Var10.m8172L(str12, "first_open_count");
                                if (this.f33501l.mo3905d().getPackageManager() == null) {
                                    mo3895i().m14160q().m20652b("PackageManager is null, first open report might be inaccurate. appId", om5.m14152z(str12));
                                } else {
                                    try {
                                        packageInfo = ez1.m22979a(this.f33501l.mo3905d()).m19341f(str12, 0);
                                    } catch (PackageManager.NameNotFoundException e4) {
                                        mo3895i().m14160q().m20651c("Package info is null, first open report might be inaccurate. appId", om5.m14152z(str12), e4);
                                        packageInfo = null;
                                    }
                                    if (packageInfo != null) {
                                        long j3 = packageInfo.firstInstallTime;
                                        if (j3 != 0) {
                                            str5 = str12;
                                            if (j3 != packageInfo.lastUpdateTime) {
                                                applicationInfo = null;
                                                if (!m3917U().m12677B(null, m75.f18526d0)) {
                                                    bundle3.putLong("_uwa", 1L);
                                                } else if (m8172L == 0) {
                                                    bundle3.putLong("_uwa", 1L);
                                                    z2 = false;
                                                    m8172L = 0;
                                                }
                                                z2 = false;
                                            } else {
                                                applicationInfo = null;
                                                z2 = true;
                                            }
                                            str6 = str11;
                                            m3936B(new zzkw("_fi", j, Long.valueOf(true != z2 ? 0L : 1L), "auto"), zzqVar);
                                            String str13 = str5;
                                            applicationInfo2 = ez1.m22979a(this.f33501l.mo3905d()).m19344c(str13, 0);
                                            if (applicationInfo2 != null) {
                                                if ((applicationInfo2.flags & 1) != 0) {
                                                    bundle3.putLong(str10, 1L);
                                                }
                                                if ((applicationInfo2.flags & 128) != 0) {
                                                    bundle3.putLong(str6, 1L);
                                                }
                                            }
                                        }
                                    }
                                    str5 = str12;
                                    str6 = str11;
                                    applicationInfo = null;
                                    String str132 = str5;
                                    applicationInfo2 = ez1.m22979a(this.f33501l.mo3905d()).m19344c(str132, 0);
                                    if (applicationInfo2 != null) {
                                    }
                                }
                                if (m8172L >= 0) {
                                    bundle3.putLong(str9, m8172L);
                                }
                                m3891k(new zzaw("_f", new zzau(bundle3), "auto", j), zzqVar);
                                uh2 uh2Var922 = this.f33492c;
                                m3920R(uh2Var922);
                                uh2Var922.m8146n();
                                return;
                            }
                            m14153y = u66Var.f28593a.mo3895i().m14157u();
                            str4 = "Play Service for fetching Install Referrer is unavailable on device";
                        }
                    } else {
                        m14153y = u66Var.f28593a.mo3895i().m14157u();
                        str4 = "Install Referrer Reporter is not available";
                    }
                    m14153y.m20653a(str4);
                    mo3882r().mo6991f();
                    m3903e();
                    Bundle bundle32 = new Bundle();
                    bundle32.putLong("_c", 1L);
                    bundle32.putLong("_r", 1L);
                    bundle32.putLong("_uwa", 0L);
                    String str92 = str3;
                    bundle32.putLong(str92, 0L);
                    String str102 = str2;
                    bundle32.putLong(str102, 0L);
                    String str112 = str;
                    bundle32.putLong(str112, 0L);
                    bundle32.putLong("_et", 1L);
                    if (zzqVar.f37083E) {
                    }
                    String str122 = (String) ry0.m10830j(zzqVar.f37092p);
                    uh2 uh2Var102 = this.f33492c;
                    m3920R(uh2Var102);
                    ry0.m10834f(str122);
                    uh2Var102.mo6991f();
                    uh2Var102.m13533g();
                    m8172L = uh2Var102.m8172L(str122, "first_open_count");
                    if (this.f33501l.mo3905d().getPackageManager() == null) {
                    }
                    if (m8172L >= 0) {
                    }
                    m3891k(new zzaw("_f", new zzau(bundle32), "auto", j), zzqVar);
                    uh2 uh2Var9222 = this.f33492c;
                    m3920R(uh2Var9222);
                    uh2Var9222.m8146n();
                    return;
                }
                m14153y = u66Var.f28593a.mo3895i().m14153y();
                str4 = "Install Referrer Reporter was called with invalid app package name";
                m14153y.m20653a(str4);
                mo3882r().mo6991f();
                m3903e();
                Bundle bundle322 = new Bundle();
                bundle322.putLong("_c", 1L);
                bundle322.putLong("_r", 1L);
                bundle322.putLong("_uwa", 0L);
                String str922 = str3;
                bundle322.putLong(str922, 0L);
                String str1022 = str2;
                bundle322.putLong(str1022, 0L);
                String str1122 = str;
                bundle322.putLong(str1122, 0L);
                bundle322.putLong("_et", 1L);
                if (zzqVar.f37083E) {
                }
                String str1222 = (String) ry0.m10830j(zzqVar.f37092p);
                uh2 uh2Var1022 = this.f33492c;
                m3920R(uh2Var1022);
                ry0.m10834f(str1222);
                uh2Var1022.mo6991f();
                uh2Var1022.m13533g();
                m8172L = uh2Var1022.m8172L(str1222, "first_open_count");
                if (this.f33501l.mo3905d().getPackageManager() == null) {
                }
                if (m8172L >= 0) {
                }
                m3891k(new zzaw("_f", new zzau(bundle322), "auto", j), zzqVar);
                uh2 uh2Var92222 = this.f33492c;
                m3920R(uh2Var92222);
                uh2Var92222.m8146n();
                return;
            }
            if (zzqVar.f37085G != null) {
                str = "_sysu";
                str2 = "_sys";
                i = 1;
                zzkw zzkwVar = new zzkw("_npa", j, Long.valueOf(true != zzqVar.f37085G.booleanValue() ? 0L : 1L), "auto");
                if (m8160X == null || !m8160X.f18798e.equals(zzkwVar.f37075s)) {
                    m3936B(zzkwVar, zzqVar);
                }
            } else {
                str = "_sysu";
                str2 = "_sys";
                i = 1;
                if (m8160X != null) {
                    m3879u(new zzkw("_npa", j, null, "auto"), zzqVar);
                }
            }
            uh2 uh2Var52 = this.f33492c;
            m3920R(uh2Var52);
            m8166R = uh2Var52.m8166R((String) ry0.m10830j(zzqVar.f37092p));
            if (m8166R == null) {
            }
            str3 = "_pfo";
            if (m8166R != null) {
            }
            m3919S(zzqVar);
            if (i2 == 0) {
            }
            if (m8162V != null) {
            }
        } finally {
            uh2 uh2Var11 = this.f33492c;
            m3920R(uh2Var11);
            uh2Var11.m8152f0();
        }
    }

    /* renamed from: q */
    public final void m3883q() {
        this.f33506q++;
    }

    @Override // com.daaw.xe7
    /* renamed from: r */
    public final vn6 mo3882r() {
        return ((dr6) ry0.m10830j(this.f33501l)).mo3882r();
    }

    /* renamed from: s */
    public final void m3881s(zzac zzacVar) {
        zzq m3929I = m3929I((String) ry0.m10830j(zzacVar.f37056p));
        if (m3929I != null) {
            m3880t(zzacVar, m3929I);
        }
    }

    /* renamed from: t */
    public final void m3880t(zzac zzacVar, zzq zzqVar) {
        ry0.m10830j(zzacVar);
        ry0.m10834f(zzacVar.f37056p);
        ry0.m10830j(zzacVar.f37058r);
        ry0.m10834f(zzacVar.f37058r.f37073q);
        mo3882r().mo6991f();
        m3903e();
        if (m3921Q(zzqVar)) {
            if (!zzqVar.f37099w) {
                m3919S(zzqVar);
                return;
            }
            uh2 uh2Var = this.f33492c;
            m3920R(uh2Var);
            uh2Var.m8153e0();
            try {
                m3919S(zzqVar);
                String str = (String) ry0.m10830j(zzacVar.f37056p);
                uh2 uh2Var2 = this.f33492c;
                m3920R(uh2Var2);
                zzac m8165S = uh2Var2.m8165S(str, zzacVar.f37058r.f37073q);
                if (m8165S != null) {
                    mo3895i().m14161p().m20651c("Removing conditional user property", zzacVar.f37056p, this.f33501l.m24055D().m5131f(zzacVar.f37058r.f37073q));
                    uh2 uh2Var3 = this.f33492c;
                    m3920R(uh2Var3);
                    uh2Var3.m8174J(str, zzacVar.f37058r.f37073q);
                    if (m8165S.f37060t) {
                        uh2 uh2Var4 = this.f33492c;
                        m3920R(uh2Var4);
                        uh2Var4.m8148l(str, zzacVar.f37058r.f37073q);
                    }
                    zzaw zzawVar = zzacVar.f37066z;
                    if (zzawVar != null) {
                        zzau zzauVar = zzawVar.f37069q;
                        m3934D((zzaw) ry0.m10830j(m3896h0().m24457w0(str, ((zzaw) ry0.m10830j(zzacVar.f37066z)).f37068p, zzauVar != null ? zzauVar.m1078q() : null, m8165S.f37057q, zzacVar.f37066z.f37071s, true, true)), zzqVar);
                    }
                } else {
                    mo3895i().m14155w().m20651c("Conditional user property doesn't exist", om5.m14152z(zzacVar.f37056p), this.f33501l.m24055D().m5131f(zzacVar.f37058r.f37073q));
                }
                uh2 uh2Var5 = this.f33492c;
                m3920R(uh2Var5);
                uh2Var5.m8146n();
            } finally {
                uh2 uh2Var6 = this.f33492c;
                m3920R(uh2Var6);
                uh2Var6.m8152f0();
            }
        }
    }

    /* renamed from: u */
    public final void m3879u(zzkw zzkwVar, zzq zzqVar) {
        mo3882r().mo6991f();
        m3903e();
        if (m3921Q(zzqVar)) {
            if (!zzqVar.f37099w) {
                m3919S(zzqVar);
            } else if ("_npa".equals(zzkwVar.f37073q) && zzqVar.f37085G != null) {
                mo3895i().m14161p().m20653a("Falling back to manifest metadata value for ad personalization");
                m3936B(new zzkw("_npa", mo3909b().mo15860a(), Long.valueOf(true != zzqVar.f37085G.booleanValue() ? 0L : 1L), "auto"), zzqVar);
            } else {
                mo3895i().m14161p().m20652b("Removing user property", this.f33501l.m24055D().m5131f(zzkwVar.f37073q));
                uh2 uh2Var = this.f33492c;
                m3920R(uh2Var);
                uh2Var.m8153e0();
                try {
                    m3919S(zzqVar);
                    if ("_id".equals(zzkwVar.f37073q)) {
                        uh2 uh2Var2 = this.f33492c;
                        m3920R(uh2Var2);
                        uh2Var2.m8148l((String) ry0.m10830j(zzqVar.f37092p), "_lair");
                    }
                    uh2 uh2Var3 = this.f33492c;
                    m3920R(uh2Var3);
                    uh2Var3.m8148l((String) ry0.m10830j(zzqVar.f37092p), zzkwVar.f37073q);
                    uh2 uh2Var4 = this.f33492c;
                    m3920R(uh2Var4);
                    uh2Var4.m8146n();
                    mo3895i().m14161p().m20652b("User property removed", this.f33501l.m24055D().m5131f(zzkwVar.f37073q));
                } finally {
                    uh2 uh2Var5 = this.f33492c;
                    m3920R(uh2Var5);
                    uh2Var5.m8152f0();
                }
            }
        }
    }

    /* renamed from: v */
    public final void m3878v(zzq zzqVar) {
        if (this.f33513x != null) {
            ArrayList arrayList = new ArrayList();
            this.f33514y = arrayList;
            arrayList.addAll(this.f33513x);
        }
        uh2 uh2Var = this.f33492c;
        m3920R(uh2Var);
        String str = (String) ry0.m10830j(zzqVar.f37092p);
        ry0.m10834f(str);
        uh2Var.mo6991f();
        uh2Var.m13533g();
        try {
            SQLiteDatabase m8168P = uh2Var.m8168P();
            String[] strArr = {str};
            int delete = m8168P.delete("apps", "app_id=?", strArr) + m8168P.delete("events", "app_id=?", strArr) + m8168P.delete("user_attributes", "app_id=?", strArr) + m8168P.delete("conditional_properties", "app_id=?", strArr) + m8168P.delete("raw_events", "app_id=?", strArr) + m8168P.delete("raw_events_metadata", "app_id=?", strArr) + m8168P.delete("queue", "app_id=?", strArr) + m8168P.delete("audience_filter_values", "app_id=?", strArr) + m8168P.delete("main_event_params", "app_id=?", strArr) + m8168P.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                uh2Var.f25143a.mo3895i().m14156v().m20651c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            uh2Var.f25143a.mo3895i().m14160q().m20651c("Error resetting analytics data. appId, error", om5.m14152z(str), e);
        }
        if (zzqVar.f37099w) {
            m3884p(zzqVar);
        }
    }

    /* renamed from: w */
    public final void m3877w(String str, t38 t38Var) {
        mo3882r().mo6991f();
        String str2 = this.f33488D;
        if (str2 == null || str2.equals(str) || t38Var != null) {
            this.f33488D = str;
            this.f33487C = t38Var;
        }
    }

    /* renamed from: x */
    public final void m3876x() {
        mo3882r().mo6991f();
        uh2 uh2Var = this.f33492c;
        m3920R(uh2Var);
        uh2Var.m8150h0();
        if (this.f33498i.f6617g.m4400a() == 0) {
            this.f33498i.f6617g.m4399b(mo3909b().mo15860a());
        }
        m3925M();
    }

    /* renamed from: y */
    public final void m3875y(zzac zzacVar) {
        zzq m3929I = m3929I((String) ry0.m10830j(zzacVar.f37056p));
        if (m3929I != null) {
            m3874z(zzacVar, m3929I);
        }
    }

    /* renamed from: z */
    public final void m3874z(zzac zzacVar, zzq zzqVar) {
        hk5 m14160q;
        String str;
        Object m14152z;
        String m5131f;
        Object m1073h;
        hk5 m14160q2;
        String str2;
        Object m14152z2;
        String m5131f2;
        Object obj;
        ry0.m10830j(zzacVar);
        ry0.m10834f(zzacVar.f37056p);
        ry0.m10830j(zzacVar.f37057q);
        ry0.m10830j(zzacVar.f37058r);
        ry0.m10834f(zzacVar.f37058r.f37073q);
        mo3882r().mo6991f();
        m3903e();
        if (m3921Q(zzqVar)) {
            if (!zzqVar.f37099w) {
                m3919S(zzqVar);
                return;
            }
            zzac zzacVar2 = new zzac(zzacVar);
            boolean z = false;
            zzacVar2.f37060t = false;
            uh2 uh2Var = this.f33492c;
            m3920R(uh2Var);
            uh2Var.m8153e0();
            try {
                uh2 uh2Var2 = this.f33492c;
                m3920R(uh2Var2);
                zzac m8165S = uh2Var2.m8165S((String) ry0.m10830j(zzacVar2.f37056p), zzacVar2.f37058r.f37073q);
                if (m8165S != null && !m8165S.f37057q.equals(zzacVar2.f37057q)) {
                    mo3895i().m14155w().m20650d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f33501l.m24055D().m5131f(zzacVar2.f37058r.f37073q), zzacVar2.f37057q, m8165S.f37057q);
                }
                if (m8165S != null && m8165S.f37060t) {
                    zzacVar2.f37057q = m8165S.f37057q;
                    zzacVar2.f37059s = m8165S.f37059s;
                    zzacVar2.f37063w = m8165S.f37063w;
                    zzacVar2.f37061u = m8165S.f37061u;
                    zzacVar2.f37064x = m8165S.f37064x;
                    zzacVar2.f37060t = true;
                    zzkw zzkwVar = zzacVar2.f37058r;
                    zzacVar2.f37058r = new zzkw(zzkwVar.f37073q, m8165S.f37058r.f37074r, zzkwVar.m1073h(), m8165S.f37058r.f37077u);
                } else if (TextUtils.isEmpty(zzacVar2.f37061u)) {
                    zzkw zzkwVar2 = zzacVar2.f37058r;
                    zzacVar2.f37058r = new zzkw(zzkwVar2.f37073q, zzacVar2.f37059s, zzkwVar2.m1073h(), zzacVar2.f37058r.f37077u);
                    zzacVar2.f37060t = true;
                    z = true;
                }
                if (zzacVar2.f37060t) {
                    zzkw zzkwVar3 = zzacVar2.f37058r;
                    mc8 mc8Var = new mc8((String) ry0.m10830j(zzacVar2.f37056p), zzacVar2.f37057q, zzkwVar3.f37073q, zzkwVar3.f37074r, ry0.m10830j(zzkwVar3.m1073h()));
                    uh2 uh2Var3 = this.f33492c;
                    m3920R(uh2Var3);
                    if (uh2Var3.m8137x(mc8Var)) {
                        m14160q2 = mo3895i().m14161p();
                        str2 = "User property updated immediately";
                        m14152z2 = zzacVar2.f37056p;
                        m5131f2 = this.f33501l.m24055D().m5131f(mc8Var.f18796c);
                        obj = mc8Var.f18798e;
                    } else {
                        m14160q2 = mo3895i().m14160q();
                        str2 = "(2)Too many active user properties, ignoring";
                        m14152z2 = om5.m14152z(zzacVar2.f37056p);
                        m5131f2 = this.f33501l.m24055D().m5131f(mc8Var.f18796c);
                        obj = mc8Var.f18798e;
                    }
                    m14160q2.m20650d(str2, m14152z2, m5131f2, obj);
                    if (z && zzacVar2.f37064x != null) {
                        m3934D(new zzaw(zzacVar2.f37064x, zzacVar2.f37059s), zzqVar);
                    }
                }
                uh2 uh2Var4 = this.f33492c;
                m3920R(uh2Var4);
                if (uh2Var4.m8138w(zzacVar2)) {
                    m14160q = mo3895i().m14161p();
                    str = "Conditional property added";
                    m14152z = zzacVar2.f37056p;
                    m5131f = this.f33501l.m24055D().m5131f(zzacVar2.f37058r.f37073q);
                    m1073h = zzacVar2.f37058r.m1073h();
                } else {
                    m14160q = mo3895i().m14160q();
                    str = "Too many conditional properties, ignoring";
                    m14152z = om5.m14152z(zzacVar2.f37056p);
                    m5131f = this.f33501l.m24055D().m5131f(zzacVar2.f37058r.f37073q);
                    m1073h = zzacVar2.f37058r.m1073h();
                }
                m14160q.m20650d(str, m14152z, m5131f, m1073h);
                uh2 uh2Var5 = this.f33492c;
                m3920R(uh2Var5);
                uh2Var5.m8146n();
            } finally {
                uh2 uh2Var6 = this.f33492c;
                m3920R(uh2Var6);
                uh2Var6.m8152f0();
            }
        }
    }
}
