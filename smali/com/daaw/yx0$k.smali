.class public Lcom/daaw/yx0$k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/yx0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/sw1$a<",
        "[J",
        "Ljava/util/List<",
        "Ljava/lang/String;",
        ">;",
        "Lcom/daaw/al;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/yx0;


# direct methods
.method public constructor <init>(Lcom/daaw/yx0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yx0$k;->a:Lcom/daaw/yx0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [J

    check-cast p2, Ljava/util/List;

    check-cast p3, Lcom/daaw/al;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/yx0$k;->b([JLjava/util/List;Lcom/daaw/al;)V

    return-void
.end method

.method public b([JLjava/util/List;Lcom/daaw/al;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([J",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/daaw/al;",
            ")V"
        }
    .end annotation

    invoke-static {p3, p1, p2}, Lcom/daaw/dn;->a(Lcom/daaw/al;[JLjava/util/List;)Lcom/daaw/dn;

    return-void
.end method
