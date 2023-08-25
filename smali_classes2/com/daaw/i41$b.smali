.class public final Lcom/daaw/i41$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/i41;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public final p:Lcom/daaw/zm;

.field public final q:Lcom/daaw/tj1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/tj1<",
            "Lcom/daaw/zm;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic r:Lcom/daaw/i41;


# direct methods
.method public constructor <init>(Lcom/daaw/i41;Lcom/daaw/zm;Lcom/daaw/tj1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/zm;",
            "Lcom/daaw/tj1<",
            "Lcom/daaw/zm;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/i41$b;->r:Lcom/daaw/i41;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/i41$b;->p:Lcom/daaw/zm;

    iput-object p3, p0, Lcom/daaw/i41$b;->q:Lcom/daaw/tj1;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/i41;Lcom/daaw/zm;Lcom/daaw/tj1;Lcom/daaw/i41$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/i41$b;-><init>(Lcom/daaw/i41;Lcom/daaw/zm;Lcom/daaw/tj1;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    iget-object v0, p0, Lcom/daaw/i41$b;->r:Lcom/daaw/i41;

    iget-object v1, p0, Lcom/daaw/i41$b;->p:Lcom/daaw/zm;

    iget-object v2, p0, Lcom/daaw/i41$b;->q:Lcom/daaw/tj1;

    invoke-static {v0, v1, v2}, Lcom/daaw/i41;->c(Lcom/daaw/i41;Lcom/daaw/zm;Lcom/daaw/tj1;)V

    iget-object v0, p0, Lcom/daaw/i41$b;->r:Lcom/daaw/i41;

    invoke-static {v0}, Lcom/daaw/i41;->d(Lcom/daaw/i41;)Lcom/daaw/fu0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/fu0;->c()V

    iget-object v0, p0, Lcom/daaw/i41$b;->r:Lcom/daaw/i41;

    invoke-static {v0}, Lcom/daaw/i41;->e(Lcom/daaw/i41;)D

    move-result-wide v0

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Delay for: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const-wide v6, 0x408f400000000000L    # 1000.0

    div-double v6, v0, v6

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    const-string v6, "%.2f"

    invoke-static {v4, v6, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " s for report: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/daaw/i41$b;->p:Lcom/daaw/zm;

    invoke-virtual {v4}, Lcom/daaw/zm;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/daaw/i41;->f(D)V

    return-void
.end method
