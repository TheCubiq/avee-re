.class public final Lcom/daaw/rd7;
.super Lcom/daaw/xd7;
.source ""


# instance fields
.field public final synthetic c:Lcom/daaw/sd7;


# direct methods
.method public constructor <init>(Lcom/daaw/dq7;Ljava/lang/Class;Lcom/daaw/sd7;)V
    .locals 0

    iput-object p3, p0, Lcom/daaw/rd7;->c:Lcom/daaw/sd7;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/xd7;-><init>(Lcom/daaw/dq7;Ljava/lang/Class;Lcom/daaw/wd7;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/gf7;Lcom/daaw/x97;)Lcom/daaw/m87;
    .locals 1
    .param p2    # Lcom/daaw/x97;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/daaw/rd7;->c:Lcom/daaw/sd7;

    invoke-interface {v0, p1, p2}, Lcom/daaw/sd7;->a(Lcom/daaw/gf7;Lcom/daaw/x97;)Lcom/daaw/m87;

    move-result-object p1

    return-object p1
.end method
