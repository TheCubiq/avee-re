.class Lorg/junit/runners/BlockJUnit4ClassRunner$RuleCollector;
.super Ljava/lang/Object;
.source "BlockJUnit4ClassRunner.java"

# interfaces
.implements Lorg/junit/runners/model/MemberValueConsumer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/junit/runners/BlockJUnit4ClassRunner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "RuleCollector"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lorg/junit/runners/model/MemberValueConsumer<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final result:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 459
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 460
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/junit/runners/BlockJUnit4ClassRunner$RuleCollector;->result:Ljava/util/List;

    return-void
.end method

.method synthetic constructor <init>(Lorg/junit/runners/BlockJUnit4ClassRunner$1;)V
    .locals 0

    .line 459
    invoke-direct {p0}, Lorg/junit/runners/BlockJUnit4ClassRunner$RuleCollector;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Lorg/junit/runners/model/FrameworkMember;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/junit/runners/model/FrameworkMember<",
            "*>;TT;)V"
        }
    .end annotation

    .line 463
    const-class v0, Lorg/junit/Rule;

    invoke-virtual {p1, v0}, Lorg/junit/runners/model/FrameworkMember;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p1

    check-cast p1, Lorg/junit/Rule;

    if-eqz p1, :cond_0

    .line 465
    invoke-static {}, Lorg/junit/runners/BlockJUnit4ClassRunner;->access$100()Ljava/lang/ThreadLocal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/junit/runners/RuleContainer;

    if-eqz v0, :cond_0

    .line 467
    invoke-interface {p1}, Lorg/junit/Rule;->order()I

    move-result p1

    invoke-virtual {v0, p2, p1}, Lorg/junit/runners/RuleContainer;->setOrder(Ljava/lang/Object;I)V

    .line 470
    :cond_0
    iget-object p1, p0, Lorg/junit/runners/BlockJUnit4ClassRunner$RuleCollector;->result:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
