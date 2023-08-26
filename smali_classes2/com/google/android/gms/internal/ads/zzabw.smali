.class final synthetic Lcom/google/android/gms/internal/ads/zzabw;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzcaf:Lcom/google/android/gms/internal/ads/zzabv;

.field private final zzcag:Lcom/google/android/gms/internal/ads/zzaoj;

.field private final zzcah:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzabv;Lcom/google/android/gms/internal/ads/zzaoj;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzabw;->zzcaf:Lcom/google/android/gms/internal/ads/zzabv;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzabw;->zzcag:Lcom/google/android/gms/internal/ads/zzaoj;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzabw;->zzcah:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabw;->zzcaf:Lcom/google/android/gms/internal/ads/zzabv;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzabw;->zzcag:Lcom/google/android/gms/internal/ads/zzaoj;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzabw;->zzcah:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzabv;->zza(Lcom/google/android/gms/internal/ads/zzaoj;Ljava/lang/String;)V

    return-void
.end method
