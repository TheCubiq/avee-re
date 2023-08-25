.class public final Lcom/daaw/hr;
.super Lcom/daaw/tb0$a;
.source ""


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:Lcom/daaw/bn1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/bn1<",
            "-",
            "Lcom/daaw/mp;",
            ">;"
        }
    .end annotation
.end field

.field public final d:I

.field public final e:I

.field public final f:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/daaw/bn1;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/daaw/bn1<",
            "-",
            "Lcom/daaw/mp;",
            ">;)V"
        }
    .end annotation

    const/16 v3, 0x1f40

    const/16 v4, 0x1f40

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/daaw/hr;-><init>(Ljava/lang/String;Lcom/daaw/bn1;IIZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/daaw/bn1;IIZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/daaw/bn1<",
            "-",
            "Lcom/daaw/mp;",
            ">;IIZ)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/daaw/tb0$a;-><init>()V

    iput-object p1, p0, Lcom/daaw/hr;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/hr;->c:Lcom/daaw/bn1;

    iput p3, p0, Lcom/daaw/hr;->d:I

    iput p4, p0, Lcom/daaw/hr;->e:I

    iput-boolean p5, p0, Lcom/daaw/hr;->f:Z

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Lcom/daaw/tb0$f;)Lcom/daaw/tb0;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/hr;->d(Lcom/daaw/tb0$f;)Lcom/daaw/gr;

    move-result-object p1

    return-object p1
.end method

.method public d(Lcom/daaw/tb0$f;)Lcom/daaw/gr;
    .locals 9

    new-instance v8, Lcom/daaw/gr;

    iget-object v1, p0, Lcom/daaw/hr;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/daaw/hr;->c:Lcom/daaw/bn1;

    iget v4, p0, Lcom/daaw/hr;->d:I

    iget v5, p0, Lcom/daaw/hr;->e:I

    iget-boolean v6, p0, Lcom/daaw/hr;->f:Z

    const/4 v2, 0x0

    move-object v0, v8

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lcom/daaw/gr;-><init>(Ljava/lang/String;Lcom/daaw/vy0;Lcom/daaw/bn1;IIZLcom/daaw/tb0$f;)V

    return-object v8
.end method
