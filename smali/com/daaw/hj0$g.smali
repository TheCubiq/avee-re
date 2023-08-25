.class public Lcom/daaw/hj0$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/rw1$a;


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
        "Lcom/daaw/rw1$a<",
        "Lcom/daaw/al;",
        "Ljava/util/List<",
        "Lcom/daaw/gh0$d;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/hj0;


# direct methods
.method public constructor <init>(Lcom/daaw/hj0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/hj0$g;->a:Lcom/daaw/hj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/al;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/al;",
            "Ljava/util/List<",
            "Lcom/daaw/gh0$d;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/gh0$d;

    invoke-virtual {p2}, Lcom/daaw/gh0$d;->a()Lcom/daaw/tx0;

    move-result-object p2

    if-nez p2, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/daaw/al;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {p1, v0, p2}, Lcom/daaw/fe1;->a(Lcom/daaw/al;Landroid/content/Context;Lcom/daaw/tx0;)Lcom/daaw/fe1;

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/al;

    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/hj0$g;->a(Lcom/daaw/al;Ljava/util/List;)V

    return-void
.end method
