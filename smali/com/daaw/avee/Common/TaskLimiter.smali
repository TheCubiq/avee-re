.class public Lcom/daaw/avee/Common/TaskLimiter;
.super Ljava/lang/Object;
.source "TaskLimiter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Result:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private currentObject:Lcom/daaw/avee/Common/IVAsyncTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/IVAsyncTask<",
            "TResult;>;"
        }
    .end annotation
.end field

.field private jobId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lcom/daaw/avee/Common/TaskLimiter;->jobId:Ljava/lang/String;

    .line 14
    iput-object v0, p0, Lcom/daaw/avee/Common/TaskLimiter;->currentObject:Lcom/daaw/avee/Common/IVAsyncTask;

    return-void
.end method

.method static synthetic access$002(Lcom/daaw/avee/Common/TaskLimiter;Lcom/daaw/avee/Common/IVAsyncTask;)Lcom/daaw/avee/Common/IVAsyncTask;
    .locals 0

    .line 11
    iput-object p1, p0, Lcom/daaw/avee/Common/TaskLimiter;->currentObject:Lcom/daaw/avee/Common/IVAsyncTask;

    return-object p1
.end method

.method static synthetic access$102(Lcom/daaw/avee/Common/TaskLimiter;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 11
    iput-object p1, p0, Lcom/daaw/avee/Common/TaskLimiter;->jobId:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public CancelOld()V
    .locals 2

    .line 49
    iget-object v0, p0, Lcom/daaw/avee/Common/TaskLimiter;->currentObject:Lcom/daaw/avee/Common/IVAsyncTask;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/daaw/avee/Common/IVAsyncTask;->cancel(Z)Z

    :cond_0
    const/4 v0, 0x0

    .line 50
    iput-object v0, p0, Lcom/daaw/avee/Common/TaskLimiter;->currentObject:Lcom/daaw/avee/Common/IVAsyncTask;

    .line 51
    iput-object v0, p0, Lcom/daaw/avee/Common/TaskLimiter;->jobId:Ljava/lang/String;

    return-void
.end method

.method public RunNew(Ljava/lang/String;Lcom/daaw/avee/Common/IVAsyncTask;Lcom/daaw/avee/Common/VAsyncTask$ResultListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/Common/IVAsyncTask<",
            "TResult;>;",
            "Lcom/daaw/avee/Common/VAsyncTask$ResultListener<",
            "TResult;>;)V"
        }
    .end annotation

    .line 28
    invoke-virtual {p0}, Lcom/daaw/avee/Common/TaskLimiter;->CancelOld()V

    .line 30
    iput-object p2, p0, Lcom/daaw/avee/Common/TaskLimiter;->currentObject:Lcom/daaw/avee/Common/IVAsyncTask;

    .line 31
    iput-object p1, p0, Lcom/daaw/avee/Common/TaskLimiter;->jobId:Ljava/lang/String;

    .line 33
    new-instance p1, Lcom/daaw/avee/Common/TaskLimiter$1;

    invoke-direct {p1, p0, p3}, Lcom/daaw/avee/Common/TaskLimiter$1;-><init>(Lcom/daaw/avee/Common/TaskLimiter;Lcom/daaw/avee/Common/VAsyncTask$ResultListener;)V

    invoke-interface {p2, p1}, Lcom/daaw/avee/Common/IVAsyncTask;->Run(Lcom/daaw/avee/Common/VAsyncTask$ResultListener;)V

    return-void
.end method

.method public isTaskRunning(Ljava/lang/String;)Z
    .locals 2

    .line 56
    iget-object v0, p0, Lcom/daaw/avee/Common/TaskLimiter;->jobId:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/daaw/avee/Common/Utils;->compareNullStrings(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 57
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/Common/TaskLimiter;->currentObject:Lcom/daaw/avee/Common/IVAsyncTask;

    if-nez p1, :cond_1

    return v0

    .line 59
    :cond_1
    invoke-interface {p1}, Lcom/daaw/avee/Common/IVAsyncTask;->getStatus()Landroid/os/AsyncTask$Status;

    move-result-object p1

    sget-object v1, Landroid/os/AsyncTask$Status;->RUNNING:Landroid/os/AsyncTask$Status;

    if-ne p1, v1, :cond_2

    const/4 v0, 0x1

    :cond_2
    return v0
.end method
