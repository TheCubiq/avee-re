.class final Lcom/google/android/gms/internal/ads/zzabi;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzbzk:Lcom/google/android/gms/internal/ads/zzabh;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzabh;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzabi;->zzbzk:Lcom/google/android/gms/internal/ads/zzabh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabi;->zzbzk:Lcom/google/android/gms/internal/ads/zzabh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzajx;->onStop()V

    return-void
.end method
