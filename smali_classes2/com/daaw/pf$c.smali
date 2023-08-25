.class public Lcom/daaw/pf$c;
.super Landroid/util/Property;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/pf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/Property<",
        "Lcom/daaw/pf;",
        "Lcom/daaw/pf$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Lcom/daaw/pf;",
            "Lcom/daaw/pf$e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/pf$c;

    const-string v1, "circularReveal"

    invoke-direct {v0, v1}, Lcom/daaw/pf$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/pf$c;->a:Landroid/util/Property;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-class v0, Lcom/daaw/pf$e;

    invoke-direct {p0, v0, p1}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/pf;)Lcom/daaw/pf$e;
    .locals 0

    invoke-interface {p1}, Lcom/daaw/pf;->getRevealInfo()Lcom/daaw/pf$e;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/daaw/pf;Lcom/daaw/pf$e;)V
    .locals 0

    invoke-interface {p1, p2}, Lcom/daaw/pf;->setRevealInfo(Lcom/daaw/pf$e;)V

    return-void
.end method

.method public bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/pf;

    invoke-virtual {p0, p1}, Lcom/daaw/pf$c;->a(Lcom/daaw/pf;)Lcom/daaw/pf$e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/pf;

    check-cast p2, Lcom/daaw/pf$e;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/pf$c;->b(Lcom/daaw/pf;Lcom/daaw/pf$e;)V

    return-void
.end method
