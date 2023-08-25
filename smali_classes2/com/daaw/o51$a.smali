.class public Lcom/daaw/o51$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/e01;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/o51;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final b:Lcom/daaw/e01;


# direct methods
.method public constructor <init>(Ljava/util/Set;Lcom/daaw/e01;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;",
            "Lcom/daaw/e01;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/o51$a;->a:Ljava/util/Set;

    iput-object p2, p0, Lcom/daaw/o51$a;->b:Lcom/daaw/e01;

    return-void
.end method
