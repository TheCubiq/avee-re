.class public final Lcom/daaw/py;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g00;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/g00<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/a01;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/a01<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/a01;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/a01<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/py;->a:Lcom/daaw/a01;

    return-void
.end method

.method public static a(Lcom/daaw/a01;)Lcom/daaw/py;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/a01<",
            "Landroid/content/Context;",
            ">;)",
            "Lcom/daaw/py;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/py;

    invoke-direct {v0, p0}, Lcom/daaw/py;-><init>(Lcom/daaw/a01;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/daaw/ny;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, v0}, Lcom/daaw/qy0;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/py;->a:Lcom/daaw/a01;

    invoke-interface {v0}, Lcom/daaw/a01;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/py;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/py;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
