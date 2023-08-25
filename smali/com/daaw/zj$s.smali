.class public Lcom/daaw/zj$s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/zj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "s"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/daaw/zj$s;",
        ">;"
    }
.end annotation


# instance fields
.field public p:I

.field public final q:Lcom/daaw/tx0;

.field public final r:Z

.field public final s:Ljava/lang/String;

.field public final t:J

.field public final u:Ljava/lang/String;

.field public final v:J


# direct methods
.method public constructor <init>(ZLjava/lang/String;JLjava/lang/String;J)V
    .locals 9

    const/4 v8, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-wide v3, p3

    move-object v5, p5

    move-wide v6, p6

    invoke-direct/range {v0 .. v8}, Lcom/daaw/zj$s;-><init>(ZLjava/lang/String;JLjava/lang/String;JLcom/daaw/tx0;)V

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;JLjava/lang/String;JLcom/daaw/tx0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/zj$s;->p:I

    iput-boolean p1, p0, Lcom/daaw/zj$s;->r:Z

    iput-object p2, p0, Lcom/daaw/zj$s;->s:Ljava/lang/String;

    iput-wide p3, p0, Lcom/daaw/zj$s;->t:J

    iput-object p5, p0, Lcom/daaw/zj$s;->u:Ljava/lang/String;

    iput-wide p6, p0, Lcom/daaw/zj$s;->v:J

    iput-object p8, p0, Lcom/daaw/zj$s;->q:Lcom/daaw/tx0;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/zj$s;)I
    .locals 0

    iget p0, p0, Lcom/daaw/zj$s;->p:I

    return p0
.end method

.method public static synthetic b(Lcom/daaw/zj$s;I)I
    .locals 0

    iput p1, p0, Lcom/daaw/zj$s;->p:I

    return p1
.end method


# virtual methods
.method public c(Lcom/daaw/zj$s;)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/zj$s;->s:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/zj$s;->f()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/daaw/zj$s;

    invoke-virtual {p0, p1}, Lcom/daaw/zj$s;->c(Lcom/daaw/zj$s;)I

    move-result p1

    return p1
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/zj$s;->t:J

    return-wide v0
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/zj$s;->v:J

    return-wide v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/zj$s;->s:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/zj$s;->u:Ljava/lang/String;

    return-object v0
.end method

.method public h()Lcom/daaw/tx0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/zj$s;->q:Lcom/daaw/tx0;

    return-object v0
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/zj$s;->r:Z

    return v0
.end method

.method public j(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/zj$s;->p:I

    return-void
.end method
