.class public Lcom/daaw/qk$q;
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

    iput-object p1, p0, Lcom/daaw/qk$q;->b:Lcom/daaw/qk;

    invoke-direct {p0}, Lcom/daaw/gh0$e$a;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;Lcom/daaw/be0;Lcom/daaw/er0;)Lcom/daaw/mo1;
    .locals 0
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

    iget-object p1, p0, Lcom/daaw/qk$q;->b:Lcom/daaw/qk;

    invoke-virtual {p1}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object p1

    check-cast p1, Lcom/daaw/be0;

    iget-object p2, p0, Lcom/daaw/qk$q;->b:Lcom/daaw/qk;

    invoke-static {p2}, Lcom/daaw/qk;->c0(Lcom/daaw/qk;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Lcom/daaw/er0;

    invoke-virtual {p2}, Lcom/daaw/er0;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/daaw/lo1;

    iget-object p4, p4, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast p4, Lcom/daaw/tx0;

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p2, Lcom/daaw/mo1;

    const/4 p3, 0x0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    sget-object p4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p2, p3, p1, p4}, Lcom/daaw/mo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method
