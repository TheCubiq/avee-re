.class public final Lcom/google/android/gms/internal/ads/zzagn;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzafr;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# instance fields
.field private zzcko:Lcom/google/android/gms/internal/ads/zzwf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzwf<",
            "Lorg/json/JSONObject;",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation
.end field

.field private zzckt:Lcom/google/android/gms/internal/ads/zzwf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzwf<",
            "Lorg/json/JSONObject;",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzey()Lcom/google/android/gms/internal/ads/zzwg;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzang;->zzsl()Lcom/google/android/gms/internal/ads/zzang;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzwg;->zzb(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;)Lcom/google/android/gms/internal/ads/zzwn;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzwk;->zzbrc:Lcom/google/android/gms/internal/ads/zzwj;

    sget-object v2, Lcom/google/android/gms/internal/ads/zzwk;->zzbrc:Lcom/google/android/gms/internal/ads/zzwj;

    const-string v3, "google.afma.request.getAdDictionary"

    invoke-virtual {v0, v3, v1, v2}, Lcom/google/android/gms/internal/ads/zzwn;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzwi;Lcom/google/android/gms/internal/ads/zzwh;)Lcom/google/android/gms/internal/ads/zzwf;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzagn;->zzckt:Lcom/google/android/gms/internal/ads/zzwf;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzey()Lcom/google/android/gms/internal/ads/zzwg;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzang;->zzsl()Lcom/google/android/gms/internal/ads/zzang;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzwg;->zzb(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;)Lcom/google/android/gms/internal/ads/zzwn;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzwk;->zzbrc:Lcom/google/android/gms/internal/ads/zzwj;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzwk;->zzbrc:Lcom/google/android/gms/internal/ads/zzwj;

    const-string v2, "google.afma.sdkConstants.getSdkConstants"

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzwn;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzwi;Lcom/google/android/gms/internal/ads/zzwh;)Lcom/google/android/gms/internal/ads/zzwf;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzagn;->zzcko:Lcom/google/android/gms/internal/ads/zzwf;

    return-void
.end method


# virtual methods
.method public final zzof()Lcom/google/android/gms/internal/ads/zzwf;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/zzwf<",
            "Lorg/json/JSONObject;",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzagn;->zzckt:Lcom/google/android/gms/internal/ads/zzwf;

    return-object v0
.end method

.method public final zzog()Lcom/google/android/gms/internal/ads/zzwf;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/zzwf<",
            "Lorg/json/JSONObject;",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzagn;->zzcko:Lcom/google/android/gms/internal/ads/zzwf;

    return-object v0
.end method
