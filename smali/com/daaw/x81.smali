.class public final Lcom/daaw/x81;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g00;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/g00<",
        "Lcom/daaw/s81;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/a01;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/a01<",
            "Lcom/daaw/cg;",
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
            "Lcom/daaw/cg;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/x81;->a:Lcom/daaw/a01;

    return-void
.end method

.method public static a(Lcom/daaw/cg;)Lcom/daaw/s81;
    .locals 1

    invoke-static {p0}, Lcom/daaw/w81;->a(Lcom/daaw/cg;)Lcom/daaw/s81;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, v0}, Lcom/daaw/qy0;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/s81;

    return-object p0
.end method

.method public static b(Lcom/daaw/a01;)Lcom/daaw/x81;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/a01<",
            "Lcom/daaw/cg;",
            ">;)",
            "Lcom/daaw/x81;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/x81;

    invoke-direct {v0, p0}, Lcom/daaw/x81;-><init>(Lcom/daaw/a01;)V

    return-object v0
.end method


# virtual methods
.method public c()Lcom/daaw/s81;
    .locals 1

    iget-object v0, p0, Lcom/daaw/x81;->a:Lcom/daaw/a01;

    invoke-interface {v0}, Lcom/daaw/a01;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/cg;

    invoke-static {v0}, Lcom/daaw/x81;->a(Lcom/daaw/cg;)Lcom/daaw/s81;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/x81;->c()Lcom/daaw/s81;

    move-result-object v0

    return-object v0
.end method
