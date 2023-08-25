.class public Lcom/daaw/ho$i;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ho;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "i"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:Lcom/daaw/rn;

.field public d:Lcom/daaw/un;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/daaw/rn;IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ho$i;->a:Ljava/lang/String;

    iput p3, p0, Lcom/daaw/ho$i;->b:I

    iput-object p2, p0, Lcom/daaw/ho$i;->c:Lcom/daaw/rn;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/daaw/un;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ho$i;->a:Ljava/lang/String;

    iput p3, p0, Lcom/daaw/ho$i;->b:I

    iput-object p2, p0, Lcom/daaw/ho$i;->d:Lcom/daaw/un;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/rn;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ho$i;->c:Lcom/daaw/rn;

    return-object v0
.end method

.method public b()Lcom/daaw/un;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ho$i;->d:Lcom/daaw/un;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ho$i;->d:Lcom/daaw/un;

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/un;->A()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/ho$i;->c:Lcom/daaw/rn;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
