.class public Lcom/daaw/j41$b;
.super Lcom/daaw/j41;
.source ""

# interfaces
.implements Lcom/daaw/bp;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/j41;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final h:Lcom/daaw/ka1$a;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLcom/google/android/exoplayer2/Format;Ljava/lang/String;Lcom/daaw/ka1$a;Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Lcom/google/android/exoplayer2/Format;",
            "Ljava/lang/String;",
            "Lcom/daaw/ka1$a;",
            "Ljava/util/List<",
            "Lcom/daaw/jt;",
            ">;)V"
        }
    .end annotation

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lcom/daaw/j41;-><init>(Ljava/lang/String;JLcom/google/android/exoplayer2/Format;Ljava/lang/String;Lcom/daaw/ka1;Ljava/util/List;Lcom/daaw/j41$a;)V

    move-object v1, p6

    iput-object v1, v0, Lcom/daaw/j41$b;->h:Lcom/daaw/ka1$a;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public b(J)J
    .locals 1

    iget-object v0, p0, Lcom/daaw/j41$b;->h:Lcom/daaw/ka1$a;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/ka1$a;->g(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public c(JJ)J
    .locals 1

    iget-object v0, p0, Lcom/daaw/j41$b;->h:Lcom/daaw/ka1$a;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/daaw/ka1$a;->e(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public d(J)Lcom/daaw/d31;
    .locals 1

    iget-object v0, p0, Lcom/daaw/j41$b;->h:Lcom/daaw/ka1$a;

    invoke-virtual {v0, p0, p1, p2}, Lcom/daaw/ka1$a;->h(Lcom/daaw/j41;J)Lcom/daaw/d31;

    move-result-object p1

    return-object p1
.end method

.method public e(JJ)J
    .locals 1

    iget-object v0, p0, Lcom/daaw/j41$b;->h:Lcom/daaw/ka1$a;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/daaw/ka1$a;->f(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/j41$b;->h:Lcom/daaw/ka1$a;

    invoke-virtual {v0}, Lcom/daaw/ka1$a;->i()Z

    move-result v0

    return v0
.end method

.method public g()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/j41$b;->h:Lcom/daaw/ka1$a;

    invoke-virtual {v0}, Lcom/daaw/ka1$a;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public h(J)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/j41$b;->h:Lcom/daaw/ka1$a;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/ka1$a;->d(J)I

    move-result p1

    return p1
.end method

.method public i()Lcom/daaw/bp;
    .locals 0

    return-object p0
.end method

.method public j()Lcom/daaw/d31;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
