.class public Ljunit/framework/TestResult;
.super Ljava/lang/Object;
.source "TestResult.java"


# instance fields
.field protected fErrors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljunit/framework/TestFailure;",
            ">;"
        }
    .end annotation
.end field

.field protected fFailures:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljunit/framework/TestFailure;",
            ">;"
        }
    .end annotation
.end field

.field protected fListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljunit/framework/TestListener;",
            ">;"
        }
    .end annotation
.end field

.field protected fRunTests:I

.field private fStop:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ljunit/framework/TestResult;->fFailures:Ljava/util/List;

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ljunit/framework/TestResult;->fErrors:Ljava/util/List;

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ljunit/framework/TestResult;->fListeners:Ljava/util/List;

    const/4 v0, 0x0

    .line 28
    iput v0, p0, Ljunit/framework/TestResult;->fRunTests:I

    .line 29
    iput-boolean v0, p0, Ljunit/framework/TestResult;->fStop:Z

    return-void
.end method

.method private declared-synchronized cloneListeners()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljunit/framework/TestListener;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    .line 72
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 73
    iget-object v1, p0, Ljunit/framework/TestResult;->fListeners:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public declared-synchronized addError(Ljunit/framework/Test;Ljava/lang/Throwable;)V
    .locals 2

    monitor-enter p0

    .line 37
    :try_start_0
    iget-object v0, p0, Ljunit/framework/TestResult;->fErrors:Ljava/util/List;

    new-instance v1, Ljunit/framework/TestFailure;

    invoke-direct {v1, p1, p2}, Ljunit/framework/TestFailure;-><init>(Ljunit/framework/Test;Ljava/lang/Throwable;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    invoke-direct {p0}, Ljunit/framework/TestResult;->cloneListeners()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljunit/framework/TestListener;

    .line 39
    invoke-interface {v1, p1, p2}, Ljunit/framework/TestListener;->addError(Ljunit/framework/Test;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 41
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public declared-synchronized addFailure(Ljunit/framework/Test;Ljunit/framework/AssertionFailedError;)V
    .locals 2

    monitor-enter p0

    .line 48
    :try_start_0
    iget-object v0, p0, Ljunit/framework/TestResult;->fFailures:Ljava/util/List;

    new-instance v1, Ljunit/framework/TestFailure;

    invoke-direct {v1, p1, p2}, Ljunit/framework/TestFailure;-><init>(Ljunit/framework/Test;Ljava/lang/Throwable;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    invoke-direct {p0}, Ljunit/framework/TestResult;->cloneListeners()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljunit/framework/TestListener;

    .line 50
    invoke-interface {v1, p1, p2}, Ljunit/framework/TestListener;->addFailure(Ljunit/framework/Test;Ljunit/framework/AssertionFailedError;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 52
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public declared-synchronized addListener(Ljunit/framework/TestListener;)V
    .locals 1

    monitor-enter p0

    .line 58
    :try_start_0
    iget-object v0, p0, Ljunit/framework/TestResult;->fListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public endTest(Ljunit/framework/Test;)V
    .locals 2

    .line 81
    invoke-direct {p0}, Ljunit/framework/TestResult;->cloneListeners()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljunit/framework/TestListener;

    .line 82
    invoke-interface {v1, p1}, Ljunit/framework/TestListener;->endTest(Ljunit/framework/Test;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public declared-synchronized errorCount()I
    .locals 1

    monitor-enter p0

    .line 90
    :try_start_0
    iget-object v0, p0, Ljunit/framework/TestResult;->fErrors:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized errors()Ljava/util/Enumeration;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Enumeration<",
            "Ljunit/framework/TestFailure;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    .line 97
    :try_start_0
    iget-object v0, p0, Ljunit/framework/TestResult;->fErrors:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->enumeration(Ljava/util/Collection;)Ljava/util/Enumeration;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized failureCount()I
    .locals 1

    monitor-enter p0

    .line 105
    :try_start_0
    iget-object v0, p0, Ljunit/framework/TestResult;->fFailures:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized failures()Ljava/util/Enumeration;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Enumeration<",
            "Ljunit/framework/TestFailure;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    .line 112
    :try_start_0
    iget-object v0, p0, Ljunit/framework/TestResult;->fFailures:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->enumeration(Ljava/util/Collection;)Ljava/util/Enumeration;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized removeListener(Ljunit/framework/TestListener;)V
    .locals 1

    monitor-enter p0

    .line 65
    :try_start_0
    iget-object v0, p0, Ljunit/framework/TestResult;->fListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method protected run(Ljunit/framework/TestCase;)V
    .locals 1

    .line 119
    invoke-virtual {p0, p1}, Ljunit/framework/TestResult;->startTest(Ljunit/framework/Test;)V

    .line 120
    new-instance v0, Ljunit/framework/TestResult$1;

    invoke-direct {v0, p0, p1}, Ljunit/framework/TestResult$1;-><init>(Ljunit/framework/TestResult;Ljunit/framework/TestCase;)V

    .line 125
    invoke-virtual {p0, p1, v0}, Ljunit/framework/TestResult;->runProtected(Ljunit/framework/Test;Ljunit/framework/Protectable;)V

    .line 127
    invoke-virtual {p0, p1}, Ljunit/framework/TestResult;->endTest(Ljunit/framework/Test;)V

    return-void
.end method

.method public declared-synchronized runCount()I
    .locals 1

    monitor-enter p0

    .line 134
    :try_start_0
    iget v0, p0, Ljunit/framework/TestResult;->fRunTests:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public runProtected(Ljunit/framework/Test;Ljunit/framework/Protectable;)V
    .locals 0

    .line 142
    :try_start_0
    invoke-interface {p2}, Ljunit/framework/Protectable;->protect()V
    :try_end_0
    .catch Ljunit/framework/AssertionFailedError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    .line 148
    invoke-virtual {p0, p1, p2}, Ljunit/framework/TestResult;->addError(Ljunit/framework/Test;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_0
    move-exception p1

    .line 146
    throw p1

    :catch_1
    move-exception p2

    .line 144
    invoke-virtual {p0, p1, p2}, Ljunit/framework/TestResult;->addFailure(Ljunit/framework/Test;Ljunit/framework/AssertionFailedError;)V

    :goto_0
    return-void
.end method

.method public declared-synchronized shouldStop()Z
    .locals 1

    monitor-enter p0

    .line 156
    :try_start_0
    iget-boolean v0, p0, Ljunit/framework/TestResult;->fStop:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public startTest(Ljunit/framework/Test;)V
    .locals 2

    .line 163
    invoke-interface {p1}, Ljunit/framework/Test;->countTestCases()I

    move-result v0

    .line 164
    monitor-enter p0

    .line 165
    :try_start_0
    iget v1, p0, Ljunit/framework/TestResult;->fRunTests:I

    add-int/2addr v1, v0

    iput v1, p0, Ljunit/framework/TestResult;->fRunTests:I

    .line 166
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 167
    invoke-direct {p0}, Ljunit/framework/TestResult;->cloneListeners()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljunit/framework/TestListener;

    .line 168
    invoke-interface {v1, p1}, Ljunit/framework/TestListener;->startTest(Ljunit/framework/Test;)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 166
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public declared-synchronized stop()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    .line 176
    :try_start_0
    iput-boolean v0, p0, Ljunit/framework/TestResult;->fStop:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized wasSuccessful()Z
    .locals 1

    monitor-enter p0

    .line 183
    :try_start_0
    invoke-virtual {p0}, Ljunit/framework/TestResult;->failureCount()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljunit/framework/TestResult;->errorCount()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
