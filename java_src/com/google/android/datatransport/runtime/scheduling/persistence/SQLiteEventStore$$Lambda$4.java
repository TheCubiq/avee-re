package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
/* loaded from: classes.dex */
public final /* synthetic */ class SQLiteEventStore$$Lambda$4 implements SQLiteEventStore.Function {
    private static final SQLiteEventStore$$Lambda$4 instance = new SQLiteEventStore$$Lambda$4();

    private SQLiteEventStore$$Lambda$4() {
    }

    public static SQLiteEventStore.Function lambdaFactory$() {
        return instance;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public Object apply(Object obj) {
        return SQLiteEventStore.lambda$getDb$0((Throwable) obj);
    }
}
