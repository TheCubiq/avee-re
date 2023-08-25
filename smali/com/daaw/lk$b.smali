.class public Lcom/daaw/lk$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/lk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:I

.field public b:Lcom/daaw/sc1;


# direct methods
.method public constructor <init>(Lcom/daaw/sc1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/daaw/lk$b;->a:I

    iput-object p1, p0, Lcom/daaw/lk$b;->b:Lcom/daaw/sc1;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/daaw/lk$b;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/daaw/lk$b;->a:I

    check-cast p1, Lcom/daaw/lk$b;

    iget p1, p1, Lcom/daaw/lk$b;->a:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/daaw/lk$b;->a:I

    return v0
.end method
