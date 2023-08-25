.class public final synthetic Lcom/google/android/gms/ads/internal/zzd;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final synthetic zza:Lcom/daaw/vo6;

.field public final synthetic zzb:Lcom/daaw/io6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/vo6;Lcom/daaw/io6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzd;->zza:Lcom/daaw/vo6;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/zzd;->zzb:Lcom/daaw/io6;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzd;->zza:Lcom/daaw/vo6;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzd;->zzb:Lcom/daaw/io6;

    check-cast p1, Lorg/json/JSONObject;

    const-string v2, "isSuccessful"

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v3, "appSettingsJson"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v3

    invoke-virtual {v3}, Lcom/daaw/qz3;->h()Lcom/google/android/gms/ads/internal/util/zzg;

    move-result-object v3

    invoke-interface {v3, p1}, Lcom/google/android/gms/ads/internal/util/zzg;->zzu(Ljava/lang/String;)V

    :cond_0
    invoke-interface {v1, v2}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-interface {v1}, Lcom/daaw/io6;->zzl()Lcom/daaw/mo6;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/vo6;->b(Lcom/daaw/mo6;)V

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
