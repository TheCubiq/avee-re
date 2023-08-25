.class public final Lcom/daaw/oi0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/oi0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/daaw/oi0;",
        ">;"
    }
.end annotation


# static fields
.field public static final t:Lcom/daaw/oi0$a;

.field public static final u:Lcom/daaw/oi0;


# instance fields
.field public final p:I

.field public final q:I

.field public final r:I

.field public final s:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/oi0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/oi0$a;-><init>(Lcom/daaw/pq;)V

    sput-object v0, Lcom/daaw/oi0;->t:Lcom/daaw/oi0$a;

    invoke-static {}, Lcom/daaw/pi0;->a()Lcom/daaw/oi0;

    move-result-object v0

    sput-object v0, Lcom/daaw/oi0;->u:Lcom/daaw/oi0;

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/oi0;->p:I

    iput p2, p0, Lcom/daaw/oi0;->q:I

    iput p3, p0, Lcom/daaw/oi0;->r:I

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/oi0;->b(III)I

    move-result p1

    iput p1, p0, Lcom/daaw/oi0;->s:I

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/oi0;)I
    .locals 1

    const-string v0, "other"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lcom/daaw/oi0;->s:I

    iget p1, p1, Lcom/daaw/oi0;->s:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public final b(III)I
    .locals 3

    new-instance v0, Lcom/daaw/pg0;

    const/4 v1, 0x0

    const/16 v2, 0xff

    invoke-direct {v0, v1, v2}, Lcom/daaw/pg0;-><init>(II)V

    invoke-virtual {v0, p1}, Lcom/daaw/pg0;->k(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/daaw/pg0;

    invoke-direct {v0, v1, v2}, Lcom/daaw/pg0;-><init>(II)V

    invoke-virtual {v0, p2}, Lcom/daaw/pg0;->k(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/daaw/pg0;

    invoke-direct {v0, v1, v2}, Lcom/daaw/pg0;-><init>(II)V

    invoke-virtual {v0, p3}, Lcom/daaw/pg0;->k(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    if-eqz v1, :cond_1

    shl-int/lit8 p1, p1, 0x10

    shl-int/lit8 p2, p2, 0x8

    add-int/2addr p1, p2

    add-int/2addr p1, p3

    return p1

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Version components are out of range: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/daaw/oi0;

    invoke-virtual {p0, p1}, Lcom/daaw/oi0;->a(Lcom/daaw/oi0;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/daaw/oi0;

    if-eqz v1, :cond_1

    check-cast p1, Lcom/daaw/oi0;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    const/4 v1, 0x0

    if-nez p1, :cond_2

    return v1

    :cond_2
    iget v2, p0, Lcom/daaw/oi0;->s:I

    iget p1, p1, Lcom/daaw/oi0;->s:I

    if-ne v2, p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/daaw/oi0;->s:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lcom/daaw/oi0;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/daaw/oi0;->q:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/oi0;->r:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
