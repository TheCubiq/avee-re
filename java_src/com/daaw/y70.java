package com.daaw;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;
@Deprecated
/* loaded from: classes.dex */
public abstract class y70 {
    @GuardedBy("sAllClients")
    public static final Set<y70> a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* loaded from: classes.dex */
    public interface a extends ej {
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface b extends du0 {
    }
}
