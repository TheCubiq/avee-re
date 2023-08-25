.class public final Lcom/daaw/gm4;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/daaw/zl4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/gm4;->a:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/gm4;->a:Ljava/util/List;

    return-void
.end method

.method public static a(Lcom/daaw/qq5;)Lcom/daaw/qq5;
    .locals 2

    new-instance v0, Lcom/daaw/rq5;

    sget-object v1, Lcom/daaw/fm4;->a:Lcom/daaw/fm4;

    invoke-direct {v0, p0, v1}, Lcom/daaw/rq5;-><init>(Lcom/daaw/qq5;Lcom/daaw/ey6;)V

    return-object v0
.end method
