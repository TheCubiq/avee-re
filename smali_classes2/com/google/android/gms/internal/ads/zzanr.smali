.class final synthetic Lcom/google/android/gms/internal/ads/zzanr;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzbnu:Lcom/google/android/gms/internal/ads/zzaoj;

.field private final zzcvm:Lcom/google/android/gms/internal/ads/zzanz;

.field private final zzcvn:Lcom/google/android/gms/internal/ads/zzanj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzaoj;Lcom/google/android/gms/internal/ads/zzanj;Lcom/google/android/gms/internal/ads/zzanz;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzanr;->zzbnu:Lcom/google/android/gms/internal/ads/zzaoj;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzanr;->zzcvn:Lcom/google/android/gms/internal/ads/zzanj;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzanr;->zzcvm:Lcom/google/android/gms/internal/ads/zzanz;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzanr;->zzbnu:Lcom/google/android/gms/internal/ads/zzaoj;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzanr;->zzcvn:Lcom/google/android/gms/internal/ads/zzanj;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzanr;->zzcvm:Lcom/google/android/gms/internal/ads/zzanz;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzano;->zza(Lcom/google/android/gms/internal/ads/zzaoj;Lcom/google/android/gms/internal/ads/zzanj;Lcom/google/android/gms/internal/ads/zzanz;)V

    return-void
.end method
