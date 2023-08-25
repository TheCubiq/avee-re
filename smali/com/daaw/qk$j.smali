.class public Lcom/daaw/qk$j;
.super Lcom/daaw/gh0$e$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/qk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/daaw/qk;


# direct methods
.method public constructor <init>(Lcom/daaw/qk;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qk$j;->b:Lcom/daaw/qk;

    invoke-direct {p0}, Lcom/daaw/gh0$e$a;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;Lcom/daaw/be0;Lcom/daaw/er0;)Lcom/daaw/mo1;
    .locals 3
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

    check-cast p2, Lcom/daaw/qk$s;

    iget-object p1, p0, Lcom/daaw/qk$j;->b:Lcom/daaw/qk;

    invoke-virtual {p1}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object p1

    check-cast p1, Lcom/daaw/be0;

    if-eqz p4, :cond_2

    iget-object v0, p0, Lcom/daaw/qk$j;->b:Lcom/daaw/qk;

    invoke-virtual {v0}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object v0

    invoke-interface {p4, v0}, Lcom/daaw/be0;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_2

    iget p4, p2, Lcom/daaw/qk$s;->a:I

    const/4 v0, 0x0

    if-ltz p4, :cond_0

    iget-object v1, p0, Lcom/daaw/qk$j;->b:Lcom/daaw/qk;

    invoke-static {v1}, Lcom/daaw/qk;->Z(Lcom/daaw/qk;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Lcom/daaw/er0;

    invoke-virtual {v1}, Lcom/daaw/er0;->size()I

    move-result v1

    if-ge p4, v1, :cond_0

    iget-object p4, p0, Lcom/daaw/qk$j;->b:Lcom/daaw/qk;

    invoke-static {p4}, Lcom/daaw/qk;->a0(Lcom/daaw/qk;)Ljava/util/List;

    move-result-object p4

    check-cast p4, Lcom/daaw/er0;

    iget v1, p2, Lcom/daaw/qk$s;->a:I

    invoke-virtual {p4, v1}, Lcom/daaw/er0;->o(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/daaw/tx0;

    goto :goto_0

    :cond_0
    move-object p4, v0

    :goto_0
    iget v1, p2, Lcom/daaw/qk$s;->a:I

    if-ltz v1, :cond_1

    invoke-virtual {p5}, Lcom/daaw/er0;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget v0, p2, Lcom/daaw/qk$s;->a:I

    invoke-virtual {p5, v0}, Lcom/daaw/er0;->o(I)Ljava/lang/Object;

    move-result-object p5

    move-object v0, p5

    check-cast v0, Lcom/daaw/tx0;

    :cond_1
    if-eqz p4, :cond_2

    invoke-virtual {p4, v0}, Lcom/daaw/tx0;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_2

    new-instance p3, Lcom/daaw/mo1;

    iget p2, p2, Lcom/daaw/qk$s;->a:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {p3, p2, p1, p4}, Lcom/daaw/mo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p3

    :cond_2
    iget-object p4, p0, Lcom/daaw/qk$j;->b:Lcom/daaw/qk;

    invoke-static {p4}, Lcom/daaw/qk;->b0(Lcom/daaw/qk;)Ljava/util/List;

    move-result-object p4

    check-cast p4, Lcom/daaw/er0;

    invoke-virtual {p4}, Lcom/daaw/er0;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_1
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_3

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lcom/daaw/lo1;

    iget-object p5, p5, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast p5, Lcom/daaw/tx0;

    invoke-interface {p3, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    new-instance p3, Lcom/daaw/mo1;

    iget p2, p2, Lcom/daaw/qk$s;->a:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    sget-object p4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p3, p2, p1, p4}, Lcom/daaw/mo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p3
.end method
