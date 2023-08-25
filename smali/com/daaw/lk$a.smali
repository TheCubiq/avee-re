.class public Lcom/daaw/lk$a;
.super Lcom/daaw/ih0$a$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/lk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/daaw/lk;


# direct methods
.method public constructor <init>(Lcom/daaw/lk;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/lk$a;->b:Lcom/daaw/lk;

    invoke-direct {p0}, Lcom/daaw/ih0$a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/content/Context;Ljava/lang/Object;)Lcom/daaw/ir1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Object;",
            ")",
            "Lcom/daaw/ir1<",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;>;"
        }
    .end annotation

    check-cast p2, Lcom/daaw/lk$b;

    invoke-static {}, Lcom/daaw/tc1;->e()Lcom/daaw/rc1;

    move-result-object p1

    iget-object v0, p2, Lcom/daaw/lk$b;->b:Lcom/daaw/sc1;

    invoke-virtual {v0}, Lcom/daaw/sc1;->c()Ljava/lang/String;

    move-result-object v0

    iget-object p2, p2, Lcom/daaw/lk$b;->b:Lcom/daaw/sc1;

    invoke-virtual {p2}, Lcom/daaw/sc1;->d()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lcom/daaw/rc1;->j(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/ir1;

    move-result-object p1

    return-object p1
.end method
