.class public final Lcom/daaw/bs5;
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


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/bs5;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/bs5;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/bs5;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/bs5;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/bs5;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/bs5;->f:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/as5;
    .locals 8

    iget-object v0, p0, Lcom/daaw/bs5;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/daaw/zj4;

    iget-object v0, p0, Lcom/daaw/bs5;->b:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/content/Context;

    iget-object v0, p0, Lcom/daaw/bs5;->c:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/concurrent/Executor;

    iget-object v0, p0, Lcom/daaw/bs5;->d:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/daaw/ia5;

    iget-object v0, p0, Lcom/daaw/bs5;->e:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/cq4;

    invoke-virtual {v0}, Lcom/daaw/cq4;->a()Lcom/daaw/ri6;

    move-result-object v6

    iget-object v0, p0, Lcom/daaw/bs5;->f:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/daaw/ey6;

    new-instance v0, Lcom/daaw/as5;

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/daaw/as5;-><init>(Lcom/daaw/zj4;Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/daaw/ia5;Lcom/daaw/ri6;Lcom/daaw/ey6;)V

    return-object v0
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/bs5;->a()Lcom/daaw/as5;

    move-result-object v0

    return-object v0
.end method
