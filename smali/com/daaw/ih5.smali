.class public final Lcom/daaw/ih5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;

.field public final d:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ih5;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/ih5;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/ih5;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/ih5;->d:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/daaw/ih5;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/h94;

    invoke-virtual {v0}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/ih5;->b:Lcom/daaw/m08;

    invoke-interface {v1}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/lh5;

    new-instance v2, Lcom/daaw/yh5;

    invoke-direct {v2}, Lcom/daaw/yh5;-><init>()V

    sget-object v3, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v3}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lcom/daaw/xh5;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/daaw/xh5;-><init>(Landroid/content/Context;Lcom/daaw/lh5;Lcom/daaw/yh5;Lcom/daaw/g77;)V

    return-object v4
.end method
