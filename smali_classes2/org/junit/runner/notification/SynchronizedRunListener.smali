.class final Lorg/junit/runner/notification/SynchronizedRunListener;
.super Lorg/junit/runner/notification/RunListener;
.source "SynchronizedRunListener.java"


# annotations
.annotation runtime Lorg/junit/runner/notification/RunListener$ThreadSafe;
.end annotation


# instance fields
.field private final listener:Lorg/junit/runner/notification/RunListener;

.field private final monitor:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lorg/junit/runner/notification/RunListener;Ljava/lang/Object;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lorg/junit/runner/notification/RunListener;-><init>()V

    .line 28
    iput-object p1, p0, Lorg/junit/runner/notification/SynchronizedRunListener;->listener:Lorg/junit/runner/notification/RunListener;

    .line 29
    iput-object p2, p0, Lorg/junit/runner/notification/SynchronizedRunListener;->monitor:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 122
    :cond_0
    instance-of v0, p1, Lorg/junit/runner/notification/SynchronizedRunListener;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 125
    :cond_1
    check-cast p1, Lorg/junit/runner/notification/SynchronizedRunListener;

    .line 127
    iget-object v0, p0, Lorg/junit/runner/notification/SynchronizedRunListener;->listener:Lorg/junit/runner/notification/RunListener;

    iget-object p1, p1, Lorg/junit/runner/notification/SynchronizedRunListener;->listener:Lorg/junit/runner/notification/RunListener;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 114
    iget-object v0, p0, Lorg/junit/runner/notification/SynchronizedRunListener;->listener:Lorg/junit/runner/notification/RunListener;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public testAssumptionFailure(Lorg/junit/runner/notification/Failure;)V
    .locals 2

    .line 100
    iget-object v0, p0, Lorg/junit/runner/notification/SynchronizedRunListener;->monitor:Ljava/lang/Object;

    monitor-enter v0

    .line 101
    :try_start_0
    iget-object v1, p0, Lorg/junit/runner/notification/SynchronizedRunListener;->listener:Lorg/junit/runner/notification/RunListener;

    invoke-virtual {v1, p1}, Lorg/junit/runner/notification/RunListener;->testAssumptionFailure(Lorg/junit/runner/notification/Failure;)V

    .line 102
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public testFailure(Lorg/junit/runner/notification/Failure;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 93
    iget-object v0, p0, Lorg/junit/runner/notification/SynchronizedRunListener;->monitor:Ljava/lang/Object;

    monitor-enter v0

    .line 94
    :try_start_0
    iget-object v1, p0, Lorg/junit/runner/notification/SynchronizedRunListener;->listener:Lorg/junit/runner/notification/RunListener;

    invoke-virtual {v1, p1}, Lorg/junit/runner/notification/RunListener;->testFailure(Lorg/junit/runner/notification/Failure;)V

    .line 95
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public testFinished(Lorg/junit/runner/Description;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 86
    iget-object v0, p0, Lorg/junit/runner/notification/SynchronizedRunListener;->monitor:Ljava/lang/Object;

    monitor-enter v0

    .line 87
    :try_start_0
    iget-object v1, p0, Lorg/junit/runner/notification/SynchronizedRunListener;->listener:Lorg/junit/runner/notification/RunListener;

    invoke-virtual {v1, p1}, Lorg/junit/runner/notification/RunListener;->testFinished(Lorg/junit/runner/Description;)V

    .line 88
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public testIgnored(Lorg/junit/runner/Description;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 107
    iget-object v0, p0, Lorg/junit/runner/notification/SynchronizedRunListener;->monitor:Ljava/lang/Object;

    monitor-enter v0

    .line 108
    :try_start_0
    iget-object v1, p0, Lorg/junit/runner/notification/SynchronizedRunListener;->listener:Lorg/junit/runner/notification/RunListener;

    invoke-virtual {v1, p1}, Lorg/junit/runner/notification/RunListener;->testIgnored(Lorg/junit/runner/Description;)V

    .line 109
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public testRunFinished(Lorg/junit/runner/Result;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 41
    iget-object v0, p0, Lorg/junit/runner/notification/SynchronizedRunListener;->monitor:Ljava/lang/Object;

    monitor-enter v0

    .line 42
    :try_start_0
    iget-object v1, p0, Lorg/junit/runner/notification/SynchronizedRunListener;->listener:Lorg/junit/runner/notification/RunListener;

    invoke-virtual {v1, p1}, Lorg/junit/runner/notification/RunListener;->testRunFinished(Lorg/junit/runner/Result;)V

    .line 43
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public testRunStarted(Lorg/junit/runner/Description;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 34
    iget-object v0, p0, Lorg/junit/runner/notification/SynchronizedRunListener;->monitor:Ljava/lang/Object;

    monitor-enter v0

    .line 35
    :try_start_0
    iget-object v1, p0, Lorg/junit/runner/notification/SynchronizedRunListener;->listener:Lorg/junit/runner/notification/RunListener;

    invoke-virtual {v1, p1}, Lorg/junit/runner/notification/RunListener;->testRunStarted(Lorg/junit/runner/Description;)V

    .line 36
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public testStarted(Lorg/junit/runner/Description;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 79
    iget-object v0, p0, Lorg/junit/runner/notification/SynchronizedRunListener;->monitor:Ljava/lang/Object;

    monitor-enter v0

    .line 80
    :try_start_0
    iget-object v1, p0, Lorg/junit/runner/notification/SynchronizedRunListener;->listener:Lorg/junit/runner/notification/RunListener;

    invoke-virtual {v1, p1}, Lorg/junit/runner/notification/RunListener;->testStarted(Lorg/junit/runner/Description;)V

    .line 81
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public testSuiteFinished(Lorg/junit/runner/Description;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 72
    iget-object v0, p0, Lorg/junit/runner/notification/SynchronizedRunListener;->monitor:Ljava/lang/Object;

    monitor-enter v0

    .line 73
    :try_start_0
    iget-object v1, p0, Lorg/junit/runner/notification/SynchronizedRunListener;->listener:Lorg/junit/runner/notification/RunListener;

    invoke-virtual {v1, p1}, Lorg/junit/runner/notification/RunListener;->testSuiteFinished(Lorg/junit/runner/Description;)V

    .line 74
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public testSuiteStarted(Lorg/junit/runner/Description;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 57
    iget-object v0, p0, Lorg/junit/runner/notification/SynchronizedRunListener;->monitor:Ljava/lang/Object;

    monitor-enter v0

    .line 58
    :try_start_0
    iget-object v1, p0, Lorg/junit/runner/notification/SynchronizedRunListener;->listener:Lorg/junit/runner/notification/RunListener;

    invoke-virtual {v1, p1}, Lorg/junit/runner/notification/RunListener;->testSuiteStarted(Lorg/junit/runner/Description;)V

    .line 59
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 132
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/junit/runner/notification/SynchronizedRunListener;->listener:Lorg/junit/runner/notification/RunListener;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " (with synchronization wrapper)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
