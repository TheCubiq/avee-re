.class public Lcom/daaw/lj1$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/lj1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/daaw/lj1$c;",
        ">;"
    }
.end annotation


# instance fields
.field public final p:I

.field public final q:I

.field public final r:Ljava/lang/String;

.field public final s:Ljava/lang/String;


# direct methods
.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/lj1$c;->p:I

    iput p2, p0, Lcom/daaw/lj1$c;->q:I

    iput-object p3, p0, Lcom/daaw/lj1$c;->r:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/lj1$c;->s:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/lj1$c;)I
    .locals 2

    iget v0, p0, Lcom/daaw/lj1$c;->p:I

    iget v1, p1, Lcom/daaw/lj1$c;->p:I

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Lcom/daaw/lj1$c;->q:I

    iget p1, p1, Lcom/daaw/lj1$c;->q:I

    sub-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/daaw/lj1$c;

    invoke-virtual {p0, p1}, Lcom/daaw/lj1$c;->a(Lcom/daaw/lj1$c;)I

    move-result p1

    return p1
.end method
