.class public interface abstract Lcom/daaw/avee/comp/GlobalSearch/SearchListTask$IResultReceiver;
.super Ljava/lang/Object;
.source "SearchListTask.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/GlobalSearch/SearchListTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "IResultReceiver"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T1:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract onItemFileFound(Landroid/os/AsyncTask;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/AsyncTask;",
            "TT1;)V"
        }
    .end annotation
.end method

.method public abstract onSearchFinished(Landroid/os/AsyncTask;Z)V
.end method

.method public abstract onSearchStarted(Landroid/os/AsyncTask;)V
.end method
