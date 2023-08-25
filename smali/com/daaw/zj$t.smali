.class public Lcom/daaw/zj$t;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/zj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "t"
.end annotation


# instance fields
.field public a:I

.field public b:Lcom/daaw/zj$s;


# direct methods
.method public constructor <init>(Lcom/daaw/zj$s;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/daaw/zj$t;->a:I

    iput-object p1, p0, Lcom/daaw/zj$t;->b:Lcom/daaw/zj$s;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/zj$t;->b:Lcom/daaw/zj$s;

    invoke-virtual {v0}, Lcom/daaw/zj$s;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/daaw/zj$t;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/daaw/zj$t;->a:I

    check-cast p1, Lcom/daaw/zj$t;

    iget p1, p1, Lcom/daaw/zj$t;->a:I

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

    iget v0, p0, Lcom/daaw/zj$t;->a:I

    return v0
.end method
