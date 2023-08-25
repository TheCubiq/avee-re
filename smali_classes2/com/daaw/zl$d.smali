.class public Lcom/daaw/zl$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/hl;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/zl;->d(Lcom/daaw/rj1;)Lcom/daaw/rj1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/hl<",
        "TT;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/zl;


# direct methods
.method public constructor <init>(Lcom/daaw/zl;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/zl$d;->a:Lcom/daaw/zl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/daaw/rj1;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/zl$d;->b(Lcom/daaw/rj1;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/daaw/rj1;)Ljava/lang/Void;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/rj1<",
            "TT;>;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method
