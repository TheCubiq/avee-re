.class public interface abstract Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiver;
.super Ljava/lang/Object;
.source "ScanPlaylistFilesTask.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "IResultReceiver"
.end annotation


# virtual methods
.method public abstract onFinished(Landroid/os/AsyncTask;ZLjava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/AsyncTask;",
            "Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onItem(Landroid/os/AsyncTask;Ljava/lang/String;)V
.end method

.method public abstract onStarted(Landroid/os/AsyncTask;)V
.end method

.method public abstract onStatusUpdate(Landroid/os/AsyncTask;Ljava/lang/String;)V
.end method
