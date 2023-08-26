package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes.dex */
public final class SchemaManager_Factory implements Factory<SchemaManager> {
    private final Provider<Context> contextProvider;
    private final Provider<String> dbNameProvider;
    private final Provider<Integer> schemaVersionProvider;

    public SchemaManager_Factory(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        this.contextProvider = provider;
        this.dbNameProvider = provider2;
        this.schemaVersionProvider = provider3;
    }

    @Override // javax.inject.Provider
    public SchemaManager get() {
        return new SchemaManager(this.contextProvider.get(), this.dbNameProvider.get(), this.schemaVersionProvider.get().intValue());
    }

    public static SchemaManager_Factory create(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        return new SchemaManager_Factory(provider, provider2, provider3);
    }

    public static SchemaManager newInstance(Context context, String str, int i) {
        return new SchemaManager(context, str, i);
    }
}
