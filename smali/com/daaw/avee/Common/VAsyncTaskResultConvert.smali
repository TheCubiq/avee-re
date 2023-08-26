.class public Lcom/daaw/avee/Common/VAsyncTaskResultConvert;
.super Ljava/lang/Object;
.source "VAsyncTaskResultConvert.java"

# interfaces
.implements Lcom/daaw/avee/Common/IVAsyncTask;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<FromResult:",
        "Ljava/lang/Object;",
        "Result:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/IVAsyncTask<",
        "TResult;>;"
    }
.end annotation


# instance fields
.field private converter:Lcom/daaw/avee/Common/Func/Func1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Func/Func1<",
            "TFromResult;TResult;>;"
        }
    .end annotation
.end field

.field private task:Lcom/daaw/avee/Common/VAsyncTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/VAsyncTask<",
            "TFromResult;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/avee/Common/VAsyncTask;Lcom/daaw/avee/Common/Func/Func1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/VAsyncTask<",
            "TFromResult;>;",
            "Lcom/daaw/avee/Common/Func/Func1<",
            "TFromResult;TResult;>;)V"
        }
    .end annotation

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/daaw/avee/Common/VAsyncTaskResultConvert;->task:Lcom/daaw/avee/Common/VAsyncTask;

    .line 19
    iput-object p2, p0, Lcom/daaw/avee/Common/VAsyncTaskResultConvert;->converter:Lcom/daaw/avee/Common/Func/Func1;

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/Common/VAsyncTaskResultConvert;)Lcom/daaw/avee/Common/Func/Func1;
    .locals 0

    .line 11
    iget-object p0, p0, Lcom/daaw/avee/Common/VAsyncTaskResultConvert;->converter:Lcom/daaw/avee/Common/Func/Func1;

    return-object p0
.end method


# virtual methods
.method public Run(Lcom/daaw/avee/Common/VAsyncTask$ResultListener;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/VAsyncTask$ResultListener<",
            "TResult;>;)V"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/daaw/avee/Common/VAsyncTaskResultConvert;->task:Lcom/daaw/avee/Common/VAsyncTask;

    new-instance v1, Lcom/daaw/avee/Common/VAsyncTaskResultConvert$1;

    invoke-direct {v1, p0, p1}, Lcom/daaw/avee/Common/VAsyncTaskResultConvert$1;-><init>(Lcom/daaw/avee/Common/VAsyncTaskResultConvert;Lcom/daaw/avee/Common/VAsyncTask$ResultListener;)V

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/VAsyncTask;->Run(Lcom/daaw/avee/Common/VAsyncTask$ResultListener;)V

    return-void
.end method

.method public cancel(Z)Z
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/daaw/avee/Common/VAsyncTaskResultConvert;->task:Lcom/daaw/avee/Common/VAsyncTask;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/Common/VAsyncTask;->cancel(Z)Z

    move-result p1

    return p1
.end method

.method public getStatus()Landroid/os/AsyncTask$Status;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/daaw/avee/Common/VAsyncTaskResultConvert;->task:Lcom/daaw/avee/Common/VAsyncTask;

    invoke-virtual {v0}, Lcom/daaw/avee/Common/VAsyncTask;->getStatus()Landroid/os/AsyncTask$Status;

    move-result-object v0

    return-object v0
.end method
