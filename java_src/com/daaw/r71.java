package com.daaw;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.daaw.by;
import com.daaw.dl0;
import com.daaw.ri1;
import com.daaw.wf;
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
public class r71 implements ly, ri1, tf {
    public static final bx u = bx.b("proto");
    public final f91 p;
    public final cg q;
    public final cg r;
    public final my s;
    public final a01<String> t;

    /* loaded from: classes.dex */
    public interface b<T, U> {
        U apply(T t);
    }

    /* loaded from: classes.dex */
    public static class c {
        public final String a;
        public final String b;

        public c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* loaded from: classes.dex */
    public interface d<T> {
        T a();
    }

    public r71(cg cgVar, cg cgVar2, my myVar, f91 f91Var, a01<String> a01Var) {
        this.p = f91Var;
        this.q = cgVar;
        this.r = cgVar2;
        this.s = myVar;
        this.t = a01Var;
    }

    public static /* synthetic */ Object A0(Throwable th) {
        throw new qi1("Timed out while trying to acquire the lock.", th);
    }

    public static /* synthetic */ SQLiteDatabase B0(Throwable th) {
        throw new qi1("Timed out while trying to open db.", th);
    }

    public static /* synthetic */ Long C0(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0L);
    }

    public static /* synthetic */ ml1 D0(long j, Cursor cursor) {
        cursor.moveToNext();
        return ml1.c().c(cursor.getLong(0)).b(j).a();
    }

