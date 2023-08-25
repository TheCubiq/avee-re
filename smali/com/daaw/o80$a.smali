.class public final Lcom/daaw/o80$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/o80;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/daaw/sm1;

.field public b:J

.field public c:Z

.field public d:I

.field public e:J

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:J

.field public l:J

.field public m:Z


# direct methods
.method public constructor <init>(Lcom/daaw/sm1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/o80$a;->a:Lcom/daaw/sm1;

    return-void
.end method


# virtual methods
.method public a(JI)V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/o80$a;->j:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/daaw/o80$a;->g:Z

    if-eqz v0, :cond_0

    iget-boolean p1, p0, Lcom/daaw/o80$a;->c:Z

    iput-boolean p1, p0, Lcom/daaw/o80$a;->m:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/o80$a;->j:Z

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/o80$a;->h:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/daaw/o80$a;->g:Z

    if-eqz v0, :cond_3

    :cond_1
    iget-boolean v0, p0, Lcom/daaw/o80$a;->i:Z

    if-eqz v0, :cond_2

    iget-wide v0, p0, Lcom/daaw/o80$a;->b:J

    sub-long/2addr p1, v0

    long-to-int p2, p1

    add-int/2addr p3, p2

    invoke-virtual {p0, p3}, Lcom/daaw/o80$a;->b(I)V

    :cond_2
    iget-wide p1, p0, Lcom/daaw/o80$a;->b:J

    iput-wide p1, p0, Lcom/daaw/o80$a;->k:J

    iget-wide p1, p0, Lcom/daaw/o80$a;->e:J

    iput-wide p1, p0, Lcom/daaw/o80$a;->l:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/o80$a;->i:Z

    iget-boolean p1, p0, Lcom/daaw/o80$a;->c:Z

    iput-boolean p1, p0, Lcom/daaw/o80$a;->m:Z

    :cond_3
    :goto_0
    return-void
.end method

.method public final b(I)V
    .locals 7

    iget-boolean v3, p0, Lcom/daaw/o80$a;->m:Z

    iget-wide v0, p0, Lcom/daaw/o80$a;->b:J

    iget-wide v4, p0, Lcom/daaw/o80$a;->k:J

    sub-long/2addr v0, v4

    long-to-int v4, v0

    iget-object v0, p0, Lcom/daaw/o80$a;->a:Lcom/daaw/sm1;

    iget-wide v1, p0, Lcom/daaw/o80$a;->l:J

    const/4 v6, 0x0

    move v5, p1

    invoke-interface/range {v0 .. v6}, Lcom/daaw/sm1;->a(JIIILcom/daaw/sm1$a;)V

    return-void
.end method

.method public c([BII)V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/o80$a;->f:Z

    if-eqz v0, :cond_2

    add-int/lit8 v0, p2, 0x2

    iget v1, p0, Lcom/daaw/o80$a;->d:I

    sub-int/2addr v0, v1

    if-ge v0, p3, :cond_1

    aget-byte p1, p1, v0

    and-int/lit16 p1, p1, 0x80

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/daaw/o80$a;->g:Z

    iput-boolean p2, p0, Lcom/daaw/o80$a;->f:Z

    goto :goto_1

    :cond_1
    sub-int/2addr p3, p2

    add-int/2addr v1, p3

    iput v1, p0, Lcom/daaw/o80$a;->d:I

    :cond_2
    :goto_1
    return-void
.end method

.method public d()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/o80$a;->f:Z

    iput-boolean v0, p0, Lcom/daaw/o80$a;->g:Z

    iput-boolean v0, p0, Lcom/daaw/o80$a;->h:Z

    iput-boolean v0, p0, Lcom/daaw/o80$a;->i:Z

    iput-boolean v0, p0, Lcom/daaw/o80$a;->j:Z

    return-void
.end method

.method public e(JIIJ)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/o80$a;->g:Z

    iput-boolean v0, p0, Lcom/daaw/o80$a;->h:Z

    iput-wide p5, p0, Lcom/daaw/o80$a;->e:J

    iput v0, p0, Lcom/daaw/o80$a;->d:I

    iput-wide p1, p0, Lcom/daaw/o80$a;->b:J

    const/4 p1, 0x1

    const/16 p2, 0x20

    if-lt p4, p2, :cond_1

    iget-boolean p2, p0, Lcom/daaw/o80$a;->j:Z

    if-nez p2, :cond_0

    iget-boolean p2, p0, Lcom/daaw/o80$a;->i:Z

    if-eqz p2, :cond_0

    invoke-virtual {p0, p3}, Lcom/daaw/o80$a;->b(I)V

    iput-boolean v0, p0, Lcom/daaw/o80$a;->i:Z

    :cond_0
    const/16 p2, 0x22

    if-gt p4, p2, :cond_1

    iget-boolean p2, p0, Lcom/daaw/o80$a;->j:Z

    xor-int/2addr p2, p1

    iput-boolean p2, p0, Lcom/daaw/o80$a;->h:Z

    iput-boolean p1, p0, Lcom/daaw/o80$a;->j:Z

    :cond_1
    const/16 p2, 0x10

    if-lt p4, p2, :cond_2

    const/16 p2, 0x15

    if-gt p4, p2, :cond_2

    const/4 p2, 0x1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Lcom/daaw/o80$a;->c:Z

    if-nez p2, :cond_3

    const/16 p2, 0x9

    if-gt p4, p2, :cond_4

    :cond_3
    const/4 v0, 0x1

    :cond_4
    iput-boolean v0, p0, Lcom/daaw/o80$a;->f:Z

    return-void
.end method
