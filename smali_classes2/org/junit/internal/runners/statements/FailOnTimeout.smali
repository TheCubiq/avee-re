.class public Lorg/junit/internal/runners/statements/FailOnTimeout;
.super Lorg/junit/runners/model/Statement;
.source "FailOnTimeout.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/junit/internal/runners/statements/FailOnTimeout$CallableStatement;,
        Lorg/junit/internal/runners/statements/FailOnTimeout$Builder;
    }
.end annotation


# instance fields
.field private final lookForStuckThread:Z

.field private final originalStatement:Lorg/junit/runners/model/Statement;

.field private final timeUnit:Ljava/util/concurrent/TimeUnit;

.field private final timeout:J


# direct methods
.method private constructor <init>(Lorg/junit/internal/runners/statements/FailOnTimeout$Builder;Lorg/junit/runners/model/Statement;)V
    .locals 2

    .line 46
    invoke-direct {p0}, Lorg/junit/runners/model/Statement;-><init>()V

    .line 47
    iput-object p2, p0, Lorg/junit/internal/runners/statements/FailOnTimeout;->originalStatement:Lorg/junit/runners/model/Statement;

    .line 48
    invoke-static {p1}, Lorg/junit/internal/runners/statements/FailOnTimeout$Builder;->access$100(Lorg/junit/internal/runners/statements/FailOnTimeout$Builder;)J

    move-result-wide v0

    iput-wide v0, p0, Lorg/junit/internal/runners/statements/FailOnTimeout;->timeout:J

    .line 49
    invoke-static {p1}, Lorg/junit/internal/runners/statements/FailOnTimeout$Builder;->access$200(Lorg/junit/internal/runners/statements/FailOnTimeout$Builder;)Ljava/util/concurrent/TimeUnit;

    move-result-object p2

    iput-object p2, p0, Lorg/junit/internal/runners/statements/FailOnTimeout;->timeUnit:Ljava/util/concurrent/TimeUnit;

    .line 50
    invoke-static {p1}, Lorg/junit/internal/runners/statements/FailOnTimeout$Builder;->access$300(Lorg/junit/internal/runners/statements/FailOnTimeout$Builder;)Z

    move-result p1

    iput-boolean p1, p0, Lorg/junit/internal/runners/statements/FailOnTimeout;->lookForStuckThread:Z

    return-void
.end method

.method synthetic constructor <init>(Lorg/junit/internal/runners/statements/FailOnTimeout$Builder;Lorg/junit/runners/model/Statement;Lorg/junit/internal/runners/statements/FailOnTimeout$1;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2}, Lorg/junit/internal/runners/statements/FailOnTimeout;-><init>(Lorg/junit/internal/runners/statements/FailOnTimeout$Builder;Lorg/junit/runners/model/Statement;)V

    return-void
.end method

.method public constructor <init>(Lorg/junit/runners/model/Statement;J)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 43
    invoke-static {}, Lorg/junit/internal/runners/statements/FailOnTimeout;->builder()Lorg/junit/internal/runners/statements/FailOnTimeout$Builder;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p2, p3, v1}, Lorg/junit/internal/runners/statements/FailOnTimeout$Builder;->withTimeout(JLjava/util/concurrent/TimeUnit;)Lorg/junit/internal/runners/statements/FailOnTimeout$Builder;

    move-result-object p2

    invoke-direct {p0, p2, p1}, Lorg/junit/internal/runners/statements/FailOnTimeout;-><init>(Lorg/junit/internal/runners/statements/FailOnTimeout$Builder;Lorg/junit/runners/model/Statement;)V

    return-void
.end method

.method static synthetic access$600(Lorg/junit/internal/runners/statements/FailOnTimeout;)Lorg/junit/runners/model/Statement;
    .locals 0

    .line 19
    iget-object p0, p0, Lorg/junit/internal/runners/statements/FailOnTimeout;->originalStatement:Lorg/junit/runners/model/Statement;

    return-object p0
.end method

.method public static builder()Lorg/junit/internal/runners/statements/FailOnTimeout$Builder;
    .locals 2

    .line 31
    new-instance v0, Lorg/junit/internal/runners/statements/FailOnTimeout$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/junit/internal/runners/statements/FailOnTimeout$Builder;-><init>(Lorg/junit/internal/runners/statements/FailOnTimeout$1;)V

    return-object v0
