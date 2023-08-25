.class public Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;Lcom/daaw/bi;)Lcom/daaw/x10;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->b(Lcom/daaw/bi;)Lcom/daaw/x10;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Lcom/daaw/bi;)Lcom/daaw/x10;
    .locals 4

    const-class v0, Lcom/daaw/s10;

    invoke-interface {p1, v0}, Lcom/daaw/bi;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/s10;

    const-class v1, Lcom/daaw/fm;

    invoke-interface {p1, v1}, Lcom/daaw/bi;->i(Ljava/lang/Class;)Lcom/daaw/es;

    move-result-object v1

    const-class v2, Lcom/daaw/p2;

    invoke-interface {p1, v2}, Lcom/daaw/bi;->i(Ljava/lang/Class;)Lcom/daaw/es;

    move-result-object v2

    const-class v3, Lcom/daaw/e20;

    invoke-interface {p1, v3}, Lcom/daaw/bi;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/e20;

    invoke-static {v0, p1, v1, v2}, Lcom/daaw/x10;->b(Lcom/daaw/s10;Lcom/daaw/e20;Lcom/daaw/es;Lcom/daaw/es;)Lcom/daaw/x10;

    move-result-object p1

    return-object p1
.end method

.method public getComponents()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/daaw/vh<",
            "*>;>;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/daaw/vh;

    const-class v1, Lcom/daaw/x10;

    invoke-static {v1}, Lcom/daaw/vh;->e(Ljava/lang/Class;)Lcom/daaw/vh$b;

    move-result-object v1

    const-string v2, "fire-cls"

    invoke-virtual {v1, v2}, Lcom/daaw/vh$b;->g(Ljava/lang/String;)Lcom/daaw/vh$b;

    move-result-object v1

    const-class v3, Lcom/daaw/s10;

    invoke-static {v3}, Lcom/daaw/ys;->j(Ljava/lang/Class;)Lcom/daaw/ys;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/daaw/vh$b;->b(Lcom/daaw/ys;)Lcom/daaw/vh$b;

    move-result-object v1

    const-class v3, Lcom/daaw/e20;

    invoke-static {v3}, Lcom/daaw/ys;->j(Ljava/lang/Class;)Lcom/daaw/ys;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/daaw/vh$b;->b(Lcom/daaw/ys;)Lcom/daaw/vh$b;

    move-result-object v1

    const-class v3, Lcom/daaw/fm;

    invoke-static {v3}, Lcom/daaw/ys;->a(Ljava/lang/Class;)Lcom/daaw/ys;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/daaw/vh$b;->b(Lcom/daaw/ys;)Lcom/daaw/vh$b;

    move-result-object v1

    const-class v3, Lcom/daaw/p2;

    invoke-static {v3}, Lcom/daaw/ys;->a(Ljava/lang/Class;)Lcom/daaw/ys;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/daaw/vh$b;->b(Lcom/daaw/ys;)Lcom/daaw/vh$b;

    move-result-object v1

    new-instance v3, Lcom/daaw/km;

    invoke-direct {v3, p0}, Lcom/daaw/km;-><init>(Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;)V

    invoke-virtual {v1, v3}, Lcom/daaw/vh$b;->e(Lcom/daaw/gi;)Lcom/daaw/vh$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/vh$b;->d()Lcom/daaw/vh$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/vh$b;->c()Lcom/daaw/vh;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    const-string v1, "18.3.3"

    invoke-static {v2, v1}, Lcom/daaw/kj0;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/vh;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
