.class interface abstract Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiverInternal;
.super Ljava/lang/Object;
.source "ScanPlaylistFilesTask.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x60a
    name = "IResultReceiverInternal"
.end annotation


# virtual methods
.method public abstract isCancelled()Z
.end method

.method public abstract onDir(Ljava/io/File;)V
.end method

.method public abstract onItemDirFound(Ljava/io/File;)V
.end method

.method public abstract onItemFileFound(Ljava/io/File;)V
.end method
