.class public final Lcom/google/android/gms/internal/ads/zzamb;
.super Lcom/google/android/gms/internal/ads/zzr;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/zzr<",
        "Lcom/google/android/gms/internal/ads/zzp;",
        ">;"
    }
.end annotation


# instance fields
.field private final zzctn:Lcom/google/android/gms/internal/ads/zzaoj;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzaoj<",
            "Lcom/google/android/gms/internal/ads/zzp;",
            ">;"
        }
    .end annotation
.end field

.field private final zzcto:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final zzctp:Lcom/google/android/gms/internal/ads/zzamy;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzaoj;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/zzaoj<",
            "Lcom/google/android/gms/internal/ads/zzp;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzamb;-><init>(Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/internal/ads/zzaoj;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/internal/ads/zzaoj;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/internal/ads/zzaoj<",
            "Lcom/google/android/gms/internal/ads/zzp;",
            ">;)V"
        }
    .end annotation

    new-instance p2, Lcom/google/android/gms/internal/ads/zzamc;

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/ads/zzamc;-><init>(Lcom/google/android/gms/internal/ads/zzaoj;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzr;-><init>(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzy;)V

    const/4 p2, 0x0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzamb;->zzcto:Ljava/util/Map;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzamb;->zzctn:Lcom/google/android/gms/internal/ads/zzaoj;

    new-instance p3, Lcom/google/android/gms/internal/ads/zzamy;

    invoke-direct {p3}, Lcom/google/android/gms/internal/ads/zzamy;-><init>()V

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzamb;->zzctp:Lcom/google/android/gms/internal/ads/zzamy;

    const-string v0, "GET"

    invoke-virtual {p3, p1, v0, p2, p2}, Lcom/google/android/gms/internal/ads/zzamy;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[B)V

    return-void
.end method


# virtual methods
.method protected final zza(Lcom/google/android/gms/internal/ads/zzp;)Lcom/google/android/gms/internal/ads/zzx;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/zzp;",
            ")",
            "Lcom/google/android/gms/internal/ads/zzx<",
            "Lcom/google/android/gms/internal/ads/zzp;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzap;->zzb(Lcom/google/android/gms/internal/ads/zzp;)Lcom/google/android/gms/internal/ads/zzc;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzx;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzc;)Lcom/google/android/gms/internal/ads/zzx;

    move-result-object p1

    return-object p1
.end method

.method protected final synthetic zza(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/ads/zzp;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzamb;->zzctp:Lcom/google/android/gms/internal/ads/zzamy;

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzp;->zzab:Ljava/util/Map;

    iget v2, p1, Lcom/google/android/gms/internal/ads/zzp;->statusCode:I

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzamy;->zza(Ljava/util/Map;I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzamb;->zzctp:Lcom/google/android/gms/internal/ads/zzamy;

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzp;->data:[B

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzamy;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzamy;->zzf([B)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzamb;->zzctn:Lcom/google/android/gms/internal/ads/zzaoj;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzaoj;->set(Ljava/lang/Object;)V

    return-void
.end method
