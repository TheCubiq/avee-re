.class final Lcom/google/android/gms/internal/ads/zzade;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzccd:Lcom/google/android/gms/internal/ads/zzanf;

.field private final synthetic zzcce:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzadb;Lcom/google/android/gms/internal/ads/zzanf;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzade;->zzccd:Lcom/google/android/gms/internal/ads/zzanf;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzade;->zzcce:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzade;->zzccd:Lcom/google/android/gms/internal/ads/zzanf;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzade;->zzcce:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzanf;->zzcz(Ljava/lang/String;)V

    return-void
.end method
