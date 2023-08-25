.class public abstract Lcom/daaw/de7;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/de7;->a:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public abstract a(Lcom/daaw/xt7;)Lcom/daaw/xt7;
.end method

.method public abstract b(Lcom/daaw/yq7;)Lcom/daaw/xt7;
.end method

.method public c()Ljava/util/Map;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public abstract d(Lcom/daaw/xt7;)V
.end method

.method public final e()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lcom/daaw/de7;->a:Ljava/lang/Class;

    return-object v0
.end method
