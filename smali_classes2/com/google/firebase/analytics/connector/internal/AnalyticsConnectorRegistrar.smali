.class public Lcom/google/firebase/analytics/connector/internal/AnalyticsConnectorRegistrar;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic lambda$getComponents$0(Lcom/daaw/bi;)Lcom/daaw/p2;
    .locals 3

    const-class v0, Lcom/daaw/s10;

    invoke-interface {p0, v0}, Lcom/daaw/bi;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/s10;

    const-class v1, Landroid/content/Context;

    invoke-interface {p0, v1}, Lcom/daaw/bi;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/daaw/sh1;

    invoke-interface {p0, v2}, Lcom/daaw/bi;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/sh1;

    invoke-static {v0, v1, p0}, Lcom/daaw/q2;->c(Lcom/daaw/s10;Landroid/content/Context;Lcom/daaw/sh1;)Lcom/daaw/p2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/daaw/vh<",
            "*>;>;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/daaw/vh;

    const-class v1, Lcom/daaw/p2;

    invoke-static {v1}, Lcom/daaw/vh;->e(Ljava/lang/Class;)Lcom/daaw/vh$b;

    move-result-object v1

    const-class v2, Lcom/daaw/s10;

    invoke-static {v2}, Lcom/daaw/ys;->j(Ljava/lang/Class;)Lcom/daaw/ys;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/daaw/vh$b;->b(Lcom/daaw/ys;)Lcom/daaw/vh$b;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-static {v2}, Lcom/daaw/ys;->j(Ljava/lang/Class;)Lcom/daaw/ys;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/daaw/vh$b;->b(Lcom/daaw/ys;)Lcom/daaw/vh$b;

    move-result-object v1

    const-class v2, Lcom/daaw/sh1;

    invoke-static {v2}, Lcom/daaw/ys;->j(Ljava/lang/Class;)Lcom/daaw/ys;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/daaw/vh$b;->b(Lcom/daaw/ys;)Lcom/daaw/vh$b;

    move-result-object v1

    sget-object v2, Lcom/daaw/dy2;->a:Lcom/daaw/dy2;

    invoke-virtual {v1, v2}, Lcom/daaw/vh$b;->e(Lcom/daaw/gi;)Lcom/daaw/vh$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/vh$b;->d()Lcom/daaw/vh$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/vh$b;->c()Lcom/daaw/vh;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "fire-analytics"

    const-string v2, "21.2.0"

    invoke-static {v1, v2}, Lcom/daaw/kj0;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/vh;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
