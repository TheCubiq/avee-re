package org.junit.internal.management;
/* loaded from: classes2.dex */
final class FakeThreadMXBean implements ThreadMXBean {
    @Override // org.junit.internal.management.ThreadMXBean
    public boolean isThreadCpuTimeSupported() {
        return false;
    }

    @Override // org.junit.internal.management.ThreadMXBean
    public long getThreadCpuTime(long j) {
        throw new UnsupportedOperationException();
    }
}
