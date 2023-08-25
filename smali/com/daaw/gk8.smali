.class public final Lcom/daaw/gk8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/xh8;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/c33;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/gk8;->a:Landroid/content/Context;

    new-instance p1, Lcom/daaw/xh8;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2, p2}, Lcom/daaw/xh8;-><init>(Lcom/daaw/gk8;Lcom/daaw/c33;Lcom/daaw/lf8;)V

    iput-object p1, p0, Lcom/daaw/gk8;->b:Lcom/daaw/xh8;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/daaw/g01;Lcom/daaw/is3;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/gk8;->a:Landroid/content/Context;

    new-instance p1, Lcom/daaw/xh8;

    const/4 v0, 0x0

    invoke-direct {p1, p0, p2, p3, v0}, Lcom/daaw/xh8;-><init>(Lcom/daaw/gk8;Lcom/daaw/g01;Lcom/daaw/is3;Lcom/daaw/lf8;)V

    iput-object p1, p0, Lcom/daaw/gk8;->b:Lcom/daaw/xh8;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/gk8;)Lcom/daaw/xh8;
    .locals 0

    iget-object p0, p0, Lcom/daaw/gk8;->b:Lcom/daaw/xh8;

    return-object p0
.end method


# virtual methods
.method public final b()Lcom/daaw/c33;
    .locals 1

    iget-object v0, p0, Lcom/daaw/gk8;->b:Lcom/daaw/xh8;

    invoke-static {v0}, Lcom/daaw/xh8;->a(Lcom/daaw/xh8;)Lcom/daaw/c33;

    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()Lcom/daaw/g01;
    .locals 1

    iget-object v0, p0, Lcom/daaw/gk8;->b:Lcom/daaw/xh8;

    invoke-static {v0}, Lcom/daaw/xh8;->b(Lcom/daaw/xh8;)Lcom/daaw/g01;

    move-result-object v0

    return-object v0
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/gk8;->b:Lcom/daaw/xh8;

    iget-object v1, p0, Lcom/daaw/gk8;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/daaw/xh8;->d(Landroid/content/Context;)V

    return-void
.end method

.method public final e()V
    .locals 3

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "com.android.vending.billing.PURCHASES_UPDATED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const-string v1, "com.android.vending.billing.ALTERNATIVE_BILLING"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/daaw/gk8;->b:Lcom/daaw/xh8;

    iget-object v2, p0, Lcom/daaw/gk8;->a:Landroid/content/Context;

    invoke-virtual {v1, v2, v0}, Lcom/daaw/xh8;->c(Landroid/content/Context;Landroid/content/IntentFilter;)V

    return-void
.end method
