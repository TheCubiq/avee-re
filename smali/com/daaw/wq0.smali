.class public final Lcom/daaw/wq0;
.super Lcom/daaw/jd1;
.source ""


# static fields
.field public static final q:I

.field public static final r:I

.field public static final s:I


# instance fields
.field public final o:Lcom/daaw/rv0;

.field public final p:Lcom/daaw/bx1$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "payl"

    invoke-static {v0}, Lcom/daaw/sq1;->v(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/wq0;->q:I

    const-string v0, "sttg"

    invoke-static {v0}, Lcom/daaw/sq1;->v(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/wq0;->r:I

    const-string v0, "vttc"

    invoke-static {v0}, Lcom/daaw/sq1;->v(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/wq0;->s:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const-string v0, "Mp4WebvttDecoder"

    invoke-direct {p0, v0}, Lcom/daaw/jd1;-><init>(Ljava/lang/String;)V

    new-instance v0, Lcom/daaw/rv0;

    invoke-direct {v0}, Lcom/daaw/rv0;-><init>()V

    iput-object v0, p0, Lcom/daaw/wq0;->o:Lcom/daaw/rv0;

    new-instance v0, Lcom/daaw/bx1$b;

    invoke-direct {v0}, Lcom/daaw/bx1$b;-><init>()V

    iput-object v0, p0, Lcom/daaw/wq0;->p:Lcom/daaw/bx1$b;

    return-void
.end method

.method public static D(Lcom/daaw/rv0;Lcom/daaw/bx1$b;I)Lcom/daaw/ln;
    .locals 4

    invoke-virtual {p1}, Lcom/daaw/bx1$b;->c()V

    :cond_0
    :goto_0
    if-lez p2, :cond_3

    const/16 v0, 0x8

    if-lt p2, v0, :cond_2

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v1

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v2

    add-int/lit8 p2, p2, -0x8

    sub-int/2addr v1, v0

    iget-object v0, p0, Lcom/daaw/rv0;->a:[B

    invoke-virtual {p0}, Lcom/daaw/rv0;->c()I

    move-result v3

    invoke-static {v0, v3, v1}, Lcom/daaw/sq1;->q([BII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1}, Lcom/daaw/rv0;->K(I)V

    sub-int/2addr p2, v1

    sget v1, Lcom/daaw/wq0;->r:I

    if-ne v2, v1, :cond_1

    invoke-static {v0, p1}, Lcom/daaw/cx1;->j(Ljava/lang/String;Lcom/daaw/bx1$b;)V

    goto :goto_0

    :cond_1
    sget v1, Lcom/daaw/wq0;->q:I

    if-ne v2, v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-static {v1, v0, p1, v2}, Lcom/daaw/cx1;->k(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/bx1$b;Ljava/util/List;)V

    goto :goto_0

    :cond_2
    new-instance p0, Lcom/daaw/vh1;

    const-string p1, "Incomplete vtt cue box header found."

    invoke-direct {p0, p1}, Lcom/daaw/vh1;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    invoke-virtual {p1}, Lcom/daaw/bx1$b;->a()Lcom/daaw/bx1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public C([BIZ)Lcom/daaw/xq0;
    .locals 1

    iget-object p3, p0, Lcom/daaw/wq0;->o:Lcom/daaw/rv0;

    invoke-virtual {p3, p1, p2}, Lcom/daaw/rv0;->H([BI)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    iget-object p2, p0, Lcom/daaw/wq0;->o:Lcom/daaw/rv0;

    invoke-virtual {p2}, Lcom/daaw/rv0;->a()I

    move-result p2

    if-lez p2, :cond_2

    iget-object p2, p0, Lcom/daaw/wq0;->o:Lcom/daaw/rv0;

    invoke-virtual {p2}, Lcom/daaw/rv0;->a()I

    move-result p2

    const/16 p3, 0x8

    if-lt p2, p3, :cond_1

    iget-object p2, p0, Lcom/daaw/wq0;->o:Lcom/daaw/rv0;

    invoke-virtual {p2}, Lcom/daaw/rv0;->i()I

    move-result p2

    iget-object p3, p0, Lcom/daaw/wq0;->o:Lcom/daaw/rv0;

    invoke-virtual {p3}, Lcom/daaw/rv0;->i()I

    move-result p3

    sget v0, Lcom/daaw/wq0;->s:I

    if-ne p3, v0, :cond_0

    iget-object p3, p0, Lcom/daaw/wq0;->o:Lcom/daaw/rv0;

    iget-object v0, p0, Lcom/daaw/wq0;->p:Lcom/daaw/bx1$b;

    add-int/lit8 p2, p2, -0x8

    invoke-static {p3, v0, p2}, Lcom/daaw/wq0;->D(Lcom/daaw/rv0;Lcom/daaw/bx1$b;I)Lcom/daaw/ln;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lcom/daaw/wq0;->o:Lcom/daaw/rv0;

    add-int/lit8 p2, p2, -0x8

    invoke-virtual {p3, p2}, Lcom/daaw/rv0;->K(I)V

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/daaw/vh1;

    const-string p2, "Incomplete Mp4Webvtt Top Level box header found."

    invoke-direct {p1, p2}, Lcom/daaw/vh1;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p2, Lcom/daaw/xq0;

    invoke-direct {p2, p1}, Lcom/daaw/xq0;-><init>(Ljava/util/List;)V

    return-object p2
.end method

.method public bridge synthetic z([BIZ)Lcom/daaw/th1;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/wq0;->C([BIZ)Lcom/daaw/xq0;

    move-result-object p1

    return-object p1
.end method
