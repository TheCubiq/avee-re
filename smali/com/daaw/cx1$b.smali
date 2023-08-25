.class public final Lcom/daaw/cx1$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/cx1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/daaw/cx1$b;",
        ">;"
    }
.end annotation


# instance fields
.field public final p:I

.field public final q:Lcom/daaw/ax1;


# direct methods
.method public constructor <init>(ILcom/daaw/ax1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/cx1$b;->p:I

    iput-object p2, p0, Lcom/daaw/cx1$b;->q:Lcom/daaw/ax1;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/cx1$b;)I
    .locals 1

    iget v0, p0, Lcom/daaw/cx1$b;->p:I

    iget p1, p1, Lcom/daaw/cx1$b;->p:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/daaw/cx1$b;

    invoke-virtual {p0, p1}, Lcom/daaw/cx1$b;->a(Lcom/daaw/cx1$b;)I

    move-result p1

    return p1
.end method
