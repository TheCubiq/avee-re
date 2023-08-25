.class public Lcom/daaw/zj$o;
.super Lcom/daaw/gh0$e$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/zj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/daaw/zj;


# direct methods
.method public constructor <init>(Lcom/daaw/zj;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/zj$o;->b:Lcom/daaw/zj;

    invoke-direct {p0}, Lcom/daaw/gh0$e$a;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;Lcom/daaw/be0;Lcom/daaw/er0;)Lcom/daaw/mo1;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;",
            "Lcom/daaw/be0;",
            "Lcom/daaw/er0<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/vd0;",
            ">;)",
            "Lcom/daaw/mo1<",
            "Ljava/lang/Integer;",
            "Lcom/daaw/be0;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    check-cast p2, Lcom/daaw/zj$t;

    iget-object v0, p0, Lcom/daaw/zj$o;->b:Lcom/daaw/zj;

    invoke-virtual {v0}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object v0

    check-cast v0, Lcom/daaw/be0;

    const/4 v1, 0x0

    if-eqz p4, :cond_1

    iget-object v2, p0, Lcom/daaw/zj$o;->b:Lcom/daaw/zj;

    invoke-virtual {v2}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object v2

    invoke-interface {p4, v2}, Lcom/daaw/be0;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_1

    iget-object p4, p2, Lcom/daaw/zj$t;->b:Lcom/daaw/zj$s;

    invoke-virtual {p4}, Lcom/daaw/zj$s;->h()Lcom/daaw/tx0;

    move-result-object p4

    iget-object v2, p0, Lcom/daaw/zj$o;->b:Lcom/daaw/zj;

    invoke-static {v2}, Lcom/daaw/zj;->Q(Lcom/daaw/zj;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2, p4, v1}, Lcom/daaw/zj;->W(Ljava/util/List;Lcom/daaw/tx0;I)I

    move-result v2

    const/4 v3, 0x0

    if-ltz v2, :cond_0

    invoke-virtual {p5}, Lcom/daaw/er0;->size()I

    move-result v4

    if-ge v2, v4, :cond_0

    invoke-virtual {p5, v2}, Lcom/daaw/er0;->o(I)Ljava/lang/Object;

    move-result-object p5

    move-object v3, p5

    check-cast v3, Lcom/daaw/tx0;

    :cond_0
    if-eqz p4, :cond_1

    invoke-virtual {p4, v3}, Lcom/daaw/tx0;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_1

    new-instance p1, Lcom/daaw/mo1;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {p1, p2, v0, p3}, Lcom/daaw/mo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p4

    iget-object p5, p0, Lcom/daaw/zj$o;->b:Lcom/daaw/zj;

    invoke-static {p5}, Lcom/daaw/zj;->Q(Lcom/daaw/zj;)Ljava/util/List;

    move-result-object p5

    invoke-static {p1, p5, p3}, Lcom/daaw/zj;->b0(Landroid/content/Context;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    iget-object p1, p2, Lcom/daaw/zj$t;->b:Lcom/daaw/zj$s;

    invoke-virtual {p1}, Lcom/daaw/zj$s;->h()Lcom/daaw/tx0;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-static {p3, p1, p4}, Lcom/daaw/dr1;->a(Ljava/util/List;Lcom/daaw/tx0;I)I

    move-result p1

    if-gez p1, :cond_2

    goto :goto_0

    :cond_2
    move v1, p1

    :cond_3
    :goto_0
    new-instance p1, Lcom/daaw/mo1;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p1, p2, v0, p3}, Lcom/daaw/mo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method
