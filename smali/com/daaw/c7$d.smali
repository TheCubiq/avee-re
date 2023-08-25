.class public final Lcom/daaw/c7$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/c7$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/c7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Lcom/daaw/rv0;


# direct methods
.method public constructor <init>(Lcom/daaw/b7$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    iput-object p1, p0, Lcom/daaw/c7$d;->c:Lcom/daaw/rv0;

    const/16 v0, 0xc

    invoke-virtual {p1, v0}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {p1}, Lcom/daaw/rv0;->B()I

    move-result v0

    iput v0, p0, Lcom/daaw/c7$d;->a:I

    invoke-virtual {p1}, Lcom/daaw/rv0;->B()I

    move-result p1

    iput p1, p0, Lcom/daaw/c7$d;->b:I

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget v0, p0, Lcom/daaw/c7$d;->a:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/daaw/c7$d;->b:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/daaw/c7$d;->a:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/c7$d;->c:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->B()I

    move-result v0

    :cond_0
    return v0
.end method
