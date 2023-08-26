.class final Lcom/google/android/gms/internal/ads/zzzr;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzatd;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zzatd<",
        "Lcom/google/android/gms/internal/ads/zzate;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zzbvk:Lcom/google/android/gms/internal/ads/zzxt;

.field private final synthetic zzbvl:Lcom/google/android/gms/internal/ads/zzzh;

.field private final synthetic zzbvm:Lcom/google/android/gms/internal/ads/zzzp;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzzp;Lcom/google/android/gms/internal/ads/zzzh;Lcom/google/android/gms/internal/ads/zzxt;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzzr;->zzbvm:Lcom/google/android/gms/internal/ads/zzzp;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzzr;->zzbvl:Lcom/google/android/gms/internal/ads/zzzh;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzzr;->zzbvk:Lcom/google/android/gms/internal/ads/zzxt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzau(Ljava/lang/String;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzzr;->zzbvl:Lcom/google/android/gms/internal/ads/zzzh;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzzh;->zzbr(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, ""

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzane;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
