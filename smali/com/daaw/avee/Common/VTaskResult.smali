.class public Lcom/daaw/avee/Common/VTaskResult;
.super Ljava/lang/Object;
.source "VTaskResult.java"

# interfaces
.implements Lcom/daaw/avee/Common/IVAsyncTask;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Result:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/IVAsyncTask<",
        "TResult;>;"
    }
.end annotation


# instance fields
.field private result:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TResult;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/daaw/avee/Common/VTaskResult;->result:Ljava/lang/Object;

    return-void
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

    .line 22
    iget-object v0, p0, Lcom/daaw/avee/Common/VTaskResult;->result:Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/daaw/avee/Common/VAsyncTask$ResultListener;->onResult(Ljava/lang/Object;Z)V

    return-void
.end method

.method public cancel(Z)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getStatus()Landroid/os/AsyncTask$Status;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
