.class public final Lcom/daaw/d18;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Lcom/daaw/xp4;

.field public c:Lcom/daaw/iz6;

.field public d:Lcom/daaw/iz6;

.field public e:Lcom/daaw/iz6;

.field public f:Lcom/daaw/iz6;

.field public g:Lcom/daaw/iz6;

.field public h:Lcom/daaw/ey6;

.field public i:Landroid/os/Looper;

.field public j:Lcom/daaw/o98;

.field public k:I

.field public l:Z

.field public m:Lcom/daaw/aa8;

.field public n:J

.field public o:J

.field public p:Z

.field public q:Z

.field public r:Lcom/daaw/zo7;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/g64;[B)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    new-instance v2, Lcom/daaw/gz7;

    const/4 v3, 0x0

    move-object/from16 v4, p2

    invoke-direct {v2, v4, v3}, Lcom/daaw/gz7;-><init>(Lcom/daaw/g64;[B)V

    new-instance v3, Lcom/daaw/j08;

    invoke-direct {v3, v1}, Lcom/daaw/j08;-><init>(Landroid/content/Context;)V

    new-instance v4, Lcom/daaw/r08;

    invoke-direct {v4, v1}, Lcom/daaw/r08;-><init>(Landroid/content/Context;)V

    sget-object v5, Lcom/daaw/u08;->p:Lcom/daaw/u08;

    new-instance v6, Lcom/daaw/x08;

    invoke-direct {v6, v1}, Lcom/daaw/x08;-><init>(Landroid/content/Context;)V

    sget-object v7, Lcom/daaw/a18;->a:Lcom/daaw/a18;

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    invoke-static/range {p1 .. p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v1, v0, Lcom/daaw/d18;->a:Landroid/content/Context;

    iput-object v2, v0, Lcom/daaw/d18;->c:Lcom/daaw/iz6;

    iput-object v3, v0, Lcom/daaw/d18;->d:Lcom/daaw/iz6;

    iput-object v4, v0, Lcom/daaw/d18;->e:Lcom/daaw/iz6;

    iput-object v5, v0, Lcom/daaw/d18;->f:Lcom/daaw/iz6;

    iput-object v6, v0, Lcom/daaw/d18;->g:Lcom/daaw/iz6;

    iput-object v7, v0, Lcom/daaw/d18;->h:Lcom/daaw/ey6;

    invoke-static {}, Lcom/daaw/it5;->e()Landroid/os/Looper;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/d18;->i:Landroid/os/Looper;

    sget-object v1, Lcom/daaw/o98;->c:Lcom/daaw/o98;

    iput-object v1, v0, Lcom/daaw/d18;->j:Lcom/daaw/o98;

    const/4 v1, 0x1

    iput v1, v0, Lcom/daaw/d18;->k:I

    iput-boolean v1, v0, Lcom/daaw/d18;->l:Z

    sget-object v2, Lcom/daaw/aa8;->g:Lcom/daaw/aa8;

    iput-object v2, v0, Lcom/daaw/d18;->m:Lcom/daaw/aa8;

    new-instance v2, Lcom/daaw/zo7;

    const v4, 0x3f7851ec    # 0.97f

    const v5, 0x3f83d70a    # 1.03f

    const-wide/16 v6, 0x3e8

    const v8, 0x33d6bf95    # 1.0E-7f

    const-wide/16 v9, 0x14

    invoke-static {v9, v10}, Lcom/daaw/it5;->f0(J)J

    move-result-wide v9

    const-wide/16 v14, 0x1f4

    invoke-static {v14, v15}, Lcom/daaw/it5;->f0(J)J

    move-result-wide v11

    const v13, 0x3f7fbe77    # 0.999f

    const/16 v16, 0x0

    move-object v3, v2

    move-object/from16 v14, v16

    invoke-direct/range {v3 .. v14}, Lcom/daaw/zo7;-><init>(FFJFJJFLcom/daaw/wn7;)V

    iput-object v2, v0, Lcom/daaw/d18;->r:Lcom/daaw/zo7;

    sget-object v2, Lcom/daaw/xp4;->a:Lcom/daaw/xp4;

    iput-object v2, v0, Lcom/daaw/d18;->b:Lcom/daaw/xp4;

    const-wide/16 v2, 0x1f4

    iput-wide v2, v0, Lcom/daaw/d18;->n:J

    const-wide/16 v2, 0x7d0

    iput-wide v2, v0, Lcom/daaw/d18;->o:J

    iput-boolean v1, v0, Lcom/daaw/d18;->p:Z

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;)Lcom/daaw/or8;
    .locals 2

    new-instance v0, Lcom/daaw/wq8;

    new-instance v1, Lcom/daaw/e09;

    invoke-direct {v1}, Lcom/daaw/e09;-><init>()V

    invoke-direct {v0, p0, v1}, Lcom/daaw/wq8;-><init>(Landroid/content/Context;Lcom/daaw/q09;)V

    return-object v0
.end method
