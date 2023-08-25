.class public final Lcom/daaw/d48;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Landroid/content/Context;Lcom/daaw/j58;Z)Lcom/daaw/lh8;
    .locals 0

    invoke-static {p0}, Lcom/daaw/dh8;->f(Landroid/content/Context;)Lcom/daaw/dh8;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, "ExoPlayerImpl"

    const-string p1, "MediaMetricsService unavailable."

    invoke-static {p0, p1}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p0, Lcom/daaw/lh8;

    sget-object p1, Landroid/media/metrics/LogSessionId;->LOG_SESSION_ID_NONE:Landroid/media/metrics/LogSessionId;

    invoke-direct {p0, p1}, Lcom/daaw/lh8;-><init>(Landroid/media/metrics/LogSessionId;)V

    return-object p0

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p1, p0}, Lcom/daaw/j58;->s(Lcom/daaw/ob8;)V

    :cond_1
    new-instance p1, Lcom/daaw/lh8;

    invoke-virtual {p0}, Lcom/daaw/dh8;->d()Landroid/media/metrics/LogSessionId;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/daaw/lh8;-><init>(Landroid/media/metrics/LogSessionId;)V

    return-object p1
.end method
