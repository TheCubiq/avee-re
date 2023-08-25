.class public final Lcom/daaw/n63;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Lcom/daaw/xb;


# direct methods
.method public constructor <init>(Lcom/daaw/xb;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/n63;->a:Ljava/util/List;

    iput-object p1, p0, Lcom/daaw/n63;->b:Lcom/daaw/xb;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/xb;
    .locals 1

    iget-object v0, p0, Lcom/daaw/n63;->b:Lcom/daaw/xb;

    return-object v0
.end method

.method public final b()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/daaw/n63;->a:Ljava/util/List;

    return-object v0
.end method
