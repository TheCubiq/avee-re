.class public final Lcom/daaw/uz$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/uz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/daaw/uz$c;",
        ">;"
    }
.end annotation


# instance fields
.field public final p:Lcom/daaw/fx0;

.field public q:I

.field public r:J

.field public s:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/daaw/fx0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/uz$c;->p:Lcom/daaw/fx0;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/uz$c;)I
    .locals 5

    iget-object v0, p0, Lcom/daaw/uz$c;->s:Ljava/lang/Object;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v4, p1, Lcom/daaw/uz$c;->s:Ljava/lang/Object;

    if-nez v4, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-eq v3, v4, :cond_3

    if-eqz v0, :cond_2

    const/4 v1, -0x1

    :cond_2
    return v1

    :cond_3
    if-nez v0, :cond_4

    return v2

    :cond_4
    iget v0, p0, Lcom/daaw/uz$c;->q:I

    iget v1, p1, Lcom/daaw/uz$c;->q:I

    sub-int/2addr v0, v1

    if-eqz v0, :cond_5

    return v0

    :cond_5
    iget-wide v0, p0, Lcom/daaw/uz$c;->r:J

    iget-wide v2, p1, Lcom/daaw/uz$c;->r:J

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/sq1;->j(JJ)I

    move-result p1

    return p1
.end method

.method public b(IJLjava/lang/Object;)V
    .locals 0

    iput p1, p0, Lcom/daaw/uz$c;->q:I

    iput-wide p2, p0, Lcom/daaw/uz$c;->r:J

    iput-object p4, p0, Lcom/daaw/uz$c;->s:Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/daaw/uz$c;

    invoke-virtual {p0, p1}, Lcom/daaw/uz$c;->a(Lcom/daaw/uz$c;)I

    move-result p1

    return p1
.end method
