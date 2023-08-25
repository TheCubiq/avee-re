.class public final Lcom/daaw/dc4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ud6;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/google/android/gms/ads/internal/client/zzq;

.field public final c:Ljava/lang/String;

.field public final d:Lcom/daaw/bb4;

.field public final e:Lcom/daaw/dc4;

.field public final f:Lcom/daaw/m08;

.field public final g:Lcom/daaw/m08;

.field public final h:Lcom/daaw/m08;

.field public final i:Lcom/daaw/m08;

.field public final j:Lcom/daaw/m08;

.field public final k:Lcom/daaw/m08;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/bb4;Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/zzq;Lcom/daaw/cc4;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/daaw/dc4;->e:Lcom/daaw/dc4;

    iput-object p1, p0, Lcom/daaw/dc4;->d:Lcom/daaw/bb4;

    iput-object p2, p0, Lcom/daaw/dc4;->a:Landroid/content/Context;

    iput-object p4, p0, Lcom/daaw/dc4;->b:Lcom/google/android/gms/ads/internal/client/zzq;

    iput-object p3, p0, Lcom/daaw/dc4;->c:Ljava/lang/String;

    invoke-static {p2}, Lcom/daaw/xz7;->a(Ljava/lang/Object;)Lcom/daaw/wz7;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/dc4;->f:Lcom/daaw/m08;

    invoke-static {p4}, Lcom/daaw/xz7;->a(Ljava/lang/Object;)Lcom/daaw/wz7;

    move-result-object v3

    iput-object v3, p0, Lcom/daaw/dc4;->g:Lcom/daaw/m08;

    invoke-static {p1}, Lcom/daaw/bb4;->y0(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object p2

    new-instance p3, Lcom/daaw/bz5;

    invoke-direct {p3, p2}, Lcom/daaw/bz5;-><init>(Lcom/daaw/m08;)V

    invoke-static {p3}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object v5

    iput-object v5, p0, Lcom/daaw/dc4;->h:Lcom/daaw/m08;

    invoke-static {}, Lcom/daaw/gz5;->a()Lcom/daaw/gz5;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object v6

    iput-object v6, p0, Lcom/daaw/dc4;->i:Lcom/daaw/m08;

    invoke-static {}, Lcom/daaw/yv4;->a()Lcom/daaw/yv4;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object v8

    iput-object v8, p0, Lcom/daaw/dc4;->j:Lcom/daaw/m08;

    invoke-static {p1}, Lcom/daaw/bb4;->N(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object v2

    invoke-static {p1}, Lcom/daaw/bb4;->J(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object v4

    invoke-static {}, Lcom/daaw/ti6;->a()Lcom/daaw/ti6;

    move-result-object v7

    new-instance p1, Lcom/daaw/sd6;

    move-object v0, p1

    invoke-direct/range {v0 .. v8}, Lcom/daaw/sd6;-><init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V

    invoke-static {p1}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/dc4;->k:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/daaw/dy5;
    .locals 8

    new-instance v7, Lcom/daaw/dy5;

    iget-object v1, p0, Lcom/daaw/dc4;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/daaw/dc4;->b:Lcom/google/android/gms/ads/internal/client/zzq;

    iget-object v3, p0, Lcom/daaw/dc4;->c:Ljava/lang/String;

    iget-object v0, p0, Lcom/daaw/dc4;->k:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/daaw/rd6;

    iget-object v0, p0, Lcom/daaw/dc4;->h:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/daaw/az5;

    iget-object v0, p0, Lcom/daaw/dc4;->d:Lcom/daaw/bb4;

    invoke-static {v0}, Lcom/daaw/bb4;->E(Lcom/daaw/bb4;)Lcom/daaw/e94;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/e94;->d()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v6

    invoke-static {v6}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/daaw/dy5;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzq;Ljava/lang/String;Lcom/daaw/rd6;Lcom/daaw/az5;Lcom/google/android/gms/internal/ads/zzchu;)V

    return-object v7
.end method
