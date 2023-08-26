.class public interface abstract Lcom/google/android/exoplayer2/offline/DownloadManager$Listener;
.super Ljava/lang/Object;
.source "DownloadManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/offline/DownloadManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Listener"
.end annotation


# virtual methods
.method public abstract onIdle(Lcom/google/android/exoplayer2/offline/DownloadManager;)V
.end method

.method public abstract onInitialized(Lcom/google/android/exoplayer2/offline/DownloadManager;)V
.end method

.method public abstract onTaskStateChanged(Lcom/google/android/exoplayer2/offline/DownloadManager;Lcom/google/android/exoplayer2/offline/DownloadManager$TaskState;)V
.end method
