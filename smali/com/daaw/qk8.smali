.class public final Lcom/daaw/qk8;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Landroid/media/AudioTrack;Lcom/daaw/lh8;)V
    .locals 1

    invoke-virtual {p1}, Lcom/daaw/lh8;->a()Landroid/media/metrics/LogSessionId;

    move-result-object p1

    sget-object v0, Landroid/media/metrics/LogSessionId;->LOG_SESSION_ID_NONE:Landroid/media/metrics/LogSessionId;

    invoke-virtual {p1, v0}, Landroid/media/metrics/LogSessionId;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Landroid/media/AudioTrack;->setLogSessionId(Landroid/media/metrics/LogSessionId;)V

    :cond_0
    return-void
.end method
