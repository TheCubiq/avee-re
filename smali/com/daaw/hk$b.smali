.class public Lcom/daaw/hk$b;
.super Lcom/daaw/gh0$f$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/hk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/daaw/hk;


# direct methods
.method public constructor <init>(Lcom/daaw/hk;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/hk$b;->b:Lcom/daaw/hk;

    invoke-direct {p0}, Lcom/daaw/gh0$f$a;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;)V
    .locals 1
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

    check-cast p2, Lcom/daaw/hk$h;

    iget-object v0, p0, Lcom/daaw/hk$b;->b:Lcom/daaw/hk;

    iget-object p2, p2, Lcom/daaw/hk$h;->b:Ljava/lang/String;

    invoke-static {p1, v0, p2, p3}, Lcom/daaw/hk;->X(Landroid/content/Context;Lcom/daaw/yj;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    return-void
.end method
