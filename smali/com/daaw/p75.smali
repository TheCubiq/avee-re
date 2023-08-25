.class public final Lcom/daaw/p75;
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

    iput-object p1, p0, Lcom/daaw/p75;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/p75;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/p75;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/p75;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/p75;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/p75;->f:Lcom/daaw/m08;

    iput-object p7, p0, Lcom/daaw/p75;->g:Lcom/daaw/m08;

    iput-object p8, p0, Lcom/daaw/p75;->h:Lcom/daaw/m08;

    iput-object p9, p0, Lcom/daaw/p75;->i:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lcom/daaw/p75;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/cq4;

    invoke-virtual {v0}, Lcom/daaw/cq4;->a()Lcom/daaw/ri6;

    move-result-object v2

    iget-object v0, p0, Lcom/daaw/p75;->b:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/concurrent/Executor;

    iget-object v0, p0, Lcom/daaw/p75;->c:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/daaw/ia5;

    iget-object v0, p0, Lcom/daaw/p75;->d:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/content/Context;

    iget-object v0, p0, Lcom/daaw/p75;->e:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/daaw/kd5;

    iget-object v0, p0, Lcom/daaw/p75;->f:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/daaw/on6;

    iget-object v0, p0, Lcom/daaw/p75;->g:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/daaw/op6;

    iget-object v0, p0, Lcom/daaw/p75;->h:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/daaw/cq5;

    iget-object v0, p0, Lcom/daaw/p75;->i:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/daaw/a95;

    new-instance v0, Lcom/daaw/k75;

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, Lcom/daaw/k75;-><init>(Lcom/daaw/ri6;Ljava/util/concurrent/Executor;Lcom/daaw/ia5;Landroid/content/Context;Lcom/daaw/kd5;Lcom/daaw/on6;Lcom/daaw/op6;Lcom/daaw/cq5;Lcom/daaw/a95;)V

    return-object v0
.end method
