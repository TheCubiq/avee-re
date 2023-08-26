.class public interface abstract Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiver;
.super Ljava/lang/Object;
.source "SearchFilesTask.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "IResultReceiver"
.end annotation


# virtual methods
.method public abstract onItemDirFound(Landroid/os/AsyncTask;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;)V
.end method

.method public abstract onItemFileFound(Landroid/os/AsyncTask;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;)V
.end method

.method public abstract onSearchFinished(Landroid/os/AsyncTask;Z)V
.end method

.method public abstract onSearchStarted(Landroid/os/AsyncTask;)V
.end method
