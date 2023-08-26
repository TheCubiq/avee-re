.class public Lcom/daaw/avee/comp/playback/ExoMediaPlayer/VisualizerDataCapturerLimiter;
.super Ljava/lang/Object;
.source "VisualizerDataCapturerLimiter.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static assignInstance(Ljava/lang/Object;ILcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;)V
    .locals 0

    return-void
.end method

.method public static getListener(Ljava/lang/Object;ILcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;)Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;
    .locals 0

    if-eqz p2, :cond_0

    .line 52
    invoke-interface {p2, p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;->isCurrentPlayerEntry(I)Z

    move-result p0

    if-eqz p0, :cond_0

    return-object p2

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
