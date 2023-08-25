.class public abstract Lcom/daaw/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/nl$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<B::",
        "Lcom/daaw/nl$b;",
        "E::TB;>",
        "Ljava/lang/Object;",
        "Lcom/daaw/nl$c<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final p:Lcom/daaw/z40;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/z40<",
            "Lcom/daaw/nl$b;",
            "TE;>;"
        }
    .end annotation
.end field

.field public final q:Lcom/daaw/nl$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/nl$c<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/nl$c;Lcom/daaw/z40;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/nl$c<",
            "TB;>;",
            "Lcom/daaw/z40<",
            "-",
            "Lcom/daaw/nl$b;",
            "+TE;>;)V"
        }
    .end annotation

    const-string v0, "baseKey"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "safeCast"

    invoke-static {p2, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/h;->p:Lcom/daaw/z40;

    instance-of p2, p1, Lcom/daaw/h;

    if-eqz p2, :cond_0

    check-cast p1, Lcom/daaw/h;

    iget-object p1, p1, Lcom/daaw/h;->q:Lcom/daaw/nl$c;

    :cond_0
    iput-object p1, p0, Lcom/daaw/h;->q:Lcom/daaw/nl$c;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/nl$c;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/nl$c<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eq p1, p0, :cond_1

    iget-object v0, p0, Lcom/daaw/h;->q:Lcom/daaw/nl$c;

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final b(Lcom/daaw/nl$b;)Lcom/daaw/nl$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/nl$b;",
            ")TE;"
        }
    .end annotation

    const-string v0, "element"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/h;->p:Lcom/daaw/z40;

    invoke-interface {v0, p1}, Lcom/daaw/z40;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/nl$b;

    return-object p1
.end method
