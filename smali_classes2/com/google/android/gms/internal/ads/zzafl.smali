.class public final Lcom/google/android/gms/internal/ads/zzafl;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# instance fields
.field public zzaqe:Landroid/location/Location;

.field public zzccx:Ljava/lang/String;

.field public zzcdc:Landroid/os/Bundle;

.field public zzcdj:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public zzcgn:Landroid/os/Bundle;

.field public zzcgo:Lcom/google/android/gms/internal/ads/zzagk;

.field public zzcgp:Ljava/lang/String;

.field public zzcgq:Ljava/lang/String;

.field public zzcgr:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

.field public zzcgs:Lcom/google/android/gms/internal/ads/zzaef;

.field public zzcgt:Lcom/google/android/gms/internal/ads/zzaga;

.field public zzcgu:Lorg/json/JSONObject;

.field public zzcgv:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzafl;->zzcgu:Lorg/json/JSONObject;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzafl;->zzcdj:Ljava/util/List;

    return-void
.end method
