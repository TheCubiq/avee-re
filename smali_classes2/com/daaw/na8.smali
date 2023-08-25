.class public Lcom/daaw/na8;
.super Lcom/daaw/rc7;
.source ""


# instance fields
.field public final b:Lcom/daaw/yb8;


# direct methods
.method public constructor <init>(Lcom/daaw/yb8;)V
    .locals 1

    invoke-virtual {p1}, Lcom/daaw/yb8;->c0()Lcom/daaw/dr6;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/rc7;-><init>(Lcom/daaw/dr6;)V

    invoke-static {p1}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    return-void
.end method
