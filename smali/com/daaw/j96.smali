.class public final Lcom/daaw/j96;
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

    iput-object p1, p0, Lcom/daaw/j96;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/j96;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/j96;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/j96;->d:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/daaw/j96;->b:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/h94;

    invoke-virtual {v0}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/j96;->c:Lcom/daaw/m08;

    check-cast v1, Lcom/daaw/xa6;

    invoke-virtual {v1}, Lcom/daaw/xa6;->a()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v2}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Lcom/daaw/h96;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v0, v1, v2}, Lcom/daaw/h96;-><init>(Lcom/daaw/ou3;Landroid/content/Context;Ljava/lang/String;Lcom/daaw/g77;)V

    return-object v3
.end method
