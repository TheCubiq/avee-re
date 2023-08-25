.class public Lcom/daaw/mn1$b;
.super Lcom/daaw/jn1;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/mn1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Lcom/daaw/mn1;


# direct methods
.method public constructor <init>(Lcom/daaw/mn1;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/jn1;-><init>()V

    iput-object p1, p0, Lcom/daaw/mn1$b;->a:Lcom/daaw/mn1;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/in1;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/mn1$b;->a:Lcom/daaw/mn1;

    iget v1, v0, Lcom/daaw/mn1;->a0:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lcom/daaw/mn1;->a0:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/daaw/mn1;->b0:Z

    invoke-virtual {v0}, Lcom/daaw/in1;->t()V

    :cond_0
    invoke-virtual {p1, p0}, Lcom/daaw/in1;->T(Lcom/daaw/in1$f;)Lcom/daaw/in1;

    return-void
.end method

.method public d(Lcom/daaw/in1;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/mn1$b;->a:Lcom/daaw/mn1;

    iget-boolean v0, p1, Lcom/daaw/mn1;->b0:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/daaw/in1;->e0()V

    iget-object p1, p0, Lcom/daaw/mn1$b;->a:Lcom/daaw/mn1;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/daaw/mn1;->b0:Z

    :cond_0
    return-void
.end method
