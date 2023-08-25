.class public Lcom/daaw/bm$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ai1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/bm;->O()Lcom/daaw/rj1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/ai1<",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/bm;


# direct methods
.method public constructor <init>(Lcom/daaw/bm;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/bm$c;->a:Lcom/daaw/bm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lcom/daaw/rj1;
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/daaw/bm$c;->b(Ljava/lang/Void;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Void;)Lcom/daaw/rj1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Void;",
            ")",
            "Lcom/daaw/rj1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1}, Lcom/daaw/dk1;->e(Ljava/lang/Object;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method
