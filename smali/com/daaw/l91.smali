.class public Lcom/daaw/l91;
.super Lcom/daaw/m91;
.source ""

# interfaces
.implements Lcom/daaw/ee0;


# instance fields
.field public final e:I

.field public f:Ljava/lang/String;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/m91;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/l91;->f:Ljava/lang/String;

    iput p1, p0, Lcom/daaw/l91;->e:I

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/m91;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/daaw/l91;->e:I

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/l91;->f:Ljava/lang/String;

    return-object v0
.end method

.method public d()Lcom/daaw/sd0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/m91;->c:Lcom/daaw/sd0;

    return-object v0
.end method

.method public isEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/m91;->a:Z

    return v0
.end method
