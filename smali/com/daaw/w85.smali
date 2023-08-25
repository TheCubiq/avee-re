.class public final Lcom/daaw/w85;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;

.field public final d:Lcom/daaw/m08;

.field public final e:Lcom/daaw/m08;

.field public final f:Lcom/daaw/m08;

.field public final g:Lcom/daaw/m08;

.field public final h:Lcom/daaw/m08;

.field public final i:Lcom/daaw/m08;

.field public final j:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/w85;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/w85;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/w85;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/w85;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/w85;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/w85;->f:Lcom/daaw/m08;

    iput-object p7, p0, Lcom/daaw/w85;->g:Lcom/daaw/m08;

    iput-object p8, p0, Lcom/daaw/w85;->h:Lcom/daaw/m08;

    iput-object p9, p0, Lcom/daaw/w85;->i:Lcom/daaw/m08;

    iput-object p10, p0, Lcom/daaw/w85;->j:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final synthetic zzb()Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lcom/daaw/w85;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/h94;

    invoke-virtual {v0}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v2

    iget-object v0, p0, Lcom/daaw/w85;->b:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/concurrent/Executor;

    iget-object v0, p0, Lcom/daaw/w85;->c:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/daaw/sl2;

    iget-object v0, p0, Lcom/daaw/w85;->d:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/u94;

    invoke-virtual {v0}, Lcom/daaw/u94;->a()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/ads/internal/zza;->zza()Lcom/google/android/gms/ads/internal/zza;

    move-result-object v6

    new-instance v7, Lcom/daaw/p74;

    invoke-direct {v7}, Lcom/daaw/p74;-><init>()V

    iget-object v0, p0, Lcom/daaw/w85;->g:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/daaw/cq5;

    iget-object v0, p0, Lcom/daaw/w85;->h:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/daaw/op6;

    iget-object v0, p0, Lcom/daaw/w85;->i:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/daaw/kd5;

    iget-object v0, p0, Lcom/daaw/w85;->j:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/daaw/on6;

    new-instance v0, Lcom/daaw/r85;

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Lcom/daaw/r85;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/daaw/sl2;Lcom/google/android/gms/internal/ads/zzchu;Lcom/google/android/gms/ads/internal/zza;Lcom/daaw/p74;Lcom/daaw/cq5;Lcom/daaw/op6;Lcom/daaw/kd5;Lcom/daaw/on6;)V

    return-object v0
.end method
