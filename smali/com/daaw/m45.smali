.class public final Lcom/daaw/m45;
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


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/m45;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/m45;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/m45;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/m45;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/m45;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/m45;->f:Lcom/daaw/m08;

    iput-object p7, p0, Lcom/daaw/m45;->g:Lcom/daaw/m08;

    iput-object p8, p0, Lcom/daaw/m45;->h:Lcom/daaw/m08;

    iput-object p9, p0, Lcom/daaw/m45;->i:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/l45;
    .locals 11

    iget-object v0, p0, Lcom/daaw/m45;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/f94;

    invoke-virtual {v0}, Lcom/daaw/f94;->a()Lcom/google/android/gms/ads/internal/util/zzg;

    move-result-object v2

    iget-object v0, p0, Lcom/daaw/m45;->b:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/cq4;

    invoke-virtual {v0}, Lcom/daaw/cq4;->a()Lcom/daaw/ri6;

    move-result-object v3

    iget-object v0, p0, Lcom/daaw/m45;->c:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/daaw/o35;

    iget-object v0, p0, Lcom/daaw/m45;->d:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/c45;

    invoke-virtual {v0}, Lcom/daaw/c45;->a()Lcom/daaw/j35;

    move-result-object v5

    iget-object v0, p0, Lcom/daaw/m45;->e:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/daaw/x45;

    iget-object v0, p0, Lcom/daaw/m45;->f:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/daaw/i55;

    iget-object v0, p0, Lcom/daaw/m45;->g:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/concurrent/Executor;

    sget-object v9, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v9}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/m45;->i:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/daaw/g35;

    new-instance v0, Lcom/daaw/l45;

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, Lcom/daaw/l45;-><init>(Lcom/google/android/gms/ads/internal/util/zzg;Lcom/daaw/ri6;Lcom/daaw/o35;Lcom/daaw/j35;Lcom/daaw/x45;Lcom/daaw/i55;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lcom/daaw/g35;)V

    return-object v0
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/m45;->a()Lcom/daaw/l45;

    move-result-object v0

    return-object v0
.end method
