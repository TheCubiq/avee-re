package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
/* loaded from: classes.dex */
public final /* synthetic */ class Uploader$$Lambda$2 implements SynchronizationGuard.CriticalSection {
    private final Uploader arg$1;
    private final TransportContext arg$2;

    private Uploader$$Lambda$2(Uploader uploader, TransportContext transportContext) {
        this.arg$1 = uploader;
        this.arg$2 = transportContext;
    }

    public static SynchronizationGuard.CriticalSection lambdaFactory$(Uploader uploader, TransportContext transportContext) {
        return new Uploader$$Lambda$2(uploader, transportContext);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        Iterable loadBatch;
        loadBatch = this.arg$1.eventStore.loadBatch(this.arg$2);
        return loadBatch;
    }
}
