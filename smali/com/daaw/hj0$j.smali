.class public Lcom/daaw/hj0$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/rw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/hj0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/rw1$a<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/hj0;


# direct methods
.method public constructor <init>(Lcom/daaw/hj0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/hj0$j;->a:Lcom/daaw/hj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Integer;Ljava/lang/Boolean;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget v1, Lcom/daaw/j5;->q:I

    if-ne v0, v1, :cond_0

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Lcom/daaw/dj0;->i(Z)V

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget v1, Lcom/daaw/j5;->s:I

    if-ne v0, v1, :cond_1

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Lcom/daaw/dj0;->j(Z)V

    :goto_0
    iget-object p1, p0, Lcom/daaw/hj0$j;->a:Lcom/daaw/hj0;

    invoke-virtual {p1}, Lcom/daaw/hj0;->A()V

    iget-object p1, p0, Lcom/daaw/hj0$j;->a:Lcom/daaw/hj0;

    invoke-virtual {p1}, Lcom/daaw/hj0;->B()V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    sget p2, Lcom/daaw/j5;->C:I

    if-ne p1, p2, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/hj0$j;->a(Ljava/lang/Integer;Ljava/lang/Boolean;)V

    return-void
.end method
