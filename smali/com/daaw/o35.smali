.class public Lcom/daaw/o35;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/th6;


# direct methods
.method public constructor <init>(Lcom/daaw/th6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/o35;->a:Lcom/daaw/th6;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/ui6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/o35;->a:Lcom/daaw/th6;

    iget-object v0, v0, Lcom/daaw/th6;->W:Lcom/daaw/ui6;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public c()Lorg/json/JSONObject;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/o35;->a:Lcom/daaw/th6;

    iget-boolean v0, v0, Lcom/daaw/th6;->U:Z

    return v0
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/o35;->a:Lcom/daaw/th6;

    iget-boolean v0, v0, Lcom/daaw/th6;->L:Z

    return v0
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/o35;->a:Lcom/daaw/th6;

    iget-boolean v0, v0, Lcom/daaw/th6;->K:Z

    return v0
.end method

.method public g()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
