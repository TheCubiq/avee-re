.class public interface abstract Lcom/daaw/avee/Common/IVAsyncTask;
.super Ljava/lang/Object;
.source "IVAsyncTask.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Result:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract Run(Lcom/daaw/avee/Common/VAsyncTask$ResultListener;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/VAsyncTask$ResultListener<",
            "TResult;>;)V"
        }
    .end annotation
.end method

.method public abstract cancel(Z)Z
.end method

.method public abstract getStatus()Landroid/os/AsyncTask$Status;
.end method
