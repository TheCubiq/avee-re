.class public final Lcom/daaw/qb$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/qb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public volatile a:Z

.field public final b:Landroid/content/Context;

.field public volatile c:Lcom/daaw/g01;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/daaw/sm8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/qb$a;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/qb;
    .locals 7

    iget-object v0, p0, Lcom/daaw/qb$a;->b:Landroid/content/Context;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/daaw/qb$a;->c:Lcom/daaw/g01;

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/daaw/qb$a;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/qb$a;->c:Lcom/daaw/g01;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/daaw/rb;

    iget-boolean v3, p0, Lcom/daaw/qb$a;->a:Z

    iget-object v4, p0, Lcom/daaw/qb$a;->b:Landroid/content/Context;

    iget-object v5, p0, Lcom/daaw/qb$a;->c:Lcom/daaw/g01;

    const/4 v2, 0x0

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/daaw/rb;-><init>(Ljava/lang/String;ZLandroid/content/Context;Lcom/daaw/g01;Lcom/daaw/is3;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/daaw/rb;

    iget-boolean v1, p0, Lcom/daaw/qb$a;->a:Z

    iget-object v2, p0, Lcom/daaw/qb$a;->b:Landroid/content/Context;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2, v3}, Lcom/daaw/rb;-><init>(Ljava/lang/String;ZLandroid/content/Context;Lcom/daaw/c33;)V

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Support for pending purchases must be enabled. Enable this by calling \'enablePendingPurchases()\' on BillingClientBuilder."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Please provide a valid listener for purchases updates."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Please provide a valid Context."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()Lcom/daaw/qb$a;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/qb$a;->a:Z

    return-object p0
.end method

.method public c(Lcom/daaw/g01;)Lcom/daaw/qb$a;
    .locals 0

    iput-object p1, p0, Lcom/daaw/qb$a;->c:Lcom/daaw/g01;

    return-object p0
.end method
