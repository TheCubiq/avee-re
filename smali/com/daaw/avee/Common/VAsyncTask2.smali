.class public Lcom/daaw/avee/Common/VAsyncTask2;
.super Ljava/lang/Object;
.source "VAsyncTask2.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/Common/VAsyncTask2$TaskListener;,
        Lcom/daaw/avee/Common/VAsyncTask2$ResultListener;,
        Lcom/daaw/avee/Common/VAsyncTask2$ThreadPerTaskExecutor;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Result:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field private volatile doneResult:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TResult;"
        }
    .end annotation
.end field

.field private listener:Lcom/daaw/avee/Common/VAsyncTask2$ResultListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/VAsyncTask2$ResultListener<",
            "TResult;>;"
        }
    .end annotation
.end field

.field private volatile resultReceived:Z

.field private taskListener:Lcom/daaw/avee/Common/VAsyncTask2$TaskListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/VAsyncTask2$TaskListener<",
            "TResult;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/avee/Common/VAsyncTask2$TaskListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/VAsyncTask2$TaskListener<",
            "TResult;>;)V"
        }
    .end annotation

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 35
    iput-object v0, p0, Lcom/daaw/avee/Common/VAsyncTask2;->doneResult:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 36
    iput-boolean v0, p0, Lcom/daaw/avee/Common/VAsyncTask2;->resultReceived:Z

    .line 44
    iput-object p1, p0, Lcom/daaw/avee/Common/VAsyncTask2;->taskListener:Lcom/daaw/avee/Common/VAsyncTask2$TaskListener;

    return-void
.end method


# virtual methods
.method public Run(Lcom/daaw/avee/Common/VAsyncTask2$ResultListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/VAsyncTask2$ResultListener<",
            "TResult;>;)V"
        }
    .end annotation

    .line 49
    iput-object p1, p0, Lcom/daaw/avee/Common/VAsyncTask2;->listener:Lcom/daaw/avee/Common/VAsyncTask2$ResultListener;

    return-void
.end method

.method public RunParallel(Lcom/daaw/avee/Common/VAsyncTask2$ResultListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/VAsyncTask2$ResultListener<",
            "TResult;>;)V"
        }
    .end annotation

    .line 61
    sget-object v0, Lcom/daaw/avee/Common/VAsyncTask;->THREAD_POOL_EXECUTOR_2:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 63
    iput-object p1, p0, Lcom/daaw/avee/Common/VAsyncTask2;->listener:Lcom/daaw/avee/Common/VAsyncTask2$ResultListener;

    return-void
.end method

.method public getResult()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TResult;"
        }
    .end annotation

    .line 84
    iget-object v0, p0, Lcom/daaw/avee/Common/VAsyncTask2;->doneResult:Ljava/lang/Object;

    return-object v0
.end method

.method public isDone()Z
    .locals 1

    .line 79
    iget-boolean v0, p0, Lcom/daaw/avee/Common/VAsyncTask2;->resultReceived:Z

    return v0
.end method

.method public run()V
    .locals 2

    .line 71
    iget-object v0, p0, Lcom/daaw/avee/Common/VAsyncTask2;->taskListener:Lcom/daaw/avee/Common/VAsyncTask2$TaskListener;

    invoke-interface {v0}, Lcom/daaw/avee/Common/VAsyncTask2$TaskListener;->onExecuteInBg()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/Common/VAsyncTask2;->doneResult:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 72
    iput-boolean v0, p0, Lcom/daaw/avee/Common/VAsyncTask2;->resultReceived:Z

    .line 73
    iget-object v0, p0, Lcom/daaw/avee/Common/VAsyncTask2;->listener:Lcom/daaw/avee/Common/VAsyncTask2$ResultListener;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/avee/Common/VAsyncTask2;->doneResult:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lcom/daaw/avee/Common/VAsyncTask2$ResultListener;->onResult(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
