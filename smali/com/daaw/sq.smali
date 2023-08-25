.class public final Lcom/daaw/sq;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/mp$a;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/bn1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/bn1<",
            "-",
            "Lcom/daaw/mp;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/daaw/mp$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/bn1;Lcom/daaw/mp$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/bn1<",
            "-",
            "Lcom/daaw/mp;",
            ">;",
            "Lcom/daaw/mp$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/sq;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/sq;->b:Lcom/daaw/bn1;

    iput-object p3, p0, Lcom/daaw/sq;->c:Lcom/daaw/mp$a;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lcom/daaw/mp;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/sq;->b()Lcom/daaw/rq;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/daaw/rq;
    .locals 4

    new-instance v0, Lcom/daaw/rq;

    iget-object v1, p0, Lcom/daaw/sq;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/daaw/sq;->b:Lcom/daaw/bn1;

    iget-object v3, p0, Lcom/daaw/sq;->c:Lcom/daaw/mp$a;

    invoke-interface {v3}, Lcom/daaw/mp$a;->a()Lcom/daaw/mp;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/rq;-><init>(Landroid/content/Context;Lcom/daaw/bn1;Lcom/daaw/mp;)V

    return-object v0
.end method
