.class public final Lcom/daaw/ha2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:I

.field public final b:I

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:Lcom/daaw/f92;

.field public final g:I

.field public final h:[J

.field public final i:[J

.field public final j:I

.field public final k:[Lcom/daaw/ia2;


# direct methods
.method public constructor <init>(IIJJJLcom/daaw/f92;I[Lcom/daaw/ia2;I[J[J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/ha2;->a:I

    iput p2, p0, Lcom/daaw/ha2;->b:I

    iput-wide p3, p0, Lcom/daaw/ha2;->c:J

    iput-wide p5, p0, Lcom/daaw/ha2;->d:J

    iput-wide p7, p0, Lcom/daaw/ha2;->e:J

    iput-object p9, p0, Lcom/daaw/ha2;->f:Lcom/daaw/f92;

    iput p10, p0, Lcom/daaw/ha2;->g:I

    iput-object p11, p0, Lcom/daaw/ha2;->k:[Lcom/daaw/ia2;

    iput p12, p0, Lcom/daaw/ha2;->j:I

    iput-object p13, p0, Lcom/daaw/ha2;->h:[J

    iput-object p14, p0, Lcom/daaw/ha2;->i:[J

    return-void
.end method


# virtual methods
.method public final a(I)Lcom/daaw/ia2;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ha2;->k:[Lcom/daaw/ia2;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    aget-object p1, v0, p1

    return-object p1
.end method
