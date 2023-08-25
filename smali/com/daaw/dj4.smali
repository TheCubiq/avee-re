.class public final Lcom/daaw/dj4;
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

    iput-object p1, p0, Lcom/daaw/dj4;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/dj4;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/dj4;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/dj4;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/dj4;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/dj4;->f:Lcom/daaw/m08;

    iput-object p7, p0, Lcom/daaw/dj4;->g:Lcom/daaw/m08;

    iput-object p8, p0, Lcom/daaw/dj4;->h:Lcom/daaw/m08;

    iput-object p9, p0, Lcom/daaw/dj4;->i:Lcom/daaw/m08;

    iput-object p10, p0, Lcom/daaw/dj4;->j:Lcom/daaw/m08;

    return-void
.end method

.method public static b(Lcom/daaw/yl4;Landroid/content/Context;Lcom/daaw/uh6;Landroid/view/View;Lcom/daaw/a74;Lcom/daaw/xl4;Lcom/daaw/u35;Lcom/daaw/xy4;Lcom/daaw/qz7;Ljava/util/concurrent/Executor;)Lcom/daaw/cj4;
    .locals 12

    new-instance v11, Lcom/daaw/cj4;

    move-object v0, v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v10}, Lcom/daaw/cj4;-><init>(Lcom/daaw/yl4;Landroid/content/Context;Lcom/daaw/uh6;Landroid/view/View;Lcom/daaw/a74;Lcom/daaw/xl4;Lcom/daaw/u35;Lcom/daaw/xy4;Lcom/daaw/qz7;Ljava/util/concurrent/Executor;)V

    return-object v11
.end method


# virtual methods
.method public final a()Lcom/daaw/cj4;
    .locals 12

    iget-object v0, p0, Lcom/daaw/dj4;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/eo4;

    invoke-virtual {v0}, Lcom/daaw/eo4;->a()Lcom/daaw/yl4;

    move-result-object v2

    iget-object v0, p0, Lcom/daaw/dj4;->b:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/content/Context;

    iget-object v0, p0, Lcom/daaw/dj4;->c:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/jj4;

    invoke-virtual {v0}, Lcom/daaw/jj4;->a()Lcom/daaw/uh6;

    move-result-object v4

    iget-object v0, p0, Lcom/daaw/dj4;->d:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/ij4;

    invoke-virtual {v0}, Lcom/daaw/ij4;->a()Landroid/view/View;

    move-result-object v5

    iget-object v0, p0, Lcom/daaw/dj4;->e:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/xj4;

    invoke-virtual {v0}, Lcom/daaw/xj4;->a()Lcom/daaw/a74;

    move-result-object v6

    iget-object v0, p0, Lcom/daaw/dj4;->f:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/kj4;

    invoke-virtual {v0}, Lcom/daaw/kj4;->a()Lcom/daaw/xl4;

    move-result-object v7

    iget-object v0, p0, Lcom/daaw/dj4;->g:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/o15;

    invoke-virtual {v0}, Lcom/daaw/o15;->a()Lcom/daaw/u35;

    move-result-object v8

    iget-object v0, p0, Lcom/daaw/dj4;->h:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/daaw/xy4;

    iget-object v0, p0, Lcom/daaw/dj4;->i:Lcom/daaw/m08;

    invoke-static {v0}, Lcom/daaw/vz7;->a(Lcom/daaw/m08;)Lcom/daaw/qz7;

    move-result-object v10

    iget-object v0, p0, Lcom/daaw/dj4;->j:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/util/concurrent/Executor;

    new-instance v0, Lcom/daaw/cj4;

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Lcom/daaw/cj4;-><init>(Lcom/daaw/yl4;Landroid/content/Context;Lcom/daaw/uh6;Landroid/view/View;Lcom/daaw/a74;Lcom/daaw/xl4;Lcom/daaw/u35;Lcom/daaw/xy4;Lcom/daaw/qz7;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/dj4;->a()Lcom/daaw/cj4;

    move-result-object v0

    return-object v0
.end method
