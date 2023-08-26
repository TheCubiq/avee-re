package com.google.android.exoplayer2.upstream;

import android.content.Context;
import com.google.android.exoplayer2.upstream.DataSource;
/* loaded from: classes.dex */
public final class DefaultDataSourceFactory implements DataSource.Factory {
    private final DataSource.Factory baseDataSourceFactory;
    private final Context context;
    private final TransferListener<? super DataSource> listener;

    public DefaultDataSourceFactory(Context context, String str) {
        this(context, str, (TransferListener<? super DataSource>) null);
    }

    public DefaultDataSourceFactory(Context context, String str, TransferListener<? super DataSource> transferListener) {
        this(context, transferListener, new DefaultHttpDataSourceFactory(str, transferListener));
    }

    public DefaultDataSourceFactory(Context context, TransferListener<? super DataSource> transferListener, DataSource.Factory factory) {
        this.context = context.getApplicationContext();
        this.listener = transferListener;
        this.baseDataSourceFactory = factory;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public DefaultDataSource createDataSource() {
        return new DefaultDataSource(this.context, this.listener, this.baseDataSourceFactory.createDataSource());
    }
}
