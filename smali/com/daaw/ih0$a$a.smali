.class public Lcom/daaw/ih0$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ir1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ih0$a;->b(Lcom/daaw/al;Ljava/util/List;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/ir1$b<",
        "Ljava/util/List<",
        "Lcom/daaw/tx0;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ih0$a;


# direct methods
.method public constructor <init>(Lcom/daaw/ih0$a;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ih0$a$a;->a:Lcom/daaw/ih0$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Z)V
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/ih0$a$a;->b(Ljava/util/List;Z)V

    return-void
.end method

.method public b(Ljava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/tx0;",
            ">;Z)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    return-void

    :cond_0
    sget-object p2, Lcom/daaw/ih0;->a:Lcom/daaw/sw1;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p2, p1, v0, v1}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
