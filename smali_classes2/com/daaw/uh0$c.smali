.class public final Lcom/daaw/uh0$c;
.super Lcom/daaw/yk0$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/uh0;->f(Ljava/lang/Object;Lcom/daaw/ys0;Lcom/daaw/th0;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic d:Lcom/daaw/yk0;

.field public final synthetic e:Lcom/daaw/uh0;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/daaw/yk0;Lcom/daaw/uh0;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/uh0$c;->d:Lcom/daaw/yk0;

    iput-object p2, p0, Lcom/daaw/uh0$c;->e:Lcom/daaw/uh0;

    iput-object p3, p0, Lcom/daaw/uh0$c;->f:Ljava/lang/Object;

    invoke-direct {p0, p1}, Lcom/daaw/yk0$a;-><init>(Lcom/daaw/yk0;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/yk0;

    invoke-virtual {p0, p1}, Lcom/daaw/uh0$c;->i(Lcom/daaw/yk0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public i(Lcom/daaw/yk0;)Ljava/lang/Object;
    .locals 1

    iget-object p1, p0, Lcom/daaw/uh0$c;->e:Lcom/daaw/uh0;

    invoke-virtual {p1}, Lcom/daaw/uh0;->F()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/uh0$c;->f:Ljava/lang/Object;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    invoke-static {}, Lcom/daaw/xk0;->a()Ljava/lang/Object;

    move-result-object p1

    :goto_1
    return-object p1
.end method
