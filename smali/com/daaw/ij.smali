.class public Lcom/daaw/ij;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/daaw/hj$a;)Lcom/daaw/hj;
    .locals 1

    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {p1, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    new-instance v0, Lcom/daaw/oq;

    invoke-direct {v0, p1, p2}, Lcom/daaw/oq;-><init>(Landroid/content/Context;Lcom/daaw/hj$a;)V

    return-object v0

    :cond_1
    new-instance p1, Lcom/daaw/ht0;

    invoke-direct {p1}, Lcom/daaw/ht0;-><init>()V

    return-object p1
.end method
