.class public final Lcom/daaw/cp;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/bp;


# instance fields
.field public final a:Lcom/daaw/hf;

.field public final b:J


# direct methods
.method public constructor <init>(Lcom/daaw/hf;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/cp;->a:Lcom/daaw/hf;

    iput-wide p2, p0, Lcom/daaw/cp;->b:J

    return-void
.end method


# virtual methods
.method public b(J)J
    .locals 2

    iget-object v0, p0, Lcom/daaw/cp;->a:Lcom/daaw/hf;

    iget-object v0, v0, Lcom/daaw/hf;->e:[J

    long-to-int p2, p1

    aget-wide p1, v0, p2

    iget-wide v0, p0, Lcom/daaw/cp;->b:J

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method public c(JJ)J
    .locals 0

    iget-object p3, p0, Lcom/daaw/cp;->a:Lcom/daaw/hf;

    iget-object p3, p3, Lcom/daaw/hf;->d:[J

    long-to-int p2, p1

    aget-wide p1, p3, p2

    return-wide p1
.end method

.method public d(J)Lcom/daaw/d31;
    .locals 7

    new-instance v6, Lcom/daaw/d31;

    iget-object v0, p0, Lcom/daaw/cp;->a:Lcom/daaw/hf;

    iget-object v1, v0, Lcom/daaw/hf;->c:[J

    long-to-int p2, p1

    aget-wide v2, v1, p2

    iget-object p1, v0, Lcom/daaw/hf;->b:[I

    aget p1, p1, p2

    int-to-long v4, p1

    const/4 v1, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/daaw/d31;-><init>(Ljava/lang/String;JJ)V

    return-object v6
.end method

.method public e(JJ)J
    .locals 2

    iget-object p3, p0, Lcom/daaw/cp;->a:Lcom/daaw/hf;

    iget-wide v0, p0, Lcom/daaw/cp;->b:J

    add-long/2addr p1, v0

    invoke-virtual {p3, p1, p2}, Lcom/daaw/hf;->a(J)I

    move-result p1

    int-to-long p1, p1

    return-wide p1
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public g()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public h(J)I
    .locals 0

    iget-object p1, p0, Lcom/daaw/cp;->a:Lcom/daaw/hf;

    iget p1, p1, Lcom/daaw/hf;->a:I

    return p1
.end method
