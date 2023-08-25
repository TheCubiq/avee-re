.class public final Lcom/daaw/un0$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/un0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public final a:[B

.field public b:Z

.field public c:I

.field public d:I

.field public e:J

.field public f:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xa

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/daaw/un0$d;->a:[B

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/un0$c;)V
    .locals 8

    iget-boolean v0, p0, Lcom/daaw/un0$d;->b:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/daaw/un0$d;->c:I

    if-lez v0, :cond_0

    iget-object v1, p1, Lcom/daaw/un0$c;->P:Lcom/daaw/sm1;

    iget-wide v2, p0, Lcom/daaw/un0$d;->e:J

    iget v4, p0, Lcom/daaw/un0$d;->f:I

    iget v5, p0, Lcom/daaw/un0$d;->d:I

    const/4 v6, 0x0

    iget-object v7, p1, Lcom/daaw/un0$c;->g:Lcom/daaw/sm1$a;

    invoke-interface/range {v1 .. v7}, Lcom/daaw/sm1;->a(JIIILcom/daaw/sm1$a;)V

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/un0$d;->c:I

    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/un0$d;->b:Z

    return-void
.end method

.method public c(Lcom/daaw/un0$c;J)V
    .locals 9

    iget-boolean v0, p0, Lcom/daaw/un0$d;->b:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lcom/daaw/un0$d;->c:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/daaw/un0$d;->c:I

    if-nez v0, :cond_1

    iput-wide p2, p0, Lcom/daaw/un0$d;->e:J

    :cond_1
    const/16 p2, 0x10

    if-ge v1, p2, :cond_2

    return-void

    :cond_2
    iget-object v2, p1, Lcom/daaw/un0$c;->P:Lcom/daaw/sm1;

    iget-wide v3, p0, Lcom/daaw/un0$d;->e:J

    iget v5, p0, Lcom/daaw/un0$d;->f:I

    iget v6, p0, Lcom/daaw/un0$d;->d:I

    const/4 v7, 0x0

    iget-object v8, p1, Lcom/daaw/un0$c;->g:Lcom/daaw/sm1$a;

    invoke-interface/range {v2 .. v8}, Lcom/daaw/sm1;->a(JIIILcom/daaw/sm1$a;)V

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/un0$d;->c:I

    return-void
.end method

.method public d(Lcom/daaw/a00;II)V
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/un0$d;->b:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/un0$d;->a:[B

    const/16 v2, 0xa

    invoke-interface {p1, v0, v1, v2}, Lcom/daaw/a00;->k([BII)V

    invoke-interface {p1}, Lcom/daaw/a00;->i()V

    iget-object p1, p0, Lcom/daaw/un0$d;->a:[B

    invoke-static {p1}, Lcom/daaw/u;->j([B)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/un0$d;->b:Z

    iput v1, p0, Lcom/daaw/un0$d;->c:I

    :cond_1
    iget p1, p0, Lcom/daaw/un0$d;->c:I

    if-nez p1, :cond_2

    iput p2, p0, Lcom/daaw/un0$d;->f:I

    iput v1, p0, Lcom/daaw/un0$d;->d:I

    :cond_2
    iget p1, p0, Lcom/daaw/un0$d;->d:I

    add-int/2addr p1, p3

    iput p1, p0, Lcom/daaw/un0$d;->d:I

    return-void
.end method
