.class public Lorg/junit/experimental/categories/Categories$CategoryFilter;
.super Lorg/junit/runner/manipulation/Filter;
.source "Categories.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/junit/experimental/categories/Categories;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CategoryFilter"
.end annotation


# instance fields
.field private final excluded:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final excludedAny:Z

.field private final included:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final includedAny:Z


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 151
    invoke-direct {p0}, Lorg/junit/runner/manipulation/Filter;-><init>()V

    const/4 v0, 0x1

    .line 152
    iput-boolean v0, p0, Lorg/junit/experimental/categories/Categories$CategoryFilter;->includedAny:Z

    .line 153
    iput-boolean v0, p0, Lorg/junit/experimental/categories/Categories$CategoryFilter;->excludedAny:Z

    .line 154
    invoke-static {p1}, Lorg/junit/experimental/categories/Categories;->access$000(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lorg/junit/experimental/categories/Categories$CategoryFilter;->included:Ljava/util/Set;

    .line 155
    invoke-static {p2}, Lorg/junit/experimental/categories/Categories;->access$000(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lorg/junit/experimental/categories/Categories$CategoryFilter;->excluded:Ljava/util/Set;

    return-void
.end method

.method protected constructor <init>(ZLjava/util/Set;ZLjava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;Z",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;)V"
        }
    .end annotation

    .line 159
    invoke-direct {p0}, Lorg/junit/runner/manipulation/Filter;-><init>()V

    .line 160
    iput-boolean p1, p0, Lorg/junit/experimental/categories/Categories$CategoryFilter;->includedAny:Z

    .line 161
    iput-boolean p3, p0, Lorg/junit/experimental/categories/Categories$CategoryFilter;->excludedAny:Z

    .line 162
    invoke-static {p2}, Lorg/junit/experimental/categories/Categories$CategoryFilter;->copyAndRefine(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lorg/junit/experimental/categories/Categories$CategoryFilter;->included:Ljava/util/Set;

    .line 163
    invoke-static {p4}, Lorg/junit/experimental/categories/Categories$CategoryFilter;->copyAndRefine(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lorg/junit/experimental/categories/Categories$CategoryFilter;->excluded:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>(Z[Ljava/lang/Class;Z[Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z[",
            "Ljava/lang/Class<",
            "*>;Z[",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 167
    invoke-direct {p0}, Lorg/junit/runner/manipulation/Filter;-><init>()V

    .line 168
    iput-boolean p1, p0, Lorg/junit/experimental/categories/Categories$CategoryFilter;->includedAny:Z

    .line 169
    iput-boolean p3, p0, Lorg/junit/experimental/categories/Categories$CategoryFilter;->excludedAny:Z

    .line 170
    invoke-static {p2}, Lorg/junit/experimental/categories/Categories;->access$100([Ljava/lang/Class;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lorg/junit/experimental/categories/Categories$CategoryFilter;->included:Ljava/util/Set;

    .line 171
    invoke-static {p4}, Lorg/junit/experimental/categories/Categories;->access$100([Ljava/lang/Class;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lorg/junit/experimental/categories/Categories$CategoryFilter;->excluded:Ljava/util/Set;

    return-void
.end method

.method private static categories(Lorg/junit/runner/Description;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/junit/runner/Description;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 278
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 279
    invoke-static {p0}, Lorg/junit/experimental/categories/Categories$CategoryFilter;->directCategories(Lorg/junit/runner/Description;)[Ljava/lang/Class;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 280
    invoke-static {p0}, Lorg/junit/experimental/categories/Categories$CategoryFilter;->parentDescription(Lorg/junit/runner/Description;)Lorg/junit/runner/Description;

    move-result-object p0

    invoke-static {p0}, Lorg/junit/experimental/categories/Categories$CategoryFilter;->directCategories(Lorg/junit/runner/Description;)[Ljava/lang/Class;

    move-result-object p0

    invoke-static {v0, p0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static categoryFilter(ZLjava/util/Set;ZLjava/util/Set;)Lorg/junit/experimental/categories/Categories$CategoryFilter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;Z",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;)",
            "Lorg/junit/experimental/categories/Categories$CategoryFilter;"
        }
    .end annotation

    .line 147
    new-instance v0, Lorg/junit/experimental/categories/Categories$CategoryFilter;

    invoke-direct {v0, p0, p1, p2, p3}, Lorg/junit/experimental/categories/Categories$CategoryFilter;-><init>(ZLjava/util/Set;ZLjava/util/Set;)V

    return-object v0
.end method

.method private static copyAndRefine(Ljava/util/Set;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;)",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 299
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    if-eqz p0, :cond_0

    .line 301
    invoke-interface {v0, p0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_0
    const/4 p0, 0x0

    .line 303
    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-object v0
.end method

.method private static directCategories(Lorg/junit/runner/Description;)[Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/junit/runner/Description;",
            ")[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    new-array p0, v0, [Ljava/lang/Class;

    return-object p0

    .line 294
    :cond_0
    const-class v1, Lorg/junit/experimental/categories/Category;

    invoke-virtual {p0, v1}, Lorg/junit/runner/Description;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p0

    check-cast p0, Lorg/junit/experimental/categories/Category;

    if-nez p0, :cond_1

    new-array p0, v0, [Ljava/lang/Class;

    goto :goto_0

    .line 295
    :cond_1
    invoke-interface {p0}, Lorg/junit/experimental/categories/Category;->value()[Ljava/lang/Class;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static exclude(Ljava/lang/Class;)Lorg/junit/experimental/categories/Categories$CategoryFilter;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/junit/experimental/categories/Categories$CategoryFilter;"
        }
    .end annotation

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Class;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    .line 138
    invoke-static {v0, v1}, Lorg/junit/experimental/categories/Categories$CategoryFilter;->exclude(Z[Ljava/lang/Class;)Lorg/junit/experimental/categories/Categories$CategoryFilter;

    move-result-object p0

    return-object p0
.end method

.method public static varargs exclude(Z[Ljava/lang/Class;)Lorg/junit/experimental/categories/Categories$CategoryFilter;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z[",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/junit/experimental/categories/Categories$CategoryFilter;"
        }
    .end annotation

    .line 134
    new-instance v0, Lorg/junit/experimental/categories/Categories$CategoryFilter;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p0, p1}, Lorg/junit/experimental/categories/Categories$CategoryFilter;-><init>(Z[Ljava/lang/Class;Z[Ljava/lang/Class;)V

    return-object v0
.end method

.method public static varargs exclude([Ljava/lang/Class;)Lorg/junit/experimental/categories/Categories$CategoryFilter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/junit/experimental/categories/Categories$CategoryFilter;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 142
    invoke-static {v0, p0}, Lorg/junit/experimental/categories/Categories$CategoryFilter;->exclude(Z[Ljava/lang/Class;)Lorg/junit/experimental/categories/Categories$CategoryFilter;

    move-result-object p0

    return-object p0
.end method

.method private hasCorrectCategoryAnnotation(Lorg/junit/runner/Description;)Z
    .locals 2

    .line 220
    invoke-static {p1}, Lorg/junit/experimental/categories/Categories$CategoryFilter;->categories(Lorg/junit/runner/Description;)Ljava/util/Set;

    move-result-object p1

    .line 223
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 224
    iget-object p1, p0, Lorg/junit/experimental/categories/Categories$CategoryFilter;->included:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    return p1

    .line 227
    :cond_0
    iget-object v0, p0, Lorg/junit/experimental/categories/Categories$CategoryFilter;->excluded:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 228
    iget-boolean v0, p0, Lorg/junit/experimental/categories/Categories$CategoryFilter;->excludedAny:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 229
    iget-object v0, p0, Lorg/junit/experimental/categories/Categories$CategoryFilter;->excluded:Ljava/util/Set;

    invoke-direct {p0, p1, v0}, Lorg/junit/experimental/categories/Categories$CategoryFilter;->matchesAnyParentCategories(Ljava/util/Set;Ljava/util/Set;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    .line 233
    :cond_1
    iget-object v0, p0, Lorg/junit/experimental/categories/Categories$CategoryFilter;->excluded:Ljava/util/Set;

    invoke-direct {p0, p1, v0}, Lorg/junit/experimental/categories/Categories$CategoryFilter;->matchesAllParentCategories(Ljava/util/Set;Ljava/util/Set;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    .line 239
    :cond_2
    iget-object v0, p0, Lorg/junit/experimental/categories/Categories$CategoryFilter;->included:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 p1, 0x1

    return p1

    .line 243
    :cond_3
    iget-boolean v0, p0, Lorg/junit/experimental/categories/Categories$CategoryFilter;->includedAny:Z

    if-eqz v0, :cond_4

    .line 244
    iget-object v0, p0, Lorg/junit/experimental/categories/Categories$CategoryFilter;->included:Ljava/util/Set;

    invoke-direct {p0, p1, v0}, Lorg/junit/experimental/categories/Categories$CategoryFilter;->matchesAnyParentCategories(Ljava/util/Set;Ljava/util/Set;)Z

    move-result p1

    return p1

    .line 246
    :cond_4
    iget-object v0, p0, Lorg/junit/experimental/categories/Categories$CategoryFilter;->included:Ljava/util/Set;

    invoke-direct {p0, p1, v0}, Lorg/junit/experimental/categories/Categories$CategoryFilter;->matchesAllParentCategories(Ljava/util/Set;Ljava/util/Set;)Z

    move-result p1

    return p1
.end method

.method public static include(Ljava/lang/Class;)Lorg/junit/experimental/categories/Categories$CategoryFilter;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/junit/experimental/categories/Categories$CategoryFilter;"
        }
    .end annotation

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Class;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    .line 126
    invoke-static {v0, v1}, Lorg/junit/experimental/categories/Categories$CategoryFilter;->include(Z[Ljava/lang/Class;)Lorg/junit/experimental/categories/Categories$CategoryFilter;

    move-result-object p0

    return-object p0
.end method

.method public static varargs include(Z[Ljava/lang/Class;)Lorg/junit/experimental/categories/Categories$CategoryFilter;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z[",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/junit/experimental/categories/Categories$CategoryFilter;"
        }
    .end annotation

    .line 122
    new-instance v0, Lorg/junit/experimental/categories/Categories$CategoryFilter;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v1, v2}, Lorg/junit/experimental/categories/Categories$CategoryFilter;-><init>(Z[Ljava/lang/Class;Z[Ljava/lang/Class;)V

    return-object v0
.end method

.method public static varargs include([Ljava/lang/Class;)Lorg/junit/experimental/categories/Categories$CategoryFilter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/junit/experimental/categories/Categories$CategoryFilter;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 130
    invoke-static {v0, p0}, Lorg/junit/experimental/categories/Categories$CategoryFilter;->include(Z[Ljava/lang/Class;)Lorg/junit/experimental/categories/Categories$CategoryFilter;

    move-result-object p0

    return-object p0
.end method

.method private matchesAllParentCategories(Ljava/util/Set;Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;)Z"
        }
    .end annotation

    .line 269
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 270
    invoke-static {p1, v0}, Lorg/junit/experimental/categories/Categories;->access$200(Ljava/util/Set;Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private matchesAnyParentCategories(Ljava/util/Set;Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;)Z"
        }
    .end annotation

    .line 256
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 257
    invoke-static {p1, v0}, Lorg/junit/experimental/categories/Categories;->access$200(Ljava/util/Set;Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private static parentDescription(Lorg/junit/runner/Description;)Lorg/junit/runner/Description;
    .locals 0

    .line 285
    invoke-virtual {p0}, Lorg/junit/runner/Description;->getTestClass()Ljava/lang/Class;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    .line 286
    :cond_0
    invoke-static {p0}, Lorg/junit/runner/Description;->createSuiteDescription(Ljava/lang/Class;)Lorg/junit/runner/Description;

    move-result-object p0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public describe()Ljava/lang/String;
    .locals 1

    .line 179
    invoke-virtual {p0}, Lorg/junit/experimental/categories/Categories$CategoryFilter;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public shouldRun(Lorg/junit/runner/Description;)Z
    .locals 2

    .line 206
    invoke-direct {p0, p1}, Lorg/junit/experimental/categories/Categories$CategoryFilter;->hasCorrectCategoryAnnotation(Lorg/junit/runner/Description;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 210
    :cond_0
    invoke-virtual {p1}, Lorg/junit/runner/Description;->getChildren()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/junit/runner/Description;

    .line 211
    invoke-virtual {p0, v0}, Lorg/junit/experimental/categories/Categories$CategoryFilter;->shouldRun(Lorg/junit/runner/Description;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 196
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "categories "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lorg/junit/experimental/categories/Categories$CategoryFilter;->included:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "[all]"

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lorg/junit/experimental/categories/Categories$CategoryFilter;->included:Ljava/util/Set;

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 198
    iget-object v1, p0, Lorg/junit/experimental/categories/Categories$CategoryFilter;->excluded:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, " - "

    .line 199
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/junit/experimental/categories/Categories$CategoryFilter;->excluded:Ljava/util/Set;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 201
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
