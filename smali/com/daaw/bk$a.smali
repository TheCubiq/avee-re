.class public Lcom/daaw/bk$a;
.super Lcom/daaw/gh0$g$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/bk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/daaw/bk;


# direct methods
.method public constructor <init>(Lcom/daaw/bk;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/bk$a;->b:Lcom/daaw/bk;

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

    check-cast p2, Lcom/daaw/bk$g;

    iget-object v0, p0, Lcom/daaw/bk$a;->b:Lcom/daaw/bk;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p2, Lcom/daaw/bk$g;->a:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, p2, p3}, Lcom/daaw/bk;->X(Landroid/content/Context;Lcom/daaw/yj;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    return-void
.end method
