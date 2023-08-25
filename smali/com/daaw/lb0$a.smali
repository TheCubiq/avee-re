.class public final Lcom/daaw/lb0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/lb0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field public final p:Ljava/lang/String;

.field public final q:Lcom/daaw/lb0$a;

.field public final r:J

.field public final s:I

.field public final t:J

.field public final u:Ljava/lang/String;

.field public final v:Ljava/lang/String;

.field public final w:J

.field public final x:J

.field public final y:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;JJ)V
    .locals 15

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, -0x1

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v14, 0x0

    move-object v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v10, p2

    move-wide/from16 v12, p4

    invoke-direct/range {v0 .. v14}, Lcom/daaw/lb0$a;-><init>(Ljava/lang/String;Lcom/daaw/lb0$a;JIJLjava/lang/String;Ljava/lang/String;JJZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/daaw/lb0$a;JIJLjava/lang/String;Ljava/lang/String;JJZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/lb0$a;->p:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/lb0$a;->q:Lcom/daaw/lb0$a;

    iput-wide p3, p0, Lcom/daaw/lb0$a;->r:J

    iput p5, p0, Lcom/daaw/lb0$a;->s:I

    iput-wide p6, p0, Lcom/daaw/lb0$a;->t:J

    iput-object p8, p0, Lcom/daaw/lb0$a;->u:Ljava/lang/String;

    iput-object p9, p0, Lcom/daaw/lb0$a;->v:Ljava/lang/String;

    iput-wide p10, p0, Lcom/daaw/lb0$a;->w:J

    iput-wide p12, p0, Lcom/daaw/lb0$a;->x:J

    iput-boolean p14, p0, Lcom/daaw/lb0$a;->y:Z

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Long;)I
    .locals 5

    iget-wide v0, p0, Lcom/daaw/lb0$a;->t:J

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lcom/daaw/lb0$a;->t:J

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-gez p1, :cond_1

    const/4 p1, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lcom/daaw/lb0$a;->a(Ljava/lang/Long;)I

    move-result p1

    return p1
.end method
