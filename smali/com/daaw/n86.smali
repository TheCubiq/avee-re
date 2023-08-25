.class public final Lcom/daaw/n86;
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


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/n86;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/n86;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/n86;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/n86;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/n86;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/n86;->f:Lcom/daaw/m08;

    iput-object p7, p0, Lcom/daaw/n86;->g:Lcom/daaw/m08;

    return-void
.end method

.method public static a(Lcom/daaw/hz3;Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;IZZ)Lcom/daaw/l86;
    .locals 10

    new-instance v9, Lcom/daaw/l86;

    const/4 v8, 0x0

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move/from16 v7, p6

    invoke-direct/range {v0 .. v8}, Lcom/daaw/l86;-><init>(Lcom/daaw/hz3;Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;IZZ[B)V

    return-object v9
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 10

    new-instance v1, Lcom/daaw/hz3;

    invoke-direct {v1}, Lcom/daaw/hz3;-><init>()V

    iget-object v0, p0, Lcom/daaw/n86;->b:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/h94;

    invoke-virtual {v0}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v2

    iget-object v0, p0, Lcom/daaw/n86;->c:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v4, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v4}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/n86;->e:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/ya6;

    invoke-virtual {v0}, Lcom/daaw/ya6;->a()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lcom/daaw/n86;->f:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/za6;

    invoke-virtual {v0}, Lcom/daaw/za6;->a()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    iget-object v0, p0, Lcom/daaw/n86;->g:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/bb6;

    invoke-virtual {v0}, Lcom/daaw/bb6;->a()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    new-instance v9, Lcom/daaw/l86;

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/daaw/l86;-><init>(Lcom/daaw/hz3;Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;IZZ[B)V

    return-object v9
.end method
