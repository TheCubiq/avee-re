.class public Lcom/daaw/qk$r;
.super Lcom/daaw/gh0$a$a;
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

    iput-object p1, p0, Lcom/daaw/qk$r;->b:Lcom/daaw/qk;

    invoke-direct {p0}, Lcom/daaw/gh0$a$a;-><init>()V

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

    iget-object p1, p0, Lcom/daaw/qk$r;->b:Lcom/daaw/qk;

    invoke-static {p1}, Lcom/daaw/qk;->d0(Lcom/daaw/qk;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Lcom/daaw/er0;

    invoke-virtual {p1}, Lcom/daaw/er0;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/lo1;

    iget-object p2, p2, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast p2, Lcom/daaw/tx0;

    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method
