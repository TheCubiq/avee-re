.class public final synthetic Lcom/google/android/gms/ads/internal/client/zzdy;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/ads/internal/client/zzea;

.field public final synthetic zzb:Lcom/daaw/yd0;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/ads/internal/client/zzea;Lcom/daaw/yd0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/zzdy;->zza:Lcom/google/android/gms/ads/internal/client/zzea;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/client/zzdy;->zzb:Lcom/daaw/yd0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzdy;->zza:Lcom/google/android/gms/ads/internal/client/zzea;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/zzdy;->zzb:Lcom/daaw/yd0;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/client/zzea;->d(Lcom/daaw/yd0;)V

    return-void
.end method
