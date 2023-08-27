.class final synthetic Lcom/google/android/gms/internal/ads/zzanu;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzbnu:Lcom/google/android/gms/internal/ads/zzaoj;

.field private final zzcvk:Lcom/google/android/gms/internal/ads/zzanz;

.field private final zzcvp:Ljava/lang/Class;

.field private final zzcvq:Lcom/google/android/gms/internal/ads/zzanj;

.field private final zzcvr:Ljava/util/concurrent/Executor;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzaoj;Lcom/google/android/gms/internal/ads/zzanz;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzanj;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzanu;->zzbnu:Lcom/google/android/gms/internal/ads/zzaoj;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzanu;->zzcvk:Lcom/google/android/gms/internal/ads/zzanz;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzanu;->zzcvp:Ljava/lang/Class;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzanu;->zzcvq:Lcom/google/android/gms/internal/ads/zzanj;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzanu;->zzcvr:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzanu;->zzbnu:Lcom/google/android/gms/internal/ads/zzaoj;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzanu;->zzcvk:Lcom/google/android/gms/internal/ads/zzanz;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzanu;->zzcvp:Ljava/lang/Class;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzanu;->zzcvq:Lcom/google/android/gms/internal/ads/zzanj;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzanu;->zzcvr:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzano;->zza(Lcom/google/android/gms/internal/ads/zzaoj;Lcom/google/android/gms/internal/ads/zzanz;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzanj;Ljava/util/concurrent/Executor;)V

    return-void
.end method
