.class interface abstract Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask$IResultReceiverInternal;
.super Ljava/lang/Object;
.source "SearchFilesTask.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/GlobalSearch/SearchFilesTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x60a
    name = "IResultReceiverInternal"
.end annotation


# virtual methods
.method public abstract isCancelled()Z
.end method

.method public abstract onItemDirFound(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;)V
.end method

.method public abstract onItemFileFound(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;)V
.end method
