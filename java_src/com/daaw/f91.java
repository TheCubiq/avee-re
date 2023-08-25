package com.daaw;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class f91 extends SQLiteOpenHelper {

    /* renamed from: r */
    public static final String f9246r = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: s */
    public static int f9247s = 5;

    /* renamed from: t */
    public static final InterfaceC1264a f9248t;

    /* renamed from: u */
    public static final InterfaceC1264a f9249u;

    /* renamed from: v */
    public static final InterfaceC1264a f9250v;

    /* renamed from: w */
    public static final InterfaceC1264a f9251w;

    /* renamed from: x */
    public static final InterfaceC1264a f9252x;

    /* renamed from: y */
    public static final List<InterfaceC1264a> f9253y;

    /* renamed from: p */
    public final int f9254p;

    /* renamed from: q */
    public boolean f9255q;

    /* renamed from: com.daaw.f91$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1264a {
        /* renamed from: a */
        void mo22832a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        d91 d91Var = new InterfaceC1264a() { // from class: com.daaw.d91
            @Override // com.daaw.f91.InterfaceC1264a
            /* renamed from: a */
            public final void mo22832a(SQLiteDatabase sQLiteDatabase) {
                f91.m22844E(sQLiteDatabase);
            }
        };
        f9248t = d91Var;
        a91 a91Var = new InterfaceC1264a() { // from class: com.daaw.a91
            @Override // com.daaw.f91.InterfaceC1264a
            /* renamed from: a */
            public final void mo22832a(SQLiteDatabase sQLiteDatabase) {
                f91.m22843K(sQLiteDatabase);
            }
        };
        f9249u = a91Var;
        b91 b91Var = new InterfaceC1264a() { // from class: com.daaw.b91
            @Override // com.daaw.f91.InterfaceC1264a
            /* renamed from: a */
            public final void mo22832a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f9250v = b91Var;
        c91 c91Var = new InterfaceC1264a() { // from class: com.daaw.c91
            @Override // com.daaw.f91.InterfaceC1264a
            /* renamed from: a */
            public final void mo22832a(SQLiteDatabase sQLiteDatabase) {
                f91.m22841M(sQLiteDatabase);
            }
        };
        f9251w = c91Var;
        e91 e91Var = new InterfaceC1264a() { // from class: com.daaw.e91
            @Override // com.daaw.f91.InterfaceC1264a
            /* renamed from: a */
            public final void mo22832a(SQLiteDatabase sQLiteDatabase) {
                f91.m22840P(sQLiteDatabase);
            }
        };
        f9252x = e91Var;
        f9253y = Arrays.asList(d91Var, a91Var, b91Var, c91Var, e91Var);
    }

    public f91(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f9255q = false;
        this.f9254p = i;
    }

    /* renamed from: E */
    public static /* synthetic */ void m22844E(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* renamed from: K */
    public static /* synthetic */ void m22843K(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* renamed from: M */
    public static /* synthetic */ void m22841M(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* renamed from: P */
    public static /* synthetic */ void m22840P(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f9246r);
    }

    /* renamed from: D */
    public final void m22845D(SQLiteDatabase sQLiteDatabase) {
        if (this.f9255q) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    /* renamed from: Q */
    public final void m22839Q(SQLiteDatabase sQLiteDatabase, int i) {
        m22845D(sQLiteDatabase);
        m22838T(sQLiteDatabase, 0, i);
    }

    /* renamed from: T */
    public final void m22838T(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<InterfaceC1264a> list = f9253y;
        if (i2 <= list.size()) {
            while (i < i2) {
                f9253y.get(i).mo22832a(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f9255q = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m22839Q(sQLiteDatabase, this.f9254p);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        m22839Q(sQLiteDatabase, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m22845D(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m22845D(sQLiteDatabase);
        m22838T(sQLiteDatabase, i, i2);
    }
}
