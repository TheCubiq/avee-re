.class public final Lcom/google/android/gms/internal/ads/zzwy;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# instance fields
.field public final zzbsl:J

.field public final zzbsm:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/zzwx;",
            ">;"
        }
    .end annotation
.end field

.field public final zzbsn:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final zzbso:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final zzbsp:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final zzbsq:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final zzbsr:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final zzbss:Z

.field public final zzbst:Ljava/lang/String;

.field public final zzbsu:J

.field public final zzbsv:Ljava/lang/String;

.field public final zzbsw:I

.field public final zzbsx:I

.field public final zzbsy:J

.field public final zzbsz:Z

.field public final zzbta:Z

.field public final zzbtb:Z

.field public zzbtc:I

.field public zzbtd:I

.field public zzbte:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzwy;-><init>(Lorg/json/JSONObject;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;JLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;JIILjava/lang/String;IIJZ)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/zzwx;",
            ">;J",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/lang/String;",
            "JII",
            "Ljava/lang/String;",
            "IIJZ)V"
        }
    .end annotation

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsm:Ljava/util/List;

    move-wide v1, p2

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsl:J

    move-object v1, p4

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsn:Ljava/util/List;

    move-object v1, p5

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzwy;->zzbso:Ljava/util/List;

    move-object v1, p6

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsp:Ljava/util/List;

    move-object v1, p7

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsq:Ljava/util/List;

    move-object v1, p8

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsr:Ljava/util/List;

    move v1, p9

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzwy;->zzbss:Z

    move-object v1, p10

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzwy;->zzbst:Ljava/lang/String;

    const-wide/16 v1, -0x1

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsu:J

    const/4 v3, 0x0

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzwy;->zzbtc:I

    const/4 v4, 0x1

    iput v4, v0, Lcom/google/android/gms/internal/ads/zzwy;->zzbtd:I

    const/4 v4, 0x0

    iput-object v4, v0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsv:Ljava/lang/String;

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsw:I

    const/4 v4, -0x1

    iput v4, v0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsx:I

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsy:J

    iput-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsz:Z

    iput-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzwy;->zzbta:Z

    iput-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzwy;->zzbtb:Z

    iput-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzwy;->zzbte:Z

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzakb;->isLoggable(I)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "Mediation Response JSON: "

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzakb;->v(Ljava/lang/String;)V

    :cond_1
    const-string v0, "ad_networks"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, -0x1

    :goto_1
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-ge v4, v6, :cond_6

    new-instance v6, Lcom/google/android/gms/internal/ads/zzwx;

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    invoke-direct {v6, v7}, Lcom/google/android/gms/internal/ads/zzwx;-><init>(Lorg/json/JSONObject;)V

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzwx;->zzmf()Z

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_2

    iput-boolean v8, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbte:Z

    :cond_2
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-gez v5, :cond_5

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzwx;->zzbrt:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    const-string v9, "com.google.ads.mediation.admob.AdMobAdapter"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_2

    :cond_4
    const/4 v8, 0x0

    :goto_2
    if-eqz v8, :cond_5

    move v5, v4

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_6
    iput v5, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbtc:I

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbtd:I

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsm:Ljava/util/List;

    const-string v0, "qdata"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbst:Ljava/lang/String;

    const-string v0, "fs_model_type"

    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsx:I

    const-wide/16 v0, -0x1

    const-string v2, "timeout_ms"

    invoke-virtual {p1, v2, v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v4

    iput-wide v4, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsy:J

    const-string v2, "settings"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const/4 v2, 0x0

    if-eqz p1, :cond_9

    const-string v4, "ad_network_timeout_millis"

    invoke-virtual {p1, v4, v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v4

    iput-wide v4, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsl:J

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzfd()Lcom/google/android/gms/internal/ads/zzxg;

    const-string v4, "click_urls"

    invoke-static {p1, v4}, Lcom/google/android/gms/internal/ads/zzxg;->zza(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    iput-object v4, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsn:Ljava/util/List;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzfd()Lcom/google/android/gms/internal/ads/zzxg;

    const-string v4, "imp_urls"

    invoke-static {p1, v4}, Lcom/google/android/gms/internal/ads/zzxg;->zza(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    iput-object v4, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbso:Ljava/util/List;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzfd()Lcom/google/android/gms/internal/ads/zzxg;

    const-string v4, "downloaded_imp_urls"

    invoke-static {p1, v4}, Lcom/google/android/gms/internal/ads/zzxg;->zza(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    iput-object v4, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsp:Ljava/util/List;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzfd()Lcom/google/android/gms/internal/ads/zzxg;

    const-string v4, "nofill_urls"

    invoke-static {p1, v4}, Lcom/google/android/gms/internal/ads/zzxg;->zza(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    iput-object v4, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsq:Ljava/util/List;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzfd()Lcom/google/android/gms/internal/ads/zzxg;

    const-string v4, "remote_ping_urls"

    invoke-static {p1, v4}, Lcom/google/android/gms/internal/ads/zzxg;->zza(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    iput-object v4, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsr:Ljava/util/List;

    const-string v4, "render_in_browser"

    invoke-virtual {p1, v4, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v4

    iput-boolean v4, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbss:Z

    const-string v4, "refresh"

    invoke-virtual {p1, v4, v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-lez v8, :cond_7

    const-wide/16 v0, 0x3e8

    mul-long v0, v0, v4

    :cond_7
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsu:J

    const-string v0, "rewards"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaig;->zza(Lorg/json/JSONArray;)Lcom/google/android/gms/internal/ads/zzaig;

    move-result-object v0

    if-nez v0, :cond_8

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsv:Ljava/lang/String;

    iput v3, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsw:I

    goto :goto_3

    :cond_8
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaig;->type:Ljava/lang/String;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsv:Ljava/lang/String;

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzaig;->zzcmk:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsw:I

    :goto_3
    const-string v0, "use_displayed_impression"

    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsz:Z

    const-string v0, "allow_pub_rendered_attribution"

    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbta:Z

    const-string v0, "allow_pub_owned_ad_view"

    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbtb:Z

    return-void

    :cond_9
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsl:J

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsn:Ljava/util/List;

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbso:Ljava/util/List;

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsp:Ljava/util/List;

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsq:Ljava/util/List;

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsr:Ljava/util/List;

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsu:J

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsv:Ljava/lang/String;

    iput v3, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsw:I

    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbsz:Z

    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbss:Z

    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbta:Z

    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzwy;->zzbtb:Z

    return-void
.end method
