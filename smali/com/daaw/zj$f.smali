.class public Lcom/daaw/zj$f;
.super Lcom/daaw/gh0$a$a;
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

    iput-object p1, p0, Lcom/daaw/zj$f;->b:Lcom/daaw/zj;

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

    iget-object p2, p0, Lcom/daaw/zj$f;->b:Lcom/daaw/zj;

    invoke-static {p2}, Lcom/daaw/zj;->Q(Lcom/daaw/zj;)Ljava/util/List;

    move-result-object p2

    invoke-static {p1, p2, p3}, Lcom/daaw/zj;->b0(Landroid/content/Context;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    return-void
.end method
