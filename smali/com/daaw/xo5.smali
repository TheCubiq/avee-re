.class public final Lcom/daaw/xo5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/fs4;
.implements Lcom/daaw/oq4;


# static fields
.field public static final r:Ljava/lang/Object;

.field public static s:I


# instance fields
.field public final p:Lcom/google/android/gms/ads/internal/util/zzg;

.field public final q:Lcom/daaw/hp5;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/xo5;->r:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/hp5;Lcom/google/android/gms/ads/internal/util/zzg;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/xo5;->q:Lcom/daaw/hp5;

    iput-object p2, p0, Lcom/daaw/xo5;->p:Lcom/google/android/gms/ads/internal/util/zzg;

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 4

    sget-object v0, Lcom/daaw/g93;->E5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/xo5;->p:Lcom/google/android/gms/ads/internal/util/zzg;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/util/zzg;->zzP()Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/daaw/xo5;->r:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget v1, Lcom/daaw/xo5;->s:I

    sget-object v2, Lcom/daaw/g93;->F5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-lt v1, v2, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, Lcom/daaw/xo5;->q:Lcom/daaw/hp5;

    invoke-virtual {v1, p1}, Lcom/daaw/hp5;->e(Z)V

    monitor-enter v0

    :try_start_1
    sget p1, Lcom/daaw/xo5;->s:I

    add-int/lit8 p1, p1, 0x1

    sput p1, Lcom/daaw/xo5;->s:I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    :cond_2
    return-void
.end method

.method public final b(Lcom/google/android/gms/ads/internal/client/zze;)V
    .locals 0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/daaw/xo5;->a(Z)V

    return-void
.end method

.method public final zzn()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/daaw/xo5;->a(Z)V

    return-void
.end method
