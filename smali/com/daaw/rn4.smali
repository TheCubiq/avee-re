.class public final Lcom/daaw/rn4;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final b:Lcom/daaw/rn4;

.field public static final c:Lcom/daaw/th8;


# instance fields
.field public final a:Lcom/daaw/y17;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/daaw/rn4;

    invoke-static {}, Lcom/daaw/y17;->u()Lcom/daaw/y17;

    move-result-object v1

    const-wide/16 v2, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/rn4;-><init>(Ljava/util/List;J)V

    sput-object v0, Lcom/daaw/rn4;->b:Lcom/daaw/rn4;

    sget-object v0, Lcom/daaw/om4;->a:Lcom/daaw/om4;

    sput-object v0, Lcom/daaw/rn4;->c:Lcom/daaw/th8;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/y17;->s(Ljava/util/Collection;)Lcom/daaw/y17;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/rn4;->a:Lcom/daaw/y17;

    return-void
.end method
