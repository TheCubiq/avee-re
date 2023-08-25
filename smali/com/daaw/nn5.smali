.class public final Lcom/daaw/nn5;
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

    iput-object p1, p0, Lcom/daaw/nn5;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/nn5;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/nn5;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/nn5;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/nn5;->e:Lcom/daaw/m08;

    iput-object p6, p0, Lcom/daaw/nn5;->f:Lcom/daaw/m08;

    iput-object p7, p0, Lcom/daaw/nn5;->g:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final synthetic zzb()Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lcom/daaw/nn5;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/h94;

    invoke-virtual {v0}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v2

    iget-object v0, p0, Lcom/daaw/nn5;->b:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v3

    iget-object v0, p0, Lcom/daaw/nn5;->c:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v4

    new-instance v5, Lcom/daaw/vn5;

    invoke-direct {v5}, Lcom/daaw/vn5;-><init>()V

    iget-object v0, p0, Lcom/daaw/nn5;->e:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/zn5;

    invoke-virtual {v0}, Lcom/daaw/zn5;->a()Lcom/daaw/yn5;

    move-result-object v6

    sget-object v7, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v7}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v8, Lcom/daaw/yu3;

    invoke-direct {v8}, Lcom/daaw/yu3;-><init>()V

    new-instance v0, Lcom/daaw/mn5;

    const/4 v9, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lcom/daaw/mn5;-><init>(Landroid/content/Context;Lcom/daaw/e96;Lcom/daaw/c96;Lcom/daaw/vn5;Lcom/daaw/yn5;Lcom/daaw/g77;Lcom/daaw/yu3;[B)V

    return-object v0
.end method
