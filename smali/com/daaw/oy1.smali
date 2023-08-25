.class public abstract Lcom/daaw/oy1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/oy1$a;
    }
.end annotation


# instance fields
.field public a:Ljava/util/UUID;

.field public b:Lcom/daaw/qy1;

.field public c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/UUID;Lcom/daaw/qy1;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            "Lcom/daaw/qy1;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/oy1;->a:Ljava/util/UUID;

    iput-object p2, p0, Lcom/daaw/oy1;->b:Lcom/daaw/qy1;

    iput-object p3, p0, Lcom/daaw/oy1;->c:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/oy1;->a:Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/oy1;->c:Ljava/util/Set;

    return-object v0
.end method

.method public c()Lcom/daaw/qy1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/oy1;->b:Lcom/daaw/qy1;

    return-object v0
.end method