.end method

.method private cpuTime(Ljava/lang/Thread;)J
    .locals 3

    .line 272
    invoke-static {}, Lorg/junit/internal/management/ManagementFactory;->getThreadMXBean()Lorg/junit/internal/management/ThreadMXBean;

    move-result-object v0

    .line 273
    invoke-interface {v0}, Lorg/junit/internal/management/ThreadMXBean;->isThreadCpuTimeSupported()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 275
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Thread;->getId()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lorg/junit/internal/management/ThreadMXBean;->getThreadCpuTime(J)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method private createTimeoutException(Ljava/lang/Thread;)Ljava/lang/Exception;
    .locals 6

    .line 171
    invoke-virtual {p1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    .line 172
    iget-boolean v1, p0, Lorg/junit/internal/runners/statements/FailOnTimeout;->lookForStuckThread:Z

    if-eqz v1, :cond_0

    invoke-direct {p0, p1}, Lorg/junit/internal/runners/statements/FailOnTimeout;->getStuckThread(Ljava/lang/Thread;)Ljava/lang/Thread;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 173
    :goto_0
    new-instance v2, Lorg/junit/runners/model/TestTimedOutException;

    iget-wide v3, p0, Lorg/junit/internal/runners/statements/FailOnTimeout;->timeout:J

    iget-object v5, p0, Lorg/junit/internal/runners/statements/FailOnTimeout;->timeUnit:Ljava/util/concurrent/TimeUnit;

    invoke-direct {v2, v3, v4, v5}, Lorg/junit/runners/model/TestTimedOutException;-><init>(JLjava/util/concurrent/TimeUnit;)V

    if-eqz v0, :cond_1

    .line 175
    invoke-virtual {v2, v0}, Ljava/lang/Exception;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 176
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    :cond_1
    if-eqz v1, :cond_2

    .line 179
    new-instance p1, Ljava/lang/Exception;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Appears to be stuck in thread "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 182
    invoke-direct {p0, v1}, Lorg/junit/internal/runners/statements/FailOnTimeout;->getStackTrace(Ljava/lang/Thread;)[Ljava/lang/StackTraceElement;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Exception;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 183
    new-instance v0, Lorg/junit/runners/model/MultipleFailureException;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Throwable;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/junit/runners/model/MultipleFailureException;-><init>(Ljava/util/List;)V

    return-object v0

    :cond_2
    return-object v2
.end method

.method private getResult(Ljava/util/concurrent/FutureTask;Ljava/lang/Thread;)Ljava/lang/Throwable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/FutureTask<",
            "Ljava/lang/Throwable;",
            ">;",
            "Ljava/lang/Thread;",
            ")",
            "Ljava/lang/Throwable;"
        }
    .end annotation

    .line 155
    :try_start_0
    iget-wide v0, p0, Lorg/junit/internal/runners/statements/FailOnTimeout;->timeout:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    .line 156
    iget-wide v0, p0, Lorg/junit/internal/runners/statements/FailOnTimeout;->timeout:J

    iget-object v2, p0, Lorg/junit/internal/runners/statements/FailOnTimeout;->timeUnit:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    return-object p1

    .line 158
    :cond_0
    invoke-virtual {p1}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 166
    :catch_0
    invoke-direct {p0, p2}, Lorg/junit/internal/runners/statements/FailOnTimeout;->createTimeoutException(Ljava/lang/Thread;)Ljava/lang/Exception;

    move-result-object p1

    return-object p1

    :catch_1
    move-exception p1

    .line 164
    invoke-virtual {p1}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    return-object p1

    :catch_2
    move-exception p1

    return-object p1
.end method

.method private getStackTrace(Ljava/lang/Thread;)[Ljava/lang/StackTraceElement;
    .locals 0

    .line 198
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/StackTraceElement;

    return-object p1
.end method

.method private getStuckThread(Ljava/lang/Thread;)Ljava/lang/Thread;
    .locals 9

    .line 215
    invoke-virtual {p1}, Ljava/lang/Thread;->getThreadGroup()Ljava/lang/ThreadGroup;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/junit/internal/runners/statements/FailOnTimeout;->getThreadsInGroup(Ljava/lang/ThreadGroup;)Ljava/util/List;

    move-result-object v0

    .line 216
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    const-wide/16 v3, 0x0

    .line 227
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v1, v2

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Thread;

    .line 228
    invoke-virtual {v5}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    move-result-object v6

    sget-object v7, Ljava/lang/Thread$State;->RUNNABLE:Ljava/lang/Thread$State;

    if-ne v6, v7, :cond_1

    .line 229
    invoke-direct {p0, v5}, Lorg/junit/internal/runners/statements/FailOnTimeout;->cpuTime(Ljava/lang/Thread;)J

    move-result-wide v6

    if-eqz v1, :cond_2

    cmp-long v8, v6, v3

    if-lez v8, :cond_1

    :cond_2
    move-object v1, v5

    move-wide v3, v6

    goto :goto_0

    :cond_3
    if-ne v1, p1, :cond_4

    goto :goto_1

    :cond_4
    move-object v2, v1

    :goto_1
    return-object v2
.end method

.method private getThreadsInGroup(Ljava/lang/ThreadGroup;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ThreadGroup;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Thread;",
            ">;"
        }
    .end annotation

    .line 248
    invoke-virtual {p1}, Ljava/lang/ThreadGroup;->activeCount()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    const/16 v1, 0x64

    .line 249
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x5

    if-ge v2, v3, :cond_1

    .line 251
    new-array v3, v0, [Ljava/lang/Thread;

    .line 252
    invoke-virtual {p1, v3}, Ljava/lang/ThreadGroup;->enumerate([Ljava/lang/Thread;)I

    move-result v4

    if-ge v4, v0, :cond_0

    .line 254
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v1, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    add-int/lit8 v0, v0, 0x64

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 263
    :cond_1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public evaluate()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 121
    new-instance v0, Lorg/junit/internal/runners/statements/FailOnTimeout$CallableStatement;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/junit/internal/runners/statements/FailOnTimeout$CallableStatement;-><init>(Lorg/junit/internal/runners/statements/FailOnTimeout;Lorg/junit/internal/runners/statements/FailOnTimeout$1;)V

    .line 122
    new-instance v1, Ljava/util/concurrent/FutureTask;

    invoke-direct {v1, v0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 123
    new-instance v2, Ljava/lang/ThreadGroup;

    const-string v3, "FailOnTimeoutGroup"

    invoke-direct {v2, v3}, Ljava/lang/ThreadGroup;-><init>(Ljava/lang/String;)V

    .line 124
    new-instance v3, Ljava/lang/Thread;

    const-string v4, "Time-limited test"

    invoke-direct {v3, v2, v1, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/ThreadGroup;Ljava/lang/Runnable;Ljava/lang/String;)V

    const/4 v4, 0x1

    const-wide/16 v5, 0x1

    .line 126
    :try_start_0
    invoke-virtual {v3, v4}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 127
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    .line 128
    invoke-virtual {v0}, Lorg/junit/internal/runners/statements/FailOnTimeout$CallableStatement;->awaitStarted()V

    .line 129
    invoke-direct {p0, v1, v3}, Lorg/junit/internal/runners/statements/FailOnTimeout;->getResult(Ljava/util/concurrent/FutureTask;Ljava/lang/Thread;)Ljava/lang/Throwable;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 135
    :try_start_1
    invoke-virtual {v3, v5, v6}, Ljava/lang/Thread;->join(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 137
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 140
    :goto_0
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/ThreadGroup;->destroy()V
    :try_end_2
    .catch Ljava/lang/IllegalThreadStateException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    return-void

    .line 131
    :cond_0
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v0

    .line 135
    :try_start_4
    invoke-virtual {v3, v5, v6}, Ljava/lang/Thread;->join(J)V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_1

    .line 137
    :catch_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 140
    :goto_1
    :try_start_5
    invoke-virtual {v2}, Ljava/lang/ThreadGroup;->destroy()V
    :try_end_5
    .catch Ljava/lang/IllegalThreadStateException; {:try_start_5 .. :try_end_5} :catch_3

    .line 144
    :catch_3
    throw v0
.end method
