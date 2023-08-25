.class public final Lcom/daaw/ie7;
.super Lcom/daaw/m87;
.source ""


# instance fields
.field public final a:Lcom/daaw/ef7;


# direct methods
.method public constructor <init>(Lcom/daaw/ef7;Lcom/daaw/x97;)V
    .locals 1
    .param p2    # Lcom/daaw/x97;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/daaw/m87;-><init>()V

    sget-object p2, Lcom/daaw/fe7;->b:[I

    invoke-virtual {p1}, Lcom/daaw/ef7;->b()Lcom/daaw/mm7;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p2, p2, v0

    iput-object p1, p0, Lcom/daaw/ie7;->a:Lcom/daaw/ef7;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/l97;
    .locals 4

    new-instance v0, Lcom/daaw/he7;

    iget-object v1, p0, Lcom/daaw/ie7;->a:Lcom/daaw/ef7;

    invoke-virtual {v1}, Lcom/daaw/ef7;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/daaw/ef7;->c()Lcom/daaw/zn7;

    move-result-object v1

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/daaw/he7;-><init>(Ljava/lang/String;Lcom/daaw/zn7;Lcom/daaw/ge7;)V

    return-object v0
.end method
