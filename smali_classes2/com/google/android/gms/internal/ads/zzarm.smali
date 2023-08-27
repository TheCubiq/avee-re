.class final synthetic Lcom/google/android/gms/internal/ads/zzarm;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzbjl:Ljava/util/Map;

.field private final zzdel:Lcom/google/android/gms/internal/ads/zzarl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzarl;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzarm;->zzdel:Lcom/google/android/gms/internal/ads/zzarl;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzarm;->zzbjl:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzarm;->zzdel:Lcom/google/android/gms/internal/ads/zzarl;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzarm;->zzbjl:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzarl;->zzo(Ljava/util/Map;)V

    return-void
.end method
