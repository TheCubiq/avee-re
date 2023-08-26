package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
/* loaded from: classes.dex */
public final /* synthetic */ class SQLiteEventStore$$Lambda$6 implements SQLiteEventStore.Function {
    private static final SQLiteEventStore$$Lambda$6 instance = new SQLiteEventStore$$Lambda$6();

    private SQLiteEventStore$$Lambda$6() {
    }

    public static SQLiteEventStore.Function lambdaFactory$() {
        return instance;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public Object apply(Object obj) {
        return SQLiteEventStore.lambda$getTransportContextId$2((Cursor) obj);
    }
}
