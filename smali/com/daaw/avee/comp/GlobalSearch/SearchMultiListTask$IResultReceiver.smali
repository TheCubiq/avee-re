.class public interface abstract Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$IResultReceiver;
.super Ljava/lang/Object;
.source "SearchMultiListTask.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "IResultReceiver"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T1:",
        "Ljava/lang/Object;",
        "T2:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract onItemDirFound(Landroid/os/AsyncTask;Lcom/daaw/avee/Common/Tuple2;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/AsyncTask;",
            "Lcom/daaw/avee/Common/Tuple2<",
            "TT1;TT2;>;)V"
        }
    .end annotation
.end method

.method public abstract onItemFileFound(Landroid/os/AsyncTask;Lcom/daaw/avee/Common/Tuple2;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/AsyncTask;",
            "Lcom/daaw/avee/Common/Tuple2<",
            "TT1;TT2;>;)V"
        }
    .end annotation
.end method

.method public abstract onSearchFinished(Landroid/os/AsyncTask;Z)V
.end method

.method public abstract onSearchStarted(Landroid/os/AsyncTask;)V
.end method
