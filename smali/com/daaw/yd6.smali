.class public final Lcom/daaw/yd6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/m36;


# instance fields
.field public final a:Lcom/daaw/kt6;

.field public b:Lcom/daaw/qz6;

.field public c:Ljava/lang/String;

.field public d:I

.field public e:I

.field public f:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/kt6;

    invoke-direct {v0}, Lcom/daaw/kt6;-><init>()V

    iput-object v0, p0, Lcom/daaw/yd6;->a:Lcom/daaw/kt6;

    const/16 v0, 0x1f40

    iput v0, p0, Lcom/daaw/yd6;->d:I

    iput v0, p0, Lcom/daaw/yd6;->e:I

    return-void
.end method


# virtual methods
.method public final a(Z)Lcom/daaw/yd6;
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/yd6;->f:Z

    return-object p0
.end method

.method public final b(I)Lcom/daaw/yd6;
    .locals 0

    iput p1, p0, Lcom/daaw/yd6;->d:I

    return-object p0
.end method

.method public final c(I)Lcom/daaw/yd6;
    .locals 0

    iput p1, p0, Lcom/daaw/yd6;->e:I

    return-object p0
.end method

.method public final d(Lcom/daaw/qz6;)Lcom/daaw/yd6;
    .locals 0

    iput-object p1, p0, Lcom/daaw/yd6;->b:Lcom/daaw/qz6;

    return-object p0
.end method

.method public final e(Ljava/lang/String;)Lcom/daaw/yd6;
    .locals 0

    iput-object p1, p0, Lcom/daaw/yd6;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final f()Lcom/daaw/mj6;
    .locals 10

    new-instance v9, Lcom/daaw/mj6;

    iget-object v1, p0, Lcom/daaw/yd6;->c:Ljava/lang/String;

    iget v2, p0, Lcom/daaw/yd6;->d:I

    iget v3, p0, Lcom/daaw/yd6;->e:I

    iget-boolean v4, p0, Lcom/daaw/yd6;->f:Z

    iget-object v5, p0, Lcom/daaw/yd6;->a:Lcom/daaw/kt6;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/daaw/mj6;-><init>(Ljava/lang/String;IIZLcom/daaw/kt6;Lcom/daaw/ty6;ZLcom/daaw/ki6;)V

    iget-object v0, p0, Lcom/daaw/yd6;->b:Lcom/daaw/qz6;

    if-eqz v0, :cond_0

    invoke-virtual {v9, v0}, Lcom/daaw/sx5;->d(Lcom/daaw/qz6;)V

    :cond_0
    return-object v9
.end method

.method public final bridge synthetic zza()Lcom/daaw/p46;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/yd6;->f()Lcom/daaw/mj6;

    move-result-object v0

    return-object v0
.end method
