.class public final Lcom/daaw/xt8;
.super Lcom/daaw/l64;
.source ""


# static fields
.field public static final h:Ljava/lang/Object;

.field public static final i:Lcom/daaw/f53;


# instance fields
.field public final c:J

.field public final d:J

.field public final e:Z

.field public final f:Lcom/daaw/f53;

.field public final g:Lcom/daaw/ht2;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/xt8;->h:Ljava/lang/Object;

    new-instance v0, Lcom/daaw/ee2;

    invoke-direct {v0}, Lcom/daaw/ee2;-><init>()V

    const-string v1, "SinglePeriodTimeline"

    invoke-virtual {v0, v1}, Lcom/daaw/ee2;->a(Ljava/lang/String;)Lcom/daaw/ee2;

    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Lcom/daaw/ee2;->b(Landroid/net/Uri;)Lcom/daaw/ee2;

    invoke-virtual {v0}, Lcom/daaw/ee2;->c()Lcom/daaw/f53;

    move-result-object v0

    sput-object v0, Lcom/daaw/xt8;->i:Lcom/daaw/f53;

    return-void
.end method

.method public constructor <init>(JJJJJJJZZZLjava/lang/Object;Lcom/daaw/f53;Lcom/daaw/ht2;)V
    .locals 3

    move-object v0, p0

    invoke-direct {p0}, Lcom/daaw/l64;-><init>()V

    move-wide v1, p7

    iput-wide v1, v0, Lcom/daaw/xt8;->c:J

    move-wide v1, p9

    iput-wide v1, v0, Lcom/daaw/xt8;->d:J

    move/from16 v1, p15

    iput-boolean v1, v0, Lcom/daaw/xt8;->e:Z

    move-object/from16 v1, p19

    iput-object v1, v0, Lcom/daaw/xt8;->f:Lcom/daaw/f53;

    move-object/from16 v1, p20

    iput-object v1, v0, Lcom/daaw/xt8;->g:Lcom/daaw/ht2;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)I
    .locals 1

    sget-object v0, Lcom/daaw/xt8;->h:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final b()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final c()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final d(ILcom/daaw/d34;Z)Lcom/daaw/d34;
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lcom/daaw/uo4;->a(III)I

    if-eqz p3, :cond_0

    sget-object p1, Lcom/daaw/xt8;->h:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    move-object v2, p1

    const/4 v1, 0x0

    const/4 v3, 0x0

    iget-wide v4, p0, Lcom/daaw/xt8;->c:J

    const-wide/16 v6, 0x0

    sget-object v8, Lcom/daaw/fl4;->d:Lcom/daaw/fl4;

    const/4 v9, 0x0

    move-object v0, p2

    invoke-virtual/range {v0 .. v9}, Lcom/daaw/d34;->k(Ljava/lang/Object;Ljava/lang/Object;IJJLcom/daaw/fl4;Z)Lcom/daaw/d34;

    return-object p2
.end method

.method public final e(ILcom/daaw/i54;J)Lcom/daaw/i54;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x1

    move/from16 v4, p1

    invoke-static {v4, v2, v3}, Lcom/daaw/uo4;->a(III)I

    sget-object v2, Lcom/daaw/i54;->o:Ljava/lang/Object;

    iget-object v3, v0, Lcom/daaw/xt8;->f:Lcom/daaw/f53;

    iget-boolean v11, v0, Lcom/daaw/xt8;->e:Z

    iget-object v13, v0, Lcom/daaw/xt8;->g:Lcom/daaw/ht2;

    iget-wide v4, v0, Lcom/daaw/xt8;->d:J

    move-wide/from16 v16, v4

    const/4 v4, 0x0

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    invoke-virtual/range {v1 .. v21}, Lcom/daaw/i54;->a(Ljava/lang/Object;Lcom/daaw/f53;Ljava/lang/Object;JJJZZLcom/daaw/ht2;JJIIJ)Lcom/daaw/i54;

    return-object p2
.end method

.method public final f(I)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lcom/daaw/uo4;->a(III)I

    sget-object p1, Lcom/daaw/xt8;->h:Ljava/lang/Object;

    return-object p1
.end method
