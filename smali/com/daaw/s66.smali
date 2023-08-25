.class public final Lcom/daaw/s66;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/s66;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/s66;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/s66;->c:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/s66;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ky3;

    sget-object v1, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v1}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lcom/daaw/s66;->c:Lcom/daaw/m08;

    check-cast v2, Lcom/daaw/h94;

    invoke-virtual {v2}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v2

    new-instance v3, Lcom/daaw/q66;

    invoke-direct {v3, v0, v1, v2}, Lcom/daaw/q66;-><init>(Lcom/daaw/ky3;Lcom/daaw/g77;Landroid/content/Context;)V

    return-object v3
.end method
