.class public Lcom/daaw/sc1;
.super Lcom/daaw/pf1;
.source ""


# instance fields
.field public final e:[Ljava/lang/String;

.field public final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/daaw/pf1;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    if-eqz p5, :cond_0

    goto :goto_0

    :cond_0
    const-string p5, ""

    :goto_0
    iput-object p5, p0, Lcom/daaw/sc1;->f:Ljava/lang/String;

    iput-object p6, p0, Lcom/daaw/sc1;->e:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/pf1;->d:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/sc1;->f:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/daaw/sc1;->e:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/pf1;->b:Ljava/lang/String;

    return-object v0
.end method
