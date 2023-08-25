.class public Lcom/daaw/hj0$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ww1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/hj0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/ww1$a<",
        "Lcom/daaw/wc0;",
        "Lcom/daaw/lo1<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/hj0;


# direct methods
.method public constructor <init>(Lcom/daaw/hj0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/hj0$h;->a:Lcom/daaw/hj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/wc0;)Lcom/daaw/lo1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/wc0;",
            ")",
            "Lcom/daaw/lo1<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    invoke-interface {p1}, Lcom/daaw/wc0;->e()Ljava/lang/String;

    move-result-object p1

    const-string v0, "/"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/hj0$h;->a:Lcom/daaw/hj0;

    invoke-virtual {p1}, Lcom/daaw/hj0;->q()Lcom/daaw/lo1;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Lcom/daaw/hj0$h;->a:Lcom/daaw/hj0;

    invoke-virtual {p1}, Lcom/daaw/hj0;->r()Lcom/daaw/lo1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/wc0;

    invoke-virtual {p0, p1}, Lcom/daaw/hj0$h;->a(Lcom/daaw/wc0;)Lcom/daaw/lo1;

    move-result-object p1

    return-object p1
.end method
