.class public abstract Lcom/daaw/ef;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jk0$c;


# instance fields
.field public final a:Lcom/daaw/pp;

.field public final b:I

.field public final c:Lcom/google/android/exoplayer2/Format;

.field public final d:I

.field public final e:Ljava/lang/Object;

.field public final f:J

.field public final g:J

.field public final h:Lcom/daaw/mp;


# direct methods
.method public constructor <init>(Lcom/daaw/mp;Lcom/daaw/pp;ILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/mp;

    iput-object p1, p0, Lcom/daaw/ef;->h:Lcom/daaw/mp;

    invoke-static {p2}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/pp;

    iput-object p1, p0, Lcom/daaw/ef;->a:Lcom/daaw/pp;

    iput p3, p0, Lcom/daaw/ef;->b:I

    iput-object p4, p0, Lcom/daaw/ef;->c:Lcom/google/android/exoplayer2/Format;

    iput p5, p0, Lcom/daaw/ef;->d:I

    iput-object p6, p0, Lcom/daaw/ef;->e:Ljava/lang/Object;

    iput-wide p7, p0, Lcom/daaw/ef;->f:J

    iput-wide p9, p0, Lcom/daaw/ef;->g:J

    return-void
.end method


# virtual methods
.method public abstract c()J
.end method

.method public final d()J
    .locals 4

    iget-wide v0, p0, Lcom/daaw/ef;->g:J

    iget-wide v2, p0, Lcom/daaw/ef;->f:J

    sub-long/2addr v0, v2

    return-wide v0
.end method
