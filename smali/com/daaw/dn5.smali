.class public final Lcom/daaw/dn5;
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

    iput-object p1, p0, Lcom/daaw/dn5;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/dn5;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/dn5;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/dn5;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/dn5;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/dn5;->f:Lcom/daaw/m08;

    iput-object p7, p0, Lcom/daaw/dn5;->g:Lcom/daaw/m08;

    iput-object p8, p0, Lcom/daaw/dn5;->h:Lcom/daaw/m08;

    iput-object p9, p0, Lcom/daaw/dn5;->i:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final synthetic zzb()Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lcom/daaw/dn5;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/h94;

    invoke-virtual {v0}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v2

    iget-object v0, p0, Lcom/daaw/dn5;->b:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/concurrent/Executor;

    sget-object v4, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v4}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Lcom/daaw/yu3;

    invoke-direct {v5}, Lcom/daaw/yu3;-><init>()V

    iget-object v0, p0, Lcom/daaw/dn5;->e:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/p94;

    invoke-virtual {v0}, Lcom/daaw/p94;->a()Lcom/daaw/hf4;

    move-result-object v6

    iget-object v0, p0, Lcom/daaw/dn5;->f:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/zn5;

    invoke-virtual {v0}, Lcom/daaw/zn5;->a()Lcom/daaw/yn5;

    move-result-object v7

    iget-object v0, p0, Lcom/daaw/dn5;->g:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/ArrayDeque;

    new-instance v9, Lcom/daaw/vn5;

    invoke-direct {v9}, Lcom/daaw/vn5;-><init>()V

    iget-object v0, p0, Lcom/daaw/dn5;->i:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/daaw/vo6;

    new-instance v0, Lcom/daaw/cn5;

    const/4 v11, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Lcom/daaw/cn5;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/daaw/g77;Lcom/daaw/yu3;Lcom/daaw/hf4;Lcom/daaw/yn5;Ljava/util/ArrayDeque;Lcom/daaw/vn5;Lcom/daaw/vo6;[B)V

    return-object v0
.end method
