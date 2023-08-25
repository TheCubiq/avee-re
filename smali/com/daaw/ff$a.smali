.class public final Lcom/daaw/ff$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sm1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ff;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Lcom/google/android/exoplayer2/Format;

.field public d:Lcom/google/android/exoplayer2/Format;

.field public e:Lcom/daaw/sm1;


# direct methods
.method public constructor <init>(IILcom/google/android/exoplayer2/Format;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/ff$a;->a:I

    iput p2, p0, Lcom/daaw/ff$a;->b:I

    iput-object p3, p0, Lcom/daaw/ff$a;->c:Lcom/google/android/exoplayer2/Format;

    return-void
.end method


# virtual methods
.method public a(JIIILcom/daaw/sm1$a;)V
    .locals 7

    iget-object v0, p0, Lcom/daaw/ff$a;->e:Lcom/daaw/sm1;

    move-wide v1, p1

    move v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lcom/daaw/sm1;->a(JIIILcom/daaw/sm1$a;)V

    return-void
.end method

.method public b(Lcom/daaw/a00;IZ)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ff$a;->e:Lcom/daaw/sm1;

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/sm1;->b(Lcom/daaw/a00;IZ)I

    move-result p1

    return p1
.end method

.method public c(Lcom/daaw/rv0;I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ff$a;->e:Lcom/daaw/sm1;

    invoke-interface {v0, p1, p2}, Lcom/daaw/sm1;->c(Lcom/daaw/rv0;I)V

    return-void
.end method

.method public d(Lcom/google/android/exoplayer2/Format;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ff$a;->c:Lcom/google/android/exoplayer2/Format;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/Format;->g(Lcom/google/android/exoplayer2/Format;)Lcom/google/android/exoplayer2/Format;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lcom/daaw/ff$a;->d:Lcom/google/android/exoplayer2/Format;

    iget-object v0, p0, Lcom/daaw/ff$a;->e:Lcom/daaw/sm1;

    invoke-interface {v0, p1}, Lcom/daaw/sm1;->d(Lcom/google/android/exoplayer2/Format;)V

    return-void
.end method

.method public e(Lcom/daaw/ff$b;)V
    .locals 2

    if-nez p1, :cond_0

    new-instance p1, Lcom/daaw/ev;

    invoke-direct {p1}, Lcom/daaw/ev;-><init>()V

    iput-object p1, p0, Lcom/daaw/ff$a;->e:Lcom/daaw/sm1;

    return-void

    :cond_0
    iget v0, p0, Lcom/daaw/ff$a;->a:I

    iget v1, p0, Lcom/daaw/ff$a;->b:I

    invoke-interface {p1, v0, v1}, Lcom/daaw/ff$b;->a(II)Lcom/daaw/sm1;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ff$a;->e:Lcom/daaw/sm1;

    iget-object v0, p0, Lcom/daaw/ff$a;->d:Lcom/google/android/exoplayer2/Format;

    if-eqz v0, :cond_1

    invoke-interface {p1, v0}, Lcom/daaw/sm1;->d(Lcom/google/android/exoplayer2/Format;)V

    :cond_1
    return-void
.end method
