.class public final Lcom/google/android/gms/internal/ads/zzxe;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# instance fields
.field public final zzbtv:I

.field public final zzbtw:Lcom/google/android/gms/internal/ads/zzwx;

.field public final zzbtx:Lcom/google/android/gms/internal/ads/zzxq;

.field public final zzbty:Ljava/lang/String;

.field public final zzbtz:Lcom/google/android/gms/internal/ads/zzxa;

.field public final zzbua:Lcom/google/android/gms/internal/ads/zzxw;

.field public final zzbub:J


# direct methods
.method public constructor <init>(I)V
    .locals 9

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    move-object v0, p0

    move v5, p1

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/ads/zzxe;-><init>(Lcom/google/android/gms/internal/ads/zzwx;Lcom/google/android/gms/internal/ads/zzxq;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzxa;ILcom/google/android/gms/internal/ads/zzxw;J)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzwx;Lcom/google/android/gms/internal/ads/zzxq;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzxa;ILcom/google/android/gms/internal/ads/zzxw;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzxe;->zzbtw:Lcom/google/android/gms/internal/ads/zzwx;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzxe;->zzbtx:Lcom/google/android/gms/internal/ads/zzxq;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzxe;->zzbty:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzxe;->zzbtz:Lcom/google/android/gms/internal/ads/zzxa;

    iput p5, p0, Lcom/google/android/gms/internal/ads/zzxe;->zzbtv:I

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzxe;->zzbua:Lcom/google/android/gms/internal/ads/zzxw;

    iput-wide p7, p0, Lcom/google/android/gms/internal/ads/zzxe;->zzbub:J

    return-void
.end method
