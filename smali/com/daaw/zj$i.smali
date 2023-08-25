.class public Lcom/daaw/zj$i;
.super Lcom/daaw/gh0$g$a;
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

    iput-object p1, p0, Lcom/daaw/zj$i;->b:Lcom/daaw/zj;

    invoke-direct {p0}, Lcom/daaw/gh0$g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;)V
    .locals 4
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

    iget-object v0, p0, Lcom/daaw/zj$i;->b:Lcom/daaw/zj;

    invoke-static {v0}, Lcom/daaw/zj;->P(Lcom/daaw/zj;)I

    move-result v0

    iget-object v1, p0, Lcom/daaw/zj$i;->b:Lcom/daaw/zj;

    invoke-virtual {v1}, Lcom/daaw/yj;->J()Lcom/daaw/sd0;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/daaw/zj$t;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, v1, p2, p3}, Lcom/daaw/zj;->c0(Landroid/content/Context;ILcom/daaw/sd0;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    return-void
.end method
