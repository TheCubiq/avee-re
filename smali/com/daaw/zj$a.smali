.class public Lcom/daaw/zj$a;
.super Lcom/daaw/gh0$c$a;
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

    iput-object p1, p0, Lcom/daaw/zj$a;->b:Lcom/daaw/zj;

    invoke-direct {p0}, Lcom/daaw/gh0$c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;)V"
        }
    .end annotation

    check-cast p2, Lcom/daaw/zj$t;

    iget-object p1, p2, Lcom/daaw/zj$t;->b:Lcom/daaw/zj$s;

    invoke-virtual {p1}, Lcom/daaw/zj$s;->h()Lcom/daaw/tx0;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
