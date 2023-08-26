.class public abstract Lcom/google/android/exoplayer2/trackselection/TrackSelector;
.super Ljava/lang/Object;
.source "TrackSelector.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/trackselection/TrackSelector$InvalidationListener;
    }
.end annotation


# instance fields
.field private listener:Lcom/google/android/exoplayer2/trackselection/TrackSelector$InvalidationListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final init(Lcom/google/android/exoplayer2/trackselection/TrackSelector$InvalidationListener;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/google/android/exoplayer2/trackselection/TrackSelector;->listener:Lcom/google/android/exoplayer2/trackselection/TrackSelector$InvalidationListener;

    return-void
.end method

.method protected final invalidate()V
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/google/android/exoplayer2/trackselection/TrackSelector;->listener:Lcom/google/android/exoplayer2/trackselection/TrackSelector$InvalidationListener;

    if-eqz v0, :cond_0

    .line 131
    invoke-interface {v0}, Lcom/google/android/exoplayer2/trackselection/TrackSelector$InvalidationListener;->onTrackSelectionsInvalidated()V

    :cond_0
    return-void
.end method

.method public abstract onSelectionActivated(Ljava/lang/Object;)V
.end method

.method public abstract selectTracks([Lcom/google/android/exoplayer2/RendererCapabilities;Lcom/google/android/exoplayer2/source/TrackGroupArray;)Lcom/google/android/exoplayer2/trackselection/TrackSelectorResult;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/exoplayer2/ExoPlaybackException;
        }
    .end annotation
.end method
