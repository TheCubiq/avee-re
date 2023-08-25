.class public final Lcom/daaw/x24;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Z

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:Ljava/lang/String;

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:Z

.field public final k:I

.field public final l:Z

.field public final m:Z

.field public final n:Z

.field public final o:Z

.field public final p:J

.field public final q:J


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_0

    :catch_0
    nop

    :cond_0
    :goto_0
    sget-object p1, Lcom/daaw/g93;->G:Lcom/daaw/y83;

    const-string v1, "aggressive_media_codec_release"

    invoke-static {v0, v1, p1}, Lcom/daaw/x24;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/daaw/y83;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/x24;->a:Z

    sget-object p1, Lcom/daaw/g93;->j:Lcom/daaw/y83;

    const-string v1, "byte_buffer_precache_limit"

    invoke-static {v0, v1, p1}, Lcom/daaw/x24;->b(Lorg/json/JSONObject;Ljava/lang/String;Lcom/daaw/y83;)I

    move-result p1

    iput p1, p0, Lcom/daaw/x24;->b:I

    sget-object p1, Lcom/daaw/g93;->u:Lcom/daaw/y83;

    const-string v1, "exo_cache_buffer_size"

    invoke-static {v0, v1, p1}, Lcom/daaw/x24;->b(Lorg/json/JSONObject;Ljava/lang/String;Lcom/daaw/y83;)I

    move-result p1

    iput p1, p0, Lcom/daaw/x24;->c:I

    sget-object p1, Lcom/daaw/g93;->f:Lcom/daaw/y83;

    const-string v1, "exo_connect_timeout_millis"

    invoke-static {v0, v1, p1}, Lcom/daaw/x24;->b(Lorg/json/JSONObject;Ljava/lang/String;Lcom/daaw/y83;)I

    move-result p1

    iput p1, p0, Lcom/daaw/x24;->d:I

    sget-object p1, Lcom/daaw/g93;->e:Lcom/daaw/y83;

    const-string v1, "exo_player_version"

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    :cond_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    :goto_1
    iput-object p1, p0, Lcom/daaw/x24;->e:Ljava/lang/String;

    sget-object p1, Lcom/daaw/g93;->g:Lcom/daaw/y83;

    const-string v1, "exo_read_timeout_millis"

    invoke-static {v0, v1, p1}, Lcom/daaw/x24;->b(Lorg/json/JSONObject;Ljava/lang/String;Lcom/daaw/y83;)I

    move-result p1

    iput p1, p0, Lcom/daaw/x24;->f:I

    sget-object p1, Lcom/daaw/g93;->h:Lcom/daaw/y83;

    const-string v1, "load_check_interval_bytes"

    invoke-static {v0, v1, p1}, Lcom/daaw/x24;->b(Lorg/json/JSONObject;Ljava/lang/String;Lcom/daaw/y83;)I

    move-result p1

    iput p1, p0, Lcom/daaw/x24;->g:I

    sget-object p1, Lcom/daaw/g93;->i:Lcom/daaw/y83;

    const-string v1, "player_precache_limit"

    invoke-static {v0, v1, p1}, Lcom/daaw/x24;->b(Lorg/json/JSONObject;Ljava/lang/String;Lcom/daaw/y83;)I

    move-result p1

    iput p1, p0, Lcom/daaw/x24;->h:I

    sget-object p1, Lcom/daaw/g93;->k:Lcom/daaw/y83;

    const-string v1, "socket_receive_buffer_size"

    invoke-static {v0, v1, p1}, Lcom/daaw/x24;->b(Lorg/json/JSONObject;Ljava/lang/String;Lcom/daaw/y83;)I

    move-result p1

    iput p1, p0, Lcom/daaw/x24;->i:I

    sget-object p1, Lcom/daaw/g93;->L3:Lcom/daaw/y83;

    const-string v1, "use_cache_data_source"

    invoke-static {v0, v1, p1}, Lcom/daaw/x24;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/daaw/y83;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/x24;->j:Z

    sget-object p1, Lcom/daaw/g93;->l:Lcom/daaw/y83;

    const-string v1, "min_retry_count"

    invoke-static {v0, v1, p1}, Lcom/daaw/x24;->b(Lorg/json/JSONObject;Ljava/lang/String;Lcom/daaw/y83;)I

    move-result p1

    iput p1, p0, Lcom/daaw/x24;->k:I

    sget-object p1, Lcom/daaw/g93;->o:Lcom/daaw/y83;

    const-string v1, "treat_load_exception_as_non_fatal"

    invoke-static {v0, v1, p1}, Lcom/daaw/x24;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/daaw/y83;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/x24;->l:Z

    sget-object p1, Lcom/daaw/g93;->G1:Lcom/daaw/y83;

    const-string v1, "using_official_simple_exo_player"

    invoke-static {v0, v1, p1}, Lcom/daaw/x24;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/daaw/y83;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/x24;->m:Z

    sget-object p1, Lcom/daaw/g93;->H1:Lcom/daaw/y83;

    const-string v1, "enable_multiple_video_playback"

    invoke-static {v0, v1, p1}, Lcom/daaw/x24;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/daaw/y83;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/x24;->n:Z

    sget-object p1, Lcom/daaw/g93;->J1:Lcom/daaw/y83;

    const-string v1, "use_range_http_data_source"

    invoke-static {v0, v1, p1}, Lcom/daaw/x24;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/daaw/y83;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/x24;->o:Z

    sget-object p1, Lcom/daaw/g93;->K1:Lcom/daaw/y83;

    const-string v1, "range_http_data_source_high_water_mark"

    invoke-static {v0, v1, p1}, Lcom/daaw/x24;->c(Lorg/json/JSONObject;Ljava/lang/String;Lcom/daaw/y83;)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/daaw/x24;->p:J

    sget-object p1, Lcom/daaw/g93;->L1:Lcom/daaw/y83;

    const-string v1, "range_http_data_source_low_water_mark"

    invoke-static {v0, v1, p1}, Lcom/daaw/x24;->c(Lorg/json/JSONObject;Ljava/lang/String;Lcom/daaw/y83;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/x24;->q:J

    return-void
.end method

.method public static final a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/daaw/y83;)Z
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result p2
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return p2
.end method

.method public static final b(Lorg/json/JSONObject;Ljava/lang/String;Lcom/daaw/y83;)I
    .locals 0

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    :cond_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public static final c(Lorg/json/JSONObject;Ljava/lang/String;Lcom/daaw/y83;)J
    .locals 0

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p0

    :catch_0
    :cond_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    return-wide p0
.end method
