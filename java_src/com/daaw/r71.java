package com.daaw;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.daaw.AbstractC0896by;
import com.daaw.C3435wf;
import com.daaw.dl0;
import com.daaw.ri1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public class r71 implements InterfaceC2134ly, ri1, InterfaceC3072tf {

    /* renamed from: u */
    public static final C0892bx f24930u = C0892bx.m25779b("proto");

    /* renamed from: p */
    public final f91 f24931p;

    /* renamed from: q */
    public final InterfaceC0951cg f24932q;

    /* renamed from: r */
    public final InterfaceC0951cg f24933r;

    /* renamed from: s */
    public final AbstractC2223my f24934s;

    /* renamed from: t */
    public final a01<String> f24935t;

    /* renamed from: com.daaw.r71$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2833b<T, U> {
        U apply(T t);
    }

    /* renamed from: com.daaw.r71$c */
    /* loaded from: classes.dex */
    public static class C2834c {

        /* renamed from: a */
        public final String f24936a;

        /* renamed from: b */
        public final String f24937b;

        public C2834c(String str, String str2) {
            this.f24936a = str;
            this.f24937b = str2;
        }
    }

    /* renamed from: com.daaw.r71$d */
    /* loaded from: classes.dex */
    public interface InterfaceC2835d<T> {
        /* renamed from: a */
        T mo11604a();
    }

    public r71(InterfaceC0951cg interfaceC0951cg, InterfaceC0951cg interfaceC0951cg2, AbstractC2223my abstractC2223my, f91 f91Var, a01<String> a01Var) {
        this.f24931p = f91Var;
        this.f24932q = interfaceC0951cg;
        this.f24933r = interfaceC0951cg2;
        this.f24934s = abstractC2223my;
        this.f24935t = a01Var;
    }

    /* renamed from: A0 */
    public static /* synthetic */ Object m11685A0(Throwable th) {
        throw new qi1("Timed out while trying to acquire the lock.", th);
    }

    /* renamed from: B0 */
    public static /* synthetic */ SQLiteDatabase m11684B0(Throwable th) {
        throw new qi1("Timed out while trying to open db.", th);
    }

    /* renamed from: C0 */
    public static /* synthetic */ Long m11683C0(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0L);
    }

    /* renamed from: D0 */
    public static /* synthetic */ ml1 m11681D0(long j, Cursor cursor) {
        cursor.moveToNext();
        return ml1.m15967c().m15964c(cursor.getLong(0)).m15965b(j).m15966a();
    }

    /* renamed from: E0 */
    public static /* synthetic */ ml1 m11679E0(final long j, SQLiteDatabase sQLiteDatabase) {
        return (ml1) m11632e1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new InterfaceC2833b() { // from class: com.daaw.q61
            @Override // com.daaw.r71.InterfaceC2833b
            public final Object apply(Object obj) {
                ml1 m11681D0;
                m11681D0 = r71.m11681D0(j, (Cursor) obj);
                return m11681D0;
            }
        });
    }

    /* renamed from: F0 */
    public static /* synthetic */ Long m11678F0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G0 */
    public /* synthetic */ Boolean m11677G0(sn1 sn1Var, SQLiteDatabase sQLiteDatabase) {
        Long m11614t0 = m11614t0(sQLiteDatabase, sn1Var);
        return m11614t0 == null ? Boolean.FALSE : (Boolean) m11632e1(m11620o0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{m11614t0.toString()}), new InterfaceC2833b() { // from class: com.daaw.d71
            @Override // com.daaw.r71.InterfaceC2833b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* renamed from: H0 */
    public static /* synthetic */ List m11676H0(SQLiteDatabase sQLiteDatabase) {
        return (List) m11632e1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new InterfaceC2833b() { // from class: com.daaw.y61
            @Override // com.daaw.r71.InterfaceC2833b
            public final Object apply(Object obj) {
                List m11675I0;
                m11675I0 = r71.m11675I0((Cursor) obj);
                return m11675I0;
            }
        });
    }

    /* renamed from: I0 */
    public static /* synthetic */ List m11675I0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(sn1.m10151a().mo6332b(cursor.getString(1)).mo6330d(fz0.m22131b(cursor.getInt(2))).mo6331c(m11646Y0(cursor.getString(3))).mo6333a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J0 */
    public /* synthetic */ List m11673J0(sn1 sn1Var, SQLiteDatabase sQLiteDatabase) {
        cz0[] values;
        List<iw0> m11650W0 = m11650W0(sQLiteDatabase, sn1Var, this.f24934s.mo15675d());
        for (cz0 cz0Var : cz0.values()) {
            if (cz0Var != sn1Var.mo6334d()) {
                int mo15675d = this.f24934s.mo15675d() - m11650W0.size();
                if (mo15675d <= 0) {
                    break;
                }
                m11650W0.addAll(m11650W0(sQLiteDatabase, sn1Var.m10149f(cz0Var), mo15675d));
            }
        }
        return m11609w0(m11650W0, m11648X0(sQLiteDatabase, m11650W0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K0 */
    public /* synthetic */ C3435wf m11671K0(Map map, C3435wf.C3436a c3436a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            dl0.EnumC1102b m11626k0 = m11626k0(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(dl0.m24284c().m24281c(m11626k0).m24282b(j).m24283a());
        }
        m11644Z0(c3436a, map);
        c3436a.m6099e(m11615s0());
        c3436a.m6100d(m11618p0());
        c3436a.m6101c(this.f24935t.get());
        return c3436a.m6102b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L0 */
    public /* synthetic */ C3435wf m11669L0(String str, final Map map, final C3435wf.C3436a c3436a, SQLiteDatabase sQLiteDatabase) {
        return (C3435wf) m11632e1(sQLiteDatabase.rawQuery(str, new String[0]), new InterfaceC2833b() { // from class: com.daaw.u61
            @Override // com.daaw.r71.InterfaceC2833b
            public final Object apply(Object obj) {
                C3435wf m11671K0;
                m11671K0 = r71.this.m11671K0(map, c3436a, (Cursor) obj);
                return m11671K0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M0 */
    public /* synthetic */ Object m11667M0(List list, sn1 sn1Var, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            AbstractC0896by.AbstractC0897a mo25493k = AbstractC0896by.m25748a().mo25494j(cursor.getString(1)).mo25495i(cursor.getLong(2)).mo25493k(cursor.getLong(3));
            mo25493k.mo25496h(z ? new C3475ww(m11637c1(cursor.getString(4)), cursor.getBlob(5)) : new C3475ww(m11637c1(cursor.getString(4)), m11642a1(j)));
            if (!cursor.isNull(6)) {
                mo25493k.mo25497g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(iw0.m19310a(j, sn1Var, mo25493k.mo25500d()));
        }
        return null;
    }

    /* renamed from: N0 */
    public static /* synthetic */ Object m11666N0(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new C2834c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O0 */
    public /* synthetic */ Long m11664O0(AbstractC0896by abstractC0896by, sn1 sn1Var, SQLiteDatabase sQLiteDatabase) {
        if (m11611v0()) {
            mo9213u(1L, dl0.EnumC1102b.CACHE_FULL, abstractC0896by.mo25502j());
            return -1L;
        }
        long m11623m0 = m11623m0(sQLiteDatabase, sn1Var);
        int mo15674e = this.f24934s.mo15674e();
        byte[] m5756a = abstractC0896by.mo25504e().m5756a();
        boolean z = m5756a.length <= mo15674e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(m11623m0));
        contentValues.put("transport_name", abstractC0896by.mo25502j());
        contentValues.put("timestamp_ms", Long.valueOf(abstractC0896by.mo25503f()));
        contentValues.put("uptime_ms", Long.valueOf(abstractC0896by.mo25501k()));
        contentValues.put("payload_encoding", abstractC0896by.mo25504e().m5755b().m25780a());
        contentValues.put("code", abstractC0896by.mo25505d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? m5756a : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            double length = m5756a.length;
            double d = mo15674e;
            Double.isNaN(length);
            Double.isNaN(d);
            int ceil = (int) Math.ceil(length / d);
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(m5756a, (i - 1) * mo15674e, Math.min(i * mo15674e, m5756a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : abstractC0896by.m25744i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* renamed from: P0 */
    public static /* synthetic */ byte[] m11662P0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q0 */
    public /* synthetic */ Object m11660Q0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo9213u(i, dl0.EnumC1102b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R0 */
    public /* synthetic */ Object m11659R0(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        m11632e1(sQLiteDatabase.rawQuery(str2, null), new InterfaceC2833b() { // from class: com.daaw.l71
            @Override // com.daaw.r71.InterfaceC2833b
            public final Object apply(Object obj) {
                Object m11660Q0;
                m11660Q0 = r71.this.m11660Q0((Cursor) obj);
                return m11660Q0;
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* renamed from: S0 */
    public static /* synthetic */ Boolean m11658S0(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* renamed from: T0 */
    public static /* synthetic */ Object m11656T0(String str, dl0.EnumC1102b enumC1102b, long j, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) m11632e1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(enumC1102b.mo8669a())}), new InterfaceC2833b() { // from class: com.daaw.c71
            @Override // com.daaw.r71.InterfaceC2833b
            public final Object apply(Object obj) {
                Boolean m11658S0;
                m11658S0 = r71.m11658S0((Cursor) obj);
                return m11658S0;
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(enumC1102b.mo8669a())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(enumC1102b.mo8669a()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    /* renamed from: U0 */
    public static /* synthetic */ Object m11654U0(long j, sn1 sn1Var, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{sn1Var.mo6336b(), String.valueOf(fz0.m22132a(sn1Var.mo6334d()))}) < 1) {
            contentValues.put("backend_name", sn1Var.mo6336b());
            contentValues.put("priority", Integer.valueOf(fz0.m22132a(sn1Var.mo6334d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V0 */
    public /* synthetic */ Object m11652V0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f24932q.mo21345a()).execute();
        return null;
    }

    /* renamed from: Y0 */
    public static byte[] m11646Y0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: c1 */
    public static C0892bx m11637c1(String str) {
        return str == null ? f24930u : C0892bx.m25779b(str);
    }

    /* renamed from: d1 */
    public static String m11635d1(Iterable<iw0> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<iw0> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo17096c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: e1 */
    public static <T> T m11632e1(Cursor cursor, InterfaceC2833b<Cursor, T> interfaceC2833b) {
        try {
            return interfaceC2833b.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public /* synthetic */ Object m11608x0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo9213u(i, dl0.EnumC1102b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public /* synthetic */ Integer m11606y0(long j, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j)};
        m11632e1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new InterfaceC2833b() { // from class: com.daaw.k71
            @Override // com.daaw.r71.InterfaceC2833b
            public final Object apply(Object obj) {
                Object m11608x0;
                m11608x0 = r71.this.m11608x0((Cursor) obj);
                return m11608x0;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* renamed from: z0 */
    public static /* synthetic */ Object m11605z0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    @Override // com.daaw.InterfaceC2134ly
    /* renamed from: J */
    public long mo11674J(sn1 sn1Var) {
        return ((Long) m11632e1(m11620o0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{sn1Var.mo6336b(), String.valueOf(fz0.m22132a(sn1Var.mo6334d()))}), new InterfaceC2833b() { // from class: com.daaw.z61
            @Override // com.daaw.r71.InterfaceC2833b
            public final Object apply(Object obj) {
                Long m11683C0;
                m11683C0 = r71.m11683C0((Cursor) obj);
                return m11683C0;
            }
        })).longValue();
    }

    @Override // com.daaw.InterfaceC2134ly
    /* renamed from: O */
    public void mo11665O(Iterable<iw0> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m11635d1(iterable);
            m11613u0(new InterfaceC2833b() { // from class: com.daaw.r61
                @Override // com.daaw.r71.InterfaceC2833b
                public final Object apply(Object obj) {
                    Object m11659R0;
                    m11659R0 = r71.this.m11659R0(str, r3, (SQLiteDatabase) obj);
                    return m11659R0;
                }
            });
        }
    }

    /* renamed from: W0 */
    public final List<iw0> m11650W0(SQLiteDatabase sQLiteDatabase, final sn1 sn1Var, int i) {
        final ArrayList arrayList = new ArrayList();
        Long m11614t0 = m11614t0(sQLiteDatabase, sn1Var);
        if (m11614t0 == null) {
            return arrayList;
        }
        m11632e1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{m11614t0.toString()}, null, null, null, String.valueOf(i)), new InterfaceC2833b() { // from class: com.daaw.t61
            @Override // com.daaw.r71.InterfaceC2833b
            public final Object apply(Object obj) {
                Object m11667M0;
                m11667M0 = r71.this.m11667M0(arrayList, sn1Var, (Cursor) obj);
                return m11667M0;
            }
        });
        return arrayList;
    }

    /* renamed from: X0 */
    public final Map<Long, Set<C2834c>> m11648X0(SQLiteDatabase sQLiteDatabase, List<iw0> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).mo17096c());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        m11632e1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new InterfaceC2833b() { // from class: com.daaw.w61
            @Override // com.daaw.r71.InterfaceC2833b
            public final Object apply(Object obj) {
                Object m11666N0;
                m11666N0 = r71.m11666N0(hashMap, (Cursor) obj);
                return m11666N0;
            }
        });
        return hashMap;
    }

    /* renamed from: Z0 */
    public final void m11644Z0(C3435wf.C3436a c3436a, Map<String, List<dl0>> map) {
        for (Map.Entry<String, List<dl0>> entry : map.entrySet()) {
            c3436a.m6103a(il0.m19671c().m19668c(entry.getKey()).m19669b(entry.getValue()).m19670a());
        }
    }

    /* renamed from: a1 */
    public final byte[] m11642a1(long j) {
        return (byte[]) m11632e1(m11620o0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), new InterfaceC2833b() { // from class: com.daaw.x61
            @Override // com.daaw.r71.InterfaceC2833b
            public final Object apply(Object obj) {
                byte[] m11662P0;
                m11662P0 = r71.m11662P0((Cursor) obj);
                return m11662P0;
            }
        });
    }

    /* renamed from: b1 */
    public final <T> T m11640b1(InterfaceC2835d<T> interfaceC2835d, InterfaceC2833b<Throwable, T> interfaceC2833b) {
        long mo21345a = this.f24933r.mo21345a();
        while (true) {
            try {
                return interfaceC2835d.mo11604a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f24933r.mo21345a() >= this.f24934s.mo15677b() + mo21345a) {
                    return interfaceC2833b.apply(e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // com.daaw.InterfaceC2134ly
    /* renamed from: c */
    public int mo11639c() {
        final long mo21345a = this.f24932q.mo21345a() - this.f24934s.mo15676c();
        return ((Integer) m11613u0(new InterfaceC2833b() { // from class: com.daaw.n71
            @Override // com.daaw.r71.InterfaceC2833b
            public final Object apply(Object obj) {
                Integer m11606y0;
                m11606y0 = r71.this.m11606y0(mo21345a, (SQLiteDatabase) obj);
                return m11606y0;
            }
        })).intValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f24931p.close();
    }

    @Override // com.daaw.InterfaceC3072tf
    /* renamed from: d */
    public void mo9215d() {
        m11613u0(new InterfaceC2833b() { // from class: com.daaw.m71
            @Override // com.daaw.r71.InterfaceC2833b
            public final Object apply(Object obj) {
                Object m11652V0;
                m11652V0 = r71.this.m11652V0((SQLiteDatabase) obj);
                return m11652V0;
            }
        });
    }

    @Override // com.daaw.InterfaceC2134ly
    /* renamed from: e */
    public void mo11634e(Iterable<iw0> iterable) {
        if (iterable.iterator().hasNext()) {
            m11620o0().compileStatement("DELETE FROM events WHERE _id in " + m11635d1(iterable)).execute();
        }
    }

    /* renamed from: k0 */
    public final dl0.EnumC1102b m11626k0(int i) {
        dl0.EnumC1102b enumC1102b = dl0.EnumC1102b.REASON_UNKNOWN;
        if (i == enumC1102b.mo8669a()) {
            return enumC1102b;
        }
        dl0.EnumC1102b enumC1102b2 = dl0.EnumC1102b.MESSAGE_TOO_OLD;
        if (i == enumC1102b2.mo8669a()) {
            return enumC1102b2;
        }
        dl0.EnumC1102b enumC1102b3 = dl0.EnumC1102b.CACHE_FULL;
        if (i == enumC1102b3.mo8669a()) {
            return enumC1102b3;
        }
        dl0.EnumC1102b enumC1102b4 = dl0.EnumC1102b.PAYLOAD_TOO_BIG;
        if (i == enumC1102b4.mo8669a()) {
            return enumC1102b4;
        }
        dl0.EnumC1102b enumC1102b5 = dl0.EnumC1102b.MAX_RETRIES_REACHED;
        if (i == enumC1102b5.mo8669a()) {
            return enumC1102b5;
        }
        dl0.EnumC1102b enumC1102b6 = dl0.EnumC1102b.INVALID_PAYLOD;
        if (i == enumC1102b6.mo8669a()) {
            return enumC1102b6;
        }
        dl0.EnumC1102b enumC1102b7 = dl0.EnumC1102b.SERVER_ERROR;
        if (i == enumC1102b7.mo8669a()) {
            return enumC1102b7;
        }
        nl0.m15088b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
        return enumC1102b;
    }

    @Override // com.daaw.InterfaceC2134ly
    /* renamed from: l */
    public boolean mo11625l(final sn1 sn1Var) {
        return ((Boolean) m11613u0(new InterfaceC2833b() { // from class: com.daaw.q71
            @Override // com.daaw.r71.InterfaceC2833b
            public final Object apply(Object obj) {
                Boolean m11677G0;
                m11677G0 = r71.this.m11677G0(sn1Var, (SQLiteDatabase) obj);
                return m11677G0;
            }
        })).booleanValue();
    }

    /* renamed from: l0 */
    public final void m11624l0(final SQLiteDatabase sQLiteDatabase) {
        m11640b1(new InterfaceC2835d() { // from class: com.daaw.h71
            @Override // com.daaw.r71.InterfaceC2835d
            /* renamed from: a */
            public final Object mo11604a() {
                Object m11605z0;
                m11605z0 = r71.m11605z0(sQLiteDatabase);
                return m11605z0;
            }
        }, new InterfaceC2833b() { // from class: com.daaw.g71
            @Override // com.daaw.r71.InterfaceC2833b
            public final Object apply(Object obj) {
                Object m11685A0;
                m11685A0 = r71.m11685A0((Throwable) obj);
                return m11685A0;
            }
        });
    }

    /* renamed from: m0 */
    public final long m11623m0(SQLiteDatabase sQLiteDatabase, sn1 sn1Var) {
        Long m11614t0 = m11614t0(sQLiteDatabase, sn1Var);
        if (m11614t0 != null) {
            return m11614t0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", sn1Var.mo6336b());
        contentValues.put("priority", Integer.valueOf(fz0.m22132a(sn1Var.mo6334d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (sn1Var.mo6335c() != null) {
            contentValues.put("extras", Base64.encodeToString(sn1Var.mo6335c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    @Override // com.daaw.InterfaceC3072tf
    /* renamed from: n */
    public C3435wf mo9214n() {
        final C3435wf.C3436a m6105e = C3435wf.m6105e();
        final HashMap hashMap = new HashMap();
        return (C3435wf) m11613u0(new InterfaceC2833b() { // from class: com.daaw.s61
            @Override // com.daaw.r71.InterfaceC2833b
            public final Object apply(Object obj) {
                C3435wf m11669L0;
                m11669L0 = r71.this.m11669L0(r2, hashMap, m6105e, (SQLiteDatabase) obj);
                return m11669L0;
            }
        });
    }

    /* renamed from: n0 */
    public long m11622n0() {
        return m11617q0() * m11616r0();
    }

    @Override // com.daaw.InterfaceC2134ly
    /* renamed from: o */
    public Iterable<sn1> mo11621o() {
        return (Iterable) m11613u0(new InterfaceC2833b() { // from class: com.daaw.e71
            @Override // com.daaw.r71.InterfaceC2833b
            public final Object apply(Object obj) {
                List m11676H0;
                m11676H0 = r71.m11676H0((SQLiteDatabase) obj);
                return m11676H0;
            }
        });
    }

    /* renamed from: o0 */
    public SQLiteDatabase m11620o0() {
        final f91 f91Var = this.f24931p;
        Objects.requireNonNull(f91Var);
        return (SQLiteDatabase) m11640b1(new InterfaceC2835d() { // from class: com.daaw.i71
            @Override // com.daaw.r71.InterfaceC2835d
            /* renamed from: a */
            public final Object mo11604a() {
                return f91.this.getWritableDatabase();
            }
        }, new InterfaceC2833b() { // from class: com.daaw.f71
            @Override // com.daaw.r71.InterfaceC2833b
            public final Object apply(Object obj) {
                SQLiteDatabase m11684B0;
                m11684B0 = r71.m11684B0((Throwable) obj);
                return m11684B0;
            }
        });
    }

    @Override // com.daaw.InterfaceC2134ly
    /* renamed from: p */
    public void mo11619p(final sn1 sn1Var, final long j) {
        m11613u0(new InterfaceC2833b() { // from class: com.daaw.j71
            @Override // com.daaw.r71.InterfaceC2833b
            public final Object apply(Object obj) {
                Object m11654U0;
                m11654U0 = r71.m11654U0(j, sn1Var, (SQLiteDatabase) obj);
                return m11654U0;
            }
        });
    }

    /* renamed from: p0 */
    public final q70 m11618p0() {
        return q70.m12725b().m12723b(zf1.m2357c().m2355b(m11622n0()).m2354c(AbstractC2223my.f19283a.mo15673f()).m2356a()).m12724a();
    }

    @Override // com.daaw.ri1
    /* renamed from: q */
    public <T> T mo11287q(ri1.InterfaceC2864a<T> interfaceC2864a) {
        SQLiteDatabase m11620o0 = m11620o0();
        m11624l0(m11620o0);
        try {
            T mo1807a = interfaceC2864a.mo1807a();
            m11620o0.setTransactionSuccessful();
            return mo1807a;
        } finally {
            m11620o0.endTransaction();
        }
    }

    /* renamed from: q0 */
    public final long m11617q0() {
        return m11620o0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* renamed from: r0 */
    public final long m11616r0() {
        return m11620o0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* renamed from: s0 */
    public final ml1 m11615s0() {
        final long mo21345a = this.f24932q.mo21345a();
        return (ml1) m11613u0(new InterfaceC2833b() { // from class: com.daaw.b71
            @Override // com.daaw.r71.InterfaceC2833b
            public final Object apply(Object obj) {
                ml1 m11679E0;
                m11679E0 = r71.m11679E0(mo21345a, (SQLiteDatabase) obj);
                return m11679E0;
            }
        });
    }

    /* renamed from: t0 */
    public final Long m11614t0(SQLiteDatabase sQLiteDatabase, sn1 sn1Var) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(sn1Var.mo6336b(), String.valueOf(fz0.m22132a(sn1Var.mo6334d()))));
        if (sn1Var.mo6335c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(sn1Var.mo6335c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) m11632e1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new InterfaceC2833b() { // from class: com.daaw.a71
            @Override // com.daaw.r71.InterfaceC2833b
            public final Object apply(Object obj) {
                Long m11678F0;
                m11678F0 = r71.m11678F0((Cursor) obj);
                return m11678F0;
            }
        });
    }

    @Override // com.daaw.InterfaceC3072tf
    /* renamed from: u */
    public void mo9213u(final long j, final dl0.EnumC1102b enumC1102b, final String str) {
        m11613u0(new InterfaceC2833b() { // from class: com.daaw.v61
            @Override // com.daaw.r71.InterfaceC2833b
            public final Object apply(Object obj) {
                Object m11656T0;
                m11656T0 = r71.m11656T0(str, enumC1102b, j, (SQLiteDatabase) obj);
                return m11656T0;
            }
        });
    }

    /* renamed from: u0 */
    public <T> T m11613u0(InterfaceC2833b<SQLiteDatabase, T> interfaceC2833b) {
        SQLiteDatabase m11620o0 = m11620o0();
        m11620o0.beginTransaction();
        try {
            T apply = interfaceC2833b.apply(m11620o0);
            m11620o0.setTransactionSuccessful();
            return apply;
        } finally {
            m11620o0.endTransaction();
        }
    }

    @Override // com.daaw.InterfaceC2134ly
    /* renamed from: v */
    public iw0 mo11612v(final sn1 sn1Var, final AbstractC0896by abstractC0896by) {
        nl0.m15087c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", sn1Var.mo6334d(), abstractC0896by.mo25502j(), sn1Var.mo6336b());
        long longValue = ((Long) m11613u0(new InterfaceC2833b() { // from class: com.daaw.o71
            @Override // com.daaw.r71.InterfaceC2833b
            public final Object apply(Object obj) {
                Long m11664O0;
                m11664O0 = r71.this.m11664O0(abstractC0896by, sn1Var, (SQLiteDatabase) obj);
                return m11664O0;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return iw0.m19310a(longValue, sn1Var, abstractC0896by);
    }

    /* renamed from: v0 */
    public final boolean m11611v0() {
        return m11617q0() * m11616r0() >= this.f24934s.mo15673f();
    }

    /* renamed from: w0 */
    public final List<iw0> m11609w0(List<iw0> list, Map<Long, Set<C2834c>> map) {
        ListIterator<iw0> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            iw0 next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo17096c()))) {
                AbstractC0896by.AbstractC0897a m25743l = next.mo17097b().m25743l();
                for (C2834c c2834c : map.get(Long.valueOf(next.mo17096c()))) {
                    m25743l.m25740c(c2834c.f24936a, c2834c.f24937b);
                }
                listIterator.set(iw0.m19310a(next.mo17096c(), next.mo17095d(), m25743l.mo25500d()));
            }
        }
        return list;
    }

    @Override // com.daaw.InterfaceC2134ly
    /* renamed from: y */
    public Iterable<iw0> mo11607y(final sn1 sn1Var) {
        return (Iterable) m11613u0(new InterfaceC2833b() { // from class: com.daaw.p71
            @Override // com.daaw.r71.InterfaceC2833b
            public final Object apply(Object obj) {
                List m11673J0;
                m11673J0 = r71.this.m11673J0(sn1Var, (SQLiteDatabase) obj);
                return m11673J0;
            }
        });
    }
}
