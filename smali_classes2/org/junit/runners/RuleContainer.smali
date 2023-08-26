.class Lorg/junit/runners/RuleContainer;
.super Ljava/lang/Object;
.source "RuleContainer.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/junit/runners/RuleContainer$RuleEntry;
    }
.end annotation


# static fields
.field static final ENTRY_COMPARATOR:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lorg/junit/runners/RuleContainer$RuleEntry;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final methodRules:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/junit/rules/MethodRule;",
            ">;"
        }
    .end annotation
.end field

.field private final orderValues:Ljava/util/IdentityHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/IdentityHashMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final testRules:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/junit/rules/TestRule;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 41
    new-instance v0, Lorg/junit/runners/RuleContainer$1;

    invoke-direct {v0}, Lorg/junit/runners/RuleContainer$1;-><init>()V

    sput-object v0, Lorg/junit/runners/RuleContainer;->ENTRY_COMPARATOR:Ljava/util/Comparator;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v0, p0, Lorg/junit/runners/RuleContainer;->orderValues:Ljava/util/IdentityHashMap;

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/junit/runners/RuleContainer;->testRules:Ljava/util/List;

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/junit/runners/RuleContainer;->methodRules:Ljava/util/List;

    return-void
.end method

.method private getSortedEntries()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/junit/runners/RuleContainer$RuleEntry;",
            ">;"
        }
    .end annotation

    .line 56
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/junit/runners/RuleContainer;->methodRules:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p0, Lorg/junit/runners/RuleContainer;->testRules:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v1, v2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 58
    iget-object v1, p0, Lorg/junit/runners/RuleContainer;->methodRules:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/junit/rules/MethodRule;

    .line 59
    new-instance v3, Lorg/junit/runners/RuleContainer$RuleEntry;

    const/4 v4, 0x0

    iget-object v5, p0, Lorg/junit/runners/RuleContainer;->orderValues:Ljava/util/IdentityHashMap;

    invoke-virtual {v5, v2}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-direct {v3, v2, v4, v5}, Lorg/junit/runners/RuleContainer$RuleEntry;-><init>(Ljava/lang/Object;ILjava/lang/Integer;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 61
    :cond_0
    iget-object v1, p0, Lorg/junit/runners/RuleContainer;->testRules:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/junit/rules/TestRule;

    .line 62
    new-instance v3, Lorg/junit/runners/RuleContainer$RuleEntry;

    const/4 v4, 0x1

    iget-object v5, p0, Lorg/junit/runners/RuleContainer;->orderValues:Ljava/util/IdentityHashMap;

    invoke-virtual {v5, v2}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-direct {v3, v2, v4, v5}, Lorg/junit/runners/RuleContainer$RuleEntry;-><init>(Ljava/lang/Object;ILjava/lang/Integer;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 64
    :cond_1
    sget-object v1, Lorg/junit/runners/RuleContainer;->ENTRY_COMPARATOR:Ljava/util/Comparator;

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v0
.end method


# virtual methods
.method public add(Lorg/junit/rules/MethodRule;)V
    .locals 1

    .line 34
    iget-object v0, p0, Lorg/junit/runners/RuleContainer;->methodRules:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public add(Lorg/junit/rules/TestRule;)V
    .locals 1

    .line 38
    iget-object v0, p0, Lorg/junit/runners/RuleContainer;->testRules:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public apply(Lorg/junit/runners/model/FrameworkMethod;Lorg/junit/runner/Description;Ljava/lang/Object;Lorg/junit/runners/model/Statement;)Lorg/junit/runners/model/Statement;
    .locals 4

    .line 73
    iget-object v0, p0, Lorg/junit/runners/RuleContainer;->methodRules:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/junit/runners/RuleContainer;->testRules:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p4

    .line 77
    :cond_0
    invoke-direct {p0}, Lorg/junit/runners/RuleContainer;->getSortedEntries()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/junit/runners/RuleContainer$RuleEntry;

    .line 78
    iget v2, v1, Lorg/junit/runners/RuleContainer$RuleEntry;->type:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    .line 79
    iget-object v1, v1, Lorg/junit/runners/RuleContainer$RuleEntry;->rule:Ljava/lang/Object;

    check-cast v1, Lorg/junit/rules/TestRule;

    invoke-interface {v1, p4, p2}, Lorg/junit/rules/TestRule;->apply(Lorg/junit/runners/model/Statement;Lorg/junit/runner/Description;)Lorg/junit/runners/model/Statement;

    move-result-object p4

    goto :goto_0

    .line 81
    :cond_1
    iget-object v1, v1, Lorg/junit/runners/RuleContainer$RuleEntry;->rule:Ljava/lang/Object;

    check-cast v1, Lorg/junit/rules/MethodRule;

    invoke-interface {v1, p4, p1, p3}, Lorg/junit/rules/MethodRule;->apply(Lorg/junit/runners/model/Statement;Lorg/junit/runners/model/FrameworkMethod;Ljava/lang/Object;)Lorg/junit/runners/model/Statement;

    move-result-object p4

    goto :goto_0

    :cond_2
    return-object p4
.end method

.method getSortedRules()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 92
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 93
    invoke-direct {p0}, Lorg/junit/runners/RuleContainer;->getSortedEntries()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/junit/runners/RuleContainer$RuleEntry;

    .line 94
    iget-object v2, v2, Lorg/junit/runners/RuleContainer$RuleEntry;->rule:Ljava/lang/Object;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public setOrder(Ljava/lang/Object;I)V
    .locals 1

    .line 30
    iget-object v0, p0, Lorg/junit/runners/RuleContainer;->orderValues:Ljava/util/IdentityHashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
