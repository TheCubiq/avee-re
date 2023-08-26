package org.junit.internal.runners.statements;

import java.lang.Thread;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.junit.internal.management.ManagementFactory;
import org.junit.internal.management.ThreadMXBean;
import org.junit.runners.model.MultipleFailureException;
import org.junit.runners.model.Statement;
import org.junit.runners.model.TestTimedOutException;
/* loaded from: classes2.dex */
public class FailOnTimeout extends Statement {
    private final boolean lookForStuckThread;
    private final Statement originalStatement;
    private final TimeUnit timeUnit;
    private final long timeout;

    public static Builder builder() {
        return new Builder();
    }

    @Deprecated
    public FailOnTimeout(Statement statement, long j) {
        this(builder().withTimeout(j, TimeUnit.MILLISECONDS), statement);
    }

    private FailOnTimeout(Builder builder, Statement statement) {
        this.originalStatement = statement;
        this.timeout = builder.timeout;
        this.timeUnit = builder.unit;
        this.lookForStuckThread = builder.lookForStuckThread;
    }

    /* loaded from: classes2.dex */
    public static class Builder {
        private boolean lookForStuckThread;
        private long timeout;
        private TimeUnit unit;

        private Builder() {
            this.lookForStuckThread = false;
            this.timeout = 0L;
            this.unit = TimeUnit.SECONDS;
        }

        public Builder withTimeout(long j, TimeUnit timeUnit) {
            if (j >= 0) {
                if (timeUnit == null) {
                    throw new NullPointerException("TimeUnit cannot be null");
                }
                this.timeout = j;
                this.unit = timeUnit;
                return this;
            }
            throw new IllegalArgumentException("timeout must be non-negative");
        }

        public Builder withLookingForStuckThread(boolean z) {
            this.lookForStuckThread = z;
            return this;
        }

        public FailOnTimeout build(Statement statement) {
            if (statement == null) {
                throw new NullPointerException("statement cannot be null");
            }
            return new FailOnTimeout(this, statement);
        }
    }

    @Override // org.junit.runners.model.Statement
    public void evaluate() throws Throwable {
        CallableStatement callableStatement = new CallableStatement();
        FutureTask<Throwable> futureTask = new FutureTask<>(callableStatement);
        ThreadGroup threadGroup = new ThreadGroup("FailOnTimeoutGroup");
        Thread thread = new Thread(threadGroup, futureTask, "Time-limited test");
        try {
            thread.setDaemon(true);
            thread.start();
            callableStatement.awaitStarted();
            Throwable result = getResult(futureTask, thread);
            if (result != null) {
                throw result;
            }
            try {
                threadGroup.destroy();
            } catch (IllegalThreadStateException unused) {
            }
        } finally {
            try {
                thread.join(1L);
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            }
            try {
                threadGroup.destroy();
            } catch (IllegalThreadStateException unused3) {
            }
        }
    }

    private Throwable getResult(FutureTask<Throwable> futureTask, Thread thread) {
        try {
            if (this.timeout > 0) {
                return futureTask.get(this.timeout, this.timeUnit);
            }
            return futureTask.get();
        } catch (InterruptedException e) {
            return e;
        } catch (ExecutionException e2) {
            return e2.getCause();
        } catch (TimeoutException unused) {
            return createTimeoutException(thread);
        }
    }

    private Exception createTimeoutException(Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        Thread stuckThread = this.lookForStuckThread ? getStuckThread(thread) : null;
        TestTimedOutException testTimedOutException = new TestTimedOutException(this.timeout, this.timeUnit);
        if (stackTrace != null) {
            testTimedOutException.setStackTrace(stackTrace);
            thread.interrupt();
        }
        if (stuckThread != null) {
            Exception exc = new Exception("Appears to be stuck in thread " + stuckThread.getName());
            exc.setStackTrace(getStackTrace(stuckThread));
            return new MultipleFailureException(Arrays.asList(testTimedOutException, exc));
        }
        return testTimedOutException;
    }

    private StackTraceElement[] getStackTrace(Thread thread) {
        try {
            return thread.getStackTrace();
        } catch (SecurityException unused) {
            return new StackTraceElement[0];
        }
    }

    private Thread getStuckThread(Thread thread) {
        List<Thread> threadsInGroup = getThreadsInGroup(thread.getThreadGroup());
        if (threadsInGroup.isEmpty()) {
            return null;
        }
        long j = 0;
        Thread thread2 = null;
        for (Thread thread3 : threadsInGroup) {
            if (thread3.getState() == Thread.State.RUNNABLE) {
                long cpuTime = cpuTime(thread3);
                if (thread2 == null || cpuTime > j) {
                    thread2 = thread3;
                    j = cpuTime;
                }
            }
        }
        if (thread2 == thread) {
            return null;
        }
        return thread2;
    }

    private List<Thread> getThreadsInGroup(ThreadGroup threadGroup) {
        int max = Math.max(threadGroup.activeCount() * 2, 100);
        for (int i = 0; i < 5; i++) {
            Thread[] threadArr = new Thread[max];
            int enumerate = threadGroup.enumerate(threadArr);
            if (enumerate < max) {
                return Arrays.asList(threadArr).subList(0, enumerate);
            }
            max += 100;
        }
        return Collections.emptyList();
    }

    private long cpuTime(Thread thread) {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        if (threadMXBean.isThreadCpuTimeSupported()) {
            try {
                return threadMXBean.getThreadCpuTime(thread.getId());
            } catch (UnsupportedOperationException unused) {
                return 0L;
            }
        }
        return 0L;
    }

    /* loaded from: classes2.dex */
    private class CallableStatement implements Callable<Throwable> {
        private final CountDownLatch startLatch;

        private CallableStatement() {
            this.startLatch = new CountDownLatch(1);
        }

        @Override // java.util.concurrent.Callable
        public Throwable call() throws Exception {
            try {
                this.startLatch.countDown();
                FailOnTimeout.this.originalStatement.evaluate();
                return null;
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                return th;
            }
        }

        public void awaitStarted() throws InterruptedException {
            this.startLatch.await();
        }
    }
}
