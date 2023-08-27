.class final synthetic Lcom/google/android/gms/internal/ads/zzux;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzbpr:Lcom/google/android/gms/internal/ads/zzuw;

.field private final zzzo:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzuw;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzux;->zzbpr:Lcom/google/android/gms/internal/ads/zzuw;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzux;->zzzo:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzux;->zzbpr:Lcom/google/android/gms/internal/ads/zzuw;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzux;->zzzo:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzuw;->zzbi(Ljava/lang/String;)V

    return-void
.end method
