.class public Lcom/daaw/zj$e;
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

    iput-object p1, p0, Lcom/daaw/zj$e;->b:Lcom/daaw/zj;

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

    iget-object p2, p0, Lcom/daaw/zj$e;->b:Lcom/daaw/zj;

    invoke-virtual {p2}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object p2

    check-cast p2, Lcom/daaw/be0;

    iget-object p4, p0, Lcom/daaw/zj$e;->b:Lcom/daaw/zj;

    invoke-static {p4}, Lcom/daaw/zj;->Q(Lcom/daaw/zj;)Ljava/util/List;

    move-result-object p4

    invoke-static {p1, p4, p3}, Lcom/daaw/zj;->b0(Landroid/content/Context;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    new-instance p1, Lcom/daaw/mo1;

    const/4 p3, 0x0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    sget-object p4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p1, p3, p2, p4}, Lcom/daaw/mo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method
