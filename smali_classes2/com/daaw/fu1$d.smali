.class public Lcom/daaw/fu1$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/fu1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/fu1$d;->a:I

    iput p2, p0, Lcom/daaw/fu1$d;->b:I

    iput p3, p0, Lcom/daaw/fu1$d;->c:I

    iput p4, p0, Lcom/daaw/fu1$d;->d:I

    return-void
.end method

.method public constructor <init>(Lcom/daaw/fu1$d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget v0, p1, Lcom/daaw/fu1$d;->a:I

    iput v0, p0, Lcom/daaw/fu1$d;->a:I

    iget v0, p1, Lcom/daaw/fu1$d;->b:I

    iput v0, p0, Lcom/daaw/fu1$d;->b:I

    iget v0, p1, Lcom/daaw/fu1$d;->c:I

    iput v0, p0, Lcom/daaw/fu1$d;->c:I

    iget p1, p1, Lcom/daaw/fu1$d;->d:I

    iput p1, p0, Lcom/daaw/fu1$d;->d:I

    return-void
.end method
