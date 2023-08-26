.class public final Lcom/google/android/gms/internal/ads/zzaec;
.super Lcom/google/android/gms/internal/ads/zzadz;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzaol;Lcom/google/android/gms/internal/ads/zzadx;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/internal/ads/zzaol<",
            "Lcom/google/android/gms/internal/ads/zzaef;",
            ">;",
            "Lcom/google/android/gms/internal/ads/zzadx;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ads/zzadz;-><init>(Lcom/google/android/gms/internal/ads/zzaol;Lcom/google/android/gms/internal/ads/zzadx;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaec;->mContext:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final zznz()V
    .locals 0

    return-void
.end method

.method public final zzoa()Lcom/google/android/gms/internal/ads/zzaen;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaec;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzafm;->zzm(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzafm;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzafn;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzafm;)Lcom/google/android/gms/internal/ads/zzafn;

    move-result-object v0

    return-object v0
.end method
