.class public Lcom/daaw/ie1$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/xw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ie1;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/xw1$a<",
        "Ljava/lang/Integer;",
        "Lcom/daaw/sd0;",
        "Lcom/daaw/ie1$h;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ie1;


# direct methods
.method public constructor <init>(Lcom/daaw/ie1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ie1$f;->a:Lcom/daaw/ie1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Integer;Lcom/daaw/sd0;)Lcom/daaw/ie1$h;
    .locals 1

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p1

    sget p2, Lcom/daaw/j5;->M:I

    invoke-virtual {p1, p2}, Lcom/daaw/j5;->k(I)I

    move-result p1

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object p2

    sget v0, Lcom/daaw/j5;->N:I

    invoke-virtual {p2, v0}, Lcom/daaw/j5;->k(I)I

    move-result p2

    new-instance v0, Lcom/daaw/ie1$h;

    invoke-direct {v0}, Lcom/daaw/ie1$h;-><init>()V

    iput p1, v0, Lcom/daaw/ie1$h;->a:I

    const/4 p1, 0x1

    and-int/2addr p2, p1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, Lcom/daaw/ie1$h;->b:Z

    return-object v0
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Lcom/daaw/sd0;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/ie1$f;->a(Ljava/lang/Integer;Lcom/daaw/sd0;)Lcom/daaw/ie1$h;

    move-result-object p1

    return-object p1
.end method
