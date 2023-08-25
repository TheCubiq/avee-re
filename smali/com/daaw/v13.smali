.class public final Lcom/daaw/v13;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method public constructor <init>(Lcom/daaw/a23;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    check-cast p1, Lcom/daaw/e23;

    check-cast p2, Lcom/daaw/e23;

    iget v0, p1, Lcom/daaw/e23;->c:I

    iget v1, p2, Lcom/daaw/e23;->c:I

    sub-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v0

    :cond_0
    iget-wide v0, p1, Lcom/daaw/e23;->a:J

    iget-wide p1, p2, Lcom/daaw/e23;->a:J

    cmp-long v2, v0, p1

    return v2
.end method
