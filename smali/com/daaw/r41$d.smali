.class public Lcom/daaw/r41$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/r41;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/r41;


# direct methods
.method public constructor <init>(Lcom/daaw/r41;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/r41$d;->a:Lcom/daaw/r41;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/f60;)Lcom/daaw/f60;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            "X:",
            "Lcom/daaw/f60<",
            "TA;***>;>(TX;)TX;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/r41$d;->a:Lcom/daaw/r41;

    invoke-static {v0}, Lcom/daaw/r41;->p(Lcom/daaw/r41;)Lcom/daaw/r41$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/r41$d;->a:Lcom/daaw/r41;

    invoke-static {v0}, Lcom/daaw/r41;->p(Lcom/daaw/r41;)Lcom/daaw/r41$b;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/daaw/r41$b;->a(Lcom/daaw/f60;)V

    :cond_0
    return-object p1
.end method
