.class public final Lcom/daaw/ee6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/cl6;


# instance fields
.field public final a:Lcom/daaw/ye6;

.field public final b:Lcom/daaw/df6;

.field public final c:Lcom/google/android/gms/ads/internal/client/zzl;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/concurrent/Executor;

.field public final f:Lcom/google/android/gms/ads/internal/client/zzw;

.field public final g:Lcom/daaw/rk6;


# direct methods
.method public constructor <init>(Lcom/daaw/ye6;Lcom/daaw/df6;Lcom/google/android/gms/ads/internal/client/zzl;Ljava/lang/String;Ljava/util/concurrent/Executor;Lcom/google/android/gms/ads/internal/client/zzw;Lcom/daaw/rk6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ee6;->a:Lcom/daaw/ye6;

    iput-object p2, p0, Lcom/daaw/ee6;->b:Lcom/daaw/df6;

    iput-object p3, p0, Lcom/daaw/ee6;->c:Lcom/google/android/gms/ads/internal/client/zzl;

    iput-object p4, p0, Lcom/daaw/ee6;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/daaw/ee6;->e:Ljava/util/concurrent/Executor;

    iput-object p6, p0, Lcom/daaw/ee6;->f:Lcom/google/android/gms/ads/internal/client/zzw;

    iput-object p7, p0, Lcom/daaw/ee6;->g:Lcom/daaw/rk6;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/daaw/rk6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ee6;->g:Lcom/daaw/rk6;

    return-object v0
.end method

.method public final zzb()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ee6;->e:Ljava/util/concurrent/Executor;

    return-object v0
.end method
