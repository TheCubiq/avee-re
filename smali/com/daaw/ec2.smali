.class public final Lcom/daaw/ec2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/m42;

.field public b:Z

.field public c:Z

.field public d:Z

.field public e:I

.field public f:I

.field public g:J

.field public h:J


# direct methods
.method public constructor <init>(Lcom/daaw/m42;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ec2;->a:Lcom/daaw/m42;

    return-void
.end method


# virtual methods
.method public final a([BII)V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/ec2;->c:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/daaw/ec2;->f:I

    add-int/lit8 v1, p2, 0x1

    sub-int/2addr v1, v0

    if-ge v1, p3, :cond_1

    aget-byte p1, p1, v1

    and-int/lit16 p1, p1, 0xc0

    shr-int/lit8 p1, p1, 0x6

    const/4 p2, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/daaw/ec2;->d:Z

    iput-boolean p2, p0, Lcom/daaw/ec2;->c:Z

    return-void

    :cond_1
    sub-int/2addr p3, p2

    add-int/2addr v0, p3

    iput v0, p0, Lcom/daaw/ec2;->f:I

    :cond_2
    return-void
.end method

.method public final b(JIZ)V
    .locals 7

    iget v0, p0, Lcom/daaw/ec2;->e:I

    const/16 v1, 0xb6

    if-ne v0, v1, :cond_0

    if-eqz p4, :cond_0

    iget-boolean p4, p0, Lcom/daaw/ec2;->b:Z

    if-eqz p4, :cond_0

    iget-wide v1, p0, Lcom/daaw/ec2;->h:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p4, v1, v3

    if-eqz p4, :cond_0

    iget-wide v3, p0, Lcom/daaw/ec2;->g:J

    iget-boolean p4, p0, Lcom/daaw/ec2;->d:Z

    iget-object v0, p0, Lcom/daaw/ec2;->a:Lcom/daaw/m42;

    sub-long v3, p1, v3

    long-to-int v4, v3

    const/4 v6, 0x0

    move v3, p4

    move v5, p3

    invoke-interface/range {v0 .. v6}, Lcom/daaw/m42;->b(JIIILcom/daaw/l42;)V

    :cond_0
    iget p3, p0, Lcom/daaw/ec2;->e:I

    const/16 p4, 0xb3

    if-eq p3, p4, :cond_1

    iput-wide p1, p0, Lcom/daaw/ec2;->g:J

    :cond_1
    return-void
.end method

.method public final c(IJ)V
    .locals 4

    iput p1, p0, Lcom/daaw/ec2;->e:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/ec2;->d:Z

    const/16 v1, 0xb3

    const/16 v2, 0xb6

    const/4 v3, 0x1

    if-eq p1, v2, :cond_1

    if-ne p1, v1, :cond_0

    const/16 p1, 0xb3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    iput-boolean v1, p0, Lcom/daaw/ec2;->b:Z

    if-ne p1, v2, :cond_2

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    iput-boolean v3, p0, Lcom/daaw/ec2;->c:Z

    iput v0, p0, Lcom/daaw/ec2;->f:I

    iput-wide p2, p0, Lcom/daaw/ec2;->h:J

    return-void
.end method

.method public final d()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/ec2;->b:Z

    iput-boolean v0, p0, Lcom/daaw/ec2;->c:Z

    iput-boolean v0, p0, Lcom/daaw/ec2;->d:Z

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/ec2;->e:I

    return-void
.end method