    public static /* synthetic */ ml1 E0(final long j, SQLiteDatabase sQLiteDatabase) {
        return (ml1) e1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: com.daaw.q61
            @Override // com.daaw.r71.b
            public final Object apply(Object obj) {
                ml1 D0;
                D0 = r71.D0(j, (Cursor) obj);
                return D0;
            }
        });
    }

    public static /* synthetic */ Long F0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean G0(sn1 sn1Var, SQLiteDatabase sQLiteDatabase) {
        Long t0 = t0(sQLiteDatabase, sn1Var);
        return t0 == null ? Boolean.FALSE : (Boolean) e1(o0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{t0.toString()}), new b() { // from class: com.daaw.d71
            @Override // com.daaw.r71.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    public static /* synthetic */ List H0(SQLiteDatabase sQLiteDatabase) {
        return (List) e1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: com.daaw.y61
            @Override // com.daaw.r71.b
            public final Object apply(Object obj) {
                List I0;
                I0 = r71.I0((Cursor) obj);
                return I0;
            }
        });
    }

    public static /* synthetic */ List I0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(sn1.a().b(cursor.getString(1)).d(fz0.b(cursor.getInt(2))).c(Y0(cursor.getString(3))).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List J0(sn1 sn1Var, SQLiteDatabase sQLiteDatabase) {
        cz0[] values;
        List<iw0> W0 = W0(sQLiteDatabase, sn1Var, this.s.d());
        for (cz0 cz0Var : cz0.values()) {
            if (cz0Var != sn1Var.d()) {
                int d2 = this.s.d() - W0.size();
                if (d2 <= 0) {
                    break;
                }
                W0.addAll(W0(sQLiteDatabase, sn1Var.f(cz0Var), d2));
            }
        }
        return w0(W0, X0(sQLiteDatabase, W0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ wf K0(Map map, wf.a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            dl0.b k0 = k0(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(dl0.c().c(k0).b(j).a());
        }
        Z0(aVar, map);
        aVar.e(s0());
        aVar.d(p0());
        aVar.c(this.t.get());
        return aVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ wf L0(String str, final Map map, final wf.a aVar, SQLiteDatabase sQLiteDatabase) {
        return (wf) e1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: com.daaw.u61
            @Override // com.daaw.r71.b
            public final Object apply(Object obj) {
                wf K0;
                K0 = r71.this.K0(map, aVar, (Cursor) obj);
                return K0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object M0(List list, sn1 sn1Var, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            by.a k = by.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            k.h(z ? new ww(c1(cursor.getString(4)), cursor.getBlob(5)) : new ww(c1(cursor.getString(4)), a1(j)));
            if (!cursor.isNull(6)) {
                k.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(iw0.a(j, sn1Var, k.d()));
        }
        return null;
    }

    public static /* synthetic */ Object N0(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long O0(by byVar, sn1 sn1Var, SQLiteDatabase sQLiteDatabase) {
        if (v0()) {
            u(1L, dl0.b.CACHE_FULL, byVar.j());
            return -1L;
        }
        long m0 = m0(sQLiteDatabase, sn1Var);
        int e = this.s.e();
        byte[] a2 = byVar.e().a();
        boolean z = a2.length <= e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(m0));
        contentValues.put("transport_name", byVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(byVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(byVar.k()));
        contentValues.put("payload_encoding", byVar.e().b().a());
        contentValues.put("code", byVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? a2 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            double length = a2.length;
            double d2 = e;
            Double.isNaN(length);
            Double.isNaN(d2);
            int ceil = (int) Math.ceil(length / d2);
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(a2, (i - 1) * e, Math.min(i * e, a2.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : byVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    public static /* synthetic */ byte[] P0(Cursor cursor) {
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
    public /* synthetic */ Object Q0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            u(i, dl0.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object R0(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        e1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: com.daaw.l71
            @Override // com.daaw.r71.b
            public final Object apply(Object obj) {
                Object Q0;
                Q0 = r71.this.Q0((Cursor) obj);
                return Q0;
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static /* synthetic */ Boolean S0(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    public static /* synthetic */ Object T0(String str, dl0.b bVar, long j, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) e1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.a())}), new b() { // from class: com.daaw.c71
            @Override // com.daaw.r71.b
            public final Object apply(Object obj) {
                Boolean S0;
                S0 = r71.S0((Cursor) obj);
                return S0;
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.a())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.a()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ Object U0(long j, sn1 sn1Var, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{sn1Var.b(), String.valueOf(fz0.a(sn1Var.d()))}) < 1) {
            contentValues.put("backend_name", sn1Var.b());
            contentValues.put("priority", Integer.valueOf(fz0.a(sn1Var.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object V0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.q.a()).execute();
        return null;
    }

    public static byte[] Y0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static bx c1(String str) {
        return str == null ? u : bx.b(str);
    }

    public static String d1(Iterable<iw0> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<iw0> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static <T> T e1(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object x0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            u(i, dl0.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer y0(long j, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j)};
        e1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: com.daaw.k71
            @Override // com.daaw.r71.b
            public final Object apply(Object obj) {
                Object x0;
                x0 = r71.this.x0((Cursor) obj);
                return x0;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static /* synthetic */ Object z0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    @Override // com.daaw.ly
    public long J(sn1 sn1Var) {
        return ((Long) e1(o0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{sn1Var.b(), String.valueOf(fz0.a(sn1Var.d()))}), new b() { // from class: com.daaw.z61
            @Override // com.daaw.r71.b
            public final Object apply(Object obj) {
                Long C0;
                C0 = r71.C0((Cursor) obj);
                return C0;
            }
        })).longValue();
    }

    @Override // com.daaw.ly
    public void O(Iterable<iw0> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + d1(iterable);
            u0(new b() { // from class: com.daaw.r61
                @Override // com.daaw.r71.b
                public final Object apply(Object obj) {
                    Object R0;
                    R0 = r71.this.R0(str, r3, (SQLiteDatabase) obj);
                    return R0;
                }
            });
        }
    }

    public final List<iw0> W0(SQLiteDatabase sQLiteDatabase, final sn1 sn1Var, int i) {
        final ArrayList arrayList = new ArrayList();
        Long t0 = t0(sQLiteDatabase, sn1Var);
        if (t0 == null) {
            return arrayList;
        }
        e1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{t0.toString()}, null, null, null, String.valueOf(i)), new b() { // from class: com.daaw.t61
            @Override // com.daaw.r71.b
            public final Object apply(Object obj) {
                Object M0;
                M0 = r71.this.M0(arrayList, sn1Var, (Cursor) obj);
                return M0;
            }
        });
        return arrayList;
    }

    public final Map<Long, Set<c>> X0(SQLiteDatabase sQLiteDatabase, List<iw0> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).c());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        e1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new b() { // from class: com.daaw.w61
            @Override // com.daaw.r71.b
            public final Object apply(Object obj) {
                Object N0;
                N0 = r71.N0(hashMap, (Cursor) obj);
                return N0;
            }
        });
        return hashMap;
    }

    public final void Z0(wf.a aVar, Map<String, List<dl0>> map) {
        for (Map.Entry<String, List<dl0>> entry : map.entrySet()) {
            aVar.a(il0.c().c(entry.getKey()).b(entry.getValue()).a());
        }
    }

    public final byte[] a1(long j) {
        return (byte[]) e1(o0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), new b() { // from class: com.daaw.x61
            @Override // com.daaw.r71.b
            public final Object apply(Object obj) {
                byte[] P0;
                P0 = r71.P0((Cursor) obj);
                return P0;
            }
        });
    }

    public final <T> T b1(d<T> dVar, b<Throwable, T> bVar) {
        long a2 = this.r.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.r.a() >= this.s.b() + a2) {
                    return bVar.apply(e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // com.daaw.ly
    public int c() {
        final long a2 = this.q.a() - this.s.c();
        return ((Integer) u0(new b() { // from class: com.daaw.n71
            @Override // com.daaw.r71.b
            public final Object apply(Object obj) {
                Integer y0;
                y0 = r71.this.y0(a2, (SQLiteDatabase) obj);
                return y0;
            }
        })).intValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.p.close();
    }

    @Override // com.daaw.tf
    public void d() {
        u0(new b() { // from class: com.daaw.m71
            @Override // com.daaw.r71.b
            public final Object apply(Object obj) {
                Object V0;
                V0 = r71.this.V0((SQLiteDatabase) obj);
                return V0;
            }
        });
    }

    @Override // com.daaw.ly
    public void e(Iterable<iw0> iterable) {
        if (iterable.iterator().hasNext()) {
            o0().compileStatement("DELETE FROM events WHERE _id in " + d1(iterable)).execute();
        }
    }

    public final dl0.b k0(int i) {
        dl0.b bVar = dl0.b.REASON_UNKNOWN;
        if (i == bVar.a()) {
            return bVar;
        }
        dl0.b bVar2 = dl0.b.MESSAGE_TOO_OLD;
        if (i == bVar2.a()) {
            return bVar2;
        }
        dl0.b bVar3 = dl0.b.CACHE_FULL;
        if (i == bVar3.a()) {
            return bVar3;
        }
        dl0.b bVar4 = dl0.b.PAYLOAD_TOO_BIG;
        if (i == bVar4.a()) {
            return bVar4;
        }
        dl0.b bVar5 = dl0.b.MAX_RETRIES_REACHED;
        if (i == bVar5.a()) {
            return bVar5;
        }
        dl0.b bVar6 = dl0.b.INVALID_PAYLOD;
        if (i == bVar6.a()) {
            return bVar6;
        }
        dl0.b bVar7 = dl0.b.SERVER_ERROR;
        if (i == bVar7.a()) {
            return bVar7;
        }
        nl0.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
        return bVar;
    }

    @Override // com.daaw.ly
    public boolean l(final sn1 sn1Var) {
        return ((Boolean) u0(new b() { // from class: com.daaw.q71
            @Override // com.daaw.r71.b
            public final Object apply(Object obj) {
                Boolean G0;
                G0 = r71.this.G0(sn1Var, (SQLiteDatabase) obj);
                return G0;
            }
        })).booleanValue();
    }

    public final void l0(final SQLiteDatabase sQLiteDatabase) {
        b1(new d() { // from class: com.daaw.h71
            @Override // com.daaw.r71.d
            public final Object a() {
                Object z0;
                z0 = r71.z0(sQLiteDatabase);
                return z0;
            }
        }, new b() { // from class: com.daaw.g71
            @Override // com.daaw.r71.b
            public final Object apply(Object obj) {
                Object A0;
                A0 = r71.A0((Throwable) obj);
                return A0;
            }
        });
    }

    public final long m0(SQLiteDatabase sQLiteDatabase, sn1 sn1Var) {
        Long t0 = t0(sQLiteDatabase, sn1Var);
        if (t0 != null) {
            return t0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", sn1Var.b());
        contentValues.put("priority", Integer.valueOf(fz0.a(sn1Var.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (sn1Var.c() != null) {
            contentValues.put("extras", Base64.encodeToString(sn1Var.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    @Override // com.daaw.tf
    public wf n() {
        final wf.a e = wf.e();
        final HashMap hashMap = new HashMap();
        return (wf) u0(new b() { // from class: com.daaw.s61
            @Override // com.daaw.r71.b
            public final Object apply(Object obj) {
                wf L0;
                L0 = r71.this.L0(r2, hashMap, e, (SQLiteDatabase) obj);
                return L0;
            }
        });
    }

    public long n0() {
        return q0() * r0();
    }

    @Override // com.daaw.ly
    public Iterable<sn1> o() {
        return (Iterable) u0(new b() { // from class: com.daaw.e71
            @Override // com.daaw.r71.b
            public final Object apply(Object obj) {
                List H0;
                H0 = r71.H0((SQLiteDatabase) obj);
                return H0;
            }
        });
    }

    public SQLiteDatabase o0() {
        final f91 f91Var = this.p;
        Objects.requireNonNull(f91Var);
        return (SQLiteDatabase) b1(new d() { // from class: com.daaw.i71
            @Override // com.daaw.r71.d
            public final Object a() {
                return f91.this.getWritableDatabase();
            }
        }, new b() { // from class: com.daaw.f71
            @Override // com.daaw.r71.b
            public final Object apply(Object obj) {
                SQLiteDatabase B0;
                B0 = r71.B0((Throwable) obj);
                return B0;
            }
        });
    }

    @Override // com.daaw.ly
    public void p(final sn1 sn1Var, final long j) {
        u0(new b() { // from class: com.daaw.j71
            @Override // com.daaw.r71.b
            public final Object apply(Object obj) {
                Object U0;
                U0 = r71.U0(j, sn1Var, (SQLiteDatabase) obj);
                return U0;
            }
        });
    }

    public final q70 p0() {
        return q70.b().b(zf1.c().b(n0()).c(my.a.f()).a()).a();
    }

    @Override // com.daaw.ri1
    public <T> T q(ri1.a<T> aVar) {
        SQLiteDatabase o0 = o0();
        l0(o0);
        try {
            T a2 = aVar.a();
            o0.setTransactionSuccessful();
            return a2;
        } finally {
            o0.endTransaction();
        }
    }

    public final long q0() {
        return o0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public final long r0() {
        return o0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public final ml1 s0() {
        final long a2 = this.q.a();
        return (ml1) u0(new b() { // from class: com.daaw.b71
            @Override // com.daaw.r71.b
            public final Object apply(Object obj) {
                ml1 E0;
                E0 = r71.E0(a2, (SQLiteDatabase) obj);
                return E0;
            }
        });
    }

    public final Long t0(SQLiteDatabase sQLiteDatabase, sn1 sn1Var) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(sn1Var.b(), String.valueOf(fz0.a(sn1Var.d()))));
        if (sn1Var.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(sn1Var.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) e1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: com.daaw.a71
            @Override // com.daaw.r71.b
            public final Object apply(Object obj) {
                Long F0;
                F0 = r71.F0((Cursor) obj);
                return F0;
            }
        });
    }

    @Override // com.daaw.tf
    public void u(final long j, final dl0.b bVar, final String str) {
        u0(new b() { // from class: com.daaw.v61
            @Override // com.daaw.r71.b
            public final Object apply(Object obj) {
                Object T0;
                T0 = r71.T0(str, bVar, j, (SQLiteDatabase) obj);
                return T0;
            }
        });
    }

    public <T> T u0(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase o0 = o0();
        o0.beginTransaction();
        try {
            T apply = bVar.apply(o0);
            o0.setTransactionSuccessful();
            return apply;
        } finally {
            o0.endTransaction();
        }
    }

    @Override // com.daaw.ly
    public iw0 v(final sn1 sn1Var, final by byVar) {
        nl0.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", sn1Var.d(), byVar.j(), sn1Var.b());
        long longValue = ((Long) u0(new b() { // from class: com.daaw.o71
            @Override // com.daaw.r71.b
            public final Object apply(Object obj) {
                Long O0;
                O0 = r71.this.O0(byVar, sn1Var, (SQLiteDatabase) obj);
                return O0;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return iw0.a(longValue, sn1Var, byVar);
    }

    public final boolean v0() {
        return q0() * r0() >= this.s.f();
    }

    public final List<iw0> w0(List<iw0> list, Map<Long, Set<c>> map) {
        ListIterator<iw0> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            iw0 next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                by.a l = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    l.c(cVar.a, cVar.b);
                }
                listIterator.set(iw0.a(next.c(), next.d(), l.d()));
            }
        }
        return list;
    }

    @Override // com.daaw.ly
    public Iterable<iw0> y(final sn1 sn1Var) {
        return (Iterable) u0(new b() { // from class: com.daaw.p71
            @Override // com.daaw.r71.b
            public final Object apply(Object obj) {
                List J0;
                J0 = r71.this.J0(sn1Var, (SQLiteDatabase) obj);
                return J0;
            }
        });
    }
}
