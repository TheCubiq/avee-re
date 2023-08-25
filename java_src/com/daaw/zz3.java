package com.daaw;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class zz3 {

    /* renamed from: a */
    public static final ThreadPoolExecutor f35692a = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new yz3("ClientDefault"));

    /* renamed from: b */
    public static final ExecutorService f35693b = Executors.newSingleThreadExecutor(new yz3("ClientSingle"));
}
