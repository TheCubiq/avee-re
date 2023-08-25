.class public Lcom/daaw/fl$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/rw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/fl;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/rw1$a<",
        "Lcom/daaw/jh0$a<",
        "Ljava/lang/Object;",
        ">;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/fl;


# direct methods
.method public constructor <init>(Lcom/daaw/fl;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/fl$d;->a:Lcom/daaw/fl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/jh0$a;Ljava/lang/Boolean;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/jh0$a<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/fl$d;->a:Lcom/daaw/fl;

    invoke-static {v0}, Lcom/daaw/fl;->c(Lcom/daaw/fl;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/jh0$a;->c()Lcom/daaw/sd0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/jh0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/jh0;

    invoke-virtual {p1}, Lcom/daaw/jh0$a;->c()Lcom/daaw/sd0;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/daaw/jh0;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/daaw/fl$d;->a:Lcom/daaw/fl;

    invoke-static {v1}, Lcom/daaw/fl;->c(Lcom/daaw/fl;)Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {p1}, Lcom/daaw/jh0$a;->c()Lcom/daaw/sd0;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {v0, p1}, Lcom/daaw/jh0;->a(Lcom/daaw/jh0$a;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1}, Lcom/daaw/jh0;->c(Lcom/daaw/jh0$a;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/jh0$a;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/fl$d;->a(Lcom/daaw/jh0$a;Ljava/lang/Boolean;)V

    return-void
.end method
