.class final synthetic Lcom/google/android/gms/internal/ads/zzph;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzasd;


# instance fields
.field private final zzbjk:Lcom/google/android/gms/internal/ads/zzpg;

.field private final zzbjl:Ljava/util/Map;

.field private final zzbjm:Lcom/google/android/gms/internal/ads/zzacm;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzpg;Ljava/util/Map;Lcom/google/android/gms/internal/ads/zzacm;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzph;->zzbjk:Lcom/google/android/gms/internal/ads/zzpg;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzph;->zzbjl:Ljava/util/Map;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzph;->zzbjm:Lcom/google/android/gms/internal/ads/zzacm;

    return-void
.end method


# virtual methods
.method public final zze(Z)V
    .locals 5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzph;->zzbjk:Lcom/google/android/gms/internal/ads/zzpg;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzph;->zzbjl:Ljava/util/Map;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzph;->zzbjm:Lcom/google/android/gms/internal/ads/zzacm;

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/zzpg;->zzbjj:Lcom/google/android/gms/internal/ads/zzpf;

    const-string v3, "id"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/zzpf;->zza(Lcom/google/android/gms/internal/ads/zzpf;Ljava/lang/String;)Ljava/lang/String;

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v2, "messageType"

    const-string v4, "htmlLoaded"

    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzpg;->zzbjj:Lcom/google/android/gms/internal/ads/zzpf;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzpf;->zzb(Lcom/google/android/gms/internal/ads/zzpf;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "sendMessageToNativeJs"

    invoke-interface {v1, p1, v0}, Lcom/google/android/gms/internal/ads/zzacm;->zza(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Unable to dispatch sendMessageToNativeJs event"

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
