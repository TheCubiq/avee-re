package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Inject;
/* loaded from: classes.dex */
class CreationContextFactory {
    private final Context applicationContext;
    private final Clock monotonicClock;
    private final Clock wallClock;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Inject
    public CreationContextFactory(Context context, Clock clock, Clock clock2) {
        this.applicationContext = context;
        this.wallClock = clock;
        this.monotonicClock = clock2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CreationContext create(String str) {
        return CreationContext.create(this.applicationContext, this.wallClock, this.monotonicClock, str);
    }
}
