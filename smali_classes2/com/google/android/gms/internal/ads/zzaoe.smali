.class public final Lcom/google/android/gms/internal/ads/zzaoe;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# static fields
.field public static final zzcvy:Ljava/util/concurrent/Executor;

.field public static final zzcvz:Ljava/util/concurrent/Executor;

.field private static final zzcwa:Lcom/google/android/gms/internal/ads/zzaod;

.field private static final zzcwb:Lcom/google/android/gms/internal/ads/zzaod;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzaof;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaof;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaoe;->zzcvy:Ljava/util/concurrent/Executor;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzaog;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaog;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaoe;->zzcvz:Ljava/util/concurrent/Executor;

    sget-object v0, Lcom/google/android/gms/internal/ads/zzaoe;->zzcvy:Ljava/util/concurrent/Executor;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaoe;->zza(Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzaod;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaoe;->zzcwa:Lcom/google/android/gms/internal/ads/zzaod;

    sget-object v0, Lcom/google/android/gms/internal/ads/zzaoe;->zzcvz:Ljava/util/concurrent/Executor;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaoe;->zza(Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzaod;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaoe;->zzcwb:Lcom/google/android/gms/internal/ads/zzaod;

    return-void
.end method

.method public static zza(Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzaod;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzaoh;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzaoh;-><init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/zzaof;)V

    return-object v0
.end method
