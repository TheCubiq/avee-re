.class final synthetic Lcom/google/android/gms/internal/ads/zzvh;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzuv;


# instance fields
.field private final zzbqc:Lcom/google/android/gms/internal/ads/zzvf;

.field private final zzbqf:Lcom/google/android/gms/internal/ads/zzvw;

.field private final zzbqg:Lcom/google/android/gms/internal/ads/zzuu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzvf;Lcom/google/android/gms/internal/ads/zzvw;Lcom/google/android/gms/internal/ads/zzuu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvh;->zzbqc:Lcom/google/android/gms/internal/ads/zzvf;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzvh;->zzbqf:Lcom/google/android/gms/internal/ads/zzvw;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzvh;->zzbqg:Lcom/google/android/gms/internal/ads/zzuu;

    return-void
.end method


# virtual methods
.method public final zzlx()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvh;->zzbqc:Lcom/google/android/gms/internal/ads/zzvf;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzvh;->zzbqf:Lcom/google/android/gms/internal/ads/zzvw;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzvh;->zzbqg:Lcom/google/android/gms/internal/ads/zzuu;

    sget-object v3, Lcom/google/android/gms/internal/ads/zzakk;->zzcrm:Landroid/os/Handler;

    new-instance v4, Lcom/google/android/gms/internal/ads/zzvi;

    invoke-direct {v4, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzvi;-><init>(Lcom/google/android/gms/internal/ads/zzvf;Lcom/google/android/gms/internal/ads/zzvw;Lcom/google/android/gms/internal/ads/zzuu;)V

    sget v0, Lcom/google/android/gms/internal/ads/zzvq;->zzbqp:I

    int-to-long v0, v0

    invoke-virtual {v3, v4, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
